package bt3;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs3.t f24371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t1 f24372e;

    public q1(bt3.t1 t1Var, zs3.t tVar) {
        this.f24372e = t1Var;
        this.f24371d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.t1 t1Var = this.f24372e;
        java.util.Vector vector = t1Var.f24411e;
        zs3.t tVar = this.f24371d;
        if (vector.contains(tVar)) {
            return;
        }
        t1Var.f24411e.add(tVar);
    }
}
