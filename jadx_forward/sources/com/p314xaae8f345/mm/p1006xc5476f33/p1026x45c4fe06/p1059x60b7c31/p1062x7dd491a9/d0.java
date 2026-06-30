package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes.dex */
class d0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private d0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Ai)) {
            rVar.a(null);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = Ai.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff c13236xb15ab0ff = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("appId", c13236xb15ab0ff.f178760d);
                jSONObject.put("status", c13236xb15ab0ff.f178762f);
                jSONObject.put("downloadId", c13236xb15ab0ff.f178761e);
                jSONObject.put("progress", c13236xb15ab0ff.f178763g);
                jSONObject.put("progressFloat", c13236xb15ab0ff.f178765i);
                if (c13236xb15ab0ff.f178764h) {
                    jSONObject.put("reserveForWifi", 1);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONArray.toString()));
    }
}
