package il2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f373595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.a f373596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, il2.a aVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373595d = hVar;
        this.f373596e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new il2.i(this.f373595d, interfaceC29045xdcb5ca57, this.f373596e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        il2.i iVar = (il2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.mn1 mn1Var = (r45.mn1) ((xg2.i) this.f373595d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleFaceResult verify success is_passed: ");
        sb6.append(mn1Var.m75933x41a8a7f2(1));
        sb6.append(" verifyData: ");
        il2.a aVar2 = this.f373596e;
        sb6.append(aVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRestrictConsumePlugin", sb6.toString());
        aVar2.f373569d.mo146xb9724478(java.lang.Boolean.valueOf(mn1Var.m75933x41a8a7f2(1)));
        return jz5.f0.f384359a;
    }
}
