package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wxassistant/w;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class w implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (str = bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class));
        u0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.j1 j1Var = u0Var.f173851e;
        j1Var.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j1Var.f173754g;
        java.util.Collection values = concurrentHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : values) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.e) obj2).f173705b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12575x278fd8e2 != null ? c12575x278fd8e2.f170137d : null, str)) {
                arrayList.add(obj2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "collectDiagnosticInfo: sessionId=" + str + ", matchedCommands=" + arrayList.size() + ", totalRunning=" + concurrentHashMap.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.e) it.next();
            eVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = eVar.f173707d;
            long j18 = j17 > 0 ? currentTimeMillis - j17 : 0L;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e22 = eVar.f173705b;
            if (c12575x278fd8e22 == null || (str5 = c12575x278fd8e22.f170137d) == null || (str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class))).Ni(str5)) == null) {
                str2 = "";
            }
            jSONObject.put("appId", str2);
            jSONObject.put(ya.b.f77491x8758c4e1, "notSupport");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e23 = eVar.f173705b;
            if (c12575x278fd8e23 == null || (str3 = c12575x278fd8e23.f170138e) == null) {
                str3 = "";
            }
            jSONObject.put("cmdId", str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e24 = eVar.f173705b;
            if (c12575x278fd8e24 == null || (str4 = c12575x278fd8e24.f170139f) == null) {
                str4 = "";
            }
            jSONObject.put("taskId", str4);
            jSONObject.put("state", eVar.f173708e.f173713d);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("startTimeStamp", eVar.f173707d);
            jSONObject2.put("elapsedMs", j18);
            jSONObject.put("timing", jSONObject2);
            jSONObject.put("detail", "");
            arrayList2.add(jSONObject);
        }
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList2).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("result", jSONArray);
        return bundle2;
    }
}
