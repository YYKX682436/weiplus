package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.JavaExceptionReporter */
/* loaded from: classes13.dex */
public class C29313x7a21882e implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73299x7118e671 = false;

    /* renamed from: mCrashAfterReport */
    private final boolean f73300xadab8296;

    /* renamed from: mHandlingException */
    private boolean f73301x8bca07fd;

    /* renamed from: mParent */
    private final java.lang.Thread.UncaughtExceptionHandler f73302x14172f77;

    /* renamed from: org.chromium.base.JavaExceptionReporter$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: reportJavaException */
        void mo152447x75627b79(boolean z17, java.lang.Throwable th6);

        /* renamed from: reportJavaStackTrace */
        void mo152448xfe094db3(java.lang.String str);
    }

    private C29313x7a21882e(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z17) {
        this.f73302x14172f77 = uncaughtExceptionHandler;
        this.f73300xadab8296 = z17;
    }

    /* renamed from: installHandler */
    private static void m152444x88e8552f(boolean z17) {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new org.p3343x72743996.p3344x2e06d1.C29313x7a21882e(java.lang.Thread.getDefaultUncaughtExceptionHandler(), z17));
    }

    /* renamed from: reportException */
    public static void m152445x9e70357b(java.lang.Throwable th6) {
        org.p3343x72743996.p3344x2e06d1.C29314x84278497.get().mo152447x75627b79(false, th6);
    }

    /* renamed from: reportStackTrace */
    public static void m152446xf6b2d3f1(java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.C29314x84278497.get().mo152448xfe094db3(org.p3343x72743996.p3344x2e06d1.C29331x1f0df1bf.m152594x2c0d5906(str));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (!this.f73301x8bca07fd) {
            this.f73301x8bca07fd = true;
            org.p3343x72743996.p3344x2e06d1.C29314x84278497.get().mo152447x75627b79(this.f73300xadab8296, th6);
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f73302x14172f77;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th6);
        }
    }
}
