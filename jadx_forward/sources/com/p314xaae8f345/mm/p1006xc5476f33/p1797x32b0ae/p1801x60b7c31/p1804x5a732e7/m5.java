package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/m5;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/k5", "com/tencent/mm/plugin/lite/jsapi/comms/l5", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class m5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            org.json.JSONArray jSONArray = data.getJSONArray("fileList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.Object obj = jSONArray.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.lang.String string = ((org.json.JSONObject) obj).getString("fileId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                arrayList.add(string);
            }
            java.util.Map bj6 = ((d40.t) ((e40.c0) i95.n0.c(e40.c0.class))).bj(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(bj6.size());
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) bj6).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                e40.b0 b0Var = (e40.b0) entry.getValue();
                e40.a0 a0Var = b0Var.f329145a;
                java.lang.Float f17 = b0Var.f329146b;
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l5(a0Var, str2, f17 != null ? java.lang.Integer.valueOf((int) f17.floatValue()) : null, null, 8, null));
            }
            org.json.JSONObject a17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k5(arrayList2).a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiQueryAddFileFavStatus", "callbackResponse = " + a17);
            this.f224975e.f(a17, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiQueryAddFileFavStatus", e17.getMessage() + ": " + jz5.a.b(e17));
            this.f224975e.a();
        }
    }
}
