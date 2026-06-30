package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class k0 implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0 f185323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185325c;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0 n0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f185323a = n0Var;
        this.f185324b = i17;
        this.f185325c = abstractC14490x69736cb5;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 i0Var = this.f185323a.f185586h;
        if (i0Var != null) {
            i0Var.a(this.f185324b, this.f185325c, view);
        }
    }
}
