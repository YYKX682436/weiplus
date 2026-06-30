package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class h5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showDialog";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = e17.optString("desc");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString3 = e17.optString("confirmText");
        java.lang.String optString4 = e17.optString("cancelText");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            q5Var.a("invalid_params", null);
            return;
        }
        boolean optBoolean = e17.optBoolean("dark", false);
        boolean optBoolean2 = e17.optBoolean("outSideCancel", false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(optString);
        u1Var.r(optBoolean);
        u1Var.g(optString2);
        u1Var.a(optBoolean2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            u1Var.n(optString3);
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e5(q5Var));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            u1Var.j(optString4);
            u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.f5(q5Var));
        }
        if (optBoolean2) {
            u1Var.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g5(q5Var));
        }
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
