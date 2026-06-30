package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8Locker */
/* loaded from: classes7.dex */
public class C1476xfffd285a {

    /* renamed from: runtime */
    private com.p159x477cd522.p160x333422.V8 f4803x5c71cfd8;

    /* renamed from: thread */
    private java.lang.Thread f4804xcbe10e0a = null;

    /* renamed from: released */
    private boolean f4802xdf23d93d = false;

    public C1476xfffd285a(com.p159x477cd522.p160x333422.V8 v86) {
        this.f4803x5c71cfd8 = v86;
        m16430xba9b60d6();
    }

    /* renamed from: acquire */
    public synchronized void m16430xba9b60d6() {
        java.lang.Thread thread = this.f4804xcbe10e0a;
        if (thread != null && thread != java.lang.Thread.currentThread()) {
            throw new java.lang.Error("Invalid V8 thread access: current thread is " + java.lang.Thread.currentThread() + " while the locker has thread " + this.f4804xcbe10e0a);
        }
        if (this.f4804xcbe10e0a == java.lang.Thread.currentThread()) {
            return;
        }
        com.p159x477cd522.p160x333422.V8 v86 = this.f4803x5c71cfd8;
        v86.m16102x49d73f21(v86.m16218xd618fe8e());
        this.f4804xcbe10e0a = java.lang.Thread.currentThread();
        this.f4802xdf23d93d = false;
    }

    /* renamed from: checkThread */
    public void m16431x2edbf932() {
        if (this.f4802xdf23d93d && this.f4804xcbe10e0a == null) {
            throw new java.lang.Error("Invalid V8 thread access: the locker has been released!");
        }
        if (this.f4804xcbe10e0a == java.lang.Thread.currentThread()) {
            return;
        }
        throw new java.lang.Error("Invalid V8 thread access: current thread is " + java.lang.Thread.currentThread() + " while the locker has thread " + this.f4804xcbe10e0a);
    }

    /* renamed from: getThread */
    public java.lang.Thread m16432x30f83100() {
        return this.f4804xcbe10e0a;
    }

    /* renamed from: hasLock */
    public boolean m16433x2986eee5() {
        return this.f4804xcbe10e0a == java.lang.Thread.currentThread();
    }

    /* renamed from: release */
    public synchronized void m16434x41012807() {
        if ((this.f4802xdf23d93d && this.f4804xcbe10e0a == null) || this.f4803x5c71cfd8.mo16335xafdb8087()) {
            return;
        }
        m16431x2edbf932();
        com.p159x477cd522.p160x333422.V8 v86 = this.f4803x5c71cfd8;
        v86.m16257xcb405d2(v86.m16218xd618fe8e());
        this.f4804xcbe10e0a = null;
        this.f4802xdf23d93d = true;
    }

    /* renamed from: tryAcquire */
    public synchronized boolean m16435xef02de9b() {
        java.lang.Thread thread = this.f4804xcbe10e0a;
        if (thread != null && thread != java.lang.Thread.currentThread()) {
            return false;
        }
        if (this.f4804xcbe10e0a == java.lang.Thread.currentThread()) {
            return true;
        }
        com.p159x477cd522.p160x333422.V8 v86 = this.f4803x5c71cfd8;
        v86.m16102x49d73f21(v86.m16218xd618fe8e());
        this.f4804xcbe10e0a = java.lang.Thread.currentThread();
        this.f4802xdf23d93d = false;
        return true;
    }
}
