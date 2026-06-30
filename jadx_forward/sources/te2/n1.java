package te2;

/* loaded from: classes3.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f499776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f499778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499779g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Integer num, te2.p1 p1Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499776d = hVar;
        this.f499777e = i17;
        this.f499778f = num;
        this.f499779g = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.n1(this.f499776d, interfaceC29045xdcb5ca57, this.f499777e, this.f499778f, this.f499779g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        te2.n1 n1Var = (te2.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long m75942xfb822ef2 = ((r45.ke1) ((xg2.i) this.f499776d).f535926b).m75942xfb822ef2(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sucess syncBGMAction action = ");
        sb6.append(this.f499777e);
        sb6.append(", curSongId:");
        sb6.append(this.f499778f);
        sb6.append("}, cur_volume:");
        te2.p1 p1Var = this.f499779g;
        sb6.append(((mm2.c1) p1Var.f499820e.a(mm2.c1.class)).E4);
        sb6.append(", timeStamp:");
        sb6.append(m75942xfb822ef2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", sb6.toString());
        p1Var.f().mo50308x2936bf5f(p1Var.f().mo50292x733c63a2(p1Var.f499828p, new java.lang.Long(m75942xfb822ef2)));
        return jz5.f0.f384359a;
    }
}
