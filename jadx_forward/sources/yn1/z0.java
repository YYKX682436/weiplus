package yn1;

/* loaded from: classes11.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f545468c;

    /* renamed from: d, reason: collision with root package name */
    public static int f545469d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f545470e;

    /* renamed from: f, reason: collision with root package name */
    public static bw5.q0 f545471f;

    /* renamed from: g, reason: collision with root package name */
    public static bw5.o0 f545472g;

    /* renamed from: h, reason: collision with root package name */
    public static bw5.p0 f545473h;

    /* renamed from: i, reason: collision with root package name */
    public static bw5.aj0 f545474i;

    /* renamed from: k, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522 f545476k;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f545479n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f545480o;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f545482q;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f545484s;

    /* renamed from: a, reason: collision with root package name */
    public static final yn1.z0 f545466a = new yn1.z0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f545467b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f545475j = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f545477l = "";

    /* renamed from: m, reason: collision with root package name */
    public static bw5.he0 f545478m = bw5.he0.UNKNOW;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f545481p = jz5.h.b(yn1.y0.f545456d);

    /* renamed from: r, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f545483r = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);

    /* renamed from: t, reason: collision with root package name */
    public static final yn1.r0 f545485t = new yn1.r0();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r1 = yn1.z0.f545468c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "!!! Ready to do unInitialize. targetId=" + r1);
        ((ku5.t0) ku5.t0.f394148d).k(new yn1.k0(r1), 15000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            java.lang.String r0 = "!!! Ready to do unInitialize. targetId="
            java.lang.String r1 = "[checkIfNeedUnInitialize] activityCount="
            java.lang.String r2 = "MM.Mig.MigrationGlobalHolder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[checkIfNeedUnInitialize] activityCount="
            r3.<init>(r4)
            int r4 = yn1.z0.f545469d
            r3.append(r4)
            java.lang.String r4 = ", status="
            r3.append(r4)
            bw5.bj0 r4 = r7.i()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            int r2 = yn1.z0.f545469d
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            bw5.bj0 r2 = r7.i()
            bw5.bj0 r5 = bw5.bj0.NOTIFY_CODE_NONE
            if (r2 == r5) goto L3b
            bw5.bj0 r2 = r7.i()
            bw5.bj0 r5 = bw5.bj0.NOTIFY_CODE_UI_READY
            if (r2 != r5) goto L3d
        L3b:
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto Lb6
            monitor-enter(r7)
            com.tencent.mm.autogen.events.AccountExpiredEvent r2 = yn1.z0.f545476k     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L56
            int r5 = yn1.z0.f545469d     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L56
            ku5.u0 r0 = ku5.t0.f394148d     // Catch: java.lang.Throwable -> Lb3
            yn1.j0 r1 = new yn1.j0     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> Lb3
            r0.g(r1)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L56:
            yn1.z0 r2 = yn1.z0.f545466a     // Catch: java.lang.Throwable -> Lb3
            int r5 = yn1.z0.f545469d     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L6d
            bw5.bj0 r5 = r2.i()     // Catch: java.lang.Throwable -> Lb3
            bw5.bj0 r6 = bw5.bj0.NOTIFY_CODE_NONE     // Catch: java.lang.Throwable -> Lb3
            if (r5 == r6) goto L6e
            bw5.bj0 r5 = r2.i()     // Catch: java.lang.Throwable -> Lb3
            bw5.bj0 r6 = bw5.bj0.NOTIFY_CODE_UI_READY     // Catch: java.lang.Throwable -> Lb3
            if (r5 != r6) goto L6d
            goto L6e
        L6d:
            r3 = r4
        L6e:
            if (r3 == 0) goto L92
            int r1 = yn1.z0.f545468c     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "MM.Mig.MigrationGlobalHolder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lb3
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)     // Catch: java.lang.Throwable -> Lb3
            ku5.u0 r0 = ku5.t0.f394148d     // Catch: java.lang.Throwable -> Lb3
            yn1.k0 r2 = new yn1.k0     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> Lb3
            r3 = 15000(0x3a98, double:7.411E-320)
            r0.k(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L92:
            java.lang.String r0 = "MM.Mig.MigrationGlobalHolder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            int r1 = yn1.z0.f545469d     // Catch: java.lang.Throwable -> Lb3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = ", status="
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            bw5.bj0 r1 = r2.i()     // Catch: java.lang.Throwable -> Lb3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb3
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r7)
            goto Lb6
        Lb3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vn1.m r8, java.lang.String r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.b(vn1.m, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, java.lang.String r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof yn1.n0
            if (r0 == 0) goto L13
            r0 = r11
            yn1.n0 r0 = (yn1.n0) r0
            int r1 = r0.f545298i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f545298i = r1
            goto L18
        L13:
            yn1.n0 r0 = new yn1.n0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f545296g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f545298i
            java.lang.String r3 = "MM.Mig.MigrationGlobalHolder"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L48
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lc1
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f545295f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f545294e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f545293d
            yn1.z0 r2 = (yn1.z0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L9b
        L48:
            java.lang.Object r9 = r0.f545295f
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.f545294e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f545293d
            yn1.z0 r2 = (yn1.z0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L85
        L59:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "[connectToGroup] networkName="
            r11.<init>(r2)
            r11.append(r9)
            java.lang.String r2 = ", passphrase="
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r11)
            r0.f545293d = r8
            r0.f545294e = r9
            r0.f545295f = r10
            r0.f545298i = r6
            java.lang.Object r11 = r8.v(r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            r2 = r8
        L85:
            bp1.d r11 = bp1.e.f104573a
            bp1.f[] r6 = bp1.e.f104574b
            r0.f545293d = r2
            r0.f545294e = r9
            r0.f545295f = r10
            r0.f545298i = r5
            java.lang.Object r11 = r11.a(r6, r0)
            if (r11 != r1) goto L98
            return r1
        L98:
            r7 = r10
            r10 = r9
            r9 = r7
        L9b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lab
            java.lang.String r9 = "[connectToGroup] permission denied"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        Lab:
            gz.m r11 = r2.k()
            r2 = 0
            r0.f545293d = r2
            r0.f545294e = r2
            r0.f545295f = r2
            r0.f545298i = r4
            kp.i1 r11 = (kp.i1) r11
            java.lang.Object r11 = r11.Bi(r10, r9, r0)
            if (r11 != r1) goto Lc1
            return r1
        Lc1:
            gz.a r11 = (gz.a) r11
            boolean r9 = r11.f359172a
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yn1.o0
            if (r0 == 0) goto L13
            r0 = r9
            yn1.o0 r0 = (yn1.o0) r0
            int r1 = r0.f545310g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f545310g = r1
            goto L18
        L13:
            yn1.o0 r0 = new yn1.o0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f545308e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f545310g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.String r7 = "MM.Mig.MigrationGlobalHolder"
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L8a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f545307d
            yn1.z0 r2 = (yn1.z0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L6b
        L40:
            java.lang.Object r2 = r0.f545307d
            yn1.z0 r2 = (yn1.z0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5c
        L48:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "[createGroup]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r9)
            r0.f545307d = r8
            r0.f545310g = r5
            java.lang.Object r9 = r8.v(r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r2 = r8
        L5c:
            bp1.d r9 = bp1.e.f104573a
            bp1.f[] r5 = bp1.e.f104574b
            r0.f545307d = r2
            r0.f545310g = r4
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L79
            java.lang.String r9 = "[createGroup] permission denied"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r9)
            return r6
        L79:
            gz.m r9 = r2.k()
            r0.f545307d = r6
            r0.f545310g = r3
            kp.i1 r9 = (kp.i1) r9
            java.lang.Object r9 = r9.Ri(r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            gz.b r9 = (gz.b) r9
            boolean r0 = r9.f359175a
            if (r0 == 0) goto Laa
            java.lang.String r0 = r9.f359178d
            if (r0 == 0) goto La4
            java.lang.String r9 = r9.f359179e
            if (r9 == 0) goto La4
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
            jz5.l r1 = new jz5.l
            r1.<init>(r0, r9)
            return r1
        La4:
            java.lang.String r9 = "[createGroup] failed: networkName or passphrase is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r9)
            return r6
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[createGroup] failed: "
            r0.<init>(r1)
            bw5.xf0 r1 = r9.f359176b
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r9 = r9.f359177c
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        if (f545467b.compareAndSet(false, true)) {
            fp.d0.n("aff_biz");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.c.f298921a = yn1.p0.f545320a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.d.f298922a = yn1.q0.f545334a;
            i95.n0.c(gz.l.class);
        }
    }

    public final bw5.he0 f() {
        boolean m40092xb9aa8b5f;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "getMigrateNetworkStatus, isWifi = " + m40092xb9aa8b5f);
        if (!m40092xb9aa8b5f) {
            return bw5.he0.MOBILE;
        }
        java.lang.Object systemService = context.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        boolean isActiveNetworkMetered = ((android.net.ConnectivityManager) systemService).isActiveNetworkMetered();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "getMigrateNetworkStatus, isExpensive = " + isActiveNetworkMetered);
        return isActiveNetworkMetered ? bw5.he0.EXPENSIVE_WIFI : bw5.he0.FREE_WIFI;
    }

    public final java.lang.String g() {
        java.lang.String str = f545479n;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("migrationPath");
        throw null;
    }

    public final bw5.l0 h() {
        bw5.p0 p0Var = f545473h;
        if (p0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sceneModel");
            throw null;
        }
        bw5.l0 l0Var = p0Var.f112956g[1] ? p0Var.f112953d : bw5.l0.AFFMIG_PHONE;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l0Var, "getPeerType(...)");
        return l0Var;
    }

    public final bw5.bj0 i() {
        bw5.q0 q0Var = f545471f;
        if (q0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statusModel");
            throw null;
        }
        bw5.bj0 b17 = q0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getStatus(...)");
        return b17;
    }

    public final java.lang.String j() {
        java.lang.String str = f545480o;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
        throw null;
    }

    public final gz.m k() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f545481p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (gz.m) mo141623x754a37bb;
    }

    public final boolean l() {
        bw5.p0 p0Var = f545473h;
        if (p0Var != null) {
            return p0Var.f112954e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sceneModel");
        throw null;
    }

    public final boolean m() {
        if (z65.c.a()) {
            return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2544xcd3633ce.C20366xb8528d60()) > 0;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_migration_enable_cdn_android_mmkv", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "isEnableCdnMigrate, enable = " + i17);
        return i17;
    }

    public final boolean n() {
        boolean z17;
        synchronized (this) {
            z17 = f545468c > 0;
        }
        return z17;
    }

    public final boolean o(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return f545482q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, j());
    }

    public final void p() {
        android.os.Looper.getMainLooper().isCurrentThread();
        java.util.Set listenerSet = f545475j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listenerSet, "listenerSet");
        synchronized (listenerSet) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listenerSet, "listenerSet");
            java.util.Iterator it = listenerSet.iterator();
            while (it.hasNext()) {
                ((yn1.m) it.next()).E2();
            }
        }
    }

    public final void q(yn1.m listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[registerListeners] listener=" + listener);
        f545475j.add(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(vn1.m r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.r(vn1.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(vn1.m r8, java.lang.String r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.s(vn1.m, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final synchronized void t(int i17) {
        if (f545468c != 0 && i17 >= f545468c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[unInitialize] username=" + j() + ", instanceId=" + f545468c + ", targetId=" + i17);
            f545468c = 0;
            f545480o = "";
            f545479n = "";
            f545482q = false;
            f545477l = "";
            yn1.h4.f545224i.a();
            yn1.d0.f545168a.b();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(f545485t);
            try {
                ((kp.i1) k()).mj();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationGlobalHolder", "[unInitialize] removeGroup error: " + e17);
            }
            if (f545470e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[unInitialize] uninitialize backup storage");
                f545470e = false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.q();
            if (!((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi()) {
                ((kp.i1) k()).pj();
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[unInitialize] instanceId=" + f545468c + ", targetId=" + i17);
    }

    public final boolean u(yn1.m listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[unregisterListener] listener=" + listener);
        return f545475j.remove(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yn1.v0
            if (r0 == 0) goto L13
            r0 = r9
            yn1.v0 r0 = (yn1.v0) r0
            int r1 = r0.f545411f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f545411f = r1
            goto L18
        L13:
            yn1.v0 r0 = new yn1.v0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f545409d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f545411f
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            java.lang.String r5 = "MM.Mig.MigrationGlobalHolder"
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L51
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            int r9 = yn1.z0.f545469d
            if (r9 <= 0) goto L3b
            return r3
        L3b:
            java.lang.String r9 = "[waitForActivityCreated] No activity found, waiting for creation..."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r9)
            yn1.x0 r9 = new yn1.x0
            r2 = 0
            r9.<init>(r2)
            r0.f545411f = r4
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.a4.c(r6, r9, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 != 0) goto L5b
            java.lang.String r9 = "[waitForActivityCreated] Timeout after 2s, proceeding anyway"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r9)
            goto L60
        L5b:
            java.lang.String r9 = "[waitForActivityCreated] Activity created successfully"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r9)
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.v(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
