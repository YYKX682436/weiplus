package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267609d = kVar;
        this.f267610e = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        hashMap.put("imei", "");
        ((ee0.e) ((fe0.l3) i95.n0.c(fe0.l3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        boolean b17 = w34.a.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        nw4.k kVar = this.f267609d;
        if (b17) {
            java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k96) && (v0Var = kVar.f422395c) != null) {
                try {
                    k96 = v0Var.i(112, new android.os.Bundle()).getString("oaid", "");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetAdIdInfo", "getOaid ex " + e17.getMessage());
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k96);
            hashMap.put("oaid", k96);
        }
        nw4.y2 y2Var = this.f267610e;
        if (((java.util.HashMap) y2Var.f422323a).containsKey("waidPkg")) {
            java.lang.Object obj = ((java.util.HashMap) y2Var.f422323a).get("waidPkg");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetAdIdInfo", "waidPkg=".concat(str));
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            java.lang.String d17 = me4.c.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getAppWaid(...)");
            hashMap.put("waid", d17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetAdIdInfo", "no waidPkg param");
        }
        hashMap.put("devIdInfo", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai());
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1896, 21);
        return jz5.f0.f384359a;
    }
}
