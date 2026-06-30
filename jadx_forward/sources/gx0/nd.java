package gx0;

/* loaded from: classes5.dex */
public final class nd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f358302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(gx0.bf bfVar, android.view.SurfaceView surfaceView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358301d = bfVar;
        this.f358302e = surfaceView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.nd(this.f358301d, this.f358302e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.nd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358301d.B;
            if (c4152x8b3cf7db == null) {
                return null;
            }
            c4152x8b3cf7db.m34133x804ecd78(this.f358302e);
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "bindRenderView - failed:" + e17.getMessage(), e17);
            return f0Var;
        }
    }
}
