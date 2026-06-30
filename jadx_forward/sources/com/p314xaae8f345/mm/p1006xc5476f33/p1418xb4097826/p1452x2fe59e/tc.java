package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class tc implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f190587a;

    public tc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar) {
        this.f190587a = idVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DrawerPresenter", "loadMoreData resp null");
            return new java.util.LinkedList();
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            return new java.util.LinkedList();
        }
        this.f190587a.n(((r45.j61) fVar).m75939xb282bd08(3) == 1);
        this.f190587a.f188548u = ((r45.j61) fVar2.f152151d).m75934xbce7f2f(2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f190587a.f188548u == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f190587a.f188548u;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id.j(this.f190587a)) {
            int mo56041x7520bed6 = this.f190587a.mo56041x7520bed6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
            if (mo56041x7520bed6 == 2) {
                java.util.LinkedList m75941xfb821914 = ((r45.j61) fVar2.f152151d).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLikeList(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar = this.f190587a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb821914) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.md1) obj2).m75945x2fec8307(5), idVar.f188541n)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        return ((r45.j61) fVar2.f152151d).m75941xfb821914(1);
    }
}
