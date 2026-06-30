package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class ja implements gb1.k {
    @Override // gb1.k
    public com.tencent.mm.plugin.appbrand.jsapi.t Q(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            if (jSONObject != null && jSONObject.optInt("dest", 0) == 2) {
                return ((com.tencent.mm.plugin.appbrand.page.v5) lVar).V1();
            }
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.t) {
            return (com.tencent.mm.plugin.appbrand.jsapi.t) lVar;
        }
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.e9)) {
            return null;
        }
        if (jSONObject != null && jSONObject.optInt("dest", 0) == 3) {
            return ((com.tencent.mm.plugin.appbrand.service.c0) lVar).Y0();
        }
        return jSONObject != null && jSONObject.optInt("dest", 0) == 1 ? ((com.tencent.mm.plugin.appbrand.service.c0) lVar).T1() : ((com.tencent.mm.plugin.appbrand.service.c0) lVar).V0();
    }
}
