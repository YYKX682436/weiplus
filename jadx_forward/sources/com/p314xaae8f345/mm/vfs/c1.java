package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class c1 implements com.p314xaae8f345.mm.vfs.v5 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f294380f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f294381g;

    /* renamed from: h, reason: collision with root package name */
    public static java.util.Map f294382h;

    /* renamed from: i, reason: collision with root package name */
    public static java.util.Map f294383i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f294384j;

    /* renamed from: k, reason: collision with root package name */
    public static java.util.Set f294385k;

    /* renamed from: l, reason: collision with root package name */
    public static java.util.Set f294386l;

    /* renamed from: m, reason: collision with root package name */
    public static java.util.Set f294387m;

    /* renamed from: n, reason: collision with root package name */
    public static java.util.Set f294388n;

    /* renamed from: o, reason: collision with root package name */
    public static java.util.Set f294389o;

    /* renamed from: p, reason: collision with root package name */
    public static java.util.Set f294390p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Set f294391q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.x2 f294392r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.regex.Pattern f294393s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f294394t;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f294396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f294397c;

    /* renamed from: d, reason: collision with root package name */
    public final long f294398d;

    /* renamed from: e, reason: collision with root package name */
    public final long f294399e;

    static {
        long nanoTime = java.lang.System.nanoTime();
        java.util.Random random = new java.util.Random();
        random.setSeed(nanoTime);
        f294380f = random.nextInt();
        f294381g = new java.lang.Object();
        f294382h = new java.util.HashMap();
        f294384j = false;
        f294385k = new java.util.HashSet();
        f294386l = new java.util.HashSet();
        f294387m = new java.util.HashSet();
        f294388n = new java.util.HashSet();
        f294389o = new java.util.HashSet();
        f294390p = new java.util.HashSet();
        f294391q = new java.util.HashSet();
        f294392r = new com.p314xaae8f345.mm.vfs.t0();
        f294393s = java.util.regex.Pattern.compile("[0-9a-f]{32}(?:temp[0-9]+)?");
        f294394t = new java.lang.String[]{".auth_cache", "app_execdir", "app_font", "app_midaslib_0", "app_midaslib_1", "app_midasplugins", "app_qmsp", "app_sslcache", "app_tbs_common_share", "app_turingdfp", "app_turingfd", "app_turingsmi", "cert", "code_cache", "extqbar", "face_detect", "huaweiks", "ilink", "no_backup", "scan_goods", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55708xb7238671, "xweb_lock"};
    }

    public c1(java.lang.String str, int i17, int i18, long j17, long j18) {
        this.f294395a = str;
        this.f294396b = i17;
        this.f294397c = i18;
        this.f294398d = j17;
        this.f294399e = j18;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0220 A[Catch: all -> 0x0418, TryCatch #1 {, blocks: (B:5:0x000d, B:6:0x0037, B:8:0x003d, B:10:0x00c1, B:11:0x00e8, B:18:0x00f6, B:20:0x010a, B:21:0x021c, B:23:0x0220, B:31:0x011a, B:33:0x0127, B:35:0x0135, B:37:0x0144, B:38:0x014d, B:40:0x015b, B:41:0x0164, B:43:0x0172, B:44:0x017b, B:46:0x018a, B:50:0x01a9, B:54:0x01be, B:57:0x01cf, B:61:0x01d7, B:74:0x01f0, B:75:0x01f9, B:76:0x00c5, B:78:0x00d0, B:80:0x00db, B:82:0x00e5, B:84:0x0242, B:85:0x0267, B:87:0x026d, B:89:0x027f, B:91:0x0289, B:98:0x029a), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.c1.b():void");
    }

    public static void c() {
        java.io.File file = new java.io.File(lp0.b.X());
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(21388, "@TotalSpace-Data", 0, 0, file.getAbsolutePath(), java.lang.Long.valueOf(file.getUsableSpace()), 0, 0, 0, java.lang.Long.valueOf(file.getTotalSpace()), 0, 0, 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        java.io.File file2 = new java.io.File(lp0.b.e0());
        fVar.d(21388, "@TotalSpace-SDCard", 0, 0, file2.getAbsolutePath(), java.lang.Long.valueOf(file2.getUsableSpace()), 0, 0, 0, java.lang.Long.valueOf(file2.getTotalSpace()), 0, 0, 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
    }

    public static void d() {
        long j17;
        boolean z17;
        java.util.Iterator it;
        boolean z18 = "1".equals(j62.e.g().j("clicfg_diskspace_force_report", "0", true, true)) || j() || z65.c.a();
        synchronized (f294381g) {
            java.util.Map map = f294382h;
            if (map == null) {
                return;
            }
            java.util.Iterator it6 = new java.util.HashMap(map).values().iterator();
            while (true) {
                j17 = 0;
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.vfs.a1 a1Var = (com.p314xaae8f345.mm.vfs.a1) it6.next();
                java.util.Iterator it7 = ((java.util.HashSet) f294391q).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z17 = false;
                        break;
                    } else if (((com.p314xaae8f345.mm.vfs.b1) it7.next()).c(a1Var)) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    if (!z18 || a1Var.f294302e <= 0) {
                        it = it6;
                    } else {
                        it = it6;
                        jx3.f.INSTANCE.d(31184, a1Var.f294298a, java.lang.Integer.valueOf(a1Var.f294299b), java.lang.Integer.valueOf(a1Var.f294300c), a1Var.f294301d, java.lang.Long.valueOf(a1Var.f294302e), java.lang.Integer.valueOf(a1Var.f294303f), java.lang.Integer.valueOf(a1Var.f294304g), java.lang.Integer.valueOf(a1Var.f294305h), java.lang.Long.valueOf(a1Var.f294306i), java.lang.Long.valueOf(a1Var.f294307j), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Daily KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", a1Var.f294298a, java.lang.Integer.valueOf(a1Var.f294299b), java.lang.Integer.valueOf(a1Var.f294300c), a1Var.f294301d, java.lang.Long.valueOf(a1Var.f294302e), java.lang.Integer.valueOf(a1Var.f294303f), java.lang.Integer.valueOf(a1Var.f294304g), java.lang.Integer.valueOf(a1Var.f294305h), java.lang.Long.valueOf(a1Var.f294306i), java.lang.Long.valueOf(a1Var.f294307j));
                    it6 = it;
                }
            }
            java.util.Iterator it8 = ((java.util.HashSet) f294391q).iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.mm.vfs.a1 b17 = ((com.p314xaae8f345.mm.vfs.b1) it8.next()).b();
                if (b17 != null) {
                    if (z18 && b17.f294302e > j17) {
                        jx3.f.INSTANCE.d(31184, b17.f294298a, java.lang.Integer.valueOf(b17.f294299b), java.lang.Integer.valueOf(b17.f294300c), b17.f294301d, java.lang.Long.valueOf(b17.f294302e), java.lang.Integer.valueOf(b17.f294303f), java.lang.Integer.valueOf(b17.f294304g), java.lang.Integer.valueOf(b17.f294305h), java.lang.Long.valueOf(b17.f294306i), java.lang.Long.valueOf(b17.f294307j), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Daily KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", b17.f294298a, java.lang.Integer.valueOf(b17.f294299b), java.lang.Integer.valueOf(b17.f294300c), b17.f294301d, java.lang.Long.valueOf(b17.f294302e), java.lang.Integer.valueOf(b17.f294303f), java.lang.Integer.valueOf(b17.f294304g), java.lang.Integer.valueOf(b17.f294305h), java.lang.Long.valueOf(b17.f294306i), java.lang.Long.valueOf(b17.f294307j));
                }
                j17 = 0;
            }
        }
    }

    public static void e(com.p314xaae8f345.mm.vfs.t2 t2Var, java.lang.String str, int i17, java.lang.String[] strArr, java.util.Set set, boolean z17, boolean z18) {
        java.util.Map map;
        com.p314xaae8f345.mm.vfs.C22758x1f6ac662 c22758x1f6ac662;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e;
        java.lang.String[] strArr2 = strArr;
        java.util.Map c17 = com.p314xaae8f345.mm.vfs.a3.f294314a.c();
        int length = strArr2.length;
        int i18 = 0;
        while (i18 < length) {
            java.lang.String str2 = strArr2[i18];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                c22758x1f6ac662 = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662(str2);
                mo82286x32b09e = c22758x1f6ac662.b(c17).mo82286x32b09e("");
            } catch (java.lang.Exception unused) {
            }
            if (mo82286x32b09e != null) {
                for (com.p314xaae8f345.mm.vfs.x1 x1Var : mo82286x32b09e) {
                    try {
                        boolean z19 = x1Var.f294769f;
                        java.lang.String str3 = x1Var.f294765b;
                        if (z19) {
                            try {
                                if (!set.contains(str3)) {
                                    if (f294393s.matcher(str3).matches() == z17) {
                                        try {
                                            arrayList.add(str3);
                                        } catch (java.lang.Exception unused2) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } catch (java.lang.Exception unused3) {
                                map = c17;
                                i18++;
                                strArr2 = strArr;
                                c17 = map;
                            }
                        }
                    } catch (java.lang.Exception unused4) {
                    }
                }
                if (z18) {
                    arrayList.add("\u0000");
                }
                if (!arrayList.isEmpty()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        java.lang.String str4 = (java.lang.String) it.next();
                        if (str4.indexOf(47) >= 0) {
                            arrayList2.add(str4);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.C22767x2079386e c22767x2079386e = new com.p314xaae8f345.mm.vfs.C22767x2079386e(c22758x1f6ac662, true, arrayList, arrayList2);
                    map = c17;
                    try {
                        c22767x2079386e.a(str + str2.replace('$', '#'), new com.p314xaae8f345.mm.vfs.c1(str2, i17, 0, 0L, 0L));
                        try {
                            t2Var.c(str + str2, c22767x2079386e);
                        } catch (java.lang.Exception unused5) {
                        }
                    } catch (java.lang.Exception unused6) {
                    }
                    i18++;
                    strArr2 = strArr;
                    c17 = map;
                }
                map = c17;
                i18++;
                strArr2 = strArr;
                c17 = map;
            }
            map = c17;
            i18++;
            strArr2 = strArr;
            c17 = map;
        }
    }

    public static void f(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var;
        int i18;
        if (i17 == 1) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VOICE2_HIT_INT_SYNC;
            i18 = 0;
        } else if (i17 == 2) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VIDEO_HIT_INT_SYNC;
            i18 = 1;
        } else if (i17 == 3) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_RECORD_HIT_INT_SYNC;
            i18 = 5;
        } else {
            if (i17 != 4) {
                return;
            }
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_ATTACHMENT_HIT_INT_SYNC;
            i18 = 6;
        }
        try {
            gm0.j1.u().c().x(u3Var, 1);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 1);
            jx3.f.INSTANCE.t(1912, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.DiskFileStatistics", e17, "Cannot mark wrong migration", new java.lang.Object[0]);
        }
    }

    public static void g(java.lang.String str, com.p314xaae8f345.mm.vfs.a1 a1Var) {
        synchronized (f294381g) {
            java.util.Map map = f294383i;
            if (map == null) {
                map = f294382h;
            }
            map.put(str, a1Var);
        }
    }

    public static void h(java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = (i17 & 2048) != 0;
        boolean z18 = !z17 && (i17 & 4) == 0;
        boolean z19 = (i17 & 1) != 0;
        boolean z27 = (i17 & 2) != 0;
        synchronized (f294381g) {
            if (z19) {
                (z18 ? f294387m : f294386l).add(str2);
            }
            if (z27) {
                if (z18) {
                    f294388n.add(str2);
                    if (str != null) {
                        f294385k.add(str);
                    }
                } else if (z17 && str2.startsWith("files/")) {
                    f294390p.add(str2.substring(6));
                } else {
                    f294389o.add(str2);
                }
            }
        }
    }

    public static void i(com.p314xaae8f345.mm.vfs.b1 b1Var) {
        synchronized (f294381g) {
            ((java.util.HashSet) f294391q).add(b1Var);
        }
    }

    public static boolean j() {
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_vfs_statistics_sampling_factor", java.lang.String.valueOf(1024), false, false), 1024);
        return ((gm0.j1.b().h() ^ f294380f) ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) % (P != 0 ? P : 1024) == 0;
    }

    public static void k(long j17, java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, wechatTotalSize = " + j17 + ", info = " + str);
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            long availableBytes = statFs.getAvailableBytes();
            long blockSizeLong = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            long availableBytes2 = statFs2.getAvailableBytes();
            long blockSizeLong2 = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
            int round = java.lang.Math.round((((float) j17) * 100.0f) / ((float) java.lang.Math.max(blockSizeLong, blockSizeLong2)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, dataFreeSpace = " + availableBytes + ", sdcardFreeSpace = " + availableBytes2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, dataTotalSpace = " + blockSizeLong + ", sdcardTotalSpace = " + blockSizeLong2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, percentageData = " + round + ", percentageSdcard = " + round);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_available_bytes", availableBytes);
            if (round > 50) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_wechat_percentage", round);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("extreme_storage_wechat_percentage", -1);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.DiskFileStatistics", "reportPercentageHeavyUser error : " + th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.v5
    public void a(java.lang.String str, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, int i17, java.util.Map map) {
        java.lang.String str2 = (java.lang.String) map.get("relPath");
        boolean equals = java.lang.Boolean.TRUE.equals(map.get("recursive"));
        if (str2 == null) {
            return;
        }
        boolean isEmpty = str2.isEmpty();
        java.lang.String str3 = this.f294395a;
        if (!isEmpty) {
            str3 = str3 + '/' + str2;
        } else if (!equals) {
            str3 = str3 + "/(root)";
        }
        g(str3 + '|' + str, new com.p314xaae8f345.mm.vfs.a1(str, this.f294396b, this.f294397c, str3, ((java.lang.Long) map.get("totalSize")).longValue(), ((java.lang.Integer) map.get("fileCount")).intValue(), ((java.lang.Integer) map.get("dirCount")).intValue(), ((java.lang.Integer) map.get("maxDepth")).intValue(), ((java.lang.Long) map.get("maxFileSize")).longValue(), ((java.lang.Long) map.get("averageAge")).longValue(), this.f294398d, this.f294399e));
    }
}
