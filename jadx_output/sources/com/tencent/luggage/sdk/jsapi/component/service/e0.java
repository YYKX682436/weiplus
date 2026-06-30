package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f47400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f47401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a0 f47402f;

    public e0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var, long j17, java.lang.Class cls) {
        this.f47402f = a0Var;
        this.f47400d = j17;
        this.f47401e = cls;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = this.f47402f.f47362f.f47398a;
        if (appBrandCommonBindingJni != null) {
            appBrandCommonBindingJni.notifyPostRuntimeReady(this.f47400d, this.f47401e);
        }
    }
}
