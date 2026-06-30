package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class x6 extends ik1.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f171861d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f171862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 f171863f;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 z6Var, android.content.Context context) {
        this.f171863f = z6Var;
        this.f171862e = context;
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this.f171862e != activity || this.f171861d.getAndSet(true)) {
            return;
        }
        ((android.app.Application) this.f171863f.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        ku5.u0 u0Var = ku5.t0.f394148d;
        final android.content.Context context = this.f171862e;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.x6$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 z6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x6.this.f171863f;
                android.content.Context baseContext = z6Var.getBaseContext();
                android.content.Context context2 = context;
                if (context2 == baseContext) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimePersistentContextWrapper", "onActivityPostDestroyed auto release ref to %s", context2);
                    super/*android.content.MutableContextWrapper*/.setBaseContext(z6Var.f171899b);
                }
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 0L, false);
    }
}
