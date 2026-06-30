package oi5;

/* loaded from: classes.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f427183d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f427184e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f427185f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f427186g;

    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f427183d = activity;
        this.f427184e = jz5.h.b(oi5.b.f427182d);
        this.f427185f = new java.util.ArrayList();
        this.f427186g = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f427185f;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = dVar.f544682c;
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList3.add(arrayList.get(i17));
                i17++;
            }
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList3)) {
                if (((int) z3Var.E2) == 0 || z3Var.s2()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactDataSource", "contactID:%s, isDeleteContact:%s", java.lang.Integer.valueOf((int) z3Var.E2), java.lang.Boolean.valueOf(z3Var.s2()));
                } else {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.Z;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    arrayList2.add(ti5.d.f501196i.b(this.f427183d, hVar.a(d17, i19, 0), z3Var, i19, dVar2));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactDataSource", "dataList add size:%s", java.lang.Integer.valueOf(arrayList2.size()));
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 0;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f427185f;
        arrayList.clear();
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        g95.d dVar = g95.e.f351334a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m c18 = c17.d(dVar2.j("weixin")).c(dm.e2.W1.i(0));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        g17.f434189c = "MicroMsg.SelectContactDataSource";
        g17.f434190d = c18;
        g17.f434192f = dVar.h();
        for (java.lang.String str : g17.a().l(((jm0.l) ((jz5.n) this.f427184e).mo141623x754a37bb()).Q4())) {
            if (!this.f427186g.contains(str)) {
                arrayList.add(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactDataSource", "onCreate blockList=" + this.f427186g + " contactListSize=" + arrayList.size());
    }
}
