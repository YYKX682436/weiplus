package qf2;

/* loaded from: classes.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f443929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f443930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.m f443931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443932h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(qf2.y1 y1Var, dk2.m mVar, dk2.m mVar2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443929e = y1Var;
        this.f443930f = mVar;
        this.f443931g = mVar2;
        this.f443932h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.h1(this.f443929e, this.f443930f, this.f443931g, this.f443932h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443928d;
        qf2.y1 y1Var = this.f443929e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((az2.f) ((jz5.n) y1Var.f444192o).mo141623x754a37bb()).a();
            qf2.y1 y1Var2 = this.f443929e;
            dk2.m mVar = this.f443930f;
            qf2.f1 f1Var = qf2.f1.f443899d;
            this.f443928d = 1;
            if (qf2.y1.b7(y1Var2, mVar, 1, false, f1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorReplayCrossRoomBattleAgain end");
                ((az2.f) ((jz5.n) y1Var.f444192o).mo141623x754a37bb()).b();
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dk2.u4 u4Var = ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.f315687a != null) {
            qf2.y1 y1Var3 = this.f443929e;
            dk2.m mVar2 = this.f443931g;
            qf2.g1 g1Var = new qf2.g1(this.f443932h);
            this.f443928d = 2;
            if (qf2.y1.b7(y1Var3, mVar2, 3, false, g1Var, this) == aVar) {
                return aVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorReplayCrossRoomBattleAgain end");
        ((az2.f) ((jz5.n) y1Var.f444192o).mo141623x754a37bb()).b();
        return jz5.f0.f384359a;
    }
}
