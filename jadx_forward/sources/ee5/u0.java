package ee5;

/* loaded from: classes9.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333593d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f333595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ee5.v0 v0Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333595f = v0Var;
        this.f333596g = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.u0 u0Var = new ee5.u0(this.f333595f, this.f333596g, interfaceC29045xdcb5ca57);
        u0Var.f333594e = obj;
        return u0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        ot0.q v17;
        long j17;
        java.lang.String s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333593d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333594e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemFileUIC", "fileSearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.v0 v0Var = this.f333595f;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v0Var.f333589o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(v0Var.f333589o) : null;
            java.util.Iterator it6 = this.f333596g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next();
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemFileUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j19 = f9Var.j();
                if (j19 == null || (v17 = ot0.q.v(j19)) == null) {
                    it = it6;
                } else {
                    it = it6;
                    long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(f9Var.mo78012x3fdd41df()));
                    if (j18 != a17) {
                        j17 = a17;
                        arrayList.add(new ae5.b(f9Var.mo78012x3fdd41df()));
                    } else {
                        j17 = a17;
                    }
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v0Var.f333589o);
                    java.lang.String str = "";
                    if (f9Var.A0() == 1) {
                        s17 = c01.z1.r();
                    } else {
                        s17 = R4 ? c01.w9.s(f9Var.j()) : "";
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17)) {
                            s17 = f9Var.Q0();
                        }
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, true);
                    if (z07 != null) {
                        if (!(s17 == null || s17.length() == 0)) {
                            str = z07.z0(s17);
                        }
                    }
                    java.lang.String str2 = str;
                    java.lang.String str3 = v17.f430223o;
                    kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
                    int a18 = o25.y.a(str3);
                    ae5.c cVar = new ae5.c(f9Var.mo78012x3fdd41df(), v17.f430199i, v17.n(), f9Var.m124847x74d37ac6(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                    if (te5.h.f500182a.c()) {
                        cVar.f85922l = te5.j.f500219a.a(f9Var, v17.f430223o, v0Var.m80379x76847179());
                    }
                    cVar.f85920j = a18;
                    cVar.f85921k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(v17.f430215m);
                    arrayList.add(cVar);
                    j18 = j17;
                }
                it6 = it;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ee5.t0 t0Var = new ee5.t0(v0Var, arrayList, null);
            this.f333593d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, t0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
