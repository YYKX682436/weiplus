package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f82996d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.f4 f82997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 f82998f;

    public d0(com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var, com.tencent.mm.plugin.appbrand.utils.f4 f4Var) {
        this.f82998f = b0Var;
        this.f82997e = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f82996d.getAndSet(true)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var = this.f82998f;
        java.lang.String str = b0Var.f82984b;
        b0Var.c(this.f82997e);
    }
}
