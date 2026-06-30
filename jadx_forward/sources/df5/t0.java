package df5;

/* loaded from: classes11.dex */
public final class t0 implements android.text.style.LeadingMarginSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f313746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f313747e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313748f;

    public t0(int i17, int i18, int i19, int i27) {
        this.f313746d = i17;
        this.f313747e = i18;
        this.f313748f = i17 + i19;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence text, int i29, int i37, boolean z17, android.text.Layout layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        int color = paint.getColor();
        android.graphics.Paint.Style style = paint.getStyle();
        paint.setColor(this.f313747e);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int i38 = (this.f313746d * i18) + (((this.f313748f * 0) + i17) * i18);
        canvas.drawRect(java.lang.Math.min(r5, i38), i19, java.lang.Math.max(r5, i38), i28, paint);
        paint.setColor(color);
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        return this.f313748f * 1;
    }
}
