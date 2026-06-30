package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.JavaHandlerThread */
/* loaded from: classes13.dex */
public class C29315xdc2bfed2 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73305x7118e671 = false;

    /* renamed from: mThread */
    private final android.os.HandlerThread f73306x1b4d34d7;

    /* renamed from: mUnhandledException */
    private java.lang.Throwable f73307xa0781459;

    /* renamed from: org.chromium.base.JavaHandlerThread$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: initializeThread */
        void mo152462x3f6ed9ba(long j17, long j18);

        /* renamed from: onLooperStopped */
        void mo152463x4bd5469d(long j17);
    }

    public C29315xdc2bfed2(java.lang.String str, int i17) {
        this.f73306x1b4d34d7 = new android.os.HandlerThread(str, i17);
    }

    /* renamed from: create */
    private static org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2 m152452xaf65a0fc(java.lang.String str, int i17) {
        return new org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2(str, i17);
    }

    /* renamed from: getUncaughtExceptionIfAny */
    private java.lang.Throwable m152453x35da0b2b() {
        return this.f73307xa0781459;
    }

    /* renamed from: hasStarted */
    private boolean m152454x80f0487() {
        return this.f73306x1b4d34d7.getState() != java.lang.Thread.State.NEW;
    }

    /* renamed from: isAlive */
    private boolean m152455x7a7245c3() {
        return this.f73306x1b4d34d7.isAlive();
    }

    /* renamed from: joinThread */
    private void m152456x5ba3cfd4() {
        boolean z17 = false;
        while (!z17) {
            try {
                this.f73306x1b4d34d7.join();
                z17 = true;
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    /* renamed from: listenForUncaughtExceptionsForTesting */
    private void m152457xf2cb70c2() {
        this.f73306x1b4d34d7.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: org.chromium.base.JavaHandlerThread.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
                org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.this.f73307xa0781459 = th6;
            }
        });
    }

    /* renamed from: quitThreadSafely */
    private void m152458x3e526073(final long j17) {
        new android.os.Handler(this.f73306x1b4d34d7.getLooper()).post(new java.lang.Runnable() { // from class: org.chromium.base.JavaHandlerThread.2
            @Override // java.lang.Runnable
            public void run() {
                org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.this.f73306x1b4d34d7.quit();
                org.p3343x72743996.p3344x2e06d1.C29316xa3cbdb73.get().mo152463x4bd5469d(j17);
            }
        });
        this.f73306x1b4d34d7.getLooper().quitSafely();
    }

    /* renamed from: startAndInitialize */
    private void m152459x60a81b85(final long j17, final long j18) {
        m152461x3be568da();
        new android.os.Handler(this.f73306x1b4d34d7.getLooper()).post(new java.lang.Runnable() { // from class: org.chromium.base.JavaHandlerThread.1
            @Override // java.lang.Runnable
            public void run() {
                org.p3343x72743996.p3344x2e06d1.C29316xa3cbdb73.get().mo152462x3f6ed9ba(j17, j18);
            }
        });
    }

    /* renamed from: getLooper */
    public android.os.Looper m152460x23b2dd47() {
        return this.f73306x1b4d34d7.getLooper();
    }

    /* renamed from: maybeStart */
    public void m152461x3be568da() {
        if (m152454x80f0487()) {
            return;
        }
        this.f73306x1b4d34d7.start();
    }
}
