package ni2;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f418800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.g f418801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, ni2.g gVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418800d = hVar;
        this.f418801e = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ni2.d(this.f418800d, interfaceC29045xdcb5ca57, this.f418801e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ni2.d dVar = (ni2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePayMicLisence", "saveLicenseState success: 1");
        ae2.in inVar = ae2.in.f85221a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveConfig", "set LIVE_PAY_MIC_LICENSE value:1");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_KNOW_LICENSE_PAY_MIC_INT_SYNC, 1);
        ni2.g gVar = this.f418801e;
        gVar.a();
        gVar.f418831h.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
