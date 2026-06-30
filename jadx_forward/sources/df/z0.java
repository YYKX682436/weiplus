package df;

/* loaded from: classes7.dex */
public final class z0 implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f311158d;

    public z0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        this.f311158d = c28580x69eec95e;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).h(runnable, java.lang.String.valueOf(this.f311158d.hashCode()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("SkylineManager", "post background task:" + runnable.hashCode(), new java.lang.Object[0]);
    }
}
