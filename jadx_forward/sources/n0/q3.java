package n0;

/* loaded from: classes14.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f415219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f415220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(n0.b4 b4Var, java.lang.Throwable th6) {
        super(1);
        this.f415219d = b4Var;
        this.f415220e = th6;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        n0.b4 b4Var = this.f415219d;
        java.lang.Object obj2 = b4Var.f414980d;
        java.lang.Throwable th7 = this.f415220e;
        synchronized (obj2) {
            if (th7 == null) {
                th7 = null;
            } else if (th6 != null) {
                if (!(!(th6 instanceof java.util.concurrent.CancellationException))) {
                    th6 = null;
                }
                if (th6 != null) {
                    jz5.a.a(th7, th6);
                }
            }
            b4Var.f414982f = th7;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b4Var.f414991o).k(n0.o3.ShutDown);
        }
        return jz5.f0.f384359a;
    }
}
