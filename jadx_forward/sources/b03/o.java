package b03;

/* loaded from: classes.dex */
public final class o implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98392d;

    public o(java.lang.String str) {
        this.f98392d = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).h(runnable, this.f98392d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CachedFlutterEngines", "post background task:" + runnable.hashCode(), new java.lang.Object[0]);
    }
}
