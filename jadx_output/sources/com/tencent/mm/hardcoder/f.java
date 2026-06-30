package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.hardcoder.h f68259a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread f68260b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f68261c = new java.util.concurrent.LinkedBlockingQueue();

    public f(com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread hCPerfManagerThread) {
        com.tencent.mm.hardcoder.h hVar = new com.tencent.mm.hardcoder.h();
        this.f68259a = hVar;
        synchronized (hVar) {
            if (hVar.f68269e == null) {
                java.lang.Thread thread = new java.lang.Thread(hVar);
                hVar.f68269e = thread;
                thread.setPriority(5);
                hVar.f68269e.start();
            }
        }
        this.f68260b = hCPerfManagerThread;
        java.lang.Thread newThread = hCPerfManagerThread.newThread(new com.tencent.mm.hardcoder.c(this, null), "HCPerfManager", 10);
        newThread.start();
        com.tencent.mm.hardcoder.n.c("Hardcoder.HCPerfManager", java.lang.String.format("HCPerfManager new thread[%s]", newThread));
    }

    public static void a(com.tencent.mm.hardcoder.f fVar, long j17, java.util.List list, int i17, int i18, int i19, int[] iArr) {
        fVar.getClass();
        com.tencent.mm.hardcoder.g gVar = new com.tencent.mm.hardcoder.g(j17, new java.util.ArrayList(list), i17, i18, i19, iArr);
        com.tencent.mm.hardcoder.h hVar = fVar.f68259a;
        if (hVar.f68268d != null) {
            synchronized (hVar) {
                ((java.util.concurrent.ConcurrentLinkedQueue) hVar.f68268d).add(gVar);
                hVar.notify();
            }
        }
    }

    public static void b(java.lang.String str) {
        if (str != null) {
            throw new java.lang.AssertionError(str);
        }
        throw new java.lang.AssertionError();
    }
}
