package df5;

/* loaded from: classes4.dex */
public final class x0 implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f313789d;

    /* renamed from: e, reason: collision with root package name */
    public final float f313790e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313791f;

    public x0(int i17, float f17, int i18) {
        this.f313789d = i17;
        this.f313790e = f17;
        this.f313791f = i18;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fm6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        fm6.ascent = 0;
        fm6.top = 0;
        float f17 = this.f313790e;
        int i28 = this.f313789d;
        if (f17 <= 1.0f) {
            fm6.descent = i28;
        } else {
            fm6.descent = java.lang.Math.max(0, (int) (((i28 - this.f313791f) / f17) + 0.5f));
        }
        fm6.bottom = fm6.descent;
    }
}
