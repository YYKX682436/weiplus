package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f289011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 f289012e;

    public b6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var, r45.mm6 mm6Var) {
        this.f289012e = q5Var;
        this.f289011d = mm6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.mm6 mm6Var;
        boolean z17;
        boolean pj6 = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).pj(this.f289011d);
        if (pj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "checkTinkerBoostInstall, isApkHasUpdateIndialogInfo = %s.", java.lang.Boolean.valueOf(pj6));
            return;
        }
        java.lang.String a17 = k35.o1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "checkTinkerBoostInstall, oldApkMd5 = %s.", a17);
        r45.mm6 mm6Var2 = this.f289011d;
        if ((mm6Var2 == null || !mm6Var2.f462205h.equalsIgnoreCase(a17)) && ((mm6Var = this.f289011d) == null || mm6Var.f462214t != 4)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f289012e;
        int i17 = this.f289011d.f462214t;
        q5Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "isPatch = %s", java.lang.Boolean.valueOf(i17 == 2 || i17 == 3 || i17 == 4));
        r45.mm6 mm6Var3 = this.f289011d;
        if (mm6Var3.f462215u == 0 && mm6Var3.f462216v == 0 && mm6Var3.f462217w == 0) {
            mm6Var3.f462215u = 1;
            mm6Var3.f462216v = 1;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(mm6Var3.f462202e) && uk.b.a(this.f289011d.f462202e)) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_update_patch_dialog_can_show_flag, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "showUpdateDilaog = %s, currentVersion = %s, dialogInfo.isShowDialog = %s, dialogInfo.isShowNotification = %s.", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(this.f289011d.f462217w), java.lang.Integer.valueOf(this.f289011d.f462215u));
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x5(this, z17));
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(this.f289011d.f462212r);
        z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_allow_no_alpha_version_install, 1) == 1;
        ((wv.a) ((xv.g0) i95.n0.c(xv.g0.class))).getClass();
        boolean a18 = c83.c.a(valueOf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "checkTinkerBoostInstall, isAlphaVersion = %s, isForceAllowNoAlphaVersionInstall = %s.", java.lang.Boolean.valueOf(a18), java.lang.Boolean.valueOf(z17));
        if (a18 || !z17) {
            ((un4.e) i95.n0.c(un4.e.class)).getClass();
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a6(this));
        }
    }
}
