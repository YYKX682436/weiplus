package ci2;

/* loaded from: classes4.dex */
public final class a extends android.text.style.ImageSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f41669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.graphics.drawable.Drawable drawable, int i17, boolean z17) {
        super(drawable, 1);
        this.f41669d = drawable;
        this.f41670e = i17;
        this.f41671f = z17;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        android.graphics.drawable.Drawable drawable = this.f41669d;
        int height = drawable.getBounds().height();
        int i29 = fontMetricsInt.descent;
        int i37 = fontMetricsInt.ascent;
        int i38 = i27 + i37 + (((i29 - i37) - height) / 2);
        canvas.save();
        if (this.f41671f) {
            canvas.translate(f17, i38);
        } else {
            canvas.translate(f17 + this.f41670e, i38);
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Rect bounds = this.f41669d.getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int height = bounds.height();
            int i19 = fontMetricsInt2.descent;
            int i27 = fontMetricsInt2.ascent;
            int i28 = i27 + (((i19 - i27) - height) / 2);
            fontMetricsInt.ascent = i28;
            fontMetricsInt.top = i28;
            int i29 = i28 + height;
            fontMetricsInt.descent = i29;
            fontMetricsInt.bottom = i29;
        }
        return bounds.width() + this.f41670e;
    }
}
