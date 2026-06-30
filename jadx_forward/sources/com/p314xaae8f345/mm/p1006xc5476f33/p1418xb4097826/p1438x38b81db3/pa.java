package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class pa extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 f185781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185782c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 f185783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185784e;

    public pa(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f185780a = s0Var;
        this.f185781b = c15379x1d4ea971;
        this.f185782c = viewGroup;
        this.f185783d = c15175x44dff2e9;
        this.f185784e = qeVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is
    public boolean a(android.view.MotionEvent ev6) {
        boolean z17;
        vx2.k m61207x8489ceb8;
        boolean contains;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = this.f185781b;
        int i17 = pm0.v.s(c15379x1d4ea971)[1];
        android.view.ViewGroup footerLayout = this.f185782c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(footerLayout, "$footerLayout");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, c15379x1d4ea971.getWidth(), (pm0.v.s(footerLayout)[1] - 50) - i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9 = this.f185783d;
        if (c15175x44dff2e9 != null && (m61207x8489ceb8 = c15175x44dff2e9.m61207x8489ceb8()) != null) {
            if (m61207x8489ceb8.h()) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.view.ViewGroup viewGroup = m61207x8489ceb8.f522788g;
                if (viewGroup != null) {
                    viewGroup.getGlobalVisibleRect(rect2);
                }
                contains = rect2.contains((int) ev6.getX(), (int) ev6.getY());
            } else {
                contains = false;
            }
            if (contains) {
                z17 = true;
                return (rect.contains((int) ev6.getX(), (int) ev6.getY()) || z17) ? false : true;
            }
        }
        z17 = false;
        if (rect.contains((int) ev6.getX(), (int) ev6.getY())) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is
    public void b(android.view.View view, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        in5.s0 s0Var = this.f185780a;
        java.lang.Object obj = s0Var.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        this.f185784e.u0(s0Var, view, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj, e17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is
    public java.lang.Integer c(android.view.MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration;
        in5.s0 s0Var = this.f185780a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
        int i17 = 4;
        if ((motionEvent == null || c15178x4303ff90 == null || !c15178x4303ff90.m(this.f185781b, motionEvent)) && (viewConfiguration = android.view.ViewConfiguration.get(s0Var.f374654e)) != null) {
            i17 = viewConfiguration.getScaledTouchSlop();
        }
        return java.lang.Integer.valueOf(i17);
    }
}
