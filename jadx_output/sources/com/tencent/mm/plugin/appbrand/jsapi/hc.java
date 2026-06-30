package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class hc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 66;
    public static final java.lang.String NAME = "reportSubmitForm";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) lVar;
        com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask reportSubmitFormTask = new com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask(n7Var.getRuntime().E0());
        reportSubmitFormTask.f79849f = 1;
        reportSubmitFormTask.f79851h = com.tencent.mm.sdk.platformtools.w2.a(u46.l.j(new java.lang.String[]{n7Var.getAppId(), kk.v.a(n7Var.getRuntime().u0().f47279x0), "" + java.lang.System.currentTimeMillis()}, '#'));
        reportSubmitFormTask.f79852i = n7Var.Y1();
        reportSubmitFormTask.d();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("formId", reportSubmitFormTask.f79851h);
        com.tencent.mm.plugin.appbrand.m6 a17 = com.tencent.mm.plugin.appbrand.m6.a(n7Var.getAppId());
        if (a17 != null) {
            a17.f85708a = reportSubmitFormTask.f79851h;
        }
        n7Var.a(i17, p("ok", hashMap));
    }
}
