package va3;

/* loaded from: classes4.dex */
public class a0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f515790d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 f515791e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.e0 f515792f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f515793g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jl3();
        lVar.f152198b = new r45.kl3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpoidetail";
        lVar.f152200d = 11363;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f515793g = a17;
        this.f515791e = d0Var;
        r45.jl3 jl3Var = (r45.jl3) a17.f152243a.f152217a;
        java.lang.String str = d0Var.f226312e;
        if (str != null && str.contains("nearby_")) {
            str = str.replaceAll("nearby_", "qqmap_");
        }
        jl3Var.f459451d = str;
        jl3Var.f459452e = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        jl3Var.f459453f = 2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPoiList", "NetSceneGetPoiDetail done.");
        this.f515790d = u0Var;
        return mo9409x10f9447a(sVar, this.f515793g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11363;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.kl3 kl3Var = (r45.kl3) this.f515793g.f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            this.f515792f = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.e0(kl3Var);
        }
        this.f515790d.mo815x76e0bfae(i18, i19, str, this);
    }
}
