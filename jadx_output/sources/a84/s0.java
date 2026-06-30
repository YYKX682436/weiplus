package a84;

/* loaded from: classes4.dex */
public abstract class s0 implements a84.r0 {
    public abstract void a(org.json.JSONObject jSONObject);

    public abstract void b(org.json.JSONObject jSONObject);

    @Override // a84.r0
    public java.lang.String j() {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            org.json.JSONObject jSONObject2 = null;
            try {
                jSONObject = new org.json.JSONObject();
                a(jSONObject);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            } catch (java.lang.Throwable unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                jSONObject = null;
            }
            if (jSONObject != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    b(jSONObject3);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                    jSONObject2 = jSONObject3;
                } catch (java.lang.Throwable unused2) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                }
                if (jSONObject2 != null) {
                    jSONObject.putOpt("extInfo", jSONObject2);
                }
                java.lang.String jSONObject4 = jSONObject.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                return jSONObject4;
            }
        } catch (java.lang.Throwable unused3) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
        return "";
    }
}
