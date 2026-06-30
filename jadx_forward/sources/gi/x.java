package gi;

/* loaded from: classes12.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f353752d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi.v f353753e;

    public x(gi.v vVar) {
        this.f353753e = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f353753e.f353717b) {
            gi.v vVar = this.f353753e;
            if (!vVar.f353718c) {
                gi.q0 q0Var = vVar.f353721f;
                if (q0Var == null) {
                    this.f353752d = 0;
                } else {
                    rh.c1 c1Var = q0Var.f353619b;
                    if (c1Var != null) {
                        c1Var.f476860i.putInt("poll_count", this.f353752d);
                    }
                    this.f353753e.f353721f.a();
                    this.f353753e.f353721f = null;
                    lh.l0.f400143g.h();
                }
                gi.v vVar2 = this.f353753e;
                if (!vVar2.f353718c && gi.d.f353544s) {
                    this.f353752d++;
                    gi.q0 q0Var2 = new gi.q0("ExplicitFgPoll");
                    vVar2.f353721f = q0Var2;
                    q0Var2.b();
                    vVar2.f353730o.f435829h.f444870f.postDelayed(this, 600000L);
                }
            }
        }
    }
}
