package gx0;

/* loaded from: classes5.dex */
public final class jd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f358120f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f358121g;

    /* renamed from: h, reason: collision with root package name */
    public int f358122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358123i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 f358124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f358125n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 c4170x5817ebc8, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358123i = bfVar;
        this.f358124m = c4170x5817ebc8;
        this.f358125n = c4181x2248e1a3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.jd(this.f358123i, this.f358124m, this.f358125n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.jd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358122h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358123i.B;
            if (c4152x8b3cf7db == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.PlaybackControlUIC", "beginClipSkimming - playbackSession is null");
                this.f358123i.L = false;
                this.f358124m.a();
                return java.lang.Boolean.FALSE;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 c4170x5817ebc8 = this.f358124m;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f358125n;
            gx0.bf bfVar = this.f358123i;
            this.f358118d = c4152x8b3cf7db;
            this.f358119e = c4170x5817ebc8;
            this.f358120f = c4181x2248e1a3;
            this.f358121g = bfVar;
            this.f358122h = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            c4152x8b3cf7db.m34130x8ec5ba8a(c4170x5817ebc8, new gx0.id(c4181x2248e1a3, bfVar, c4170x5817ebc8, nVar));
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
