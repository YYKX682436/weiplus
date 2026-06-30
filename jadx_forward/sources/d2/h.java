package d2;

/* loaded from: classes10.dex */
public final class h extends android.text.style.CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f307305a;

    /* renamed from: b, reason: collision with root package name */
    public final float f307306b;

    /* renamed from: c, reason: collision with root package name */
    public final float f307307c;

    /* renamed from: d, reason: collision with root package name */
    public final float f307308d;

    public h(int i17, float f17, float f18, float f19) {
        this.f307305a = i17;
        this.f307306b = f17;
        this.f307307c = f18;
        this.f307308d = f19;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint tp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tp6, "tp");
        tp6.setShadowLayer(this.f307308d, this.f307306b, this.f307307c, this.f307305a);
    }
}
