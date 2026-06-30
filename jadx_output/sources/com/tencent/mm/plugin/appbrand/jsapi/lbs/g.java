package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public final class g implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.h f81413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81415c;

    public g(com.tencent.mm.plugin.appbrand.jsapi.lbs.h hVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81413a = hVar;
        this.f81414b = e9Var;
        this.f81415c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.h hVar = this.f81413a;
        if (i17 != hVar.f81417g) {
            return false;
        }
        int i19 = this.f81415c;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81414b;
        if (i18 != -1) {
            if (i18 != 0) {
                e9Var.a(i19, hVar.o("fail"));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChoosePOI", "choose failed");
            } else {
                e9Var.a(i19, hVar.o("fail cancel"));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePOI", "choose canceled");
            }
        } else {
            if (intent == null) {
                e9Var.a(i19, hVar.o("fail:internal error"));
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int intExtra = intent.getIntExtra("get_poi_data_type", 0);
            hashMap.put("type", java.lang.Integer.valueOf(intExtra));
            if (intExtra == 1) {
                java.lang.String stringExtra = intent.getStringExtra("get_city");
                kotlin.jvm.internal.o.d(stringExtra);
                hashMap.put("city", stringExtra);
            } else if (intExtra == 2) {
                java.lang.String stringExtra2 = intent.getStringExtra("get_poi_name");
                kotlin.jvm.internal.o.d(stringExtra2);
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, stringExtra2);
                java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
                kotlin.jvm.internal.o.d(stringExtra3);
                hashMap.put("address", stringExtra3);
                hashMap.put("latitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lat", -1.0f)));
                hashMap.put("longitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lng", -1.0f)));
            }
            e9Var.a(i19, hVar.p("ok", hashMap));
        }
        return true;
    }
}
