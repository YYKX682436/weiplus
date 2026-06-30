package c13;

/* loaded from: classes11.dex */
public final class b0 implements y03.e {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e f119394e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f119395f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f119396g;

    /* renamed from: h, reason: collision with root package name */
    public static pi0.w f119397h;

    /* renamed from: d, reason: collision with root package name */
    public static final c13.b0 f119393d = new c13.b0();

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f119398i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_voip_destroy_engine_if_idle, true);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f119399m = new java.util.LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public static final c13.e f119400n = new c13.e(android.os.Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.k0 f119401o = c13.z.f119468d;

    /* renamed from: p, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.k0 f119402p = c13.t.f119454d;

    /* renamed from: q, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.k0 f119403q = c13.a0.f119391d;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f119404r = new java.util.HashMap(4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(c13.b0 r11, java.lang.String r12, boolean r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.b0.b(c13.b0, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y03.e
    public hq4.a I4(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return new w03.c((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a) activity);
    }

    @Override // y03.e
    public void W9(java.lang.String engineId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineId, "engineId");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        b13.m mVar = new b13.m(engineId);
        Bi.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "setMgr");
        Bi.f258094d = true;
        Bi.f258092b = mVar;
        if (f119399m.remove(engineId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "remove timeout task for ".concat(engineId));
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "dispose()");
        rq4.q qVar = rq4.q.f480600a;
        rq4.q.f480622w.mo522xb5bdeb7a(f119401o);
        gq4.v.wi().f447501b.mo522xb5bdeb7a(f119402p);
        gq4.v.wi().f447506g.mo522xb5bdeb7a(f119403q);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new c13.d(null), 3, null);
        f119394e = null;
        f119396g = null;
        f119395f = null;
    }

    @Override // y03.e
    public void d8(android.content.Context context, java.lang.String talkerUsername, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUsername, "talkerUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("geLaunchIntentAsync, stack: ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", sb6.toString());
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new c13.f(talkerUsername, callback, z17, context, null), 3, null);
    }

    public final void f(z03.b reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89483xaa8b332c(reason.ordinal(), new c13.c("callback onCompleted(" + reason + ')'));
        }
    }

    public final void h(z03.g type, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0 c24113x63a224a0 = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24113x63a224a0(type.ordinal(), str == null ? "" : str);
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89487xaf8c47fb(c24113x63a224a0, new c13.c("callback onEvent(" + type + ", " + str + ')'));
        }
    }

    public final void i(int i17, int i18) {
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e2;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e3;
        z03.d a17 = z03.d.f550744d.a(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "onNewState: action=0x" + java.lang.Integer.toHexString(i17) + ", newState=0x" + java.lang.Integer.toHexString(i18) + ", status:" + a17);
        switch (i17) {
            case 4097:
                if (a17 == z03.d.f550747g && (c24132x9b57f23e = f119394e) != null) {
                    c24132x9b57f23e.m89493x910f01b6(new c13.c("callback onRespond"));
                    break;
                }
                break;
            case 4098:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550737e);
                    break;
                }
                break;
            case 4099:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550738f);
                    break;
                }
                break;
            case 4100:
                if (a17 == z03.d.f550748h && (c24132x9b57f23e2 = f119394e) != null) {
                    c24132x9b57f23e2.m89481x2528c2a6(new c13.c("callback onAccepted"));
                    break;
                }
                break;
            case 4101:
                com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e4 = f119394e;
                if (c24132x9b57f23e4 != null) {
                    c24132x9b57f23e4.m89492xe39cbc32(false, new c13.m(false));
                    break;
                }
                break;
            case 4103:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550739g);
                    break;
                }
                break;
            case 4104:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550740h);
                    break;
                }
                break;
            case 4105:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550736d);
                    break;
                }
                break;
            case 4107:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550742m);
                    break;
                }
                break;
            case 4108:
                if (a17 == z03.d.f550750m) {
                    f(z03.b.f550741i);
                    break;
                }
                break;
            case 4111:
                com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e5 = f119394e;
                if (c24132x9b57f23e5 != null) {
                    c24132x9b57f23e5.m89492xe39cbc32(false, new c13.m(false));
                }
                if (a17 == z03.d.f550748h && (c24132x9b57f23e3 = f119394e) != null) {
                    c24132x9b57f23e3.m89481x2528c2a6(new c13.c("callback onAccepted"));
                    break;
                }
                break;
        }
        if (i18 == 8) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            c13.n nVar = c13.n.f119422d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(nVar, 2000L, false);
        }
    }

    public final void k(b13.a surfaceHolder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceHolder, "surfaceHolder");
        int i27 = surfaceHolder.f98622d;
        if (i27 == i17 && surfaceHolder.f98623e == i18 && surfaceHolder.f98624f == i19) {
            return;
        }
        int i28 = surfaceHolder.f98623e;
        int i29 = surfaceHolder.f98624f;
        surfaceHolder.f98622d = i17;
        surfaceHolder.f98623e = i18;
        surfaceHolder.f98624f = i19;
        surfaceHolder.f98621c.f307255d.setDefaultBufferSize(i17, i18);
        ((ku5.t0) ku5.t0.f394148d).B(new c13.s(surfaceHolder, i17, i18, i19, i27, i28, i29));
    }

    public final void l(y03.f surfaceHolder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceHolder, "surfaceHolder");
        int i27 = surfaceHolder.f540174d;
        if (i27 == i17 && surfaceHolder.f540175e == i18 && surfaceHolder.f540176f == i19) {
            return;
        }
        int i28 = surfaceHolder.f540175e;
        int i29 = surfaceHolder.f540176f;
        surfaceHolder.f540174d = i17;
        surfaceHolder.f540175e = i18;
        surfaceHolder.f540176f = i19;
        surfaceHolder.f540173c.f540177d.setDefaultBufferSize(i17, i18);
        ((ku5.t0) ku5.t0.f394148d).B(new c13.q(surfaceHolder, i17, i18, i19, i27, i28, i29));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.String r0 = ""
            if (r11 == 0) goto L1e
            java.lang.String r1 = r11.f522824h
            if (r1 != 0) goto L1c
            goto L1e
        L1c:
            r4 = r1
            goto L1f
        L1e:
            r4 = r0
        L1f:
            if (r11 == 0) goto L28
            java.lang.String r1 = r11.f522826j
            if (r1 != 0) goto L26
            goto L28
        L26:
            r5 = r1
            goto L29
        L28:
            r5 = r0
        L29:
            if (r11 == 0) goto L32
            java.lang.String r1 = r11.f522827k
            if (r1 != 0) goto L30
            goto L32
        L30:
            r3 = r1
            goto L33
        L32:
            r3 = r0
        L33:
            if (r11 == 0) goto L44
            t45.n0 r1 = r11.f522822f
            if (r1 == 0) goto L44
            t45.f0 r1 = r1.f497149e
            if (r1 == 0) goto L44
            int r1 = r1.f497091n
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
            long r1 = r11.f522831o
            goto L67
        L65:
            r1 = 0
        L67:
            r7 = r1
            if (r11 == 0) goto L71
            java.lang.String r11 = r11.f522832p
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
            com.tencent.pigeon.flutter_voip.VoIPFlutterApi r0 = c13.b0.f119394e
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
            r0.m89499xc80c8251(r11, r1)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.b0.m(vx3.i):void");
    }

    @Override // y03.e
    public java.lang.String pd(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (intent.hasExtra("cached_engine_id")) {
            return intent.getStringExtra("cached_engine_id");
        }
        return null;
    }
}
