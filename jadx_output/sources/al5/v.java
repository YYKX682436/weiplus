package al5;

/* loaded from: classes4.dex */
public final class v extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f6072f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f6073g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.graphics.drawable.Drawable d17, int i17) {
        super(d17, i17);
        kotlin.jvm.internal.o.g(d17, "d");
        this.f6073g = new android.graphics.RectF();
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i29 = fontMetricsInt.descent;
        float f18 = ((i27 + i29) - ((i29 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2);
        canvas.translate(this.f6079d + f17, f18);
        this.f6073g.set(f17, f18, drawable.getBounds().width() + f17, r7 + drawable.getBounds().height());
        int alpha = paint.getAlpha();
        int alpha2 = drawable.getAlpha();
        if (alpha != 0 || alpha2 == alpha) {
            drawable.draw(canvas);
        } else {
            drawable.setAlpha(alpha);
            drawable.draw(canvas);
            drawable.setAlpha(alpha2);
        }
        canvas.restore();
    }
}
