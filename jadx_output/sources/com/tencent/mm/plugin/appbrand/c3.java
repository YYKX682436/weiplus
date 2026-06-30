package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.d3 f77028d;

    public c3(com.tencent.mm.plugin.appbrand.d3 d3Var) {
        this.f77028d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f77028d.f77563f;
        if (appBrandRuntime.V) {
            appBrandRuntime.x0().setActuallyVisible(true);
        } else {
            appBrandRuntime.N.a(new com.tencent.mm.plugin.appbrand.b3(this));
        }
    }
}
