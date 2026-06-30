package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class d7 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f77568b;

    public d7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f77568b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "GameWaitForFirstViewLayout";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f77568b;
        com.tencent.mm.plugin.appbrand.widget.q qVar = o6Var.f74810s;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(qVar) && n3.x0.c(o6Var.f74810s)) {
            d();
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        o6Var.K("%s start waiting", "GameWaitForFirstViewLayout");
        final u65.a aVar = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.d7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.d7.this.d();
            }
        });
        o6Var.f74810s.addOnLayoutChangeListener(new com.tencent.mm.plugin.appbrand.e7(this, aVar, elapsedRealtime));
        o6Var.f74810s.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.d7$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.d7 d7Var = com.tencent.mm.plugin.appbrand.d7.this;
                d7Var.getClass();
                if (aVar.b()) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    d7Var.f77568b.K("ContentView attached, %s complete cost %dms", "GameWaitForFirstViewLayout", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public boolean e() {
        return false;
    }
}
