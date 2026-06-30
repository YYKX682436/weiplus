package ee5;

/* loaded from: classes9.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333498d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.n0 f333500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333501g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ee5.n0 n0Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333500f = n0Var;
        this.f333501g = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.m0 m0Var = new ee5.m0(this.f333500f, this.f333501g, interfaceC29045xdcb5ca57);
        m0Var.f333499e = obj;
        return m0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        ot0.q v17;
        long j17;
        java.lang.String s17;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333498d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333499e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMultiItemAppBrandUIC", "searchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.n0 n0Var = this.f333500f;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n0Var.f333589o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(n0Var.f333589o) : null;
            java.util.Iterator it6 = this.f333501g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next();
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMultiItemAppBrandUIC", "is no active");
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
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n0Var.f333589o);
                    java.lang.String str3 = "";
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
                            str3 = z07.z0(s17);
                        }
                    }
                    ae5.a aVar2 = new ae5.a(f9Var.mo78012x3fdd41df(), v17.f430199i, v17.f430187f, f9Var.m124847x74d37ac6(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str3, f9Var.Q0());
                    java.lang.String str4 = v17.f430210k2;
                    java.lang.String str5 = v17.f430179d;
                    if (str4 == null) {
                        str4 = str5;
                    }
                    aVar2.f85914j = str4;
                    aVar2.f85915k = v17;
                    aVar2.f85916l = f9Var.I0();
                    aVar2.f85917m = v17.f430187f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
                    ot0.q qVar = aVar2.f85915k;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
                    k91.v5 Bi = ((k91.g4) f6Var).Bi(qVar.f430206j2);
                    if (Bi != null) {
                        str = Bi.f68913x21f9b213;
                    } else {
                        ot0.q qVar2 = aVar2.f85915k;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
                        str = qVar2.f430259x;
                    }
                    aVar2.f85932c = str;
                    if (Bi != null) {
                        str2 = Bi.f68910xea1bd3d4;
                    } else {
                        ot0.q qVar3 = aVar2.f85915k;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
                        str2 = qVar3.B2;
                    }
                    aVar2.f85918n = str2;
                    if (v17.f430214l2 != 1) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D2)) {
                            aVar2.f85919o = "file://" + D2;
                        }
                    }
                    arrayList.add(aVar2);
                    j18 = j17;
                }
                it6 = it;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ee5.l0 l0Var = new ee5.l0(n0Var, arrayList, null);
            this.f333498d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, l0Var, this) == aVar) {
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
