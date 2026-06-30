package yx0;

/* loaded from: classes5.dex */
public final class i2 implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f548907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f548908b;

    public i2(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f548907a = f0Var;
        this.f548908b = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        this.f548907a.f391649d = i17;
        this.f548908b.countDown();
    }
}
