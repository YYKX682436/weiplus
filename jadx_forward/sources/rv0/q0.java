package rv0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.s0 f481726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, rv0.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481724e = n1Var;
        this.f481725f = c4128x879fba0a;
        this.f481726g = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.q0(this.f481724e, this.f481725f, this.f481726g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481723d;
        rv0.n1 n1Var = this.f481724e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = n1Var.p7();
            this.f481723d = 1;
            if (p76.e7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                gx0.kh q76 = n1Var.q7();
                java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                q76.r7(string, this.f481726g.f481759a);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.bf p77 = n1Var.p7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a seekTime = this.f481725f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(seekTime, "$seekTime");
        this.f481723d = 2;
        if (gx0.bf.d7(p77, null, seekTime, true, this, 1, null) == aVar) {
            return aVar;
        }
        gx0.kh q762 = n1Var.q7();
        java.lang.String string2 = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        q762.r7(string2, this.f481726g.f481759a);
        return jz5.f0.f384359a;
    }
}
