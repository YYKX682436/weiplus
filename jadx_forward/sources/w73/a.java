package w73;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f525024a = 10485760;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f525025b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static long f525026c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f525027d = false;

    public static void a(java.lang.String str, w73.d dVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "buildOldDeltaFriendFile, filePath = " + str);
        gm0.j1.e().j(new w73.c(dVar, str));
    }

    public static boolean b() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            return true;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_local_wechat_repair_entrance_flag_and, 0) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0108 A[Catch: Exception -> 0x0074, all -> 0x0356, TryCatch #2 {Exception -> 0x0074, blocks: (B:8:0x002e, B:10:0x003a, B:12:0x0046, B:14:0x004c, B:15:0x0060, B:20:0x007a, B:22:0x00e0, B:24:0x00f5, B:25:0x0102, B:27:0x0108, B:29:0x0118, B:30:0x014d, B:32:0x017a, B:33:0x0198, B:35:0x019e, B:36:0x01bb, B:38:0x0271, B:41:0x0279, B:46:0x0283, B:48:0x0295, B:50:0x02a1, B:51:0x02ad, B:53:0x0301, B:54:0x0321, B:63:0x033b, B:65:0x0348, B:69:0x0310, B:70:0x02a9, B:71:0x0327, B:72:0x032d, B:73:0x0133, B:75:0x00ef, B:81:0x0212, B:83:0x021c, B:85:0x0238, B:86:0x0253, B:87:0x0246), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r42, java.lang.String r43, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb r44) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w73.a.c(android.content.Context, java.lang.String, com.tencent.mm.plugin.hp.util.TinkerSyncResponse):int");
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.String parent = new java.io.File(str).getParent();
        java.lang.String str2 = java.io.File.separator;
        if (!parent.endsWith(str2)) {
            parent = parent + str2;
        }
        java.lang.String str3 = parent + "deltaFriendlyOldFile";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "hdiffApk, getDeltaFriendlyOldFilePath, deltaFriendlyOldFilePath = " + str3);
        return str3;
    }

    public static void e(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "notifyExptKeyChange [%s]", str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6211x807c58dc c6211x807c58dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6211x807c58dc();
        am.i00 i00Var = c6211x807c58dc.f136462g;
        i00Var.f88422a = str;
        i00Var.f88423b = i17;
        i00Var.f88424c = i18;
        c6211x807c58dc.e();
    }

    public static int f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        int i17;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk onDownloadFinish, TinkerSyncResponse = %s.", c16114x800e8cdb);
            java.lang.String str2 = c16114x800e8cdb.f223949o;
            java.lang.String l17 = c83.e.l(str2);
            java.io.File file = new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(str, false));
            java.lang.String i18 = c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.String absolutePath = file.getAbsolutePath();
            if (b() && w73.f.c()) {
                i18 = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/tmp/old.apk";
            }
            if (b()) {
                if (bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Updater_HdiffMOCKPATCHPATH_Int, 0) == 1) {
                    absolutePath = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch";
                }
            }
            java.lang.String d17 = d(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk newApkMd5: " + str2 + "\n, patchFile = " + file + ", size = " + file.length() + "\n, savePath = " + str + ", size = " + new java.io.File(str).length() + "\n, hDiffPath = " + absolutePath + ", size = " + new java.io.File(absolutePath).length() + "\n, oldPath = " + i18 + ", size = " + new java.io.File(i18).length() + "\n, UpdateUtil.getCurrentApkPath(context): " + c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) + "\n, deltaFriendOldFilePath = " + d17);
            if (!com.p314xaae8f345.mm.vfs.w6.j(file.getAbsolutePath()) || file.length() <= 0) {
                w73.f.k(113);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 113L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk patch is not exists.");
                return -7;
            }
            w73.f.k(112);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(614L, 112L, 1L, false);
            if ((com.p314xaae8f345.mm.vfs.w6.j(l17) && new java.io.File(l17).length() == 0) || !c83.e.n(l17)) {
                ak0.z.b(new java.io.File(l17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk newApkPath is exists but size = 0.");
            }
            long c17 = c01.id.c();
            int d18 = w73.f.d(i18, absolutePath, l17, d17, c16114x800e8cdb.f223949o);
            long c18 = (c01.id.c() - c17) / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk merge h diff costTime: %s, hDiffPath :%s, newApkPath: %s, retCode: %s.", java.lang.Long.valueOf(c18), absolutePath, l17, java.lang.Integer.valueOf(d18));
            if (d18 == 0) {
                i17 = 2;
                w73.f.l(106, d18, c18, 2L, 2L);
                g0Var.mo68477x336bdfd8(614L, 106L, 1L, false);
            } else {
                i17 = 2;
                g0Var.mo68477x336bdfd8(614L, 105L, 1L, false);
                w73.f.l(105, d18, c18, 2L, 2L);
            }
            if (d18 == 0) {
                java.lang.String str3 = "";
                try {
                    str3 = com.p314xaae8f345.mm.vfs.w6.p(i18);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk Exception = %s", e17);
                }
                w73.f.e();
                java.lang.Object[] objArr = new java.lang.Object[i17];
                objArr[0] = str3;
                objArr[1] = c16114x800e8cdb.f223950p;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk oldApkMd5 = %s, response.oldApkMd5 = %s.", objArr);
            }
            if (!c83.e.n(l17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk deleteNewApkPath = " + ak0.z.b(new java.io.File(l17)));
                d18 = -201;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk deletehDiffPath = " + ak0.z.b(new java.io.File(absolutePath)));
            return d18;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "HdiffApk e = %s", e18);
            return -10003;
        }
    }
}
