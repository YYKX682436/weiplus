package c04;

/* loaded from: classes13.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37689d;

    public r(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        this.f37689d = scanGoodsMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = this.f37689d.f159638p1;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
    }
}
