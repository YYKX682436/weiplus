package xc2;

/* loaded from: classes2.dex */
public final class a3 extends xc2.b1 {
    @Override // xc2.j
    public org.json.JSONObject n(xc2.p0 infoEx) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = infoEx.f534767a.m76506x42318aa0();
            if (m76506x42318aa0 == null || (str = m76506x42318aa0.m77225xe7ed3fec()) == null) {
                str = "";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.Object obj = null;
            try {
                boolean z17 = true;
                if (!jSONObject2.has("topic_id")) {
                    z17 = false;
                }
                if (z17) {
                    obj = jSONObject2.getString("topic_id");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            if (obj == null) {
                obj = 0L;
            }
            jSONObject.put("music_profile_id", obj);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // xc2.j
    public java.lang.String o() {
        return "link_music_profile";
    }
}
