package sf2;

/* loaded from: classes10.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488810h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.String str, java.lang.String str2, sf2.d3 d3Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488806d = hVar;
        this.f488807e = i17;
        this.f488808f = str;
        this.f488809g = str2;
        this.f488810h = d3Var;
        this.f488811i = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.s2(this.f488806d, interfaceC29045xdcb5ca57, this.f488807e, this.f488808f, this.f488809g, this.f488810h, this.f488811i);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.s2 s2Var = (sf2.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.mx1 mx1Var = (r45.mx1) ((xg2.i) this.f488806d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvModSongListRequest success, modType: ");
        int i17 = this.f488807e;
        sb6.append(i17);
        sb6.append(", mid: ");
        sb6.append(this.f488808f);
        sb6.append(", uniqueId ");
        sb6.append(this.f488809g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", sb6.toString());
        if (i17 != 4) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mx1Var);
            sf2.d3.Z6(this.f488810h, i17, mx1Var, "modSong");
        }
        this.f488811i.f391656d = mx1Var;
        return jz5.f0.f384359a;
    }
}
