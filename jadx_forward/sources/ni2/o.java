package ni2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f418925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 f418926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418925e = hVar;
        this.f418926f = c14234xd22fbb35;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ni2.o(this.f418925e, interfaceC29045xdcb5ca57, this.f418926f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f418924d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f418925e).f535914b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMicMemberList fail, isShowing: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35 = this.f418926f;
            ni2.v2 v2Var = c14234xd22fbb35.f193243p;
            if (v2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("panel");
                throw null;
            }
            sb6.append(((ni2.w) v2Var).q());
            sb6.append(" error: ");
            sb6.append(aVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicGiftMemberPanelTabView", sb6.toString());
            ni2.v2 v2Var2 = c14234xd22fbb35.f193243p;
            if (v2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("panel");
                throw null;
            }
            if (((ni2.w) v2Var2).q()) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                ni2.n nVar = new ni2.n(c14234xd22fbb35, null);
                this.f418924d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, nVar, this) == aVar) {
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
