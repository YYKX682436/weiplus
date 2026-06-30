package aq5;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final aq5.p0 f13273a = new aq5.p0();

    /* renamed from: b, reason: collision with root package name */
    public static aq5.f f13274b;

    /* renamed from: c, reason: collision with root package name */
    public static final aq5.o f13275c;

    /* renamed from: d, reason: collision with root package name */
    public static final aq5.y f13276d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f13277e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq5.b0 f13278f;

    static {
        aq5.d0 d0Var = new aq5.d0();
        f13275c = new aq5.o("MicroMsg.WeDrop.F2FService", aq5.e0.f13230d, new aq5.f0(null), d0Var, aq5.g0.f13239d, aq5.h0.f13240d, aq5.i0.f13241d);
        f13276d = new aq5.y("MicroMsg.WeDrop.F2FService", aq5.j0.f13244d, new aq5.k0(null), d0Var, aq5.l0.f13254d, aq5.m0.f13256d, aq5.n0.f13261d);
        f13278f = new aq5.b0();
    }

    public static final void a(aq5.p0 p0Var, java.lang.String str, int i17, java.lang.Throwable th6) {
        p0Var.getClass();
        java.lang.String str2 = "failAndDisconnect " + str;
        if (th6 != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeDrop.F2FService", th6, str2, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.F2FService", str2);
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
    public java.lang.Object b(bw5.wd0 r14, kotlin.coroutines.Continuation r15) {
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
    public final java.lang.Object c(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof aq5.c0
            if (r0 == 0) goto L13
            r0 = r6
            aq5.c0 r0 = (aq5.c0) r0
            int r1 = r0.f13227m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13227m = r1
            goto L18
        L13:
            aq5.c0 r0 = new aq5.c0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13225h
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f13227m
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f13224g
            bw5.ge0 r1 = (bw5.ge0) r1
            java.lang.Object r2 = r0.f13223f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f13222e
            bw5.ge0 r4 = (bw5.ge0) r4
            java.lang.Object r0 = r0.f13221d
            bw5.ge0 r0 = (bw5.ge0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L71
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            kotlin.ResultKt.throwOnFailure(r6)
            bw5.ge0 r6 = new bw5.ge0
            r6.<init>()
            gm0.m r2 = gm0.j1.b()
            java.lang.String r2 = r2.k()
            java.lang.Class<kv.b0> r4 = kv.b0.class
            i95.m r4 = i95.n0.c(r4)
            kv.b0 r4 = (kv.b0) r4
            kotlin.jvm.internal.o.d(r2)
            r0.f13221d = r6
            r0.f13222e = r6
            r0.f13223f = r2
            r0.f13224g = r6
            r0.f13227m = r3
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
            r1.f27824d = r6
            boolean[] r6 = r1.f27826f
            r6[r3] = r3
            java.lang.Class<tg3.v0> r6 = tg3.v0.class
            i95.m r6 = i95.n0.c(r6)
            tg3.v0 r6 = (tg3.v0) r6
            sg3.a r6 = (sg3.a) r6
            r6.getClass()
            java.lang.String r6 = c01.a2.b(r2)
            r4.f27825e = r6
            r6 = 2
            boolean[] r1 = r4.f27826f
            r1[r6] = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.p0.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(bw5.ge0 userInfo, java.lang.String str) {
        aq5.q0 q0Var;
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        aq5.f fVar = f13274b;
        java.lang.String str2 = fVar != null ? fVar.f13231a : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.F2FService", "onConnectStart() called with: userInfo = " + aq5.h.b(userInfo) + " migrateID:" + str + " curId:" + str2);
        if (kotlin.jvm.internal.o.b(str2, str)) {
            aq5.f fVar2 = f13274b;
            if ((fVar2 != null ? fVar2.f13233c : null) == aq5.a.f13217f) {
                cq5.i.a(cq5.i.f221543a, 0L, 1, null);
                aq5.f fVar3 = f13274b;
                if (fVar3 != null) {
                    fVar3.f13233c = aq5.a.f13216e;
                }
                aq5.f fVar4 = f13274b;
                if (fVar4 == null || (q0Var = fVar4.f13234d) == null) {
                    return;
                }
                q0Var.c(userInfo);
            }
        }
    }

    public final void e(int i17) {
        aq5.q0 q0Var;
        aq5.f fVar = f13274b;
        aq5.a aVar = fVar != null ? fVar.f13233c : null;
        if (fVar != null) {
            fVar.f13233c = aq5.a.f13217f;
        }
        aq5.y yVar = f13276d;
        yVar.f13346j = null;
        kotlinx.coroutines.r2 r2Var = yVar.f13347k;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        yVar.f13347k = null;
        if (aVar == aq5.a.f13216e) {
            cq5.i iVar = cq5.i.f221543a;
            jq5.l lVar = jq5.n.f301282a;
            iVar.e(!lVar.c() ? cq5.b.f221503f : !lVar.e() ? cq5.b.f221504g : cq5.b.f221505h, 0);
        }
        aq5.f fVar2 = f13274b;
        if (fVar2 == null || (q0Var = fVar2.f13234d) == null) {
            return;
        }
        q0Var.g(i17);
    }

    public void f(aq5.r0 r0Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.F2FService", "unInit() called begin");
        aq5.y yVar = f13276d;
        com.tencent.mars.xlog.Log.i(yVar.f13337a, "stop() called, stopping sender handler");
        yVar.f13351o = true;
        kotlinx.coroutines.r2 r2Var = yVar.f13347k;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        yVar.f13347k = null;
        kotlinx.coroutines.sync.m mVar = yVar.f13346j;
        if (mVar != null) {
            kotlinx.coroutines.sync.o oVar = (kotlinx.coroutines.sync.o) mVar;
            int b17 = yVar.f13345i - oVar.b();
            if (b17 > 0) {
                for (int i17 = 0; i17 < b17; i17++) {
                    oVar.c();
                }
            }
        }
        yVar.f13346j = null;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new aq5.o0(r0Var, z17, null), 2, null);
        }
    }
}
