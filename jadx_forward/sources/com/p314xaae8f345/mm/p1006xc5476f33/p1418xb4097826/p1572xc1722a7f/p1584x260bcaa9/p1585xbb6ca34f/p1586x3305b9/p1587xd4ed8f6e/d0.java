package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class d0 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.e f203156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 f203157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x f203159g;

    public d0(vp2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar) {
        this.f203156d = eVar;
        this.f203157e = m0Var;
        this.f203158f = h0Var;
        this.f203159g = xVar;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return true;
        }
        int i18 = i17 - a07;
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(this.f203156d.f520448e, i18);
        if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        if (!zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
            return true;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var = this.f203157e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 a17 = r4Var.a1(context, abstractC14490x69736cb5, 1005, m0Var.f203332i, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.c0(this.f203156d, i18, j5Var, m0Var, adapter, i17, this.f203158f, this.f203159g));
        if (a17 == null) {
            return true;
        }
        a17.v();
        return true;
    }
}
