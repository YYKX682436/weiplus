package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class p5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 f268282e;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, java.lang.String str) {
        this.f268282e = b5Var;
        this.f268281d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = this.f268282e;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.b(b5Var, 1, null);
            java.lang.String str = this.f268281d;
            boolean k17 = b5Var.k();
            try {
                r01.h0 h17 = b5Var.h();
                if (h17.f449627b) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.g(b5Var.l(), str, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(str), k17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u5(b5Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c5(b5Var, h17, str));
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f(b5Var.l(), str, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(str), k17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.d5(b5Var));
                }
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
                return;
            }
        }
        if (itemId == 2) {
            java.util.ArrayList arrayList = b5Var.f265466a;
            if (arrayList != null && arrayList.size() > 0) {
                c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) b5Var.f265466a.get(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.b(b5Var, 2, c17261xe88a6357);
            java.lang.String str2 = this.f268281d;
            try {
                boolean k18 = b5Var.k();
                r01.h0 h18 = b5Var.h();
                if (h18.f449627b) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.m(b5Var.l(), str2, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(str2), k18, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e5(b5Var, h18, str2));
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.m(b5Var.l(), str2, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(str2), k18, null);
                }
                return;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", e18.getMessage());
                return;
            }
        }
        java.lang.String str3 = this.f268281d;
        if (itemId != 3) {
            if (itemId == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.b(b5Var, 7, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.c(b5Var, str3, java.lang.Boolean.FALSE);
                return;
            } else {
                if (itemId != 6) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.b(b5Var, 7, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.c(b5Var, str3, java.lang.Boolean.TRUE);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.b(b5Var, 3, null);
        try {
            boolean k19 = b5Var.k();
            java.lang.String replaceAll = str3.replaceAll("tp=webp", "");
            r01.h0 h19 = b5Var.h();
            if (h19.f449627b) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.g(b5Var.l(), replaceAll, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(replaceAll), k19, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f5(b5Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g5(b5Var, h19, str3));
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f(b5Var.l(), replaceAll, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(replaceAll), k19, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h5(b5Var));
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e19.getMessage());
        }
    }
}
