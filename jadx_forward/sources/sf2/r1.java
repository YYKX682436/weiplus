package sf2;

/* loaded from: classes10.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f488790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.w1 f488791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(sf2.w1 w1Var, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488791e = w1Var;
        this.f488792f = str;
        this.f488793g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.r1(this.f488791e, this.f488792f, this.f488793g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488790d;
        java.lang.String str = this.f488792f;
        sf2.w1 w1Var = this.f488791e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f488790d = 1;
            obj = sf2.w1.Z6(w1Var, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.by1 by1Var = (r45.by1) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (by1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomVisitorSingController", "downloadLyricsResource: playInfo is null");
            return f0Var;
        }
        r45.ay1 ay1Var = by1Var.f452676d;
        java.lang.String str2 = ay1Var != null ? ay1Var.f451883d : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomVisitorSingController", "downloadLyricsResource: song_mid is empty");
            return f0Var;
        }
        r45.z22 z22Var = new r45.z22();
        z22Var.f473160d = str2;
        z22Var.f473162f = str;
        java.lang.String str3 = this.f488793g;
        z22Var.f473165i = str3;
        z22Var.f473164h = by1Var;
        w1Var.b7().U6(new mm2.i6(z22Var, null, true));
        r45.yx1 yx1Var = new r45.yx1();
        yx1Var.f472991d = str2;
        yx1Var.f472992e = str2;
        yx1Var.f472999o = by1Var;
        om2.t c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.c(yx1Var, false);
        if ((c17 != null ? c17.f427915b : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomVisitorSingController", "downloadLyricsResource: resourceInfo is null");
            return f0Var;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w1Var.b7().N6(), str3)) {
            return f0Var;
        }
        w1Var.b7().U6(new mm2.i6(z22Var, c17.f427915b, true));
        return f0Var;
    }
}
