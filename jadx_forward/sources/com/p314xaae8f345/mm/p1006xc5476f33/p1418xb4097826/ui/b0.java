package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class b0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f210456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f210457e;

    public b0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, yz5.l lVar) {
        this.f210456d = abstractActivityC21394xb3d2c0cf;
        this.f210457e = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.li2 req = (r45.li2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = req.m75939xb282bd08(0);
        yz5.l lVar = this.f210457e;
        if (m75939xb282bd08 != 5) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f210456d;
        db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mao));
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
    }
}
