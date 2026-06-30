package gi;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f353756d;

    public y(gi.v vVar) {
        this.f353756d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f353756d.f353717b) {
            gi.v vVar = this.f353756d;
            if (vVar.f353718c) {
                gi.q0 q0Var = new gi.q0("ExplicitBg");
                vVar.f353720e = q0Var;
                q0Var.b();
            }
        }
    }
}
