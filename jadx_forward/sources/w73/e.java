package w73;

/* loaded from: classes11.dex */
public abstract class e {
    public static int a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i17;
        uk.b b17;
        uk.a aVar;
        if (str != null && str2 != null && str3 != null) {
            try {
                java.io.File file = new java.io.File(str);
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
                java.io.File file2 = new java.io.File(str3);
                com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str3));
                java.io.File file3 = new java.io.File(str2);
                if (!file.exists() || !file3.exists()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", java.lang.Boolean.valueOf(file.exists()), java.lang.Boolean.valueOf(file2.exists()), java.lang.Boolean.valueOf(file3.exists()));
                    randomAccessFile.close();
                    return -1;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion > 29 || (b17 = uk.b.b(str)) == null || (aVar = b17.f510014a) == null) {
                    i17 = 0;
                } else {
                    i17 = aVar.f510013a + 8;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", java.lang.Integer.valueOf(i17));
                }
                if (uk.g.b(randomAccessFile, file2, file3, i17) != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                    randomAccessFile.close();
                    return -1;
                }
                randomAccessFile.close();
                if (str4.equalsIgnoreCase(com.p314xaae8f345.mm.vfs.w6.p(str3))) {
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", str4, com.p314xaae8f345.mm.vfs.w6.p(str3));
                return -2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Tinker.MergeBsDiffApk", e17, "merge apk failed.", new java.lang.Object[0]);
            }
        }
        return -1;
    }

    public static int b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i17;
        uk.b b17;
        uk.a aVar;
        if (str == null || str2 == null || str3 == null) {
            return -5;
        }
        try {
            java.io.File file = new java.io.File(str);
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
            java.io.File file2 = new java.io.File(str3);
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str3));
            java.io.File file3 = new java.io.File(str2);
            if (!file.exists() || !file3.exists()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", java.lang.Boolean.valueOf(file.exists()), java.lang.Boolean.valueOf(file2.exists()), java.lang.Boolean.valueOf(file3.exists()));
                randomAccessFile.close();
                return -1;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion > 29 || (b17 = uk.b.b(str)) == null || (aVar = b17.f510014a) == null) {
                i17 = 0;
            } else {
                i17 = aVar.f510013a + 8;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", java.lang.Integer.valueOf(i17));
            }
            if (uk.g.b(randomAccessFile, file2, file3, i17) != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                randomAccessFile.close();
                return -2;
            }
            randomAccessFile.close();
            if (str4.equalsIgnoreCase(com.p314xaae8f345.mm.vfs.w6.p(str3))) {
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", str4, com.p314xaae8f345.mm.vfs.w6.p(str3));
            return -3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Tinker.MergeBsDiffApk", e17, "merge apk failed.", new java.lang.Object[0]);
            return -4;
        }
    }
}
