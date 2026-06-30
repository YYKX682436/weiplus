package ev0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f338405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f338406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f338407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ev0.t f338408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338409h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, yz5.p pVar, ev0.t tVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338406e = c16997xb0aa383a;
        this.f338407f = pVar;
        this.f338408g = tVar;
        this.f338409h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ev0.r(this.f338406e, this.f338407f, this.f338408g, this.f338409h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ev0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ev0.t tVar = this.f338408g;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f338405d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f338406e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPlayer", "play music: " + c16997xb0aa383a);
                yz5.p pVar = this.f338407f;
                if (pVar != null) {
                    this.f338405d = 1;
                    if (pVar.mo149xb9724478(c16997xb0aa383a, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            ev0.t.b(tVar, c16997xb0aa383a, this.f338409h);
            ev0.b bVar = tVar.f338412b;
            if (bVar != null) {
                bVar.O();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MovieComposingMusicPlayer", "play music " + c16997xb0aa383a + " fail:" + e17.getLocalizedMessage());
        }
        return jz5.f0.f384359a;
    }
}
