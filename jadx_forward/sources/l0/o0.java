package l0;

/* loaded from: classes5.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.p pVar, int i17) {
        super(2);
        this.f395933d = pVar;
        this.f395934e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        l0.t0.a(this.f395933d, oVar, (this.f395934e >> 9) & 14);
        return jz5.f0.f384359a;
    }
}
