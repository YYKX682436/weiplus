package el2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f335341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, el2.i0 i0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f335341d = hVar;
        this.f335342e = i0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new el2.i(this.f335341d, interfaceC29045xdcb5ca57, this.f335342e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        el2.i iVar = (el2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f335341d).f535914b;
        el2.i0 i0Var = this.f335342e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.H, "addNotice: getLivePrepare error: " + aVar2);
        db5.t7.m123882x26a183b(i0Var.f199716e, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
        return jz5.f0.f384359a;
    }
}
