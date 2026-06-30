package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class x0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 f186451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f186453c;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var, int i17, so2.u1 u1Var) {
        this.f186451a = b1Var;
        this.f186452b = i17;
        this.f186453c = u1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (motionEvent == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 i0Var = this.f186451a.f184449t;
        if (i0Var == null) {
            return true;
        }
        i0Var.a(this.f186452b, this.f186453c, view);
        return true;
    }
}
