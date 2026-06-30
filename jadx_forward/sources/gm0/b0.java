package gm0;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f354680t;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.j3 f354681a;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f354683c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354685e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.n3 f354687g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.la f354688h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.cb f354689i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f354690j;

    /* renamed from: m, reason: collision with root package name */
    public long f354693m;

    /* renamed from: n, reason: collision with root package name */
    public long f354694n;

    /* renamed from: o, reason: collision with root package name */
    public long f354695o;

    /* renamed from: b, reason: collision with root package name */
    public final gm0.l0 f354682b = new gm0.l0();

    /* renamed from: f, reason: collision with root package name */
    public l75.k0 f354686f = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f354691k = false;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f354692l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public long f354696p = 0;

    /* renamed from: q, reason: collision with root package name */
    public volatile java.lang.Boolean f354697q = null;

    /* renamed from: r, reason: collision with root package name */
    public final gm0.k0 f354698r = new gm0.k0(this, null);

    /* renamed from: s, reason: collision with root package name */
    public long f354699s = 0;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f354680t = hashMap;
        hashMap.put(-518839183, new gm0.i0());
        hashMap.put(-584410477, new gm0.j0());
    }

    public b0() {
        this.f354693m = -1L;
        this.f354694n = -1L;
        this.f354695o = -1L;
        ((ku5.t0) ku5.t0.f394148d).q(new gm0.RunnableC28423x57b5d13());
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.j3(str + "systemInfo.cfg");
        java.lang.String str2 = (java.lang.String) j3Var.a(258);
        if (str2 != null) {
            wo.p a17 = wo.p.a();
            java.lang.String str3 = a17.f529305a.get(258);
            if (!((java.lang.String) (str3 == null ? "" : str3)).equals(str2)) {
                a17.b(258, str2);
            }
        }
        try {
            android.os.StatFs statFs = new android.os.StatFs(fp.m.a().getPath());
            this.f354694n = statFs.getBlockSizeLong();
            this.f354693m = statFs.getBlockCountLong();
            this.f354695o = statFs.getAvailableBlocksLong();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "CheckData path[%s] blocksize:%s blockcount:%s availcount:%s", fp.m.a().getAbsolutePath(), java.lang.Long.valueOf(this.f354694n), java.lang.Long.valueOf(this.f354693m), java.lang.Long.valueOf(this.f354695o));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreStorage", "check data size failed :%s", e17.getMessage());
        }
        this.f354681a = j3Var;
        gm0.l lVar = gm0.m.f354766v;
        synchronized (lVar) {
            lVar.f354763c = j3Var;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        java.io.File file2 = new java.io.File(lp0.b.e0());
        boolean b17 = fp.i.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "summer buildSysPath sysPath[" + str4 + "] SDCARD_ROOT[" + lp0.b.e0() + "] file.exists:" + file2.exists() + " CUtil.isSDCardAvail():" + b17);
        java.lang.String D = lp0.b.D();
        java.io.File file3 = new java.io.File(D);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "summer buildSysPath ret sysPath: " + D);
        this.f354683c = D;
    }

    public static java.lang.String e(int i17) {
        return kk.k.g(("mm" + i17).getBytes());
    }

    public static java.lang.String i(int i17) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + kk.k.g(("mm" + i17).getBytes()) + '/';
    }

    public static byte[] n(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        long C = r6Var.C();
        if (C != 4096 && C != 4112) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreStorage", "Invalid length of account file %s: %d", r6Var, java.lang.Long.valueOf(C));
            return null;
        }
        try {
            java.io.InputStream C2 = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
            try {
                byte[] bArr = new byte[4096];
                int i17 = 0;
                do {
                    int read = C2.read(bArr, i17, 4096 - i17);
                    if (read < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreStorage", "Early EOF of account file %s: %d", r6Var, java.lang.Integer.valueOf(i17));
                        C2.close();
                        return null;
                    }
                    i17 += read;
                } while (i17 < 4096);
                if (C > 4096) {
                    byte[] bArr2 = new byte[16];
                    int i18 = 0;
                    do {
                        int read2 = C2.read(bArr2, i18, 16 - i18);
                        if (read2 < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreStorage", "Early EOF of account file %s: %d", r6Var, java.lang.Integer.valueOf(i18));
                            C2.close();
                            return null;
                        }
                        i18 += read2;
                    } while (i18 < 16);
                    if (!java.util.Arrays.equals(bArr2, kk.k.h(bArr))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreStorage", "Failed account file checksum: %s", r6Var);
                        C2.close();
                        return null;
                    }
                }
                C2.close();
                return bArr;
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMKernel.CoreStorage", e17, "Cannot read account file %s", r6Var);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[LOOP:0: B:2:0x0002->B:9:0x0059, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(com.p314xaae8f345.mm.vfs.r6 r7, byte[] r8) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 3
            if (r1 >= r2) goto L5c
            java.lang.String r2 = "Write account file "
            int r3 = r8.length
            r4 = 1
            r5 = 4096(0x1000, float:5.74E-42)
            java.lang.String r6 = "MMKernel.CoreStorage"
            if (r3 == r5) goto L16
            java.lang.String r2 = "Wrong length of data."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r2)
        L14:
            r2 = r0
            goto L56
        L16:
            com.tencent.mm.vfs.r6 r3 = r7.s()
            r3.J()
            java.io.OutputStream r3 = com.p314xaae8f345.mm.vfs.w6.H(r7)     // Catch: java.io.IOException -> L4b
            r3.write(r8)     // Catch: java.lang.Throwable -> L3f
            byte[] r5 = kk.k.h(r8)     // Catch: java.lang.Throwable -> L3f
            r3.write(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r5.append(r7)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L3f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2)     // Catch: java.lang.Throwable -> L3f
            r3.close()     // Catch: java.io.IOException -> L4b
            r2 = r4
            goto L56
        L3f:
            r2 = move-exception
            if (r3 == 0) goto L4a
            r3.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L4b
        L4a:
            throw r2     // Catch: java.io.IOException -> L4b
        L4b:
            r2 = move-exception
            java.lang.String r3 = "Cannot write to account file %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r2, r3, r5)
            goto L14
        L56:
            if (r2 == 0) goto L59
            return r4
        L59:
            int r1 = r1 + 1
            goto L2
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gm0.b0.o(com.tencent.mm.vfs.r6, byte[]):boolean");
    }

    public boolean a() {
        java.lang.Object obj = com.p314xaae8f345.mm.vfs.a3.f294314a.c().get("accountOtherList");
        if ((obj instanceof java.lang.String ? new java.lang.String[]{(java.lang.String) obj} : obj instanceof java.lang.String[] ? (java.lang.String[]) obj : null) == null) {
            return false;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("C2CErrorToBeRescued", true);
    }

    public boolean b(l75.k0 k0Var, java.util.HashMap hashMap, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.cb cbVar;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p2621x8fb0427b.bb bbVar;
        long j17;
        long j18;
        long j19;
        long j27;
        java.lang.String str2;
        boolean z18;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(hashMap == null ? -1 : hashMap.size());
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "createtables %d %s", objArr);
        x51.n1 n1Var = x51.n1.f533571b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && x51.n1.f533572c.compareAndSet(true, false)) {
            n1Var.f533573a = k0Var;
            java.lang.String[] strArr = {"finder_img_info_table", "findervideoinfo"};
            java.lang.String[] strArr2 = {"ImgInfo2", "videoinfo2"};
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    try {
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", "[execute] cost=%sms imgInfoCount=%s videoInfoCount=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(n1Var.c(n1Var.f533573a)), java.lang.Integer.valueOf(n1Var.d(n1Var.f533573a)));
                        }
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        try {
                            android.database.Cursor o17 = gm0.j1.u().f354686f.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT type,name,tbl_name,sql FROM sqlite_master", null, null, null);
                            while (!o17.isAfterLast()) {
                                try {
                                    java.lang.String string = o17.getString(0);
                                    java.lang.String string2 = o17.getString(1);
                                    java.lang.String string3 = o17.getString(2);
                                    java.lang.String string4 = o17.getString(3);
                                    if (string.equalsIgnoreCase(ya.b.f77479x42930b2)) {
                                        if (!string2.startsWith("sqlite_") && !string2.equals(string3) && !string2.startsWith(string3)) {
                                            for (int i17 = 0; i17 < 2; i17++) {
                                                if (string3.equalsIgnoreCase(strArr[i17])) {
                                                    z18 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z18 = false;
                                        if (z18) {
                                            hashMap2.put(string2, new x51.m1(n1Var, string3, string4));
                                        }
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
                                    o17.moveToNext();
                                } finally {
                                }
                            }
                            o17.close();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TableIndexFixer", "%s", e17);
                            jx3.f fVar = jx3.f.INSTANCE;
                            fVar.mo68477x336bdfd8(1457L, 1L, 1L, true);
                            fVar.d(20708, "1", 1, e17.getMessage());
                        }
                        java.util.Iterator it6 = hashMap2.entrySet().iterator();
                        long j28 = 0;
                        long j29 = 0;
                        while (it6.hasNext()) {
                            try {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                                java.lang.String str3 = ((x51.m1) entry.getValue()).f533568a;
                                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                java.util.Iterator it7 = it6;
                                if (n1Var.b(n1Var.f533573a, (java.lang.String) entry.getKey(), str3)) {
                                    long uptimeMillis2 = j28 + (android.os.SystemClock.uptimeMillis() - uptimeMillis);
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= 2) {
                                            str2 = "";
                                            break;
                                        }
                                        try {
                                            try {
                                                if (strArr[i18].equalsIgnoreCase(str3)) {
                                                    str2 = strArr2[i18];
                                                    break;
                                                }
                                                i18++;
                                            } catch (java.lang.Throwable th6) {
                                                th = th6;
                                                j28 = uptimeMillis2;
                                                j27 = j29;
                                                j19 = j28;
                                                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                                java.lang.String format = java.lang.String.format("[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", format);
                                                jx3.f fVar2 = jx3.f.INSTANCE;
                                                fVar2.mo68477x336bdfd8(1457L, 10L, currentTimeMillis2, false);
                                                fVar2.mo68477x336bdfd8(1457L, 12L, j19, false);
                                                fVar2.mo68477x336bdfd8(1457L, 13L, j27, false);
                                                fVar2.mo68477x336bdfd8(1457L, 11L, 1L, false);
                                                fVar2.d(20708, "1", 10, format);
                                                throw th;
                                            }
                                        } catch (java.lang.Exception e18) {
                                            e = e18;
                                            j17 = j29;
                                            j18 = uptimeMillis2;
                                            try {
                                                jx3.f fVar3 = jx3.f.INSTANCE;
                                                fVar3.mo68477x336bdfd8(1457L, 2L, 1L, true);
                                                fVar3.d(20708, "1", 2, e.getMessage());
                                                long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                                java.lang.String format2 = java.lang.String.format("[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms", java.lang.Long.valueOf(currentTimeMillis3), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", format2);
                                                fVar3.mo68477x336bdfd8(1457L, 10L, currentTimeMillis3, false);
                                                fVar3.mo68477x336bdfd8(1457L, 12L, j18, false);
                                                fVar3.mo68477x336bdfd8(1457L, 13L, j17, false);
                                                fVar3.mo68477x336bdfd8(1457L, 11L, 1L, false);
                                                fVar3.d(20708, "1", 10, format2);
                                                fp.j jVar = new fp.j();
                                                if (hashMap != null) {
                                                }
                                                return true;
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                long j37 = j17;
                                                j28 = j18;
                                                j29 = j37;
                                                j27 = j29;
                                                j19 = j28;
                                                long currentTimeMillis22 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                                java.lang.String format3 = java.lang.String.format("[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms", java.lang.Long.valueOf(currentTimeMillis22), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", format3);
                                                jx3.f fVar22 = jx3.f.INSTANCE;
                                                fVar22.mo68477x336bdfd8(1457L, 10L, currentTimeMillis22, false);
                                                fVar22.mo68477x336bdfd8(1457L, 12L, j19, false);
                                                fVar22.mo68477x336bdfd8(1457L, 13L, j27, false);
                                                fVar22.mo68477x336bdfd8(1457L, 11L, 1L, false);
                                                fVar22.d(20708, "1", 10, format3);
                                                throw th;
                                            }
                                        }
                                    }
                                    long uptimeMillis3 = android.os.SystemClock.uptimeMillis();
                                    if (n1Var.a(n1Var.f533573a, str2, str3, ((x51.m1) entry.getValue()).f533569b)) {
                                        j29 += android.os.SystemClock.uptimeMillis() - uptimeMillis3;
                                        try {
                                            jx3.f.INSTANCE.mo68477x336bdfd8(1457L, 4L, 1L, true);
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                            j28 = uptimeMillis2;
                                            j27 = j29;
                                            j19 = j28;
                                            long currentTimeMillis222 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                            java.lang.String format32 = java.lang.String.format("[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms", java.lang.Long.valueOf(currentTimeMillis222), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", format32);
                                            jx3.f fVar222 = jx3.f.INSTANCE;
                                            fVar222.mo68477x336bdfd8(1457L, 10L, currentTimeMillis222, false);
                                            fVar222.mo68477x336bdfd8(1457L, 12L, j19, false);
                                            fVar222.mo68477x336bdfd8(1457L, 13L, j27, false);
                                            fVar222.mo68477x336bdfd8(1457L, 11L, 1L, false);
                                            fVar222.d(20708, "1", 10, format32);
                                            throw th;
                                        }
                                    }
                                    j28 = uptimeMillis2;
                                }
                                it6 = it7;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                long j38 = j28;
                                j17 = j29;
                                j18 = j38;
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        }
                        if (hashMap2.size() > 0) {
                            jx3.f fVar4 = jx3.f.INSTANCE;
                            fVar4.mo68477x336bdfd8(1457L, 3L, 1L, true);
                            fVar4.d(20708, "1", 3, 1);
                        }
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        java.lang.String format4 = java.lang.String.format("[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms", java.lang.Long.valueOf(currentTimeMillis4), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", format4);
                        jx3.f fVar5 = jx3.f.INSTANCE;
                        fVar5.mo68477x336bdfd8(1457L, 10L, currentTimeMillis4, false);
                        fVar5.mo68477x336bdfd8(1457L, 12L, j28, false);
                        fVar5.mo68477x336bdfd8(1457L, 13L, j29, false);
                        fVar5.mo68477x336bdfd8(1457L, 11L, 1L, false);
                        fVar5.d(20708, "1", 10, format4);
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        j19 = 0;
                        j27 = 0;
                        long currentTimeMillis2222 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        java.lang.String format322 = java.lang.String.format("[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms", java.lang.Long.valueOf(currentTimeMillis2222), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TableIndexFixer", format322);
                        jx3.f fVar2222 = jx3.f.INSTANCE;
                        fVar2222.mo68477x336bdfd8(1457L, 10L, currentTimeMillis2222, false);
                        fVar2222.mo68477x336bdfd8(1457L, 12L, j19, false);
                        fVar2222.mo68477x336bdfd8(1457L, 13L, j27, false);
                        fVar2222.mo68477x336bdfd8(1457L, 11L, 1L, false);
                        fVar2222.d(20708, "1", 10, format322);
                        throw th;
                    }
                } catch (java.lang.Exception e27) {
                    e = e27;
                    j17 = 0;
                    j18 = 0;
                }
            }
        }
        fp.j jVar2 = new fp.j();
        if (hashMap != null || hashMap.size() <= 0) {
            return true;
        }
        java.util.Iterator it8 = hashMap.entrySet().iterator();
        int i19 = 0;
        while (it8.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it8.next();
            java.lang.Integer num = (java.lang.Integer) entry2.getKey();
            d95.c0 c0Var = (d95.c0) entry2.getValue();
            if (c0Var.a() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreStorage", "factory.getSQLs() is null! %s, %s", num, c0Var);
            } else {
                java.lang.String str4 = null;
                if (z17 || this.f354691k) {
                    str = null;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (java.lang.String str5 : c0Var.a()) {
                        sb6.append(str5.hashCode());
                    }
                    str = kk.k.g(sb6.toString().getBytes());
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f354690j;
                    if (concurrentHashMap == null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.cb cbVar2 = this.f354689i;
                        if (cbVar2 != null) {
                            int intValue = num.intValue();
                            cbVar2.getClass();
                            android.database.Cursor m145256x1d3f4980 = cbVar2.m145256x1d3f4980("select * from TablesVersion where tableHash = " + intValue, new java.lang.String[0]);
                            if (m145256x1d3f4980 != null) {
                                if (m145256x1d3f4980.moveToFirst()) {
                                    bbVar = new com.p314xaae8f345.mm.p2621x8fb0427b.bb();
                                    bbVar.mo9015xbf5d97fd(m145256x1d3f4980);
                                } else {
                                    bbVar = null;
                                }
                                m145256x1d3f4980.close();
                            } else {
                                bbVar = null;
                            }
                            if (str.equals(bbVar == null ? null : bbVar.f66805x79766299)) {
                            }
                        }
                    } else if (str.equals((java.lang.String) concurrentHashMap.get(num))) {
                    }
                }
                k0Var.b();
                java.lang.String[] a17 = c0Var.a();
                int length = a17.length;
                int i27 = i19;
                int i28 = 0;
                while (i28 < length) {
                    java.lang.String str6 = a17[i28];
                    try {
                        k0Var.A(str4, str6);
                        i27++;
                        it = it8;
                    } catch (java.lang.Exception e28) {
                        it = it8;
                        if (d95.a.f309124h.matcher(str6).matches()) {
                            iz5.a.g("CreateTable failed:[" + str6 + "][" + e28.getMessage() + "]", false);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreStorage", "CreateTable failed:[" + str6 + "][" + e28.getMessage() + "]");
                        }
                    }
                    i28++;
                    it8 = it;
                    str4 = null;
                }
                java.util.Iterator it9 = it8;
                k0Var.t();
                if (!z17 && !this.f354691k && (cbVar = this.f354689i) != null && str != null) {
                    int intValue2 = num.intValue();
                    cbVar.getClass();
                    iz5.a.g(null, intValue2 != 0);
                    iz5.a.d(null, str);
                    com.p314xaae8f345.mm.p2621x8fb0427b.bb bbVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.bb();
                    bbVar2.f66804x241204f7 = intValue2;
                    bbVar2.f66805x79766299 = str;
                    cbVar.f275358d.m("TablesVersion", "tableHash", bbVar2.mo9763xeb27878e());
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f354690j;
                    if (concurrentHashMap2 != null) {
                        concurrentHashMap2.put(num, str);
                    }
                }
                i19 = i27;
                it8 = it9;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "createtables end sql:%d trans:%d sqlCount:%d", java.lang.Long.valueOf(jVar2.a()), java.lang.Long.valueOf(jVar2.a()), java.lang.Integer.valueOf(i19));
        return true;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.n3 c() {
        gm0.j1.i();
        gm0.j1.b().c();
        return this.f354687g;
    }

    public java.lang.String d() {
        gm0.j1.b().c();
        return this.f354684d;
    }

    public java.lang.String f() {
        return h() + "MicroMsg.db";
    }

    public java.lang.String g() {
        return h() + "EnMicroMsg.db";
    }

    public java.lang.String h() {
        gm0.j1.b().c();
        return this.f354685e;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.la j() {
        gm0.j1.i();
        gm0.j1.b().c();
        return this.f354688h;
    }

    public boolean k() {
        java.lang.String m17 = m();
        if (m17 == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "hasCorruptedDB : ".concat(m17));
        return true;
    }

    public boolean l() {
        java.lang.String e07 = lp0.b.e0();
        java.lang.String str = this.f354683c;
        boolean startsWith = str.startsWith(e07);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f354696p;
        if (startsWith) {
            gm0.j1.i();
            if (gm0.j1.b().m() && j17 > 0 && j17 < 2000) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                    return true;
                }
            }
        }
        this.f354696p = currentTimeMillis;
        boolean b17 = fp.i.b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17);
        gm0.j1.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "isSDCardAvail:%b uin:%s toNow:%d sysPath:[%s] sdRoot:[%s], acc init:[%b]", valueOf, kk.v.a(gm0.j1.b().h()), java.lang.Long.valueOf(j17), this.f354683c, lp0.b.e0(), java.lang.Boolean.valueOf(gm0.j1.b().m()));
        return b17;
    }

    public java.lang.String m() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f354685e + "/ctest", "EnMicroMsg.db");
        if (r6Var.A()) {
            return r6Var.o();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(this.f354685e + "/corrupted", "EnMicroMsg.db");
        if (r6Var2.A()) {
            return r6Var2.o();
        }
        java.lang.String[] E = new com.p314xaae8f345.mm.vfs.r6(this.f354685e).E(new gm0.h0(this));
        if (E == null || E.length <= 0) {
            return null;
        }
        java.lang.String str = E[0];
        for (int i17 = 1; i17 < E.length; i17++) {
            java.lang.String str2 = E[i17];
            if (str2.compareTo(str) > 0) {
                str = str2;
            }
        }
        return this.f354685e + '/' + str;
    }
}
