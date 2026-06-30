package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes.dex */
public abstract class q4 {
    public static final org.json.JSONObject a(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) it.next();
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderStackObjectReporter", "mergeJsonObjects: current result:" + jSONObject, e17);
        }
        return jSONObject;
    }
}
