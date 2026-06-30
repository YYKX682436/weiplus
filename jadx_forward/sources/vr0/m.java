package vr0;

/* loaded from: classes14.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f521021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vr0.z zVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521020e = zVar;
        this.f521021f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vr0.m(this.f521020e, this.f521021f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521019d;
        int i18 = this.f521021f;
        vr0.z zVar = this.f521020e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f521019d = 1;
            zVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", "bindCameraUseCases");
            java.lang.Object a17 = or0.c.f428962a.a(new vr0.c(zVar, i18, false, null), this);
            if (a17 != aVar) {
                a17 = jz5.f0.f384359a;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        zVar.f492974r = i18;
        return java.lang.Boolean.TRUE;
    }
}
