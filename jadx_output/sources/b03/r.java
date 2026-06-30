package b03;

/* loaded from: classes.dex */
public final class r implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final b03.r f16862d = new b03.r();

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).h(runnable, "IFlutterEngineService.serial");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CachedFlutterEngines", "post background task:" + runnable.hashCode(), new java.lang.Object[0]);
    }
}
