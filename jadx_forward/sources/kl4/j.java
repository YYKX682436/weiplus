package kl4;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k f390452d;

    public j(kl4.k kVar) {
        this.f390452d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k kVar = this.f390452d;
        try {
            java.lang.String str = kVar.f390457g;
            if (str != null) {
                kl4.k.a(kVar, str);
            }
        } finally {
            java.util.concurrent.CountDownLatch countDownLatch = kVar.f390459i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
