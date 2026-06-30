package sp2;

/* loaded from: classes2.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492652d;

    public o1(sp2.o2 o2Var) {
        this.f492652d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rq2.d.f480349a.h(0, 10000);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        sp2.o2 o2Var = this.f492652d;
        o2Var.M = elapsedRealtime - o2Var.L;
    }
}
