package sf2;

/* loaded from: classes10.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f488570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, sf2.d3 d3Var, int i17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488567d = hVar;
        this.f488568e = h0Var;
        this.f488569f = d3Var;
        this.f488570g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.a2(this.f488567d, interfaceC29045xdcb5ca57, this.f488568e, this.f488569f, this.f488570g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.a2 a2Var = (sf2.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.mx1 mx1Var = (r45.mx1) ((xg2.i) this.f488567d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", "clearSong success");
        this.f488568e.f391656d = mx1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mx1Var);
        sf2.d3.Z6(this.f488569f, this.f488570g, mx1Var, "clearSong");
        return jz5.f0.f384359a;
    }
}
