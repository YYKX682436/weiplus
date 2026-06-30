package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes.dex */
public abstract class i {
    public static final java.util.List a(org.json.JSONArray jSONArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            if (obj instanceof org.json.JSONObject) {
                arrayList.add(b((org.json.JSONObject) obj));
            } else if (obj instanceof org.json.JSONArray) {
                arrayList.add(a((org.json.JSONArray) obj));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Map b(org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            if (obj instanceof org.json.JSONObject) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                linkedHashMap.put(next, b((org.json.JSONObject) obj));
            } else if (obj instanceof org.json.JSONArray) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                linkedHashMap.put(next, a((org.json.JSONArray) obj));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }
}
