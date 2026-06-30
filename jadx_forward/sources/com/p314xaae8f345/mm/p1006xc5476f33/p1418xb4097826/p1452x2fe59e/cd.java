package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class cd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f188002a;

    public cd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar) {
        this.f188002a = idVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DrawerPresenter", "refreshData resp null");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc(false, null, null, null);
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc(false, null, null, null);
        }
        this.f188002a.f188548u = ((r45.j61) fVar).m75934xbce7f2f(2);
        this.f188002a.f188546s = ((r45.j61) fVar2.f152151d).m75939xb282bd08(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshData lastBuffer ");
        if (this.f188002a.f188548u == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f188002a.f188548u;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        sb6.append(" totalCount ");
        sb6.append(this.f188002a.f188546s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
        this.f188002a.n(((r45.j61) fVar2.f152151d).m75939xb282bd08(3) == 1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 g17 = c01.z1.g();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contact: ");
        sb7.append(g17 == null);
        sb7.append(", canShowLikeEdu:");
        sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id.j(this.f188002a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb7.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id.j(this.f188002a)) {
            int mo56041x7520bed6 = this.f188002a.mo56041x7520bed6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
            if (mo56041x7520bed6 == 2 && g17 != null) {
                r45.md1 md1Var = new r45.md1();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar = this.f188002a;
                md1Var.set(0, g17.f2());
                md1Var.set(5, idVar.f188541n);
                md1Var.set(2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                linkedList.add(md1Var);
                java.util.LinkedList m75941xfb821914 = ((r45.j61) fVar2.f152151d).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLikeList(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar2 = this.f188002a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb821914) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.md1) obj2).m75945x2fec8307(5), idVar2.f188541n)) {
                        arrayList.add(obj2);
                    }
                }
                linkedList.addAll(arrayList);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc(true, linkedList, (r45.tl6) ((r45.j61) fVar2.f152151d).m75936x14adae67(5), (r45.a31) ((r45.j61) fVar2.f152151d).m75936x14adae67(6));
            }
        }
        linkedList.addAll(((r45.j61) fVar2.f152151d).m75941xfb821914(1));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc(true, linkedList, (r45.tl6) ((r45.j61) fVar2.f152151d).m75936x14adae67(5), (r45.a31) ((r45.j61) fVar2.f152151d).m75936x14adae67(6));
    }
}
