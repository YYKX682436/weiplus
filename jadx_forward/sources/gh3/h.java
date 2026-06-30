package gh3;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gh3.i f353432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f353433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f353434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f353435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f353436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f353437i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f353438m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f353439n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f353440o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gh3.i iVar, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Context context, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f353432d = iVar;
        this.f353433e = c20976x6ba6452a;
        this.f353434f = z17;
        this.f353435g = f9Var;
        this.f353436h = i17;
        this.f353437i = i18;
        this.f353438m = h0Var;
        this.f353439n = context;
        this.f353440o = intent;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gh3.h(this.f353432d, this.f353433e, this.f353434f, this.f353435g, this.f353436h, this.f353437i, this.f353438m, this.f353439n, this.f353440o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gh3.h hVar = (gh3.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        oz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.rz4 rz4Var = new r45.rz4();
        r45.v43 v43Var = new r45.v43();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f353435g;
        v43Var.f469402d = (int) f9Var.m124847x74d37ac6();
        java.lang.String y07 = f9Var.y0();
        if (y07 == null) {
            y07 = "";
        }
        v43Var.f469403e = x51.j1.i(y07);
        java.lang.String T0 = f9Var.T0();
        if (T0 == null) {
            T0 = "";
        }
        v43Var.f469404f = x51.j1.i(T0);
        v43Var.f469405g = this.f353436h;
        v43Var.f469406h = this.f353437i;
        v43Var.f469407i = (int) f9Var.mo78012x3fdd41df();
        java.lang.String str = f9Var.G;
        v43Var.f469408m = str != null ? str : "";
        v43Var.f469409n = f9Var.I0();
        v43Var.f469410o = (int) f9Var.F0();
        rz4Var.f466850d = v43Var;
        this.f353432d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCgi, MsgInfo: ");
        r45.v43 v43Var2 = rz4Var.f466850d;
        sb6.append(v43Var2 != null ? v43Var2.mo12245xcc313de3() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityMsgIntercept", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 6999;
        lVar2.f152199c = "/cgi-bin/micromsg-bin/forwardmsgviewspam";
        lVar2.f152197a = rz4Var;
        lVar2.f152198b = new r45.sz4();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar2.a());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f353433e;
        boolean z17 = this.f353434f;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            lVar = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        } else {
            lVar = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        }
        p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, lVar, null, new gh3.g(a17, this.f353438m, this.f353435g, z17, this.f353439n, this.f353440o, this.f353437i, this.f353432d, null), 2, null);
        return jz5.f0.f384359a;
    }
}
