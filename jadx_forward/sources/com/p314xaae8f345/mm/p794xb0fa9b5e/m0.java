package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class m0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public int f149905d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.q0 f149906e;

    public m0(com.p314xaae8f345.mm.p794xb0fa9b5e.q0 q0Var) {
        this.f149906e = q0Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IPCThreadPool#Thread-");
        int i17 = this.f149905d;
        this.f149905d = i17 + 1;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.Thread thread = new java.lang.Thread(new com.p314xaae8f345.mm.p794xb0fa9b5e.l0(this, runnable), sb7);
        rk0.c.c("IPC.ExecutorServiceCreatorImpl", "newThread(thread : %s)", sb7);
        return thread;
    }
}
