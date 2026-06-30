package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes12.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f157554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4 f157555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ScheduledExecutorService f157557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f157558h;

    public w6(int i17, java.util.concurrent.atomic.AtomicInteger atomicInteger, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4 y4Var, java.util.List list, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f157554d = atomicInteger;
        this.f157555e = y4Var;
        this.f157556f = list;
        this.f157557g = scheduledExecutorService;
        this.f157558h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        long random = (long) (java.lang.Math.random() * 5000);
        synchronized (this.f157554d) {
            int andIncrement = this.f157554d.getAndIncrement();
            this.f157555e.f("Thread Task:" + andIncrement + " delay:" + random, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v6(this, andIncrement, random));
        }
    }
}
