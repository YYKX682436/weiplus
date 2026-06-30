package rn2;

/* loaded from: classes3.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f479366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(rn2.t2 t2Var, r45.dz1 dz1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479365e = t2Var;
        this.f479366f = dz1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.r1(this.f479365e, this.f479366f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479364d;
        rn2.t2 t2Var = this.f479365e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rn2.l0 l0Var = rn2.l0.f479325a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t2Var.f479386e;
            this.f479364d = 1;
            obj = l0Var.e(abstractActivityC21394xb3d2c0cf, this.f479366f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        r45.kn1 kn1Var = (r45.kn1) lVar.f384367e;
        jz5.f0 f0Var = null;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        java.lang.Object obj2 = lVar.f384366d;
        if (kn1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateViewCallback", "create lottery bill_status:" + kn1Var.m75939xb282bd08(1) + '(' + ((java.lang.String) obj2) + ")!");
            int m75939xb282bd08 = kn1Var.m75939xb282bd08(1);
            if (m75939xb282bd08 == 1) {
                gk2.e eVar = gk2.e.f354004n;
                if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).S) {
                    rn2.f fVar = t2Var.f479387f;
                    if (fVar != null) {
                        ((rn2.c1) fVar).h((r45.dz1) kn1Var.m75936x14adae67(3), kn1Var.m75939xb282bd08(2));
                    }
                } else {
                    rn2.f fVar2 = t2Var.f479387f;
                    if (fVar2 != null) {
                        ((rn2.c1) fVar2).v();
                    }
                }
            } else if (m75939xb282bd08 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryCreateViewCallback", "create lottery fail " + ((java.lang.String) obj2) + '!');
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryCreateViewCallback", "tryCreateLottery fail " + ((java.lang.String) obj2) + '!');
        }
        return f0Var2;
    }
}
