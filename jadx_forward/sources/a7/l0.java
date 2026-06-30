package a7;

/* loaded from: classes13.dex */
public class l0 extends q7.k {
    public l0(a7.n0 n0Var, long j17) {
        super(j17);
    }

    @Override // q7.k
    public void b(java.lang.Object obj, java.lang.Object obj2) {
        a7.m0 m0Var = (a7.m0) obj;
        m0Var.getClass();
        java.util.Queue queue = a7.m0.f83372d;
        synchronized (queue) {
            ((java.util.ArrayDeque) queue).offer(m0Var);
        }
    }
}
