package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n f47529d;

    public s(com.tencent.luggage.sdk.jsapi.component.service.n nVar) {
        this.f47529d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.h1 a17 = com.tencent.mm.plugin.appbrand.debugger.h1.a();
        com.tencent.luggage.sdk.jsapi.component.service.n nVar = this.f47529d;
        nVar.D = a17.b((com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F());
        com.tencent.luggage.sdk.jsapi.component.service.n1 n1Var = nVar.E;
        if (n1Var != null) {
            n1Var.f47501a = nVar.D;
        }
        nVar.y0(nVar.D);
    }
}
