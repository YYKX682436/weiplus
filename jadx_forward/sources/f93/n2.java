package f93;

/* loaded from: classes.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f341929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f341930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f341929d = arrayList;
        this.f341930e = arrayList2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f93.n2(this.f341929d, this.f341930e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f93.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Set linkedHashSet;
        java.lang.String D0;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
        if (wi6 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String u17 = wi6.u1(this.f341929d);
        if (u17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelRecommendUI", "doBatchSaveLabels: selectedLabelIdStr is null");
            return null;
        }
        java.util.List f07 = r26.n0.f0(u17, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f07.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doBatchSaveLabels: users=");
        java.util.ArrayList arrayList2 = this.f341930e;
        sb6.append(arrayList2.size());
        sb6.append(", selectedIds=");
        sb6.append(X0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
            if (n17 == null || (D0 = n17.D0()) == null) {
                linkedHashSet = new java.util.LinkedHashSet();
            } else {
                java.util.List f08 = r26.n0.f0(D0, new java.lang.String[]{","}, false, 0, 6, null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : f08) {
                    if (((java.lang.String) obj2).length() > 0) {
                        arrayList3.add(obj2);
                    }
                }
                linkedHashSet = kz5.n0.W0(arrayList3);
            }
            java.util.Set set = linkedHashSet;
            set.addAll(X0);
            java.lang.String g07 = kz5.n0.g0(set, ",", null, null, 0, null, null, 62, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "doBatchSaveLabels: user=" + str + ", mergedIds=" + g07);
            if (n17 != null) {
                n17.r1(g07);
                Bi.p0(str, n17);
            }
            r45.gw6 gw6Var = new r45.gw6();
            gw6Var.f457115e = g07;
            gw6Var.f457114d = str;
            linkedList.add(gw6Var);
        }
        return linkedList;
    }
}
