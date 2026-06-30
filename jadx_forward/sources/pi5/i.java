package pi5;

/* loaded from: classes.dex */
public final class i extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f436384d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436385e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f436386f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f436387g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f436388h;

    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String chatroom, java.lang.String ownerHeadDisplay) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerHeadDisplay, "ownerHeadDisplay");
        this.f436384d = activity;
        this.f436385e = chatroom;
        this.f436386f = ownerHeadDisplay;
        jz5.h.b(pi5.g.f436380d);
        this.f436388h = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int size;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.LinkedList linkedList = this.f436388h;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = this.f436387g;
        if (linkedList != null && a3Var2 != null) {
            int size2 = linkedList.size();
            int i17 = request.f544677b;
            if (i17 < size2) {
                int size3 = linkedList.size();
                int i18 = request.f544678c;
                if (size3 > i17 + i18) {
                    dVar.f544681b = true;
                    size = i18 + i17;
                } else {
                    size = linkedList.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i17 < size) {
                    arrayList.add(linkedList.get(i17));
                    i17++;
                }
                for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList)) {
                    if (((int) z3Var.E2) != 0) {
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i19 = ri5.j.U;
                        java.lang.String d17 = z3Var.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        dVar.f544682c.add(ui5.b.f509674g.a(this.f436384d, hVar.a(d17, i19, 0), z3Var, i19, this.f436386f, bVar));
                    } else {
                        a3Var = a3Var2;
                    }
                    a3Var2 = a3Var;
                }
            }
        }
        v65.i.b(scope, null, new pi5.h(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.List<java.lang.String> A0;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f436385e);
        this.f436387g = z07;
        if (z07 == null || (A0 = z07.A0()) == null) {
            return;
        }
        for (java.lang.String str : A0) {
            if (z07.G0(str)) {
                this.f436388h.add(str);
            }
        }
    }
}
