package gx0;

/* loaded from: classes5.dex */
public final class gc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw0.d f357998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.kc f357999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(zw0.d dVar, gx0.kc kcVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357998e = dVar;
        this.f357999f = kcVar;
        this.f358000g = c4128x879fba0a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.gc(this.f357998e, this.f357999f, this.f358000g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.gc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357997d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.kc kcVar = this.f357999f;
            zw0.d dVar = this.f357998e;
            if (dVar != null) {
                kcVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandleBoxUIC", "onPanelClosed: level " + dVar);
                if (gx0.bc.f357776a[dVar.ordinal()] == 1) {
                    ((gx0.x4) ((jz5.n) kcVar.f358165n).mo141623x754a37bb()).U6(false);
                }
            }
            ex0.a0 a0Var = kcVar.l7().f358175r;
            if (a0Var != null && (list = a0Var.f338630g.f338711f) != null) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    kcVar.Z6(((ex0.r) it.next()).f338700a);
                }
                gx0.bf k76 = kcVar.k7();
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f358000g;
                this.f357997d = 1;
                if (gx0.bf.d7(k76, null, c4128x879fba0a, false, this, 5, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
