package gu0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gu0.k2 k2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357328d = k2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.q1(this.f357328d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gu0.q1 q1Var = (gu0.q1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gu0.k2 k2Var = this.f357328d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = k2Var.f357271n;
        if (c4152x8b3cf7db != null) {
            try {
                c4152x8b3cf7db.m34181x3440dc51();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "releaseResources: unbindRenderView failed: " + e17.getMessage());
            }
            try {
                c4152x8b3cf7db.m34162x41012807();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "releaseResources: release playbackSession failed: " + e18.getMessage());
            }
            k2Var.f357271n = null;
        }
        try {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422 = k2Var.f357272o;
            if (c4143xe6876422 != null) {
                c4143xe6876422.b();
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "releaseResources: release exportSession failed: " + e19.getMessage());
        }
        k2Var.f357272o = null;
        k2Var.getClass();
        k2Var.f357270m = null;
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d c4016x48c9106d = k2Var.f357273p;
            if (c4016x48c9106d != null) {
                c4016x48c9106d.q();
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "releaseResources: release camResourceManager failed: " + e27.getMessage());
        }
        k2Var.f357273p = null;
        return jz5.f0.f384359a;
    }
}
