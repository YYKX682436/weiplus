package v02;

/* loaded from: classes3.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f513755d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f513756e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f513757f;

    /* renamed from: g, reason: collision with root package name */
    public int f513758g;

    /* renamed from: h, reason: collision with root package name */
    public long f513759h;

    /* renamed from: i, reason: collision with root package name */
    public int f513760i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f513761m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f513762n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513763o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v02.f0 f0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513761m = f0Var;
        this.f513762n = f9Var;
        this.f513763o = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v02.a0(this.f513761m, this.f513762n, this.f513763o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int pj6;
        java.lang.String str;
        v02.f0 f0Var;
        java.lang.String str2;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f513760i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v02.f0 f0Var2 = this.f513761m;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f513762n;
            pj6 = f0Var2.pj(f9Var);
            java.lang.String nj6 = f0Var2.nj(f9Var);
            long I0 = f9Var.I0();
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            this.f513755d = f0Var2;
            this.f513756e = nj6;
            this.f513757f = Q0;
            this.f513758g = pj6;
            this.f513759h = I0;
            this.f513760i = 1;
            obj = v02.f0.Zi(f0Var2, f9Var, this);
            if (obj == aVar) {
                return aVar;
            }
            str = nj6;
            f0Var = f0Var2;
            str2 = Q0;
            j17 = I0;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f513759h;
            int i18 = this.f513758g;
            java.lang.String str3 = (java.lang.String) this.f513757f;
            java.lang.String str4 = (java.lang.String) this.f513756e;
            v02.f0 f0Var3 = (v02.f0) this.f513755d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pj6 = i18;
            str = str4;
            f0Var = f0Var3;
            str2 = str3;
            j17 = j18;
        }
        v02.f0.cj(f0Var, pj6, str, j17, str2, (java.lang.String) obj);
        yz5.a aVar2 = this.f513763o;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
