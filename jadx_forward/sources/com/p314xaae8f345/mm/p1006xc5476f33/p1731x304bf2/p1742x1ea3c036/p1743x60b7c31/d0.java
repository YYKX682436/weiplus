package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getDownloadWidgetTaskInfos";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Ai)) {
            q5Var.a(null, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = Ai.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff c13236xb15ab0ff = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff) it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("appid", c13236xb15ab0ff.f178760d);
                jSONObject2.put("status", c13236xb15ab0ff.f178762f);
                jSONObject2.put("download_id", c13236xb15ab0ff.f178761e);
                jSONObject2.put("progress", c13236xb15ab0ff.f178763g);
                jSONObject2.put("progress_float", c13236xb15ab0ff.f178765i);
                if (c13236xb15ab0ff.f178764h) {
                    jSONObject2.put("reserve_for_wifi", 1);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("result", jSONArray.toString());
        } catch (org.json.JSONException unused2) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
