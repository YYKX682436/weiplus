package iy4;

/* loaded from: classes4.dex */
public class y0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f377566d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f377567e;

    public y0(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.wm0 wm0Var = new r45.wm0();
        r45.xm0 xm0Var = new r45.xm0();
        lVar.f152197a = wm0Var;
        lVar.f152198b = xm0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmget";
        lVar.f152200d = 971;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f377567e = lVar.a();
        wm0Var.f470801d = str;
        try {
            byte[] h17 = fo3.s.INSTANCE.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(h17);
            k57Var.f459929f = cu5Var;
            wm0Var.f470803f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneExtDeviceLoginConfirmGet", th6, "cc throws exception.", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f377566d = u0Var;
        return mo9409x10f9447a(sVar, this.f377567e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 971;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f377566d.mo815x76e0bfae(i18, i19, str, this);
    }
}
