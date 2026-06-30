package w6;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final m7.f f524657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w6.m0 f524658e;

    public h0(w6.m0 m0Var, m7.f fVar) {
        this.f524658e = m0Var;
        this.f524657d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m7.h hVar = (m7.h) this.f524657d;
        hVar.f405969a.a();
        synchronized (hVar.f405970b) {
            synchronized (this.f524658e) {
                w6.l0 l0Var = this.f524658e.f524685d;
                m7.f fVar = this.f524657d;
                l0Var.getClass();
                if (l0Var.f524684d.contains(new w6.k0(fVar, q7.i.f441832b))) {
                    w6.m0 m0Var = this.f524658e;
                    m7.f fVar2 = this.f524657d;
                    m0Var.getClass();
                    try {
                        ((m7.h) fVar2).i(m0Var.f524704z, 5);
                    } catch (java.lang.Throwable th6) {
                        throw new w6.f(th6);
                    }
                }
                this.f524658e.c();
            }
        }
    }
}
