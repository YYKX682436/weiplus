package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class p7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.nb f183990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f183991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.nb f183992c;

    public p7(zy2.nb nbVar, int i17, zy2.nb nbVar2) {
        this.f183990a = nbVar;
        this.f183991b = i17;
        this.f183992c = nbVar2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = this.f183991b;
        if (i17 == 0 && fVar.f152149b == 0) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184020a;
            r45.ia1 ia1Var = (r45.ia1) fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184021b = ia1Var != null ? ia1Var.m75939xb282bd08(2) : 300;
            r45.ia1 ia1Var2 = (r45.ia1) fVar.f152151d;
            if (ia1Var2 != null && (m75941xfb821914 = ia1Var2.m75941xfb821914(1)) != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((r45.ey2) obj2).m75939xb282bd08(2) == i18) {
                        break;
                    }
                }
                r45.ey2 ey2Var = (r45.ey2) obj2;
                if (ey2Var != null) {
                    java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184020a;
                    int m75939xb282bd08 = ey2Var.m75939xb282bd08(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSvrExptManager", "setHitCache, exptId:" + i18 + ", value:" + m75939xb282bd08);
                    if (i18 == 1) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, java.lang.Integer.valueOf(m75939xb282bd08));
                    }
                    zy2.nb nbVar = this.f183992c;
                    if (nbVar != null) {
                        nbVar.a(java.lang.Integer.valueOf(ey2Var.m75939xb282bd08(0)));
                    }
                }
            }
        } else {
            zy2.nb nbVar2 = this.f183990a;
            if (nbVar2 != null) {
                nbVar2.a(java.lang.Integer.valueOf(fVar.f152149b));
            }
        }
        int i19 = fVar.f152148a;
        if ((i19 == 0 && fVar.f152149b == 0) || i19 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q7.f184020a.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(c01.id.e()));
        }
        return jz5.f0.f384359a;
    }
}
