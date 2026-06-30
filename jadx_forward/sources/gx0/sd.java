package gx0;

/* loaded from: classes5.dex */
public final class sd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f358491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f358493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358490e = bfVar;
        this.f358491f = c4167x88133861;
        this.f358492g = c4128x879fba0a;
        this.f358493h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.sd(this.f358490e, this.f358491f, this.f358492g, this.f358493h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.sd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358489d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f358490e.f357789w == gx0.fd.f357965h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.PlaybackControlUIC", "commitUpdate - state is Playing");
                gx0.bf bfVar = this.f358490e;
                this.f358489d = 1;
                if (gx0.bf.t7(bfVar, false, this, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = this.f358491f;
        if (c4167x88133861 != null) {
            this.f358490e.E = c4167x88133861;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x881338612 = this.f358490e.E;
        if (c4167x881338612 == null) {
            c4167x881338612 = this.f358491f;
        }
        if (c4167x881338612 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - timeline is null");
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c n17 = c4167x881338612.n(this.f358491f != null);
        if (n17 == null) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar2 = this.f358490e;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f358492g;
        boolean z17 = this.f358493h;
        this.f358489d = 2;
        bfVar2.getClass();
        obj = p3325xe03a0797.p3326xc267989b.l.g(bfVar2.f357786t, new gx0.be(bfVar2, true, n17, c4128x879fba0a, z17, null), this);
        return obj == aVar ? aVar : obj;
    }
}
