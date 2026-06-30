package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d30 f270044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.c f270045e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.c cVar, r45.d30 d30Var) {
        this.f270045e = cVar;
        this.f270044d = d30Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.sa7 sa7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c c19548xc9500d9c = this.f270045e.f270046a;
        int i17 = c19548xc9500d9c.f270038i;
        boolean z17 = c19548xc9500d9c.f270039m;
        r45.d30 d30Var = this.f270044d;
        if (d30Var == null) {
            return;
        }
        java.util.LinkedList linkedList = d30Var.f453564d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgManager", "response.PkgList.size() is empty");
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.k85 k85Var = (r45.k85) it.next();
            if (k85Var != null) {
                java.lang.String str = k85Var.f460023d;
                r45.va7 va7Var = k85Var.f460024e;
                r45.ra7 ra7Var = k85Var.f460026g;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    if (ra7Var != null) {
                        if (ra7Var.f466234e) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgManager", "wepkg reload now");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 17L, 1L, false);
                            if (k85Var.f460025f != null) {
                                ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd.f269861e).add(k85Var.f460023d);
                            }
                        }
                        if (ra7Var.f466233d) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(str, 2, 3);
                        }
                    }
                    if (va7Var != null && (sa7Var = va7Var.f469590e) != null) {
                        java.util.ArrayList arrayList2 = null;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sa7Var.f467134d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.f(str, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 18L, 1L, false);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.i(str, va7Var.f469590e.f467135e, r8.f467136f, r8.f467137g);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
                            c19540x47e34072.f269876h = 3009;
                            c19540x47e34072.f269877i.f269907d = str;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                                c19540x47e34072.z();
                            } else {
                                c19540x47e34072.s();
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e340722 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
                            c19540x47e340722.f269876h = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec;
                            c19540x47e340722.f269880o.f269896e = str;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                                c19540x47e340722.z();
                            } else {
                                c19540x47e340722.s();
                            }
                            if (z17) {
                                r45.ya7 ya7Var = k85Var.f460025f;
                                if (ya7Var != null) {
                                    r45.qa7 qa7Var = ya7Var.f472466f;
                                    r45.xa7 xa7Var = ya7Var.f472467g;
                                    arrayList2 = new java.util.ArrayList();
                                    if (qa7Var != null && qa7Var.f465328d != null) {
                                        arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(k85Var.f460023d + qa7Var.f465328d.f467793e));
                                    }
                                    if (xa7Var != null) {
                                        java.util.LinkedList linkedList2 = xa7Var.f471452d;
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                                            java.util.Iterator it6 = linkedList2.iterator();
                                            while (it6.hasNext()) {
                                                r45.ua7 ua7Var = (r45.ua7) it6.next();
                                                if (ua7Var != null && ua7Var.f468723f != null) {
                                                    arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(k85Var.f460023d + ua7Var.f468723f.f467793e));
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
                                    hashSet.addAll(arrayList2);
                                }
                            }
                            arrayList.add(k85Var);
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd.a();
        zz4.d dVar = zz4.b.f559242a;
        dVar.getClass();
        if (hashSet.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 20L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 21L, 1L, false);
            zz4.c cVar = new zz4.c(dVar);
            cVar.f559243a = hashSet.size();
            cVar.f559244b = 0L;
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                ((java.util.concurrent.ConcurrentHashMap) dVar.f559245a).put((java.lang.String) it7.next(), cVar);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            return;
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0.b().e((r45.k85) it8.next(), i17);
        }
    }
}
