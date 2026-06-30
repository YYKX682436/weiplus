package f64;

/* loaded from: classes4.dex */
public final class d extends g64.e {
    @Override // lc3.c0
    public java.lang.String f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        return "getScreenSizeSync";
    }

    @Override // g64.e
    public lc3.a0 s(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lc3.e eVar = this.f399423a;
        android.app.Activity B0 = eVar != null ? eVar.B0() : null;
        if (B0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB.JsApi", "activity is null");
            lc3.a0 j17 = j(lc3.x.f399470d, ": activity is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
            return j17;
        }
        lc3.a0 a0Var = new lc3.a0();
        int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(B0);
        a0Var.put("screenWidth", c17[0]);
        a0Var.put("screenHeight", c17[1]);
        if (com.p314xaae8f345.mm.ui.bk.u(B0, false)) {
            a0Var.put("cutout", com.p314xaae8f345.mm.ui.bk.p(B0));
        } else {
            a0Var.put("cutout", 0);
        }
        a0Var.put("navigationBar", com.p314xaae8f345.mm.ui.bk.j(B0));
        m(a0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        return a0Var;
    }
}
