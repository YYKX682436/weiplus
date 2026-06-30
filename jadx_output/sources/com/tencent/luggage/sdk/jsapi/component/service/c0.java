package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.d0 f47390d;

    public c0(com.tencent.luggage.sdk.jsapi.component.service.d0 d0Var) {
        this.f47390d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.jsapi.component.service.d0 d0Var = this.f47390d;
        d0Var.f47394d.f47362f.f47398a.notifySuspend();
        com.tencent.luggage.sdk.jsapi.component.service.t0 t0Var = d0Var.f47394d.f47368o;
        if (t0Var != null) {
            iz5.a.e(0, java.lang.Long.valueOf(t0Var.f47535a));
            t0Var.f47539e.cancelAllRequests(t0Var.f47535a);
        }
    }
}
