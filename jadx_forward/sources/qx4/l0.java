package qx4;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qx4.l0 f448955a = new qx4.l0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f448956b = new java.util.HashMap();

    public static final boolean a() {
        boolean z17;
        if (f448955a.d()) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preload WebView, WebView render process not exist");
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preload WebView, needUseSysCore: " + z17);
        return z17;
    }

    public final qx4.m0 b(int i17) {
        return (qx4.m0) f448956b.get(java.lang.Integer.valueOf(i17));
    }

    public final qx4.m0 c(int i17, boolean z17) {
        qx4.m0 b17 = b(i17);
        if (b17 == null) {
            return null;
        }
        if (!z17) {
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20677xef522e05()) != 0) {
                f448956b.remove(java.lang.Integer.valueOf(i17));
                return b17;
            }
            if (!b17.f448964g.get()) {
                return null;
            }
            f448956b.remove(java.lang.Integer.valueOf(i17));
            return b17;
        }
        qx4.d0 d0Var = b17.f448963f;
        boolean z18 = false;
        if (d0Var != null && d0Var.f448929e) {
            z18 = true;
        }
        if (z18 || b17.f448964g.get()) {
            f448956b.remove(java.lang.Integer.valueOf(i17));
            return b17;
        }
        if (f448955a.d()) {
            f448956b.remove(java.lang.Integer.valueOf(i17));
            return b17;
        }
        f448956b.remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = b17.f448960c;
        if (abstractC19224x1fe3df6e != null) {
            abstractC19224x1fe3df6e.mo120132x35d48587();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e2 = b17.f448960c;
        if (abstractC19224x1fe3df6e2 != null) {
            abstractC19224x1fe3df6e2.mo120135xb4407692();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e3 = b17.f448960c;
        if (abstractC19224x1fe3df6e3 != null) {
            abstractC19224x1fe3df6e3.mo52095x5cd39ffa();
        }
        b17.f448960c = null;
        return null;
    }

    public final boolean d() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o("com.tencent.mm:xweb_sandboxed_process_ex_0") || (com.p314xaae8f345.p3210x3857dc.a3.h() > 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchPreloadLogic", "Error checking xweb_sandboxed_process: " + e17.getMessage());
            return true;
        }
    }

    public final void e(java.lang.String url, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preloadWebView url:" + url + " reset:" + z17 + " preloadScene:" + i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f263095a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preloadWebView skipped: debug remote url is set");
            return;
        }
        if (z17) {
            pm0.v.X(new qx4.i0(i17));
        }
        pm0.v.X(new qx4.k0(url, i17));
    }
}
