package i11;

/* loaded from: classes13.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    public static i11.u f368682c;

    /* renamed from: d, reason: collision with root package name */
    public static android.content.Context f368683d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f368684e;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f368685a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f368686b = false;

    public u() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("SLocationManager", 5);
        a17.start();
        this.f368685a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.m34999xe9f5beed(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        try {
            com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.m35006x1256ef26(new i11.v(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SLocationManager", "", e17);
        }
    }

    public static i11.u a(android.content.Context context) {
        if (f368682c == null) {
            f368682c = new i11.u();
        }
        f368683d = context;
        return f368682c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "executor.shutdownNow()"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r3 = 0
            java.lang.String r4 = "MicroMsg.SLocationManager"
            if (r1 >= r2) goto L22
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "SDK_INT "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r0 = " < 31"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            return r3
        L22:
            java.lang.Class<tb0.j> r1 = tb0.j.class
            r2 = 1
            if (r9 != 0) goto L28
            goto L58
        L28:
            i95.m r5 = i95.n0.c(r1)
            tb0.j r5 = (tb0.j) r5
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            sb0.f r5 = (sb0.f) r5
            r5.getClass()
            boolean r5 = j35.u.h(r9, r6)
            if (r5 != 0) goto L58
            i95.m r5 = i95.n0.c(r1)
            tb0.j r5 = (tb0.j) r5
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            sb0.f r5 = (sb0.f) r5
            r5.getClass()
            boolean r5 = j35.u.h(r9, r6)
            if (r5 == 0) goto L58
            r5 = r2
            goto L59
        L58:
            r5 = r3
        L59:
            if (r5 == 0) goto L61
            java.lang.String r9 = "onlyCoarsePer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            return r2
        L61:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "notOnlyCoarsePer, "
            r5.<init>(r6)
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r7 = r6.toUpperCase()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            java.lang.String r5 = r6.toUpperCase()
            java.lang.String r7 = "HUAWEI"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto La1
            i95.m r0 = i95.n0.c(r1)
            tb0.j r0 = (tb0.j) r0
            java.lang.String r1 = "com.huawei.permission.ACCESS_APPROXIMATELY_LOCATION"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            boolean r9 = j35.u.h(r9, r1)
            if (r9 == 0) goto Lec
            java.lang.String r9 = "huaweiCoarse"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            return r2
        La1:
            java.lang.String r1 = r6.toUpperCase()
            java.lang.String r5 = "XIAOMI"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lae
            goto Lec
        Lae:
            java.lang.String r1 = r6.toUpperCase()
            java.lang.String r5 = "VIVO"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lec
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask
            i11.z r5 = new i11.z
            r5.<init>(r8, r9)
            r1.<init>(r5)
            ku5.u0 r9 = ku5.t0.f394148d
            ku5.t0 r9 = (ku5.t0) r9
            r9.g(r1)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Ldc
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = r1.get(r5, r9)     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Ldc
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Ldc
            boolean r3 = r9.booleanValue()     // Catch: java.lang.Throwable -> Lda java.lang.Exception -> Ldc
            goto Le4
        Lda:
            r9 = move-exception
            goto Le8
        Ldc:
            r1.cancel(r2)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r9 = "check vivo coarse timeout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)     // Catch: java.lang.Throwable -> Lda
        Le4:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            return r3
        Le8:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            throw r9
        Lec:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i11.u.b(android.content.Context):boolean");
    }

    public boolean c() {
        if (java.lang.System.currentTimeMillis() - j35.u.f("android.permission.ACCESS_FINE_LOCATION", 64) >= 86400000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "request location permission is not satisfied in period");
        return false;
    }

    public void d(final android.content.Context context) {
        if (context == null) {
            return;
        }
        db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkc), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new android.content.DialogInterface.OnClickListener() { // from class: i11.u$$a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "need request location permission");
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.g(context);
                j35.u.m("android.permission.ACCESS_FINE_LOCATION", 64);
            }
        }, new i11.DialogInterfaceOnClickListenerC28493x35bb4d());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
        c6423x452b9f7c.f137646e = 3100L;
        c6423x452b9f7c.k();
    }

    public void e(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce, android.content.Context context, int i17, android.os.Looper looper) {
        this.f368685a.mo50293x3498a0(new i11.y(this, context, interfaceC4219xb9b728ce, i17, looper));
    }
}
