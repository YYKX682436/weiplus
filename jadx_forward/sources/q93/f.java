package q93;

/* loaded from: classes7.dex */
public class f implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q93.g f442450a;

    public f(q93.g gVar) {
        this.f442450a = gVar;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        q93.g gVar = this.f442450a;
        if (gVar.f442454c.containsKey(java.lang.Integer.valueOf(str))) {
            gVar.getClass();
            int intValue = java.lang.Integer.valueOf(str).intValue();
            jd.c cVar = (jd.c) gVar.f442454c.get(java.lang.Integer.valueOf(intValue));
            java.util.HashMap hashMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
            hashMap.put("err_msg", str2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiWebViewService", e17, "", new java.lang.Object[0]);
            }
            if (!str2.contains("fail") && !str2.contains("error")) {
                jSONObject.put("result", true);
                jSONObject.put("errMsg", "");
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(hashMap));
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(cVar.f380558b, cVar.f380557a, cVar.f380559c, cVar.f380560d, intValue, jSONObject.toString(), false, cVar.f380562f);
                gVar.f442454c.remove(java.lang.Integer.valueOf(str));
            }
            jSONObject.put("result", false);
            jSONObject.put("errMsg", str2);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(cVar.f380558b, cVar.f380557a, cVar.f380559c, cVar.f380560d, intValue, jSONObject.toString(), false, cVar.f380562f);
            gVar.f442454c.remove(java.lang.Integer.valueOf(str));
        }
    }
}
