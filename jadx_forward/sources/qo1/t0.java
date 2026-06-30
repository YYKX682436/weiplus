package qo1;

/* loaded from: classes5.dex */
public final class t0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f447082a;

    public t0(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f447082a = countDownLatch;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y1
    /* renamed from: complete */
    public final void mo111029xdc453139(int i17) {
        this.f447082a.countDown();
    }
}
