package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes.dex */
public final class w extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1100;
    public static final java.lang.String NAME = "getWCCoinBalance";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new android.os.Bundle(), com.tencent.mm.plugin.appbrand.jsapi.wccoin.o.class, new com.tencent.mm.plugin.appbrand.jsapi.wccoin.v(d0Var, i17, this));
    }
}
