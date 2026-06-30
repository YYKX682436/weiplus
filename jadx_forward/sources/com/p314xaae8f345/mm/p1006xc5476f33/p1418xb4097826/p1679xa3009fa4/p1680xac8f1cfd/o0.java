package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public abstract class o0 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u a(com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u(i17, i18, str, (r45.dt0) resp);
        uVar.m56419xdac5ee4d(((r45.dt0) fVar.f152151d).m75939xb282bd08(2) != 0);
        uVar.m56421x73095078(((r45.dt0) fVar.f152151d).m75934xbce7f2f(3));
        java.util.LinkedList m75941xfb821914 = ((r45.dt0) fVar.f152151d).m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            java.util.ArrayList<r45.bt0> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb821914) {
                if (!(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.bt0) obj).m75936x14adae67(0)) == null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (r45.bt0 bt0Var : arrayList2) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) bt0Var.m75936x14adae67(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19782x23db1cfa);
                java.lang.String m75945x2fec8307 = bt0Var.m75945x2fec8307(2);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.util.LinkedList m75941xfb8219142 = bt0Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t(c19782x23db1cfa, m75945x2fec8307, m75941xfb8219142));
            }
        } else {
            arrayList = null;
        }
        uVar.m56420x2a5f836b(arrayList);
        return uVar;
    }
}
