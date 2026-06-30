package ai0;

/* loaded from: classes5.dex */
public final class h extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f86596d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f86598f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86599g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86600h;

    public h(android.content.Context context, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f86596d = context;
        this.f86597e = i17;
        this.f86598f = null;
        this.f86599g = i18;
        this.f86600h = z17;
    }

    public final android.graphics.drawable.Drawable a() {
        java.lang.ref.WeakReference weakReference = this.f86598f;
        android.graphics.drawable.Drawable drawable = null;
        android.graphics.drawable.Drawable drawable2 = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable2 != null) {
            return drawable2;
        }
        int i17 = this.f86597e;
        try {
            android.graphics.drawable.Drawable a17 = k.a.a(this.f86596d, i17);
            if (a17 != null) {
                a17.setBounds(0, 0, a17.getIntrinsicWidth(), a17.getIntrinsicHeight());
                drawable = a17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ToggleImageSpan", th6, "Unable to find resource: " + i17, new java.lang.Object[0]);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
        this.f86598f = new java.lang.ref.WeakReference(drawable);
        return drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (this.f86600h) {
            android.graphics.drawable.Drawable a17 = a();
            canvas.save();
            int i29 = i28 - a17.getBounds().bottom;
            int i37 = this.f86599g;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (!this.f86600h) {
            return 0;
        }
        android.graphics.Rect bounds = a().getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "getBounds(...)");
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
