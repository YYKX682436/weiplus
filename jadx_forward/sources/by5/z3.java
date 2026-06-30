package by5;

/* loaded from: classes13.dex */
public abstract class z3 {
    public static boolean a(int i17) {
        boolean z17;
        int i18 = com.p314xaae8f345.p3210x3857dc.b.m().i("min_apk_version_for_new_data_dir", "tools", -1);
        if (i18 == -1) {
            return false;
        }
        java.lang.String g17 = com.p314xaae8f345.p3210x3857dc.b.m().g("min_apk_version_ignore_list", "tools");
        if (g17 != null && !g17.equalsIgnoreCase("")) {
            java.lang.String[] split = g17.split(",");
            if (split.length > 0) {
                java.lang.String valueOf = java.lang.String.valueOf(i17);
                for (java.lang.String str : split) {
                    if (valueOf.equals(str)) {
                        z17 = true;
                        break;
                    }
                }
            }
        }
        z17 = false;
        by5.c4.f("CommandCfg", "isVersionInMinApkVersionIgnoreList, result:" + z17 + ", version:" + i17 + ", data:" + g17);
        return i17 >= i18 && !z17;
    }

    public static java.lang.String b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(n(i17));
        java.lang.String str = java.io.File.separator;
        sb7.append(str);
        sb7.append("apk");
        java.lang.String sb8 = sb7.toString();
        java.io.File file = new java.io.File(sb8);
        if (!file.exists()) {
            file.mkdirs();
        }
        sb6.append(sb8);
        sb6.append(str);
        sb6.append("base.apk");
        return sb6.toString();
    }

    public static java.lang.String c(int i17) {
        return d(i17) + java.io.File.separator + "base.7z";
    }

    public static java.lang.String d(int i17) {
        java.lang.String str;
        if (r(i17)) {
            str = n(i17) + java.io.File.separator + "zip";
        } else if (a(i17)) {
            by5.c4.f("XWebFileUtil", "getDownloadZipPath, version:" + i17 + ", use new data dir");
            str = p(i17) + java.io.File.separator + "zip";
        } else {
            str = n(i17) + java.io.File.separator + "zip";
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static java.lang.String e(int i17) {
        return d(i17) + java.io.File.separator + "base.zip";
    }

    public static java.lang.String f(int i17) {
        java.lang.String str = n(i17) + java.io.File.separator + "extracted_xwalkcore";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static java.lang.String g(int i17, java.lang.String str) {
        return f(i17) + java.io.File.separator + str;
    }

    public static java.lang.String h(android.content.Context context, int i17, java.lang.String str) {
        if (context == null) {
            by5.c4.c("XWebFileUtil", "getExtractedCoreFile with context, context is null");
            return "";
        }
        java.lang.String o17 = o(context, i17);
        if (o17.isEmpty()) {
            by5.c4.c("XWebFileUtil", "getExtractedCoreFile with context, versionDir is empty");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(o17);
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("extracted_xwalkcore");
        sb6.append(str2);
        sb6.append(str);
        return sb6.toString();
    }

    public static java.lang.String i(int i17) {
        java.lang.String str = n(i17) + java.io.File.separator + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55636x75686f6d;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static java.lang.String j(int i17) {
        java.lang.String str = n(i17) + java.io.File.separator + "patch_temp_decompress";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static java.lang.String k(int i17, java.lang.String str) {
        return j(i17) + java.io.File.separator + str;
    }

    public static java.lang.String l() {
        return org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getDir("xwalkplugin", 0).getAbsolutePath();
    }

    public static java.lang.String m() {
        java.lang.String l17 = l();
        if (l17.isEmpty()) {
            by5.c4.c("XWebFileUtil", "getPluginTempDir error, baseDir is empty");
            return "";
        }
        java.lang.String str = l17 + java.io.File.separator + "plugintemp";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static java.lang.String n(int i17) {
        if (i17 <= 0) {
            by5.c4.g("XWebFileUtil", "getVersionDataDir, version <= 0, version:" + i17);
            return "";
        }
        if (q(i17)) {
            return p(i17);
        }
        java.lang.String absolutePath = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getDir("xwalk_" + i17, 0).getAbsolutePath();
        java.io.File file = new java.io.File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return absolutePath;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o(android.content.Context r5, int r6) {
        /*
            if (r5 != 0) goto Lc
            java.lang.String r5 = "XWebFileUtil"
            java.lang.String r6 = "getVersionDir with context, context is null"
            by5.c4.c(r5, r6)
            java.lang.String r5 = ""
            return r5
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "xweb_data"
            r2 = 0
            java.io.File r1 = r5.getDir(r1, r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r3 = "xweb_"
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getAbsolutePath()
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = "zip"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L66
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L66
            r1 = 1
            goto L67
        L66:
            r1 = r2
        L67:
            if (r1 == 0) goto L6a
            return r0
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "xwalk_"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.io.File r5 = r5.getDir(r6, r2)
            java.lang.String r5 = r5.getAbsolutePath()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.z3.o(android.content.Context, int):java.lang.String");
    }

    public static java.lang.String p(int i17) {
        java.lang.String str = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getDir("xweb_data", 0).getAbsolutePath() + java.io.File.separator + "xweb_" + i17;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static boolean q(int i17) {
        java.lang.String str = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getApplicationInfo().dataDir;
        if (str == null) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(file.getAbsolutePath());
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("app_xweb_data");
        sb6.append(str2);
        sb6.append("xweb_");
        sb6.append(i17);
        java.io.File file2 = new java.io.File(sb6.toString());
        if (!file2.exists()) {
            return false;
        }
        java.io.File file3 = new java.io.File(file2.getAbsolutePath() + str2 + "zip");
        return file3.exists() && file3.isDirectory();
    }

    public static boolean r(int i17) {
        java.lang.String str = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getApplicationInfo().dataDir;
        if (str == null) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(file.getAbsolutePath());
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("app_xwalk_");
        sb6.append(i17);
        java.io.File file2 = new java.io.File(sb6.toString());
        if (!file2.exists()) {
            return false;
        }
        java.io.File file3 = new java.io.File(file2.getAbsolutePath() + str2 + "apk" + str2 + "base.apk");
        return file3.exists() && file3.isFile();
    }

    public static boolean s(int i17, java.lang.String str) {
        java.io.File file = new java.io.File(f(i17) + java.io.File.separator + str);
        return file.exists() && file.isFile();
    }
}
