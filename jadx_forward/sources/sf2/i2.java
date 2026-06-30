package sf2;

/* loaded from: classes10.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488702d = hVar;
        this.f488703e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.i2(this.f488702d, interfaceC29045xdcb5ca57, this.f488703e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.i2 i2Var = (sf2.i2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.kx1 kx1Var = (r45.kx1) ((xg2.i) this.f488702d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvGetSongSungListRequest success, songHasSung ");
        java.util.LinkedList<r45.yx1> song_sung_list = kx1Var.f460547d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_sung_list, "song_sung_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(song_sung_list, 10));
        for (r45.yx1 yx1Var : song_sung_list) {
            arrayList.add(yx1Var.f472991d + ": " + yx1Var.f472999o.f452676d.f451884e + ", status " + yx1Var.f472997m);
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", sb6.toString());
        this.f488703e.f391656d = kx1Var;
        return jz5.f0.f384359a;
    }
}
