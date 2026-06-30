package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class m implements android.hardware.SensorEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static long f253328h;

    /* renamed from: i, reason: collision with root package name */
    public static long f253329i;

    /* renamed from: m, reason: collision with root package name */
    public static long f253330m;

    /* renamed from: n, reason: collision with root package name */
    public static long f253331n;

    /* renamed from: o, reason: collision with root package name */
    public static long f253332o;

    /* renamed from: p, reason: collision with root package name */
    public static long f253333p;

    /* renamed from: q, reason: collision with root package name */
    public static long f253334q;

    /* renamed from: r, reason: collision with root package name */
    public static long f253335r;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.SensorManager f253336d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a0 f253337e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.hardware.Sensor f253338f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f253339g;

    public m() {
        boolean z17;
        boolean z18 = false;
        this.f253339g = false;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5858xd50f490c> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5858xd50f490c>(a0Var) { // from class: com.tencent.mm.plugin.sport.model.PushSportStepDetector$1
            {
                this.f39173x3fe91575 = 995577628;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5858xd50f490c r6) {
                /*
                    r5 = this;
                    com.tencent.mm.autogen.events.PushKeepAliveEvent r6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5858xd50f490c) r6
                    long r0 = c01.id.c()
                    long r2 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m.f253333p
                    long r0 = r0 - r2
                    r2 = 60000(0xea60, double:2.9644E-319)
                    long r0 = r0 / r2
                    java.lang.Long r6 = java.lang.Long.valueOf(r0)
                    java.lang.Object[] r6 = new java.lang.Object[]{r6}
                    java.lang.String r0 = "pushKeepAliveEvent %d"
                    java.lang.String r1 = "MicroMsg.Sport.PushSportStepDetector"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r6)
                    com.tencent.mm.plugin.sport.model.m r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m.this
                    boolean r6 = r6.f253339g
                    r0 = 0
                    if (r6 == 0) goto La9
                    android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
                    java.lang.String r2 = "power"
                    java.lang.Object r6 = r6.getSystemService(r2)
                    android.os.PowerManager r6 = (android.os.PowerManager) r6
                    boolean r6 = r6.isScreenOn()
                    if (r6 == 0) goto L3b
                    java.lang.String r6 = "Screen On"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
                    goto L68
                L3b:
                    java.util.Calendar r6 = java.util.Calendar.getInstance()
                    r1 = 11
                    int r1 = r6.get(r1)
                    r2 = 21
                    if (r1 != r2) goto L58
                    long r1 = r6.getTimeInMillis()
                    long r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m.f253333p
                    long r1 = r1 - r3
                    r3 = 900000(0xdbba0, double:4.44659E-318)
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 <= 0) goto L68
                    goto L66
                L58:
                    long r1 = r6.getTimeInMillis()
                    long r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m.f253333p
                    long r1 = r1 - r3
                    r3 = 1800000(0x1b7740, double:8.89318E-318)
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 <= 0) goto L68
                L66:
                    r6 = 1
                    goto L69
                L68:
                    r6 = r0
                L69:
                    if (r6 == 0) goto La9
                    boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.ServiceC18457xefbbaefe.f253301e
                    r6 = 26
                    boolean r6 = fp.h.c(r6)
                    if (r6 == 0) goto La9
                    boolean r6 = u75.d.c()
                    java.lang.String r1 = "MicroMsg.Sport.SportForegroundService"
                    if (r6 == 0) goto L84
                    java.lang.String r6 = "miui, not need to start sport foreground"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
                    goto La9
                L84:
                    boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.ServiceC18457xefbbaefe.f253301e
                    if (r6 != 0) goto La9
                    boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()
                    if (r6 != 0) goto La9
                    java.lang.String r6 = "startSportForegroundService"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
                    android.content.Intent r2 = new android.content.Intent
                    android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
                    java.lang.Class<com.tencent.mm.plugin.sport.model.SportForegroundService> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.ServiceC18457xefbbaefe.class
                    r2.<init>(r3, r4)
                    android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> La3
                    r3.startForegroundService(r2)     // Catch: java.lang.Exception -> La3
                    goto La9
                La3:
                    r2 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r0]
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r6, r3)
                La9:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.C18456xbd7e45b9.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        if (fp.h.c(28)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", "register push keep alive event");
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optInt("checkWeSportInstall") != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportUtil", "checkPushInstallWeSport is false");
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17) {
                z18 = true;
            }
        }
        this.f253339g = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", "isSupportDeviceStep %b", java.lang.Boolean.valueOf(z18));
        if (this.f253339g) {
            b();
        }
        f253335r = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.b();
        long j17 = b17.f253351a;
        f253331n = j17;
        f253332o = b17.f253352b;
        f253333p = b17.f253353c;
        f253334q = b17.f253354d;
        f253328h = b17.f253355e;
        f253329i = b17.f253356f;
        f253330m = b17.f253357g;
        if (j17 != com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", "invalid begin time %s", com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f(f253331n));
            f253331n = 0L;
            f253332o = 0L;
            f253333p = 0L;
            f253334q = 0L;
            f253328h = 0L;
            f253329i = 0L;
            f253330m = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r4 = this;
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(r0)
            r1 = 0
            if (r0 == 0) goto L23
            org.json.JSONObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c()
            java.lang.String r2 = "checkWeSportInstall"
            int r0 = r0.optInt(r2)
            r2 = 1
            if (r0 == r2) goto L1f
            java.lang.String r0 = "MicroMsg.Sport.SportUtil"
            java.lang.String r3 = "checkPushInstallWeSport is false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3)
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
            goto L24
        L23:
            r2 = r1
        L24:
            r4.f253339g = r2
            if (r2 == 0) goto L30
            r4.d()
            boolean r0 = r4.b()
            return r0
        L30:
            r4.d()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m.a():boolean");
    }

    public final boolean b() {
        try {
            if (this.f253336d == null) {
                this.f253336d = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            }
            if (this.f253337e == null) {
                this.f253337e = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a0(this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.PushSportStepDetector", "Exception in registerDetector %s", e17.getMessage());
        }
        if (this.f253336d == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || !((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.HEALTHY, d85.f0.F)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", "no step sensor");
            return false;
        }
        android.hardware.Sensor defaultSensor = this.f253336d.getDefaultSensor(19);
        this.f253338f = defaultSensor;
        if (defaultSensor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", " TYPE_STEP_COUNTER sensor null");
            return false;
        }
        boolean registerListener = this.f253336d.registerListener(this.f253337e, this.f253338f, com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optInt("stepCounterRateUs", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
        if (!registerListener) {
            d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", "registerDetector() ok.(result : %s)", java.lang.Boolean.valueOf(registerListener));
        return registerListener;
    }

    public final void c() {
        long j17 = f253331n;
        long j18 = f253332o;
        long j19 = f253333p;
        long j27 = f253334q;
        long j28 = f253328h;
        long j29 = f253329i;
        long j37 = f253330m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a;
        java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37)}, 7));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        zVar.c().D("KEY_STEP_DETAIL_INFO", format);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKvStorage", "saveSportDetailInfo detailInfo:".concat(format));
    }

    public final void d() {
        try {
            if (this.f253336d == null) {
                this.f253336d = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a0 a0Var = this.f253337e;
            if (a0Var != null) {
                this.f253336d.unregisterListener(a0Var);
                this.f253337e = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.PushSportStepDetector", "unregisterDetector() success!");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.PushSportStepDetector", "Exception in unregisterDetector %s", e17.getMessage());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        int i17 = 0;
        float f17 = sensorEvent.values[0];
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
            return;
        }
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length > 0) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.n(c01.id.c(), sensorEvent.values[0], sensorEvent.timestamp, "PUSH"), "PushUpdateStepTag");
            return;
        }
        if (fArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", false, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", java.lang.Integer.valueOf(sensorEvent.accuracy), java.lang.Long.valueOf(sensorEvent.timestamp));
        float[] fArr2 = sensorEvent.values;
        int length = fArr2.length;
        int i18 = 0;
        while (i17 < length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(fArr2[i17]));
            i17++;
            i18++;
        }
    }
}
