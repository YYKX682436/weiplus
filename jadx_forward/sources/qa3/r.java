package qa3;

/* loaded from: classes15.dex */
public final class r implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa3.s f442596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f442597b;

    public r(qa3.s sVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f442596a = sVar;
        this.f442597b = countDownLatch;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        qa3.o.f442584a.c(this.f442596a.f442568a, false, "start fail");
        this.f442597b.countDown();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        qa3.o.f442584a.c(this.f442596a.f442568a, true, "");
        this.f442597b.countDown();
    }
}
