package sf2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f488704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488705e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.j(this.f488705e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488704d;
        sf2.x xVar = this.f488705e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart: has song list, loading...");
                this.f488704d = 1;
                if (xVar.i7(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            sf2.e1 e1Var = (sf2.e1) xVar.getStore().m56798x25fe639c(sf2.e1.class);
            if (e1Var != null) {
                if (dk2.ef.f314921i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "checkAndClearSingingSongIfNeeded: already cleared, skip");
                } else {
                    dk2.ef.f314921i = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(e1Var, null, null, new sf2.n0(e1Var, null), 3, null);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart: completed");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart exception: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
