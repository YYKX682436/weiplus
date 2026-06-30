package n0;

/* loaded from: classes14.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f415226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(n0.b4 b4Var) {
        super(1);
        this.f415226d = b4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.util.concurrent.CancellationException a17 = p3325xe03a0797.p3326xc267989b.e2.a("Recomposer effect job completed", th6);
        n0.b4 b4Var = this.f415226d;
        synchronized (b4Var.f414980d) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = b4Var.f414981e;
            if (r2Var != null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b4Var.f414991o).k(n0.o3.ShuttingDown);
                r2Var.b(a17);
                b4Var.f414990n = null;
                r2Var.p(new n0.q3(b4Var, th6));
            } else {
                b4Var.f414982f = a17;
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b4Var.f414991o).k(n0.o3.ShutDown);
            }
        }
        return jz5.f0.f384359a;
    }
}
