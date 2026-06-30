package r85;

/* loaded from: classes5.dex */
public class a extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f474861d;

    /* renamed from: e, reason: collision with root package name */
    public android.text.TextPaint f474862e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f474863f;

    /* renamed from: g, reason: collision with root package name */
    public int f474864g;

    /* renamed from: i, reason: collision with root package name */
    public int f474865i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint.FontMetricsInt f474866m;

    public a(int i17) {
        this.f474861d = i17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        android.text.TextPaint textPaint = this.f474862e;
        if (textPaint == null) {
            this.f474862e = new android.text.TextPaint(paint);
        } else {
            textPaint.set(paint);
        }
        this.f474862e.setTextSize(this.f474861d);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f474866m;
        if (fontMetricsInt == null) {
            fontMetricsInt = this.f474862e.getFontMetricsInt();
            this.f474866m = fontMetricsInt;
        }
        canvas.drawText(charSequence, i17, i18, f17, i27 - (((((i27 + fontMetricsInt.descent) + i27) + fontMetricsInt.ascent) / 2) - ((i28 + i19) / 2)), this.f474862e);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int i19;
        android.text.TextPaint textPaint = this.f474862e;
        if (textPaint == null) {
            this.f474862e = new android.text.TextPaint(paint);
        } else {
            textPaint.set(paint);
        }
        this.f474862e.setTextSize(this.f474861d);
        java.lang.CharSequence charSequence2 = this.f474863f;
        boolean z17 = false;
        if (charSequence2 != null && this.f474864g - 0 == (i19 = i18 - i17)) {
            z17 = android.text.TextUtils.regionMatches(charSequence2, 0, charSequence, i17, i19);
        }
        if (!z17) {
            java.lang.String charSequence3 = charSequence.subSequence(i17, i18).toString();
            this.f474863f = charSequence3;
            this.f474864g = charSequence3.length();
            this.f474865i = (int) this.f474862e.measureText(charSequence3);
        }
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.f474866m;
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = this.f474862e.getFontMetricsInt();
                this.f474866m = fontMetricsInt2;
            }
            fontMetricsInt.top = java.lang.Math.min(fontMetricsInt.top, fontMetricsInt2.top);
            fontMetricsInt.ascent = java.lang.Math.min(fontMetricsInt.ascent, fontMetricsInt2.ascent);
            fontMetricsInt.descent = java.lang.Math.max(fontMetricsInt.descent, fontMetricsInt2.descent);
            fontMetricsInt.bottom = java.lang.Math.max(fontMetricsInt.bottom, fontMetricsInt2.bottom);
        }
        return this.f474865i;
    }
}
