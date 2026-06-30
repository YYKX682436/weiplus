package sf2;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488800d = hVar;
        this.f488801e = str;
        this.f488802f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.s(this.f488800d, interfaceC29045xdcb5ca57, this.f488801e, this.f488802f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.s sVar = (sf2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ux1 ux1Var = (r45.ux1) ((xg2.i) this.f488800d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("searchAddPanelKtvMusic success, realKey: ");
        sb6.append(this.f488801e);
        sb6.append(", count: ");
        java.util.LinkedList linkedList = ux1Var.f469246d;
        sb6.append(linkedList != null ? new java.lang.Integer(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        this.f488802f.f391656d = ux1Var;
        return jz5.f0.f384359a;
    }
}
