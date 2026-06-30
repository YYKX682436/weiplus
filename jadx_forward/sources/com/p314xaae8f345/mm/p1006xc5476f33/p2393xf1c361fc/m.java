package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.r1 f263097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o f263098e;

    public m(su4.r1 r1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o oVar) {
        this.f263097d = r1Var;
        this.f263098e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        su4.r1 r1Var = this.f263097d;
        gm0.j1.d().g(new su4.x1(r1Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o oVar = this.f263098e;
        java.lang.String imageSearchSessionId = r1Var.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageSearchSessionId, "imageSearchSessionId");
        oVar.c(6, imageSearchSessionId, r1Var.f494599f, 0, this.f263098e.a(r1Var.C));
    }
}
