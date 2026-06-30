package gc0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351890h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351891i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351892m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351893n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351894o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ uc0.u f351895p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351896q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(gc0.p2 p2Var, gc0.b0 b0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182, yz5.l lVar, uc0.u uVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351886d = p2Var;
        this.f351887e = b0Var;
        this.f351888f = c21475x81dbaa18;
        this.f351889g = aVar;
        this.f351890h = aVar2;
        this.f351891i = aVar3;
        this.f351892m = aVar4;
        this.f351893n = c21475x81dbaa182;
        this.f351894o = lVar;
        this.f351895p = uVar;
        this.f351896q = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.x1(this.f351886d, this.f351887e, this.f351888f, this.f351889g, this.f351890h, this.f351891i, this.f351892m, this.f351893n, this.f351894o, this.f351895p, this.f351896q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gc0.x1 x1Var = (gc0.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f351886d.W6(this.f351887e, this.f351888f, this.f351889g, null, this.f351890h);
        this.f351886d.U6(this.f351887e, this.f351891i, this.f351892m, this.f351893n, this.f351894o);
        uc0.u uVar = this.f351895p;
        r45.kl5 kl5Var = uVar.f507813c;
        if ((kl5Var != null ? kl5Var.m75942xfb822ef2(4) : 0L) != 0 && (lVar = this.f351896q) != null) {
            lVar.mo146xb9724478(uVar.f507813c);
        }
        return jz5.f0.f384359a;
    }
}
