package com.p314xaae8f345.mm.p788xd6f12a1a;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p788xd6f12a1a.h f149792a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.HCPerfManagerThread f149793b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f149794c = new java.util.concurrent.LinkedBlockingQueue();

    public f(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.HCPerfManagerThread hCPerfManagerThread) {
        com.p314xaae8f345.mm.p788xd6f12a1a.h hVar = new com.p314xaae8f345.mm.p788xd6f12a1a.h();
        this.f149792a = hVar;
        synchronized (hVar) {
            if (hVar.f149802e == null) {
                java.lang.Thread thread = new java.lang.Thread(hVar);
                hVar.f149802e = thread;
                thread.setPriority(5);
                hVar.f149802e.start();
            }
        }
        this.f149793b = hCPerfManagerThread;
        java.lang.Thread mo45809xdd89ebca = hCPerfManagerThread.mo45809xdd89ebca(new com.p314xaae8f345.mm.p788xd6f12a1a.c(this, null), "HCPerfManager", 10);
        mo45809xdd89ebca.start();
        com.p314xaae8f345.mm.p788xd6f12a1a.n.c("Hardcoder.HCPerfManager", java.lang.String.format("HCPerfManager new thread[%s]", mo45809xdd89ebca));
    }

    public static void a(com.p314xaae8f345.mm.p788xd6f12a1a.f fVar, long j17, java.util.List list, int i17, int i18, int i19, int[] iArr) {
        fVar.getClass();
        com.p314xaae8f345.mm.p788xd6f12a1a.g gVar = new com.p314xaae8f345.mm.p788xd6f12a1a.g(j17, new java.util.ArrayList(list), i17, i18, i19, iArr);
        com.p314xaae8f345.mm.p788xd6f12a1a.h hVar = fVar.f149792a;
        if (hVar.f149801d != null) {
            synchronized (hVar) {
                ((java.util.concurrent.ConcurrentLinkedQueue) hVar.f149801d).add(gVar);
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
