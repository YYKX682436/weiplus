package gx0;

/* loaded from: classes5.dex */
public final class se extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f358496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f358497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358494d = bfVar;
        this.f358495e = c4128x879fba0a;
        this.f358496f = j17;
        this.f358497g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.se(this.f358494d, this.f358495e, this.f358496f, this.f358497g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.se) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358494d.B;
            if (c4152x8b3cf7db == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.PlaybackControlUIC", "stopPlaying - playbackSession is null");
                return java.lang.Boolean.FALSE;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = this.f358495e;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l76 = this.f358494d.l7();
            if (l76.m33980x66356283()) {
                c4128x879fba0a = l76.sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
            } else {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = ou0.f.b(c4128x879fba0a2, c4128x879fba0a);
            long j17 = this.f358496f;
            ou0.g gVar = (!(b17 instanceof ou0.g) || ou0.f.c(b17, 1L)) ? new ou0.g(j17 | 1, b17) : new ou0.g(j17 | 1, b17);
            this.f358495e.m33988x124aa384();
            c4152x8b3cf7db.m34173xca528117(gVar, gVar.f430422d, this.f358497g);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "skimTo - failed:" + e17.getMessage(), e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
