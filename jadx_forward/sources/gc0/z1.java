package gc0;

/* loaded from: classes5.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351922h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351923i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351924m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351925n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351926o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351927p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351928q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(gc0.b0 b0Var, gc0.p2 p2Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351919e = b0Var;
        this.f351920f = p2Var;
        this.f351921g = c21475x81dbaa18;
        this.f351922h = aVar;
        this.f351923i = aVar2;
        this.f351924m = aVar3;
        this.f351925n = aVar4;
        this.f351926o = c21475x81dbaa182;
        this.f351927p = lVar;
        this.f351928q = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.z1(this.f351919e, this.f351920f, this.f351921g, this.f351922h, this.f351923i, this.f351924m, this.f351925n, this.f351926o, this.f351927p, this.f351928q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f351918d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            gc0.y1 y1Var = new gc0.y1(this.f351919e, this.f351920f, this.f351921g, this.f351922h, this.f351923i, this.f351924m, this.f351925n, this.f351926o, this.f351927p, this.f351928q, null);
            this.f351918d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, y1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
