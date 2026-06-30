package b40;

/* loaded from: classes8.dex */
public class e implements java.util.concurrent.Callable {
    public e(b40.f fVar) {
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FCMFeatureService", "register listener at " + bm5.f1.a());
        return java.lang.Boolean.valueOf(a92.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a));
    }
}
