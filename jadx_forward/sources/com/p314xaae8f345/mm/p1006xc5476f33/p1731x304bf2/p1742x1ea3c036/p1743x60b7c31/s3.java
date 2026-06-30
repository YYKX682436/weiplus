package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class s3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "reportGamePageTime";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String optString = jSONObject.optString("reportId");
        boolean z17 = jSONObject.optInt("reportInstantly", 0) == 1;
        boolean z18 = jSONObject.optInt("reportTimeBegin", 0) == 1;
        java.lang.String optString2 = jSONObject.optString("reportFormatData");
        java.lang.String optString3 = jSONObject.optString("reportTabsFormatData");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportGamePageTime", "reportId is null or nil");
            bVar.c("invalid_reportId", null);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportGamePageTime", "reportFormatData && reportTabsFormatData is null or nil");
            bVar.c("invalid_reportFormatData_reportTabsFormatData", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportGamePageTime", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", optString, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), optString2, optString3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("game_page_report_id", optString);
        bundle.putBoolean("game_page_report_instantly", z17);
        bundle.putBoolean("game_page_report_time_begin", z18);
        bundle.putString("game_page_report_format_data", optString2);
        bundle.putString("game_page_report_tabs_format_data", optString3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).L1.f495199f.c(bundle);
        bVar.a();
    }
}
