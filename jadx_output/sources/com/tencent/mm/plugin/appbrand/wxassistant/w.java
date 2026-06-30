package com.tencent.mm.plugin.appbrand.wxassistant;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wxassistant/w;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class w implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (str = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class));
        u0Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var = u0Var.f92318e;
        j1Var.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j1Var.f92221g;
        java.util.Collection values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : values) {
            com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams = ((com.tencent.mm.plugin.appbrand.wxassistant.cdp.e) obj2).f92172b;
            if (kotlin.jvm.internal.o.b(cdpCommandParams != null ? cdpCommandParams.f88604d : null, str)) {
                arrayList.add(obj2);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "collectDiagnosticInfo: sessionId=" + str + ", matchedCommands=" + arrayList.size() + ", totalRunning=" + concurrentHashMap.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.wxassistant.cdp.e eVar = (com.tencent.mm.plugin.appbrand.wxassistant.cdp.e) it.next();
            eVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = eVar.f92174d;
            long j18 = j17 > 0 ? currentTimeMillis - j17 : 0L;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams2 = eVar.f92172b;
            if (cdpCommandParams2 == null || (str5 = cdpCommandParams2.f88604d) == null || (str2 = ((com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class))).Ni(str5)) == null) {
                str2 = "";
            }
            jSONObject.put("appId", str2);
            jSONObject.put(ya.b.METHOD, "notSupport");
            com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams3 = eVar.f92172b;
            if (cdpCommandParams3 == null || (str3 = cdpCommandParams3.f88605e) == null) {
                str3 = "";
            }
            jSONObject.put("cmdId", str3);
            com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams4 = eVar.f92172b;
            if (cdpCommandParams4 == null || (str4 = cdpCommandParams4.f88606f) == null) {
                str4 = "";
            }
            jSONObject.put("taskId", str4);
            jSONObject.put("state", eVar.f92175e.f92180d);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("startTimeStamp", eVar.f92174d);
            jSONObject2.put("elapsedMs", j18);
            jSONObject.put("timing", jSONObject2);
            jSONObject.put("detail", "");
            arrayList2.add(jSONObject);
        }
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList2).toString();
        kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("result", jSONArray);
        return bundle2;
    }
}
