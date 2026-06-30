package bt3;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs3.t f105904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t1 f105905e;

    public q1(bt3.t1 t1Var, zs3.t tVar) {
        this.f105905e = t1Var;
        this.f105904d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.t1 t1Var = this.f105905e;
        java.util.Vector vector = t1Var.f105944e;
        zs3.t tVar = this.f105904d;
        if (vector.contains(tVar)) {
            return;
        }
        t1Var.f105944e.add(tVar);
    }
}
