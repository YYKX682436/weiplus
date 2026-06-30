package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class si implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f190522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f190523c;

    public si(java.lang.String str, r45.xn1 xn1Var, yz5.l lVar) {
        this.f190521a = str;
        this.f190522b = xn1Var;
        this.f190523c = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveProfileWidgetJumpEmptyUIC", "doGetFinderLiveContact success:" + (fVar.f152148a == 0 && fVar.f152149b == 0) + " username:" + this.f190521a);
        r45.bs1 bs1Var = (r45.bs1) fVar.f152151d;
        if (bs1Var == null || (xn1Var = (r45.xn1) bs1Var.m75936x14adae67(1)) == null) {
            xn1Var = this.f190522b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xn1Var);
        this.f190523c.mo146xb9724478(xn1Var);
        return jz5.f0.f384359a;
    }
}
