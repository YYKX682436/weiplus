package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class r4 implements com.p314xaae8f345.mm.p944x882e457a.u0, np5.e {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f227108d;

    /* renamed from: e, reason: collision with root package name */
    public np5.f f227109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f227110f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f227111g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f227112h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f227113i = new java.util.HashSet();

    public r4(android.content.Context context, np5.f fVar) {
        this.f227109e = null;
        this.f227108d = context;
        this.f227109e = fVar;
    }

    @Override // np5.e
    public void a(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (m1Var != null && (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1)) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1) m1Var).m82989x7c4af7d8(null);
        }
        this.f227110f.add(m1Var);
        if (z17 && ((u3Var = this.f227112h) == null || !u3Var.isShowing())) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f227112h;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            android.content.Context context = this.f227108d;
            this.f227112h = db5.e1.Q(context, null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p4(this));
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(m1Var);
    }

    @Override // np5.e
    public void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227112h;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f227112h.dismiss();
    }

    public void c(int i17) {
        ((java.util.HashSet) this.f227113i).add(java.lang.Integer.valueOf(i17));
        gm0.j1.i();
        gm0.j1.n().f354821b.a(i17, this);
    }

    public void d(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (m1Var != null && (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1)) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1) m1Var).m82989x7c4af7d8(null);
        }
        this.f227111g.add(m1Var);
        if (z17 && ((u3Var = this.f227112h) == null || !u3Var.isShowing())) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f227112h;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            android.content.Context context = this.f227108d;
            this.f227112h = db5.e1.P(context, null, 3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q4(this));
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(m1Var);
    }

    public void e() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227112h;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f227112h = null;
        }
        java.util.HashSet hashSet = this.f227110f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.d(m1Var);
        }
        java.util.HashSet hashSet2 = this.f227111g;
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = (com.p314xaae8f345.mm.p944x882e457a.m1) it6.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.d(m1Var2);
        }
        hashSet.clear();
        hashSet2.clear();
    }

    public void f(int i17) {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(i17, this);
        java.util.Set set = this.f227113i;
        ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
        if (((java.util.HashSet) set).isEmpty()) {
            e();
            this.f227109e = null;
            this.f227108d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        boolean z18;
        np5.f fVar;
        java.util.HashSet hashSet = this.f227111g;
        boolean contains = hashSet.contains(m1Var);
        java.util.HashSet hashSet2 = this.f227110f;
        if (contains) {
            hashSet.remove(m1Var);
        } else {
            if (!hashSet2.contains(m1Var)) {
                z17 = false;
                if (hashSet.isEmpty() || !hashSet2.isEmpty()) {
                    z18 = false;
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227112h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        this.f227112h = null;
                    }
                    z18 = true;
                }
                if (z17 || (fVar = this.f227109e) == null) {
                }
                fVar.mo66167x76e0bfae(i17, i18, str, m1Var, z18);
                return;
            }
            hashSet2.remove(m1Var);
        }
        z17 = true;
        if (hashSet.isEmpty()) {
        }
        z18 = false;
        if (z17) {
        }
    }
}
