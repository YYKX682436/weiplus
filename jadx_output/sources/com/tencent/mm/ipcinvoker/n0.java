package com.tencent.mm.ipcinvoker;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f68377d;

    public n0(com.tencent.mm.ipcinvoker.o0 o0Var, java.lang.Runnable runnable) {
        this.f68377d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.ipcinvoker.r0 r0Var = com.tencent.mm.ipcinvoker.r0.f68395b;
            this.f68377d.run();
        } catch (java.lang.Throwable th6) {
            try {
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = java.lang.Thread.currentThread().getUncaughtExceptionHandler();
                if (uncaughtExceptionHandler == null) {
                    uncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th6);
                }
                throw th6;
            } catch (java.lang.Throwable th7) {
                com.tencent.mm.ipcinvoker.r0 r0Var2 = com.tencent.mm.ipcinvoker.r0.f68395b;
                throw th7;
            }
        }
    }
}
