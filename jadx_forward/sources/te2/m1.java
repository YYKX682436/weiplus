package te2;

/* loaded from: classes.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f499751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f499753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f499754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Integer num, int i18) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499751d = hVar;
        this.f499752e = i17;
        this.f499753f = num;
        this.f499754g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.m1(this.f499751d, interfaceC29045xdcb5ca57, this.f499752e, this.f499753f, this.f499754g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        te2.m1 m1Var = (te2.m1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        m1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f499751d).f535914b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("failed syncBGMAction action = ");
        sb6.append(this.f499752e);
        sb6.append(", curSongId:");
        sb6.append(this.f499753f);
        sb6.append("},errCode:");
        rm0.j jVar = aVar2.f535912a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f478958f) : null);
        sb6.append(", cur_volume:");
        sb6.append(this.f499754g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", sb6.toString());
        return jz5.f0.f384359a;
    }
}
