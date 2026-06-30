package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class a0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "modifyFinderAccountNickname";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiModifyFinderAccountNickname", "JsApiModifyFinderAccountNickname");
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail:username is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("nickname", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            e9Var.a(i17, o("fail:nickname is null or nil"));
            return;
        }
        java.lang.String optString3 = jSONObject.optString("signature", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            e9Var.a(i17, o("fail:signature is null or nil"));
            return;
        }
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(0, optString2);
        ri2Var.set(1, optString3);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 1);
        try {
            hx0Var.set(1, com.tencent.mm.protobuf.g.b(ri2Var.toByteArray()));
        } catch (java.lang.Exception unused) {
        }
        r45.rn2 rn2Var = new r45.rn2();
        rn2Var.set(1, optString);
        rn2Var.getList(2).add(hx0Var);
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 3870;
        lVar2.f70666c = "${FinderCgiConstants.CGI_PRE}/finderoplog";
        lVar2.f70664a = rn2Var;
        lVar2.f70665b = new r45.sn2();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar2.a(), new com.tencent.mm.plugin.appbrand.jsapi.finder.z(this, e9Var, i17));
    }
}
