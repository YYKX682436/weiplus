package gl4;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.u80 f354396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl4.a f354397g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f354398h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gl4.z zVar, bw5.u80 u80Var, gl4.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f354395e = zVar;
        this.f354396f = u80Var;
        this.f354397g = aVar;
        this.f354398h = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gl4.j(this.f354395e, this.f354396f, this.f354397g, this.f354398h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl4.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ie mo11484xe92ab0a8;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354394d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f354394d = 1;
            obj = this.f354395e.b(this.f354396f, 1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.y80 y80Var = (bw5.y80) obj;
        boolean z17 = (y80Var == null || (mo11484xe92ab0a8 = y80Var.mo11484xe92ab0a8()) == null || mo11484xe92ab0a8.f458492d != 0) ? false : true;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f354398h;
        if (z17) {
            gl4.a aVar2 = this.f354397g;
            if (aVar2 != null) {
                aVar2.f354376b = y80Var.f116936h[3] ? y80Var.f116933e : new bw5.r70();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinMembershipByWeCoin success, respBuffer length: ");
            sb6.append((y80Var.f116936h[2] ? y80Var.f116932d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).f273689a.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((y80Var.f116936h[2] ? y80Var.f116932d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g()));
        } else {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        return jz5.f0.f384359a;
    }
}
