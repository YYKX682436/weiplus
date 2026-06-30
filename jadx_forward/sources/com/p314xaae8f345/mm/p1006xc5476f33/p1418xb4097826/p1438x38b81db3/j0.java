package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class j0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0 f185238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185240c;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0 n0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f185238a = n0Var;
        this.f185239b = i17;
        this.f185240c = abstractC14490x69736cb5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (motionEvent == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 i0Var = this.f185238a.f185586h;
        if (i0Var == null) {
            return true;
        }
        i0Var.a(this.f185239b, this.f185240c, view);
        return true;
    }
}
