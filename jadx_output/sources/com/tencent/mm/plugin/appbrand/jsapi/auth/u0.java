package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class u0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.v0 f79745a;

    public u0(com.tencent.mm.plugin.appbrand.jsapi.auth.v0 v0Var) {
        this.f79745a = v0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.b0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.v0 v0Var = this.f79745a;
        v0Var.f79758a.C = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" userHeadIconPath=");
        java.lang.String str2 = v0Var.f79758a.C;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", sb6.toString());
        v0Var.f79758a.c();
    }
}
