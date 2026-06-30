package aj5;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f87036d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f87037e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f87038f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f87039g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f87040h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f87041i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f87042m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f87036d = jz5.h.b(new aj5.e0(activity));
        this.f87037e = jz5.h.b(aj5.f0.f86959d);
        this.f87038f = new java.util.ArrayList();
        this.f87039g = jz5.h.b(new aj5.q0(this));
        this.f87040h = jz5.h.b(new aj5.d0(this));
        this.f87041i = new java.util.ArrayList();
    }

    public static final java.util.List T6(aj5.r0 r0Var, int i17, boolean z17, p13.v vVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var;
        r0Var.getClass();
        java.util.List list = vVar.f432693e;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        if (z17 && list.size() > 3) {
            list = kz5.n0.K0(list, 3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = x3Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi() : null;
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ti5.c cVar = ti5.d.f501196i;
            if (!hasNext) {
                if (z17 && vVar.f432693e.size() > 3) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var.X1(i17 + "_collapse");
                    ti5.d dVar = new ti5.d(null, null, i17, Integer.MAX_VALUE, 0, 0, null, z17, 115, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.X;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    arrayList.add(cVar.b(r0Var.m158354x19263085(), hVar.a(d17, i19, i17), z3Var, i19, dVar));
                }
                return arrayList;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar = (p13.y) next;
            java.lang.String str = yVar.f432720e;
            java.lang.String str2 = str instanceof java.lang.String ? str : null;
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectContactAddressBookSearchUIC", "Invalid auxIndex type: ".concat(str.getClass().getSimpleName()));
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi != null ? Bi.n(str2, true) : null;
                if (n17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectContactAddressBookSearchUIC", "Contact not found for username: ".concat(str2));
                } else if (!n17.s2()) {
                    k4Var = Bi;
                    ti5.d dVar2 = new ti5.d(yVar, vVar.f432692d, i17, i18, 0, 0, null, z17, 112, null);
                    ri5.h hVar2 = ri5.j.I;
                    int i28 = ri5.j.W;
                    java.lang.String d18 = n17.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                    ri5.j b17 = cVar.b(r0Var.m158354x19263085(), hVar2.a(d18, i28, i17), n17, i28, dVar2);
                    if (i18 == 0 && z17) {
                        b17.f477651o = true;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\"");
                        p13.r rVar = vVar.f432692d;
                        java.lang.String str3 = rVar != null ? rVar.f432662a : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb6.append(str3);
                        sb6.append('\"');
                        b17.o(sb6.toString());
                    }
                    arrayList.add(b17);
                    i18 = i27;
                    Bi = k4Var;
                }
            }
            k4Var = Bi;
            i18 = i27;
            Bi = k4Var;
        }
    }

    public static final em.l2 U6(aj5.r0 r0Var) {
        return (em.l2) ((jz5.n) r0Var.f87039g).mo141623x754a37bb();
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f87038f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        S6(new aj5.g0(this));
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new aj5.h0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.ArrayList arrayList = this.f87038f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
