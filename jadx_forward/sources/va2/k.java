package va2;

/* loaded from: classes2.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f515778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f515779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va2.n f515780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p944x882e457a.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, va2.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f515778d = fVar;
        this.f515779e = c0Var;
        this.f515780f = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new va2.k(this.f515778d, this.f515779e, this.f515780f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        va2.k kVar = (va2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ma1 ma1Var;
        r45.r03 r03Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTopicTabUIC", "[request] launch ui");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f515778d;
        int i17 = fVar.f152148a;
        va2.n nVar = this.f515780f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f515779e;
        if (i17 == 0 && fVar.f152149b == 0 && (ma1Var = (r45.ma1) fVar.f152151d) != null && (r03Var = (r45.r03) ma1Var.m75936x14adae67(1)) != null) {
            nVar.f534244w = r03Var;
            nVar.E7(r03Var);
            c0Var.f391645d = nVar.Q7(r03Var);
        }
        if (!c0Var.f391645d) {
            nVar.C7(fVar.f152149b, fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
