package e22;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f328190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f328191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f328193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e22.d1 d1Var, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f328190d = d1Var;
        this.f328191e = lVar;
        this.f328192f = i17;
        this.f328193g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f328192f | 1;
        e22.a1.c(this.f328190d, this.f328191e, (n0.o) obj, i17, this.f328193g);
        return jz5.f0.f384359a;
    }
}
