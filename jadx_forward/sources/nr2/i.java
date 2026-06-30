package nr2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.l f420738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f420740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f420741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nr2.l lVar, int i17, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420738d = lVar;
        this.f420739e = i17;
        this.f420740f = list;
        this.f420741g = c15343x638a173f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr2.i(this.f420738d, this.f420739e, this.f420740f, this.f420741g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nr2.i iVar = (nr2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nr2.l lVar = this.f420738d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = lVar.f420788h;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8153xd399a4d9(this.f420739e, this.f420740f.size());
        }
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f420741g;
        c15343x638a173f.e(true);
        if (!lVar.f420787g) {
            c15343x638a173f.E(true);
        }
        return jz5.f0.f384359a;
    }
}
