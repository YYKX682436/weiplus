package sr2;

/* loaded from: classes10.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f493228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f493230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493231g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493232h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.b01 f493233i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f493234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493235n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.b01 f493236o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f493237p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.lang.String str, java.lang.String str2, r45.b01 b01Var, int i17, java.lang.String str3, r45.b01 b01Var2, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493229e = c14609xb4d6eef6;
        this.f493230f = c14994x9b99c079;
        this.f493231g = str;
        this.f493232h = str2;
        this.f493233i = b01Var;
        this.f493234m = i17;
        this.f493235n = str3;
        this.f493236o = b01Var2;
        this.f493237p = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sr2.r3(this.f493229e, this.f493230f, this.f493231g, this.f493232h, this.f493233i, this.f493234m, this.f493235n, this.f493236o, this.f493237p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sr2.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f493228d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493229e;
            qd2.x xVar = (qd2.x) c14609xb4d6eef6.W.mo141623x754a37bb();
            android.app.Activity m80379x76847179 = c14609xb4d6eef6.m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f493230f;
            java.lang.String T6 = c14609xb4d6eef6.F7().T6();
            java.lang.String a76 = c14609xb4d6eef6.F7().a7();
            java.lang.String str = this.f493231g;
            java.lang.String str2 = this.f493232h;
            r45.b01 b01Var = this.f493233i;
            java.util.LinkedList m75941xfb821914 = b01Var != null ? b01Var.m75941xfb821914(0) : null;
            int i18 = this.f493234m;
            java.lang.String str3 = this.f493235n;
            r45.b01 b01Var2 = this.f493236o;
            java.util.LinkedList m75941xfb8219142 = b01Var2 != null ? b01Var2.m75941xfb821914(0) : null;
            int i19 = this.f493237p;
            ya2.p1 p1Var = c14609xb4d6eef6.I7().f493333d;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            r45.ze2 ze2Var = ((yv2.b) p1Var).f547735h;
            this.f493228d = 1;
            a17 = xVar.a(m80379x76847179, c14994x9b99c079, bw5.ps0.emMMFinderModFeedScene_DescAndCoverUrl, T6, a76, str, str2, m75941xfb821914, i18, str3, m75941xfb8219142, i19, ze2Var, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef62 = this.f493229e;
        pf5.e.m158344xbe96bc24(c14609xb4d6eef62, null, null, new sr2.q3(c14609xb4d6eef62, (jz5.l) a17, null), 3, null);
        return jz5.f0.f384359a;
    }
}
