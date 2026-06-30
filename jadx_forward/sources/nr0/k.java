package nr0;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f420623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nr0.x xVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420622d = xVar;
        this.f420623e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.k(this.f420622d, this.f420623e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        nr0.x xVar;
        android.graphics.SurfaceTexture surfaceTexture;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nr0.x xVar2 = this.f420622d;
        if (xVar2.f420652h == null) {
            xVar2.f420651g = is0.b.b(false, 21L);
            nr0.x xVar3 = this.f420622d;
            is0.c cVar = xVar3.f420651g;
            if (cVar != null) {
                int i17 = xVar3.f420654m.f537709b.f537706a;
                int i18 = this.f420622d.f420654m.f537709b.f537707b;
                cVar.f375933m = i17;
                cVar.f375934n = i18;
            }
            nr0.x xVar4 = this.f420622d;
            is0.c cVar2 = this.f420622d.f420651g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
            xVar4.f420652h = new android.graphics.SurfaceTexture(cVar2.f375928e);
            if (this.f420622d.f420666y != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "getGLInputTexture >> camerax to setDefault size");
                nr0.x xVar5 = this.f420622d;
                android.graphics.SurfaceTexture surfaceTexture2 = xVar5.f420652h;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.setDefaultBufferSize(xVar5.f420654m.f537709b.f537706a, this.f420622d.f420654m.f537709b.f537707b);
                }
            }
            if (this.f420623e && (surfaceTexture = (xVar = this.f420622d).f420652h) != null) {
                final yz5.l lVar = xVar.f420667z;
                surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener(lVar) { // from class: nr0.p

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f420631d;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "function");
                        this.f420631d = lVar;
                    }

                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final /* synthetic */ void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture3) {
                        this.f420631d.mo146xb9724478(surfaceTexture3);
                    }
                });
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGLInputTexture [");
            android.graphics.SurfaceTexture surfaceTexture3 = this.f420622d.f420652h;
            sb6.append(surfaceTexture3 != null ? new java.lang.Integer(surfaceTexture3.hashCode()) : null);
            sb6.append("] thread-id:[");
            sb6.append(android.os.Process.myTid());
            sb6.append("] name:");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(" texturePreview:");
            sb6.append(this.f420623e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        }
        android.graphics.SurfaceTexture surfaceTexture4 = this.f420622d.f420652h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture4);
        return surfaceTexture4;
    }
}
