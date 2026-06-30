package by5;

/* loaded from: classes13.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f36422a;

    public static void a(boolean z17) {
        boolean b17;
        boolean z18;
        int d17 = org.xwalk.core.XWalkEnvironment.d();
        if (d17 > 0) {
            boolean z19 = false;
            if (!(d17 >= 100000000)) {
                boolean r17 = by5.z3.r(d17);
                boolean q17 = by5.z3.q(d17);
                if (!r17 && !q17) {
                    by5.c4.f("XWebCleaner", "checkFiles, skip for no version data dir, version:" + d17);
                    return;
                }
                if (!z17 && !by5.v.a("CHECK_FILES_MD5_TIME_KEY", 7200000L)) {
                    by5.c4.f("XWebCleaner", "checkFiles, skip check");
                    return;
                }
                android.content.SharedPreferences g17 = by5.d4.g("UPDATEINFOTAG");
                if (g17 == null) {
                    by5.c4.f("XWebCleaner", "checkFiles, invalid shared preferences");
                    return;
                }
                xx5.a.f458026a = null;
                xx5.a.f458027b = null;
                by5.c4.f("XWebCleaner", "checkFiles, start check res files, version:" + d17);
                java.lang.String g18 = by5.z3.g(d17, "reslist.config");
                java.io.File file = new java.io.File(g18);
                if (file.exists()) {
                    b17 = by5.t.b(d17, file);
                } else {
                    if ((d17 >= 100000000) || d17 < 362) {
                        by5.c4.g("XWebCleaner", "doCheckResFiles, resConfigFile not exist, maybe test runtime or old runtime, path:" + g18);
                    } else {
                        by5.s0.d(79L, 1);
                        by5.c4.f("XWebCleaner", "doCheckResFiles, resConfigFile not exist, path:" + g18);
                        if ("true".equalsIgnoreCase(com.tencent.xweb.b.m().g("dis_res_config_file_check", "tools"))) {
                            by5.c4.g("XWebCleaner", "doCheckResFiles, resConfigFile not exist and dis_res_config_file_check");
                        } else {
                            b17 = false;
                        }
                    }
                    b17 = true;
                }
                if (!b17) {
                    int i17 = g17.getInt("lastCheckResVersion", -1);
                    g17.edit().putInt("lastCheckResVersion", -1).commit();
                    if (i17 != d17) {
                        by5.s0.d(77L, 1);
                        by5.c4.f("XWebCleaner", "checkFiles, some res files corrupted at first time");
                    } else {
                        by5.c4.f("XWebCleaner", "checkFiles, some res files corrupted");
                    }
                    by5.s0.d(76L, 1);
                }
                by5.c4.f("XWebCleaner", "checkFiles, start check installed files, version:" + d17);
                java.io.File f17 = f(d17);
                if (f17 == null) {
                    if (d17 >= 100000000) {
                        by5.c4.g("XWebCleaner", "doCheckFiles, configFile not exist, maybe test runtime or old runtime");
                    } else {
                        by5.c4.g("XWebCleaner", "doCheckFiles, no config file");
                        by5.s0.d(78L, 1);
                        if ("true".equalsIgnoreCase(com.tencent.xweb.b.m().g("dis_config_file_check", "tools"))) {
                            by5.c4.f("XWebCleaner", "doCheckFiles, dis_config_file_check is true");
                        }
                    }
                    z19 = true;
                } else {
                    z19 = by5.t.a(d17, f17);
                }
                if (!z19) {
                    int i18 = g17.getInt("lastCheckVersion", -1);
                    g17.edit().putInt("lastCheckVersion", -1).commit();
                    if (i18 != d17) {
                        by5.s0.d(64L, 1);
                        by5.c4.f("XWebCleaner", "checkFiles, some installed files corrupted at first time");
                    } else {
                        by5.c4.f("XWebCleaner", "checkFiles, some installed files corrupted");
                    }
                    by5.s0.d(63L, 1);
                }
                if ("true".equalsIgnoreCase(com.tencent.xweb.b.m().g("disable_res_check", "tools"))) {
                    by5.c4.f("XWebCleaner", "checkFiles, ignore res files check");
                    z18 = z19;
                } else {
                    z18 = z19 & b17;
                }
                if (z18) {
                    g17.edit().putInt("lastCheckVersion", d17).commit();
                    by5.c4.f("XWebCleaner", "checkFiles success");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
                sb6.append(org.xwalk.core.XWalkEnvironment.d());
                sb6.append(",");
                sb6.append(b17 ? 1 : 2);
                sb6.append(",");
                sb6.append(z19 ? 1 : 2);
                sb6.append(",2,");
                java.lang.String str = xx5.a.f458026a;
                if (str == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append(",");
                java.lang.String str2 = xx5.a.f458027b;
                sb6.append(str2 != null ? str2 : "");
                java.lang.String sb7 = sb6.toString();
                by5.c4.f("KVReportForCheckFiles", "report:" + sb7);
                by5.s0.t(24525, sb7);
                by5.c4.c("XWebCleaner", "checkFiles, check failed");
                by5.u3.e(-1, null, by5.a.b());
                return;
            }
        }
        by5.c4.f("XWebCleaner", "checkFiles, invalid available version, version:" + d17);
    }

    public static void b(android.content.Context context) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        java.lang.String str;
        long j17;
        long j18;
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (!by5.d4.e().getBoolean("bEnableCheckStorage", false) && !com.tencent.xweb.b.m().h("enable_check_storage", "tools", false)) {
            by5.c4.f("XWebCleaner", "checkStorage, disabled by command");
            return;
        }
        java.io.File[] listFiles = new java.io.File(context.getApplicationInfo().dataDir).listFiles();
        if (listFiles == null) {
            by5.c4.c("XWebCleaner", "checkStorage failed, files is null");
            return;
        }
        xx5.d dVar = new xx5.d();
        int length = listFiles.length;
        int i18 = 0;
        long j19 = 0;
        while (true) {
            list = dVar.f458038i;
            list2 = dVar.f458037h;
            list3 = dVar.f458036g;
            list4 = dVar.f458035f;
            list5 = dVar.f458034e;
            list6 = dVar.f458040k;
            str = com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE;
            if (i18 >= length) {
                break;
            }
            int i19 = length;
            java.io.File file = listFiles[i18];
            java.io.File[] fileArr = listFiles;
            java.lang.String name = file.getName();
            int i27 = i18;
            if (name.startsWith("app_xwalk_") && file.isDirectory()) {
                j19 += g(dVar, file, name);
            } else {
                if (name.equals("app_xweb_data") && file.isDirectory()) {
                    java.io.File[] listFiles2 = file.listFiles();
                    if (listFiles2 != null) {
                        for (java.io.File file2 : listFiles2) {
                            if (file2.getName().startsWith("xweb_") && file2.isDirectory()) {
                                j19 += g(dVar, file2, file2.getName());
                            }
                        }
                    }
                    j17 = j19;
                } else {
                    boolean startsWith = name.startsWith("app_xwalkconfig");
                    java.lang.String str5 = com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO;
                    java.lang.String str6 = ", size:";
                    if (startsWith && file.isDirectory()) {
                        long j27 = by5.u.j(file, true);
                        j19 += j27;
                        by5.c4.f("XWebCleaner", "checkStorage, config dir:" + name + ", size:" + by5.u.k(j27));
                        dVar.f458030a = j27;
                    } else {
                        if (name.startsWith("app_xwalkplugin") && file.isDirectory()) {
                            java.io.File[] listFiles3 = file.listFiles();
                            if (listFiles3 != null) {
                                int length2 = listFiles3.length;
                                int i28 = 0;
                                long j28 = 0;
                                while (i28 < length2) {
                                    int i29 = length2;
                                    java.io.File file3 = listFiles3[i28];
                                    java.io.File[] fileArr2 = listFiles3;
                                    long j29 = j19;
                                    long j37 = by5.u.j(file3, !"cache".equalsIgnoreCase(file3.getName()));
                                    if (j37 > 0) {
                                        j28 += j37;
                                        i17 = i28;
                                        by5.c4.f("XWebCleaner", ">>>> getTotalPluginSize, plugin dir:" + file3.getName() + str6 + by5.u.k(j37));
                                        cy5.l e17 = cy5.m.e(file3);
                                        if (e17 != null) {
                                            java.lang.String str7 = e17.f224886a;
                                            if (!android.text.TextUtils.isEmpty(str7)) {
                                                boolean startsWith2 = str7.startsWith(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF);
                                                int i37 = e17.f224887b;
                                                if (startsWith2) {
                                                    ((java.util.ArrayList) list5).add(new xx5.c(dVar, i37, j37));
                                                } else if (str7.startsWith(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD)) {
                                                    ((java.util.ArrayList) list4).add(new xx5.c(dVar, i37, j37));
                                                } else if (str7.startsWith(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL)) {
                                                    ((java.util.ArrayList) list3).add(new xx5.c(dVar, i37, j37));
                                                } else if (str7.startsWith(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT)) {
                                                    ((java.util.ArrayList) list2).add(new xx5.c(dVar, i37, j37));
                                                } else {
                                                    str2 = str;
                                                    if (str7.startsWith(str2)) {
                                                        ((java.util.ArrayList) list).add(new xx5.c(dVar, i37, j37));
                                                        str3 = str6;
                                                        str4 = str5;
                                                        str5 = str4;
                                                        str6 = str3;
                                                        length2 = i29;
                                                        j19 = j29;
                                                        str = str2;
                                                        i28 = i17 + 1;
                                                        listFiles3 = fileArr2;
                                                    } else {
                                                        str3 = str6;
                                                        if (str7.startsWith(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT)) {
                                                            ((java.util.ArrayList) dVar.f458039j).add(new xx5.c(dVar, i37, j37));
                                                            str4 = str5;
                                                            str5 = str4;
                                                            str6 = str3;
                                                            length2 = i29;
                                                            j19 = j29;
                                                            str = str2;
                                                            i28 = i17 + 1;
                                                            listFiles3 = fileArr2;
                                                        } else {
                                                            str4 = str5;
                                                            if (str7.startsWith(str4)) {
                                                                ((java.util.ArrayList) list6).add(new xx5.c(dVar, i37, j37));
                                                            }
                                                            str5 = str4;
                                                            str6 = str3;
                                                            length2 = i29;
                                                            j19 = j29;
                                                            str = str2;
                                                            i28 = i17 + 1;
                                                            listFiles3 = fileArr2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i17 = i28;
                                    }
                                    str2 = str;
                                    str3 = str6;
                                    str4 = str5;
                                    str5 = str4;
                                    str6 = str3;
                                    length2 = i29;
                                    j19 = j29;
                                    str = str2;
                                    i28 = i17 + 1;
                                    listFiles3 = fileArr2;
                                }
                                j17 = j19;
                                j18 = j28;
                            } else {
                                j17 = j19;
                                j18 = 0;
                            }
                            if (j18 > 0) {
                                by5.c4.f("XWebCleaner", ">> getTotalPluginSize, plugin total size:" + by5.u.k(j18));
                                dVar.f458031b = j18;
                            }
                        }
                        j17 = j19;
                    }
                }
                j19 = j17;
            }
            i18 = i27 + 1;
            length = i19;
            listFiles = fileArr;
        }
        long j38 = j19;
        if (j38 > 0) {
            by5.c4.f("XWebCleaner", "checkStorage, xweb total size:" + by5.u.k(j38));
            dVar.f458032c = j38;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
            sb6.append(org.xwalk.core.XWalkEnvironment.d());
            sb6.append(",");
            sb6.append(org.xwalk.core.XWalkEnvironment.j(org.xwalk.core.XWalkEnvironment.f347970c, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO));
            sb6.append(",");
            sb6.append(org.xwalk.core.XWalkEnvironment.j(org.xwalk.core.XWalkEnvironment.f347970c, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF));
            sb6.append(",");
            sb6.append(org.xwalk.core.XWalkEnvironment.j(org.xwalk.core.XWalkEnvironment.f347970c, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD));
            sb6.append(",");
            sb6.append(org.xwalk.core.XWalkEnvironment.j(org.xwalk.core.XWalkEnvironment.f347970c, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL));
            sb6.append(",");
            sb6.append(org.xwalk.core.XWalkEnvironment.j(org.xwalk.core.XWalkEnvironment.f347970c, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT));
            sb6.append(",");
            sb6.append(org.xwalk.core.XWalkEnvironment.j(org.xwalk.core.XWalkEnvironment.f347970c, str));
            sb6.append(",");
            java.util.List list7 = dVar.f458033d;
            sb6.append(dVar.a(list7));
            sb6.append(",");
            sb6.append(dVar.a(list6));
            sb6.append(",");
            sb6.append(dVar.a(list5));
            sb6.append(",");
            sb6.append(dVar.a(list4));
            sb6.append(",");
            sb6.append(dVar.a(list3));
            sb6.append(",");
            sb6.append(dVar.a(list2));
            sb6.append(",");
            sb6.append(dVar.a(list));
            sb6.append(",");
            sb6.append(dVar.f458030a);
            sb6.append(",");
            sb6.append(dVar.f458031b);
            sb6.append(",");
            sb6.append(dVar.f458032c);
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list7).size());
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list6).size());
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list5).size());
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list4).size());
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list3).size());
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list2).size());
            sb6.append(",");
            sb6.append(((java.util.ArrayList) list).size());
            java.lang.String sb7 = sb6.toString();
            by5.c4.f("KVReportForCheckStorage", "report:" + sb7);
            by5.s0.t(24156, sb7);
        }
    }

    public static void c(java.io.File[] fileArr, java.util.HashSet hashSet, int i17, int i18, int i19) {
        for (java.io.File file : fileArr) {
            int e17 = e(file);
            if (e17 < 0) {
                by5.c4.f("XWebCleaner", "clearOldVersion, ignore file:" + file.getName());
            } else {
                if (hashSet.contains("" + e17)) {
                    by5.c4.f("XWebCleaner", "clearOldVersion, version in keep list:" + e17);
                } else {
                    boolean h17 = com.tencent.xweb.b.m().h("keep_nearest_version", "tools", false);
                    zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
                    boolean z17 = true;
                    if (h17 ? e17 <= 0 || e17 >= i17 || e17 == org.xwalk.core.XWalkEnvironment.d() || e17 == i18 || e17 == i19 : e17 <= 0 || e17 > i17 || e17 == org.xwalk.core.XWalkEnvironment.d() || e17 == i18 || e17 == i19) {
                        z17 = false;
                    }
                    if (z17) {
                        try {
                            if (by5.u3.d(e17)) {
                                by5.c4.f("XWebCleaner", "clearOldVersion, keep version:" + e17 + ", core using, shouldKeepNearestVersion:" + h17);
                            } else {
                                h(e17);
                                by5.u.h(file.getAbsolutePath());
                                by5.c4.f("XWebCleaner", "clearOldVersion, clear version:" + e17 + ", core not using, shouldKeepNearestVersion:" + h17);
                                by5.s0.e(577L, 65L, 1L);
                            }
                        } catch (java.lang.Throwable th6) {
                            by5.c4.f("XWebCleaner", "clearOldVersion failed, error:" + th6);
                            by5.s0.e(577L, 66L, 1L);
                        }
                    } else {
                        by5.c4.f("XWebCleaner", "clearOldVersion, keep version:" + e17 + ", shouldKeepNearestVersion:" + h17);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCleanUselessFiles, version:");
                        sb6.append(e17);
                        by5.c4.f("XWebCleaner", sb6.toString());
                        java.io.File file2 = new java.io.File(by5.z3.n(e17));
                        if (file2.exists() && file2.isDirectory()) {
                            java.io.File file3 = new java.io.File(file2, "BrowserMetrics");
                            if (file3.exists() && file3.isDirectory()) {
                                by5.c4.f("XWebCleaner", "tryCleanUselessFiles, delete BrowserMetrics");
                                by5.u.h(file3.getAbsolutePath());
                            }
                            if (!new java.io.File(by5.z3.b(e17)).exists()) {
                                by5.c4.g("XWebCleaner", "tryCleanDownloadedZip, base.apk file not exist");
                            } else if (new java.io.File(by5.z3.f(e17)).exists()) {
                                java.lang.String e18 = by5.z3.e(e17);
                                by5.c4.f("XWebCleaner", "tryCleanDownloadedZip, delete downloaded zip result:" + by5.u.i(e18) + ", path:" + e18);
                                java.lang.String c17 = by5.z3.c(e17);
                                by5.c4.f("XWebCleaner", "tryCleanDownloadedZip, delete downloaded 7zip result:" + by5.u.i(c17) + ", path:" + c17);
                            } else {
                                by5.c4.g("XWebCleaner", "tryCleanDownloadedZip, extracted_core directory not exist");
                            }
                        } else {
                            by5.c4.g("XWebCleaner", "tryCleanUselessFiles, version dir not exist");
                        }
                    }
                }
            }
        }
    }

    public static boolean d(int i17) {
        by5.c4.f("XWebCleaner", "clearVersion start, version:" + i17);
        if (i17 <= 0) {
            by5.c4.g("XWebCleaner", "clearVersion failed, version is not valid");
            return false;
        }
        android.content.Context context = org.xwalk.core.XWalkEnvironment.f347970c;
        if (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().dataDir == null) {
            by5.c4.g("XWebCleaner", "clearVersion failed, context is null");
            return false;
        }
        java.io.File file = new java.io.File(context.getApplicationInfo().dataDir);
        if (!file.exists()) {
            by5.c4.g("XWebCleaner", "clearVersion failed, dataDir not exist");
            return false;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            by5.c4.g("XWebCleaner", "clearVersion failed, files is null");
            return false;
        }
        for (java.io.File file2 : listFiles) {
            int e17 = e(file2);
            if (e17 > 0 && e17 == i17 && by5.u.h(file2.getAbsolutePath())) {
                by5.c4.f("XWebCleaner", "clearVersion, version:" + e17);
                h(i17);
                return true;
            }
            if (file2.getName().equals("app_xweb_data") && file2.isDirectory()) {
                java.io.File[] listFiles2 = file2.listFiles();
                if (listFiles2 == null) {
                    by5.c4.c("XWebCleaner", "clearVersion, subFiles is null");
                } else {
                    for (java.io.File file3 : listFiles2) {
                        int e18 = e(file3);
                        if (e18 > 0 && e18 == i17 && by5.u.h(file2.getAbsolutePath())) {
                            by5.c4.f("XWebCleaner", "clearVersion, version:" + e18);
                            h(e18);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int e(java.io.File file) {
        if (file == null) {
            return -1;
        }
        java.lang.String name = file.getName();
        if (name.startsWith("app_xwalk_") && file.isDirectory()) {
            try {
                return java.lang.Integer.parseInt(name.substring(10));
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebCleaner", "getApkVersion error, strFileName:" + name + ", error", th6);
            }
        } else if (name.startsWith("xweb_") && file.isDirectory()) {
            try {
                return java.lang.Integer.parseInt(name.substring(5));
            } catch (java.lang.Throwable th7) {
                by5.c4.d("XWebCleaner", "getApkVersion error, strFileName:" + name + ", error", th7);
            }
        }
        return -1;
    }

    public static java.io.File f(int i17) {
        try {
            java.lang.String k17 = by5.z3.k(i17, "filelist.config");
            java.io.File file = new java.io.File(k17);
            if (file.exists()) {
                by5.c4.f("XWebCleaner", "getFileListConfigFile, path:" + k17);
                return file;
            }
            java.lang.String g17 = by5.z3.g(i17, "filelist.config");
            java.io.File file2 = new java.io.File(g17);
            if (!file2.exists()) {
                return null;
            }
            by5.c4.f("XWebCleaner", "getFileListConfigFile, path:" + g17);
            return file2;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebCleaner", "getFileListConfigFile error", th6);
            return null;
        }
    }

    public static long g(xx5.d dVar, java.io.File file, java.lang.String str) {
        long j17 = by5.u.j(file, false);
        long j18 = 0;
        if (j17 > 0) {
            j18 = 0 + j17;
            by5.c4.f("XWebCleaner", ">>>> getTotalCoreSize, xweb dir:" + str + ", size:" + by5.u.k(j17));
            int e17 = e(file);
            if (e17 > 0) {
                ((java.util.ArrayList) dVar.f458033d).add(new xx5.c(dVar, e17, j17));
            }
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    by5.c4.f("XWebCleaner", ">>>> getTotalCoreSize, xweb sub dir:" + file2.getName() + ", size:" + by5.u.k(by5.u.j(file2, true)));
                }
            }
        }
        return j18;
    }

    public static void h(int i17) {
        java.lang.String str;
        by5.c4.f("XWebCleaner", "tryCleanVersionCache, version:" + i17);
        android.content.Context context = org.xwalk.core.XWalkEnvironment.f347970c;
        java.lang.String str2 = null;
        if (context == null || context.getCacheDir() == null) {
            str = null;
        } else {
            str = org.xwalk.core.XWalkEnvironment.f347970c.getCacheDir() + java.io.File.separator + "xweb_cache";
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (str != null) {
            str2 = str + java.io.File.separator + "xweb_" + i17;
            java.io.File file2 = new java.io.File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        }
        if (str2 == null) {
            by5.c4.g("XWebCleaner", "tryCleanVersionCache, cacheDir is null");
            return;
        }
        java.io.File file3 = new java.io.File(str2);
        if (file3.exists() && file3.isDirectory()) {
            by5.c4.f("XWebCleaner", "tryCleanVersionCache, delete cacheDir:" + file3.getAbsolutePath());
            by5.u.h(file3.getAbsolutePath());
        }
    }

    public static void i(android.content.Context context, boolean z17) {
        if (!z17 && !by5.v.a("CLEAR_OLD_APK", 86400000L)) {
            by5.c4.f("XWebCleaner", "tryClearOldVersion, time not up");
            return;
        }
        if (context == null) {
            by5.c4.c("XWebCleaner", "clearOldVersion failed, invalid context");
            return;
        }
        java.io.File file = new java.io.File(context.getApplicationInfo().dataDir);
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            by5.c4.c("XWebCleaner", "clearOldVersion failed, files is null");
            return;
        }
        int d17 = org.xwalk.core.XWalkEnvironment.d();
        int i17 = 0;
        for (java.io.File file2 : listFiles) {
            int e17 = e(file2);
            if (e17 >= 0 && e17 != d17 && e17 >= i17) {
                i17 = e17;
            }
        }
        java.io.File[] listFiles2 = new java.io.File(file, "app_xweb_data").listFiles();
        if (listFiles2 == null) {
            by5.c4.g("XWebCleaner", "clearOldVersion, filesNew is null");
        } else {
            int i18 = 0;
            for (java.io.File file3 : listFiles2) {
                int e18 = e(file3);
                if (e18 >= 0 && e18 != d17 && e18 >= i18) {
                    i18 = e18;
                }
            }
            i17 = java.lang.Math.max(i18, i17);
        }
        int g17 = org.xwalk.core.XWalkEnvironment.g("armeabi-v7a");
        int g18 = org.xwalk.core.XWalkEnvironment.g("arm64-v8a");
        by5.c4.f("XWebCleaner", "clearOldVersion, availableVersion:" + d17 + ", newstVersion:" + i17 + ", newstVerForArm32:" + g17 + ", newstVerForArm64:" + g18);
        java.lang.String g19 = com.tencent.xweb.b.m().g("KEEP_XWEB_CORE_LIST", "tools");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getKeepVersionSet, KEEP_XWEB_CORE_LIST:");
        sb6.append(g19);
        by5.c4.f("XWebCleaner", sb6.toString());
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!android.text.TextUtils.isEmpty(g19)) {
            java.lang.String[] split = g19.split(";");
            if (split.length > 0) {
                for (java.lang.String str : split) {
                    if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str.trim())) {
                        hashSet.add(str.trim());
                    }
                }
            }
        }
        c(listFiles, hashSet, i17, g17, g18);
        if (listFiles2 != null) {
            c(listFiles2, hashSet, i17, g17, g18);
        }
    }

    public static void j(android.content.Context context, boolean z17) {
        if (z17 || by5.v.a("clear_test_settings", 2592000000L)) {
            by5.c4.f("XWebCleaner", "tryClearTestSetting");
            try {
                com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
                android.content.SharedPreferences e17 = by5.d4.e();
                if (e17 != null) {
                    e17.edit().clear().commit();
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebCleaner", "tryClearTestSetting error", th6);
            }
        }
    }
}
