package ni3;

@j95.b
/* loaded from: classes12.dex */
public class g2 extends i95.w {
    public static final long C = java.lang.System.currentTimeMillis();
    public static final /* synthetic */ int D = 0;

    /* renamed from: r, reason: collision with root package name */
    public android.content.BroadcastReceiver f419126r;

    /* renamed from: v, reason: collision with root package name */
    public wu5.b f419130v;

    /* renamed from: w, reason: collision with root package name */
    public ni3.c1 f419131w;

    /* renamed from: d, reason: collision with root package name */
    public final long f419115d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public final long f419116e = 30;

    /* renamed from: f, reason: collision with root package name */
    public final long f419117f = 1536;

    /* renamed from: g, reason: collision with root package name */
    public final long f419118g = 300000;

    /* renamed from: h, reason: collision with root package name */
    public final long f419119h = 1000;

    /* renamed from: i, reason: collision with root package name */
    public final long f419120i = 25000;

    /* renamed from: m, reason: collision with root package name */
    public final long f419121m = 200;

    /* renamed from: n, reason: collision with root package name */
    public final long f419122n = 256;

    /* renamed from: o, reason: collision with root package name */
    public final long f419123o = 1440;

    /* renamed from: p, reason: collision with root package name */
    public long f419124p = 1;

    /* renamed from: q, reason: collision with root package name */
    public final long f419125q = 1440;

    /* renamed from: s, reason: collision with root package name */
    public boolean f419127s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f419128t = true;

    /* renamed from: u, reason: collision with root package name */
    public long f419129u = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f419132x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final wu5.b f419133y = new ni3.v1(this);

    /* renamed from: z, reason: collision with root package name */
    public final wu5.b f419134z = new ni3.w1(this);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ni3.y1(this), true);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 B = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ni3.a2(this), true);

    public static long Ai(ni3.g2 g2Var) {
        g2Var.getClass();
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion getOldestXlogDay failed as sdcard not available");
            return 0L;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.g0());
        if (!r6Var.m() || !r6Var.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion getOldestXlogDay failed as path not exist");
            return 0L;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G == null || G.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion getOldestXlogDay failed as no files");
            return 0L;
        }
        java.util.Arrays.sort(G, new ni3.r1(g2Var));
        long j17 = 0;
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m82467xfb82e301) && m82467xfb82e301.endsWith(".xlog")) {
                j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(m82467xfb82e301.substring(m82467xfb82e301.length() - 13, m82467xfb82e301.length() - 5), 0L);
                if (j17 > 0) {
                    break;
                }
            }
        }
        return j17;
    }

    public static void Bi(ni3.g2 g2Var) {
        g2Var.getClass();
        if (gm0.j1.a()) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_INSTALL_LAST_REPORT_TIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - longValue > 259200000 || longValue > currentTimeMillis) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                ((ku5.t0) ku5.t0.f394148d).h(new ni3.q1(g2Var), "reportVersion");
            }
        }
    }

    public static void Di(ni3.g2 g2Var) {
        android.os.Debug.MemoryInfo memoryInfo;
        g2Var.getClass();
        if (gm0.j1.a()) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MM_LVFETIME_REPORT_PID_INT;
            int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MM_LVFETIME_REPORT_LIFETIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var2, 0L)).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MM_LVFETIME_REPORT_MEMORY_PSS_INT;
            int intValue2 = ((java.lang.Integer) c17.m(u3Var3, 0)).intValue();
            int myPid = android.os.Process.myPid();
            android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getProcessMemoryInfo(new int[]{myPid});
            int totalPss = (processMemoryInfo == null || processMemoryInfo.length <= 0 || (memoryInfo = processMemoryInfo[0]) == null) ? -1 : memoryInfo.getTotalPss();
            long j17 = C;
            if (intValue == 0) {
                c17.x(u3Var, java.lang.Integer.valueOf(myPid));
                c17.x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                c17.x(u3Var3, java.lang.Integer.valueOf(totalPss > 0 ? totalPss : 0));
            } else if (intValue != myPid) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.g(13778, false, false, true, 5, 1, java.lang.Long.valueOf(longValue));
                g0Var.g(13778, false, false, true, 5, 2, java.lang.Integer.valueOf(intValue2));
                c17.x(u3Var, java.lang.Integer.valueOf(myPid));
                long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                int i17 = totalPss > 0 ? totalPss : 0;
                c17.x(u3Var2, java.lang.Long.valueOf(currentTimeMillis));
                c17.x(u3Var3, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportLifeTime lifeTime[%d -> %d]ms,  pss[%d -> %d], pid[%d -> %d]", java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(myPid));
            } else {
                c17.x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                if (totalPss > intValue2) {
                    c17.x(u3Var3, java.lang.Integer.valueOf(totalPss));
                }
            }
            c17.i(true);
            g2Var.A.c(180000L, 180000L);
        }
    }

    public static void Ni(ni3.g2 g2Var) {
        g2Var.getClass();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORT_ECDH_AUTH_TIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - longValue > 86400000 || longValue > currentTimeMillis) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                ((ku5.t0) ku5.t0.f394148d).h(new ni3.u1(g2Var), "reportECDHAuth");
            }
        }
    }

    public static void wi(ni3.g2 g2Var, ni3.c1 c1Var) {
        long j17;
        int i17;
        boolean z17;
        long j18;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93 c17192x850a6c93;
        java.lang.Integer num;
        g2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93 c17192x850a6c932 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93();
        java.lang.Integer num2 = 2;
        c17192x850a6c932.f37894x69b5865 = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1 c17186x90ed54f1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1();
        c17192x850a6c932.f37892x5352c58e = c17186x90ed54f1;
        ni3.e1 e1Var = new ni3.e1("total/temp/acc/");
        java.util.Iterator it = c1Var.f419085i.iterator();
        while (it.hasNext()) {
            ni3.e1 e1Var2 = (ni3.e1) it.next();
            e1Var.f419102b += e1Var2.f419102b;
            e1Var.f419103c += e1Var2.f419103c;
            e1Var.f419104d += e1Var2.f419104d;
            e1Var.f419105e += e1Var2.f419105e;
        }
        java.util.ArrayList arrayList = c1Var.f419085i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo total tempAccDirResult[%d][%s]", java.lang.Integer.valueOf(arrayList.size()), e1Var);
        java.util.ArrayList arrayList2 = c1Var.f419084h;
        java.util.Collections.sort(arrayList2, new ni3.f2(g2Var));
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ni3.d1 d1Var = (ni3.d1) it6.next();
            if (d1Var != null) {
                int i19 = d1Var.f419091b;
                if (i19 > 200) {
                    arrayList3.add(d1Var);
                } else {
                    ni3.d1 d1Var2 = (ni3.d1) hashMap.get(java.lang.Integer.valueOf(i19));
                    if (d1Var2 == null) {
                        hashMap.put(java.lang.Integer.valueOf(i19), d1Var);
                    } else {
                        c17192x850a6c93 = c17192x850a6c932;
                        num = num2;
                        d1Var2.f419094e += d1Var.f419094e;
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(d1Var2.f419090a);
                        stringBuffer.append(", ");
                        stringBuffer.append(d1Var.f419090a);
                        d1Var2.f419090a = stringBuffer.toString();
                        c17192x850a6c932 = c17192x850a6c93;
                        num2 = num;
                    }
                }
            }
            c17192x850a6c93 = c17192x850a6c932;
            num = num2;
            c17192x850a6c932 = c17192x850a6c93;
            num2 = num;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93 c17192x850a6c933 = c17192x850a6c932;
        java.lang.Integer num3 = num2;
        for (ni3.d1 d1Var3 : hashMap.values()) {
            if (d1Var3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.g(13778, false, false, true, 6, java.lang.Integer.valueOf(d1Var3.f419091b), java.lang.Long.valueOf(d1Var3.f419094e), d1Var3.f419090a);
            }
        }
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            ni3.d1 d1Var4 = (ni3.d1) it7.next();
            if (d1Var4 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.g(13778, false, false, true, 6, java.lang.Integer.valueOf(d1Var4.f419091b), java.lang.Long.valueOf(d1Var4.f419094e), d1Var4.f419090a);
            }
        }
        java.lang.String str4 = c1Var.f419080d + ":" + c1Var.f419078b + ":" + c1Var.f419079c + ":" + c1Var.f419081e + ":" + arrayList2.size() + ":" + c1Var.f419082f + ":" + c1Var.f419083g + "|" + arrayList.size() + ":" + e1Var.f419104d + ":" + e1Var.f419102b + ":" + e1Var.f419103c + ":" + e1Var.f419105e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985 c17190x6cc79985 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985();
        c17186x90ed54f1.f37837xfc8c679a = c17190x6cc79985;
        c17190x6cc79985.f37879xd546bf9a = c1Var.f419080d;
        c17190x6cc79985.f37870x4fd0a5cc = c1Var.f419079c;
        c17190x6cc79985.f37871xabda338e = c1Var.f419081e;
        c17190x6cc79985.f37873x87531cf5 = arrayList2.size();
        c17190x6cc79985.f37880xd554a64e = c1Var.f419082f;
        c17190x6cc79985.f37868xb0688dfc = c1Var.f419083g;
        c17190x6cc79985.f37878x87aeb87 = e1Var.f419104d;
        c17190x6cc79985.f37875xdfd9ab88 = arrayList.size();
        c17190x6cc79985.f37874x34150690 = e1Var.f419102b;
        c17190x6cc79985.f37876x8304d1b9 = e1Var.f419103c;
        c17190x6cc79985.f37877xafce1b3b = e1Var.f419105e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.g(13778, false, false, true, 6, 1000, java.lang.Long.valueOf(c17190x6cc79985.f37879xd546bf9a));
        long j38 = (c17190x6cc79985.f37879xd546bf9a / 1024) / 1024;
        if (j38 <= 512) {
            g0Var.mo68477x336bdfd8(1035L, 1L, 1L, false);
        } else if (j38 <= 1024) {
            g0Var.mo68477x336bdfd8(1035L, 2L, 1L, false);
        } else if (j38 <= 2048) {
            g0Var.mo68477x336bdfd8(1035L, 3L, 1L, false);
        } else if (j38 <= 4096) {
            g0Var.mo68477x336bdfd8(1035L, 4L, 1L, false);
        } else if (j38 <= 8192) {
            g0Var.mo68477x336bdfd8(1035L, 5L, 1L, false);
        } else if (j38 <= 16384) {
            g0Var.mo68477x336bdfd8(1035L, 6L, 1L, false);
        } else if (j38 <= 32768) {
            g0Var.mo68477x336bdfd8(1035L, 7L, 1L, false);
        } else {
            g0Var.mo68477x336bdfd8(1035L, 8L, 1L, false);
        }
        g0Var.mo68477x336bdfd8(1035L, 100L, j38, false);
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b> linkedList = new java.util.LinkedList<>();
        c17190x6cc79985.f37872x5ba6a154 = linkedList;
        java.util.Iterator it8 = arrayList2.iterator();
        java.lang.String str5 = str4;
        while (it8.hasNext()) {
            ni3.d1 d1Var5 = (ni3.d1) it8.next();
            str5 = str5 + "|" + d1Var5.f419091b + ":" + d1Var5.f419094e + ":" + d1Var5.f419092c + ":" + d1Var5.f419093d + ":" + d1Var5.f419095f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b c17187x82077c9b = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b();
            linkedList.add(c17187x82077c9b);
            int i27 = d1Var5.f419091b;
            c17187x82077c9b.f37841x363405 = i27;
            c17187x82077c9b.f37842xd546bf9a = d1Var5.f419094e;
            c17187x82077c9b.f37838x8d44e41d = d1Var5.f419092c;
            long j39 = d1Var5.f419093d;
            c17187x82077c9b.f37839x4fd0a5cc = j39;
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b> linkedList2 = linkedList;
            java.util.Iterator it9 = it8;
            c17187x82077c9b.f37840x58b2af1 = d1Var5.f419095f;
            if (i27 == 6 && j39 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(857L, 16L, 1L);
            }
            linkedList = linkedList2;
            it8 = it9;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo wechatResult[%d][%s]", java.lang.Integer.valueOf(str5.length()), str5);
        java.lang.String path = fp.m.b().getPath();
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o7.c();
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o7.a(lp0.b.Y());
        android.os.StatFs statFs = new android.os.StatFs(path);
        long blockSize = statFs.getBlockSize();
        long blockCount = statFs.getBlockCount();
        long availableBlocks = statFs.getAvailableBlocks();
        long j47 = blockSize * blockCount;
        long j48 = blockSize * availableBlocks;
        if (blockCount > 0) {
            j17 = availableBlocks;
            i17 = java.lang.Math.round((((float) availableBlocks) * 100.0f) / ((float) blockCount));
        } else {
            j17 = availableBlocks;
            i17 = -1;
        }
        int i28 = i17;
        boolean equals = lp0.b.Y().equals(path);
        if (equals) {
            z17 = equals;
            j18 = blockSize;
            str = a17;
            str2 = str5;
            str3 = path;
            i18 = i28;
            j19 = blockCount;
            j27 = j48;
            j28 = j47;
            j29 = j17;
            j37 = j18;
        } else {
            z17 = equals;
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.Y());
            j18 = blockSize;
            long blockSize2 = statFs2.getBlockSize();
            str = a17;
            long blockCount2 = statFs2.getBlockCount();
            str2 = str5;
            str3 = path;
            long availableBlocks2 = statFs2.getAvailableBlocks();
            long j49 = blockSize2 * blockCount2;
            long j57 = blockSize2 * availableBlocks2;
            if (blockCount2 > 0) {
                j37 = blockSize2;
                j29 = availableBlocks2;
                j28 = j49;
                i18 = java.lang.Math.round((((float) availableBlocks2) * 100.0f) / ((float) blockCount2));
            } else {
                j37 = blockSize2;
                j29 = availableBlocks2;
                j28 = j49;
                i18 = i28;
            }
            j27 = j48;
            j48 = j57;
            j19 = blockCount2;
        }
        int round = java.lang.Math.round((((float) c1Var.f419080d) * 100.0f) / ((float) j28));
        long j58 = j28;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("storage_heavy_user_wechat_total_size", c1Var.f419080d);
        c17186x90ed54f1.f37836x66a8d348 = round;
        long j59 = c1Var.f419080d;
        long j66 = 1024 * g2Var.f419115d * 1024;
        long j67 = j17;
        long j68 = j19;
        boolean z18 = z17;
        long j69 = j48;
        long j76 = j37;
        long j77 = j18;
        int i29 = i18;
        java.lang.String str6 = str;
        g2Var.Zi(1, j59, j66);
        c17186x90ed54f1.f37834x6dce2fd9 = c1Var.f419080d > j66 ? 1 : 0;
        long j78 = round;
        g2Var.Zi(2, j78, g2Var.f419116e);
        c17186x90ed54f1.f37826x1876f063 = j78 > g2Var.f419116e ? 1 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(round);
        sb6.append(";");
        sb6.append(z18 ? 1 : 0);
        sb6.append(";");
        sb6.append(c17 ? 1 : 0);
        sb6.append(";");
        sb6.append(j76);
        sb6.append(":");
        sb6.append(j68);
        sb6.append(":");
        long j79 = j29;
        sb6.append(j79);
        sb6.append(":");
        sb6.append(j58);
        sb6.append(":");
        sb6.append(j69);
        sb6.append(":");
        sb6.append(i29);
        sb6.append("|");
        sb6.append(j77);
        sb6.append(":");
        sb6.append(blockCount);
        sb6.append(":");
        sb6.append(j67);
        sb6.append(":");
        sb6.append(j47);
        sb6.append(":");
        long j86 = j27;
        sb6.append(j86);
        sb6.append(":");
        sb6.append(i28);
        sb6.append(";");
        sb6.append(str3);
        sb6.append(";");
        sb6.append(lp0.b.Y());
        sb6.append(";");
        sb6.append(str6);
        java.lang.String sb7 = sb6.toString();
        c17186x90ed54f1.f37832xa58f64c4 = j76;
        c17186x90ed54f1.f37831xf16215aa = j68;
        c17186x90ed54f1.f37828xa7cf56a7 = j79;
        c17186x90ed54f1.f37833x2ed4e86d = j58;
        c17186x90ed54f1.f37830xa6bd8288 = j69;
        c17186x90ed54f1.f37829x15e3a798 = i29;
        c17186x90ed54f1.f37821x810d9e36 = j77;
        c17186x90ed54f1.f37820x85ab0a78 = blockCount;
        c17186x90ed54f1.f37817xf771e999 = j67;
        c17186x90ed54f1.f37823xa5321df = j47;
        c17186x90ed54f1.f37819xbcbdb2fa = j86;
        c17186x90ed54f1.f37818xbbc2a0e6 = i28;
        java.lang.String str7 = str3;
        c17186x90ed54f1.f37822xb0eea775 = str7;
        c17186x90ed54f1.f37827x67a9bbd = lp0.b.Y();
        c17186x90ed54f1.f37824x5f624cca = str6;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.g(13778, false, false, true, num3, 3, str7);
        g0Var2.g(13778, false, false, true, num3, 4, lp0.b.Y());
        g0Var2.g(13778, false, false, true, num3, 5, java.lang.Integer.valueOf(z18 ? 1 : 0));
        g0Var2.g(13778, false, false, true, num3, 6, java.lang.Integer.valueOf(c17 ? 1 : 0));
        g0Var2.g(13778, false, false, true, num3, 7, str6);
        g0Var2.g(13778, false, false, true, num3, 8, java.lang.Long.valueOf(c17186x90ed54f1.f37833x2ed4e86d));
        g0Var2.g(13778, false, false, true, num3, 9, java.lang.Long.valueOf(c17186x90ed54f1.f37830xa6bd8288));
        g0Var2.g(13778, false, false, true, num3, 10, java.lang.Integer.valueOf(c17186x90ed54f1.f37829x15e3a798));
        g0Var2.g(13778, false, false, true, 6, 1001, java.lang.Integer.valueOf(round));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo phoneResult[%d][%s]", java.lang.Integer.valueOf(sb7.length()), sb7);
        java.lang.String str8 = str2 + ";" + sb7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo totalResult[%d][%s]", java.lang.Integer.valueOf(str8.length()), str8);
        g0Var2.mo68477x336bdfd8(418L, 5L, 1L, true);
        g0Var2.g(13778, false, false, true, num3, 1, str8);
        g0Var2.I(14375, c17192x850a6c933, false, false);
    }

    public final boolean Ri(java.util.HashMap hashMap, java.util.Map map, java.lang.String str, int i17) {
        java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(str);
        if (linkedList == null) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            map.put((java.lang.String) it.next(), java.lang.Integer.valueOf(i17));
        }
        return true;
    }

    public final boolean Ui(java.lang.String str) {
        gm0.j1.i();
        return gm0.j1.u().d().equals(str + "/");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0957 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0977 A[Catch: all -> 0x129a, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0989 A[Catch: JSONException -> 0x09fe, all -> 0x129a, TRY_LEAVE, TryCatch #5 {JSONException -> 0x09fe, blocks: (B:109:0x097d, B:110:0x0983, B:112:0x0989), top: B:108:0x097d, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0a22 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0aae A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0b19 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0b84 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0bef A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0c5a A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0cc5 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0d30 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0d99 A[Catch: all -> 0x129a, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0dab A[Catch: JSONException -> 0x0e20, all -> 0x129a, TRY_LEAVE, TryCatch #7 {JSONException -> 0x0e20, blocks: (B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab), top: B:147:0x0d9f, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0e4a A[Catch: all -> 0x129a, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0e5c A[Catch: JSONException -> 0x0ed1, all -> 0x129a, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0ed1, blocks: (B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c), top: B:162:0x0e50, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0efd A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0f68 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0fd3 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x103e A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x10a9 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x119c A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x11d0 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1203 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1236 A[Catch: all -> 0x129a, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x126a A[Catch: all -> 0x129a, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0020, B:6:0x003f, B:9:0x0065, B:13:0x0109, B:18:0x011e, B:23:0x0137, B:28:0x014c, B:33:0x0167, B:38:0x0184, B:39:0x0191, B:45:0x0232, B:50:0x025c, B:54:0x0283, B:59:0x02af, B:63:0x02ba, B:67:0x02c5, B:71:0x0309, B:77:0x0366, B:78:0x037f, B:89:0x054c, B:93:0x0669, B:96:0x08d8, B:99:0x090d, B:101:0x0957, B:103:0x095b, B:104:0x0969, B:106:0x0977, B:109:0x097d, B:110:0x0983, B:112:0x0989, B:118:0x0a00, B:121:0x0a22, B:122:0x0aa1, B:124:0x0aae, B:125:0x0b09, B:127:0x0b19, B:128:0x0b74, B:130:0x0b84, B:131:0x0bdf, B:133:0x0bef, B:134:0x0c4a, B:136:0x0c5a, B:137:0x0cb5, B:139:0x0cc5, B:140:0x0d20, B:142:0x0d30, B:143:0x0d8b, B:145:0x0d99, B:148:0x0d9f, B:149:0x0da5, B:151:0x0dab, B:157:0x0e22, B:158:0x0e3c, B:160:0x0e4a, B:163:0x0e50, B:164:0x0e56, B:166:0x0e5c, B:172:0x0ed3, B:173:0x0eed, B:175:0x0efd, B:176:0x0f58, B:178:0x0f68, B:179:0x0fc3, B:181:0x0fd3, B:182:0x102e, B:184:0x103e, B:185:0x1099, B:187:0x10a9, B:188:0x1104, B:198:0x1161, B:200:0x119c, B:203:0x11d0, B:206:0x1203, B:209:0x1236, B:212:0x126a, B:225:0x0647, B:231:0x052b), top: B:3:0x0020, inners: #0, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0629 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x090a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void Vi() {
        /*
            Method dump skipped, instructions count: 4766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni3.g2.Vi():void");
    }

    public final synchronized void Zi(int i17, long j17, long j18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var;
        boolean z17 = j17 > j18;
        long j19 = z17 ? this.f419132x | i17 : this.f419132x & (~i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser type[%d] value[%d] limit[%d] heavy[%b] mHeavyUser[%d] newHeavyUser[%d] tid[%s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(this.f419132x), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        long j27 = this.f419132x;
        if (j19 != j27) {
            if (j27 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, 1L, 1L, true);
            }
            if (j19 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, 2L, 1L, true);
            }
        }
        if (i17 == 1) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_SIZE_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 3L : 4L, 1L, true);
        } else if (i17 == 2) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_RATIO_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 5L : 6L, 1L, true);
        } else if (i17 == 4) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_SIZE_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 7L : 8L, 1L, true);
        } else if (i17 == 8) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_MESSAGE_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 9L : 10L, 1L, true);
        } else if (i17 == 16) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONVERSATION_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 11L : 12L, 1L, true);
        } else if (i17 == 32) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONTACT_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 13L : 14L, 1L, true);
        } else if (i17 == 64) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CHATROOM_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 15L : 16L, 1L, true);
        } else if (i17 != 128) {
            u3Var = null;
        } else {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_FAV_DB_SIZE_LONG;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, z17 ? 19L : 20L, 1L, true);
        }
        this.f419132x = j19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.l(j19 != 0);
        ((ku5.t0) ku5.t0.f394148d).g(new ni3.t1(this, j19, u3Var, j17));
    }

    public final ni3.c1 aj(com.p314xaae8f345.mm.vfs.r6 r6Var, ni3.c1 c1Var, ni3.d1 d1Var, ni3.e1 e1Var, java.util.Map map, boolean z17, int i17) {
        ni3.d1 d1Var2 = d1Var;
        ni3.e1 e1Var2 = e1Var;
        if (c1Var.f419086j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summclean scanFile been canceled fileResult[%s], subDirResult[%s]", c1Var, d1Var);
            return c1Var;
        }
        int i18 = c1Var.f419083g;
        if (i18 < i17) {
            c1Var.f419083g = i18 + 1;
        }
        if (r6Var.y()) {
            java.lang.String o17 = r6Var.o();
            if (d1Var2 == null) {
                if (map == null || map.size() <= 0 || map.get(o17) == null) {
                    if (lp0.b.D().equals(r6Var.r() + "/") && !Ui(o17)) {
                        d1Var2 = java.util.regex.Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", r6Var.m82467xfb82e301()) ? new ni3.d1(o17, 202) : java.util.regex.Pattern.matches("[a-fA-F0-9]{32}", r6Var.m82467xfb82e301()) ? new ni3.d1(o17, 201) : new ni3.d1(o17, 203);
                    } else if (Ui(r6Var.r())) {
                        d1Var2 = new ni3.d1(o17, 203);
                    }
                } else {
                    d1Var2 = new ni3.d1(o17, ((java.lang.Integer) map.get(o17)).intValue());
                    map.remove(o17);
                }
                if (d1Var2 != null) {
                    c1Var.f419084h.add(d1Var2);
                }
            }
            ni3.d1 d1Var3 = d1Var2;
            c1Var.f419078b++;
            if (d1Var3 != null) {
                d1Var3.f419092c++;
            }
            if (e1Var2 != null) {
                e1Var2.f419102b++;
            }
            if (i17 > 15) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile been stopped as depth[%d] over limit path[%s], fileResult[%s]", java.lang.Integer.valueOf(i17), r6Var.o(), c1Var);
                return c1Var;
            }
            java.lang.String[] D2 = r6Var.D();
            if (D2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile dir is empty[%s] ret", r6Var.o());
                return c1Var;
            }
            if (z17) {
                int i19 = 0;
                for (int length = D2.length; i19 < length; length = length) {
                    java.lang.String str = D2[i19];
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && java.util.regex.Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", str)) {
                        ni3.e1 e1Var3 = new ni3.e1(r6Var.o() + "/" + str);
                        c1Var.f419085i.add(e1Var3);
                        e1Var2 = e1Var3;
                    }
                    aj(new com.p314xaae8f345.mm.vfs.r6(r6Var.u() + "/" + str), c1Var, d1Var3, e1Var2, map, false, i17 + 1);
                    i19++;
                    D2 = D2;
                }
            } else {
                for (java.lang.String str2 : D2) {
                    aj(new com.p314xaae8f345.mm.vfs.r6(r6Var.o() + "/" + str2), c1Var, d1Var3, e1Var, map, false, i17 + 1);
                }
            }
        } else {
            c1Var.f419079c++;
            if (d1Var2 != null) {
                d1Var2.f419093d++;
            }
            if (e1Var2 != null) {
                e1Var2.f419103c++;
            }
            if (!r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile file not exist[%s][%d] ret", r6Var.o(), java.lang.Long.valueOf(c1Var.f419079c));
                return c1Var;
            }
            long C2 = r6Var.C();
            if (C2 <= 0 || C2 >= 2147483648L) {
                c1Var.f419081e++;
                if (d1Var2 != null) {
                    d1Var2.f419095f++;
                }
                if (e1Var2 != null) {
                    e1Var2.f419105e++;
                }
            } else {
                c1Var.f419080d += C2;
                if (d1Var2 != null) {
                    d1Var2.f419094e += C2;
                }
                if (e1Var2 != null) {
                    e1Var2.f419104d += C2;
                }
            }
        }
        return c1Var;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f419115d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f419116e);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f419117f);
        java.lang.Long valueOf4 = java.lang.Long.valueOf(this.f419122n);
        java.lang.Long valueOf5 = java.lang.Long.valueOf(this.f419118g);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(this.f419119h);
        java.lang.Long valueOf7 = java.lang.Long.valueOf(this.f419120i);
        java.lang.Long valueOf8 = java.lang.Long.valueOf(this.f419121m);
        long j17 = this.f419123o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "HeavyUserCfg sd[%d] sdr[%d] db[%d] fdbsize[%d] msg[%d] conv[%d] contact[%d] chatroom[%d] sditv[%d] sdwait[%d] dbitv[%d]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f419124p), java.lang.Long.valueOf(this.f419125q));
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L)).longValue();
        this.f419132x = longValue;
        z65.c.f551993f = longValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.l(longValue != 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountPostReset heavyuser[%d]", java.lang.Long.valueOf(this.f419132x));
        gm0.j1.i();
        this.f419129u = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECHAT_FILE_SCAN_LAST_TIME_LONG, 0L)).longValue();
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent registerReceiver = context2.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f419127s = intExtra == 2 || intExtra == 5;
        } else {
            this.f419127s = false;
        }
        this.f419128t = ((android.os.PowerManager) context2.getSystemService("power")).isScreenOn();
        this.f419126r = new ni3.d2(this);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        context2.registerReceiver(this.f419126r, intentFilter);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = this.f419131w != null ? "enabled" : "disabled";
        objArr[1] = this.f419128t ? "" : " not";
        objArr[2] = this.f419127s ? "" : " not";
        objArr[3] = java.lang.Long.valueOf(this.f419129u);
        objArr[4] = java.lang.Long.valueOf(j17 * 60000);
        objArr[5] = java.lang.Long.valueOf(this.f419124p * 60000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv registerReceiver auto scan %s. Device status:%s interactive,%s charging mLastAutoScanTime[%d], mAutoScanInterval[%d], mAutoScanWaitTime[%d].", objArr);
        this.A.d();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountRelease [%d]", java.lang.Long.valueOf(C), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        android.content.BroadcastReceiver broadcastReceiver = this.f419126r;
        if (broadcastReceiver != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver mChargeAndInteractiveReceiver[%s]", this.f419126r);
            this.f419126r = null;
        }
        wu5.b bVar = this.f419130v;
        if (bVar != null) {
            bVar.b();
            this.f419130v = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver remove[%s]", this.f419131w);
        }
        ni3.c1 c1Var = this.f419131w;
        if (c1Var != null) {
            c1Var.f419086j = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver canceled[%s]", c1Var);
            this.f419131w = null;
        }
    }
}
