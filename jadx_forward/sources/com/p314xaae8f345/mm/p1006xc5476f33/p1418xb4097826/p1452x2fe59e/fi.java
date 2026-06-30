package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class fi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f188276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd2.c f188277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f188279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(az2.f fVar, cd2.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar, int i17) {
        super(1);
        this.f188276d = fVar;
        this.f188277e = cVar;
        this.f188278f = liVar;
        this.f188279g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.e11 it = (r45.e11) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f188276d.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", "mentionId: " + this.f188277e.i());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f188278f;
        java.util.ArrayList arrayList = liVar.f188827d.f190724p;
        int i17 = this.f188279g;
        arrayList.remove(i17);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = liVar.f188832i;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8155x27702c4(i17);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = liVar.f188830g;
        db5.t7.m123883x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erj), 0).show();
        return jz5.f0.f384359a;
    }
}
