package o93;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: e, reason: collision with root package name */
    public static o93.i f425262e;

    /* renamed from: a, reason: collision with root package name */
    public final o93.a f425263a = new o93.a();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f425264b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final o93.h f425265c = new o93.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f425266d;

    public i() {
        java.lang.String str;
        java.util.HashSet hashSet = new java.util.HashSet(128);
        this.f425266d = hashSet;
        ((yb1.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.i) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.i.class))).getClass();
        str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f34026x24728b;
        hashSet.add(str);
    }

    public static o93.i b() {
        if (f425262e == null) {
            synchronized (o93.i.class) {
                f425262e = new o93.i();
            }
        }
        return f425262e;
    }

    public void a(int i17, java.lang.String str) {
        java.util.HashMap hashMap = this.f425264b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaLiteApp.LiteAppJsApiService", "[-] callbackJsApi: can not find callback with id: %s. data: %s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        jd.c cVar = (jd.c) hashMap.get(java.lang.Integer.valueOf(i17));
        java.lang.String str2 = cVar.f380560d;
        if (str2.equals(yc1.s.f77530x24728b) || str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34919x24728b) || str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4.f34474x24728b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(cVar.f380558b, cVar.f380557a, cVar.f380559c, cVar.f380560d, i17, str, false, cVar.f380562f);
        } else {
            java.lang.String str3 = "";
            boolean z17 = false;
            if (((java.util.HashSet) this.f425266d).contains(cVar.f380560d)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    if (jSONObject.getInt("errno") == 0) {
                        cVar.f(jSONObject, false);
                    } else {
                        cVar.c(jSONObject.has("errMsg") ? jSONObject.getString("errMsg") : "", jSONObject, false);
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WxaLiteApp.LiteAppJsApiService", th6, "[-] Fail to parse json data: %s", str);
                }
            }
            if (!z17) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("result", true);
                    jSONObject2.put("errMsg", "");
                    if (str != null) {
                        str3 = str;
                    }
                    jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(str3));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaLiteApp.LiteAppJsApiService", "exception " + e17.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(cVar.f380558b, cVar.f380557a, cVar.f380559c, cVar.f380560d, i17, jSONObject2.toString(), false, cVar.f380562f);
            }
        }
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }
}
