package b10;

/* loaded from: classes4.dex */
public final class e implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f17026d;

    public e(int i17) {
        this.f17026d = i17;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fm6) {
        int i28;
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(fm6, "fm");
        int i29 = fm6.descent;
        int i37 = fm6.ascent;
        int i38 = i29 - i37;
        if (i38 > 0 && (i28 = this.f17026d - i38) > 0) {
            int i39 = i28 / 2;
            int i47 = i37 - i39;
            fm6.ascent = i47;
            int i48 = i29 + (i28 - i39);
            fm6.descent = i48;
            fm6.top = i47;
            fm6.bottom = i48;
        }
    }
}
