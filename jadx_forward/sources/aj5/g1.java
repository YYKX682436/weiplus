package aj5;

/* loaded from: classes.dex */
public final class g1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f86964d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f86965e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f86966f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f86967g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f86968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f86964d = jz5.h.b(new aj5.v0(activity));
        this.f86965e = jz5.h.b(aj5.w0.f87057d);
        this.f86966f = new java.util.ArrayList();
        this.f86967g = jz5.h.b(new aj5.f1(this));
        this.f86968h = jz5.h.b(new aj5.u0(this));
    }

    public static final java.util.List T6(aj5.g1 g1Var, int i17, boolean z17, p13.v vVar) {
        g1Var.getClass();
        java.util.List subList = (!z17 || vVar.f432693e.size() <= 3) ? vVar.f432693e : vVar.f432693e.subList(0, 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(subList);
        java.util.Iterator it = subList.iterator();
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
                    arrayList.add(cVar.b(g1Var.m158354x19263085(), hVar.a(d17, i19, i17), z3Var, i19, dVar));
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
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
            if (!n17.s2()) {
                ti5.d dVar2 = new ti5.d(yVar, vVar.f432692d, i17, i18, 0, 0, null, z17, 112, null);
                ri5.h hVar2 = ri5.j.I;
                int i28 = ri5.j.W;
                java.lang.String d18 = n17.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                ri5.j b17 = cVar.b(g1Var.m158354x19263085(), hVar2.a(d18, i28, i17), n17, i28, dVar2);
                if (i18 == 0 && z17) {
                    b17.f477651o = true;
                    p13.r rVar = vVar.f432692d;
                    java.lang.String str = rVar != null ? rVar.f432662a : null;
                    if (str == null) {
                        str = "";
                    }
                    b17.f477652p = str;
                }
                arrayList.add(b17);
            }
            i18 = i27;
        }
    }

    public static final em.l2 U6(aj5.g1 g1Var) {
        return (em.l2) ((jz5.n) g1Var.f86967g).mo141623x754a37bb();
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f86966f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        S6(new aj5.x0(this));
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new aj5.y0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.ArrayList arrayList = this.f86966f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
