package db3;

/* loaded from: classes.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f309802d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309803e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f309804f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f309805g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f309806h;

    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f309802d = activity;
        this.f309803e = z17;
        this.f309804f = jz5.h.b(db3.a.f309798d);
        this.f309805g = new java.util.ArrayList();
        this.f309806h = new java.util.HashSet();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.coroutines.Continuation, java.lang.Object, kotlinx.coroutines.a1] */
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        java.lang.String str;
        db3.c cVar = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        int i17 = 0;
        java.lang.Object obj = null;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.ArrayList arrayList = cVar.f309805g;
        int size = arrayList.size();
        int i18 = request.f544677b;
        if (i18 < size) {
            int size2 = arrayList.size();
            int i19 = request.f544678c + i18;
            if (size2 > i19) {
                dVar.f544681b = true;
            } else {
                i19 = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i18 < i19) {
                arrayList2.add(arrayList.get(i18));
                i18++;
            }
            java.util.List d17 = g95.x.f351360a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList2);
            java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.z3> f17 = g95.e.f351334a.f(arrayList2);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : f17) {
                java.lang.String d18 = z3Var.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                linkedHashMap.put(d18, z3Var);
            }
            int i27 = 0;
            for (java.lang.Object obj2 : d17) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj2;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) linkedHashMap.get(l4Var.h1());
                if (z3Var2 == null) {
                    z3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var2.X1(l4Var.h1());
                }
                eb3.a aVar = new eb3.a(l4Var.w0(), l4Var.G0(), null, null, 0, 0, 60, null);
                ri5.h hVar = ri5.j.I;
                int i29 = ri5.j.Z;
                java.lang.String d19 = z3Var2.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getUsername(...)");
                java.lang.String id6 = hVar.a(d19, i29, i17);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = cVar.f309802d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
                p13.r rVar = aVar.f332407d;
                p13.y yVar = aVar.f332406c;
                ((qd0.u0) g1Var).getClass();
                si5.e b18 = si5.b.f489858a.b(activity, rVar, z3Var2, yVar, null);
                java.lang.String d110 = z3Var2.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d110, "getUsername(...)");
                java.lang.CharSequence charSequence = b18.f489862a;
                ri5.j jVar = new ri5.j(id6, i29, d110, charSequence == null ? "" : charSequence, aVar, 0, 32, null);
                jVar.n(b18.f489863b);
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                if (b0Var == null || (str = ((l41.q2) b0Var).fj(z3Var2.Q0(), z3Var2.G0())) == null) {
                    str = "";
                }
                jVar.f477649m = str;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", z3Var2.Q0())) {
                    jVar.f477649m = "@" + ((java.lang.Object) jVar.f477649m);
                }
                i17 = 0;
                jVar.f477651o = false;
                jVar.f477652p = "";
                jVar.f477653q = 0;
                dVar.f544682c.add(jVar);
                cVar = this;
                i27 = i28;
                obj = null;
            }
        }
        ?? r07 = obj;
        v65.i.b(scope, r07, new db3.b(b17, dVar, r07), 1, r07);
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
        java.util.ArrayList arrayList = this.f309805g;
        arrayList.clear();
        java.util.HashSet hashSet = this.f309806h;
        hashSet.clear();
        hashSet.add(c01.z1.r());
        hashSet.add("weixin");
        hashSet.addAll(c01.e2.i());
        hashSet.addAll(c01.e2.h());
        hashSet.remove("conversationboxservice");
        p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
        p75.d dVar = dm.i2.W;
        g17.f434190d = dVar.m().d(dVar.j("message_fold"));
        g17.f434192f = kz5.b0.c(new g95.v());
        java.util.List l17 = g17.a().l(((jm0.l) ((jz5.n) this.f309804f).mo141623x754a37bb()).Q4());
        java.util.ArrayList arrayList2 = (java.util.ArrayList) l17;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (r26.n0.D(str, "@", false, 2, null)) {
                if (this.f309803e) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                        arrayList.add(str);
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                    arrayList.add(str);
                }
                it.remove();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QSRPRecentConversationDataSource", "filter user name contains @, size=" + arrayList2.size());
        for (java.lang.String str2 : g95.e.f351334a.b(l17)) {
            if (!hashSet.contains(str2)) {
                arrayList.add(str2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QSRPRecentConversationDataSource", "onCreate blockList=" + hashSet + " contactListSize=" + arrayList.size() + " conversationList=" + arrayList);
    }
}
