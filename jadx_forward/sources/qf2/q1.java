package qf2;

/* loaded from: classes.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f444077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.y1 y1Var, dk2.m mVar, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444075d = hVar;
        this.f444076e = y1Var;
        this.f444077f = mVar;
        this.f444078g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.q1(this.f444075d, interfaceC29045xdcb5ca57, this.f444076e, this.f444077f, this.f444078g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.q1 q1Var = (qf2.q1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dk2.u4 u4Var = ((mm2.o4) this.f444076e.m56788xbba4bfc0(mm2.o4.class)).Z;
        if (u4Var != null) {
            u4Var.f315701o = this.f444077f.f315277g;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "newModifyAnchorBattle success");
        yz5.l lVar = this.f444078g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
