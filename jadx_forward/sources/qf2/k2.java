package qf2;

/* loaded from: classes.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.pf f443982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(qf2.c3 c3Var, dk2.pf pfVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443981e = c3Var;
        this.f443982f = pfVar;
        this.f443983g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.k2(this.f443981e, this.f443982f, this.f443983g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.k2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443980d;
        qf2.c3 c3Var = this.f443981e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((az2.f) ((jz5.n) c3Var.f443849r).mo141623x754a37bb()).a();
            qf2.c3 c3Var2 = this.f443981e;
            dk2.pf pfVar = this.f443982f;
            qf2.i2 i2Var = qf2.i2.f443943d;
            this.f443980d = 1;
            if (qf2.c3.Z6(c3Var2, pfVar, 1, false, i2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorReplayVisitorBattleAgain end");
                ((az2.f) ((jz5.n) c3Var.f443849r).mo141623x754a37bb()).b();
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dk2.u4 u4Var = ((mm2.o4) c3Var.m56788xbba4bfc0(mm2.o4.class)).Z;
        if (u4Var != null && (str = u4Var.f315687a) != null) {
            qf2.c3 c3Var3 = this.f443981e;
            qf2.j2 j2Var = new qf2.j2(this.f443983g);
            this.f443980d = 2;
            if (c3Var3.g7(3, str, false, j2Var, this) == aVar) {
                return aVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorReplayVisitorBattleAgain end");
        ((az2.f) ((jz5.n) c3Var.f443849r).mo141623x754a37bb()).b();
        return jz5.f0.f384359a;
    }
}
