package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class s implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.liteapp.r f81556d = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.r();

    private s() {
    }

    public final long a(java.lang.String str) {
        long j17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0L;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.d(new com.tencent.mm.plugin.appbrand.jsapi.liteapp.q(this, jSONObject));
            com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
            openExtraData.store = sVar;
            j17 = com.tencent.mm.plugin.lite.LiteAppCenter.genDataUuid();
            com.tencent.mm.plugin.lite.LiteAppCenter.setOpenExtraData(j17, openExtraData);
            return j17;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenLiteApp", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    public final boolean b(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int min = java.lang.Math.min(split.length, split2.length);
        for (int i17 = 0; i17 < min; i17++) {
            if (!split[i17].equals(split2[i17])) {
                if (split[i17].length() > split2[i17].length()) {
                    return true;
                }
                return split[i17].length() >= split2[i17].length() && split[i17].compareTo(split2[i17]) > 0;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData jsApiOpenLiteApp$OpenLiteAppData = (com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData) obj;
        try {
            java.lang.String str = jsApiOpenLiteApp$OpenLiteAppData.f81520d;
            java.lang.String str2 = jsApiOpenLiteApp$OpenLiteAppData.f81521e;
            java.lang.String str3 = jsApiOpenLiteApp$OpenLiteAppData.f81522f;
            java.lang.String str4 = jsApiOpenLiteApp$OpenLiteAppData.f81523g;
            java.lang.Boolean bool = jsApiOpenLiteApp$OpenLiteAppData.f81524h;
            java.lang.Boolean bool2 = jsApiOpenLiteApp$OpenLiteAppData.f81525i;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).sj(7, null);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.p.f144149a.d();
            int indexOf = str.indexOf("@game");
            java.lang.String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
            if (jsApiOpenLiteApp$OpenLiteAppData.f81526m.booleanValue()) {
                com.tencent.mm.plugin.appbrand.jsapi.liteapp.o oVar = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.o(this);
                com.tencent.mm.plugin.appbrand.jsapi.liteapp.r rVar2 = f81556d;
                rVar2.f81553a = str4;
                rVar2.f81554b = oVar;
                com.tencent.mm.sdk.event.IListener iListener = rVar2.f81555c;
                iListener.dead();
                iListener.alive();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "add app data callback. waAppId: %s", str4);
                ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(str4, oVar);
            }
            com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(substring);
            if (Bj != null && str2 != null && !str2.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, Bj.path);
                bundle.putString("appId", str);
                bundle.putString("signatureKey", Bj.signatureKey);
                if (b(str2, ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Bj.path, substring, Bj.signatureKey))) {
                    bool = java.lang.Boolean.TRUE;
                    bool2 = bool;
                }
            }
            if (Bj == null) {
                bool = java.lang.Boolean.TRUE;
                bool2 = bool;
            }
            if (!bool.booleanValue()) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(a(str3)));
            } else if (bool2.booleanValue()) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hj(str, bool2.booleanValue(), false, new com.tencent.mm.plugin.appbrand.jsapi.liteapp.p(this, rVar, str3));
            } else {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hj(str, bool2.booleanValue(), true, null);
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(a(str3)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenLiteApp", e17, "OpenLiteApp exception", new java.lang.Object[0]);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        }
    }
}
