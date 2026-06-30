package a03;

@j95.b
/* loaded from: classes11.dex */
public final class h0 extends jm0.o implements n40.o, s03.f {

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f81958m;

    /* renamed from: n, reason: collision with root package name */
    public pi0.l1 f81959n;

    /* renamed from: o, reason: collision with root package name */
    public pi0.l1 f81960o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f81961p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f81962q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f81963r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f81964s;

    /* renamed from: t, reason: collision with root package name */
    public long f81965t;

    /* renamed from: u, reason: collision with root package name */
    public long f81966u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.C15543x877cc899 f81967v;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.flutter.MegaVideoUniversalService$feedUpdateListener$1] */
    public h0() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f81958m = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f81961p = "MegaVideo";
        this.f81963r = jz5.h.b(new a03.s(this));
        this.f81964s = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
        this.f81965t = -1L;
        this.f81966u = -1L;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f81967v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0>(a0Var) { // from class: com.tencent.mm.plugin.flutter.MegaVideoUniversalService$feedUpdateListener$1
            {
                this.f39173x3fe91575 = 1121981664;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 event = c5795x6c1c62d0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new a03.z(event, a03.h0.this));
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #1 {all -> 0x0087, blocks: (B:25:0x0066, B:27:0x006e), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v11, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r7v15, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Zi(a03.h0 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof a03.t
            if (r0 == 0) goto L16
            r0 = r8
            a03.t r0 = (a03.t) r0
            int r1 = r0.f81989h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f81989h = r1
            goto L1b
        L16:
            a03.t r0 = new a03.t
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f81987f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f81989h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f81985d
            kotlinx.coroutines.sync.d r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r8 = move-exception
            goto L8b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f81986e
            kotlinx.coroutines.sync.d r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r7
            java.lang.Object r2 = r0.f81985d
            a03.h0 r2 = (a03.h0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            r7 = r2
            goto L66
        L4a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.String r8 = "MicroMsg.MegaVideoUniversalService"
            java.lang.String r2 = "start to destroyEngine"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r2)
            kotlinx.coroutines.sync.d r8 = r7.f81964s
            r0.f81985d = r7
            r0.f81986e = r8
            r0.f81989h = r4
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            java.lang.Object r2 = r8.b(r5, r0)
            if (r2 != r1) goto L66
            goto L86
        L66:
            pi0.l1 r2 = r7.f81959n     // Catch: java.lang.Throwable -> L87
            r7.f81959n = r5     // Catch: java.lang.Throwable -> L87
            r7.f81962q = r5     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L7f
            java.lang.String r7 = r7.f81961p     // Catch: java.lang.Throwable -> L87
            r0.f81985d = r8     // Catch: java.lang.Throwable -> L87
            r0.f81986e = r5     // Catch: java.lang.Throwable -> L87
            r0.f81989h = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r2.h(r7, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L7d
            goto L86
        L7d:
            r7 = r8
        L7e:
            r8 = r7
        L7f:
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            r8.d(r5)
            jz5.f0 r1 = jz5.f0.f384359a
        L86:
            return r1
        L87:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L8b:
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            r7.d(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.Zi(a03.h0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object aj(a03.h0 r28, p40.a r29, p012xc85e97e9.p093xedfae76a.o r30, java.lang.String r31, yz5.a r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.aj(a03.h0, p40.a, androidx.lifecycle.o, java.lang.String, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object cj(a03.h0 h0Var, java.lang.String str, java.lang.String str2, java.util.Map map, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            map = new java.util.LinkedHashMap();
        }
        java.util.Map map2 = map;
        if ((i17 & 8) != 0) {
            pVar = null;
        }
        return h0Var.bj(str, str2, map2, pVar, interfaceC29045xdcb5ca57);
    }

    @Override // s03.f
    public void L(java.lang.String str, long j17, long j18, long j19) {
        fc2.q f76;
        if (this.f81966u == j18 || str == null) {
            return;
        }
        this.f81966u = j18;
        long j27 = this.f81965t;
        if (j27 == -1 || j18 - j27 > 1000 || j18 < j27) {
            cu2.x xVar = cu2.x.f303982a;
            xVar.m(str, j18, j19);
            long j28 = cu2.x.c(xVar, str, false, false, false, 14, null).f68975xf9a02e3e;
            android.content.Context fj6 = fj();
            if (fj6 != null) {
                ec2.f fVar = new ec2.f(3);
                fVar.f332498j = j28;
                long j29 = 1000;
                fVar.f332496h = (int) (j18 / j29);
                fVar.f332497i = (int) (j19 / j29);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = fj6 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) fj6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                if (nyVar != null && (f76 = nyVar.f7()) != null) {
                    f76.a(fVar);
                }
            }
            this.f81965t = j18;
        }
    }

    @Override // jm0.o
    public void Ui(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mo48813x58998cd();
    }

    @Override // jm0.o
    public void Vi() {
        mo48814x2efc64();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bj(java.lang.String r17, java.lang.String r18, java.util.Map r19, yz5.p r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.bj(java.lang.String, java.lang.String, java.util.Map, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public android.content.Context fj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4 c15549xc1495cd4;
        pi0.l1 l1Var = this.f81960o;
        if (l1Var == null) {
            l1Var = this.f81959n;
        }
        if (l1Var == null || (c15549xc1495cd4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4) l1Var.j(com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4.class)) == null) {
            return null;
        }
        android.app.Activity activity = c15549xc1495cd4.f218830e;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = c15549xc1495cd4.f218829d;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        return context2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:26:0x0075, B:28:0x0079, B:32:0x0093), top: B:25:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r13v19, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hj(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r13, java.lang.String r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.hj(androidx.appcompat.app.AppCompatActivity, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void ij(android.content.Context context, java.util.Map params, boolean z17, android.os.Bundle extras, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        if (str == null) {
            java.lang.String str3 = this.f81962q;
            if (str3 == null) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str3 = b52.b.b();
            }
            str2 = str3;
        } else {
            str2 = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoUniversalService", "jumpPlayerDetailUI isForceLandscape:" + z17 + ", finderContextId:" + str2);
        extras.putBoolean("is_force_land_scape", z17);
        extras.putString("key_context_id", str2);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428857u);
        ((wn2.f) i95.n0.c(wn2.f.class)).Ai(context, null);
        int i17 = qg3.x.f444417d;
        p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169894x21b859db();
        boolean z18 = extras.getBoolean("showEnterAnimation");
        p3325xe03a0797.p3326xc267989b.l.d(this.f81958m, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new a03.b0(this, str2, params, c19792x256d2725, context, z18 ? com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15556x3d66971f.class : com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102.class, extras, z18, null), 1, null);
    }
}
