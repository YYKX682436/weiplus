package pi5;

/* loaded from: classes.dex */
public final class y extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f436428d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436429e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f436430f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f436431g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f436432h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f436433i;

    public /* synthetic */ y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(activityC0065xcd7aa112, str, (i17 & 4) != 0 ? false : z17);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int size;
        java.util.ArrayList arrayList;
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.List list = this.f436433i;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = this.f436432h;
        int i18 = 1;
        java.util.ArrayList arrayList2 = dVar.f544682c;
        if (list != null && a3Var2 != null) {
            int size2 = list.size();
            int i19 = request.f544677b;
            if (i19 < size2) {
                int size3 = list.size();
                int i27 = request.f544678c;
                if (size3 > i19 + i27) {
                    dVar.f544681b = true;
                    size = i27 + i19;
                } else {
                    size = list.size();
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (i19 < size) {
                    arrayList3.add(list.get(i19));
                    i19++;
                }
                for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList3)) {
                    if (((int) z3Var.E2) != 0) {
                        arrayList = arrayList2;
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i28 = ri5.j.Z;
                        java.lang.String d17 = z3Var.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        ri5.j b18 = ui5.b.f509674g.b(this.f436428d, hVar.a(d17, i28, 0), z3Var, i28, bVar);
                        if (this.f436430f && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(b18.f477645g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), z3Var.d1())) {
                            i17 = 1;
                            java.lang.CharSequence concat = android.text.TextUtils.concat(b18.f477645g, this.f436428d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ieq));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(concat, "concat(...)");
                            b18.f477645g = concat;
                        } else {
                            i17 = 1;
                        }
                        arrayList.add(b18);
                    } else {
                        arrayList = arrayList2;
                        i17 = i18;
                        a3Var = a3Var2;
                    }
                    arrayList2 = arrayList;
                    i18 = i17;
                    a3Var2 = a3Var;
                }
            }
        }
        v65.i.b(scope, null, new pi5.w(b17, dVar, null), i18, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberDataSource", "dataList add size:%s", java.lang.Integer.valueOf(arrayList2.size()));
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
        java.util.List list;
        android.database.Cursor B;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f436428d;
        if ((activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activityC0065xcd7aa112).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
            arrayList.addAll(n0Var.D);
            hashSet.addAll(n0Var.f527853p);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f436429e;
        this.f436432h = a17.z0(str);
        if (arrayList.isEmpty()) {
            list = c01.v1.m(str);
            if (list != null) {
                list.removeAll(hashSet);
                p75.n0 n0Var2 = dm.e2.N1;
                p75.d dVar = dm.e2.P1;
                p75.i0 g17 = n0Var2.g(kz5.b0.c(dVar));
                g17.f434190d = dVar.l(list);
                g17.f434192f = kz5.c0.i(new p75.g("showHead", true), new g95.c());
                p75.l0 a18 = g17.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f436431g).mo141623x754a37bb()).Q4();
                if (Q4 != null && (B = Q4.B(a18.f434169a, a18.f434170b)) != null) {
                    while (B.moveToNext()) {
                        try {
                            arrayList2.add(B.getString(0));
                        } finally {
                        }
                    }
                    vz5.b.a(B, null);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = new java.util.HashMap();
                for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.d(arrayList2)) {
                    if (((int) z3Var.E2) != 0) {
                        java.lang.String d17 = z3Var.d1();
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f436432h;
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
                kz5.g0.t(arrayList2, new pi5.x(h0Var));
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                linkedList.clear();
                linkedList.addAll(arrayList2);
            } else {
                list = null;
            }
        } else {
            list = arrayList;
        }
        this.f436433i = list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberDataSource", "showMemberList: %s", arrayList);
    }

    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String chatroom, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        this.f436428d = activity;
        this.f436429e = chatroom;
        this.f436430f = z17;
        this.f436431g = jz5.h.b(pi5.v.f436423d);
    }
}
