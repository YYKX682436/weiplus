package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class gk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik f185027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f185028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f185029f;

    public gk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik ikVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f185027d = ikVar;
        this.f185028e = c0Var;
        this.f185029f = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik ikVar = this.f185027d;
        android.view.View view = ikVar.f185208g;
        if (view != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f185028e;
            if (c0Var.f391645d || !view.getGlobalVisibleRect(ikVar.f185206e) || ikVar.f185206e.height() < view.getHeight() || view.getHeight() <= 0) {
                c0Var.f391645d = false;
                return;
            }
            android.content.Context context = this.f185029f.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            boolean z17 = xy2.c.e(context).length() > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = 1;
            objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
            objArr[2] = 2;
            g0Var.d(20971, objArr);
            c0Var.f391645d = true;
        }
    }
}
