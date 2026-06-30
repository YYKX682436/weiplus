package oi5;

/* loaded from: classes.dex */
public final class e extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f427188d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f427189e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f427190f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f427191g;

    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f427188d = activity;
        this.f427189e = new java.util.ArrayList();
        this.f427190f = jz5.h.b(oi5.d.f427187d);
        this.f427191g = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f427188d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(cj5.j1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f427189e;
        int size = arrayList.size();
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList2)) {
                if (((int) z3Var.E2) != 0) {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 32, null, false, 223, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.Y;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    dVar.f544682c.add(ti5.d.f501196i.b(this.f427188d, hVar.a(d17, i19, 0), z3Var, i19, dVar2));
                }
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f427189e;
        arrayList.clear();
        boolean booleanExtra = this.f427188d.getIntent().getBooleanExtra("KBlockOpenImFav", true);
        p75.m g17 = dm.e2.T1.g(64, 64);
        g95.d dVar = g95.e.f351334a;
        p75.m c17 = g17.c(dVar.g());
        if (booleanExtra) {
            c17 = c17.c(com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a() ? dm.e2.Y1.q(65536L) : dm.e2.P1.t("'%@openim'"));
        }
        p75.i0 g18 = dm.e2.N1.g(kz5.b0.c(dm.e2.P1));
        g18.f434189c = "MicroMsg.SelectContactFavorDataSource";
        g18.f434190d = c17;
        g18.f434192f = dVar.h();
        for (java.lang.String str : g18.a().l(((jm0.l) ((jz5.n) this.f427190f).mo141623x754a37bb()).Q4())) {
            if (!this.f427191g.contains(str)) {
                arrayList.add(str);
            }
        }
    }
}
