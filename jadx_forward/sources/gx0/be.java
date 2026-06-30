package gx0;

/* loaded from: classes5.dex */
public final class be extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f357778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c f357780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f357781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f357782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(gx0.bf bfVar, boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357778d = bfVar;
        this.f357779e = z17;
        this.f357780f = c4165x6f849f9c;
        this.f357781g = c4128x879fba0a;
        this.f357782h = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.be(this.f357778d, this.f357779e, this.f357780f, this.f357781g, this.f357782h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.be) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.bf bfVar = this.f357778d;
        if (!bfVar.m7() && this.f357779e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - state is not ready to play. state:" + bfVar.f357788v.mo3195x754a37bb());
            return java.lang.Boolean.FALSE;
        }
        try {
            gx0.bf bfVar2 = this.f357778d;
            z17 = ((java.lang.Boolean) p3325xe03a0797.p3326xc267989b.l.e(bfVar2.f357785s, new gx0.ae(bfVar2, this.f357780f, this.f357781g, this.f357782h, null))).booleanValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "commitUpdate - failed:" + e17.getMessage(), e17);
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
