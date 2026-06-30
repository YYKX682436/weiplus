package nr0;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nr0.x xVar, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420642d = xVar;
        this.f420643e = i17;
        this.f420644f = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.v(this.f420642d, this.f420643e, this.f420644f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nr0.v vVar = (nr0.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        as0.a aVar2 = as0.a.f94958a;
        int i17 = this.f420642d.f420648d;
        int i18 = this.f420643e;
        int i19 = this.f420644f;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = aVar2.a(i17);
        if (a17 != null) {
            a17.f137094j = i18;
            a17.f137095k = i19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "setCameraSize:[" + this.f420643e + ' ' + this.f420644f + ']');
        nr0.x xVar = this.f420642d;
        xVar.f420664w = true;
        xr0.k kVar = xVar.f420654m;
        int i27 = this.f420643e;
        int i28 = this.f420644f;
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitModel", "updateCameraSize >> width:" + i27 + ", height:" + i28 + "  origin >> " + kVar);
        kVar.f537709b.f537706a = i27;
        kVar.f537709b.f537707b = i28;
        kVar.a();
        nr0.x xVar2 = this.f420642d;
        is0.c cVar = xVar2.f420651g;
        if (cVar != null) {
            int i29 = this.f420643e;
            int i37 = this.f420644f;
            cVar.f375933m = i29;
            cVar.f375934n = i37;
        }
        if (xVar2.f420666y != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "updateInputSize >> camerax set default >> " + this.f420643e + ", " + this.f420644f);
            nr0.x xVar3 = this.f420642d;
            android.graphics.SurfaceTexture surfaceTexture = xVar3.f420652h;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(xVar3.f420654m.f537709b.f537706a, this.f420642d.f420654m.f537709b.f537707b);
            }
        }
        return jz5.f0.f384359a;
    }
}
