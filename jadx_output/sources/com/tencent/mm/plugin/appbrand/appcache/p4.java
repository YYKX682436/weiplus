package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class p4 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.r4 f75718d;

    public p4(com.tencent.mm.plugin.appbrand.appcache.r4 r4Var) {
        this.f75718d = r4Var;
    }

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "stateConcurrentFetchAndIncremental enter");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        for (int i17 = 0; i17 < 3; i17++) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            t0Var.t(new com.tencent.mm.plugin.appbrand.appcache.o4(this, atomicInteger, 3), i17 * 50, null);
        }
    }
}
