package ee5;

/* loaded from: classes9.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333489d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.m2 f333491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(ee5.m2 m2Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333491f = m2Var;
        this.f333492g = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.l2 l2Var = new ee5.l2(this.f333491f, this.f333492g, interfaceC29045xdcb5ca57);
        l2Var.f333490e = obj;
        return l2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        ot0.q v17;
        long j17;
        java.lang.String s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333489d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333490e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg. FTSMultiItemUrlUIC", "UrlSearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.m2 m2Var = this.f333491f;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m2Var.f333589o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(m2Var.f333589o) : null;
            java.util.Iterator it6 = this.f333492g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next();
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg. FTSMultiItemUrlUIC", "is no active");
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
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m2Var.f333589o);
                    java.lang.String str = "";
                    if (f9Var.A0() == z17) {
                        s17 = c01.z1.r();
                    } else {
                        s17 = R4 ? c01.w9.s(f9Var.j()) : "";
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17)) {
                            s17 = f9Var.Q0();
                        }
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, z17);
                    if (z07 != null) {
                        if (!((s17 == null || s17.length() == 0) ? z17 : false)) {
                            str = z07.z0(s17);
                        }
                    }
                    ae5.m mVar = new ae5.m(f9Var.mo78012x3fdd41df(), v17.f430199i, v17.f430187f, f9Var.m124847x74d37ac6(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str, f9Var.Q0());
                    java.lang.String str2 = v17.f430223o;
                    kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
                    o25.y.a(str2);
                    java.lang.String v18 = o72.x1.v(m2Var.m158354x19263085(), v17.f430255w);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(v17.f430255w, z17);
                    if (n18 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n18.d1(), v17.f430255w)) {
                        ((c01.k7) c01.n8.a()).b(v17.f430255w, 14, null);
                    } else {
                        v18 = n18.g2();
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.z0())) {
                        mVar.f85963l = v17.f430267z;
                    } else {
                        mVar.f85963l = f9Var.z0();
                    }
                    mVar.f85961j = v17.f430179d;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v18)) {
                        v18 = v17.f430191g;
                    }
                    mVar.f85962k = v18;
                    int i18 = v17.f430199i;
                    if (i18 == 5) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg. FTSMultiItemUrlUIC", "loadData type: %d", new java.lang.Integer(i18));
                        ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
                        mVar.f85964m = fVar != null && fVar.f429993g == 1 && fVar.f429988b == 5;
                    }
                    arrayList.add(mVar);
                    j18 = j17;
                }
                it6 = it;
                z17 = true;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ee5.k2 k2Var = new ee5.k2(m2Var, arrayList, null);
            this.f333489d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, k2Var, this) == aVar) {
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
