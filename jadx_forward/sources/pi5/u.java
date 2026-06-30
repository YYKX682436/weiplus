package pi5;

/* loaded from: classes.dex */
public final class u extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f436417d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436418e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f436419f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f436420g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f436421h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f436422i;

    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String chatroom, java.lang.String quoteMember, java.lang.String quoteShowHeadDisplay) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteMember, "quoteMember");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteShowHeadDisplay, "quoteShowHeadDisplay");
        this.f436417d = activity;
        this.f436418e = chatroom;
        this.f436419f = quoteMember;
        this.f436420g = quoteShowHeadDisplay;
        jz5.h.b(pi5.s.f436413d);
        this.f436422i = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int size;
        java.util.Iterator it;
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        pi5.u uVar = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        int i18 = 0;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.LinkedList linkedList = uVar.f436422i;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = uVar.f436421h;
        int i19 = 1;
        if (linkedList != null && a3Var2 != null) {
            int size2 = linkedList.size();
            int i27 = request.f544677b;
            if (i27 < size2) {
                int size3 = linkedList.size();
                int i28 = request.f544678c;
                if (size3 > i27 + i28) {
                    dVar.f544681b = true;
                    size = i28 + i27;
                } else {
                    size = linkedList.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i27 < size) {
                    arrayList.add(linkedList.get(i27));
                    i27++;
                }
                java.util.Iterator it6 = g95.e.f351334a.f(arrayList).iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it6.next();
                    if (((int) z3Var.E2) != 0) {
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i29 = ri5.j.R;
                        java.lang.String d17 = z3Var.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        java.lang.String id6 = hVar.a(d17, i29, i18);
                        ui5.a aVar = ui5.b.f509674g;
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = uVar.f436417d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                        java.lang.String quoteFromHeadDisplay = uVar.f436420g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteFromHeadDisplay, "quoteFromHeadDisplay");
                        it = it6;
                        si5.e a17 = si5.b.f489858a.a(activity, z3Var, bVar.f509676b, bVar.f509677c, bVar.f509675a);
                        java.lang.String d18 = z3Var.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                        java.lang.CharSequence charSequence = a17.f489862a;
                        java.lang.String str = "";
                        ri5.j jVar = new ri5.j(id6, i29, d18, charSequence == null ? "" : charSequence, bVar, 0, 32, null);
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
                        i17 = 1;
                        jVar.f477651o = true;
                        jVar.f477652p = quoteFromHeadDisplay;
                        jVar.f477653q = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                        jVar.f477657u = true;
                        dVar.f544682c.add(jVar);
                    } else {
                        it = it6;
                        i17 = i19;
                        a3Var = a3Var2;
                    }
                    uVar = this;
                    it6 = it;
                    i19 = i17;
                    a3Var2 = a3Var;
                    i18 = 0;
                }
            }
        }
        v65.i.b(scope, null, new pi5.t(b17, dVar, null), i19, null);
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
        this.f436421h = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f436418e);
        this.f436422i.add(this.f436419f);
    }
}
