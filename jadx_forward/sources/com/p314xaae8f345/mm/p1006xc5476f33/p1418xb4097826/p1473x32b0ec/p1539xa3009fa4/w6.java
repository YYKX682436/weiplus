package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class w6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f199049a;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        this.f199049a = b8Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
            java.util.LinkedList m75941xfb821914 = ((r45.hv1) fVar.f152151d).m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGame_category_list(...)");
            b3Var.e(m75941xfb821914);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "CgiFinderLiveGetUserGameConfig game list size: " + ((r45.hv1) fVar.f152151d).m75941xfb821914(1) + ", showSearchLayout:" + (((r45.hv1) fVar.f152151d).m75939xb282bd08(3) == 1));
            java.util.LinkedList m75941xfb8219142 = ((r45.hv1) fVar.f152151d).m75941xfb821914(4);
            if (m75941xfb8219142 == null || m75941xfb8219142.isEmpty()) {
                mm2.s1 s1Var = (mm2.s1) dk2.ef.f314905a.i(mm2.s1.class);
                if (s1Var != null) {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) s1Var.f410921h;
                    java.util.LinkedList linkedList = (java.util.LinkedList) h3Var.mo144003x754a37bb();
                    if (linkedList != null) {
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        linkedList2.addAll(linkedList);
                        pm0.v.d0(linkedList2, mm2.r1.f410905d);
                        h3Var.k(linkedList2);
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b = 18L;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.b(1);
                mm2.s1 s1Var2 = (mm2.s1) dk2.ef.f314905a.i(mm2.s1.class);
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = s1Var2 != null ? s1Var2.f410928r : null;
                if (j2Var != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(fVar.f152151d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f199049a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13675x4cedeef6 c13675x4cedeef6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13675x4cedeef6(new java.lang.ref.WeakReference(b8Var.m80379x76847179()));
                b8Var.f198483u = c13675x4cedeef6;
                c13675x4cedeef6.mo48813x58998cd();
            }
        }
        return jz5.f0.f384359a;
    }
}
