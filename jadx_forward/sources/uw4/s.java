package uw4;

/* loaded from: classes.dex */
public final class s implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f513282a;

    public s(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f513282a = countDownLatch;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        this.f513282a.countDown();
    }
}
