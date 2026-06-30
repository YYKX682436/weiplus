package gc0;

/* loaded from: classes5.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f351877i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351878m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351873e = p2Var;
        this.f351874f = b0Var;
        this.f351875g = aVar;
        this.f351876h = c21475x81dbaa18;
        this.f351877i = z17;
        this.f351878m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.w1(this.f351873e, this.f351874f, this.f351875g, this.f351876h, this.f351877i, this.f351878m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.w1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f351872d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            gc0.v1 v1Var = new gc0.v1(this.f351873e, this.f351874f, this.f351875g, this.f351876h, this.f351877i, this.f351878m, null);
            this.f351872d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, v1Var, this) == aVar) {
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
