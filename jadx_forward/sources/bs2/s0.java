package bs2;

/* loaded from: classes2.dex */
public final class s0 extends bs2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105483g;

    public s0(bs2.n1 n1Var) {
        this.f105483g = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bs2.n1 n1Var = this.f105483g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f105442c, "outSideDelayRunnable run... isInFinder=" + n1Var.f105443d);
        bs2.n1 n1Var2 = this.f105483g;
        bs2.n1.r(n1Var2, n1Var2.h(), null, new bs2.r0(n1Var), 2, null);
    }
}
