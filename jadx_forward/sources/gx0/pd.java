package gx0;

/* loaded from: classes5.dex */
public final class pd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f358379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358377d = bfVar;
        this.f358378e = c4128x879fba0a;
        this.f358379f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.pd(this.f358377d, this.f358378e, this.f358379f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358377d.B;
            if (c4152x8b3cf7db == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.PlaybackControlUIC", "clipSkimTo - playbackSession is null");
                return java.lang.Boolean.FALSE;
            }
            c4152x8b3cf7db.m34139x275e7ff4(this.f358378e, this.f358379f);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "clipSkimTo - failed:" + e17.getMessage(), e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
