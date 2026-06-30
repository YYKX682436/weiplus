package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 f268654d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var) {
        this.f268654d = d0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var = this.f268654d;
        android.content.Context d17 = d0Var.d();
        android.app.Activity activity = d17 instanceof android.app.Activity ? (android.app.Activity) d17 : null;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (menuItem.getItemId() == 1) {
            d0Var.f268679d.f367707b = 2;
        } else {
            d0Var.f268679d.f367707b = 4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebViewMenuHelper", "onMMMenuItemSelected %d", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            nw4.n g07 = d0Var.e().g0();
            if (g07 != null) {
                g07.j("sendAppMessage", true);
                g07.j0(null, 0);
                return;
            }
            return;
        }
        if (itemId == 2) {
            nw4.n g08 = d0Var.e().g0();
            if (g08 != null) {
                g08.j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b, true);
                g08.l0(0, null, 0);
                return;
            }
            return;
        }
        if (itemId != 6) {
            db5.t4 t4Var = d0Var.f268685j;
            if (t4Var != null) {
                t4Var.mo888x34063ac(menuItem, i17);
                return;
            }
            return;
        }
        java.lang.String l07 = d0Var.e().l0();
        if (l07 == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(l07);
        android.widget.Toast.makeText(d0Var.d(), d0Var.d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.laa), 0).show();
    }
}
