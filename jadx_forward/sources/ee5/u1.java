package ee5;

/* loaded from: classes9.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333597d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.v1 f333599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ee5.v1 v1Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333599f = v1Var;
        this.f333600g = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.u1 u1Var = new ee5.u1(this.f333599f, this.f333600g, interfaceC29045xdcb5ca57);
        u1Var.f333598e = obj;
        return u1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ot0.q v17;
        java.lang.String s17;
        ae5.i iVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333597d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333598e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemPayUIC", "SearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.v1 v1Var = this.f333599f;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v1Var.f333589o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(v1Var.f333589o) : null;
            long j17 = 0;
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : this.f333600g) {
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemPayUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j18 = f9Var.j();
                if (j18 != null && (v17 = ot0.q.v(j18)) != null) {
                    long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(f9Var.mo78012x3fdd41df()));
                    if (j17 != a17) {
                        arrayList.add(new ae5.b(f9Var.mo78012x3fdd41df()));
                    }
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v1Var.f333589o);
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
                    if (v1Var.Z6(f9Var.mo78013xfb85f7b0())) {
                        ae5.i iVar2 = new ae5.i(f9Var.mo78012x3fdd41df(), v17.f430199i, v17.J0, f9Var.m124847x74d37ac6(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b c6255xde73125b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b();
                        c6255xde73125b.f136504g.f89954a = v17.L0;
                        c6255xde73125b.e();
                        int A0 = f9Var.A0();
                        am.z10 z10Var = c6255xde73125b.f136505h;
                        boolean z17 = A0 == 1 ? z10Var.f90039b : !z10Var.f90039b;
                        int i18 = z10Var.f90038a;
                        boolean z18 = i18 == -2 ? false : z17;
                        if (i18 <= 0) {
                            i18 = v17.I0;
                        }
                        int i19 = i18;
                        iVar2.f85935f = v1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjy, iVar2.f85935f);
                        iVar2.f85943l = (i19 == 1 || !(i19 == 3 || i19 == 4 || i19 == 5 || i19 == 6)) ? -352966 : -470621;
                        boolean z19 = z18;
                        iVar2.f85942k = ee5.v1.W6(v1Var, v1Var.m158354x19263085(), f9Var, v17, z19, i19);
                        iVar2.f85941j = ee5.v1.X6(v1Var, v1Var.m158354x19263085(), f9Var, v17, z19, i19);
                        iVar2.f85942k = ee5.v1.W6(v1Var, v1Var.m158354x19263085(), f9Var, v17, z19, i19);
                        iVar2.f85942k = ee5.v1.W6(v1Var, v1Var.m158354x19263085(), f9Var, v17, z19, i19);
                        iVar2.f85941j = ee5.v1.X6(v1Var, v1Var.m158354x19263085(), f9Var, v17, z19, i19);
                        iVar = iVar2;
                    } else {
                        iVar = new ae5.i(f9Var.mo78012x3fdd41df(), v17.f430199i, v17.f430213l1, f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), n17.w0(), str2, f9Var.Q0());
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(v17.f430233q1, 0) == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1001", 0)) {
                            iVar.f85935f = v1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjw, iVar.f85935f);
                            iVar.f85942k = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x1.g(v17, f9Var.A0() == 1);
                            iVar.f85943l = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x1.a(v17, f9Var.A0() == 1);
                            iVar.f85941j = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x1.d(v17, f9Var.A0() == 1);
                        } else {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f();
                            c6254x6dec987f.f136502g.f89786a = v17.f430237r1;
                            c6254x6dec987f.e();
                            iVar.f85935f = v1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjx, iVar.f85935f);
                            am.x10 x10Var = c6254x6dec987f.f136503h;
                            iVar.f85942k = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x1.i(x10Var.f89868a, x10Var.f89869b, x10Var.f89870c, f9Var.A0() == 1, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v1Var.f333589o), v1Var.f333589o, v17, null);
                            ot0.h y17 = v17.y(ot0.c.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y17, "piece(...)");
                            int identifier = v1Var.m158354x19263085().getResources().getIdentifier(((ot0.c) y17).f429942b, "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                            int k17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x1.k(x10Var.f89869b, x10Var.f89870c, f9Var.A0() == 1);
                            iVar.f85941j = k17;
                            if (k17 <= 0) {
                                iVar.f85941j = identifier;
                            }
                        }
                    }
                    arrayList.add(iVar);
                    j17 = a17;
                }
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ee5.t1 t1Var = new ee5.t1(v1Var, arrayList, null);
            this.f333597d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, t1Var, this) == aVar) {
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
