package gu0;

/* loaded from: classes5.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp0.q0 f357157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(pp0.q0 q0Var, gu0.k2 k2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357157d = q0Var;
        this.f357158e = k2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.a2(this.f357157d, this.f357158e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((yy0.k8) this.f357157d).getClass();
        if (!az0.i5.f97090a.t()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "setupPlayback: MaasCore not inited, skip PlaybackSession creation");
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db(new android.os.Handler(android.os.Looper.getMainLooper()));
        c4152x8b3cf7db.m34167x827608f3(new gu0.y1(this.f357158e));
        c4152x8b3cf7db.m34170x9eb0dc64(gu0.z1.f357399a);
        return c4152x8b3cf7db;
    }
}
