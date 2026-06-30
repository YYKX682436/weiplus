package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes12.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f5 f242557a = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f5();

    public final org.json.JSONObject a(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] c4720x9bbc2403Arr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("count", c4720x9bbc2403Arr.length);
            jSONObject.put("detail", jSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList(c4720x9bbc2403Arr.length);
            for (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 : c4720x9bbc2403Arr) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d = c4720x9bbc2403.f134630e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4722x6f76cf9d);
                    jSONObject2.put("process", c4722x6f76cf9d.f134642e);
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d2 = c4720x9bbc2403.f134630e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4722x6f76cf9d2);
                    jSONObject2.put("pid", c4722x6f76cf9d2.f134641d);
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e c4723x52a73b7e = c4720x9bbc2403.f134635m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4723x52a73b7e);
                    jSONObject2.put("amsPss", c4723x52a73b7e.a());
                } catch (java.lang.Throwable th6) {
                    oj.j.d("MicroMsg.SettingsAboutMMHeaderReporter", th6, "", new java.lang.Object[0]);
                }
                arrayList.add(jSONObject2);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) it.next());
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d("MicroMsg.SettingsAboutMMHeaderReporter", th7, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }
}
