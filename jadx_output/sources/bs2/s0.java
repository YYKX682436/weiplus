package bs2;

/* loaded from: classes2.dex */
public final class s0 extends bs2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23950g;

    public s0(bs2.n1 n1Var) {
        this.f23950g = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bs2.n1 n1Var = this.f23950g;
        com.tencent.mars.xlog.Log.i(n1Var.f23909c, "outSideDelayRunnable run... isInFinder=" + n1Var.f23910d);
        bs2.n1 n1Var2 = this.f23950g;
        bs2.n1.r(n1Var2, n1Var2.h(), null, new bs2.r0(n1Var), 2, null);
    }
}
