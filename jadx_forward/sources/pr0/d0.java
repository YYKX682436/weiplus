package pr0;

/* loaded from: classes14.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f439352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z17, pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439352d = z17;
        this.f439353e = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.d0(this.f439352d, this.f439353e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xr0.d dVar;
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToCamera back:");
        boolean z18 = this.f439352d;
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
        pr0.g0 g0Var = this.f439353e;
        sr0.i iVar = g0Var.f439367e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (iVar != null && (dVar = ((sr0.f) iVar).f492970n) != null && ((!(z17 = dVar.f537694c) && z18) || (z17 && !z18))) {
            g0Var.m("switchCamera", new pr0.b0(g0Var, null));
        }
        return f0Var;
    }
}
