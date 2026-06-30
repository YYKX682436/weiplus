package b03;

/* loaded from: classes.dex */
public final class o implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16859d;

    public o(java.lang.String str) {
        this.f16859d = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).h(runnable, this.f16859d);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CachedFlutterEngines", "post background task:" + runnable.hashCode(), new java.lang.Object[0]);
    }
}
