package v61;

/* loaded from: classes4.dex */
public class m0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514992d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514993e;

    public m0(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ul6();
        lVar.f152198b = new r45.vl6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/thirdappverify";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qc.f34715x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514993e = a17;
        com.p314xaae8f345.mm.p944x882e457a.m mVar = a17.f152243a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = mVar.f152217a;
        ((r45.ul6) fVar).f469002d = str;
        ((r45.ul6) fVar).f469003e = i18;
        ((r45.ul6) fVar).f469004f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
        ((r45.ul6) mVar.f152217a).f469005g = x51.j1.a(s07);
        a17.m48033x97bfc4c(o45.pi.a());
        a17.f152247e = 1;
        a17.mo47979x2d63726f().m150625x820885cc(s07);
        a17.mo47979x2d63726f().m150629x6027f5dc(i17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514992d = u0Var;
        return mo9409x10f9447a(sVar, this.f514993e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qc.f34715x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyThirdApp", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f514992d.mo815x76e0bfae(i18, i19, str, this);
    }
}
