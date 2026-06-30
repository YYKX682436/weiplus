package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ge extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        super(3);
        this.f194218d = mgVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dk2.zf msg = (dk2.zf) obj;
        android.view.View likeRootView = (android.view.View) obj2;
        in5.r0 holder = (in5.r0) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRootView, "likeRootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194218d;
        mgVar.M1(false);
        if (likeRootView.getVisibility() == 0 && (msg instanceof dk2.cg)) {
            if (zl2.r4.f555483a.w1()) {
                ml2.b5 b5Var = ((dk2.cg) msg).o() ? ml2.b5.f408835x : ml2.b5.f408833v;
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.j0.Dj((ml2.j0) c17, b5Var, msg, null, 4, null);
            } else if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
                ml2.g5 g5Var = ((dk2.cg) msg).o() ? ml2.g5.M : ml2.g5.K;
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.Bj((ml2.r0) c18, g5Var, msg, 0, 4, null);
            } else {
                ml2.g5 g5Var2 = ((dk2.cg) msg).o() ? ml2.g5.f409029w : ml2.g5.f409027u;
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.Bj((ml2.r0) c19, g5Var2, msg, 0, 4, null);
            }
            se2.w wVar = se2.w.f488428a;
            p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
            gk2.e S0 = mgVar.S0();
            android.content.Context context = mgVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            wVar.k(y0Var, msg, likeRootView, S0, context);
        }
        return jz5.f0.f384359a;
    }
}
