package d2;

/* loaded from: classes7.dex */
public final class f implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f307286d;

    /* renamed from: e, reason: collision with root package name */
    public final int f307287e;

    /* renamed from: f, reason: collision with root package name */
    public final int f307288f;

    /* renamed from: g, reason: collision with root package name */
    public int f307289g;

    /* renamed from: h, reason: collision with root package name */
    public int f307290h;

    /* renamed from: i, reason: collision with root package name */
    public int f307291i;

    /* renamed from: m, reason: collision with root package name */
    public int f307292m;

    /* renamed from: n, reason: collision with root package name */
    public int f307293n;

    /* renamed from: o, reason: collision with root package name */
    public int f307294o;

    public f(float f17, int i17, int i18, boolean z17, boolean z18, int i19) {
        this.f307286d = f17;
        this.f307287e = i18;
        this.f307288f = i19;
        boolean z19 = true;
        if (!(i19 >= 0 && i19 < 101) && i19 != -1) {
            z19 = false;
        }
        if (!z19) {
            throw new java.lang.IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z17 = i17 == 0;
        boolean z18 = i18 == this.f307287e;
        if (z17 && z18) {
            return;
        }
        if (z17) {
            int ceil = (int) java.lang.Math.ceil(this.f307286d);
            int i28 = ceil - (fontMetricsInt.descent - fontMetricsInt.ascent);
            int i29 = this.f307288f;
            if (i29 == -1) {
                i29 = (int) ((java.lang.Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent)) * 100.0f);
            }
            double ceil2 = i28 <= 0 ? java.lang.Math.ceil((i28 * i29) / 100.0f) : java.lang.Math.ceil((i28 * (100 - i29)) / 100.0f);
            int i37 = fontMetricsInt.descent;
            int i38 = ((int) ceil2) + i37;
            this.f307291i = i38;
            this.f307290h = i38 - ceil;
            int i39 = fontMetricsInt.ascent;
            this.f307289g = i39;
            this.f307292m = i37;
            this.f307293n = i39 - i39;
            this.f307294o = i37 - i37;
        }
        fontMetricsInt.ascent = z17 ? this.f307289g : this.f307290h;
        fontMetricsInt.descent = z18 ? this.f307292m : this.f307291i;
    }
}
