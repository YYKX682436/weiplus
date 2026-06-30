package vu2;

/* loaded from: classes2.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 f521740d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6) {
        this.f521740d = c15114xedf903f6;
    }

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!(iVar instanceof db2.v) || !(fVar instanceof r45.sv0)) {
            return null;
        }
        vu2.d dVar = (i17 == 0 && i18 == 0) ? vu2.d.f521743f : vu2.d.f521744g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521740d;
        c15114xedf903f6.getClass();
        c15114xedf903f6.f210747o = dVar;
        if (c15114xedf903f6.f210747o == vu2.d.f521743f) {
            db2.v vVar = (db2.v) iVar;
            int i19 = vVar.f309726t;
            if (i19 == 0) {
                int i27 = vVar.f309727u;
                c15114xedf903f6.f210742g = i27;
                r4 = i27 > 0;
                c15114xedf903f6.f210744i = r4;
            } else if (i19 == 2) {
                int i28 = vVar.f309728v;
                c15114xedf903f6.f210743h = i28;
                r4 = i28 < kz5.c0.h(c15114xedf903f6.f210739d) || c15114xedf903f6.f210746n;
                c15114xedf903f6.f210745m = r4;
            } else if (i19 == 1000) {
                c15114xedf903f6.f210744i = c15114xedf903f6.f210742g > 0;
                c15114xedf903f6.f210745m = c15114xedf903f6.f210743h < kz5.c0.h(c15114xedf903f6.f210739d) || c15114xedf903f6.f210746n;
                if (c15114xedf903f6.f210744i || c15114xedf903f6.f210745m) {
                    r4 = true;
                }
            }
        }
        vu2.b bVar = new vu2.b(i17, i18, str);
        r45.sv0 sv0Var = (r45.sv0) fVar;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = sv0Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(cu2.u.f303974a.p(h90Var.a(c19792x256d2725, 256)));
        }
        bVar.m56420x2a5f836b(arrayList);
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList m75941xfb8219142 = sv0Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObjects(...)");
        tVar.j(m75941xfb8219142, 256, c15114xedf903f6.m56354xfe9224be());
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf7 = bVar.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        bVar.m56421x73095078(null);
        bVar.m56419xdac5ee4d(r4);
        bVar.m56423xd4b4a5a1(((db2.v) iVar).f309726t);
        return bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.mo56275x5cd06ba(obj, callback, z17);
        vu2.d dVar = vu2.d.f521742e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521740d;
        c15114xedf903f6.getClass();
        c15114xedf903f6.f210747o = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genInitCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo56472x42a6f7e5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521740d;
        java.util.List subList = c15114xedf903f6.f210739d.subList(c15114xedf903f6.f210742g, c15114xedf903f6.f210743h + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(0, java.lang.Long.valueOf(longValue));
            arrayList.add(rv0Var);
        }
        db2.v vVar = new db2.v(1000, new java.util.LinkedList(arrayList), c15114xedf903f6.m56354xfe9224be(), 0);
        vVar.f309727u = c15114xedf903f6.f210742g;
        vVar.f309728v = c15114xedf903f6.f210743h;
        return vVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521740d;
        if (c15114xedf903f6.f210743h >= kz5.c0.h(c15114xedf903f6.f210739d)) {
            return b();
        }
        int i17 = c15114xedf903f6.f210743h + 1;
        if (i17 < 0) {
            i17 = 0;
        }
        int h17 = kz5.c0.h(c15114xedf903f6.f210739d);
        if (i17 > h17) {
            i17 = h17;
        }
        int i18 = c15114xedf903f6.f210743h + c15114xedf903f6.f210741f;
        if (i18 < 0) {
            i18 = 0;
        }
        int h18 = kz5.c0.h(c15114xedf903f6.f210739d);
        if (i18 > h18) {
            i18 = h18;
        }
        java.util.List subList = c15114xedf903f6.f210739d.subList(i17, i18 + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(0, java.lang.Long.valueOf(longValue));
            arrayList.add(rv0Var);
        }
        db2.v vVar = new db2.v(2, new java.util.LinkedList(arrayList), c15114xedf903f6.m56354xfe9224be(), 0);
        vVar.f309727u = i17;
        vVar.f309728v = i18;
        return vVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521740d;
        int i17 = c15114xedf903f6.f210742g - c15114xedf903f6.f210741f;
        if (i17 < 0) {
            i17 = 0;
        }
        int h17 = kz5.c0.h(c15114xedf903f6.f210739d);
        if (i17 > h17) {
            i17 = h17;
        }
        int i18 = c15114xedf903f6.f210742g - 1;
        if (i18 < 0) {
            i18 = 0;
        }
        int h18 = kz5.c0.h(c15114xedf903f6.f210739d);
        if (i18 > h18) {
            i18 = h18;
        }
        java.util.List subList = c15114xedf903f6.f210739d.subList(i17, i18 + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(0, java.lang.Long.valueOf(longValue));
            arrayList.add(rv0Var);
        }
        db2.v vVar = new db2.v(0, new java.util.LinkedList(arrayList), c15114xedf903f6.m56354xfe9224be(), 0);
        vVar.f309727u = i17;
        vVar.f309728v = i18;
        return vVar;
    }
}
