package yi2;

/* loaded from: classes10.dex */
public final class i0 implements si2.a {
    public final java.util.Map A;
    public final java.util.Map B;
    public boolean C;
    public final java.util.Map D;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 E;
    public final wi2.c F;
    public final jz5.g G;
    public final jz5.g H;
    public final yi2.d0 I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 f544050J;
    public final com.p314xaae8f345.mm.app.s2 K;
    public final android.os.Handler L;

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f544051d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f544052e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f544053f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f544054g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f544055h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f544056i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f544057m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f544058n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f544059o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f544060p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f544061q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f544062r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f544063s;

    /* renamed from: t, reason: collision with root package name */
    public int f544064t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f544065u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f544066v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f544067w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f544068x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f544069y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Map f544070z;

    public i0(gk2.e liveData, android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f544051d = liveData;
        this.f544052e = root;
        this.f544053f = plugin;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f544054g = arrayList;
        this.f544055h = new java.util.ArrayList();
        this.f544056i = new java.util.ArrayList();
        this.f544057m = new java.util.ArrayList();
        this.f544058n = new java.util.ArrayList();
        this.f544059o = new java.util.ArrayList();
        this.f544060p = new java.util.ArrayList();
        this.f544062r = jz5.h.b(new yi2.h0(this));
        this.f544066v = true;
        this.f544070z = new java.util.LinkedHashMap();
        this.A = new java.util.LinkedHashMap();
        this.B = new java.util.LinkedHashMap();
        this.C = true;
        this.D = new java.util.LinkedHashMap();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.tm7);
        this.E = recyclerView;
        this.G = jz5.h.b(new yi2.z(this));
        this.H = jz5.h.b(new yi2.y(this));
        this.I = new yi2.d0(this);
        this.L = new android.os.Handler(android.os.Looper.getMainLooper());
        float dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        recyclerView.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1(2, 1));
        recyclerView.mo7960x6cab2c8d(new yi2.q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14239x69c47021(liveData, this), arrayList));
        recyclerView.N(new yi2.r(dimensionPixelSize));
        recyclerView.O(new yi2.s(this));
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "recyclerView");
        this.F = new wi2.c(context, recyclerView, arrayList);
        this.K = new yi2.v(this);
    }

    @Override // si2.a
    public void a() {
        this.f544061q = !this.f544061q;
        l();
    }

    @Override // si2.a
    public void b() {
        fj2.s.f344716a.a(ml2.k1.f409172f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f544053f;
        x7Var.f446856d.setBackground(null);
        x7Var.D1();
        ((qi2.v) ((jz5.n) this.G).mo141623x754a37bb()).I(((mm2.y2) this.f544051d.a(mm2.y2.class)).f411096p, true);
    }

    @Override // si2.a
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f544050J;
        if (c2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7 p7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2 e2Var = p7Var.f195372b;
            boolean N6 = ((mm2.y2) e2Var.m57780xd052fc2c().a(mm2.y2.class)).N6(true, 1, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = p7Var.f195371a;
            if (!N6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x7Var.f196570q, "onInviteAnchorClick invalid");
                return;
            }
            fj2.s.f344716a.d(ml2.q2.H, e2Var.m57585x94f3eb9b(), null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar = x7Var.f196579z;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2 e2Var2 = x7Var.S;
            if (e2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveApplyLinkAnchorView");
                throw null;
            }
            mnVar.B = e2Var2.m57585x94f3eb9b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar2 = x7Var.f196579z;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = mnVar2.f200629t;
            ppVar.getClass();
            dk2.xf k17 = dk2.ef.f314905a.k(ppVar.f200928a);
            if (k17 != null) {
                ((dk2.r4) k17).C(null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.op(ppVar));
            }
            ((java.util.LinkedHashMap) ppVar.f200937j).clear();
            android.view.ViewGroup viewGroup = mnVar2.f200616d;
            viewGroup.setVisibility(0);
            viewGroup.animate().translationX(0.0f).setListener(null).start();
            ((java.util.LinkedHashMap) mnVar2.C).clear();
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409360p, "", -1, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // si2.a
    public void d(int i17, km2.q micUser) {
        java.lang.Object obj;
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.List list2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUser, "micUser");
        if ((micUser.f390714l == 7) == true) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dm6), 0).show();
            return;
        }
        mm2.y2 y2Var = (mm2.y2) this.f544051d.a(mm2.y2.class);
        java.util.Map map = ((mm2.o4) y2Var.m147920xbba4bfc0(mm2.o4.class)).f410859u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        java.lang.String str = micUser.f390703a;
        synchronized (map) {
            obj = map.get(str);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
        java.lang.Object obj2 = null;
        r4 = null;
        java.lang.String str2 = null;
        if (!y2Var.N6(true, (arrayList2 != null ? arrayList2.size() : 0) + 1, true)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptAnchor invalid position: ");
            sb6.append(i17);
            sb6.append(" nick: ");
            r45.xn1 xn1Var = micUser.f390720r;
            if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                str2 = c19782x23db1cfa.m76184x8010e5e4();
            }
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", sb6.toString());
            return;
        }
        fj2.s.f344716a.d(ml2.q2.S, this.f544068x, new hi2.a(micUser));
        gk2.e eVar = this.f544051d;
        if (eVar != null && (list2 = ((mm2.o4) eVar.a(mm2.o4.class)).f410851o) != null) {
            synchronized (list2) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390703a, micUser.f390703a)) {
                        obj2 = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj2;
            if (qVar != null) {
                qVar.f390714l = 6;
            }
        }
        gk2.e eVar2 = this.f544051d;
        if (eVar2 != null && (list = ((mm2.o4) eVar2.a(mm2.o4.class)).f410851o) != null) {
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    km2.q qVar2 = (km2.q) obj3;
                    if ((!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar2.f390703a, micUser.f390703a) && qVar2.f390710h && qVar2.f390714l == 0) != false) {
                        arrayList.add(obj3);
                    }
                }
            }
            synchronized (arrayList) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((km2.q) it6.next()).f390714l = 7;
                }
            }
        }
        l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f544050J;
        if (c2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var).a(micUser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    @Override // si2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r52, r45.xn1 r53) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.i0.e(int, r45.xn1):void");
    }

    @Override // si2.a
    public void f(int i17, r45.xn1 xn1Var) {
        java.util.List list;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        gk2.e eVar = this.f544051d;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f410852p) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((km2.q) next).f390705c;
                    if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                        obj = c19782x23db1cfa.m76197x6c03c64c();
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, obj)) {
                        obj = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f390714l = 6;
            }
        }
        l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f544050J;
        if (c2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var).c(xn1Var);
        }
    }

    @Override // si2.a
    public void g() {
        fj2.s.c(fj2.s.f344716a, ml2.q2.C, null, null, 0, 0, 30, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f544050J;
        if (c2Var != null) {
            fj2.j jVar = fj2.j.f344707a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var).f195371a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = x7Var.P;
            android.content.Context context = x7Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            x7Var.P = jVar.c(k0Var, context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o7(x7Var));
        }
    }

    @Override // si2.a
    public void h() {
        fj2.s.f344716a.d(ml2.q2.W, this.f544068x, null);
        long j17 = ((mm2.o4) this.f544051d.a(mm2.o4.class)).U.f458667i;
        jz5.g gVar = this.H;
        ((yi2.c) ((jz5.n) gVar).mo141623x754a37bb()).f544033i = this.f544068x;
        yi2.c cVar = (yi2.c) ((jz5.n) gVar).mo141623x754a37bb();
        int i17 = (int) j17;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Opening panel with setting: " + i17);
        cVar.f544036o = i17;
        cVar.y(i17);
        cVar.w();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l7) this.f544053f.F).i();
    }

    @Override // si2.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f544050J;
        if (c2Var != null) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.k1 k1Var = ml2.k1.f409171e;
            ml2.y4 y4Var = ml2.j0.f409116i;
            ((ml2.j0) c17).Bj(12, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var).f195371a;
            ((mm2.o4) x7Var.P0(mm2.o4.class)).R = 1;
            x7Var.E1();
        }
    }

    public final java.util.ArrayList j() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(this.f544057m);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            java.lang.Object obj3 = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            km2.q qVar = (km2.q) next;
            java.util.List list = ((mm2.o4) this.f544051d.a(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it6.next();
                    java.lang.String str = ((km2.q) next2).f390705c;
                    r45.xn1 xn1Var = qVar.f390720r;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, (xn1Var == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76197x6c03c64c())) {
                        obj3 = next2;
                        break;
                    }
                }
            }
            if (obj3 == null) {
                arrayList3.add(next);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList3) {
            km2.q qVar2 = (km2.q) obj4;
            java.util.List list2 = ((mm2.o4) this.f544051d.a(mm2.o4.class)).f410858t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserTempList>(...)");
            synchronized (list2) {
                java.util.Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    java.lang.String str2 = ((km2.q) obj2).f390705c;
                    r45.xn1 xn1Var2 = qVar2.f390720r;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, (xn1Var2 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c())) {
                        break;
                    }
                }
            }
            if (obj2 == null) {
                arrayList4.add(obj4);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList4) {
            km2.q qVar3 = (km2.q) obj5;
            java.util.List list3 = ((mm2.o4) this.f544051d.a(mm2.o4.class)).f410851o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-linkMicUserList>(...)");
            synchronized (list3) {
                java.util.Iterator it8 = list3.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it8.next();
                    java.lang.String str3 = ((km2.q) obj).f390705c;
                    r45.xn1 xn1Var3 = qVar3.f390720r;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, (xn1Var3 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c())) {
                        break;
                    }
                }
            }
            if (obj == null) {
                arrayList5.add(obj5);
            }
        }
        arrayList.addAll(arrayList5);
        return arrayList;
    }

    public final void k() {
        if (!this.f544066v || this.f544065u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "loadRecommInfo() skipped - isRecommendMoreData=" + this.f544066v + ", isRecommendLoading=" + this.f544065u);
            return;
        }
        byte[] bArr = this.f544057m.size() == 0 ? this.f544069y : null;
        this.f544065u = true;
        dk2.xf k17 = dk2.ef.f314905a.k(this.f544051d);
        if (k17 != null) {
            ((dk2.r4) k17).C(this.f544063s, bArr, new yi2.c0(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ea A[EDGE_INSN: B:254:0x04ea->B:255:0x04ea BREAK  A[LOOP:12: B:245:0x04be->B:267:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[LOOP:12: B:245:0x04be->B:267:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.i0.l():void");
    }
}
