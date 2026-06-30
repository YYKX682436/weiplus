package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class oe extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 65;
    public static final java.lang.String NAME = "systemLog";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f82466g = new java.lang.ThreadLocal();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l service, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        if (optString == null || optString.length() == 0) {
            return;
        }
        try {
            java.lang.ThreadLocal threadLocal = f82466g;
            java.lang.String str = (java.lang.String) threadLocal.get();
            if (str == null) {
                str = C(service);
                threadLocal.set(str);
            }
            vz5.v.a(new java.io.StringReader(optString), new com.tencent.mm.plugin.appbrand.jsapi.ne(str));
            service.a(i17, o("ok"));
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSystemLog", "oom");
        }
    }

    public final java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        java.lang.String str;
        if (lVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Service{appId:");
            com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
            sb6.append(e9Var.getAppId());
            sb6.append(",id:");
            sb6.append(e9Var.getComponentId());
            sb6.append('}');
            str = sb6.toString();
        } else if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Page{appId:");
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
            sb7.append(v5Var.getAppId());
            sb7.append(",id:");
            sb7.append(v5Var.getComponentId());
            sb7.append('}');
            str = sb7.toString();
        } else {
            str = "";
        }
        return str + " print:";
    }
}
