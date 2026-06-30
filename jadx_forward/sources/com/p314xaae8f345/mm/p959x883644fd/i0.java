package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public abstract class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static long f153046c;

    /* renamed from: a, reason: collision with root package name */
    public static java.util.HashMap f153044a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f153045b = null;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f153047d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static long f153048e = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;

    /* renamed from: f, reason: collision with root package name */
    public static int f153049f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f153050g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p959x883644fd.f0(), false);

    /* renamed from: h, reason: collision with root package name */
    public static long f153051h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f153052i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static float f153053j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public static float f153054k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public static int f153055l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f153056m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static long f153057n = 0;

    public static void a(int i17, float f17, float f18, int i18, long j17) {
        java.lang.String str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = f153051h;
        long j19 = 0;
        if (j18 > 0 && currentTimeMillis - j18 > 5000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "never  report (reportKV) at  background :%d diff:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis - f153051h));
            return;
        }
        java.lang.String[] e17 = e(i17);
        if (e17 == null || e17.length != 4 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17[0])) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "report get failed val");
            return;
        }
        java.lang.System.currentTimeMillis();
        java.lang.String str2 = e17[0];
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - f153051h;
        if (currentTimeMillis2 <= 600000 && currentTimeMillis2 >= 0) {
            j19 = currentTimeMillis2;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(e17[0]);
        sb6.append("1,");
        sb6.append(f17);
        sb6.append(",");
        sb6.append(f18);
        sb6.append(",");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(j17);
        sb6.append(",");
        if (z65.c.f551988a) {
            str = "1";
        } else {
            str = "" + j19;
        }
        sb6.append(str);
        sb6.append(",");
        sb6.append(e17[1]);
        sb6.append(",");
        sb6.append(e17[2]);
        sb6.append(",");
        sb6.append(e17[3]);
        fVar.mo68478xbd3cda5f(11747, sb6.toString());
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORTNETTYPE_LASTREPORT_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011a A[Catch: Exception -> 0x0116, TRY_LEAVE, TryCatch #5 {Exception -> 0x0116, blocks: (B:125:0x0112, B:118:0x011a), top: B:124:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016d A[EDGE_INSN: B:23:0x016d->B:24:0x016d BREAK  A[LOOP:0: B:11:0x0136->B:20:0x0136], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e8  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.io.ObjectOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p959x883644fd.i0.b(java.util.ArrayList):boolean");
    }

    public static void c(int i17, float f17, float f18, int i18, long j17) {
        try {
            long j18 = f153048e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "checkTimeReport scene:%d diff:%d  time:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j18), java.lang.Long.valueOf(f153048e));
            if (i17 <= 2000 && java.lang.System.currentTimeMillis() - f153048e <= 300000) {
                if (f153048e == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    f153048e = java.lang.System.currentTimeMillis() + 60000;
                }
                f153049f = i17;
                f153050g.c(60000L, 60000L);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "force Run, scene:%d diff:%d time:%d ", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - f153048e), java.lang.Long.valueOf(f153048e));
            f153049f = i17;
            f153048e = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            f(i17, f17, f18, i18, j17);
        } catch (java.lang.Throwable th6) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "checkTimeReport error: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
    }

    public static java.lang.String d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        for (char c17 : str.toCharArray()) {
            if ((c17 < 'a' || c17 > 'z') && ((c17 < 'A' || c17 > 'Z') && !((c17 >= '0' && c17 <= '9') || c17 == '|' || c17 == '-' || c17 == ' ' || c17 == ':'))) {
                return "";
            }
        }
        return str;
    }

    public static java.lang.String[] e(int i17) {
        int i18;
        long j17;
        java.lang.StringBuffer stringBuffer;
        java.lang.StringBuffer stringBuffer2;
        java.lang.StringBuffer stringBuffer3;
        java.util.ArrayList arrayList;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z65.c.f551988a);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(f153051h);
        long j18 = f153051h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "dkNetTypeRead scene:%d fg:%b time:%d diff:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j18));
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "ERROR PARAM: scene:%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "ERROR Context is null scene:%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "read scene:%d foreground:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z65.c.f551988a));
        try {
            i18 = wo.p1.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "getNetType : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            i18 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "get netType :%d", java.lang.Integer.valueOf(i18));
        java.lang.String str = "";
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        try {
            stringBuffer = new java.lang.StringBuffer();
            stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer3 = new java.lang.StringBuffer();
            arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
            stringBuffer.append(i0Var.e(false));
            stringBuffer2.append(i0Var.d(false));
            arrayList.add(i0Var.d(false));
            if (java.lang.System.currentTimeMillis() - f153046c > 600000) {
                f153046c = java.lang.System.currentTimeMillis();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "getWifiInfo : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
        }
        if (i17 < 2000 && !b(arrayList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetTypeReporter", "checkBssid: find all report already  , give up. scene:%d ", java.lang.Integer.valueOf(i17));
            return null;
        }
        str = stringBuffer.toString();
        str2 = stringBuffer2.toString();
        str3 = "0" + stringBuffer3.toString();
        java.lang.String str4 = "";
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str4 = telephonyManager.getNetworkOperatorName();
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "getNetType : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "get ispName: %s", str4);
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        java.lang.String str7 = "";
        java.lang.String str8 = "";
        java.lang.String str9 = "";
        try {
            java.util.List<com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.CellInfo> m40060xc32c8064 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40060xc32c8064(context);
            for (int i19 = 0; i19 < m40060xc32c8064.size(); i19++) {
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.CellInfo cellInfo = m40060xc32c8064.get(i19);
                java.lang.String str10 = cellInfo.mcc;
                str5 = "";
                if (str10 != null) {
                    str5 = str10;
                }
                java.lang.String str11 = cellInfo.mnc;
                str6 = "";
                if (str11 != null) {
                    str6 = str11;
                }
                if (str7.length() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cellInfo.f19305xaeb1c5fd)) {
                    str7 = str7 + "|";
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cellInfo.f19305xaeb1c5fd)) {
                    str7 = str7 + cellInfo.f19305xaeb1c5fd;
                }
                if (str8.length() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cellInfo.lac)) {
                    str8 = str8 + "|";
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cellInfo.lac)) {
                    str8 = str8 + cellInfo.lac;
                }
                if (str9.length() > 0) {
                    str9 = str9 + "|";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str9);
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cellInfo.dbm) ? "0" : cellInfo.dbm);
                str9 = sb6.toString();
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "getNetType : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
        }
        synchronized (f153047d) {
            try {
                try {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORTNETTYPE_SEQ_LONG;
                    j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c17.m(u3Var, null), 1L);
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j17 + 1));
                    gm0.j1.u().c().i(true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "incSeq after write  old:%d new:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) gm0.j1.u().c().m(u3Var, null), 1L)));
                } catch (java.lang.Exception e28) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "incSeq :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
                    j17 = -1;
                }
            } finally {
            }
        }
        if (j17 < 0) {
            return null;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        sb7.append(j17);
        sb7.append(",");
        sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + "," + i17 + "," + i18 + "," + str.replace(",", " ") + "," + d(str2.replace(",", " ")) + "," + str4.replace(",", " ") + "," + d(str5.replace(",", " ")) + "," + d(str6.replace(",", " ")) + "," + d(str7.replace(",", " ")) + ",");
        return new java.lang.String[]{sb7.toString(), d(str3), d(str8), d(str9)};
    }

    public static void f(int i17, float f17, float f18, int i18, long j17) {
        java.lang.String str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = f153051h;
        long j19 = 0;
        if (j18 > 0 && currentTimeMillis - j18 > 5000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "never  report  at  background :%d diff:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis - f153051h));
            return;
        }
        java.lang.String[] e17 = e(i17);
        if (e17 == null || e17.length != 4 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17[0])) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "report get failed val");
            return;
        }
        java.lang.System.currentTimeMillis();
        java.lang.String str2 = e17[0];
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.uj5();
        lVar.f152198b = new r45.vj5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rtkvreport";
        lVar.f152200d = 716;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.uj5 uj5Var = (r45.uj5) a17.f152243a.f152217a;
        uj5Var.f468948d = o45.wf.f424558c;
        uj5Var.f468949e = o45.wf.f424557b;
        uj5Var.f468950f = o45.wf.f424560e;
        uj5Var.f468951g = wo.q.f529318f;
        uj5Var.f468952h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        uj5Var.f468953i = 11747;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - f153051h;
        if (currentTimeMillis2 <= 600000 && currentTimeMillis2 >= 0) {
            j19 = currentTimeMillis2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(e17[0]);
        sb6.append("0,");
        sb6.append(f17);
        sb6.append(",");
        sb6.append(f18);
        sb6.append(",");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(j17);
        sb6.append(",");
        if (z65.c.f551988a) {
            str = "1";
        } else {
            str = "" + j19;
        }
        sb6.append(str);
        sb6.append(",");
        sb6.append(e17[1]);
        sb6.append(",");
        sb6.append(e17[2]);
        sb6.append(",");
        sb6.append(e17[3]);
        uj5Var.f468954m = sb6.toString();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p959x883644fd.d0(java.lang.System.currentTimeMillis(), uj5Var, e17, f17, f18, i18, j17), true);
    }

    public static void g(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.uj5();
        lVar.f152198b = new r45.vj5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rtkvreport";
        lVar.f152200d = 716;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.uj5 uj5Var = (r45.uj5) a17.f152243a.f152217a;
        uj5Var.f468948d = o45.wf.f424558c;
        uj5Var.f468949e = o45.wf.f424557b;
        uj5Var.f468950f = o45.wf.f424560e;
        uj5Var.f468951g = wo.q.f529318f;
        uj5Var.f468952h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        uj5Var.f468953i = i17;
        uj5Var.f468954m = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "reportCgi logId:%d, value:%s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p959x883644fd.e0(java.lang.System.currentTimeMillis(), uj5Var), false);
    }

    public static void h(boolean z17) {
        if (z17) {
            f153051h = 0L;
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f153050g;
        if (b4Var.e()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "setToForeground user turn to background run report now");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f153051h = java.lang.System.currentTimeMillis();
        b4Var.c(0L, 0L);
    }
}
