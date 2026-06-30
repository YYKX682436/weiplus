package qo;

/* loaded from: classes4.dex */
public final class p implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446853d;

    public p(java.lang.String str) {
        this.f446853d = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).h(runnable, this.f446853d);
    }
}
