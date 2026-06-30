package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class j6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 236;
    public static final java.lang.String NAME = "getSetting";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        r45.cc7 cc7Var = new r45.cc7();
        java.lang.String appId = lVar.getAppId();
        cc7Var.f371475d = appId;
        cc7Var.f371476e = k91.g3.f305592a.a(appId);
        ((com.tencent.mm.plugin.appbrand.networking.c0) lVar.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp_getauthinfo", cc7Var.f371475d, cc7Var, r45.dc7.class).n(new com.tencent.mm.plugin.appbrand.jsapi.i6(this, lVar, i17));
    }
}
