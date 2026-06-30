package lu5;

/* loaded from: classes14.dex */
public abstract class h extends p3325xe03a0797.p3326xc267989b.p0 {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f403000e = lu5.c.f402992a;

    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(block, "block");
        try {
            lu5.f fVar = (lu5.f) context.get(lu5.f.f402996e);
            mo146375xb158f775(new lu5.g(block, fVar != null ? fVar.f402997d : true));
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            p3325xe03a0797.p3326xc267989b.v2.b(context, p3325xe03a0797.p3326xc267989b.e2.a("The task was rejected", e17));
            p3325xe03a0797.p3326xc267989b.p0 p0Var = this.f403000e;
            if (p0Var != null) {
                p0Var.D(context, block);
            }
        }
    }

    /* renamed from: execute */
    public abstract void mo146375xb158f775(java.lang.Runnable runnable);
}
