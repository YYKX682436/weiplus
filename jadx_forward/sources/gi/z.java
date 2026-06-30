package gi;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f353762d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi.v f353763e;

    public z(gi.v vVar) {
        this.f353763e = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f353763e.f353717b) {
            gi.v vVar = this.f353763e;
            if (vVar.f353718c) {
                gi.q0 q0Var = vVar.f353722g;
                if (q0Var == null) {
                    this.f353762d = 0;
                } else {
                    rh.c1 c1Var = q0Var.f353619b;
                    if (c1Var != null) {
                        c1Var.f476860i.putInt("poll_count", this.f353762d);
                    }
                    this.f353763e.f353722g.a();
                    this.f353763e.f353722g = null;
                    lh.l0.f400143g.h();
                }
                gi.v vVar2 = this.f353763e;
                if (vVar2.f353718c && gi.d.f353545t) {
                    this.f353762d++;
                    gi.q0 q0Var2 = new gi.q0("ExplicitBgPoll");
                    vVar2.f353722g = q0Var2;
                    q0Var2.b();
                    vVar2.f353730o.f435829h.f444870f.postDelayed(this, 1800000L);
                }
            }
        }
    }
}
