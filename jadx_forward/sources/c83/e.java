package c83;

/* loaded from: classes11.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f121211a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f121212b = "tinker-boots-install-info";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f121213c = "tinker-boots-last-show";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f121214d = "tinker-boots-show-time";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f121215e = "hdiff-boots-install-info";

    /* renamed from: f, reason: collision with root package name */
    public static int f121216f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f121217g = "boots-install-kv";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f121218h = "";

    public static void a(r45.mm6 mm6Var, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        if (mm6Var == null || c16114x800e8cdb == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "addDialogInfoFromTinkerRespone, response = %s", c16114x800e8cdb);
        if (c16114x800e8cdb.e() == 4 || c16114x800e8cdb.e() == 3) {
            mm6Var.f462215u = c16114x800e8cdb.f223958x ? 1 : 0;
            mm6Var.f462216v = c16114x800e8cdb.f223959y ? 1 : 0;
            mm6Var.f462217w = c16114x800e8cdb.f223960z ? 1 : 0;
            mm6Var.f462219y = c16114x800e8cdb.B;
            mm6Var.f462218x = c16114x800e8cdb.C;
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        try {
            r45.jn h17 = h();
            if (h17 == null) {
                h17 = new r45.jn();
            }
            h17.f459489d++;
            h17.f459498p = java.lang.System.currentTimeMillis();
            r(h17);
            if (c16114x800e8cdb == null) {
                xv.l0 l0Var = (xv.l0) i95.n0.c(xv.l0.class);
                int i17 = (int) (h17.f459498p - h17.f459497o);
                ((wv.e0) l0Var).getClass();
                w73.f.j(21, -1, 0, i17, -1, 0);
                return;
            }
            xv.l0 l0Var2 = (xv.l0) i95.n0.c(xv.l0.class);
            int intValue = c16114x800e8cdb.f223943f.intValue();
            int i18 = (int) (h17.f459498p - h17.f459497o);
            int i19 = c16114x800e8cdb.f223948n;
            ((wv.e0) l0Var2).getClass();
            w73.f.j(2, intValue, 0, i18, i19, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "HdiffApk, addDownloadCount, e  = " + e17);
        }
    }

    public static void c(int i17, int i18) {
        try {
            f121216f = i18;
            r45.jn h17 = h();
            if (h17 == null) {
                h17 = new r45.jn();
            }
            h17.f459490e++;
            h17.f459493h = "" + i17;
            h17.f459497o = java.lang.System.currentTimeMillis();
            h17.f459496n = java.lang.System.currentTimeMillis();
            r(h17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "HdiffApk, addNoticeCount, e  = " + e17);
        }
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, int i17) {
        xv.l0 l0Var = (xv.l0) i95.n0.c(xv.l0.class);
        int intValue = c16114x800e8cdb.f223943f.intValue();
        int i18 = c16114x800e8cdb.f223948n;
        ((wv.e0) l0Var).getClass();
        w73.f.j(32, intValue, i17, 0, i18, 0);
        r45.jn h17 = h();
        if (h17 != null) {
            try {
                xv.l0 l0Var2 = (xv.l0) i95.n0.c(xv.l0.class);
                int intValue2 = c16114x800e8cdb.f223943f.intValue();
                int i19 = (int) (h17.f459498p - h17.f459497o);
                int i27 = c16114x800e8cdb.f223948n;
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - h17.f459498p);
                ((wv.e0) l0Var2).getClass();
                w73.f.j(3, intValue2, i17, i19, i27, currentTimeMillis);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "HdiffApk, addPatchMergeCount, e  = " + e17);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "HdiffApk, addPatchMergeCount, info  = " + h17 + ", response = " + c16114x800e8cdb);
        try {
            int intValue3 = c16114x800e8cdb.f223943f.intValue();
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.j(31, intValue3, i17, -1, -1, -1);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "HdiffApk, addPatchMergeCount, e  = " + e18);
        }
    }

    public static void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "clearHdiffInstallStatus.");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f121215e, "").apply();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
        }
    }

    public static void f(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "clearInstallUpdateInfo.");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putString(f121212b, "").apply();
        sharedPreferences.edit().putLong(f121213c, 0L).apply();
        sharedPreferences.edit().putInt(f121214d, 0).apply();
    }

    public static java.lang.String g(java.lang.String str) {
        if (str == null || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        java.util.Map map = f121211a;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            return (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        }
        synchronized (map) {
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
                return (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
            }
            java.lang.String p17 = android.text.TextUtils.isEmpty(null) ? com.p314xaae8f345.mm.vfs.w6.p(str) : null;
            if (!android.text.TextUtils.isEmpty(p17)) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, p17);
            }
            return p17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.jn h() {
        /*
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r1 = "tinker_patch_share_config"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = c83.e.f121217g
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            java.lang.String r2 = "MicroMsg.UpdateUtil"
            r3 = 0
            if (r1 != 0) goto L39
            r1 = 0
            r45.jn r4 = new r45.jn     // Catch: java.lang.Exception -> L2e
            r4.<init>()     // Catch: java.lang.Exception -> L2e
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L2c
            com.tencent.mm.protobuf.f r0 = r4.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L2c
            r45.jn r0 = (r45.jn) r0     // Catch: java.lang.Exception -> L2c
            goto L3a
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = move-exception
            r4 = r3
        L30:
            java.lang.String r5 = "parse tinker install failed."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r5, r1)
            r0 = r4
            goto L3a
        L39:
            r0 = r3
        L3a:
            if (r0 == 0) goto L3d
            return r0
        L3d:
            java.lang.String r0 = "HdiffApk, update info is null."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c83.e.h():r45.jn");
    }

    public static java.lang.String i(android.content.Context context) {
        ((wv.a) ((xv.h0) i95.n0.c(xv.h0.class))).getClass();
        if (w73.a.b()) {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            if (w73.f.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "getCurrentApkPath user adb old.apk");
                java.io.File file = new java.io.File("/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/tmp/old.apk");
                if (file.exists()) {
                    return file.getAbsolutePath();
                }
            }
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String j() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f121218h)) {
            f121218h = lp0.b.t() + "diff/";
        }
        return f121218h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.bw3 k() {
        /*
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r1 = "tinker_patch_share_config"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = c83.e.f121215e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            java.lang.String r2 = "MicroMsg.UpdateUtil"
            r3 = 0
            if (r1 != 0) goto L39
            r1 = 0
            r45.bw3 r4 = new r45.bw3     // Catch: java.lang.Exception -> L2e
            r4.<init>()     // Catch: java.lang.Exception -> L2e
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L2c
            com.tencent.mm.protobuf.f r0 = r4.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L2c
            r45.bw3 r0 = (r45.bw3) r0     // Catch: java.lang.Exception -> L2c
            goto L3a
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = move-exception
            r4 = r3
        L30:
            java.lang.String r5 = "parse tinker install failed."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r5, r1)
            r0 = r4
            goto L3a
        L39:
            r0 = r3
        L3a:
            if (r0 == 0) goto L3d
            return r0
        L3d:
            java.lang.String r0 = "update info is null."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c83.e.k():r45.bw3");
    }

    public static java.lang.String l(java.lang.String str) {
        return j() + str + ".apk";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.mm6 m() {
        /*
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r1 = "tinker_patch_share_config"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = c83.e.f121212b
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            java.lang.String r2 = "MicroMsg.UpdateUtil"
            r3 = 0
            if (r1 != 0) goto L39
            r1 = 0
            r45.mm6 r4 = new r45.mm6     // Catch: java.lang.Exception -> L2e
            r4.<init>()     // Catch: java.lang.Exception -> L2e
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L2c
            com.tencent.mm.protobuf.f r0 = r4.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L2c
            r45.mm6 r0 = (r45.mm6) r0     // Catch: java.lang.Exception -> L2c
            goto L3a
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = move-exception
            r4 = r3
        L30:
            java.lang.String r5 = "parse tinker install failed."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r5, r1)
            r0 = r4
            goto L3a
        L39:
            r0 = r3
        L3a:
            if (r0 == 0) goto L3d
            return r0
        L3d:
            java.lang.String r0 = "update info is null."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c83.e.m():r45.mm6");
    }

    public static boolean n(java.lang.String str) {
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "isApkZipCanBeUsed, no exist, zipPath = " + str);
            return false;
        }
        try {
            new java.util.zip.ZipFile(new java.io.File(str));
            z17 = true;
        } catch (java.util.zip.ZipException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e18, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "isApkZipCanBeUsed = " + z17 + ", zipPath = " + str);
        return z17;
    }

    public static boolean o() {
        r45.bw3 k17 = k();
        if (k17 == null) {
            return false;
        }
        try {
            long parseLong = java.lang.Long.parseLong(k17.f452626d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdateUtil", "Hdiffapk, downloadId downloadId = " + parseLong);
            h02.a e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(parseLong);
            if (e17 != null) {
                return e17.f68441x10a0fed7 == 1;
            }
            return false;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdateUtil", "Hdiffapk, isNeedShowTinkerDialog e = " + e18);
            return false;
        }
    }

    public static boolean p() {
        r45.bw3 k17 = k();
        if (k17 == null) {
            return false;
        }
        boolean equals = "3".equals(k17.f452629g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdateUtil", "Hdiffapk, isPatchMergeing = " + equals);
        return equals;
    }

    public static int q(java.lang.String str) {
        int intValue;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                intValue = java.lang.Integer.decode(str).intValue();
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "parseClientVersion %s %s", str, java.lang.Integer.valueOf(intValue));
            return intValue;
        }
        intValue = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "parseClientVersion %s %s", str, java.lang.Integer.valueOf(intValue));
        return intValue;
    }

    public static void r(r45.jn jnVar) {
        if (jnVar != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f121217g, android.util.Base64.encodeToString(jnVar.mo14344x5f01b1f6(), 0)).apply();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void s(r45.bw3 bw3Var) {
        if (bw3Var != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f121215e, android.util.Base64.encodeToString(bw3Var.mo14344x5f01b1f6(), 0)).apply();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void t(r45.mm6 mm6Var) {
        if (mm6Var != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f121212b, android.util.Base64.encodeToString(mm6Var.mo14344x5f01b1f6(), 0)).apply();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "HdiffApk, clearBootInstallKVInfo.");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString(f121217g, "").apply();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
