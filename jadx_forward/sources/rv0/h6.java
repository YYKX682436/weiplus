package rv0;

/* loaded from: classes5.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f481571f;

    public h6(rv0.z6 z6Var, ex0.a0 a0Var, yz5.a aVar) {
        this.f481569d = z6Var;
        this.f481570e = a0Var;
        this.f481571f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex0.v vVar;
        java.util.List list;
        rv0.z6 z6Var = this.f481569d;
        z6Var.u7().b(this.f481570e, new bx0.j(e3.d.b(((java.lang.Number) ((jz5.n) z6Var.f481898u).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) z6Var.f481899v).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) z6Var.f481898u).mo141623x754a37bb()).intValue(), 0), (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 48)), z6Var.m158345xefc66565());
        z6Var.u7().m47455x476e2aac(z6Var.B);
        z6Var.u7().m47454x565c0d26(z6Var.C);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 u76 = z6Var.u7();
        p3325xe03a0797.p3326xc267989b.y0 mainScope = z6Var.m158345xefc66565();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = u76.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f338630g) != null && (list = vVar.f338710e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                u76.getThumbnailProviderManager().d(rVar.f338701b);
                if (rVar.f338702c == ug.m.Transition) {
                    break;
                } else {
                    p3325xe03a0797.p3326xc267989b.l.d(mainScope, null, null, new rv0.m5(u76, rVar, null), 3, null);
                }
            }
        }
        z6Var.u7().m47126xc60f964(true);
        z6Var.o7().a();
        z6Var.o7().m47121xcf26fe1d(z6Var.D);
        z6Var.o7().m47123xcc5f18c9(z6Var.E);
        this.f481571f.mo152xb9724478();
    }
}
