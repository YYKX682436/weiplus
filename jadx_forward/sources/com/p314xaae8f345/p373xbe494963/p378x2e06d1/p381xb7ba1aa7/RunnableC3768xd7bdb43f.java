package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p381xb7ba1aa7;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.dispatcher.PlatformDispatcherTask */
/* loaded from: classes7.dex */
class RunnableC3768xd7bdb43f implements java.lang.Runnable {

    /* renamed from: mNativePlatformDispatcherTask */
    private long f14652x2bc2823;

    public RunnableC3768xd7bdb43f(long j17) {
        this.f14652x2bc2823 = j17;
    }

    /* renamed from: destroyTask */
    private void m29335x89d6bc9f() {
        long j17 = this.f14652x2bc2823;
        if (j17 != 0) {
            m29337x6361f008(j17);
            this.f14652x2bc2823 = 0L;
        }
    }

    /* renamed from: getMainHandler */
    public static android.os.Handler m29336xce60fe1b() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* renamed from: nativeDestroyTask */
    private static native void m29337x6361f008(long j17);

    /* renamed from: nativeRunTask */
    private static native void m29338x235a7699(long j17);

    /* renamed from: finalize */
    public void m29339xd764dc1e() {
        m29335x89d6bc9f();
        super.finalize();
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f14652x2bc2823;
        if (j17 != 0) {
            m29338x235a7699(j17);
            m29335x89d6bc9f();
        }
    }
}
