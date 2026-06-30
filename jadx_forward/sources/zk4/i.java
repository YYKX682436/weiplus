package zk4;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f555068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kq0 f555069e;

    public i(int i17, bw5.kq0 kq0Var) {
        this.f555068d = i17;
        this.f555069e = kq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (rk4.o5 o5Var : ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).f333773d) {
            bw5.kq0 kq0Var = this.f555069e;
            o5Var.a(this.f555068d, kq0Var != null ? kq0Var.b() : null);
        }
    }
}
