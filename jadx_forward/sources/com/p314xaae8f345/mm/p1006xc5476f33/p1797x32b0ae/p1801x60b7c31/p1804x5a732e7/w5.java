package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class w5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y5 f225353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y5 y5Var, java.util.List list) {
        super(2);
        this.f225353d = y5Var;
        this.f225354e = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.lang.Object obj3;
        java.util.Map batchDownloadStatus = (java.util.Map) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batchDownloadStatus, "batchDownloadStatus");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y5 y5Var = this.f225353d;
        if (booleanValue) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : batchDownloadStatus.entrySet()) {
                if (((e40.b0) entry.getValue()).f329145a == e40.a0.f329140m) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                e40.b0 b0Var = (e40.b0) entry2.getValue();
                java.util.Iterator it = this.f225354e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v5) obj3).f225341a, str)) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v5) obj3;
                if (v5Var != null) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y5.f225368g;
                    y5Var.B(v5Var.f225346f, v5Var.f225345e, v5Var.f225343c);
                }
                e40.a0 a0Var = e40.a0.f329141n;
                b0Var.getClass();
                b0Var.f329145a = a0Var;
            }
        }
        java.util.Collection values = batchDownloadStatus.values();
        if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
            java.util.Iterator it6 = values.iterator();
            while (it6.hasNext()) {
                e40.a0 a0Var2 = ((e40.b0) it6.next()).f329145a;
                if (!(a0Var2 == e40.a0.f329138h || a0Var2 == e40.a0.f329139i)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        boolean z18 = z17 ? false : booleanValue;
        java.util.ArrayList arrayList = new java.util.ArrayList(batchDownloadStatus.size());
        for (java.util.Map.Entry entry3 : batchDownloadStatus.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry3.getKey();
            e40.b0 b0Var2 = (e40.b0) entry3.getValue();
            e40.a0 a0Var3 = b0Var2.f329145a;
            java.lang.Float f17 = b0Var2.f329146b;
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r5(a0Var3, str2, f17 != null ? java.lang.Integer.valueOf((int) f17.floatValue()) : null, null, 8, null));
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            jSONArray.put(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r5) it7.next()).a());
        }
        jSONObject.put("fileList", jSONArray);
        jSONObject.put("complete", z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiSaveFile", "callbackResponse = " + jSONObject);
        y5Var.f224975e.f(jSONObject, booleanValue ^ true);
        return jz5.f0.f384359a;
    }
}
