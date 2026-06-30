package e93;

/* loaded from: classes.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331888d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331889e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331890f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f331891g = new java.util.ArrayList();

    public c(java.lang.String str) {
        this.f331890f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yb0();
        lVar.f152198b = new r45.zb0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/delcontactlabel";
        lVar.f152200d = 636;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f331888d = lVar.a();
        this.f331890f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f331889e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f331888d;
        r45.yb0 yb0Var = (r45.yb0) oVar.f152243a.f152217a;
        java.lang.String str = this.f331890f;
        yb0Var.f472478d = str;
        if (str != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            yb0Var.f472478d = str;
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.NetSceneDelContactLabel", "cpan[doScene] label id list is null.");
        u0Var.mo815x76e0bfae(3, -1, "[doScene]empty label is list.", this);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 636;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f331889e.mo815x76e0bfae(i18, i19, str, this);
    }
}
