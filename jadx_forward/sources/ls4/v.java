package ls4;

/* loaded from: classes8.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f402636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls4.w f402637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ls4.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f402637e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ls4.v(this.f402637e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ls4.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f402636d;
        ls4.w wVar = this.f402637e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinEncashLogic", "getRealNameInfo");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = wVar.f402638a;
            wVar.f402641d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 3, null);
            s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = wVar.f402638a;
            this.f402636d = 1;
            obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).Ai(abstractActivityC21394xb3d2c0cf2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = wVar.f402641d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinEncashLogic", "getRealNameInfo succ.");
            js4.p pVar = (js4.p) wVar.f402640c.get();
            if (pVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "realNameDidSuccess callback");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo) pVar).W6();
            }
            wVar.a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinEncashLogic", "getRealNameInfo failed.");
        }
        return jz5.f0.f384359a;
    }
}
