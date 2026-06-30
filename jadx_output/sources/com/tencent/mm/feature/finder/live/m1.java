package com.tencent.mm.feature.finder.live;

@j95.b
/* loaded from: classes7.dex */
public final class m1 extends i95.w implements s40.r0 {
    public boolean Ai(org.json.JSONObject data, int i17, java.lang.String componentAppId) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(componentAppId, "componentAppId");
        if (kotlin.jvm.internal.o.b(data.optString("mode"), "halfPage")) {
            org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
            if (optJSONObject != null && optJSONObject.has("anchor_game_panel")) {
                ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3912w6).getValue()).r()).intValue() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(data.toString());
                    jSONObject.put("vType", i17);
                    jSONObject.put("componentAppId", componentAppId);
                    java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                    com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), new com.tencent.mm.feature.finder.live.k1(), com.tencent.mm.feature.finder.live.l1.f66807d);
                    return true;
                }
            }
        }
        return false;
    }

    public void wi() {
        boolean z17;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        try {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "changeToPortraitFromExternal");
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
            if (k0Var2 != null) {
                z17 = true;
                if (k0Var2.isLandscape()) {
                    if (z17 || (k0Var = dk2.ef.f233380e) == null) {
                    }
                    k0Var.forceScreenToPortrait();
                    return;
                }
            }
            z17 = false;
            if (z17) {
            }
        } catch (java.lang.Throwable th6) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderLiveExternalService", th6, "Fail to call FinderLiveService.changeToPortraitFromExternal()", new java.lang.Object[0]);
        }
    }
}
