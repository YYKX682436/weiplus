package qf2;

/* loaded from: classes10.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.m f444011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.y1 y1Var, yz5.l lVar, dk2.m mVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444008d = hVar;
        this.f444009e = y1Var;
        this.f444010f = lVar;
        this.f444011g = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.m1(this.f444008d, interfaceC29045xdcb5ca57, this.f444009e, this.f444010f, this.f444011g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.m1 m1Var = (qf2.m1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        m1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = ((r45.mm1) ((xg2.i) this.f444008d).f535926b).m75945x2fec8307(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorApplyVisitorBattle success battleId: " + m75945x2fec8307);
        dk2.u4 u4Var = ((mm2.o4) this.f444009e.m56788xbba4bfc0(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                u4Var.f315687a = m75945x2fec8307;
            }
            dk2.m mVar = this.f444011g;
            u4Var.f315693g = mVar.f315271a;
            u4Var.f315694h = mVar.f315272b;
            u4Var.f315695i = mVar.f315273c;
            java.util.List list = mVar.f315276f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
            u4Var.f315696j = list;
            u4Var.f315699m = mVar.f315275e;
            u4Var.f315700n = mVar.f315274d;
        }
        yz5.l lVar = this.f444010f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
