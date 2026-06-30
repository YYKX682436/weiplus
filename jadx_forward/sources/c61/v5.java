package c61;

/* loaded from: classes2.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f120876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f120877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, long j17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120875d = hVar;
        this.f120876e = h0Var;
        this.f120877f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.v5(this.f120875d, interfaceC29045xdcb5ca57, this.f120876e, this.f120877f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        c61.v5 v5Var = (c61.v5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) ((xg2.i) this.f120875d).f535926b).m75936x14adae67(2);
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1);
            bu2.j jVar = bu2.j.f106067a;
            bu2.i iVar = bu2.i.f106054b;
            jVar.n(a17, bu2.i.f106064l);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f120876e;
            h0Var.f391656d = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "generateFinderVideoPlayer: fetch feed success, feedId=" + pm0.v.u(this.f120877f) + ", feed=" + h0Var.f391656d);
        }
        return jz5.f0.f384359a;
    }
}
