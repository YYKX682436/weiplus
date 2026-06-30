package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class qm implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f243016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rm f243017e;

    public qm(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rm rmVar, int i17) {
        this.f243017e = rmVar;
        this.f243016d = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rm rmVar = this.f243017e;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = rmVar.f243052a;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea.f242216y;
            activityC17463xb337a9ea.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_other_account", "view_clk", activityC17463xb337a9ea.f242229s, 34575);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(((java.util.HashMap) rmVar.f243052a.f242232v).size() > 1 ? 1 : 0);
            objArr[1] = 13;
            c01.uc ucVar = c01.uc.f119047c;
            objArr[2] = ucVar.f();
            objArr[3] = ucVar.e();
            objArr[4] = wo.w0.k();
            g0Var.d(14978, objArr);
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0);
            sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
            sharedPreferences.edit().putBoolean("last_switch_account_to_regui", false).commit();
            rmVar.f243052a.W6();
            return;
        }
        if (itemId != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = java.lang.Integer.valueOf(((java.util.HashMap) rmVar.f243052a.f242232v).size() > 1 ? 1 : 0);
        objArr2[1] = 14;
        c01.uc ucVar2 = c01.uc.f119047c;
        objArr2[2] = ucVar2.f();
        objArr2[3] = ucVar2.e();
        objArr2[4] = wo.w0.k();
        g0Var2.d(14978, objArr2);
        java.lang.String u17 = gm0.j1.u().c().u(6, "");
        int i19 = this.f243016d;
        if (i19 != 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
            rmVar.f243052a.onActivityResult(702, 1, new android.content.Intent());
            return;
        }
        android.content.Intent intent = new android.content.Intent(rmVar.f243052a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17460x8b5f64b2.class);
        intent.putExtra("RegScene", i19);
        rmVar.f243052a.startActivityForResult(intent, 702);
    }
}
