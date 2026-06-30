package rq2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jp1 f480365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f22 f480366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f480367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.jp1 jp1Var, r45.f22 f22Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480365d = jp1Var;
        this.f480366e = f22Var;
        this.f480367f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rq2.i(this.f480365d, this.f480366e, this.f480367f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rq2.i iVar = (rq2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rq2.o oVar = rq2.o.f480380a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71 c6784x711efb71 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71();
        rq2.d dVar = rq2.d.f480349a;
        c6784x711efb71.f141163m = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
        c6784x711efb71.f141164n = c6784x711efb71.b("networkType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        rq2.b bVar = rq2.b.f480344e;
        c6784x711efb71.f141166p = 5;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.jp1 jp1Var = this.f480365d;
        jSONObject.putOpt("loading_time", java.lang.Integer.valueOf(jp1Var.m75939xb282bd08(1)));
        jSONObject.putOpt("loading_time_from_click", java.lang.Integer.valueOf(jp1Var.m75939xb282bd08(5)));
        jSONObject.putOpt("enter_type", java.lang.Integer.valueOf(jp1Var.m75939xb282bd08(2)));
        jSONObject.putOpt("enter_reddot_type", java.lang.Integer.valueOf(jp1Var.m75939xb282bd08(4)));
        jSONObject.putOpt("status_flag", java.lang.Long.valueOf(this.f480366e.m75942xfb822ef2(2)));
        jSONObject.putOpt("isVerticalSquare", java.lang.Integer.valueOf(this.f480367f ? 1 : 0));
        ae2.b2 b2Var = ae2.b2.f84994a;
        jSONObject.putOpt("isOpenSquareTabOp", ((lb2.j) ((jz5.n) ae2.b2.G).mo141623x754a37bb()).r());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6784x711efb71.f141169s = c6784x711efb71.b("opMsg", r26.i0.t(jSONObject2, ",", ";", false), true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6784x711efb71);
        c6784x711efb71.k();
        return jz5.f0.f384359a;
    }
}
