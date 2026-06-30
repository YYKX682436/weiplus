package gi;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f353735d;

    public w(gi.v vVar) {
        this.f353735d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f353735d.f353717b) {
            gi.v vVar = this.f353735d;
            if (!vVar.f353718c) {
                gi.q0 q0Var = new gi.q0("ExplicitFg");
                vVar.f353719d = q0Var;
                q0Var.b();
            }
        }
    }
}
