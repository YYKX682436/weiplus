package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f149910d;

    public n0(com.p314xaae8f345.mm.p794xb0fa9b5e.o0 o0Var, java.lang.Runnable runnable) {
        this.f149910d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p794xb0fa9b5e.r0 r0Var = com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149928b;
            this.f149910d.run();
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
                com.p314xaae8f345.mm.p794xb0fa9b5e.r0 r0Var2 = com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149928b;
                throw th7;
            }
        }
    }
}
