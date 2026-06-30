package ch1;

/* loaded from: classes15.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String appId, long j17, long j18, long j19, long j27, java.lang.String reportData) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(reportData, "reportData");
        com.tencent.mm.autogen.mmdata.rpt.MiniGameNativePageBehavStatStruct miniGameNativePageBehavStatStruct = new com.tencent.mm.autogen.mmdata.rpt.MiniGameNativePageBehavStatStruct();
        miniGameNativePageBehavStatStruct.f59218d = miniGameNativePageBehavStatStruct.b("AppId", appId, true);
        miniGameNativePageBehavStatStruct.f59219e = j17;
        miniGameNativePageBehavStatStruct.f59220f = j18;
        miniGameNativePageBehavStatStruct.f59221g = 101L;
        miniGameNativePageBehavStatStruct.f59222h = 101100L;
        miniGameNativePageBehavStatStruct.f59223i = 1L;
        miniGameNativePageBehavStatStruct.f59224j = j19;
        miniGameNativePageBehavStatStruct.f59225k = j27;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("report_data", reportData);
        miniGameNativePageBehavStatStruct.f59227m = miniGameNativePageBehavStatStruct.b("ExternInfo", java.net.URLEncoder.encode(jSONObject.toString()), true);
        miniGameNativePageBehavStatStruct.k();
    }
}
