package sf2;

/* loaded from: classes.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, java.lang.String str2) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488571d = hVar;
        this.f488572e = str;
        this.f488573f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.a3(this.f488571d, interfaceC29045xdcb5ca57, this.f488572e, this.f488573f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.a3 a3Var = (sf2.a3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRequestSongController", "FinderLiveKtvSearchMusicSmartBoxRequest fail: content " + this.f488572e + ", ID " + this.f488573f + ", " + ((xg2.a) ((xg2.b) this.f488571d).f535914b));
        return jz5.f0.f384359a;
    }
}
