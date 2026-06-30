package pr0;

/* loaded from: classes14.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f439445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f439446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pr0.g0 g0Var, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439444e = g0Var;
        this.f439445f = f17;
        this.f439446g = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.s(this.f439444e, this.f439445f, this.f439446g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439443d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pr0.g0 g0Var = this.f439444e;
            sr0.i iVar = g0Var.f439367e;
            boolean z17 = false;
            if (iVar != null && ((sr0.f) iVar).f492970n.f537697f) {
                z17 = true;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.CameraKit", "camera is not previewing,ignore focusOn");
                return f0Var;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("focusOn point[");
            float f17 = this.f439445f;
            sb6.append(f17);
            sb6.append(' ');
            float f18 = this.f439446g;
            sb6.append(f18);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
            sr0.i iVar2 = g0Var.f439367e;
            if (iVar2 != null) {
                iVar2.h(f17, f18);
            }
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = g0Var.f439373u;
            jz5.l lVar = new jz5.l(bs0.g.f105323g, new android.os.Bundle());
            this.f439443d = 1;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo771x2f8fd3(lVar, this);
            if (f0Var == aVar) {
                return aVar;
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
