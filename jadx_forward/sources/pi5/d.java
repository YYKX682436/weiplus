package pi5;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f436366d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436367e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f436368f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f436369g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f436370h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f436371i;

    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String chatroom, java.util.List showMemberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showMemberList, "showMemberList");
        this.f436366d = activity;
        this.f436367e = chatroom;
        this.f436368f = showMemberList;
        this.f436369g = jz5.h.b(pi5.a.f436361d);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        pi5.d dVar = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar2 = new ym3.d(request);
        int i17 = 0;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.List list = dVar.f436371i;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = dVar.f436370h;
        if (list != null && a3Var2 != null) {
            int size = list.size();
            int i18 = request.f544677b;
            if (i18 < size) {
                int size2 = list.size();
                int i19 = request.f544678c + i18;
                if (size2 > i19) {
                    dVar2.f544681b = true;
                } else {
                    i19 = list.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i18 < i19) {
                    arrayList.add(list.get(i18));
                    i18++;
                }
                java.util.Iterator it = ((java.util.ArrayList) g95.e.f351334a.f(arrayList)).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
                    if (((int) z3Var.E2) != 0) {
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i27 = ri5.j.Z;
                        java.lang.String d17 = z3Var.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        java.lang.String id6 = hVar.a(d17, i27, i17);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = dVar.f436366d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                        si5.a aVar = si5.b.f489858a;
                        si5.e a17 = aVar.a(activity, z3Var, bVar.f509676b, bVar.f509677c, bVar.f509675a);
                        java.lang.String d18 = z3Var.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                        java.lang.CharSequence charSequence = a17.f489862a;
                        java.lang.String str = "";
                        ri5.j jVar = new ri5.j(id6, i27, d18, charSequence == null ? "" : charSequence, bVar, 0, 32, null);
                        jVar.n(a17.f489863b);
                        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                        if (b0Var != null) {
                            java.lang.String fj6 = ((l41.q2) b0Var).fj(z3Var.Q0(), z3Var.G0());
                            if (fj6 != null) {
                                str = fj6;
                            }
                        }
                        jVar.f477649m = str;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", z3Var.Q0())) {
                            jVar.f477649m = "@" + ((java.lang.Object) jVar.f477649m);
                        }
                        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
                            jVar.f477660x = n0Var.e();
                            java.lang.String str2 = jVar.f477644f;
                            jVar.f477659w = n0Var.f(str2);
                            boolean d19 = n0Var.d(str2);
                            jVar.f477658v = d19;
                            jVar.f477648l1 = !d19 && n0Var.e(str2);
                        }
                        si5.d c17 = aVar.c(bVar.f509679e, z3Var, bVar.f509675a);
                        bVar.f509679e = c17.f489859a;
                        java.lang.String str3 = c17.f489860b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                        bVar.f509680f = str3;
                        jVar.o(c17.f489861c);
                        jVar.f477653q = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                        dVar2.f544682c.add(jVar);
                    } else {
                        a3Var = a3Var2;
                    }
                    dVar = this;
                    a3Var2 = a3Var;
                    i17 = 0;
                }
            }
        }
        v65.i.b(scope, null, new pi5.b(b17, dVar2, null), 1, null);
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
        java.util.List list;
        android.database.Cursor B;
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f436367e;
        this.f436370h = a17.z0(str);
        java.util.List list2 = this.f436368f;
        if (list2.isEmpty()) {
            list = c01.v1.m(str);
            if (list != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                linkedList.remove(c01.z1.r());
                p75.n0 n0Var = dm.e2.N1;
                p75.d dVar = dm.e2.P1;
                p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
                g17.f434190d = dVar.l(list);
                p75.l0 a18 = g17.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f436369g).mo141623x754a37bb()).Q4();
                if (Q4 != null && (B = Q4.B(a18.f434169a, a18.f434170b)) != null) {
                    while (B.moveToNext()) {
                        try {
                            arrayList.add(B.getString(0));
                        } finally {
                        }
                    }
                    vz5.b.a(B, null);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = new java.util.HashMap();
                for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.d(arrayList)) {
                    if (((int) z3Var.E2) != 0) {
                        java.lang.String d17 = z3Var.d1();
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f436370h;
                        java.lang.String z07 = a3Var != null ? a3Var.z0(d17) : null;
                        if (z07 == null || r26.n0.N(z07)) {
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            java.lang.String c17 = c01.a2.c(z3Var, d17);
                            java.util.Map map = (java.util.Map) h0Var.f391656d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                            java.lang.String k17 = o13.n.k(c17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getShowHeadPinYin(...)");
                            map.put(d17, k17);
                        } else {
                            java.util.Map map2 = (java.util.Map) h0Var.f391656d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                            java.lang.String k18 = o13.n.k(z07);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getShowHeadPinYin(...)");
                            map2.put(d17, k18);
                        }
                    }
                }
                kz5.g0.t(arrayList, new pi5.c(h0Var));
                linkedList.clear();
                linkedList.addAll(arrayList);
            } else {
                list = null;
            }
        } else {
            list = list2;
        }
        this.f436371i = list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneChatRoomMemberDataSource", "showMemberList: %s", list2);
    }
}
