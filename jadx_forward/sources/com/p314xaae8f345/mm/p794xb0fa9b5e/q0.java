package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class q0 implements kk0.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f149927a;

    public q0() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("IPCThreadPool#InnerWorkerThread-" + hashCode());
        handlerThread.start();
        rk0.c.c("IPC.ExecutorServiceCreatorImpl", "createHandlerThread(hash : %d)", java.lang.Integer.valueOf(handlerThread.hashCode()));
        this.f149927a = handlerThread;
    }
}
