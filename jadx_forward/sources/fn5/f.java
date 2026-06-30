package fn5;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f346194g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fn5.n0 n0Var, yz5.l lVar, yz5.l lVar2, int i17) {
        super(2);
        this.f346191d = n0Var;
        this.f346192e = lVar;
        this.f346193f = lVar2;
        this.f346194g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f346194g | 1;
        yz5.l lVar = this.f346192e;
        yz5.l lVar2 = this.f346193f;
        fn5.p.a(this.f346191d, lVar, lVar2, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
