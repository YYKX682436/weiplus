package hy4;

/* loaded from: classes8.dex */
public abstract class b0 {
    public static int a(android.content.Context context) {
        context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        float b17 = j65.c.b(context);
        if (b17 == i65.a.y(context) || b17 == 0.8f) {
            return 1;
        }
        i65.a.x(context);
        if (b17 == 1.0f || b17 == 1.0f) {
            return 2;
        }
        if (b17 == i65.a.w(context) || b17 == 1.1f) {
            return 3;
        }
        if (b17 == i65.a.z(context) || b17 == 1.12f) {
            return 4;
        }
        if (b17 == i65.a.s(context) || b17 == 1.125f) {
            return 5;
        }
        if (b17 == i65.a.t(context) || b17 == 1.4f) {
            return 6;
        }
        if (b17 == i65.a.u(context) || b17 == 1.55f) {
            return 7;
        }
        return (b17 == i65.a.v(context) || b17 == 1.65f) ? 8 : 2;
    }

    public static int b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N;
        boolean z17;
        boolean c17;
        int i17 = 2;
        try {
            N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("WebViewFontUtil", 2, null);
            z17 = N.getBoolean("webview_key_font_use_system", false);
            c17 = c(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFontUtil", "useSystemFont = %b", java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        if (!z17 && !c17) {
            boolean z18 = N.getBoolean("webview_key_font_has_set", false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !cw4.a.f305725a.matcher(str).matches()) {
                int dg6 = v0Var.dg(16384, 2);
                try {
                    if (dg6 == 2 && !z18) {
                        return a(context);
                    }
                    if (N.getBoolean("webview_key_has_transfer_reader", false)) {
                        return dg6;
                    }
                    if (dg6 == 1) {
                        i17 = 1;
                    } else if (dg6 != 2) {
                        if (dg6 == 3) {
                            i17 = 4;
                        } else if (dg6 == 4) {
                            i17 = 6;
                        }
                    }
                    N.putBoolean("webview_key_has_transfer_reader", true);
                    v0Var.Ui(16384, i17);
                    return i17;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    i17 = dg6;
                }
            } else {
                int dg7 = v0Var.dg(16388, 2);
                try {
                    if (dg7 == 2 && !z18) {
                        return a(context);
                    }
                    if (N.getBoolean("webview_key_has_transfer_mp", false)) {
                        return dg7;
                    }
                    if (dg7 == 1) {
                        i17 = 1;
                    } else if (dg7 != 2) {
                        if (dg7 == 3) {
                            i17 = 4;
                        } else if (dg7 == 4) {
                            i17 = 6;
                        }
                    }
                    N.putBoolean("webview_key_has_transfer_mp", true);
                    v0Var.Ui(16388, i17);
                    return i17;
                } catch (java.lang.Exception e19) {
                    e = e19;
                    i17 = dg7;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFontUtil", "onLoadJsApiFinished, ex = " + e.getMessage());
            return i17;
        }
        return a(context);
    }

    public static boolean c(java.lang.String str) {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_mp_page_use_global_font_android, false) && hy4.i.m(str);
    }
}
