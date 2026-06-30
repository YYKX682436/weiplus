package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.n5 implements lk1.b {
    private static final int CTRL_INDEX = 341;
    private static final java.lang.String NAME = "onLocationChange";

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f81393i;

    public c(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f81393i = lVar;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.EventOnLocationChange", "errCode:%d, errStr:%s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(7);
        hashMap.put("longitude", java.lang.Double.valueOf(aVar.f318997b));
        hashMap.put("latitude", java.lang.Double.valueOf(aVar.f318996a));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, java.lang.Double.valueOf(aVar.f318999d));
        hashMap.put("accuracy", java.lang.Double.valueOf(aVar.f319000e));
        hashMap.put("altitude", java.lang.Double.valueOf(aVar.f319001f));
        hashMap.put("verticalAccuracy", java.lang.Float.valueOf(0.0f));
        hashMap.put("horizontalAccuracy", java.lang.Double.valueOf(aVar.f319000e));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f319002g)) {
            hashMap.put("buildingId", aVar.f319002g);
            hashMap.put("floorName", aVar.f319003h);
        }
        hashMap.put("provider", aVar.f318998c);
        hashMap.put("indoorLocationType", java.lang.Integer.valueOf(aVar.f319004i));
        hashMap.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, java.lang.Float.valueOf(aVar.f319005j));
        hashMap.put("steps", java.lang.Double.valueOf(aVar.f319006k));
        hashMap.put("type", aVar.f319007l);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        this.f81393i.getAppId();
        synchronized (this) {
            p(this.f81393i);
            r(jSONObject);
            m();
        }
    }
}
