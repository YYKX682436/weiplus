package lf4;

/* loaded from: classes4.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f399918d;

    public e1(lf4.j1 j1Var) {
        this.f399918d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f399918d;
        int i17 = j1Var.f399961r;
        if (i17 < 0 || i17 >= j1Var.f399955i.size()) {
            return;
        }
        java.lang.Object obj = j1Var.f399955i.get(j1Var.f399961r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if4.f fVar = (if4.f) kz5.n0.a0(arrayList, j1Var.f399962s);
        if4.a aVar = fVar != null ? fVar.f372781f : null;
        if4.f fVar2 = (if4.f) kz5.n0.a0(arrayList, j1Var.f399962s);
        nf4.j jVar = fVar2 != null ? fVar2.f372776a : null;
        java.lang.String str = j1Var.f399954h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSelectedRead ");
        sb6.append(j1Var.f399962s);
        sb6.append(", ");
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f372769d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (j1Var.f399965v) {
            if (jVar == null || !jVar.w0()) {
                return;
            }
            jVar.F0(false);
            long j17 = jVar.f69410x443468b;
            int i18 = jVar.f69406x52c1d072;
            ef4.w.f334001t.i().f418405h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i18 + " Where storyID = '" + j17 + '\'');
            pm0.v.X(new lf4.c1(j1Var));
            return;
        }
        if (jVar != null && jVar.w0()) {
            jVar.F0(false);
            long j18 = jVar.f69410x443468b;
            int i19 = jVar.f69406x52c1d072;
            ef4.w.f334001t.i().f418405h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i19 + " Where storyID = '" + j18 + '\'');
        }
        if (aVar != null) {
            java.util.LinkedList linkedList = aVar.f372772g;
            if (linkedList.size() > 0) {
                gf4.l lVar = gf4.l.f352887d;
                long j19 = aVar.f372767b;
                java.lang.Object last = linkedList.getLast();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(last, "getLast(...)");
                if (lVar.l(j19, (gf4.a) last)) {
                    pm0.v.X(new lf4.d1(aVar, j1Var));
                }
            }
        }
    }
}
