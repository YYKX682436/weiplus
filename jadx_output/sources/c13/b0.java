package c13;

/* loaded from: classes11.dex */
public final class b0 implements y03.e {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.pigeon.flutter_voip.VoIPFlutterApi f37861e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f37862f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f37863g;

    /* renamed from: h, reason: collision with root package name */
    public static pi0.w f37864h;

    /* renamed from: d, reason: collision with root package name */
    public static final c13.b0 f37860d = new c13.b0();

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f37865i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_voip_destroy_engine_if_idle, true);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f37866m = new java.util.LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public static final c13.e f37867n = new c13.e(android.os.Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public static final androidx.lifecycle.k0 f37868o = c13.z.f37935d;

    /* renamed from: p, reason: collision with root package name */
    public static final androidx.lifecycle.k0 f37869p = c13.t.f37921d;

    /* renamed from: q, reason: collision with root package name */
    public static final androidx.lifecycle.k0 f37870q = c13.a0.f37858d;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f37871r = new java.util.HashMap(4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(c13.b0 r11, java.lang.String r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.b0.b(c13.b0, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y03.e
    public hq4.a I4(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return new w03.c((com.tencent.mm.plugin.voip.ui.VideoActivity) activity);
    }

    @Override // y03.e
    public void W9(java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        b13.m mVar = new b13.m(engineId);
        Bi.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "setMgr");
        Bi.f176561d = true;
        Bi.f176559b = mVar;
        if (f37866m.remove(engineId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "remove timeout task for ".concat(engineId));
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "dispose()");
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399089w.removeObserver(f37868o);
        gq4.v.wi().f365968b.removeObserver(f37869p);
        gq4.v.wi().f365973g.removeObserver(f37870q);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new c13.d(null), 3, null);
        f37861e = null;
        f37863g = null;
        f37862f = null;
    }

    @Override // y03.e
    public void d8(android.content.Context context, java.lang.String talkerUsername, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerUsername, "talkerUsername");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("geLaunchIntentAsync, stack: ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", sb6.toString());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new c13.f(talkerUsername, callback, z17, context, null), 3, null);
    }

    public final void f(z03.b reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onCompleted(reason.ordinal(), new c13.c("callback onCompleted(" + reason + ')'));
        }
    }

    public final void h(z03.g type, java.lang.String str) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.pigeon.flutter_voip.EventParams eventParams = new com.tencent.pigeon.flutter_voip.EventParams(type.ordinal(), str == null ? "" : str);
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onEvent(eventParams, new c13.c("callback onEvent(" + type + ", " + str + ')'));
        }
    }

    public final void i(int i17, int i18) {
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi;
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi2;
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi3;
        z03.d a17 = z03.d.f469211d.a(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "onNewState: action=0x" + java.lang.Integer.toHexString(i17) + ", newState=0x" + java.lang.Integer.toHexString(i18) + ", status:" + a17);
        switch (i17) {
            case 4097:
                if (a17 == z03.d.f469214g && (voIPFlutterApi = f37861e) != null) {
                    voIPFlutterApi.onRespond(new c13.c("callback onRespond"));
                    break;
                }
                break;
            case 4098:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469204e);
                    break;
                }
                break;
            case 4099:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469205f);
                    break;
                }
                break;
            case 4100:
                if (a17 == z03.d.f469215h && (voIPFlutterApi2 = f37861e) != null) {
                    voIPFlutterApi2.onAccepted(new c13.c("callback onAccepted"));
                    break;
                }
                break;
            case 4101:
                com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi4 = f37861e;
                if (voIPFlutterApi4 != null) {
                    voIPFlutterApi4.onModeChanged(false, new c13.m(false));
                    break;
                }
                break;
            case 4103:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469206g);
                    break;
                }
                break;
            case 4104:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469207h);
                    break;
                }
                break;
            case 4105:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469203d);
                    break;
                }
                break;
            case 4107:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469209m);
                    break;
                }
                break;
            case 4108:
                if (a17 == z03.d.f469217m) {
                    f(z03.b.f469208i);
                    break;
                }
                break;
            case 4111:
                com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi5 = f37861e;
                if (voIPFlutterApi5 != null) {
                    voIPFlutterApi5.onModeChanged(false, new c13.m(false));
                }
                if (a17 == z03.d.f469215h && (voIPFlutterApi3 = f37861e) != null) {
                    voIPFlutterApi3.onAccepted(new c13.c("callback onAccepted"));
                    break;
                }
                break;
        }
        if (i18 == 8) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            c13.n nVar = c13.n.f37889d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(nVar, 2000L, false);
        }
    }

    public final void k(b13.a surfaceHolder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(surfaceHolder, "surfaceHolder");
        int i27 = surfaceHolder.f17089d;
        if (i27 == i17 && surfaceHolder.f17090e == i18 && surfaceHolder.f17091f == i19) {
            return;
        }
        int i28 = surfaceHolder.f17090e;
        int i29 = surfaceHolder.f17091f;
        surfaceHolder.f17089d = i17;
        surfaceHolder.f17090e = i18;
        surfaceHolder.f17091f = i19;
        surfaceHolder.f17088c.f225722d.setDefaultBufferSize(i17, i18);
        ((ku5.t0) ku5.t0.f312615d).B(new c13.s(surfaceHolder, i17, i18, i19, i27, i28, i29));
    }

    public final void l(y03.f surfaceHolder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(surfaceHolder, "surfaceHolder");
        int i27 = surfaceHolder.f458641d;
        if (i27 == i17 && surfaceHolder.f458642e == i18 && surfaceHolder.f458643f == i19) {
            return;
        }
        int i28 = surfaceHolder.f458642e;
        int i29 = surfaceHolder.f458643f;
        surfaceHolder.f458641d = i17;
        surfaceHolder.f458642e = i18;
        surfaceHolder.f458643f = i19;
        surfaceHolder.f458640c.f458644d.setDefaultBufferSize(i17, i18);
        ((ku5.t0) ku5.t0.f312615d).B(new c13.q(surfaceHolder, i17, i18, i19, i27, i28, i29));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(vx3.i r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "responseRingtoneInfo: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FlutterVoipService"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.String r0 = ""
            if (r11 == 0) goto L1e
            java.lang.String r1 = r11.f441291h
            if (r1 != 0) goto L1c
            goto L1e
        L1c:
            r4 = r1
            goto L1f
        L1e:
            r4 = r0
        L1f:
            if (r11 == 0) goto L28
            java.lang.String r1 = r11.f441293j
            if (r1 != 0) goto L26
            goto L28
        L26:
            r5 = r1
            goto L29
        L28:
            r5 = r0
        L29:
            if (r11 == 0) goto L32
            java.lang.String r1 = r11.f441294k
            if (r1 != 0) goto L30
            goto L32
        L30:
            r3 = r1
            goto L33
        L32:
            r3 = r0
        L33:
            if (r11 == 0) goto L44
            t45.n0 r1 = r11.f441289f
            if (r1 == 0) goto L44
            t45.f0 r1 = r1.f415616e
            if (r1 == 0) goto L44
            int r1 = r1.f415558n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L45
        L44:
            r1 = 0
        L45:
            if (r1 != 0) goto L48
            goto L52
        L48:
            int r2 = r1.intValue()
            if (r2 != 0) goto L52
            java.lang.String r1 = "qq_music"
        L50:
            r6 = r1
            goto L60
        L52:
            if (r1 != 0) goto L55
            goto L5f
        L55:
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != r2) goto L5f
            java.lang.String r1 = "qq_music_vip"
            goto L50
        L5f:
            r6 = r0
        L60:
            if (r11 == 0) goto L65
            long r1 = r11.f441298o
            goto L67
        L65:
            r1 = 0
        L67:
            r7 = r1
            if (r11 == 0) goto L71
            java.lang.String r11 = r11.f441299p
            if (r11 != 0) goto L6f
            goto L71
        L6f:
            r9 = r11
            goto L72
        L71:
            r9 = r0
        L72:
            com.tencent.pigeon.flutter_voip.RingtoneInfo r11 = new com.tencent.pigeon.flutter_voip.RingtoneInfo
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r9)
            com.tencent.pigeon.flutter_voip.VoIPFlutterApi r0 = c13.b0.f37861e
            if (r0 == 0) goto L97
            c13.c r1 = new c13.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "callback responseRingtoneInfo("
            r2.<init>(r3)
            r2.append(r11)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r0.responseRingtoneInfo(r11, r1)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.b0.m(vx3.i):void");
    }

    @Override // y03.e
    public java.lang.String pd(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (intent.hasExtra("cached_engine_id")) {
            return intent.getStringExtra("cached_engine_id");
        }
        return null;
    }
}
