package b64;

/* loaded from: classes4.dex */
public class u extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        java.lang.String str2;
        int optInt;
        int optInt2;
        int optInt3;
        java.lang.String optString2;
        java.lang.String optString3;
        int optInt4;
        int optInt5;
        java.lang.String optString4;
        boolean optBoolean;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        try {
            optString = jSONObject.optString("canvasId");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str2 = "";
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString5 = jSONObject.optString("uxInfo");
            if (optString5 != null) {
                str2 = optString5;
            }
            optInt = jSONObject.optInt("preLoad", 0);
            optInt2 = jSONObject.optInt("noStore", 0);
            optInt3 = jSONObject.optInt("openFirstSightVoice", 0);
            optString2 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
            optString3 = jSONObject.optString("adInfoXml");
            optInt4 = jSONObject.optInt("fromOuterIndex");
            optInt5 = jSONObject.optInt(ya.b.SOURCE, 31);
            optString4 = jSONObject.optString("canvasDynamicInfo");
            optBoolean = jSONObject.optBoolean("halfPage", false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenAdCanvas", th6, "open ad canvas", new java.lang.Object[0]);
        }
        if (this.f143443f == null) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenAdCanvas", "the invokeCallback is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenAdCanvas", "data not has key canvasId");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1706, 26);
            this.f143443f.a("canvasId is null or nil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1706, 27);
        if (!android.text.TextUtils.isEmpty(str2)) {
            ca4.m0.B(str2);
        } else if (!android.text.TextUtils.isEmpty(optString3)) {
            str2 = ca4.m0.Q(optString3);
        }
        java.lang.String str3 = str2;
        boolean z19 = true;
        if (optInt == 1) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenAdCanvas", "do preload");
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).Ai(com.tencent.mm.sdk.platformtools.t8.E1(optString), str3, optString4, false, false);
        } else {
            java.lang.Object c17 = c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenAdCanvas", "the context is null ");
                this.f143443f.a("the context is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
                return;
            }
            p94.v0 v0Var = new p94.v0();
            v0Var.f352913a = optBoolean;
            if (c17 instanceof m54.x) {
                boolean optBoolean2 = jSONObject.optBoolean("openInHalfScreen", false);
                m54.l u47 = ((m54.x) c17).u4();
                if (u47 != null) {
                    v0Var.f352913a = u47.s() && optBoolean2;
                    v0Var.f352914b = u47.s();
                    v0Var.f352916d = u47.r();
                }
            }
            v0Var.f352919g = optString4;
            v0Var.f352917e = optInt5;
            if (optInt3 != 1) {
                z19 = false;
            }
            v0Var.f352920h = z19;
            v0Var.f352918f = optString2;
            v0Var.f352921i = optInt2;
            v0Var.f352922j = optInt4;
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).wi(c(), com.tencent.mm.sdk.platformtools.t8.E1(optString), str3, v0Var);
        }
        this.f143443f.d(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runModel", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runModel", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        return 1;
    }
}
