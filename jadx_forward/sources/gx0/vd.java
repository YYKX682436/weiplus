package gx0;

/* loaded from: classes5.dex */
public final class vd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358607d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358608e;

    /* renamed from: f, reason: collision with root package name */
    public int f358609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358610g = bfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.vd(this.f358610g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.vd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358609f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358610g.B;
            if (c4152x8b3cf7db == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.PlaybackControlUIC", "endClipSkimming - playbackSession is null");
                this.f358610g.L = false;
                return java.lang.Boolean.FALSE;
            }
            gx0.bf bfVar = this.f358610g;
            this.f358607d = c4152x8b3cf7db;
            this.f358608e = bfVar;
            this.f358609f = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            c4152x8b3cf7db.m34145x13b20fbc(new gx0.ud(nVar, bfVar));
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
