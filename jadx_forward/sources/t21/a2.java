package t21;

/* loaded from: classes12.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v0 f496232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.c2 f496233e;

    public a2(t21.c2 c2Var, t21.v0 v0Var) {
        this.f496233e = c2Var;
        this.f496232d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f496232d.f496511b;
        synchronized (this.f496233e.f496253a) {
            java.util.Iterator it = this.f496233e.f496253a.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var != null && f9Var.m124847x74d37ac6() == j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", java.lang.Integer.valueOf(this.f496233e.hashCode()), java.lang.Long.valueOf(j17));
                    it.remove();
                }
            }
        }
        this.f496233e.e(true);
        t21.c2 c2Var = this.f496233e;
        t21.v0 v0Var = c2Var.f496261i;
        if (v0Var != null) {
            v0Var.f496527r = null;
        }
        c2Var.f496261i = null;
        t21.c2.b(c2Var, 111, 1);
        t21.c2 c2Var2 = this.f496233e;
        c2Var2.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new t21.z1(c2Var2));
    }
}
