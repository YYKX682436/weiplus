package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class j3 {
    public j3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem) {
        java.lang.String str;
        int P;
        r45.ze2 m76960xed29dd2b;
        java.lang.String m75945x2fec8307;
        r45.n03 m76979x75347379;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderItem.getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 == null || (m76979x75347379 = m76802x2dd01666.m76979x75347379()) == null || (str = m76979x75347379.m75945x2fec8307(0)) == null) {
            str = "";
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "finder", null);
        if (d17 == null || (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".finder.valuecount"), -1)) < 0) {
            return "[]";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < P; i17++) {
            java.lang.String str2 = (java.lang.String) d17.get(".finder.value" + i17 + ".topic");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("topic", str2);
                    jSONObject.put("type", 1);
                    jSONObject.put("count", 0);
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = finderItem.getFeedObject().m76802x2dd01666();
        if (m76802x2dd016662 != null && (m76960xed29dd2b = m76802x2dd016662.m76960xed29dd2b()) != null && (m75945x2fec8307 = m76960xed29dd2b.m75945x2fec8307(2)) != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("topic", m75945x2fec8307);
                jSONObject2.put("type", 2);
                jSONObject2.put("count", 0);
                jSONArray.put(jSONObject2);
            } catch (java.lang.Exception unused2) {
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }
}
