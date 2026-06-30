package u7;

/* loaded from: classes13.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f506581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u7.i f506582e;

    public h(u7.i iVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f506582e = iVar;
        this.f506581d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f506581d.countDown();
        u7.i iVar = this.f506582e;
        iVar.getClass();
        while (!java.lang.Thread.currentThread().isInterrupted()) {
            try {
                java.net.Socket accept = iVar.f506586d.accept();
                java.util.Objects.toString(accept);
                iVar.f506584b.submit(new u7.g(iVar, accept));
            } catch (java.io.IOException e17) {
                new u7.r("Error during waiting connection", e17);
                return;
            }
        }
    }
}
