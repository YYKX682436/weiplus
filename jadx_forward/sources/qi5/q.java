package qi5;

/* loaded from: classes.dex */
public final class q extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f445369d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f445370e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f445371f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f445372g;

    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f445369d = activity;
        this.f445370e = jz5.h.b(qi5.n.f445364d);
        this.f445371f = new java.util.ArrayList();
        this.f445372g = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        ri5.j a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.ArrayList arrayList = this.f445371f;
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
            java.util.List d17 = g95.x.f351360a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList2);
            java.util.Map d18 = d75.b.d(g95.e.f351334a.f(arrayList2), qi5.p.f445368d);
            int i19 = 0;
            for (java.lang.Object obj : d17) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedHashMap) d18).get(l4Var.h1());
                if (z3Var == null) {
                    z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(l4Var.h1());
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = z3Var;
                vi5.f fVar = new vi5.f(l4Var.w0(), l4Var.G0(), null, null, 0, 0, false, 124, null);
                ri5.h hVar = ri5.j.I;
                int i28 = ri5.j.Z;
                java.lang.String d19 = z3Var2.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getUsername(...)");
                java.lang.String id6 = hVar.a(d19, i28, 0);
                java.util.Set set = c01.e2.f118650a;
                boolean z17 = set != null && ((java.util.HashSet) set).contains(l4Var.h1());
                vi5.e eVar = vi5.f.f519153h;
                if (z17) {
                    int i29 = (32 & 32) != 0 ? i28 : 0;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f445369d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i28, fVar, i29);
                    a17.f477662z = true;
                    a17.A = true;
                } else {
                    a17 = eVar.a(this.f445369d, id6, z3Var2, i28, fVar, (r14 & 32) != 0 ? i28 : 0);
                }
                dVar.f544682c.add(a17);
                i19 = i27;
            }
        }
        v65.i.b(scope, null, new qi5.o(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 0;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f445371f;
        arrayList.clear();
        p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
        p75.d dVar = dm.i2.W;
        g17.f434190d = dVar.m().d(dVar.j("message_fold"));
        g17.f434192f = kz5.b0.c(new g95.v());
        java.util.List l17 = g17.a().l(((jm0.l) ((jz5.n) this.f445370e).mo141623x754a37bb()).Q4());
        java.util.Iterator it = ((java.util.ArrayList) l17).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (r26.n0.D(str, "@", false, 2, null)) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                    arrayList.add(str);
                }
                it.remove();
            }
        }
        for (java.lang.String str2 : g95.e.f351334a.b(l17)) {
            if (!this.f445372g.contains(str2) && !r26.n0.D(str2, ",", false, 2, null)) {
                arrayList.add(str2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentContactConversationDataSource", "onCreate blockList=" + this.f445372g + " contactListSize=" + arrayList.size());
    }
}
