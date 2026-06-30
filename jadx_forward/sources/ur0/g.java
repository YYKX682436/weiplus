package ur0;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f511828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraDevice f511829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur0.s f511830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.hardware.camera2.CameraDevice cameraDevice, ur0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f511829e = cameraDevice;
        this.f511830f = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ur0.g(this.f511829e, this.f511830f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ur0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f511828d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sessionCallback onOpened ");
            android.hardware.camera2.CameraDevice cameraDevice = this.f511829e;
            sb6.append(cameraDevice.hashCode());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Camera2Impl", sb6.toString());
            ur0.s sVar = this.f511830f;
            sVar.f511866w = cameraDevice;
            this.f511828d = 1;
            if (ur0.s.J(sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
