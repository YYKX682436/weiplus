package gi;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f353521d;

    public b0(gi.v vVar) {
        this.f353521d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gi.q0 q0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "excessive cpu inspect");
        synchronized (this.f353521d.f353717b) {
            gi.v vVar = this.f353521d;
            if (vVar.f353718c && (q0Var = vVar.f353723h) != null) {
                q0Var.a();
            }
            this.f353521d.f353723h = null;
        }
    }
}
