package gc0;

/* loaded from: classes5.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f351904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351908i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351909m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f351910n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f351911o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351912p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351913q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(gc0.b0 b0Var, gc0.p2 p2Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351904e = b0Var;
        this.f351905f = p2Var;
        this.f351906g = c21475x81dbaa18;
        this.f351907h = aVar;
        this.f351908i = aVar2;
        this.f351909m = aVar3;
        this.f351910n = aVar4;
        this.f351911o = c21475x81dbaa182;
        this.f351912p = lVar;
        this.f351913q = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.y1(this.f351904e, this.f351905f, this.f351906g, this.f351907h, this.f351908i, this.f351909m, this.f351910n, this.f351911o, this.f351912p, this.f351913q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.y1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f351903d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gc0.y0 y0Var = gc0.y0.f351898a;
            int i18 = this.f351905f.f351780i ? 1 : 2;
            this.f351903d = 1;
            a17 = y0Var.a(this.f351904e, i18, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        uc0.u uVar = (uc0.u) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRecommendRemark() called getRecommendList result remark:");
        sb6.append(uVar.f507811a.size());
        sb6.append(" phone:");
        sb6.append(uVar.f507812b.size());
        sb6.append(" img:");
        r45.kl5 kl5Var = uVar.f507813c;
        sb6.append(kl5Var != null ? new java.lang.Long(kl5Var.m75942xfb822ef2(4)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkUIC", sb6.toString());
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        gc0.x1 x1Var = new gc0.x1(this.f351905f, this.f351904e, this.f351906g, this.f351907h, this.f351908i, this.f351909m, this.f351910n, this.f351911o, this.f351912p, uVar, this.f351913q, null);
        this.f351903d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, x1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
