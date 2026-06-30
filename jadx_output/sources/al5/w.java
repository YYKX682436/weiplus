package al5;

/* loaded from: classes4.dex */
public class w extends android.text.style.ImageSpan implements gb5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f6079d;

    /* renamed from: e, reason: collision with root package name */
    public int f6080e;

    public w(android.graphics.drawable.Drawable drawable, int i17) {
        super(drawable, i17);
        this.f6079d = 0;
        this.f6080e = 0;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        int i29 = paint.getFontMetricsInt().descent;
        canvas.translate(f17 + this.f6079d, ((i27 + i29) - ((i29 - r3.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        int alpha = paint.getAlpha();
        int alpha2 = drawable.getAlpha();
        if (alpha == 0 && alpha2 != alpha) {
            drawable.setAlpha(alpha);
        }
        drawable.draw(canvas);
        drawable.setAlpha(alpha2);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i19 = fontMetricsInt2.descent;
            int i27 = fontMetricsInt2.ascent;
            int i28 = i27 + ((i19 - i27) / 2);
            int i29 = (bounds.bottom - bounds.top) / 2;
            int i37 = i28 - i29;
            fontMetricsInt.ascent = i37;
            fontMetricsInt.top = i37;
            int i38 = i28 + i29;
            fontMetricsInt.bottom = i38;
            fontMetricsInt.descent = i38;
        }
        return bounds.right + this.f6079d + this.f6080e;
    }

    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FixImageSpan", "onClick view:%d", java.lang.Integer.valueOf(view.hashCode()));
    }

    @Override // gb5.a
    public void setIsPressed(boolean z17) {
    }
}
