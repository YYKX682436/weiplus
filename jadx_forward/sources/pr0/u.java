package pr0;

/* loaded from: classes14.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(pr0.g0 g0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439449d = g0Var;
        this.f439450e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.u(this.f439449d, this.f439450e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pr0.g0 g0Var = this.f439449d;
        sr0.i iVar = g0Var.f439367e;
        boolean z17 = false;
        if (iVar != null && ((sr0.f) iVar).f492970n.f537697f) {
            z17 = true;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.CameraKit", "camera is not previewing, ignore onLargeExpo");
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLargeExpo >> ");
        int i17 = this.f439450e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
        sr0.i iVar2 = g0Var.f439367e;
        if (iVar2 != null) {
            iVar2.u(i17);
        }
        return f0Var;
    }
}
