package zk4;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk4.j f555066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f555067e;

    public h(zk4.j jVar, bw5.pq0 pq0Var) {
        this.f555066d = jVar;
        this.f555067e = pq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zk4.j jVar = this.f555066d;
        int i17 = jVar.f555070d.f445708d;
        int i18 = this.f555067e.f113341d;
        if (i17 == i18) {
            return;
        }
        qk.ia a17 = qk.ia.f445702e.a(i18);
        zk4.l lVar = zk4.l.f555071a;
        qk.ia oldState = jVar.f555070d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        java.util.Iterator it = ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).f333775f.iterator();
        while (it.hasNext()) {
            ((ip1.k) ((rk4.c9) it.next())).getClass();
            a17.toString();
            oldState.toString();
            pm0.v.X(new ip1.j(a17));
        }
        jVar.f555070d = a17;
    }
}
