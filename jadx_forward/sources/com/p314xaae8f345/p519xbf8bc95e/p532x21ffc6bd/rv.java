package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rv extends java.lang.Thread {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f132803c = "UTF-8";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f132804h = "rttserverex";

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f132805i = "getRtt";

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f132806j = "info";

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f132807k = "req";

    /* renamed from: l, reason: collision with root package name */
    private static final int f132808l = 30000;

    /* renamed from: b, reason: collision with root package name */
    java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt> f132810b;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132811d;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu f132812e;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e f132815m;

    /* renamed from: f, reason: collision with root package name */
    private boolean f132813f = false;

    /* renamed from: a, reason: collision with root package name */
    boolean f132809a = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f132814g = false;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f132816a;

        /* renamed from: b, reason: collision with root package name */
        public int f132817b;

        private a() {
        }

        public /* synthetic */ a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv rvVar, byte b17) {
            this();
        }
    }

    public rv(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar) {
        this.f132811d = null;
        this.f132812e = null;
        setName("tms-traffic-refresh");
        this.f132811d = neVar;
        this.f132812e = luVar;
        this.f132810b = new java.util.ArrayList();
    }

    private void b() {
        this.f132809a = true;
        synchronized (this) {
            notifyAll();
        }
    }

    private void c() {
        this.f132809a = false;
        synchronized (this) {
            notifyAll();
        }
    }

    private int d() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd g17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132811d;
        if (neVar == null) {
            return 0;
        }
        try {
            synchronized (neVar.f132039f.f133202m) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f132811d.f132041h;
                int i17 = adVar.A.f133942b.f133977m;
                android.graphics.Rect q17 = adVar.q();
                double d17 = q17.left / 1000000.0f;
                double d18 = q17.bottom / 1000000.0f;
                com.tencent.mapsdk.internal.rv.a a17 = a(d17, d18);
                com.tencent.mapsdk.internal.rv.a a18 = a(q17.right / 1000000.0f, q17.top / 1000000.0f);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132811d.f132039f;
                tkVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass13(i17, java.lang.Math.min(a17.f132816a, a18.f132816a), java.lang.Math.min(a17.f132817b, a18.f132817b), java.lang.Math.max(a18.f132816a, a17.f132816a), java.lang.Math.max(a18.f132817b, a17.f132817b)));
            }
            byte[] bArr = null;
            if (this.f132811d != null && (g17 = g()) != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar = this.f132812e;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa c4377x6f575caa = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa();
                c4377x6f575caa.f130243pf = "android_sdk";
                c4377x6f575caa.f17311x70a5814 = false;
                c4377x6f575caa.f17309x2c0b7d03 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();
                c4377x6f575caa.f17310x3160c8 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f fVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f();
                fVar.c(f132804h);
                fVar.d(f132805i);
                fVar.a(f132806j, (java.lang.String) c4377x6f575caa);
                fVar.a(f132807k, (java.lang.String) g17);
                bArr = luVar.a(fVar.f());
            }
            if (bArr != null && bArr.length > 0) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = this.f132811d.f132039f;
                ((java.lang.Integer) tkVar2.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass185>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass185(bArr, bArr.length), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass185) (-1))).intValue();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(this.f132811d.K).c(com.tencent.mapsdk.internal.la.a.f131799g, "refreshTrafficData length > 0");
                return bArr.length;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c("refreshTrafficData error", th6);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(this.f132811d.K).e(com.tencent.mapsdk.internal.la.a.f131799g, "refreshTrafficData error", th6);
        }
        return 0;
    }

    private void e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f132811d.f132041h;
        int i17 = adVar.A.f133942b.f133977m;
        android.graphics.Rect q17 = adVar.q();
        double d17 = q17.left / 1000000.0f;
        double d18 = q17.bottom / 1000000.0f;
        com.tencent.mapsdk.internal.rv.a a17 = a(d17, d18);
        com.tencent.mapsdk.internal.rv.a a18 = a(q17.right / 1000000.0f, q17.top / 1000000.0f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132811d.f132039f;
        tkVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass13(i17, java.lang.Math.min(a17.f132816a, a18.f132816a), java.lang.Math.min(a17.f132817b, a18.f132817b), java.lang.Math.max(a18.f132816a, a17.f132816a), java.lang.Math.max(a18.f132817b, a17.f132817b)));
    }

    private byte[] f() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd g17;
        if (this.f132811d == null || (g17 = g()) == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar = this.f132812e;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa c4377x6f575caa = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa();
        c4377x6f575caa.f130243pf = "android_sdk";
        c4377x6f575caa.f17311x70a5814 = false;
        c4377x6f575caa.f17309x2c0b7d03 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();
        c4377x6f575caa.f17310x3160c8 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f fVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f();
        fVar.c(f132804h);
        fVar.d(f132805i);
        fVar.a(f132806j, (java.lang.String) c4377x6f575caa);
        fVar.a(f132807k, (java.lang.String) g17);
        return luVar.a(fVar.f());
    }

    private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd g() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132811d;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd c4369x251867dd = null;
        if (neVar == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ru[] ruVarArr = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ru[]) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass35(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass35) null);
        if (ruVarArr != null && ruVarArr.length != 0) {
            c4369x251867dd = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd();
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            int i17 = Integer.MIN_VALUE;
            int i18 = Integer.MAX_VALUE;
            int i19 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = Integer.MIN_VALUE;
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ru ruVar : ruVarArr) {
                arrayList.add(java.lang.Integer.valueOf(ruVar.f132797d));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f132796c));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f132799f));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f132798e));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f132800g));
                i18 = java.lang.Math.min(i18, ruVar.f132797d);
                i19 = java.lang.Math.min(i19, ruVar.f132796c);
                i17 = java.lang.Math.max(i17, ruVar.f132799f);
                i28 = java.lang.Math.max(i28, ruVar.f132798e);
                i27 = ruVar.f132794a;
            }
            try {
                double d17 = 3.141592653589793d - (((((i19 + i28) / 2) / 256.0d) * 6.283185307179586d) / 1048576.0d);
                this.f132815m = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.m99376xdc3ef9b().m99383xcb7e7191(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(java.lang.Math.atan((java.lang.Math.exp(d17) - java.lang.Math.exp(-d17)) * 0.5d) * 57.29577951308232d, (((((i18 + i17) / 2) / 256.0d) / 1048576.0d) * 360.0d) - 180.0d)).m99385x3923d3(i27).m99382x59bc66e();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(this.f132811d.K).e(com.tencent.mapsdk.internal.la.a.f131799g, "traffic thread calc request camera error", e17);
            }
            java.util.ArrayList<java.lang.Long> arrayList2 = new java.util.ArrayList<>();
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ru ruVar2 : ruVarArr) {
                arrayList2.add(java.lang.Long.valueOf(ruVar2.f132802i));
            }
            c4369x251867dd.f17250x2eb91f = arrayList2;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ru ruVar3 = ruVarArr[0];
            c4369x251867dd.f17251x368f3a = ruVar3.f132801h;
            c4369x251867dd.f17249xad8df6b5 = arrayList;
            c4369x251867dd.zip = (short) 1;
            c4369x251867dd.f17252x3923d3 = (short) ruVar3.f132794a;
        }
        return c4369x251867dd;
    }

    public final void a() {
        this.f132814g = true;
        synchronized (this) {
            notifyAll();
        }
        interrupt();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.run():void");
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt> list = this.f132810b;
        if (list == null || rtVar == null) {
            return;
        }
        list.remove(rtVar);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt> list = this.f132810b;
        if (list == null || rtVar == null) {
            return;
        }
        list.add(rtVar);
    }

    private static byte[] a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4369x251867dd c4369x251867dd) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa c4377x6f575caa = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb.C4377x6f575caa();
        c4377x6f575caa.f130243pf = "android_sdk";
        c4377x6f575caa.f17311x70a5814 = false;
        c4377x6f575caa.f17309x2c0b7d03 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();
        c4377x6f575caa.f17310x3160c8 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f fVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f();
        fVar.c(f132804h);
        fVar.d(f132805i);
        fVar.a(f132806j, (java.lang.String) c4377x6f575caa);
        fVar.a(f132807k, (java.lang.String) c4369x251867dd);
        return fVar.f();
    }

    private com.tencent.mapsdk.internal.rv.a a(double d17, double d18) {
        double sin = java.lang.Math.sin((d18 * 3.1415926d) / 180.0d);
        double log = ((180.0d - ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 180.0d) / 6.2831852d)) / 360.0d) * 2.68435456E8d;
        com.tencent.mapsdk.internal.rv.a aVar = new com.tencent.mapsdk.internal.rv.a(this, (byte) 0);
        aVar.f132816a = (int) ((((d17 + 180.0d) / 360.0d) * 2.68435456E8d) + 0.5d);
        aVar.f132817b = (int) (log + 0.5d);
        return aVar;
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(int i17, int i18) {
        double d17 = 3.141592653589793d - (((i18 / 256.0d) * 6.283185307179586d) / 1048576.0d);
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(java.lang.Math.atan((java.lang.Math.exp(d17) - java.lang.Math.exp(-d17)) * 0.5d) * 57.29577951308232d, (((i17 / 256.0d) / 1048576.0d) * 360.0d) - 180.0d);
    }
}
