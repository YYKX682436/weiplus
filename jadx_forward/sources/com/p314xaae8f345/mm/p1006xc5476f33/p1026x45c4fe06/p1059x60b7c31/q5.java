package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class q5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f164389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f164390b;

    public q5(java.util.List list, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f164389a = list;
        this.f164390b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        java.util.LinkedList session_info_list = ((v53.g) ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152151d).f514870d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(session_info_list, "session_info_list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = session_info_list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((v53.o) next).f514890m == 1 ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((v53.o) it6.next()).f514884d);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : this.f164389a) {
            java.lang.Object obj3 = ((java.util.Map) obj2).get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            if (arrayList2.contains((java.lang.String) obj3)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            java.lang.Object obj4 = ((java.util.Map) it7.next()).get("unreadCount");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
            arrayList4.add(java.lang.Integer.valueOf(((java.lang.Integer) obj4).intValue()));
        }
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it8 = arrayList4.iterator();
            if (!it8.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next2 = it8.next();
            while (it8.hasNext()) {
                next2 = java.lang.Integer.valueOf(((java.lang.Number) next2).intValue() + ((java.lang.Number) it8.next()).intValue());
            }
            i17 = ((java.lang.Number) next2).intValue();
        }
        java.lang.String.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11917xa9d79856 c11917xa9d79856 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11917xa9d79856(i17, "get redcount", true);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f164390b;
        if (rVar == null) {
            return null;
        }
        rVar.a(c11917xa9d79856);
        return jz5.f0.f384359a;
    }
}
