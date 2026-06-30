package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public class n0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1447;
    private static final java.lang.String NAME = "openChatTool";

    /* renamed from: g, reason: collision with root package name */
    public final int f80421g = cf.b.a(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 r6, android.content.Context r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.n0.C(com.tencent.mm.plugin.appbrand.jsapi.chattool.n0, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object D(com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 n0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        n0Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("KEY_CHAT_TOOL_ROOM", str);
        com.tencent.mm.ipcinvoker.d0.d(str2, bundle, com.tencent.mm.plugin.appbrand.jsapi.chattool.h0.class, new com.tencent.mm.plugin.appbrand.jsapi.chattool.k0(rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public static final java.lang.Object E(com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 n0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        n0Var.getClass();
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOpenChatTool", "gotoChatToolPage env:" + e9Var + " url:" + str);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mm.plugin.appbrand.jsapi.chattool.l0 l0Var = new com.tencent.mm.plugin.appbrand.jsapi.chattool.l0(e9Var, rVar, str);
        if (e9Var.t3().Q1()) {
            e9Var.t3().I1(l0Var);
        } else {
            l0Var.run();
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOpenChatTool", "openChatTool data: " + jSONObject);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiOpenChatTool", "openChatTool fail, env is null");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chattool.m0(jSONObject, this, c0Var, i17, null), 3, null);
        }
    }
}
