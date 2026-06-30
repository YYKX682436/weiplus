package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class c1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e f243780d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e) {
        this.f243780d = activityC17680x54e9523e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int mo70514xb06685ab;
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e = this.f243780d;
        java.lang.String str = activityC17680x54e9523e.f243754f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        g0Var.d(12662, objArr);
        h34.i0 Ui = c34.h0.Ui();
        java.lang.String str2 = activityC17680x54e9523e.f243754f;
        Ui.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            mo70514xb06685ab = -1;
        } else {
            mo70514xb06685ab = Ui.f360076d.mo70514xb06685ab(Ui.mo145255x88e404c3(), "username = '" + str2 + "'", null);
        }
        if (mo70514xb06685ab < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeTvHistoryListUI", "delete tv history fail, ret[%d]", java.lang.Integer.valueOf(mo70514xb06685ab));
        } else {
            c01.d9.e().g(new h34.h(1, activityC17680x54e9523e.f243754f));
        }
        activityC17680x54e9523e.f243752d.f();
    }
}
