package pb;

/* loaded from: classes7.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 a(java.lang.String json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        org.json.JSONObject jSONObject = new org.json.JSONObject(json);
        double d17 = jSONObject.getDouble("startTime");
        java.lang.String str = "endTime";
        double d18 = jSONObject.getDouble("endTime");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("frameList");
        int length = jSONArray.length();
        int i17 = 0;
        while (i17 < length) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
            java.lang.String name = jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            org.json.JSONArray jSONArray2 = jSONArray;
            java.lang.String category = jSONObject2.getString("category");
            double d19 = jSONObject2.getDouble("startTime");
            double d27 = jSONObject2.getDouble(str);
            java.lang.String thread = jSONObject2.getString("thread");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(category, "category");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thread, "thread");
            arrayList.add(new com.p302x1ea3c036.p304x697f145.C2844x40fb94d(name, category, d19, d27, thread));
            i17++;
            jSONArray = jSONArray2;
            str = str;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("eventList");
        int i18 = 0;
        for (int length2 = jSONArray3.length(); i18 < length2; length2 = length2) {
            org.json.JSONObject jSONObject3 = jSONArray3.getJSONObject(i18);
            java.lang.String name2 = jSONObject3.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            org.json.JSONArray jSONArray4 = jSONArray3;
            java.lang.String category2 = jSONObject3.getString("category");
            double d28 = jSONObject3.getDouble("startTime");
            java.lang.String thread2 = jSONObject3.getString("thread");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(category2, "category");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thread2, "thread");
            arrayList2.add(new com.p302x1ea3c036.p304x697f145.C2843x403827a(name2, category2, d28, thread2));
            i18++;
            jSONArray3 = jSONArray4;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        org.json.JSONArray jSONArray5 = jSONObject.getJSONArray("screenShotInfoList");
        int length3 = jSONArray5.length();
        int i19 = 0;
        while (i19 < length3) {
            org.json.JSONObject jSONObject4 = jSONArray5.getJSONObject(i19);
            java.lang.String data = jSONObject4.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            java.util.ArrayList arrayList4 = arrayList;
            double d29 = jSONObject4.getDouble("startTime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
            arrayList3.add(new com.p302x1ea3c036.p304x697f145.C2848xa8c46b74(data, d29));
            i19++;
            arrayList = arrayList4;
            arrayList2 = arrayList2;
        }
        java.util.ArrayList arrayList5 = arrayList;
        java.util.ArrayList arrayList6 = arrayList2;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        org.json.JSONArray jSONArray6 = jSONObject.getJSONArray("memoryUsagesList");
        int length4 = jSONArray6.length();
        for (int i27 = 0; i27 < length4; i27++) {
            org.json.JSONObject jSONObject5 = jSONArray6.getJSONObject(i27);
            arrayList7.add(new com.p302x1ea3c036.p304x697f145.C2845x3640af73(jSONObject5.getLong("jsHeapSizeUsed"), jSONObject5.getLong("allUsed"), jSONObject5.getDouble("startTime")));
        }
        return new com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7(d17, d18, arrayList5, arrayList6, arrayList3, arrayList7);
    }
}
