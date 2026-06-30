package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class gi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f188380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd2.c f188381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(az2.f fVar, cd2.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar) {
        super(1);
        this.f188380d = fVar;
        this.f188381e = cVar;
        this.f188382f = liVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f188380d.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", "del mention network error!: " + this.f188381e.i());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188382f.f188830g;
        db5.t7.m123883x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eri), 0).show();
        return jz5.f0.f384359a;
    }
}
