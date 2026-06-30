package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes13.dex */
public final class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1589;
    public static final java.lang.String NAME = "openDesignerProfile";

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.emoji.h f80854g = new com.tencent.mm.plugin.appbrand.jsapi.emoji.h(null);

    public static final void C(com.tencent.mm.plugin.appbrand.jsapi.emoji.m mVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext jsApiOpenDesignerProfile$EmotionDesignerContext, r45.v75 v75Var) {
        java.lang.String str;
        java.lang.String str2;
        mVar.getClass();
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenDesignerProfile", "unable to get emoticon liteapp feature service");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, mVar.u(str2, jSONObject));
            return;
        }
        qk.w wVar = new qk.w(v75Var);
        java.lang.String str4 = jsApiOpenDesignerProfile$EmotionDesignerContext.f80822d;
        kotlin.jvm.internal.o.g(str4, "<set-?>");
        wVar.f364052g = str4;
        wVar.f364155a = jsApiOpenDesignerProfile$EmotionDesignerContext.f80824f;
        java.lang.String str5 = jsApiOpenDesignerProfile$EmotionDesignerContext.f80823e;
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        wVar.f364054i = str5;
        wVar.f364060o = jsApiOpenDesignerProfile$EmotionDesignerContext.f80833r;
        wVar.f364156b = true;
        java.lang.String str6 = jsApiOpenDesignerProfile$EmotionDesignerContext.f80835t;
        kotlin.jvm.internal.o.g(str6, "<set-?>");
        wVar.f364157c = str6;
        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(e9Var.Z0(), wVar);
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, mVar.u(str2, jSONObject2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r29, org.json.JSONObject r30, int r31) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.emoji.m.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
