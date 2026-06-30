package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class x6 extends ik1.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f90328d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f90329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.z6 f90330f;

    public x6(com.tencent.mm.plugin.appbrand.ui.z6 z6Var, android.content.Context context) {
        this.f90330f = z6Var;
        this.f90329e = context;
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this.f90329e != activity || this.f90328d.getAndSet(true)) {
            return;
        }
        ((android.app.Application) this.f90330f.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        ku5.u0 u0Var = ku5.t0.f312615d;
        final android.content.Context context = this.f90329e;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.x6$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.ui.z6 z6Var = com.tencent.mm.plugin.appbrand.ui.x6.this.f90330f;
                android.content.Context baseContext = z6Var.getBaseContext();
                android.content.Context context2 = context;
                if (context2 == baseContext) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimePersistentContextWrapper", "onActivityPostDestroyed auto release ref to %s", context2);
                    super/*android.content.MutableContextWrapper*/.setBaseContext(z6Var.f90366b);
                }
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 0L, false);
    }
}
