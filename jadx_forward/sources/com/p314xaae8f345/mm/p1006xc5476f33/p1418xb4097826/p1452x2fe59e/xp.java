package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class xp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f192624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f192625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f192626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f192623d = abstractC14490x69736cb5;
        this.f192624e = krVar;
        this.f192625f = menuItem;
        this.f192626g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f192623d;
        boolean m59311x25315bf4 = abstractC14490x69736cb5.getFeedObject().m59311x25315bf4();
        android.view.MenuItem menuItem = this.f192625f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f192624e;
        if (m59311x25315bf4) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = krVar.f188763d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar).Nj(abstractActivityC21394xb3d2c0cf, userName, (db5.h4) menuItem, abstractC14490x69736cb5.getFeedObject(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wp(abstractC14490x69736cb5));
        } else {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = krVar.f188763d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar2).Mj(abstractActivityC21394xb3d2c0cf2, userName, (db5.h4) menuItem, abstractC14490x69736cb5.getFeedObject(), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.e(krVar.f188763d, userName, abstractC14490x69736cb5.mo2128x1ed62e84(), this.f192626g);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.t1 t1Var = ml2.t1.f409506p;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = krVar.f188763d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((b92.d1) zbVar).rj(t1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        return jz5.f0.f384359a;
    }
}
