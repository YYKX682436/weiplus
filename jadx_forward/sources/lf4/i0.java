package lf4;

/* loaded from: classes4.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399946d;

    public i0(lf4.q0 q0Var) {
        this.f399946d = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.q0 q0Var = this.f399946d;
        if4.f fVar = (if4.f) kz5.n0.a0(q0Var.f399998i, q0Var.f400002p);
        if4.a aVar = fVar != null ? fVar.f372781f : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSelectedRead ");
        sb6.append(q0Var.f400002p);
        sb6.append(", ");
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f372771f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
        if (aVar != null) {
            java.util.LinkedList linkedList = aVar.f372773h;
            if (linkedList.size() > 0) {
                gf4.l lVar = gf4.l.f352887d;
                long j17 = aVar.f372767b;
                java.lang.Object last = linkedList.getLast();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(last, "getLast(...)");
                lVar.l(j17, (gf4.a) last);
                pm0.v.X(new lf4.h0(aVar, q0Var));
            }
        }
    }
}
