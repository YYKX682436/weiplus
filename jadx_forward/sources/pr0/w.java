package pr0;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439454e = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.w(this.f439454e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Float b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439453d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pr0.g0 g0Var = this.f439454e;
            sr0.i iVar = g0Var.f439367e;
            boolean z17 = false;
            if (iVar != null && ((sr0.f) iVar).f492970n.f537697f) {
                z17 = true;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.CameraKit", "camera is not previewing,ignore onZoomIn");
                return f0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", "onZoomOut");
            sr0.i iVar2 = g0Var.f439367e;
            if (iVar2 != null && (b17 = iVar2.b()) != null) {
                float floatValue = b17.floatValue();
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = g0Var.f439373u;
                bs0.g gVar = bs0.g.f105325i;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putFloat("camera_float_1", floatValue);
                jz5.l lVar = new jz5.l(gVar, bundle);
                this.f439453d = 1;
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo771x2f8fd3(lVar, this);
                if (f0Var == aVar) {
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
