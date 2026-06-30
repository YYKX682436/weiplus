package qh;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f444860d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh.f0 f444861e;

    public c0(qh.f0 f0Var, qh.b0 b0Var) {
        this.f444861e = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f444860d++;
        oj.j.c("Matrix.battery.BatteryMonitorCore", "#onBackgroundLoopCheck, round = " + this.f444860d, new java.lang.Object[0]);
        if (!this.f444861e.f444876o) {
            synchronized (qh.f0.class) {
                java.util.Iterator it = ((java.util.ArrayList) this.f444861e.f444868d.f444839y).iterator();
                while (it.hasNext()) {
                    ((rh.e3) it.next()).g(this.f444861e.f444881t * this.f444860d);
                }
            }
        }
        qh.f0 f0Var = this.f444861e;
        if (f0Var.f444876o) {
            return;
        }
        f0Var.f444869e.postDelayed(this, f0Var.f444881t);
    }
}
