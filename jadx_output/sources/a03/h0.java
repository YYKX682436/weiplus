package a03;

@j95.b
/* loaded from: classes11.dex */
public final class h0 extends jm0.o implements n40.o, s03.f {

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f425m;

    /* renamed from: n, reason: collision with root package name */
    public pi0.l1 f426n;

    /* renamed from: o, reason: collision with root package name */
    public pi0.l1 f427o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f428p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f429q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f430r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f431s;

    /* renamed from: t, reason: collision with root package name */
    public long f432t;

    /* renamed from: u, reason: collision with root package name */
    public long f433u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.flutter.MegaVideoUniversalService$feedUpdateListener$1 f434v;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.flutter.MegaVideoUniversalService$feedUpdateListener$1] */
    public h0() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f425m = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f428p = "MegaVideo";
        this.f430r = jz5.h.b(new a03.s(this));
        this.f431s = kotlinx.coroutines.sync.l.a(false, 1, null);
        this.f432t = -1L;
        this.f433u = -1L;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f434v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent>(a0Var) { // from class: com.tencent.mm.plugin.flutter.MegaVideoUniversalService$feedUpdateListener$1
            {
                this.__eventId = 1121981664;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent) {
                com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent event = onFinderFeedInfoUpdatedEvent;
                kotlin.jvm.internal.o.g(event, "event");
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
    public static final java.lang.Object Zi(a03.h0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof a03.t
            if (r0 == 0) goto L16
            r0 = r8
            a03.t r0 = (a03.t) r0
            int r1 = r0.f456h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f456h = r1
            goto L1b
        L16:
            a03.t r0 = new a03.t
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f454f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f456h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f452d
            kotlinx.coroutines.sync.d r7 = (kotlinx.coroutines.sync.d) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
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
            java.lang.Object r7 = r0.f453e
            kotlinx.coroutines.sync.d r7 = (kotlinx.coroutines.sync.d) r7
            java.lang.Object r2 = r0.f452d
            a03.h0 r2 = (a03.h0) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r2
            goto L66
        L4a:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "MicroMsg.MegaVideoUniversalService"
            java.lang.String r2 = "start to destroyEngine"
            com.tencent.mars.xlog.Log.i(r8, r2)
            kotlinx.coroutines.sync.d r8 = r7.f431s
            r0.f452d = r7
            r0.f453e = r8
            r0.f456h = r4
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            java.lang.Object r2 = r8.b(r5, r0)
            if (r2 != r1) goto L66
            goto L86
        L66:
            pi0.l1 r2 = r7.f426n     // Catch: java.lang.Throwable -> L87
            r7.f426n = r5     // Catch: java.lang.Throwable -> L87
            r7.f429q = r5     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L7f
            java.lang.String r7 = r7.f428p     // Catch: java.lang.Throwable -> L87
            r0.f452d = r8     // Catch: java.lang.Throwable -> L87
            r0.f453e = r5     // Catch: java.lang.Throwable -> L87
            r0.f456h = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r2.h(r7, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L7d
            goto L86
        L7d:
            r7 = r8
        L7e:
            r8 = r7
        L7f:
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            r8.d(r5)
            jz5.f0 r1 = jz5.f0.f302826a
        L86:
            return r1
        L87:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L8b:
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
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
    public static final java.lang.Object aj(a03.h0 r28, p40.a r29, androidx.lifecycle.o r30, java.lang.String r31, yz5.a r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.aj(a03.h0, p40.a, androidx.lifecycle.o, java.lang.String, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object cj(a03.h0 h0Var, java.lang.String str, java.lang.String str2, java.util.Map map, yz5.p pVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            map = new java.util.LinkedHashMap();
        }
        java.util.Map map2 = map;
        if ((i17 & 8) != 0) {
            pVar = null;
        }
        return h0Var.bj(str, str2, map2, pVar, continuation);
    }

    @Override // s03.f
    public void L(java.lang.String str, long j17, long j18, long j19) {
        fc2.q f76;
        if (this.f433u == j18 || str == null) {
            return;
        }
        this.f433u = j18;
        long j27 = this.f432t;
        if (j27 == -1 || j18 - j27 > 1000 || j18 < j27) {
            cu2.x xVar = cu2.x.f222449a;
            xVar.m(str, j18, j19);
            long j28 = cu2.x.c(xVar, str, false, false, false, 14, null).field_feedId;
            android.content.Context fj6 = fj();
            if (fj6 != null) {
                ec2.f fVar = new ec2.f(3);
                fVar.f250965j = j28;
                long j29 = 1000;
                fVar.f250963h = (int) (j18 / j29);
                fVar.f250964i = (int) (j19 / j29);
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = fj6 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) fj6).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar != null && (f76 = nyVar.f7()) != null) {
                    f76.a(fVar);
                }
            }
            this.f432t = j18;
        }
    }

    @Override // jm0.o
    public void Ui(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        alive();
    }

    @Override // jm0.o
    public void Vi() {
        dead();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bj(java.lang.String r17, java.lang.String r18, java.util.Map r19, yz5.p r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.bj(java.lang.String, java.lang.String, java.util.Map, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public android.content.Context fj() {
        com.tencent.mm.plugin.flutter.plugin.LVNativePlugin lVNativePlugin;
        pi0.l1 l1Var = this.f427o;
        if (l1Var == null) {
            l1Var = this.f426n;
        }
        if (l1Var == null || (lVNativePlugin = (com.tencent.mm.plugin.flutter.plugin.LVNativePlugin) l1Var.j(com.tencent.mm.plugin.flutter.plugin.LVNativePlugin.class)) == null) {
            return null;
        }
        android.app.Activity activity = lVNativePlugin.f137297e;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = lVNativePlugin.f137296d;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
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
    public final java.lang.Object hj(androidx.appcompat.app.AppCompatActivity r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.h0.hj(androidx.appcompat.app.AppCompatActivity, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void ij(android.content.Context context, java.util.Map params, boolean z17, android.os.Bundle extras, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(extras, "extras");
        if (str == null) {
            java.lang.String str3 = this.f429q;
            if (str3 == null) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str3 = b52.b.b();
            }
            str2 = str3;
        } else {
            str2 = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoUniversalService", "jumpPlayerDetailUI isForceLandscape:" + z17 + ", finderContextId:" + str2);
        extras.putBoolean("is_force_land_scape", z17);
        extras.putString("key_context_id", str2);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347324u);
        ((wn2.f) i95.n0.c(wn2.f.class)).Ai(context, null);
        int i17 = qg3.x.f362884d;
        urgen.ur_54A4.UR_720C.UR_AD0F();
        boolean z18 = extras.getBoolean("showEnterAnimation");
        kotlinx.coroutines.l.d(this.f425m, null, kotlinx.coroutines.a1.UNDISPATCHED, new a03.b0(this, str2, params, finderObject, context, z18 ? com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterNoAnimationActivity.class : com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity.class, extras, z18, null), 1, null);
    }
}
