package ni2;

/* loaded from: classes3.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f418931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 f418932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f418933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f418934h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fj2.k f418935i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f418936m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f418937n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ km2.q f418938o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f418939p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35, dk2.u4 u4Var, boolean z17, fj2.k kVar, boolean z18, boolean z19, km2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418931e = hVar;
        this.f418932f = c14234xd22fbb35;
        this.f418933g = u4Var;
        this.f418934h = z17;
        this.f418935i = kVar;
        this.f418936m = z18;
        this.f418937n = z19;
        this.f418938o = qVar;
        this.f418939p = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ni2.p(this.f418931e, interfaceC29045xdcb5ca57, this.f418932f, this.f418933g, this.f418934h, this.f418935i, this.f418936m, this.f418937n, this.f418938o, this.f418939p);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f418930d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.x71 x71Var = (r45.x71) ((xg2.i) this.f418931e).f535926b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMicMemberList success, isShowing: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35 = this.f418932f;
            ni2.v2 v2Var = c14234xd22fbb35.f193243p;
            if (v2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("panel");
                throw null;
            }
            sb6.append(((ni2.w) v2Var).q());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicGiftMemberPanelTabView", sb6.toString());
            ni2.v2 v2Var2 = c14234xd22fbb35.f193243p;
            if (v2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("panel");
                throw null;
            }
            if (((ni2.w) v2Var2).q()) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                ni2.m mVar = new ni2.m(this.f418932f, x71Var, this.f418933g, this.f418934h, this.f418935i, this.f418936m, this.f418937n, this.f418938o, this.f418939p, null);
                this.f418930d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, mVar, this) == aVar) {
                    return aVar;
                }
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
