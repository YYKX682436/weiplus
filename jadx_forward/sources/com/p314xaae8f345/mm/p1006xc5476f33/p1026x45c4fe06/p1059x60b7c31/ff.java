package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class ff {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f162545a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162546b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f162547c;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f162548d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162549e;

    public ff(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l invokeEnv, org.json.JSONObject data, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeEnv, "invokeEnv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f162545a = c0Var;
        this.f162546b = invokeEnv;
        this.f162547c = data;
        this.f162548d = jSONObject;
        this.f162549e = i17;
    }

    /* renamed from: equals */
    public boolean m50940xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162545a, ffVar.f162545a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162546b, ffVar.f162546b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162547c, ffVar.f162547c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162548d, ffVar.f162548d) && this.f162549e == ffVar.f162549e;
    }

    /* renamed from: hashCode */
    public int m50941x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var = this.f162545a;
        int hashCode = (((((c0Var == null ? 0 : c0Var.hashCode()) * 31) + this.f162546b.hashCode()) * 31) + this.f162547c.hashCode()) * 31;
        org.json.JSONObject jSONObject = this.f162548d;
        return ((hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f162549e);
    }

    /* renamed from: toString */
    public java.lang.String m50942x9616526c() {
        return "JsInvokeContext(jsRuntime=" + this.f162545a + ", invokeEnv=" + this.f162546b + ", data=" + this.f162547c + ", privateData=" + this.f162548d + ", callbackId=" + this.f162549e + ')';
    }
}
