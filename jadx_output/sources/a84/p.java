package a84;

/* loaded from: classes4.dex */
public abstract class p {
    public static final boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        org.json.JSONObject optJSONObject;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAdTextClickableByTemplate", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        org.json.JSONArray jSONArray = null;
        org.json.JSONObject c17 = s74.x2.f404589a.c((snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adDynamicInfo);
        if (c17 != null && (optJSONObject = c17.optJSONObject("ad-template-extra-info")) != null) {
            jSONArray = optJSONObject.optJSONArray("ad-normal-clickable-areas");
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if (jSONArray != null) {
            c75.c.d(jSONArray, new a84.o(c0Var));
        }
        com.tencent.mars.xlog.Log.i("AdExprUtil", "enableAdTextClickableByTemplate " + c0Var.f310112d);
        boolean z17 = c0Var.f310112d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdTextClickableByTemplate", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        return z17;
    }

    public static final boolean b(int i17, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        java.lang.Integer h17;
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableExpr", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        if (aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableExpr", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        java.lang.String str = null;
        if (valueOf != null) {
            valueOf.intValue();
            com.tencent.mars.xlog.Log.i("AdExprUtil", "try get expId = " + valueOf);
            org.json.JSONObject jSONObject = aDInfo.adExpParams;
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("exp_para")) != null) {
                int i18 = 0;
                while (true) {
                    if (!(i18 < optJSONArray.length())) {
                        break;
                    }
                    java.lang.Object obj = optJSONArray.get(i18);
                    i18++;
                    if (obj instanceof org.json.JSONObject) {
                        org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                        if (kotlin.jvm.internal.o.b("" + valueOf, jSONObject2.optString("exp_id"))) {
                            str = jSONObject2.optString("exp_value");
                            com.tencent.mars.xlog.Log.i("AdExprUtil", "expId = " + valueOf + "  value = " + str);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
                            break;
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        }
        boolean z17 = ((str == null || (h17 = r26.h0.h(str)) == null) ? 0 : h17.intValue()) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableExpr", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        return z17;
    }

    public static final boolean c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAdEndCover", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.w("AdExprUtil", "the sns info is null, there is no end cover.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdEndCover", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
            return false;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            s74.x2 x2Var = s74.x2.f404589a;
            com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
            org.json.JSONObject c17 = x2Var.c(adXml != null ? adXml.adDynamicInfo : null);
            org.json.JSONObject optJSONObject = c17 != null ? c17.optJSONObject("ad-template-extra-info") : null;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(optJSONObject != null ? optJSONObject.optBoolean("ad-has-end-cover") : false));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.tencent.mars.xlog.Log.i("AdExprUtil", "the ad-has-end-cover node value is " + booleanValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdEndCover", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        return booleanValue;
    }
}
