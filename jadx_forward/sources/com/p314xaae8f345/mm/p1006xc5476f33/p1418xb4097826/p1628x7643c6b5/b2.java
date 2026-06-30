package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class b2 implements zy2.u9 {

    /* renamed from: b, reason: collision with root package name */
    public zy2.t9 f207542b;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f207541a = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.a2(this));

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f207543c = new java.util.concurrent.ConcurrentHashMap();

    public void a(int i17, java.util.List feeds, int i18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(feeds, 10));
        java.util.Iterator it = feeds.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 0);
            so2.u1 u1Var = new so2.u1(a17);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f207543c;
            java.lang.Long valueOf = java.lang.Long.valueOf(u1Var.mo2128x1ed62e84());
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(a17.m59264x7efe73ec());
            if (mb4Var == null || (str = mb4Var.m75945x2fec8307(9)) == null) {
                str = "";
            }
            concurrentHashMap.put(valueOf, str);
            arrayList.add(new jz5.l(u1Var, u1Var.getFeedObject().m59264x7efe73ec()));
        }
        jz5.l lVar = (jz5.l) kz5.n0.Z(arrayList);
        if (lVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.y1) ((jz5.n) this.f207541a).mo141623x754a37bb()).e(new ek4.b(1, -1, i17, 4, 0L, null, i18, 48, null), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.a((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) lVar.f384366d), kz5.n0.V0(arrayList), 0);
        }
    }
}
