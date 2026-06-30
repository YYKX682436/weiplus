package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public abstract class l3 {
    public static com.p314xaae8f345.mm.p944x882e457a.f a(com.p314xaae8f345.mm.p944x882e457a.i iVar) {
        if (iVar == null) {
            throw new java.lang.IllegalArgumentException("Cant use NULL cgi instance");
        }
        com.p314xaae8f345.mm.p944x882e457a.f3 f3Var = com.p314xaae8f345.mm.p944x882e457a.z2.f152380b;
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = f3Var == null ? null : ((gm0.n) f3Var).f354793a.f354821b;
        if (r1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            throw new java.lang.IllegalAccessError("Cant call this function in main thread");
        }
        if (r1Var.f152298e.a().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            throw new java.lang.IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        iVar.l().h(new com.p314xaae8f345.mm.p944x882e457a.j3(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            return (com.p314xaae8f345.mm.p944x882e457a.f) atomicReference.get();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SynchronousCgiCall", e17, "semaphore await exp ", new java.lang.Object[0]);
            return null;
        }
    }

    public static com.p314xaae8f345.mm.p944x882e457a.f b(com.p314xaae8f345.mm.p944x882e457a.o oVar, long j17) {
        if (oVar == null) {
            throw new java.lang.IllegalArgumentException("Cant use NULL rr");
        }
        com.p314xaae8f345.mm.p944x882e457a.f3 f3Var = com.p314xaae8f345.mm.p944x882e457a.z2.f152380b;
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = f3Var == null ? null : ((gm0.n) f3Var).f354793a.f354821b;
        if (r1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            throw new java.lang.IllegalAccessError("Cant call this function in main thread");
        }
        if (r1Var.f152298e.a().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            throw new java.lang.IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(oVar, new com.p314xaae8f345.mm.p944x882e457a.h3(atomicReference, countDownLatch), false);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p944x882e457a.i3(atomicReference, countDownLatch), false).c(j17, j17);
        try {
            countDownLatch.await();
            return (com.p314xaae8f345.mm.p944x882e457a.f) atomicReference.get();
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SynchronousCgiCall", e17, "latch await exp ", new java.lang.Object[0]);
            return null;
        }
    }
}
