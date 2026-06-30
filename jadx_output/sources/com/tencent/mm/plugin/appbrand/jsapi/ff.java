package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class ff {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.c0 f81012a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f81013b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f81014c;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f81015d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81016e;

    public ff(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.l invokeEnv, org.json.JSONObject data, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(invokeEnv, "invokeEnv");
        kotlin.jvm.internal.o.g(data, "data");
        this.f81012a = c0Var;
        this.f81013b = invokeEnv;
        this.f81014c = data;
        this.f81015d = jSONObject;
        this.f81016e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.ff)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.ff ffVar = (com.tencent.mm.plugin.appbrand.jsapi.ff) obj;
        return kotlin.jvm.internal.o.b(this.f81012a, ffVar.f81012a) && kotlin.jvm.internal.o.b(this.f81013b, ffVar.f81013b) && kotlin.jvm.internal.o.b(this.f81014c, ffVar.f81014c) && kotlin.jvm.internal.o.b(this.f81015d, ffVar.f81015d) && this.f81016e == ffVar.f81016e;
    }

    public int hashCode() {
        com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var = this.f81012a;
        int hashCode = (((((c0Var == null ? 0 : c0Var.hashCode()) * 31) + this.f81013b.hashCode()) * 31) + this.f81014c.hashCode()) * 31;
        org.json.JSONObject jSONObject = this.f81015d;
        return ((hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f81016e);
    }

    public java.lang.String toString() {
        return "JsInvokeContext(jsRuntime=" + this.f81012a + ", invokeEnv=" + this.f81013b + ", data=" + this.f81014c + ", privateData=" + this.f81015d + ", callbackId=" + this.f81016e + ')';
    }
}
