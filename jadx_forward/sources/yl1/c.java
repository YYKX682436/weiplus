package yl1;

/* loaded from: classes5.dex */
public final class c extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f544493d;

    /* renamed from: e, reason: collision with root package name */
    public final float f544494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f544495f;

    /* renamed from: g, reason: collision with root package name */
    public final int f544496g;

    /* renamed from: h, reason: collision with root package name */
    public final int f544497h;

    /* renamed from: i, reason: collision with root package name */
    public final int f544498i;

    /* renamed from: m, reason: collision with root package name */
    public final int f544499m;

    public c(java.lang.String str, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f544494e = i19;
        this.f544493d = str;
        this.f544495f = i27;
        this.f544496g = i28;
        this.f544497h = i29;
        this.f544498i = i17;
        this.f544499m = i18;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        paint.setTextSize(this.f544494e);
        paint.setAntiAlias(true);
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = ((int) f17) + this.f544498i;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i29 = (((i28 - i19) - fontMetricsInt.descent) + fontMetricsInt.top) / 2;
        int i37 = this.f544497h;
        int max = java.lang.Math.max(0, i29 - i37);
        rectF.top = i19 + max;
        rectF.bottom = i28 - max;
        float f18 = rectF.left;
        java.lang.String str = this.f544493d;
        rectF.right = f18 + ((int) paint.measureText(str)) + (i37 * 2);
        paint.setColor(this.f544496g);
        canvas.drawRoundRect(rectF, i37, i37, paint);
        paint.setColor(this.f544495f);
        canvas.drawText(str, rectF.left + i37, (rectF.top + i37) - fontMetricsInt.top, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        if (paint == null) {
            paint = new android.graphics.Paint();
        }
        paint.setTextSize(this.f544494e);
        return ((int) paint.measureText(this.f544493d)) + this.f544498i + this.f544499m + (this.f544497h * 2);
    }
}
