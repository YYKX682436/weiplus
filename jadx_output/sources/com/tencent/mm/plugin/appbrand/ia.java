package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class ia implements gb1.k {
    @Override // gb1.k
    public com.tencent.mm.plugin.appbrand.jsapi.t Q(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.t) {
            return (com.tencent.mm.plugin.appbrand.jsapi.t) lVar;
        }
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.e9)) {
            return null;
        }
        boolean z17 = false;
        if (jSONObject != null && jSONObject.optInt("dest", 0) == 3) {
            z17 = true;
        }
        return z17 ? ((com.tencent.mm.plugin.appbrand.e9) lVar).Y0() : ((com.tencent.mm.plugin.appbrand.e9) lVar).V0();
    }
}
