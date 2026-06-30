package gx0;

/* loaded from: classes5.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f357753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f357754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f357755f;

    public b3(gx0.y3 y3Var, ex0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        this.f357753d = y3Var;
        this.f357754e = a0Var;
        this.f357755f = c3971x241f78;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex0.v vVar;
        java.util.List list;
        gx0.y3 y3Var = this.f357753d;
        int i17 = (int) (y3Var.m80379x76847179().getResources().getDisplayMetrics().widthPixels * 0.5f);
        y3Var.o7().b(this.f357754e, new bx0.j(e3.d.b(i17, (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 40), i17, 0), (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 48)), y3Var.m158345xefc66565());
        y3Var.o7().m47452x2e4caec8(y3Var.f358731y);
        y3Var.o7().m47458x91b6da1b(y3Var.f358732z);
        y3Var.o7().m47455x476e2aac(y3Var.B);
        y3Var.o7().mo47139x7b8a77dc(y3Var.C);
        y3Var.o7().m47454x565c0d26(y3Var.A);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 o76 = y3Var.o7();
        p3325xe03a0797.p3326xc267989b.y0 mainScope = y3Var.m158345xefc66565();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = o76.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f338630g) != null && (list = vVar.f338710e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                o76.getThumbnailProviderManager().d(rVar.f338701b);
                if (rVar.f338702c != ug.m.Transition) {
                    p3325xe03a0797.p3326xc267989b.l.d(mainScope, null, null, new jv0.l(o76, rVar, null), 3, null);
                }
            }
        }
        y3Var.o7().m47089xbe549af0(this.f357755f);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 o77 = y3Var.o7();
        java.util.List list2 = y3Var.f383722r;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            arrayList.add(((jv0.p) it6.next()).f383738a);
        }
        o77.m47088x51876d3e(arrayList);
        y3Var.o7().m47090x1a73a7bd(gx0.c3.f357810d);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(y3Var.o7(), y3Var.z7().h7(), false, 2, null);
    }
}
