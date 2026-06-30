package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public final class t0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 f284623a;

    public t0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var) {
        this.f284623a = c1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        java.util.Calendar m83460x1cb9a550;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var = this.f284623a;
        com.p314xaae8f345.mm.p2816xed9644dc.C22935x2d5d9781 c22935x2d5d9781 = c1Var.f284425h;
        long timeInMillis = (c22935x2d5d9781 == null || (m83460x1cb9a550 = c22935x2d5d9781.m83460x1cb9a550()) == null) ? 0L : m83460x1cb9a550.getTimeInMillis();
        long j17 = timeInMillis / 1000;
        c1Var.f284431n.f140732j = j17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.h0 h0Var = c1Var.f284429l;
        if (h0Var != null) {
            pj5.j jVar = (pj5.j) h0Var;
            long c17 = timeInMillis - c01.id.c();
            android.content.Context context = jVar.f436912a;
            if (c17 < 300000) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lxc);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                e4Var.c();
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = jVar.f436913b.f284427j;
                if (z2Var != null) {
                    z2Var.B();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "hide");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(795L, 1L, 1L, false);
                boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = jVar.f436914c;
                if (m40080x23b734ff) {
                    r45.lo5 lo5Var = new r45.lo5();
                    lo5Var.f461208d = jVar.f436917f;
                    lo5Var.f461210f = (int) j17;
                    lo5Var.f461209e = 1;
                    lo5Var.f461211g = 1;
                    r45.wq4 wq4Var = new r45.wq4();
                    wq4Var.f470923f = f9Var.Q0();
                    wq4Var.f470924g = f9Var.I0();
                    wq4Var.f470921d = pj5.k.f436919a.a(context, f9Var);
                    lo5Var.f461212h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wq4Var.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p957x53236a1b.t1.a(jVar.f436915d, jVar.f436916e, lo5Var, new pj5.i(jVar.f436912a, jVar.f436913b, jVar.f436918g, timeInMillis));
                } else {
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.p7a);
                    e4Var2.c();
                    java.lang.String Q0 = f9Var.Q0();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6739xd363a4e7 c6739xd363a4e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6739xd363a4e7();
                    c6739xd363a4e7.f140726d = 2L;
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
                        c6739xd363a4e7.f140727e = 2L;
                    } else {
                        c6739xd363a4e7.f140727e = 1L;
                    }
                    c6739xd363a4e7.k();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "ok");
    }
}
