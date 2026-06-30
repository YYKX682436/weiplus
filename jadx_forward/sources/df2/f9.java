package df2;

/* loaded from: classes10.dex */
public final class f9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311660d;

    /* renamed from: e, reason: collision with root package name */
    public int f311661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.k9 f311662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(df2.k9 k9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311662f = k9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.f9(this.f311662f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.f9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311661e;
        df2.k9 k9Var = this.f311662f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = k9Var.f312098s;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.setVisibility(0);
            }
            this.f311660d = k9Var;
            this.f311661e = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = k9Var.f312098s;
            if (c22789xd23e9a9b2 != null) {
                c22789xd23e9a9b2.a(new df2.e9(k9Var, c0Var, rVar));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k9Var.f312092m, "start hot comment animation, playOnce!");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = k9Var.f312098s;
            if (c22789xd23e9a9b3 != null) {
                c22789xd23e9a9b3.g();
            }
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k9Var.f312092m, "stop hot comment animation");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = k9Var.f312098s;
        if (c22789xd23e9a9b4 != null) {
            c22789xd23e9a9b4.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = k9Var.f312098s;
        if (c22789xd23e9a9b5 != null) {
            c22789xd23e9a9b5.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
