package th0;

@j95.b
/* loaded from: classes13.dex */
public class y extends i95.w implements uh0.t {
    public boolean wi(android.content.Context context) {
        int i17;
        try {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z65.c.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, not debug or red or purple environment");
                return false;
            }
            boolean z17 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q;
            com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, xweb core is not init");
                com.p314xaae8f345.mm.p2829xfa87f9de.y0.b(f1Var, null);
            }
            com.p314xaae8f345.mm.p2829xfa87f9de.l0.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, ip: %s, port: %d", com.p314xaae8f345.mm.p2829xfa87f9de.l0.f296382a, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2829xfa87f9de.l0.f296383b));
            java.lang.String str2 = com.p314xaae8f345.mm.p2829xfa87f9de.l0.f296382a;
            if (str2 != null && (i17 = com.p314xaae8f345.mm.p2829xfa87f9de.l0.f296383b) != 0) {
                if (!(java.util.regex.Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$").matcher(str2).matches() && (i17 >= 1 && i17 <= 65535))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, ip or port is invalid");
                    return false;
                }
                if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, xweb core is not init");
                    com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.v0(context, f1Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? "mm" : "tools", null);
                }
                if (!com.p314xaae8f345.p3210x3857dc.k1.a("PROXY_OVERRIDE")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, WebViewFeature.PROXY_OVERRIDE is not supported");
                    return false;
                }
                if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, xweb core is not init");
                    return false;
                }
                java.lang.String str3 = "http://" + com.p314xaae8f345.mm.p2829xfa87f9de.l0.f296382a + ":" + com.p314xaae8f345.mm.p2829xfa87f9de.l0.f296383b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList.add(new com.p314xaae8f345.p3210x3857dc.d0("*", str3));
                arrayList.add(new com.p314xaae8f345.p3210x3857dc.d0("*", "direct://"));
                com.p314xaae8f345.p3210x3857dc.e0 e0Var = new com.p314xaae8f345.p3210x3857dc.e0(arrayList, arrayList2, false);
                if (!com.p314xaae8f345.p3210x3857dc.k1.a("PROXY_OVERRIDE")) {
                    throw new java.lang.UnsupportedOperationException("Proxy override not supported");
                }
                (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.x0() ? com.p314xaae8f345.p3210x3857dc.g0.f301817a : com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0() ? com.p314xaae8f345.p3210x3857dc.h0.f301822a : com.p314xaae8f345.p3210x3857dc.f0.f301808a).a(e0Var, new com.p314xaae8f345.mm.p2829xfa87f9de.j0(), new com.p314xaae8f345.mm.p2829xfa87f9de.k0());
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, ip or port is null");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.XWebDebugProxyUtil", "setDebugProxyOverride, exception", e17);
            return false;
        }
    }
}
