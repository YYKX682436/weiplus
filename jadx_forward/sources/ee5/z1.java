package ee5;

/* loaded from: classes9.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333644d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.a2 f333646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ee5.a2 a2Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333646f = a2Var;
        this.f333647g = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.z1 z1Var = new ee5.z1(this.f333646f, this.f333647g, interfaceC29045xdcb5ca57);
        z1Var.f333645e = obj;
        return z1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        long j17;
        java.lang.String s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333644d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333645e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "Shop&Product SearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.a2 a2Var = this.f333646f;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(a2Var.f333589o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(a2Var.f333589o) : null;
            java.util.Iterator it6 = this.f333647g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next();
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j19 = f9Var.j();
                if (j19 != null) {
                    m15.a aVar2 = new m15.a();
                    aVar2.m126728xdc93280d(j19);
                    it = it6;
                    long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(f9Var.mo78012x3fdd41df()));
                    if (j18 != a17) {
                        j17 = a17;
                        arrayList.add(new ae5.b(f9Var.mo78012x3fdd41df()));
                    } else {
                        j17 = a17;
                    }
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(a2Var.f333589o);
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
                    java.lang.String m146659xc0914d16 = aVar2.m146659xc0914d16();
                    if (m146659xc0914d16 == null || r26.n0.N(m146659xc0914d16)) {
                        m146659xc0914d16 = aVar2.m146661x6c03c64c();
                    }
                    java.lang.String q17 = aVar2.q();
                    if (q17 == null || r26.n0.N(q17)) {
                        q17 = aVar2.m146660x8010e5e4();
                    }
                    ae5.k kVar = new ae5.k(f9Var.mo78012x3fdd41df(), 42, q17, f9Var.m124847x74d37ac6(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                    int o17 = aVar2.o();
                    java.util.Set set = c01.e2.f118650a;
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(o17)) {
                        if (aVar2.n() == 1) {
                            kVar.f85957k = com.p314xaae8f345.mm.R.C30867xcad56011.n7g;
                        } else {
                            kVar.f85957k = com.p314xaae8f345.mm.R.C30867xcad56011.f572384b14;
                        }
                        kVar.f85956j = true;
                    } else {
                        kVar.f85957k = com.p314xaae8f345.mm.R.C30867xcad56011.b4y;
                        kVar.f85956j = false;
                    }
                    kVar.f85958l = m146659xc0914d16;
                    arrayList.add(kVar);
                    j18 = j17;
                } else {
                    it = it6;
                }
                it6 = it;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ee5.y1 y1Var = new ee5.y1(a2Var, arrayList, null);
            this.f333644d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, y1Var, this) == aVar) {
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
