package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class d0 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f81401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.e0 f81403h;

    public d0(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0 e0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, boolean z17, int i17) {
        this.f81403h = e0Var;
        this.f81399d = lVar;
        this.f81400e = str;
        this.f81401f = z17;
        this.f81402g = i17;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLocation", "errCode:%d, errStr:%s, location:%s", java.lang.Integer.valueOf(i17), str, aVar);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.e0 e0Var = this.f81403h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81399d;
        e0Var.E(lVar, i17, str, aVar);
        int i18 = this.f81402g;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            lVar.a(i18, e0Var.p("fail:" + str, hashMap));
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(4);
        hashMap2.put("type", this.f81400e);
        hashMap2.put("latitude", java.lang.Double.valueOf(aVar.f318996a));
        hashMap2.put("longitude", java.lang.Double.valueOf(aVar.f318997b));
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, java.lang.Double.valueOf(aVar.f318999d));
        hashMap2.put("accuracy", java.lang.Double.valueOf(aVar.f319000e));
        if (this.f81401f) {
            hashMap2.put("altitude", java.lang.Double.valueOf(aVar.f319001f));
        }
        hashMap2.put("provider", aVar.f318998c);
        hashMap2.put("verticalAccuracy", 0);
        hashMap2.put("horizontalAccuracy", java.lang.Double.valueOf(aVar.f319000e));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f319002g)) {
            hashMap2.put("buildingId", aVar.f319002g);
            hashMap2.put("floorName", aVar.f319003h);
        }
        hashMap2.put("indoorLocationType", java.lang.Integer.valueOf(aVar.f319004i));
        hashMap2.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, java.lang.Float.valueOf(aVar.f319005j));
        hashMap2.put("steps", java.lang.Double.valueOf(aVar.f319006k));
        lVar.a(i18, e0Var.p("ok", hashMap2));
    }
}
