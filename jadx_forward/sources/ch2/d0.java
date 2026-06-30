package ch2;

/* loaded from: classes10.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f122837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f122840g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122837d = hVar;
        this.f122838e = str;
        this.f122839f = str2;
        this.f122840g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.d0(this.f122837d, interfaceC29045xdcb5ca57, this.f122838e, this.f122839f, this.f122840g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.d0 d0Var = (ch2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ix1 ix1Var = (r45.ix1) ((xg2.i) this.f122837d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSongPlayDetailInfo success sdkUserId: ");
        sb6.append(this.f122838e);
        sb6.append(" songUniqueId: ");
        sb6.append(this.f122839f);
        sb6.append(" it.play_info: ");
        sb6.append(ix1Var.f458919d);
        sb6.append(" res: ");
        r45.by1 by1Var = ix1Var.f458919d;
        sb6.append(by1Var != null ? by1Var.f452677e : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", sb6.toString());
        this.f122840g.f391656d = ix1Var.f458919d;
        return jz5.f0.f384359a;
    }
}
