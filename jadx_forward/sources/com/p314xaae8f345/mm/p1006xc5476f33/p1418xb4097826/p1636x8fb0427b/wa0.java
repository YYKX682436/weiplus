package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes4.dex */
public final class wa0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za0 f209774e;

    public wa0(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za0 za0Var) {
        this.f209773d = list;
        this.f209774e = za0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        gm0.j1.n().f354821b.q(3990, this);
        if (m1Var instanceof w11.h0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za0 za0Var = this.f209774e;
            if (i17 != 0 || i18 != 0) {
                java.util.Iterator it = this.f209773d.iterator();
                while (it.hasNext()) {
                    za0Var.p((java.lang.String) it.next(), false);
                }
                return;
            }
            r45.hg H = ((w11.h0) m1Var).H();
            if (H == null || (linkedList = H.f457660e) == null) {
                return;
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String UserName = ((r45.vn4) it6.next()).f469930e.f469027d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
                za0Var.p(UserName, true);
            }
        }
    }
}
