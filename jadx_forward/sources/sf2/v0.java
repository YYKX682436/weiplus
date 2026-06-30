package sf2;

/* loaded from: classes10.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488849d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488850e;

    /* renamed from: f, reason: collision with root package name */
    public int f488851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f488853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.by1 f488854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(sf2.e1 e1Var, r45.z22 z22Var, r45.by1 by1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488852g = e1Var;
        this.f488853h = z22Var;
        this.f488854i = by1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.v0(this.f488852g, this.f488853h, this.f488854i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        om2.p pVar;
        r45.yx1 yx1Var;
        om2.p pVar2;
        sf2.e1 e1Var = this.f488852g;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488851f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.yx1 yx1Var2 = new r45.yx1();
                r45.z22 z22Var = this.f488853h;
                r45.by1 by1Var = this.f488854i;
                java.lang.String str = z22Var.f473160d;
                yx1Var2.f472991d = str;
                yx1Var2.f472992e = str;
                yx1Var2.f472999o = by1Var;
                yx1Var2.f473002r = ((mm2.c1) ((jz5.n) e1Var.f488651o).mo141623x754a37bb()).m8();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "1. getBaseResourceSongInfo");
                om2.t c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.c(yx1Var2, false);
                if (c17 != null && (pVar = c17.f427915b) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "baseInfo: hasNote=" + pVar.f427902c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "2. checkDecodeSongMusicRes");
                    gk2.e liveRoomData = e1Var.getStore().getLiveRoomData();
                    this.f488849d = yx1Var2;
                    this.f488850e = pVar;
                    this.f488851f = 1;
                    java.lang.Object a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.a(liveRoomData, yx1Var2, this);
                    if (a17 == aVar) {
                        return aVar;
                    }
                    yx1Var = yx1Var2;
                    obj = a17;
                    pVar2 = pVar;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSingController", "getBaseResourceSongInfo failed");
                return null;
            }
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar2 = (om2.p) this.f488850e;
            yx1Var = (r45.yx1) this.f488849d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            om2.r rVar = (om2.r) obj;
            om2.q qVar = rVar.f427910c;
            if (qVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSingController", "checkDecodeSongMusicRes failed: " + rVar.f427908a);
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "musicResourceInfo: hasOriginal=" + qVar.f427905a + ", accompanyPath=" + qVar.f427906b);
            om2.s sVar = new om2.s(yx1Var, pVar2, qVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "loadSongResource success");
            return sVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSingController", "loadSongResource error: " + e17.getMessage(), e17);
            return null;
        }
    }
}
