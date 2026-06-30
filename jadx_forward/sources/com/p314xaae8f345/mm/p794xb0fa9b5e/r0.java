package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p794xb0fa9b5e.r0 f149928b;

    /* renamed from: c, reason: collision with root package name */
    public static kk0.b f149929c;

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.HandlerThread f149930d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f149931a;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("IPCThreadPool#WorkerThread");
        f149930d = handlerThread;
        handlerThread.start();
    }

    public r0() {
        new android.os.Handler(f149930d.getLooper());
        if (f149929c == null) {
            f149929c = new com.p314xaae8f345.mm.p794xb0fa9b5e.q0();
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.q0 q0Var = (com.p314xaae8f345.mm.p794xb0fa9b5e.q0) f149929c;
        q0Var.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.o0 o0Var = new com.p314xaae8f345.mm.p794xb0fa9b5e.o0(q0Var, 3, new com.p314xaae8f345.mm.p794xb0fa9b5e.m0(q0Var));
        o0Var.setMaximumPoolSize((int) (3 * 1.5d));
        o0Var.setRejectedExecutionHandler(new com.p314xaae8f345.mm.p794xb0fa9b5e.p0(q0Var));
        this.f149931a = o0Var;
        rk0.c.c("IPC.IPCThreadPool", "initialize IPCInvoker IPCThreadPool(hashCode : %s)", java.lang.Integer.valueOf(hashCode()));
    }

    public static boolean a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (f149928b == null) {
            synchronized (com.p314xaae8f345.mm.p794xb0fa9b5e.r0.class) {
                if (f149928b == null) {
                    f149928b = new com.p314xaae8f345.mm.p794xb0fa9b5e.r0();
                }
            }
        }
        ((com.p314xaae8f345.mm.p794xb0fa9b5e.o0) f149928b.f149931a).execute(runnable);
        return true;
    }
}
