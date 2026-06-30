package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f230037d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e) {
        this.f230037d = activityC16480xce80140e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(14872, 0, 0, "", "", 0);
        g0Var.d(16500, 3);
        boolean f17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f230037d;
        if (!f17 || (arrayList = activityC16480xce80140e.M) == null || arrayList.size() <= 0) {
            boolean z17 = activityC16480xce80140e.f229825y.f88830f;
            activityC16480xce80140e.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_default_show_currency", z17);
            j45.l.n(activityC16480xce80140e, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, 6);
        } else {
            activityC16480xce80140e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "openNewPayManageMenu");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16480xce80140e.mo55332x76847179();
            android.view.LayoutInflater.from(mo55332x76847179);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179, 1, false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w1(activityC16480xce80140e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.x1(activityC16480xce80140e);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f309914y = null;
                h4Var.f309915z = null;
            }
            arrayList2.clear();
            db5.g4 g4Var = new db5.g4(mo55332x76847179);
            w1Var.mo887xc459429a(g4Var);
            if (g4Var.z()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                k0Var.f293405n = w1Var;
                k0Var.f293414s = x1Var;
                k0Var.f293387d = null;
                k0Var.G = null;
                k0Var.v();
            }
        }
        return true;
    }
}
