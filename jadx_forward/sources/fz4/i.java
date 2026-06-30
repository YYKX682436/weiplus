package fz4;

/* loaded from: classes5.dex */
public final class i implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f348845a;

    public i(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f348845a = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotUtilKt", "PixelCopy success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnapShotUtilKt", "PixelCopy failed with error code " + i17);
        }
        this.f348845a.countDown();
    }
}
