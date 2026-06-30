package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public class r0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1544;
    private static final java.lang.String NAME = "openChatToolAllPage";

    /* renamed from: g, reason: collision with root package name */
    public final int f80448g = cf.b.a(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 r26, android.content.Context r27, org.json.JSONObject r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.r0.C(com.tencent.mm.plugin.appbrand.jsapi.chattool.r0, android.content.Context, org.json.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOpenChatToolAllPage", "openChatToolAllPage data: " + jSONObject);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiOpenChatToolAllPage", "openChatToolAllPage fail, env is null");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chattool.q0(jSONObject, c0Var, this, i17, null), 3, null);
        }
    }
}
