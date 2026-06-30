package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class d7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159101b;

    public d7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f159101b = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public java.lang.String b() {
        return "GameWaitForFirstViewLayout";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159101b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = o6Var.f156343s;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(qVar) && n3.x0.c(o6Var.f156343s)) {
            d();
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        o6Var.K("%s start waiting", "GameWaitForFirstViewLayout");
        final u65.a aVar = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.d7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d7.this.d();
            }
        });
        o6Var.f156343s.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e7(this, aVar, elapsedRealtime));
        o6Var.f156343s.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.d7$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d7 d7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d7.this;
                d7Var.getClass();
                if (aVar.b()) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    d7Var.f159101b.K("ContentView attached, %s complete cost %dms", "GameWaitForFirstViewLayout", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public boolean e() {
        return false;
    }
}
