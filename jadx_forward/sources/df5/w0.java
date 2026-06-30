package df5;

/* loaded from: classes11.dex */
public final class w0 implements android.text.style.LeadingMarginSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f313780d;

    /* renamed from: e, reason: collision with root package name */
    public final int f313781e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313782f;

    /* renamed from: g, reason: collision with root package name */
    public final int f313783g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f313784h;

    /* renamed from: i, reason: collision with root package name */
    public final int f313785i;

    public w0(java.lang.String prefix, int i17, int i18, int i19, int i27, boolean z17, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        this.f313780d = prefix;
        this.f313781e = i17;
        this.f313782f = i19;
        this.f313783g = i27;
        this.f313784h = z17;
        this.f313785i = i28;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence text, int i29, int i37, boolean z17, android.text.Layout layout) {
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (z17) {
            int color = paint.getColor();
            android.graphics.Typeface typeface = paint.getTypeface();
            paint.setColor(this.f313781e);
            boolean z18 = this.f313784h;
            if (z18) {
                paint.setTypeface(android.graphics.Typeface.MONOSPACE);
            }
            java.lang.String str = this.f313780d;
            float measureText = paint.measureText(str);
            int i38 = this.f313783g;
            int i39 = this.f313782f;
            if (z18) {
                f17 = ((i17 + i39) - i38) - measureText;
            } else {
                f17 = (((i17 + i39) - i38) - r8) + ((this.f313785i - measureText) / 2.0f);
            }
            canvas.drawText(str, f17 * i18, i27, paint);
            paint.setColor(color);
            paint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        return this.f313782f;
    }
}
