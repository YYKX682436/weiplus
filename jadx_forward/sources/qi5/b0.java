package qi5;

/* loaded from: classes.dex */
public final class b0 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f445332d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f445333e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f445334f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f445335g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f445336h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f445337i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f445338m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f445339n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f445340o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f445341p;

    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.util.Set blockList, java.util.List showChatroomList, java.lang.String selectShowHeadDisplay, java.lang.String unSelectShowHeadDisplay, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockList, "blockList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showChatroomList, "showChatroomList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectShowHeadDisplay, "selectShowHeadDisplay");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unSelectShowHeadDisplay, "unSelectShowHeadDisplay");
        this.f445332d = activity;
        this.f445333e = blockList;
        this.f445334f = showChatroomList;
        this.f445335g = selectShowHeadDisplay;
        this.f445336h = unSelectShowHeadDisplay;
        this.f445337i = z17;
        this.f445338m = jz5.h.b(qi5.x.f445385d);
        this.f445340o = jz5.h.b(new qi5.a0(this));
        this.f445341p = jz5.h.b(new qi5.z(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int i17;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        int i18 = 0;
        java.util.List list = null;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.List list2 = this.f445339n;
        int i19 = 1;
        if (list2 != null) {
            int size = list2.size();
            int i27 = request.f544677b;
            if (i27 < size) {
                int size2 = list2.size();
                int i28 = request.f544678c + i27;
                if (size2 > i28) {
                    dVar.f544681b = true;
                } else {
                    i28 = list2.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i27 < i28) {
                    arrayList.add(list2.get(i27));
                    i27++;
                }
                g95.w wVar = g95.x.f351360a;
                kz5.p0 p0Var = kz5.p0.f395529d;
                java.util.Iterator it = ((java.util.ArrayList) wVar.d(p0Var, arrayList)).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) it.next();
                    java.util.List m17 = ((qy.i) i95.n0.c(qy.i.class)) != null ? c01.v1.m(l4Var.h1()) : list;
                    if (m17 == null) {
                        m17 = p0Var;
                    }
                    java.lang.String r17 = c01.z1.r();
                    if (((m17.isEmpty() ? 1 : 0) ^ i19) != 0) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : m17) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, r17)) {
                                arrayList2.add(obj);
                            }
                        }
                        m17 = arrayList2;
                    }
                    if (m17.isEmpty()) {
                        i17 = i18;
                    } else {
                        java.util.Iterator it6 = ((java.util.ArrayList) d75.b.c(m17, 100)).iterator();
                        i17 = i18;
                        while (it6.hasNext()) {
                            java.util.List list3 = (java.util.List) it6.next();
                            p75.n0 n0Var2 = dm.e2.N1;
                            p75.d dVar2 = dm.e2.P1;
                            p75.i0 h17 = n0Var2.h(dVar2.h());
                            h17.f434190d = dVar2.l(list3).c(dm.e2.T1.g(i19, i19));
                            i17 += h17.a().m(gm0.j1.u().f354686f);
                        }
                    }
                    vi5.h hVar = new vi5.h(l4Var.w0(), null, null, 0, 14, null);
                    ri5.h hVar2 = ri5.j.I;
                    int i29 = ri5.j.Z;
                    java.lang.String h18 = l4Var.h1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getUsername(...)");
                    java.lang.String id6 = hVar2.a(h18, i29, i18);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f445332d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                    java.lang.String selectShowHeadDisplay = this.f445335g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectShowHeadDisplay, "selectShowHeadDisplay");
                    java.lang.String unSelectShowHeadDisplay = this.f445336h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unSelectShowHeadDisplay, "unSelectShowHeadDisplay");
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String h19 = l4Var.h1();
                    ((sg3.a) v0Var).getClass();
                    java.util.Iterator it7 = it;
                    kz5.p0 p0Var2 = p0Var;
                    android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, c01.a2.e(h19), i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
                    java.lang.String h110 = l4Var.h1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h110, "getUsername(...)");
                    ri5.j jVar = new ri5.j(id6, i29, h110, bj6, hVar, 0, 32, null);
                    jVar.n(null);
                    if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
                        jVar.f477660x = n0Var.e();
                        java.lang.String str = jVar.f477644f;
                        jVar.f477659w = n0Var.f(str);
                        boolean d17 = n0Var.d(str);
                        jVar.f477658v = d17;
                        jVar.f477648l1 = !d17 && n0Var.e(str);
                    }
                    if (jVar.f477659w) {
                        jVar.f477652p = selectShowHeadDisplay;
                    } else {
                        jVar.f477652p = unSelectShowHeadDisplay;
                    }
                    jVar.f477653q = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                    jVar.B = com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(l4Var.h1()) || c01.e2.E(l4Var.h1());
                    jVar.C = ((java.lang.Boolean) ((jz5.n) this.f445340o).mo141623x754a37bb()).booleanValue();
                    jVar.A = ((java.lang.Boolean) ((jz5.n) this.f445341p).mo141623x754a37bb()).booleanValue();
                    jVar.G = i17;
                    dVar.f544682c.add(jVar);
                    it = it7;
                    p0Var = p0Var2;
                    i18 = 0;
                    list = null;
                    i19 = 1;
                }
            }
        }
        v65.i.b(scope, null, new qi5.y(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return -1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        android.database.Cursor B;
        java.util.List list = this.f445334f;
        if (list.isEmpty()) {
            p75.d dVar = dm.i2.L;
            p75.m c17 = dVar.s(kz5.n0.S0(this.f445333e)).c(dVar.p("'%@chatroom'"));
            p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dVar));
            g17.f434190d = c17;
            g17.f434192f = kz5.b0.c(new g95.v());
            p75.l0 a17 = g17.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f445338m).mo141623x754a37bb()).Q4();
            if (Q4 != null && (B = Q4.B(a17.f434169a, a17.f434170b)) != null) {
                while (B.moveToNext()) {
                    try {
                        java.lang.String string = B.getString(0);
                        if (this.f445337i || !c01.e2.R(string)) {
                            arrayList.add(string);
                        }
                    } finally {
                    }
                }
                vz5.b.a(B, null);
            }
            list = arrayList;
        }
        this.f445339n = list;
    }
}
