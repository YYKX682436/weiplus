package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class m5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showToast";
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
        java.lang.String optString = e17.optString("status");
        java.lang.String optString2 = e17.optString("word");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            q5Var.a("invalid_params", null);
            return;
        }
        boolean optBoolean = e17.optBoolean("needBlock", false);
        int optInt = e17.optInt("timeout", 10);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1867169789:
                    if (optString.equals(ya.b.f77504xbb80cbe3)) {
                        db5.t7.h(context, optString2);
                        q5Var.a(null, null);
                        return;
                    }
                    return;
                case 3135262:
                    if (optString.equals("fail")) {
                        db5.t7.g(context, optString2);
                        q5Var.a(null, null);
                        return;
                    }
                    return;
                case 336650556:
                    if (optString.equals("loading")) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, optString2, !optBoolean, 3, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l5(q5Var));
                        android.app.Dialog dialog = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m.f221383a;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m.f221383a = f17;
                        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                        t0Var.getClass();
                        t0Var.z(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.k5(f17, q5Var), optInt * 1000, false);
                        return;
                    }
                    return;
                case 1940070258:
                    if (optString.equals("dismissloading")) {
                        android.app.Dialog dialog2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m.f221383a;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m.f221383a = null;
                        q5Var.a(null, null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
