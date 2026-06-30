package e22;

/* loaded from: classes14.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f328297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f328298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(f0.r1 r1Var, int i17) {
        super(0);
        this.f328297d = r1Var;
        this.f328298e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        f0.l0 f17 = this.f328297d.f();
        int a17 = f17.a();
        f0.k kVar = (f0.k) kz5.n0.k0(f17.b());
        return java.lang.Boolean.valueOf((kVar != null ? ((f0.q0) kVar).f339721c : 0) + 1 > a17 - this.f328298e);
    }
}
