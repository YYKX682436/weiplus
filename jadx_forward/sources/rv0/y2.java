package rv0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(rv0.n1 n1Var, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481873e = n1Var;
        this.f481874f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.y2(this.f481873e, this.f481874f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481872d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        rv0.n1 n1Var = this.f481873e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = n1Var.p7();
            this.f481872d = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                n1Var.r7().a();
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yy0.m7 m7Var = (yy0.m7) n1Var.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.k4(m7Var, null), 3, null);
        ex0.a0 a0Var = this.f481874f;
        if (!((java.lang.Boolean) a0Var.P().f384366d).booleanValue()) {
            return f0Var;
        }
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        q76.r7(string, null);
        ex0.i0.m(a0Var);
        gx0.bf p77 = n1Var.p7();
        this.f481872d = 2;
        if (gx0.bf.d7(p77, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        n1Var.r7().a();
        return f0Var;
    }
}
