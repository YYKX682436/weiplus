package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class jy extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jy f216437d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jy();

    public jy() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject appendExtraInfo = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendExtraInfo, "$this$appendExtraInfo");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206783a) {
            jSONObject = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206786d;
            if (jSONObject == null) {
                java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206784b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206785c.get((java.lang.String) it.next());
                    if (jSONObject2 != null) {
                        arrayList.add(jSONObject2);
                    }
                }
                jSONObject = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q4.a(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206786d = jSONObject;
                jSONObject.toString();
            }
        }
        appendExtraInfo.put("client_page_udf_kv", jSONObject);
        return jz5.f0.f384359a;
    }
}
