package aq5;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final aq5.p0 f94806a = new aq5.p0();

    /* renamed from: b, reason: collision with root package name */
    public static aq5.f f94807b;

    /* renamed from: c, reason: collision with root package name */
    public static final aq5.o f94808c;

    /* renamed from: d, reason: collision with root package name */
    public static final aq5.y f94809d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f94810e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq5.b0 f94811f;

    static {
        aq5.d0 d0Var = new aq5.d0();
        f94808c = new aq5.o("MicroMsg.WeDrop.F2FService", aq5.e0.f94763d, new aq5.f0(null), d0Var, aq5.g0.f94772d, aq5.h0.f94773d, aq5.i0.f94774d);
        f94809d = new aq5.y("MicroMsg.WeDrop.F2FService", aq5.j0.f94777d, new aq5.k0(null), d0Var, aq5.l0.f94787d, aq5.m0.f94789d, aq5.n0.f94794d);
        f94811f = new aq5.b0();
    }

    public static final void a(aq5.p0 p0Var, java.lang.String str, int i17, java.lang.Throwable th6) {
        p0Var.getClass();
        java.lang.String str2 = "failAndDisconnect " + str;
        if (th6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeDrop.F2FService", th6, str2, new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.F2FService", str2);
        }
        p0Var.e(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(bw5.wd0 r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.p0.b(bw5.wd0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof aq5.c0
            if (r0 == 0) goto L13
            r0 = r6
            aq5.c0 r0 = (aq5.c0) r0
            int r1 = r0.f94760m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94760m = r1
            goto L18
        L13:
            aq5.c0 r0 = new aq5.c0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f94758h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94760m
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f94757g
            bw5.ge0 r1 = (bw5.ge0) r1
            java.lang.Object r2 = r0.f94756f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f94755e
            bw5.ge0 r4 = (bw5.ge0) r4
            java.lang.Object r0 = r0.f94754d
            bw5.ge0 r0 = (bw5.ge0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L71
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            bw5.ge0 r6 = new bw5.ge0
            r6.<init>()
            gm0.m r2 = gm0.j1.b()
            java.lang.String r2 = r2.k()
            java.lang.Class<kv.b0> r4 = kv.b0.class
            i95.m r4 = i95.n0.c(r4)
            kv.b0 r4 = (kv.b0) r4
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            r0.f94754d = r6
            r0.f94755e = r6
            r0.f94756f = r2
            r0.f94757g = r6
            r0.f94760m = r3
            hn1.s r4 = (hn1.s) r4
            java.lang.Object r0 = r4.oj(r2, r0)
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r1 = r6
            r4 = r1
            r6 = r0
            r0 = r4
        L71:
            java.lang.String r6 = (java.lang.String) r6
            r1.f109357d = r6
            boolean[] r6 = r1.f109359f
            r6[r3] = r3
            java.lang.Class<tg3.v0> r6 = tg3.v0.class
            i95.m r6 = i95.n0.c(r6)
            tg3.v0 r6 = (tg3.v0) r6
            sg3.a r6 = (sg3.a) r6
            r6.getClass()
            java.lang.String r6 = c01.a2.b(r2)
            r4.f109358e = r6
            r6 = 2
            boolean[] r1 = r4.f109359f
            r1[r6] = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.p0.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(bw5.ge0 userInfo, java.lang.String str) {
        aq5.q0 q0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInfo, "userInfo");
        aq5.f fVar = f94807b;
        java.lang.String str2 = fVar != null ? fVar.f94764a : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.F2FService", "onConnectStart() called with: userInfo = " + aq5.h.b(userInfo) + " migrateID:" + str + " curId:" + str2);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            aq5.f fVar2 = f94807b;
            if ((fVar2 != null ? fVar2.f94766c : null) == aq5.a.f94750f) {
                cq5.i.a(cq5.i.f303076a, 0L, 1, null);
                aq5.f fVar3 = f94807b;
                if (fVar3 != null) {
                    fVar3.f94766c = aq5.a.f94749e;
                }
                aq5.f fVar4 = f94807b;
                if (fVar4 == null || (q0Var = fVar4.f94767d) == null) {
                    return;
                }
                q0Var.c(userInfo);
            }
        }
    }

    public final void e(int i17) {
        aq5.q0 q0Var;
        aq5.f fVar = f94807b;
        aq5.a aVar = fVar != null ? fVar.f94766c : null;
        if (fVar != null) {
            fVar.f94766c = aq5.a.f94750f;
        }
        aq5.y yVar = f94809d;
        yVar.f94879j = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = yVar.f94880k;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        yVar.f94880k = null;
        if (aVar == aq5.a.f94749e) {
            cq5.i iVar = cq5.i.f303076a;
            jq5.l lVar = jq5.n.f382815a;
            iVar.e(!lVar.c() ? cq5.b.f303036f : !lVar.e() ? cq5.b.f303037g : cq5.b.f303038h, 0);
        }
        aq5.f fVar2 = f94807b;
        if (fVar2 == null || (q0Var = fVar2.f94767d) == null) {
            return;
        }
        q0Var.g(i17);
    }

    public void f(aq5.r0 r0Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.F2FService", "unInit() called begin");
        aq5.y yVar = f94809d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "stop() called, stopping sender handler");
        yVar.f94884o = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = yVar.f94880k;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        yVar.f94880k = null;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar = yVar.f94879j;
        if (mVar != null) {
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.o oVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar;
            int b17 = yVar.f94878i - oVar.b();
            if (b17 > 0) {
                for (int i17 = 0; i17 < b17; i17++) {
                    oVar.c();
                }
            }
        }
        yVar.f94879j = null;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new aq5.o0(r0Var, z17, null), 2, null);
        }
    }
}
