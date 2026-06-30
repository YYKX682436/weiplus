package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes13.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.m f80850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext f80853g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.appbrand.jsapi.emoji.m mVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext jsApiOpenDesignerProfile$EmotionDesignerContext) {
        super(1);
        this.f80850d = mVar;
        this.f80851e = e9Var;
        this.f80852f = i17;
        this.f80853g = jsApiOpenDesignerProfile$EmotionDesignerContext;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext jsApiOpenDesignerProfile$EmotionDesignerContext = this.f80853g;
        int i17 = this.f80852f;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f80851e;
        com.tencent.mm.plugin.appbrand.jsapi.emoji.m mVar = this.f80850d;
        if (v75Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenDesignerProfile", "openDesignerProfile getDesignerInfo success in local");
            com.tencent.mm.plugin.appbrand.jsapi.emoji.m.C(mVar, e9Var, i17, jsApiOpenDesignerProfile$EmotionDesignerContext, v75Var);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenDesignerProfile", "openDesignerProfile getDesignerInfo failed in local");
            mVar.getClass();
            android.content.Context f147807d = e9Var.getF147807d();
            if (f147807d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenDesignerProfile", "fetchDesignerInfoInMainProcess failed, env.context is null");
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i17, mVar.u(str, jSONObject));
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyRequest fetchDesignerProxyRequest = new com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyRequest(jsApiOpenDesignerProfile$EmotionDesignerContext);
                com.tencent.mm.plugin.appbrand.jsapi.emoji.k kVar = new com.tencent.mm.plugin.appbrand.jsapi.emoji.k(e9Var, i17, mVar, jsApiOpenDesignerProfile$EmotionDesignerContext);
                java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, fetchDesignerProxyRequest, kVar, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
