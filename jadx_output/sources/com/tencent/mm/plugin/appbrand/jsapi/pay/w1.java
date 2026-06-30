package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
class w1 implements com.tencent.mm.ipcinvoker.k0 {
    private w1() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String[] split = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d.split(",");
        if (split.length != 2) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.utils.v0 v0Var = com.tencent.mm.plugin.wallet_core.utils.v0.f180993a;
        java.lang.String str = split[0];
        com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo wCPaySessionInfoRecorder$JsApiPayInfo = str != null ? (com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo) ((java.util.LinkedHashMap) com.tencent.mm.plugin.wallet_core.utils.v0.f180994b).get(str) : null;
        if (wCPaySessionInfoRecorder$JsApiPayInfo != null) {
            return wCPaySessionInfoRecorder$JsApiPayInfo;
        }
        java.lang.String str2 = split[1];
        if (str2 != null) {
            return (com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo) ((java.util.LinkedHashMap) com.tencent.mm.plugin.wallet_core.utils.v0.f180994b).get(str2);
        }
        return null;
    }
}
