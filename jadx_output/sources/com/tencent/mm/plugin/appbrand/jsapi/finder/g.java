package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "fetchFinderProfileFeed";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiFetchFinderProfileFeed", "JsApiFetchFinderProfileFeed");
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail:username is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("maxId", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            e9Var.a(i17, o("fail:maxId is null or nil"));
            return;
        }
        r45.z13 z13Var = new r45.z13();
        z13Var.set(2, java.lang.Long.valueOf(java.lang.Long.valueOf(optString2).longValue()));
        z13Var.set(1, optString);
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 3736;
        lVar2.f70666c = "${FinderCgiConstants.CGI_PRE}/finderuserpage";
        lVar2.f70664a = z13Var;
        lVar2.f70665b = new com.tencent.mm.protocal.protobuf.FinderUserPageResponse();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar2.a(), new com.tencent.mm.plugin.appbrand.jsapi.finder.f(this, e9Var, i17));
    }
}
