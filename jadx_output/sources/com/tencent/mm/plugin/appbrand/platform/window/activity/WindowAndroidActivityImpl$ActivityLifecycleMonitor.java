package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class WindowAndroidActivityImpl$ActivityLifecycleMonitor implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.platform.window.activity.r0 f87571d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f87572e;

    public WindowAndroidActivityImpl$ActivityLifecycleMonitor(com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var) {
        this.f87571d = r0Var;
    }

    public void a(android.content.Context context) {
        android.app.Activity activity = this.f87572e;
        if (activity != null) {
            ((androidx.appcompat.app.AppCompatActivity) activity).mo133getLifecycle().c(this);
        }
        android.app.Activity a17 = q75.a.a(context);
        this.f87572e = a17;
        if (a17 != null) {
            ((androidx.appcompat.app.AppCompatActivity) a17).mo133getLifecycle().a(this);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onPause() {
        this.f87571d.f87653o = true;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onResume() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.f87571d;
        r0Var.f87652n = false;
        r0Var.f87653o = false;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    public void onStart() {
        this.f87571d.f87652n = false;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public void onStop() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.f87571d;
        r0Var.f87652n = true;
        r0Var.f87653o = true;
    }
}
