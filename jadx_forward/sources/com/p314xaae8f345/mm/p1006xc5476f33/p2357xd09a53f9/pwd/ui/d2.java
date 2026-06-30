package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class d2 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260520a;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd70, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        this.f260520a = rVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("refund_way");
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        if (mo27544xb58848b9 == com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c.LQ.ordinal()) {
            longValue = (longValue | 1) & (-3);
        } else if (mo27544xb58848b9 == com.p314xaae8f345.p347x615374d.gen.EnumC3467x2a09e18c.ORIGIN.ordinal()) {
            longValue = (longValue & (-2)) | 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(longValue));
        r45.oo4 oo4Var = new r45.oo4();
        if ((longValue & 1) != 0) {
            oo4Var.f463929d = 1L;
            oo4Var.f463930e = 2L;
        } else if ((longValue & 2) != 0) {
            oo4Var.f463929d = 2L;
            oo4Var.f463930e = 1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPasswordSettingUI", "UseCaseCallback doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", java.lang.Long.toBinaryString(longValue), java.lang.Long.toBinaryString(oo4Var.f463929d), java.lang.Long.toBinaryString(oo4Var.f463930e));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(218, oo4Var));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260520a).notifyDataSetChanged();
    }
}
