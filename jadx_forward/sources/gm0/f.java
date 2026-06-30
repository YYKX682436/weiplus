package gm0;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.m f354716d;

    public f(gm0.m mVar) {
        this.f354716d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        gm0.b0 u17 = gm0.j1.u();
        u17.getClass();
        gm0.m0 m0Var = new gm0.m0();
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) u17.f354687g.l(14, null));
        int i17 = o45.wf.f424562g;
        java.lang.Integer.toHexString(q17);
        java.lang.Integer.toHexString(i17);
        boolean z17 = q17 == 0;
        if (z17) {
            u17.f354687g.w(8197, "");
            u17.f354687g.w(15, 0);
        }
        boolean z18 = q17 != i17;
        if (q17 > 620822536 || q17 == i17) {
            u17.f354687g.w(274480, java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "[initialize] need not init emoji");
        } else {
            u17.f354687g.w(274480, java.lang.Boolean.TRUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "[initialize] need init emoji");
        }
        if (q17 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreStorage", "account storage version changed from " + java.lang.Integer.toHexString(q17) + " to " + java.lang.Integer.toHexString(i17) + ", init=" + z17);
            com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = u17.f354681a;
            if (((java.lang.Integer) j3Var.b(37, 0)).intValue() == 0) {
                j3Var.f(37, java.lang.Integer.valueOf(q17));
            }
            u17.f354687g.w(62, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
            if (q17 != 0 && (q17 & (-16777216)) == (i17 & (-16777216))) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("show_whatsnew");
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("show_whatsnew");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "unlock show_whatsnew from testWhatsNew, %s.", java.lang.Boolean.valueOf(u17.f354687g.r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WHATS_NEW_LOCAL_STYLE_INT_SYNC, -1) > 0));
        m0Var.f354790a = z18;
        m0Var.f354791b = q17;
        gm0.m mVar = this.f354716d;
        mVar.f354777g = m0Var;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "changeToAccountHasReady");
        mVar.f354785o = gm0.k.AccountHasReady;
    }
}
