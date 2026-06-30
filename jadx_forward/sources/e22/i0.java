package e22;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f328196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f328197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f328199g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e22.d1 d1Var, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f328196d = d1Var;
        this.f328197e = lVar;
        this.f328198f = i17;
        this.f328199g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f328198f | 1;
        e22.a1.c(this.f328196d, this.f328197e, (n0.o) obj, i17, this.f328199g);
        return jz5.f0.f384359a;
    }
}
