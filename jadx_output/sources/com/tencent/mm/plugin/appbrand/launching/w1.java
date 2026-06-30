package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class w1 implements com.tencent.mm.plugin.appbrand.launching.t1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f85314a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f85315b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f85316c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f85317d = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f85318e = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public void a() {
        this.f85315b.set(true);
        while (true) {
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f85317d;
            if (concurrentLinkedDeque.isEmpty()) {
                return;
            }
            java.lang.Object poll = concurrentLinkedDeque.poll();
            km5.e eVar = poll instanceof km5.e ? (km5.e) poll : null;
            if (eVar != null) {
                eVar.a(null);
            }
        }
    }

    public final void b(yz5.l function) {
        kotlin.jvm.internal.o.g(function, "function");
        if (this.f85315b.get()) {
            km5.e eVar = function instanceof km5.e ? (km5.e) function : null;
            if (eVar != null) {
                eVar.a(null);
                return;
            }
            return;
        }
        if (this.f85316c.getAndSet(true)) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f85318e.readLock();
            readLock.lock();
            try {
                if (this.f85314a != null) {
                    com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f85314a;
                    kotlin.jvm.internal.o.d(iCommLibReader);
                    function.invoke(iCommLibReader);
                } else {
                    this.f85317d.addLast(function);
                }
                return;
            } finally {
                readLock.unlock();
            }
        }
        this.f85317d.addLast(function);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "startTask instance(" + hashCode() + ") callbacks.size=" + this.f85317d.size());
        com.tencent.mm.plugin.appbrand.launching.v1 v1Var = new com.tencent.mm.plugin.appbrand.launching.v1(this);
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = com.tencent.mm.plugin.appbrand.appcache.e8.f75515a;
        if (iCommLibReader2 == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            pm0.v.K(null, new com.tencent.mm.plugin.appbrand.launching.u1(v1Var, this, android.os.SystemClock.elapsedRealtime()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "task(" + hashCode() + ") getLoadedReader != NULL");
        v1Var.invoke(iCommLibReader2);
    }
}
