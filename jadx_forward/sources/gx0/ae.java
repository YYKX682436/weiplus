package gx0;

/* loaded from: classes5.dex */
public final class ae extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357736e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357737f;

    /* renamed from: g, reason: collision with root package name */
    public int f357738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f357739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c f357740i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f357741m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f357742n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357739h = bfVar;
        this.f357740i = c4165x6f849f9c;
        this.f357741m = c4128x879fba0a;
        this.f357742n = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ae(this.f357739h, this.f357740i, this.f357741m, this.f357742n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ae) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357738g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f357739h.B;
            if (c4152x8b3cf7db == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - playbackSession is null");
                return java.lang.Boolean.FALSE;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c = this.f357740i;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f357741m;
            boolean z17 = this.f357742n;
            this.f357735d = c4152x8b3cf7db;
            this.f357736e = c4165x6f849f9c;
            this.f357737f = c4128x879fba0a;
            this.f357738g = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            c4152x8b3cf7db.m34141xd85848e0(c4165x6f849f9c, c4128x879fba0a, z17, new gx0.zd(c4165x6f849f9c, nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
