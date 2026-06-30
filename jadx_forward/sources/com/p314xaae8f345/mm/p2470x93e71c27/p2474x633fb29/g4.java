package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public abstract class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f270855a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f270856b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static int f270857c = -1;

    static {
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.y0.c();
    }

    public static boolean a() {
        if (f270857c < 0) {
            f270857c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_game_webview_in_mm, 0);
        }
        return f270857c == 1 && d() == 0;
    }

    public static boolean b() {
        return d() == 0;
    }

    public static boolean c() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_discover_page_preload_search_webview, 0) == 1;
    }

    public static int d() {
        if (f270855a >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewProgressMode, value:" + f270855a + " (0-mm/1-tools)");
            return f270855a;
        }
        com.p314xaae8f345.p3210x3857dc.z2 i17 = com.p314xaae8f345.p3210x3857dc.a3.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewProgressMode, webviewMode:" + i17);
        if (i17 == com.p314xaae8f345.p3210x3857dc.z2.NOT_IN_MM) {
            f270855a = 1;
            return 1;
        }
        f270855a = 0;
        return 0;
    }
}
