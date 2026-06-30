package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class c1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218388e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var, java.lang.String str) {
        this.f218388e = n1Var;
        this.f218387d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f218387d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218388e;
        if (itemId == 1) {
            n1Var.b(1, null);
            try {
                boolean e17 = n1Var.e();
                zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
                android.content.Context c17 = n1Var.c();
                java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.d.g().a(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.s0(n1Var);
                ((yg0.s4) q3Var).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.h(c17, str, a17, e17, s0Var);
                return;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e18.getMessage());
                return;
            }
        }
        if (itemId == 2) {
            java.util.ArrayList arrayList = n1Var.f218430a;
            if (arrayList != null && arrayList.size() > 0) {
                c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) n1Var.f218430a.get(0);
            }
            n1Var.b(2, c17261xe88a6357);
            try {
                boolean e19 = n1Var.e();
                zg0.q3 q3Var2 = (zg0.q3) i95.n0.c(zg0.q3.class);
                android.content.Context c18 = n1Var.c();
                java.lang.String a18 = com.p314xaae8f345.p3210x3857dc.d.g().a(str);
                ((yg0.s4) q3Var2).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.m(c18, str, "", a18, e19, null);
                return;
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", e27.getMessage());
                return;
            }
        }
        if (itemId == 3) {
            n1Var.b(3, null);
            try {
                boolean e28 = n1Var.e();
                java.lang.String replaceAll = str.replaceAll("tp=webp", "");
                zg0.q3 q3Var3 = (zg0.q3) i95.n0.c(zg0.q3.class);
                android.content.Context c19 = n1Var.c();
                java.lang.String a19 = com.p314xaae8f345.p3210x3857dc.d.g().a(replaceAll);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.t0(n1Var);
                ((yg0.s4) q3Var3).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.h(c19, replaceAll, a19, e28, t0Var);
                return;
            } catch (java.lang.Exception e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e29.getMessage());
                return;
            }
        }
        if (itemId != 5) {
            return;
        }
        n1Var.b(7, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic mResultOfImageUrl nil");
            return;
        }
        try {
            boolean e37 = n1Var.e();
            zg0.q3 q3Var4 = (zg0.q3) i95.n0.c(zg0.q3.class);
            android.content.Context context = n1Var.f().getContext();
            java.lang.String a27 = com.p314xaae8f345.p3210x3857dc.d.g().a(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.u0(n1Var);
            ((yg0.s4) q3Var4).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.h(context, str, a27, e37, u0Var);
        } catch (java.lang.Exception e38) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic Exception:%s", e38.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic");
    }
}
