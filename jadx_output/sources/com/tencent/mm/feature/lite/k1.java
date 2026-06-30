package com.tencent.mm.feature.lite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class k1 implements com.tencent.mm.ipcinvoker.j {
    private k1() {
    }

    public final long a(java.lang.String str) {
        long j17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0L;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.d(new com.tencent.mm.feature.lite.j1(this, jSONObject));
            com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
            openExtraData.store = sVar;
            j17 = com.tencent.mm.plugin.lite.LiteAppCenter.genDataUuid();
            com.tencent.mm.plugin.lite.LiteAppCenter.setOpenExtraData(j17, openExtraData);
            return j17;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppFeatureService", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData liteAppFeatureService$OpenLiteAppData = (com.tencent.mm.feature.lite.LiteAppFeatureService$OpenLiteAppData) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "OpenLiteApp in mm process");
        try {
            java.lang.String str = liteAppFeatureService$OpenLiteAppData.f67116d;
            java.lang.String str2 = liteAppFeatureService$OpenLiteAppData.f67117e;
            java.lang.String str3 = liteAppFeatureService$OpenLiteAppData.f67118f;
            java.lang.Boolean bool = liteAppFeatureService$OpenLiteAppData.f67119g;
            java.lang.Boolean bool2 = liteAppFeatureService$OpenLiteAppData.f67120h;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).sj(7, null);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.p.f144149a.d();
            int indexOf = str.indexOf("@");
            java.lang.String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
            com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(substring);
            if (Bj != null && str2 != null && !str2.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, Bj.path);
                bundle.putString("appId", str);
                bundle.putString("signatureKey", Bj.signatureKey);
                if (com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(str2, ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Bj.path, substring, Bj.signatureKey))) {
                    bool = java.lang.Boolean.TRUE;
                    bool2 = bool;
                }
            }
            if (Bj == null) {
                bool2 = java.lang.Boolean.TRUE;
                bool = bool2;
            }
            if (!bool.booleanValue()) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(a(str3)));
            } else if (bool2.booleanValue()) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hj(str, bool2.booleanValue(), false, new com.tencent.mm.feature.lite.i1(this, rVar, str3));
            } else {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hj(str, bool2.booleanValue(), true, null);
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(a(str3)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppFeatureService", e17, "OpenLiteApp exception", new java.lang.Object[0]);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        }
    }
}
