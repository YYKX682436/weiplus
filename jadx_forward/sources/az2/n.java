package az2;

/* loaded from: classes2.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az2.o f97678a;

    public n(az2.o oVar) {
        this.f97678a = oVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = ((r45.sv0) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            bu2.j jVar = bu2.j.f106067a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = h90Var.a(c19792x256d2725, 0);
            az2.o oVar = this.f97678a;
            jVar.n(a17, new bu2.h(oVar.f152179f.f152246d, oVar.D()));
        }
        java.util.LinkedList m75941xfb8219142 = ((r45.sv0) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
        java.util.Iterator it = m75941xfb8219142.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            sb6.append(pm0.v.u(((java.lang.Number) it6.next()).longValue()));
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        java.lang.String Z = r26.n0.Z(sb7, ",");
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88459i = Z;
        iaVar.f88452b = 33;
        return java.lang.Boolean.valueOf(c5445x963cab3.e());
    }
}
