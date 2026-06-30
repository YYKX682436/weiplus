package im2;

/* loaded from: classes3.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(im2.h6 h6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373991e = h6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.n5(this.f373991e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.n5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373990d;
        im2.h6 h6Var = this.f373991e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f373990d = 1;
            ya2.b2 b17 = h6Var.Y().f492179a != null ? ya2.h.f542017a.b(h6Var.Y().f492179a) : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17 != null ? b17.y0() : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "update bg fail,contact is null!");
                h6Var.f373904r.setVisibility(8);
                h6Var.G.setVisibility(0);
            } else {
                h6Var.i((b17 == null || (c19780xceb4c4dc = b17.f69300x731cac1b) == null) ? null : c19780xceb4c4dc.m76029xad9975ba(), h6Var.Y().f492180b, b17 != null ? b17.f69300x731cac1b : null);
                h6Var.m(b17 != null ? b17.y0() : "", h6Var.Y().f492179a, b17, this);
            }
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f373990d = 2;
        h6Var.l(this);
        return f0Var == aVar ? aVar : f0Var;
    }
}
