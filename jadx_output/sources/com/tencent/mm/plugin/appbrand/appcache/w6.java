package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes12.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f76021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.y4 f76022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f76023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ScheduledExecutorService f76024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f76025h;

    public w6(int i17, java.util.concurrent.atomic.AtomicInteger atomicInteger, com.tencent.mm.plugin.appbrand.utils.y4 y4Var, java.util.List list, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f76021d = atomicInteger;
        this.f76022e = y4Var;
        this.f76023f = list;
        this.f76024g = scheduledExecutorService;
        this.f76025h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        long random = (long) (java.lang.Math.random() * 5000);
        synchronized (this.f76021d) {
            int andIncrement = this.f76021d.getAndIncrement();
            this.f76022e.f("Thread Task:" + andIncrement + " delay:" + random, new com.tencent.mm.plugin.appbrand.appcache.v6(this, andIncrement, random));
        }
    }
}
