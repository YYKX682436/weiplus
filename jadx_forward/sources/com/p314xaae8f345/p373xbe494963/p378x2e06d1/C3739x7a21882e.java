package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "base::android")
/* renamed from: com.tencent.liteav.base.JavaExceptionReporter */
/* loaded from: classes12.dex */
public class C3739x7a21882e implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f14602x7118e671 = false;

    /* renamed from: mCrashAfterReport */
    private final boolean f14603xadab8296;

    /* renamed from: mHandlingException */
    private boolean f14604x8bca07fd;

    /* renamed from: mParent */
    private final java.lang.Thread.UncaughtExceptionHandler f14605x14172f77;

    private C3739x7a21882e(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z17) {
        this.f14605x14172f77 = uncaughtExceptionHandler;
        this.f14603xadab8296 = z17;
    }

    /* renamed from: installHandler */
    private static void m29252x88e8552f(boolean z17) {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3739x7a21882e(java.lang.Thread.getDefaultUncaughtExceptionHandler(), z17));
    }

    /* renamed from: reportStackTrace */
    public static void m29253xf6b2d3f1(java.lang.String str) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (!this.f14604x8bca07fd) {
            this.f14604x8bca07fd = true;
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14605x14172f77;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th6);
        }
    }
}
