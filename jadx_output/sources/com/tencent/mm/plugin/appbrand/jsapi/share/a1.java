package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class a1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "shareImageMessageToSpecificContact";

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.s0 f83106h = new com.tencent.mm.plugin.appbrand.jsapi.share.s0(null);

    /* renamed from: g, reason: collision with root package name */
    public final int f83107g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, data is null");
            yVar.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var = new com.tencent.mm.plugin.appbrand.jsapi.share.t0(this, jSONObject, yVar);
        java.lang.String str2 = t0Var.f83233a;
        boolean z17 = str2.length() == 0;
        java.lang.String str3 = t0Var.f83237e;
        if (z17) {
            str = "fail:imagePath is null";
        } else {
            if (t0Var.f83236d.length() == 0) {
                if (str3.length() == 0) {
                    str = "fail:openId and chatroomUsername is null";
                }
            }
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", str);
            yVar.a(i17, o(str));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke params:" + t0Var);
        if (!(t0Var.f83236d.length() == 0)) {
            com.tencent.mm.plugin.appbrand.utils.o5.b(yVar, str2, null, new com.tencent.mm.plugin.appbrand.jsapi.share.u0(yVar, i17, this, t0Var));
            return;
        }
        r45.q46 q46Var = new r45.q46();
        q46Var.f383678d = yVar.getAppId();
        q46Var.f383679e = str3;
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 1961;
        lVar2.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/share_transid";
        lVar2.f70664a = q46Var;
        lVar2.f70665b = new r45.r46();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar2.a(), new com.tencent.mm.plugin.appbrand.jsapi.share.z0(yVar, i17, this, t0Var));
    }
}
