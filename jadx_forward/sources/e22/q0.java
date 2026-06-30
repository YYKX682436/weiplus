package e22;

/* loaded from: classes10.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f328236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f328237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f328239g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(e22.d1 d1Var, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f328236d = d1Var;
        this.f328237e = lVar;
        this.f328238f = i17;
        this.f328239g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f328238f | 1;
        e22.a1.c(this.f328236d, this.f328237e, (n0.o) obj, i17, this.f328239g);
        return jz5.f0.f384359a;
    }
}
