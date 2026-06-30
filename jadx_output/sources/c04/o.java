package c04;

/* loaded from: classes13.dex */
public final class o extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37685d;

    public o(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        this.f37685d = scanGoodsMaskView;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        ((ku5.t0) ku5.t0.f312615d).B(new c04.n(this.f37685d));
    }
}
