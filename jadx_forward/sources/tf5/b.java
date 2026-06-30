package tf5;

/* loaded from: classes11.dex */
public final class b extends ym3.a implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f500487d = jz5.h.b(tf5.a.f500485d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f500488e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f500489f;

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f500488e;
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
                    dVar.f544682c.add(new tf5.g(z3Var, 2, z3Var.W0()));
                }
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    public boolean d(tf5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f500511d;
        if (!z3Var.r2() || z3Var.u2() || z3Var.o2() || z3Var.k2()) {
            return false;
        }
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        return !r26.n0.B(d17, "@", false);
    }

    public final void e(o75.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) cVar.f425123d;
        if (z3Var != null) {
            tf5.g gVar = new tf5.g(z3Var, 2, z3Var.W0());
            o75.b bVar = o75.b.f425114b;
            o75.b bVar2 = o75.b.f425115c;
            o75.b bVar3 = cVar.f425120a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar3, bVar2)) {
                if (!d(gVar) || (c16718x7059cefe2 = this.f500489f) == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.q(c16718x7059cefe2, gVar, false, 2, null);
                return;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar3, o75.b.f425116d)) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar3, o75.b.f425117e) || (c16718x7059cefe = this.f500489f) == null) {
                    return;
                }
                c16718x7059cefe.u(gVar);
                return;
            }
            if (d(gVar)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe3 = this.f500489f;
                if (c16718x7059cefe3 != null) {
                    c16718x7059cefe3.y(gVar, true);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe4 = this.f500489f;
            if (c16718x7059cefe4 != null) {
                c16718x7059cefe4.u(gVar);
            }
        }
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 0;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event.f425120a, o75.b.f425118f)) {
            e(event);
            return;
        }
        java.util.HashMap hashMap = event.f425124e;
        if (hashMap != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                e((o75.c) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f500488e;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) c01.d9.b().y()).m0("@t.qq.com");
        if (m07 != null) {
            arrayList2.add(m07.f276591b);
        }
        arrayList2.add("blogapp");
        arrayList2.add("tmessage");
        arrayList2.add("officialaccounts");
        arrayList2.add("helper_entry");
        arrayList2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ui());
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ai("wxid_wi_1d142z0zdj03")) {
            arrayList2.add("wxid_wi_1d142z0zdj03");
        }
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        g95.d dVar = g95.e.f351334a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.c(dVar2.s(arrayList2)).d(dVar2.j("weixin"));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        g17.f434189c = "MicroMsg.Mvvm.AddressDataSource";
        g17.f434190d = d17;
        g17.f434192f = dVar.h();
        java.util.Iterator it = g17.a().l(((jm0.l) ((jz5.n) this.f500487d).mo141623x754a37bb()).Q4()).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.AddressDataSource", "onCreate blockList=" + arrayList2 + " contactListSize=" + arrayList.size());
    }
}
