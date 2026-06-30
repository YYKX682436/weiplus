package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q f225243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q qVar, java.util.List list) {
        super(2);
        this.f225243d = qVar;
        this.f225244e = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.lang.Object obj3;
        java.util.Map batchDownloadStatus = (java.util.Map) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batchDownloadStatus, "batchDownloadStatus");
        if (booleanValue) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : batchDownloadStatus.entrySet()) {
                if (((e40.b0) entry.getValue()).f329145a == e40.a0.f329140m) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q qVar = this.f225243d;
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                e40.b0 b0Var = (e40.b0) entry2.getValue();
                java.util.Iterator it = this.f225244e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o) obj3).f225227a, str)) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o) obj3;
                if (oVar != null) {
                    java.lang.String str2 = oVar.f225231e;
                    java.lang.String str3 = oVar.f225227a;
                    java.lang.String str4 = oVar.f225229c;
                    java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str4);
                    com.p314xaae8f345.mm.vfs.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q.f225253g;
                    qVar.A(str2, str3, str4, null, n17);
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
            java.lang.String str5 = (java.lang.String) entry3.getKey();
            e40.b0 b0Var2 = (e40.b0) entry3.getValue();
            e40.a0 a0Var3 = b0Var2.f329145a;
            java.lang.Float f17 = b0Var2.f329146b;
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m(a0Var3, str5, f17 != null ? java.lang.Integer.valueOf((int) f17.floatValue()) : null, null, 8, null));
        }
        org.json.JSONObject a17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l(arrayList, z18).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiAddFileToFavorites", "callbackResponse = " + a17);
        this.f225243d.f224975e.f(a17, booleanValue ^ true);
        return jz5.f0.f384359a;
    }
}
