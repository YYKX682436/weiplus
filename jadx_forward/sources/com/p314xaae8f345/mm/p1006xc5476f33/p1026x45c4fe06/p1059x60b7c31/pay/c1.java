package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/c1;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "start handle IPCGetContactInfoTask");
        java.lang.String[] stringArray = data.getStringArray("hashItemList");
        if (stringArray == null) {
            return new android.os.Bundle();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : stringArray) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 wi6 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).wi(str, 2);
            if (wi6 != null && ((int) wi6.E2) > 0) {
                java.lang.String w07 = wi6.w0();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
                    w07 = wi6.f2();
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                linkedHashMap.put("userHash", str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w07);
                linkedHashMap.put("nickname", w07);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(wi6.d1());
                if (n07 != null) {
                    java.lang.String d17 = n07.d();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getSmallUrl(...)");
                    linkedHashMap.put("headUrl", d17);
                } else {
                    linkedHashMap.put("headUrl", "");
                }
                java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                arrayList.add(jSONObject);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (arrayList.size() <= 0) {
            return bundle;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestContactDisplayInfo", "IPCGetContactInfoTask end get data succ");
        bundle.putStringArray("retInfoList", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        return bundle;
    }
}
