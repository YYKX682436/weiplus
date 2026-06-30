package z43;

/* loaded from: classes.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Ai)) {
            this.f224976f.d(false);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = Ai.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff c13236xb15ab0ff = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff) it.next();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("appid", c13236xb15ab0ff.f178760d);
                jSONObject3.put("status", c13236xb15ab0ff.f178762f);
                jSONObject3.put("download_id", c13236xb15ab0ff.f178761e);
                jSONObject3.put("progress", c13236xb15ab0ff.f178763g);
                jSONObject3.put("progress_float", c13236xb15ab0ff.f178765i);
                if (c13236xb15ab0ff.f178764h) {
                    jSONObject3.put("reserve_for_wifi", 1);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject3);
        }
        try {
            jSONObject2.put("result", jSONArray.toString());
        } catch (org.json.JSONException unused2) {
        }
        this.f224976f.c(jSONObject2, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
