package ai0;

/* loaded from: classes5.dex */
public final class h extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f5063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5064e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f5065f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5066g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5067h;

    public h(android.content.Context context, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f5063d = context;
        this.f5064e = i17;
        this.f5065f = null;
        this.f5066g = i18;
        this.f5067h = z17;
    }

    public final android.graphics.drawable.Drawable a() {
        java.lang.ref.WeakReference weakReference = this.f5065f;
        android.graphics.drawable.Drawable drawable = null;
        android.graphics.drawable.Drawable drawable2 = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable2 != null) {
            return drawable2;
        }
        int i17 = this.f5064e;
        try {
            android.graphics.drawable.Drawable a17 = k.a.a(this.f5063d, i17);
            if (a17 != null) {
                a17.setBounds(0, 0, a17.getIntrinsicWidth(), a17.getIntrinsicHeight());
                drawable = a17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ToggleImageSpan", th6, "Unable to find resource: " + i17, new java.lang.Object[0]);
        }
        kotlin.jvm.internal.o.d(drawable);
        this.f5065f = new java.lang.ref.WeakReference(drawable);
        return drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        if (this.f5067h) {
            android.graphics.drawable.Drawable a17 = a();
            canvas.save();
            int i29 = i28 - a17.getBounds().bottom;
            int i37 = this.f5066g;
            if (i37 == 1) {
                i29 -= paint.getFontMetricsInt().descent;
            } else if (i37 == 2) {
                i29 = (i19 + ((i28 - i19) / 2)) - (a17.getBounds().height() / 2);
            }
            canvas.translate(f17, i29);
            a17.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        if (!this.f5067h) {
            return 0;
        }
        android.graphics.Rect bounds = a().getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            int i19 = -bounds.bottom;
            fontMetricsInt.ascent = i19;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i19;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
