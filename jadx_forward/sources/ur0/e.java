package ur0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraDevice f511824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur0.s f511825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.hardware.camera2.CameraDevice cameraDevice, ur0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f511824d = cameraDevice;
        this.f511825e = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ur0.e(this.f511824d, this.f511825e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ur0.e eVar = (ur0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sessionCallback onDisconnected ");
        android.hardware.camera2.CameraDevice cameraDevice = this.f511824d;
        sb6.append(cameraDevice.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera2Impl", sb6.toString());
        cameraDevice.close();
        this.f511825e.K();
        return jz5.f0.f384359a;
    }
}
