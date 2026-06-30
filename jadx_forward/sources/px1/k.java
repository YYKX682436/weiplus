package px1;

/* loaded from: classes12.dex */
public class k implements android.text.style.LeadingMarginSpan, px1.h, px1.g {

    /* renamed from: h, reason: collision with root package name */
    public static float f440358h;

    /* renamed from: d, reason: collision with root package name */
    public final int f440359d;

    /* renamed from: e, reason: collision with root package name */
    public final int f440360e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f440361f;

    /* renamed from: g, reason: collision with root package name */
    public float f440362g;

    public k(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        this.f440359d = i17;
        this.f440360e = i18;
        this.f440361f = z17 && z19 && !z18;
    }

    @Override // px1.g
    public px1.g a() {
        return new px1.k(this.f440359d, this.f440360e, this.f440361f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f440361f || spanned.getSpanStart(this) != i29) {
            return;
        }
        android.graphics.Paint.Style style = paint.getStyle();
        float textSize = paint.getTextSize();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i38 = this.f440359d;
        sb6.append(i38);
        sb6.append(".");
        this.f440362g = paint.measureText(sb6.toString());
        canvas.drawText(i38 + ".", i17, i27, paint);
        paint.setStyle(style);
        paint.setTextSize(textSize);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        float f17 = this.f440362g;
        float f18 = f17 + 2.0f;
        float f19 = f440358h;
        if (f18 > f19) {
            f19 = f17 + 2.0f;
        }
        float max = java.lang.Math.max(java.lang.Math.round(f19), this.f440360e);
        f440358h = max;
        if (this.f440361f) {
            return 0;
        }
        return (int) max;
    }

    @Override // px1.h
    /* renamed from: getValue */
    public java.lang.Object mo54603x754a37bb() {
        return java.lang.Boolean.TRUE;
    }

    public k(int i17, int i18, boolean z17) {
        this.f440359d = i17;
        this.f440360e = i18;
        this.f440361f = z17;
    }
}
