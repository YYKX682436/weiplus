package sf2;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488765d = hVar;
        this.f488766e = str;
        this.f488767f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.p(this.f488765d, interfaceC29045xdcb5ca57, this.f488766e, this.f488767f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.p pVar = (sf2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.wx1 wx1Var = (r45.wx1) ((xg2.i) this.f488765d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("searchAddPanelSmartBox success, content: ");
        sb6.append(this.f488766e);
        sb6.append(", count: ");
        java.util.LinkedList linkedList = wx1Var.f471085d;
        sb6.append(linkedList != null ? new java.lang.Integer(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        this.f488767f.f391656d = wx1Var;
        return jz5.f0.f384359a;
    }
}
