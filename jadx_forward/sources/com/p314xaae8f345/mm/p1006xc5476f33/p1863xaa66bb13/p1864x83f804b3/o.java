package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o f230234a = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o();

    public final void a(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.i(str, str2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n.f230232f.i(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateHelper", "notifyBeforeAddContact " + str + ", " + str2);
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.f(z3Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n.f230232f.f(z3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyBeforeAddOpenIMContact ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateHelper", sb6.toString());
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.t(z3Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n.f230232f.t(z3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyBeforeDelContact ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateHelper", sb6.toString());
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(vg3.s4.class)).all().iterator();
        while (it.hasNext()) {
            vg3.s4 s4Var = (vg3.s4) ((fs.q) it.next()).get();
            if (s4Var != null) {
                s4Var.q(z3Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n.f230232f.q(z3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyBeforeDelOpenIMContact ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateHelper", sb6.toString());
    }
}
