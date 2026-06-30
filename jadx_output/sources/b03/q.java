package b03;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f16861e;

    public q(long j17, kotlin.coroutines.Continuation continuation) {
        this.f16860d = j17;
        this.f16861e = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.FlutterJNI.setLogHandler(com.tencent.mm.flutter.base.MMFlutterLog.INSTANCE.getLogHandler());
        e50.j1 j1Var = e50.j1.f249508a;
        j1Var.c();
        if (j1Var.a() && e50.j1.f249510c) {
            int vulkanTestResult = io.flutter.embedding.engine.FlutterJNI.getVulkanTestResult();
            com.tencent.mars.xlog.Log.i("MicroMsg.CachedFlutterEngines", "vulkanTestResult:" + vulkanTestResult);
            if (vulkanTestResult >= 0) {
                boolean z17 = vulkanTestResult > 0;
                j1Var.b().D(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_MODEL, android.os.Build.MODEL);
                j1Var.b().G("vulkan_test_result", z17);
                e50.j1.f249510c = false;
                e50.j1.f249511d = z17;
            }
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CachedFlutterEngines", "init FlutterLoader cost:" + (android.os.SystemClock.elapsedRealtime() - this.f16860d) + " ms");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f16861e.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
