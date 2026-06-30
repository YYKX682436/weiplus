package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class b6 {

    /* renamed from: p, reason: collision with root package name */
    public static int f264329p;

    /* renamed from: q, reason: collision with root package name */
    public static int f264330q;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a6 f264331a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y5 f264332b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z5 f264333c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m5 f264334d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q3 f264335e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w5 f264336f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q5 f264337g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v5 f264338h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r5 f264339i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p5 f264340j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c5 f264341k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u4 f264342l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j5 f264343m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 f264344n;

    /* renamed from: o, reason: collision with root package name */
    public final int f264345o = (int) (java.lang.System.currentTimeMillis() / 1000);

    public static void a(java.lang.String str, java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            arrayList.add(java.lang.String.valueOf(obj));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.l(11215, arrayList);
        if (str == null || !str.startsWith("official_mall")) {
            return;
        }
        g0Var.l(14919, arrayList);
    }

    public static java.lang.String c() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "no";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        activeNetworkInfo.getExtraInfo();
        activeNetworkInfo.getType();
        activeNetworkInfo.getExtraInfo();
        return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo().toLowerCase() : "no";
    }

    public static int e() {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 5;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 7;
        }
        switch (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            case -1:
                return 255;
            case 0:
                return 1;
            case 1:
            case 6:
            case 8:
                return 3;
            case 2:
            case 5:
            case 7:
                return 2;
            case 3:
            case 4:
                return 4;
            default:
                return 6;
        }
    }

    public static void l(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1653L, j17, 1L, false);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q5 b() {
        if (this.f264337g == null) {
            this.f264337g = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q5();
        }
        return this.f264337g;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v5 d() {
        if (this.f264338h == null) {
            this.f264338h = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v5(this);
        }
        return this.f264338h;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c5 f() {
        if (this.f264341k == null) {
            this.f264341k = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c5();
        }
        return this.f264341k;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q3 g() {
        if (this.f264335e == null) {
            this.f264335e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q3();
        }
        return this.f264335e;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m5 h() {
        if (this.f264334d == null) {
            this.f264334d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m5();
        }
        return this.f264334d;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 i() {
        if (this.f264344n == null) {
            this.f264344n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4();
        }
        return this.f264344n;
    }

    public void j(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p5 p5Var = this.f264340j;
        if (p5Var != null) {
            try {
                if (p5Var.f264594a.containsKey(str)) {
                    p5Var.a(str, java.lang.Integer.valueOf(p5Var.f264594a.getInt(str) + 1));
                } else {
                    p5Var.a(str, 1);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void k() {
        if (this.f264333c == null) {
            this.f264333c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z5(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z5 z5Var = this.f264333c;
        z5Var.getClass();
        int e17 = e();
        for (java.util.Map.Entry entry : z5Var.f264757a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(32L, 0L, 1L, true);
            if (longValue >= 0 && longValue <= 180000) {
                java.lang.String str2 = z5Var.f264759c;
                java.lang.Object[] objArr = new java.lang.Object[11];
                objArr[0] = 3;
                objArr[1] = java.lang.Long.valueOf(longValue);
                objArr[2] = java.lang.Integer.valueOf(e17);
                objArr[3] = str == null ? str : str.replace(",", "!");
                objArr[4] = 0;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = java.lang.Integer.valueOf(f264329p);
                objArr[8] = java.lang.Integer.valueOf(f264330q);
                objArr[9] = java.lang.Integer.valueOf(z5Var.f264758b);
                objArr[10] = z5Var.f264759c;
                a(str2, objArr);
                g0Var.mo68477x336bdfd8(160L, 0L, 1L, false);
                if (-1 != cx4.a.b(longValue)) {
                    g0Var.mo68477x336bdfd8(160L, cx4.a.b(longValue), 1L, false);
                }
                g0Var.mo68477x336bdfd8(32L, 3L, 1L, true);
                g0Var.mo68477x336bdfd8(32L, 7L, longValue, true);
                if (f264330q == 1) {
                    g0Var.mo68477x336bdfd8(32L, 16L, 1L, true);
                    g0Var.mo68477x336bdfd8(32L, 17L, longValue, true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewReporter", "WebviewOpenUrlReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", str, java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(f264329p), java.lang.Integer.valueOf(f264330q), java.lang.Integer.valueOf(z5Var.f264758b), z5Var.f264759c);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m5 h17 = h();
        java.lang.String str3 = h17.f264552d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        try {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k5.f264522d.getClass(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l5(h17));
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewReporter", "invokeAsResult error, %s", e18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q3 g17 = g();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17.f264604a)) {
            java.lang.String str4 = g17.f264604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            if (r26.i0.y(str4, "wrd", false)) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("iswebviewreadtime=1&publishid=");
                stringBuffer.append(g17.f264604a);
                stringBuffer.append("&staytime=");
                stringBuffer.append(g17.f264606c);
                stringBuffer.append("&allstaytime=");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = g17.f264605b;
                stringBuffer.append(currentTimeMillis - j17);
                stringBuffer.append("&maxscrolly=");
                stringBuffer.append(g17.f264607d);
                stringBuffer.append("&totalscrolly=");
                stringBuffer.append(g17.f264608e);
                stringBuffer.append("&scene=");
                stringBuffer.append(g17.f264609f);
                stringBuffer.append("&entertime=");
                stringBuffer.append(j17);
                stringBuffer.append("&screenheight=");
                stringBuffer.append(i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("reportString", stringBuffer.toString());
                try {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p3.f264593d.getClass(), null);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebviewReporter", e19, "TopStory report", new java.lang.Object[0]);
                }
            }
        }
        if (this.f264332b == null) {
            this.f264332b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y5(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y5 y5Var = this.f264332b;
        y5Var.getClass();
        int e27 = e();
        for (java.util.Map.Entry entry2 : y5Var.f264742a.entrySet()) {
            java.lang.String str5 = (java.lang.String) entry2.getKey();
            long longValue2 = ((java.lang.Long) entry2.getValue()).longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(32L, 2L, 1L, true);
            if (longValue2 == -1) {
                g0Var2.mo68477x336bdfd8(32L, 13L, 1L, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report fail url : %s, netType : %d", str5, java.lang.Integer.valueOf(e27));
            }
            if (longValue2 >= 0 && longValue2 <= 60000) {
                java.lang.Object[] objArr2 = new java.lang.Object[11];
                objArr2[0] = 2;
                objArr2[1] = java.lang.Long.valueOf(longValue2);
                objArr2[2] = java.lang.Integer.valueOf(e27);
                objArr2[3] = str5 == null ? str5 : str5.replace(",", "!");
                objArr2[4] = 0;
                objArr2[5] = 0;
                objArr2[6] = 0;
                objArr2[7] = java.lang.Integer.valueOf(f264329p);
                objArr2[8] = java.lang.Integer.valueOf(f264330q);
                objArr2[9] = 0;
                objArr2[10] = null;
                a(null, objArr2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report url : %s, cost time : %d, netType : %d, getA8KeyScene:%d, prePublishid:%s", str5, java.lang.Long.valueOf(longValue2), java.lang.Integer.valueOf(e27), 0, null);
                g0Var2.mo68477x336bdfd8(32L, 6L, longValue2, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v5 d17 = d();
        d17.getClass();
        int e28 = e();
        java.util.Iterator it = d17.f264685a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                for (java.util.Map.Entry entry3 : d17.f264686b.entrySet()) {
                    java.lang.String str6 = (java.lang.String) entry3.getKey();
                    long longValue3 = ((java.lang.Long) entry3.getValue()).longValue();
                    if (longValue3 < 0 || longValue3 > 180000) {
                        break;
                    }
                    java.lang.String str7 = d17.f264690f;
                    java.lang.Object[] objArr3 = new java.lang.Object[11];
                    objArr3[0] = 6;
                    objArr3[1] = java.lang.Long.valueOf(longValue3);
                    objArr3[2] = java.lang.Integer.valueOf(e28);
                    if (str6 != null) {
                        str6 = str6.replace(",", "!");
                    }
                    objArr3[3] = str6;
                    objArr3[4] = 0;
                    objArr3[5] = 0;
                    objArr3[6] = 0;
                    objArr3[7] = java.lang.Integer.valueOf(f264329p);
                    objArr3[8] = java.lang.Integer.valueOf(f264330q);
                    objArr3[9] = java.lang.Integer.valueOf(d17.f264689e);
                    objArr3[10] = d17.f264690f;
                    a(str7, objArr3);
                    if (f264329p == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var3.mo68477x336bdfd8(32L, 20L, 1L, true);
                        g0Var3.mo68477x336bdfd8(32L, 21L, longValue3, true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var4.mo68477x336bdfd8(32L, 10L, 1L, true);
                    g0Var4.mo68477x336bdfd8(32L, 11L, longValue3, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report Render cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", java.lang.Long.valueOf(longValue3), java.lang.Integer.valueOf(e28), java.lang.Integer.valueOf(f264329p), java.lang.Integer.valueOf(f264330q), java.lang.Integer.valueOf(d17.f264689e), d17.f264690f);
                }
            } else {
                java.util.Map.Entry entry4 = (java.util.Map.Entry) it.next();
                java.lang.String str8 = (java.lang.String) entry4.getKey();
                long longValue4 = ((java.lang.Long) entry4.getValue()).longValue();
                if (longValue4 < 0 || longValue4 > 180000) {
                    break;
                }
                java.lang.String str9 = d17.f264690f;
                java.lang.Object[] objArr4 = new java.lang.Object[11];
                objArr4[0] = 5;
                objArr4[1] = java.lang.Long.valueOf(longValue4);
                objArr4[2] = java.lang.Integer.valueOf(e28);
                if (str8 != null) {
                    str8 = str8.replace(",", "!");
                }
                objArr4[3] = str8;
                objArr4[4] = 0;
                objArr4[5] = 0;
                objArr4[6] = 0;
                objArr4[7] = java.lang.Integer.valueOf(f264329p);
                objArr4[8] = java.lang.Integer.valueOf(f264330q);
                objArr4[9] = java.lang.Integer.valueOf(d17.f264689e);
                objArr4[10] = d17.f264690f;
                a(str9, objArr4);
                if (f264329p == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var5.mo68477x336bdfd8(32L, 18L, 1L, true);
                    g0Var5.mo68477x336bdfd8(32L, 19L, longValue4, true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var6.mo68477x336bdfd8(32L, 8L, 1L, true);
                g0Var6.mo68477x336bdfd8(32L, 9L, longValue4, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report DomReady cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", java.lang.Long.valueOf(longValue4), java.lang.Integer.valueOf(e28), java.lang.Integer.valueOf(f264329p), java.lang.Integer.valueOf(f264330q), java.lang.Integer.valueOf(d17.f264689e), d17.f264690f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q5 b17 = b();
        b17.getClass();
        int e29 = e();
        if (!b17.f264612b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11575, b17.f264613c, 3, 1, java.lang.Integer.valueOf(e29));
        } else if (b17.f264611a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11575, b17.f264613c, 1, 1, java.lang.Integer.valueOf(e29));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11575, b17.f264613c, 2, 1, java.lang.Integer.valueOf(e29));
        }
    }
}
