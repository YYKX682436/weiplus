package jd;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f380557a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f380558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f380559c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f380560d;

    /* renamed from: e, reason: collision with root package name */
    public final long f380561e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f380562f;

    /* renamed from: g, reason: collision with root package name */
    public final int f380563g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f380564h;

    public c(long j17, java.lang.String str, long j18, java.lang.String str2, long j19, int i17, boolean z17) {
        this.f380557a = j17;
        this.f380558b = str;
        this.f380559c = j18;
        this.f380560d = str2;
        this.f380561e = j19;
        this.f380563g = i17;
        this.f380562f = z17;
    }

    public void a() {
        if (this.f380561e < 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", false);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject());
            jSONObject.put("errMsg", "");
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(this.f380558b, this.f380557a, this.f380559c, this.f380560d, this.f380561e, jSONObject.toString(), false, this.f380562f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37144x164d47d.remove(java.lang.Integer.valueOf(this.f380563g));
    }

    public void b(java.lang.String str) {
        c(str, null, false);
    }

    public void c(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (this.f380561e < 0) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("result", false);
            if (jSONObject != null) {
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject);
            } else {
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject());
            }
            if (str != null) {
                jSONObject2.put("errMsg", str);
            } else {
                jSONObject2.put("errMsg", "");
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(this.f380558b, this.f380557a, this.f380559c, this.f380560d, this.f380561e, jSONObject2.toString(), z17, this.f380562f);
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37144x164d47d.remove(java.lang.Integer.valueOf(this.f380563g));
    }

    public void d() {
        if (this.f380561e < 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", true);
            jSONObject.put("errMsg", "");
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject());
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(this.f380558b, this.f380557a, this.f380559c, this.f380560d, this.f380561e, jSONObject.toString(), false, this.f380562f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37144x164d47d.remove(java.lang.Integer.valueOf(this.f380563g));
    }

    public void e(java.util.Map map) {
        if (this.f380561e < 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", true);
            jSONObject.put("errMsg", "");
            if (map != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
            } else {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject());
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(this.f380558b, this.f380557a, this.f380559c, this.f380560d, this.f380561e, jSONObject.toString(), false, this.f380562f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37144x164d47d.remove(java.lang.Integer.valueOf(this.f380563g));
    }

    public void f(org.json.JSONObject jSONObject, boolean z17) {
        if (this.f380561e < 0) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("result", true);
            jSONObject2.put("errMsg", "");
            if (jSONObject != null) {
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject);
            } else {
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject());
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(this.f380558b, this.f380557a, this.f380559c, this.f380560d, this.f380561e, jSONObject2.toString(), z17, this.f380562f);
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37144x164d47d.remove(java.lang.Integer.valueOf(this.f380563g));
    }
}
