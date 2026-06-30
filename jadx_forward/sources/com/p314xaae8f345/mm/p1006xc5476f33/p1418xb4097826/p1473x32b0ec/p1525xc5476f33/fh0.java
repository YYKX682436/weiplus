package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class fh0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f194090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 f194091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194091e = th0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fh0(this.f194091e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fh0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f194090d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f194090d = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var = this.f194091e;
        th0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", "haveJoinFansClub");
        ke2.h hVar = new ke2.h(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) th0Var.S0().a(mm2.e1.class)).f410518o), ((mm2.e1) th0Var.S0().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) th0Var.S0().a(mm2.e1.class)).f410516m, null);
        android.view.ViewGroup viewGroup = th0Var.f446856d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        az2.j.u(hVar, context, null, 0L, 6, null);
        pq5.g l17 = hVar.l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ih0(nVar, th0Var));
        if (viewGroup.getContext() != null && (viewGroup.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
