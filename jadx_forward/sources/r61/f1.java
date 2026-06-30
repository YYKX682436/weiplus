package r61;

/* loaded from: classes4.dex */
public class f1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474403d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474404e;

    public f1(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s20();
        lVar.f152198b = new r45.t20();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkunbind";
        lVar.f152200d = 254;
        lVar.f152201e = 131;
        lVar.f152202f = 1000000131;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474404e = a17;
        ((r45.s20) a17.f152243a.f152217a).f466958d = i17;
    }

    public java.lang.String H() {
        try {
            return ((r45.t20) this.f474404e.f152244b.f152233a).f467608d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneCheckUnBind", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474403d = u0Var;
        return mo9409x10f9447a(sVar, this.f474404e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 254;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        this.f474403d.mo815x76e0bfae(i18, i19, str, this);
    }
}
