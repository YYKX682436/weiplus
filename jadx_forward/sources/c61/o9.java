package c61;

/* loaded from: classes2.dex */
public final class o9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f120739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f120740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f120741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120739d = hVar;
        this.f120740e = j17;
        this.f120741f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.o9(this.f120739d, interfaceC29045xdcb5ca57, this.f120740e, this.f120741f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        c61.o9 o9Var = (c61.o9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o9Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f120739d).f535914b;
        rm0.j jVar = aVar2.f535912a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f120741f;
        rm0.j jVar2 = aVar2.f535912a;
        if (jVar != null) {
            if (hc2.p.b(jVar != null ? jVar.f478957e : 0, jVar != null ? jVar.f478958f : 0)) {
                java.lang.Object obj2 = jVar2 != null ? jVar2.f478960h : null;
                r45.h51 h51Var = obj2 instanceof r45.h51 ? (r45.h51) obj2 : null;
                if (h51Var != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2)) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1);
                    bu2.j jVar3 = bu2.j.f106067a;
                    bu2.i iVar = bu2.i.f106054b;
                    jVar3.n(a17, bu2.i.f106064l);
                    h0Var.f391656d = a17;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generateFinderVideoPlayer: fetch feed fail, errType=");
        sb6.append(jVar2 != null ? jVar2.f478957e : 0);
        sb6.append(", errCode=");
        sb6.append(jVar2 != null ? jVar2.f478958f : 0);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(this.f120740e));
        sb6.append(", feed=");
        sb6.append(h0Var.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", sb6.toString());
        return jz5.f0.f384359a;
    }
}
