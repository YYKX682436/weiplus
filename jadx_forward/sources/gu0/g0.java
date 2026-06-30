package gu0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f357210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(gu0.k2 k2Var, android.view.SurfaceView surfaceView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357209d = k2Var;
        this.f357210e = surfaceView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.g0(this.f357209d, this.f357210e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gu0.g0 g0Var = (gu0.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f357209d.f357271n;
            if (c4152x8b3cf7db != null) {
                c4152x8b3cf7db.m34133x804ecd78(this.f357210e);
            }
            this.f357209d.f357275r = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "bindSurfaceView: success");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "bindSurfaceView: failed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
