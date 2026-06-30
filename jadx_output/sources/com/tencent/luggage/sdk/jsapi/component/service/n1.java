package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.g1 f47501a;

    public n1(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
    }

    @android.webkit.JavascriptInterface
    public void sendCustomMessage(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f47501a;
        if (g1Var != null) {
            com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = g1Var.f77754h;
            n1Var.getClass();
            r45.j47 j47Var = new r45.j47();
            j47Var.f377581d = str;
            j47Var.f377582e = str2;
            n1Var.g(com.tencent.mm.plugin.appbrand.debugger.y1.e(j47Var, n1Var.f77806b, "customMessage"));
        }
    }

    @android.webkit.JavascriptInterface
    public void sendMessage(java.lang.String str, java.lang.String str2) {
    }
}
