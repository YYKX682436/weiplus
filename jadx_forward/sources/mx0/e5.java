package mx0;

/* loaded from: classes5.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413478d;

    /* renamed from: e, reason: collision with root package name */
    public int f413479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.f0 f413480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx0.k f413481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413482h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f413483i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f413484m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(py0.f0 f0Var, rx0.k kVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, boolean z17, yz5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413480f = f0Var;
        this.f413481g = kVar;
        this.f413482h = c10977x8e40eced;
        this.f413483i = z17;
        this.f413484m = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.e5(this.f413480f, this.f413481g, this.f413482h, this.f413483i, this.f413484m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.e5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String endReason;
        java.lang.String str;
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5;
        java.lang.String str2;
        mx0.l1 m47306x2f3509ad;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413479e;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413482h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            py0.f0 f0Var = this.f413480f;
            if (f0Var.isShowing()) {
                f0Var.dismiss();
            }
            rx0.k kVar = this.f413481g;
            java.lang.String str3 = kVar != null ? kVar.f482474h : null;
            endReason = "Error";
            if (!(str3 == null || str3.length() == 0)) {
                if (kVar == null || (str2 = kVar.f482474h) == null) {
                    str2 = "";
                }
                c10977x8e40eced.U0(str2, new mx0.c5(c10977x8e40eced));
            } else if (this.f413483i) {
                endReason = "UserExit";
            } else {
                java.lang.String str4 = (kVar == null || (c3981x30b9dbd5 = kVar.f482469c) == null) ? null : c3981x30b9dbd5.f129350a;
                if (str4 != null) {
                    this.f413478d = "Completed";
                    this.f413479e = 1;
                    if (this.f413484m.mo147xb9724478(str4, kVar, this) == aVar) {
                        return aVar;
                    }
                    str = "Completed";
                } else {
                    java.lang.String string = c10977x8e40eced.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.llf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    c10977x8e40eced.U0(string, new mx0.d5(c10977x8e40eced));
                }
            }
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            m7Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.b2(m7Var, endReason, null), 3, null);
            m47306x2f3509ad = c10977x8e40eced.m47306x2f3509ad();
            m47306x2f3509ad.b();
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) this.f413478d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        endReason = str;
        yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.b2(m7Var2, endReason, null), 3, null);
        m47306x2f3509ad = c10977x8e40eced.m47306x2f3509ad();
        m47306x2f3509ad.b();
        return jz5.f0.f384359a;
    }
}
