package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes.dex */
public final class l extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.l f268167d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.l();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f268168e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f268169f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f268170g;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f268170g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiRequestMerchantTransfer$liteAppCloseWindowEvent$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                nw4.g gVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(riVar.f89352c, "wxalite735b0917c7aabe235747cbfbe75cb71b@pay")) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "close liteapp appId %s, %s", riVar.f89352c, "wxalite735b0917c7aabe235747cbfbe75cb71b@pay");
                nw4.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.l.f268168e;
                if (kVar != null && (gVar = kVar.f422396d) != null) {
                    nw4.y2 y2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.l.f268169f;
                    java.lang.String str = y2Var != null ? y2Var.f422546c : null;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    nw4.y2 y2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.l.f268169f;
                    sb6.append(y2Var2 != null ? y2Var2.f422552i : null);
                    sb6.append(":fail");
                    gVar.e(str, sb6.toString(), null);
                }
                mo48814x2efc64();
                return false;
            }
        };
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String mo120156xb5887639;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f268168e = env;
        f268169f = msg;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "JsApiRequestMerchantTransfer data:" + msg.f422323a);
        zg0.q2 a17 = env.a();
        if (a17 == null || (mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
            if (mo120156xb5887639 == null) {
                mo120156xb5887639 = "";
            }
        }
        zg0.q2 a18 = env.a();
        java.lang.String V = a18 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) a18).V(mo120156xb5887639) : "";
        java.util.Map params = msg.f422323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(params, "params");
        params.put("sourceType", "WEBVIEW");
        java.util.Map params2 = msg.f422323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(params2, "params");
        params2.put("sourceAppId", V);
        java.lang.String jSONObject = new org.json.JSONObject(msg.f422323a).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite735b0917c7aabe235747cbfbe75cb71b@pay");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        bundle.putString("query", jSONObject);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
        bundle.putBoolean("withDownloadLoading", true);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WEB_VIEW;
        c3708xc1f46f80.f14312x721f2ec7 = V;
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.j(env, msg);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, false, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.k(env, msg));
        f268170g.mo48813x58998cd();
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.u1.f34655x24728b;
    }
}
