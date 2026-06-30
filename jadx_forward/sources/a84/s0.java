package a84;

/* loaded from: classes4.dex */
public abstract class s0 implements a84.r0 {
    public abstract void a(org.json.JSONObject jSONObject);

    public abstract void b(org.json.JSONObject jSONObject);

    @Override // a84.r0
    public java.lang.String j() {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            org.json.JSONObject jSONObject2 = null;
            try {
                jSONObject = new org.json.JSONObject();
                a(jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                jSONObject = null;
            }
            if (jSONObject != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    b(jSONObject3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                    jSONObject2 = jSONObject3;
                } catch (java.lang.Throwable unused2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                }
                if (jSONObject2 != null) {
                    jSONObject.putOpt("extInfo", jSONObject2);
                }
                java.lang.String jSONObject4 = jSONObject.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                return jSONObject4;
            }
        } catch (java.lang.Throwable unused3) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
        return "";
    }
}
