package gi;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f353519d;

    public a0(gi.v vVar) {
        this.f353519d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "excessive cpu start");
        synchronized (this.f353519d.f353717b) {
            gi.v vVar = this.f353519d;
            if (vVar.f353718c) {
                gi.q0 q0Var = new gi.q0("ExcessiveCpu");
                vVar.f353723h = q0Var;
                q0Var.b();
                gi.v vVar2 = this.f353519d;
                vVar2.f353730o.f435829h.f444870f.postDelayed(vVar2.f353729n, 900000L);
            }
        }
    }
}
