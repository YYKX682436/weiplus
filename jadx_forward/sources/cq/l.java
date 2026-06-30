package cq;

/* loaded from: classes2.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.v0 f302765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f302766b;

    public l(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, long j17) {
        this.f302765a = v0Var;
        this.f302766b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = ((r45.sv0) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("has contact: ");
            int i17 = 0;
            sb6.append(c19792x256d2725.m76760x76845fea() != null);
            sb6.append(", contact nickname: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
            sb6.append(m76760x76845fea != null ? m76760x76845fea.m76184x8010e5e4() : null);
            sb6.append(", contact isBiz: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d2725.m76760x76845fea();
            sb6.append((m76760x76845fea2 != null ? ya2.d.a(m76760x76845fea2, false) : null) != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderFeedBase", sb6.toString());
            bu2.j jVar = bu2.j.f106067a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
            com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f302765a;
            if (v0Var != null) {
                i17 = v0Var.mo13822xfb85f7b0();
            }
            jVar.n(a17, new bu2.h(i17, this.f302766b));
        }
        java.util.LinkedList m75941xfb8219142 = ((r45.sv0) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
        java.util.Iterator it = m75941xfb8219142.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            sb7.append(pm0.v.u(((java.lang.Number) it6.next()).longValue()));
            sb7.append(",");
        }
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        java.lang.String Z = r26.n0.Z(sb8, ",");
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88459i = Z;
        iaVar.f88452b = 33;
        return java.lang.Boolean.valueOf(c5445x963cab3.e());
    }
}
