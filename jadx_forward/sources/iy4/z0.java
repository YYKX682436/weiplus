package iy4;

/* loaded from: classes4.dex */
public class z0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f377568d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f377569e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f377570f;

    public z0(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, long j17, int i17) {
        this.f377570f = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ym0 ym0Var = new r45.ym0();
        r45.zm0 zm0Var = new r45.zm0();
        lVar.f152197a = ym0Var;
        lVar.f152198b = zm0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
        lVar.f152200d = 972;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ym0Var.f472743d = str;
        ym0Var.f472744e = str2;
        ym0Var.f472746g = z17;
        ym0Var.f472749m = z18;
        ((iy4.z) i95.n0.c(iy4.z.class)).getClass();
        boolean b17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.m.f298233c.b(j17, i17);
        ot5.g.c("MicroMsg.ExtDeviceService", "getSyncRecordTrigger: " + b17);
        ym0Var.f472750n = b17;
        this.f377569e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f377568d = u0Var;
        return mo9409x10f9447a(sVar, this.f377569e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 972;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f377568d.mo815x76e0bfae(i18, i19, str, this);
    }
}
