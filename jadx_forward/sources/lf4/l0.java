package lf4;

/* loaded from: classes4.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399970d;

    public l0(lf4.q0 q0Var) {
        this.f399970d = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.q0 q0Var = this.f399970d;
        if4.f fVar = (if4.f) kz5.n0.a0(q0Var.f399998i, q0Var.f400002p);
        if4.a aVar = fVar != null ? fVar.f372781f : null;
        if4.f fVar2 = (if4.f) kz5.n0.a0(q0Var.f399998i, q0Var.f400002p);
        nf4.j jVar = fVar2 != null ? fVar2.f372776a : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSelectedRead ");
        sb6.append(q0Var.f400002p);
        sb6.append(", ");
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f372769d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
        if (bf4.f.f101248b.f()) {
            if (jVar == null || !jVar.w0()) {
                return;
            }
            jVar.F0(false);
            long j17 = jVar.f69410x443468b;
            int i17 = jVar.f69406x52c1d072;
            ef4.w.f334001t.i().f418405h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i17 + " Where storyID = '" + j17 + '\'');
            pm0.v.X(new lf4.j0(q0Var));
            return;
        }
        if (jVar != null && jVar.w0()) {
            jVar.F0(false);
            long j18 = jVar.f69410x443468b;
            int i18 = jVar.f69406x52c1d072;
            ef4.w.f334001t.i().f418405h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i18 + " Where storyID = '" + j18 + '\'');
        }
        if (aVar != null) {
            java.util.LinkedList linkedList = aVar.f372772g;
            if (linkedList.size() > 0) {
                gf4.l lVar = gf4.l.f352887d;
                long j19 = aVar.f372767b;
                java.lang.Object last = linkedList.getLast();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(last, "getLast(...)");
                if (lVar.l(j19, (gf4.a) last)) {
                    pm0.v.X(new lf4.k0(aVar, q0Var));
                }
            }
        }
    }
}
