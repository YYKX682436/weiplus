package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class w1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f166847a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f166848b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f166849c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f166850d = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f166851e = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public void a() {
        this.f166848b.set(true);
        while (true) {
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f166850d;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        if (this.f166848b.get()) {
            km5.e eVar = function instanceof km5.e ? (km5.e) function : null;
            if (eVar != null) {
                eVar.a(null);
                return;
            }
            return;
        }
        if (this.f166849c.getAndSet(true)) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f166851e.readLock();
            readLock.lock();
            try {
                if (this.f166847a != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f166847a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC11702x4ae7c33);
                    function.mo146xb9724478(interfaceC11702x4ae7c33);
                } else {
                    this.f166850d.addLast(function);
                }
                return;
            } finally {
                readLock.unlock();
            }
        }
        this.f166850d.addLast(function);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "startTask instance(" + hashCode() + ") callbacks.size=" + this.f166850d.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a;
        if (interfaceC11702x4ae7c332 == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u1(v1Var, this, android.os.SystemClock.elapsedRealtime()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "task(" + hashCode() + ") getLoadedReader != NULL");
        v1Var.mo146xb9724478(interfaceC11702x4ae7c332);
    }
}
