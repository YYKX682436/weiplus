package w6;

/* loaded from: classes13.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final m7.f f524662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w6.m0 f524663e;

    public i0(w6.m0 m0Var, m7.f fVar) {
        this.f524663e = m0Var;
        this.f524662d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m7.h hVar = (m7.h) this.f524662d;
        hVar.f405969a.a();
        synchronized (hVar.f405970b) {
            synchronized (this.f524663e) {
                w6.l0 l0Var = this.f524663e.f524685d;
                m7.f fVar = this.f524662d;
                l0Var.getClass();
                if (l0Var.f524684d.contains(new w6.k0(fVar, q7.i.f441832b))) {
                    this.f524663e.B.b();
                    w6.m0 m0Var = this.f524663e;
                    m7.f fVar2 = this.f524662d;
                    m0Var.getClass();
                    try {
                        ((m7.h) fVar2).k(m0Var.B, m0Var.f524702x);
                        this.f524663e.g(this.f524662d);
                    } catch (java.lang.Throwable th6) {
                        throw new w6.f(th6);
                    }
                }
                this.f524663e.c();
            }
        }
    }
}
