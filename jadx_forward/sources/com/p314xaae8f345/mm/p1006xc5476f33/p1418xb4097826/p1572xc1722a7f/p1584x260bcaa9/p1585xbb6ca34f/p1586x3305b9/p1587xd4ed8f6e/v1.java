package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class v1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.t f203513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w1 f203514e;

    public v1(vp2.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w1 w1Var) {
        this.f203513d = tVar;
        this.f203514e = w1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vp2.t tVar = this.f203513d;
        if (i17 > tVar.f520489e.size()) {
            return;
        }
        java.lang.Object obj = tVar.f520489e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        android.content.Context context = holder.f374654e;
        if ((context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null) != null) {
            vp2.s sVar = j5Var instanceof vp2.s ? (vp2.s) j5Var : null;
            if (sVar != null) {
                r45.pw1 pw1Var = sVar.f520487d;
                int m75939xb282bd08 = pw1Var.m75939xb282bd08(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w1 w1Var = this.f203514e;
                if (m75939xb282bd08 == 1) {
                    w1Var.f203531e.p(sVar);
                } else if (m75939xb282bd08 != 2) {
                    pw1Var.m75939xb282bd08(0);
                } else {
                    w1Var.f203531e.d(sVar);
                }
            }
        }
    }
}
