package v02;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f513764d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f513765e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f513766f;

    /* renamed from: g, reason: collision with root package name */
    public int f513767g;

    /* renamed from: h, reason: collision with root package name */
    public long f513768h;

    /* renamed from: i, reason: collision with root package name */
    public int f513769i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f513770m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f513771n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f513772o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513773p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, java.lang.Long l17, v02.f0 f0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513770m = str;
        this.f513771n = l17;
        this.f513772o = f0Var;
        this.f513773p = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v02.b0(this.f513770m, this.f513771n, this.f513772o, this.f513773p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String nj6;
        v02.f0 f0Var;
        long j17;
        java.lang.String str;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f513769i;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(this.f513770m, this.f513771n.longValue());
            if (k17 == null) {
                return f0Var2;
            }
            v02.f0 f0Var3 = this.f513772o;
            int pj6 = f0Var3.pj(k17);
            nj6 = f0Var3.nj(k17);
            long I0 = k17.I0();
            java.lang.String Q0 = k17.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            this.f513764d = f0Var3;
            this.f513765e = nj6;
            this.f513766f = Q0;
            this.f513767g = pj6;
            this.f513768h = I0;
            this.f513769i = 1;
            obj = v02.f0.Zi(f0Var3, k17, this);
            if (obj == aVar) {
                return aVar;
            }
            f0Var = f0Var3;
            j17 = I0;
            str = Q0;
            i17 = pj6;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j18 = this.f513768h;
            int i19 = this.f513767g;
            java.lang.String str2 = (java.lang.String) this.f513766f;
            nj6 = (java.lang.String) this.f513765e;
            v02.f0 f0Var4 = (v02.f0) this.f513764d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            str = str2;
            i17 = i19;
            f0Var = f0Var4;
            j17 = j18;
        }
        v02.f0.cj(f0Var, i17, nj6, j17, str, (java.lang.String) obj);
        yz5.a aVar2 = this.f513773p;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        return f0Var2;
    }
}
