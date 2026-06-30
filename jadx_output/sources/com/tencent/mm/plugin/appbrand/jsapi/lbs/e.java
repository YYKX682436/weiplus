package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes.dex */
public class e implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.f f81408c;

    public e(com.tencent.mm.plugin.appbrand.jsapi.lbs.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81408c = fVar;
        this.f81406a = e9Var;
        this.f81407b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.f fVar = this.f81408c;
        if (i17 != fVar.f81410g) {
            return false;
        }
        int i19 = this.f81407b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81406a;
        if (i18 == -1) {
            if (intent == null) {
                e9Var.a(i19, fVar.o("fail"));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
                return true;
            }
            com.tencent.mm.modelgeo.Addr addr = (com.tencent.mm.modelgeo.Addr) intent.getParcelableExtra("key_pick_addr");
            java.lang.String stringExtra = intent.getStringExtra("kPoiid");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (addr != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseLocation", "addr: " + addr.toString());
                hashMap.put("address", addr.a());
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, addr.c());
                hashMap.put("latitude", java.lang.Float.valueOf(addr.f71224t));
                hashMap.put("longitude", java.lang.Float.valueOf(addr.f71225u));
                hashMap.put("poiid", stringExtra);
                hashMap.get("address");
                hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                e9Var.a(i19, fVar.p("ok", hashMap));
            } else {
                e9Var.a(i19, fVar.o("fail"));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
            }
        } else if (i18 == 0) {
            e9Var.a(i19, fVar.o("fail:cancel"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseLocation", "location result is cancel!");
        } else {
            e9Var.a(i19, fVar.o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseLocation", "location result is fail!");
        }
        return true;
    }
}
