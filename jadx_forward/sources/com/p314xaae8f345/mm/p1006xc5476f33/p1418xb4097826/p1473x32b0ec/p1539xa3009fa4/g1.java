package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f198640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1 f198641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1 l1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198641e = l1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g1(this.f198641e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f198640d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1 l1Var = this.f198641e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yl2.g1 g1Var = l1Var.f198741e;
            this.f198640d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive failed, errCode:" + ((yl2.x) a0Var).f544614a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1 b1Var = l1Var.f198742f;
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1.B5(b1Var, false, null, null, false, 0, 0L, 62, null);
            }
        } else if (a0Var instanceof yl2.z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive continueLive");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1 b1Var2 = l1Var.f198742f;
            if (b1Var2 != null) {
                r45.j01 j01Var = ((yl2.z) a0Var).f544620a.f544569c;
                yl2.g1 g1Var2 = l1Var.f198741e;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13965xd49bde11) b1Var2).e7(true, j01Var, null, true, g1Var2.f544542b, g1Var2.f544543c);
            }
        } else if (a0Var instanceof yl2.y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive success");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1 b1Var3 = l1Var.f198742f;
            if (b1Var3 != null) {
                r45.j01 j01Var2 = ((yl2.y) a0Var).f544616a;
                yl2.g1 g1Var3 = l1Var.f198741e;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13965xd49bde11) b1Var3).e7(true, j01Var2, null, false, g1Var3.f544542b, g1Var3.f544543c);
            }
        }
        return jz5.f0.f384359a;
    }
}
