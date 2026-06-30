package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public abstract class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static long f71513c;

    /* renamed from: a, reason: collision with root package name */
    public static java.util.HashMap f71511a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f71512b = null;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f71514d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static long f71515e = com.tencent.wcdb.core.Database.DictDefaultMatchValue;

    /* renamed from: f, reason: collision with root package name */
    public static int f71516f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f71517g = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelstat.f0(), false);

    /* renamed from: h, reason: collision with root package name */
    public static long f71518h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f71519i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static float f71520j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public static float f71521k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public static int f71522l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f71523m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static long f71524n = 0;

    public static void a(int i17, float f17, float f18, int i18, long j17) {
        java.lang.String str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = f71518h;
        long j19 = 0;
        if (j18 > 0 && currentTimeMillis - j18 > 5000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "never  report (reportKV) at  background :%d diff:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis - f71518h));
            return;
        }
        java.lang.String[] e17 = e(i17);
        if (e17 == null || e17.length != 4 || com.tencent.mm.sdk.platformtools.t8.K0(e17[0])) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "report get failed val");
            return;
        }
        java.lang.System.currentTimeMillis();
        java.lang.String str2 = e17[0];
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - f71518h;
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
        if (z65.c.f470455a) {
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
        fVar.kvStat(11747, sb6.toString());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_REPORTNETTYPE_LASTREPORT_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelstat.i0.b(java.util.ArrayList):boolean");
    }

    public static void c(int i17, float f17, float f18, int i18, long j17) {
        try {
            long j18 = f71515e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "checkTimeReport scene:%d diff:%d  time:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j18), java.lang.Long.valueOf(f71515e));
            if (i17 <= 2000 && java.lang.System.currentTimeMillis() - f71515e <= 300000) {
                if (f71515e == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    f71515e = java.lang.System.currentTimeMillis() + 60000;
                }
                f71516f = i17;
                f71517g.c(60000L, 60000L);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "force Run, scene:%d diff:%d time:%d ", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - f71515e), java.lang.Long.valueOf(f71515e));
            f71516f = i17;
            f71515e = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            f(i17, f17, f18, i18, j17);
        } catch (java.lang.Throwable th6) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "checkTimeReport error: %s", com.tencent.mm.sdk.platformtools.z3.c(th6));
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
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z65.c.f470455a);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(f71518h);
        long j18 = f71518h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "dkNetTypeRead scene:%d fg:%b time:%d diff:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j18));
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "ERROR PARAM: scene:%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "ERROR Context is null scene:%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "read scene:%d foreground:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z65.c.f470455a));
        try {
            i18 = wo.p1.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "getNetType : %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "get netType :%d", java.lang.Integer.valueOf(i18));
        java.lang.String str = "";
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        try {
            stringBuffer = new java.lang.StringBuffer();
            stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer3 = new java.lang.StringBuffer();
            arrayList = new java.util.ArrayList();
            com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
            stringBuffer.append(i0Var.e(false));
            stringBuffer2.append(i0Var.d(false));
            arrayList.add(i0Var.d(false));
            if (java.lang.System.currentTimeMillis() - f71513c > 600000) {
                f71513c = java.lang.System.currentTimeMillis();
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "getWifiInfo : %s", com.tencent.mm.sdk.platformtools.z3.c(e18));
        }
        if (i17 < 2000 && !b(arrayList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetTypeReporter", "checkBssid: find all report already  , give up. scene:%d ", java.lang.Integer.valueOf(i17));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "getNetType : %s", com.tencent.mm.sdk.platformtools.z3.c(e19));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "get ispName: %s", str4);
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        java.lang.String str7 = "";
        java.lang.String str8 = "";
        java.lang.String str9 = "";
        try {
            java.util.List<com.tencent.mars.comm.NetStatusUtil.CellInfo> cellInfoList = com.tencent.mars.comm.NetStatusUtil.getCellInfoList(context);
            for (int i19 = 0; i19 < cellInfoList.size(); i19++) {
                com.tencent.mars.comm.NetStatusUtil.CellInfo cellInfo = cellInfoList.get(i19);
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
                if (str7.length() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(cellInfo.cellid)) {
                    str7 = str7 + "|";
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(cellInfo.cellid)) {
                    str7 = str7 + cellInfo.cellid;
                }
                if (str8.length() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(cellInfo.lac)) {
                    str8 = str8 + "|";
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(cellInfo.lac)) {
                    str8 = str8 + cellInfo.lac;
                }
                if (str9.length() > 0) {
                    str9 = str9 + "|";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str9);
                sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(cellInfo.dbm) ? "0" : cellInfo.dbm);
                str9 = sb6.toString();
            }
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "getNetType : %s", com.tencent.mm.sdk.platformtools.z3.c(e27));
        }
        synchronized (f71514d) {
            try {
                try {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_REPORTNETTYPE_SEQ_LONG;
                    j17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c17.m(u3Var, null), 1L);
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j17 + 1));
                    gm0.j1.u().c().i(true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "incSeq after write  old:%d new:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().m(u3Var, null), 1L)));
                } catch (java.lang.Exception e28) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "incSeq :%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
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
        sb7.append(com.tencent.mm.sdk.platformtools.t8.i1() + "," + i17 + "," + i18 + "," + str.replace(",", " ") + "," + d(str2.replace(",", " ")) + "," + str4.replace(",", " ") + "," + d(str5.replace(",", " ")) + "," + d(str6.replace(",", " ")) + "," + d(str7.replace(",", " ")) + ",");
        return new java.lang.String[]{sb7.toString(), d(str3), d(str8), d(str9)};
    }

    public static void f(int i17, float f17, float f18, int i18, long j17) {
        java.lang.String str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = f71518h;
        long j19 = 0;
        if (j18 > 0 && currentTimeMillis - j18 > 5000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "never  report  at  background :%d diff:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis - f71518h));
            return;
        }
        java.lang.String[] e17 = e(i17);
        if (e17 == null || e17.length != 4 || com.tencent.mm.sdk.platformtools.t8.K0(e17[0])) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "report get failed val");
            return;
        }
        java.lang.System.currentTimeMillis();
        java.lang.String str2 = e17[0];
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uj5();
        lVar.f70665b = new r45.vj5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rtkvreport";
        lVar.f70667d = 716;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.uj5 uj5Var = (r45.uj5) a17.f70710a.f70684a;
        uj5Var.f387415d = o45.wf.f343025c;
        uj5Var.f387416e = o45.wf.f343024b;
        uj5Var.f387417f = o45.wf.f343027e;
        uj5Var.f387418g = wo.q.f447785f;
        uj5Var.f387419h = com.tencent.mm.sdk.platformtools.m2.d();
        uj5Var.f387420i = 11747;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - f71518h;
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
        if (z65.c.f470455a) {
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
        uj5Var.f387421m = sb6.toString();
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.modelstat.d0(java.lang.System.currentTimeMillis(), uj5Var, e17, f17, f18, i18, j17), true);
    }

    public static void g(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uj5();
        lVar.f70665b = new r45.vj5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rtkvreport";
        lVar.f70667d = 716;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.uj5 uj5Var = (r45.uj5) a17.f70710a.f70684a;
        uj5Var.f387415d = o45.wf.f343025c;
        uj5Var.f387416e = o45.wf.f343024b;
        uj5Var.f387417f = o45.wf.f343027e;
        uj5Var.f387418g = wo.q.f447785f;
        uj5Var.f387419h = com.tencent.mm.sdk.platformtools.m2.d();
        uj5Var.f387420i = i17;
        uj5Var.f387421m = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "reportCgi logId:%d, value:%s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.modelstat.e0(java.lang.System.currentTimeMillis(), uj5Var), false);
    }

    public static void h(boolean z17) {
        if (z17) {
            f71518h = 0L;
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = f71517g;
        if (b4Var.e()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "setToForeground user turn to background run report now");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f71518h = java.lang.System.currentTimeMillis();
        b4Var.c(0L, 0L);
    }
}
