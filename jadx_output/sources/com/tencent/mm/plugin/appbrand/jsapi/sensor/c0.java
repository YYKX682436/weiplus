package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f82992d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f82993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.d0 f82994f;

    public c0(com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var, android.view.ViewTreeObserver viewTreeObserver, com.tencent.mm.plugin.appbrand.jsapi.sensor.d0 d0Var) {
        this.f82993e = viewTreeObserver;
        this.f82994f = d0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f82992d + 1;
        this.f82992d = i17;
        if (i17 < 2) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f82993e;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.tencent.mm.plugin.appbrand.jsapi.sensor.d0 d0Var = this.f82994f;
        if (d0Var.f82996d.getAndSet(true)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var = d0Var.f82998f;
        java.lang.String str = b0Var.f82984b;
        b0Var.c(d0Var.f82997e);
    }
}
