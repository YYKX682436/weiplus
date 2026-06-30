package z73;

/* loaded from: classes11.dex */
public abstract class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f552100d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f552101e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f552102f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f552103g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f552105i;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f552104h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f552106m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f552107n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f552108o = 0;

    public a() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.f35();
        lVar.f152198b = new r45.g35();
        lVar.f152199c = "/cgi-bin/micromsg-bin/prconfig";
        lVar.f152200d = 3899;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f552100d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f552101e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f552100d;
        r45.f35 f35Var = (r45.f35) oVar.f152243a.f152217a;
        f35Var.f455520d = this.f552102f;
        f35Var.f455521e = this.f552103g;
        f35Var.f455522f = this.f552104h;
        f35Var.f455524h = this.f552105i;
        f35Var.f455525i = this.f552106m;
        f35Var.f455526m = this.f552107n;
        f35Var.f455527n = this.f552108o;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3899;
    }
}
