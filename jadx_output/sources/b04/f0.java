package b04;

/* loaded from: classes3.dex */
public final class f0 implements q80.s {
    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "startLiteAppView: success,liteAppView:" + liteAppView);
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RedPacketUIC", "startLiteAppView: fail!");
    }
}
