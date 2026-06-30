package df2;

/* loaded from: classes3.dex */
public final class e00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311548d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311549e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311550f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f311551g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f311552h;

    /* renamed from: i, reason: collision with root package name */
    public int f311553i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f311554m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f311555n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(p3325xe03a0797.p3326xc267989b.q qVar, df2.m00 m00Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311554m = qVar;
        this.f311555n = m00Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.e00(this.f311554m, this.f311555n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.e00) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        v65.n nVar;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c76;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        df2.m00 m00Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311553i;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nVar = new v65.n(this.f311554m);
            df2.m00 m00Var2 = this.f311555n;
            if (m00Var2.f312274n.size() > 1) {
                c76 = m00Var2.c7();
                if (c76 != null) {
                    if (c76.getUseRfx()) {
                        this.f311548d = nVar;
                        this.f311549e = c76;
                        this.f311550f = m00Var2;
                        this.f311551g = c76;
                        this.f311552h = c76;
                        this.f311553i = 1;
                        java.lang.Object a76 = df2.m00.a7(m00Var2, 1, this);
                        if (a76 == aVar) {
                            return aVar;
                        }
                        c22789xd23e9a9b2 = c76;
                        m00Var = m00Var2;
                        obj = a76;
                        c22789xd23e9a9b2.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj);
                    } else {
                        this.f311548d = nVar;
                        this.f311549e = c76;
                        this.f311550f = m00Var2;
                        this.f311551g = c76;
                        this.f311552h = c76;
                        this.f311553i = 2;
                        java.lang.Object Z6 = df2.m00.Z6(m00Var2, 1, this);
                        if (Z6 == aVar) {
                            return aVar;
                        }
                        c22789xd23e9a9b = c76;
                        m00Var = m00Var2;
                        obj = Z6;
                        c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) obj);
                    }
                }
            } else {
                df2.m00.b7(m00Var2);
                nVar.a(f0Var);
            }
            return f0Var;
        }
        if (i17 == 1) {
            c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311552h;
            c76 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311551g;
            m00Var = (df2.m00) this.f311550f;
            nVar = (v65.n) this.f311548d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c22789xd23e9a9b2.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311552h;
            c76 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f311551g;
            m00Var = (df2.m00) this.f311550f;
            nVar = (v65.n) this.f311548d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) obj);
        }
        c76.d();
        c76.m82583xcde73672(1);
        c76.m82582x3ae760af(0.0d);
        c76.g();
        c76.a(new df2.d00(c76, m00Var, nVar));
        return f0Var;
    }
}
