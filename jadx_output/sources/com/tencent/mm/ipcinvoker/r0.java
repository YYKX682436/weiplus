package com.tencent.mm.ipcinvoker;

/* loaded from: classes12.dex */
public class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.ipcinvoker.r0 f68395b;

    /* renamed from: c, reason: collision with root package name */
    public static kk0.b f68396c;

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.HandlerThread f68397d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f68398a;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("IPCThreadPool#WorkerThread");
        f68397d = handlerThread;
        handlerThread.start();
    }

    public r0() {
        new android.os.Handler(f68397d.getLooper());
        if (f68396c == null) {
            f68396c = new com.tencent.mm.ipcinvoker.q0();
        }
        com.tencent.mm.ipcinvoker.q0 q0Var = (com.tencent.mm.ipcinvoker.q0) f68396c;
        q0Var.getClass();
        com.tencent.mm.ipcinvoker.o0 o0Var = new com.tencent.mm.ipcinvoker.o0(q0Var, 3, new com.tencent.mm.ipcinvoker.m0(q0Var));
        o0Var.setMaximumPoolSize((int) (3 * 1.5d));
        o0Var.setRejectedExecutionHandler(new com.tencent.mm.ipcinvoker.p0(q0Var));
        this.f68398a = o0Var;
        rk0.c.c("IPC.IPCThreadPool", "initialize IPCInvoker IPCThreadPool(hashCode : %s)", java.lang.Integer.valueOf(hashCode()));
    }

    public static boolean a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (f68395b == null) {
            synchronized (com.tencent.mm.ipcinvoker.r0.class) {
                if (f68395b == null) {
                    f68395b = new com.tencent.mm.ipcinvoker.r0();
                }
            }
        }
        ((com.tencent.mm.ipcinvoker.o0) f68395b.f68398a).execute(runnable);
        return true;
    }
}
