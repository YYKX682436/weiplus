package p93;

/* loaded from: classes7.dex */
public class c implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p93.d f434423a;

    public c(p93.d dVar) {
        this.f434423a = dVar;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        p93.d dVar = this.f434423a;
        if (dVar.f434427c.containsKey(java.lang.Integer.valueOf(str))) {
            dVar.getClass();
            int parseInt = java.lang.Integer.parseInt(str);
            jd.c cVar = (jd.c) dVar.f434427c.get(java.lang.Integer.valueOf(parseInt));
            if (cVar != null) {
                java.util.HashMap hashMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
                hashMap.put("err_msg", str2);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    if (str2.contains("fail")) {
                        jSONObject.put("result", false);
                        jSONObject.put("errMsg", str2);
                    } else {
                        jSONObject.put("result", true);
                        jSONObject.put("errMsg", "");
                    }
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(hashMap));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiBridgeLuggageService", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(cVar.f380558b, cVar.f380557a, cVar.f380559c, cVar.f380560d, parseInt, jSONObject.toString(), false, true);
            }
            dVar.f434427c.remove(java.lang.Integer.valueOf(str));
        }
    }
}
