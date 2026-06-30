package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class lw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f200512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw f200515g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(az2.f fVar, int i17, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar) {
        super(0);
        this.f200512d = fVar;
        this.f200513e = i17;
        this.f200514f = list;
        this.f200515g = nwVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ch0 ch0Var;
        dk2.xf k17;
        this.f200512d.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switch role succeeded. role type ");
        int i17 = this.f200513e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchRoleDialog", sb6.toString());
        zl2.r4.f555483a.W2(new java.util.LinkedList(this.f200514f), i17, g92.b.f351302e.k2().m75942xfb822ef2(5));
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null && (k17 = dk2.ef.f314905a.k(eVar)) != null) {
            ((dk2.r4) k17).q(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (ch0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ch0) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ch0.class)) != null) {
            ch0Var.K0(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar = this.f200515g;
        nwVar.f200744i.mo146xb9724478(java.lang.Integer.valueOf(i17));
        nwVar.a();
        return jz5.f0.f384359a;
    }
}
