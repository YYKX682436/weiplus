package id2;

/* loaded from: classes3.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f372238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372239f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, az2.f fVar, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372237d = hVar;
        this.f372238e = fVar;
        this.f372239f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.o2(this.f372237d, interfaceC29045xdcb5ca57, this.f372238e, this.f372239f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.o2 o2Var = (id2.o2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f372237d).f535926b;
        this.f372238e.b();
        r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
        boolean z17 = nw1Var != null;
        yz5.l lVar = this.f372239f;
        if (z17) {
            lVar.mo146xb9724478(nw1Var);
        } else {
            lVar.mo146xb9724478(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePersonalCente", "get live info success, but liveInfo is null");
        }
        return jz5.f0.f384359a;
    }
}
