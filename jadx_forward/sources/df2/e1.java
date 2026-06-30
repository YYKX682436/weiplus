package df2;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311556d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311557e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311558f;

    /* renamed from: g, reason: collision with root package name */
    public int f311559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.sm1 f311560h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f311561i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f311562m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r45.sm1 sm1Var, yl2.g1 g1Var, df2.k1 k1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311560h = sm1Var;
        this.f311561i = g1Var;
        this.f311562m = k1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.e1(this.f311560h, this.f311561i, this.f311562m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yl2.g1 g1Var;
        r45.sm1 sm1Var;
        df2.k1 k1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311559g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.sm1 sm1Var2 = this.f311560h;
            if (sm1Var2 != null && (g1Var = this.f311561i) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoLive liveMode: ");
                r45.q12 q12Var = (r45.q12) sm1Var2.m75936x14adae67(0);
                sb6.append(q12Var != null ? new java.lang.Integer(q12Var.m75939xb282bd08(0)) : null);
                sb6.append(" liveSubMode: ");
                r45.q12 q12Var2 = (r45.q12) sm1Var2.m75936x14adae67(0);
                sb6.append(q12Var2 != null ? new java.lang.Integer(q12Var2.m75939xb282bd08(1)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", sb6.toString());
                df2.k1 k1Var2 = this.f311562m;
                this.f311556d = k1Var2;
                this.f311557e = g1Var;
                this.f311558f = sm1Var2;
                this.f311559g = 1;
                java.lang.Object t17 = yl2.g1.t(g1Var, null, false, this, 3, null);
                if (t17 == aVar) {
                    return aVar;
                }
                sm1Var = sm1Var2;
                obj = t17;
                k1Var = k1Var2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sm1Var = (r45.sm1) this.f311558f;
        g1Var = (yl2.g1) this.f311557e;
        k1Var = (df2.k1) this.f311556d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", "startLiveCheck failed, errCode:" + ((yl2.x) a0Var).f544614a);
        } else if (a0Var instanceof yl2.z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", "startLiveCheck continueLive");
            g1Var.d(((yl2.z) a0Var).f544620a);
        } else {
            if (!(a0Var instanceof yl2.y)) {
                throw new jz5.j();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", "startLiveCheck success");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0 wg0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0) k1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0.class);
            if (wg0Var != null) {
                wg0Var.u1(false);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE", sm1Var.mo14344x5f01b1f6());
            intent.putExtra("KEY_PARAMS_POST_STRATEGY_ID", k1Var.f312074t);
            intent.putExtra("KEY_PARAMS_POST_GUIDE_LIVE_ID", k1Var.f312075u);
            intent.putExtra("KEY_PARAMS_POST_GUIDE_FINDER_USER_NAME", k1Var.f312076v);
            g1Var.h(intent, ((yl2.y) a0Var).f544616a, false);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ml2.y3 y3Var = ml2.y3.f409811p;
            y4Var.getClass();
            y4Var.f409824c0 = y3Var;
            y4Var.m(y3Var);
            y4Var.a("strategy_id", java.lang.String.valueOf(k1Var.f312074t));
            y4Var.a("guide_live_id", java.lang.String.valueOf(k1Var.f312075u));
            y4Var.a("guide_finderusername", k1Var.f312076v);
        }
        return jz5.f0.f384359a;
    }
}
