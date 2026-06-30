package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f301874a = {"ppt", "pptx", "xls", "xlsx", "doc", "docx", "wps", "et", "dps", "pdf", "txt", "mp3", "m4a", "wav", "aac"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f301875b = {"mp3", "m4a", "wav", "aac"};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f301876c = {"ppt", "pptx", "xls", "xlsx", "doc", "docx", "wps", "et", "dps"};

    public static int a(cy5.y yVar, boolean z17, int i17) {
        if (yVar == null) {
            by5.c4.c("XFilesReaderHelper", "canExplicitInstall error, readerPlugin is null");
            return -1;
        }
        by5.c4.f("XFilesReaderHelper", "canExplicitInstall plugin:" + yVar.m() + ", curVersion: " + yVar.f306412a + ", require: " + i17 + ", embedVersion: -1, canTryEmbed: false, canExplicitDownload: " + z17);
        if (com.p314xaae8f345.p3210x3857dc.g2.a()) {
            by5.c4.f("XFilesReaderHelper", "canExplicitInstall forbid download code");
            by5.c4.f("XFilesReaderHelper", "canExplicitInstall no embed");
            return -2;
        }
        if (z17) {
            by5.c4.f("XFilesReaderHelper", "canExplicitInstall can download");
            return 1;
        }
        by5.c4.f("XFilesReaderHelper", "canExplicitInstall can not explicit download");
        by5.c4.f("XFilesReaderHelper", "canExplicitInstall no embed");
        return -3;
    }

    public static java.lang.String b(int i17) {
        return i17 == 40 ? "hardcode" : i17 == 41 ? "force" : i17 == 42 ? "cmd" : i17 == 43 ? "xfile_recent_crash" : i17 == 44 ? "xfile_forbid_download" : i17 == 45 ? "xfile_not_installed" : i17 == 46 ? "xfile_too_old" : i17 == 47 ? "xfile_not_support" : i17 == 48 ? "xfile_context_error" : i17 == 49 ? "xfile_inner_error" : i17 == 50 ? "miniqb_error" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }

    public static void c(android.content.Intent intent, int i17) {
        if (intent != null) {
            intent.putExtra("open_x5_from_scene", i17);
        }
    }

    public static long d(android.content.Context context) {
        by5.c4.f("XFilesReaderHelper", "getCurrentProcessMemory start");
        try {
            if (context == null) {
                by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory failed, context is null");
                return 0L;
            }
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager == null) {
                by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory failed, activityManager is null");
                return 0L;
            }
            android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
            if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                long totalPrivateClean = (processMemoryInfo[0].getTotalPrivateClean() + processMemoryInfo[0].getTotalPrivateDirty()) / 1024;
                by5.c4.f("XFilesReaderHelper", "getCurrentProcessMemory " + totalPrivateClean);
                return totalPrivateClean;
            }
            by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory failed, memoryInfo is empty");
            return 0L;
        } catch (java.lang.Throwable th6) {
            by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory error, msg:" + th6.getMessage());
            return 0L;
        }
    }

    public static int e(java.util.HashMap hashMap) {
        try {
            if (hashMap == null) {
                by5.c4.c("XFilesReaderHelper", "getOpenFileFrom failed, extra params is null");
                return 0;
            }
            java.lang.String str = (java.lang.String) hashMap.get("extra_param_open_file_from");
            if (str != null && !str.isEmpty()) {
                return java.lang.Integer.parseInt(str);
            }
            by5.c4.c("XFilesReaderHelper", "getOpenFileFrom failed, strScene is empty");
            return 0;
        } catch (java.lang.Exception e17) {
            by5.c4.c("XFilesReaderHelper", "getOpenFileFrom error: " + e17.getMessage());
            return 0;
        }
    }

    public static int f(java.util.HashMap hashMap) {
        try {
            if (hashMap == null) {
                by5.c4.c("XFilesReaderHelper", "getOpenFileScene failed, extra params is null");
                return 0;
            }
            java.lang.String str = (java.lang.String) hashMap.get("extra_param_open_file_scene");
            if (str != null && !str.isEmpty()) {
                return java.lang.Integer.parseInt(str);
            }
            by5.c4.c("XFilesReaderHelper", "getOpenFileScene failed, strScene is empty");
            return 0;
        } catch (java.lang.Exception e17) {
            by5.c4.c("XFilesReaderHelper", "getOpenFileScene error: " + e17.getMessage());
            return 0;
        }
    }

    public static cy5.h g(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase("ppt") || str.equalsIgnoreCase("pptx") || str.equalsIgnoreCase("dps")) {
            return j(str, true) ? cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4) : cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c);
        }
        if (str.equalsIgnoreCase("pdf")) {
            return cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa);
        }
        if (str.equalsIgnoreCase("doc") || str.equalsIgnoreCase("docx") || str.equalsIgnoreCase("wps")) {
            return j(str, true) ? cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4) : cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32);
        }
        if (str.equalsIgnoreCase("xls") || str.equalsIgnoreCase("xlsx") || str.equalsIgnoreCase("et")) {
            return j(str, true) ? cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4) : cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f);
        }
        if (str.equalsIgnoreCase("txt")) {
            return cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228);
        }
        return null;
    }

    public static com.p314xaae8f345.p3210x3857dc.k h(java.lang.String str, boolean z17, android.content.Intent intent) {
        boolean z18;
        int a17;
        c(intent, 40);
        com.p314xaae8f345.p3210x3857dc.k kVar = com.p314xaae8f345.p3210x3857dc.k.X5;
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "getReaderType fileExt is empty, use x5");
            return kVar;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.p314xaae8f345.p3210x3857dc.c z19 = com.p314xaae8f345.p3210x3857dc.c.z();
        com.p314xaae8f345.p3210x3857dc.k y17 = z19.y(lowerCase, z19.A());
        by5.c4.f("XFilesReaderHelper", "getReaderType cmd type: " + y17.toString());
        c(intent, 42);
        if (y17 == kVar) {
            by5.c4.f("XFilesReaderHelper", "getReaderType use x5");
            return kVar;
        }
        if (!lowerCase.isEmpty()) {
            java.lang.String[] strArr = f301874a;
            for (int i17 = 0; i17 < 15; i17++) {
                if (lowerCase.equalsIgnoreCase(strArr[i17])) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!z18) {
            by5.c4.f("XFilesReaderHelper", "getReaderType not support " + lowerCase + ", use x5");
            c(intent, 47);
            return kVar;
        }
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        android.content.SharedPreferences e17 = by5.d4.e();
        if (!(e17 == null ? false : e17.getBoolean("fr_disable_crash_detect", false)) && com.p314xaae8f345.p3210x3857dc.g.a(lowerCase)) {
            by5.c4.f("XFilesReaderHelper", "getReaderType recent crashed, use x5");
            c(intent, 43);
            return kVar;
        }
        boolean k17 = k(lowerCase);
        com.p314xaae8f345.p3210x3857dc.k kVar2 = com.p314xaae8f345.p3210x3857dc.k.XWEB;
        if (k17) {
            by5.c4.f("XFilesReaderHelper", "getReaderType is supported audio file, use xweb");
            return kVar2;
        }
        if (!z17) {
            by5.c4.f("XFilesReaderHelper", "getReaderType skip check plugin, use xweb");
            return kVar2;
        }
        cy5.h g17 = g(lowerCase);
        if (!(g17 instanceof cy5.y)) {
            by5.c4.f("XFilesReaderHelper", "getReaderType can not find plugin, not support " + lowerCase + ", use x5");
            c(intent, 47);
            return kVar;
        }
        cy5.y yVar = (cy5.y) g17;
        int f17 = yVar.f(true);
        int C = yVar.C(0);
        if ((f17 > 0 && f17 >= C) || (a17 = a(yVar, com.p314xaae8f345.p3210x3857dc.c.z().v(true), C)) > 0) {
            by5.c4.f("XFilesReaderHelper", "getReaderType version support, use xweb");
            return kVar2;
        }
        by5.c4.f("XFilesReaderHelper", "getReaderType can not explicit install, use x5");
        if (a17 == -2) {
            c(intent, 44);
        } else if (a17 == -3) {
            c(intent, f17 <= 0 ? 45 : 46);
        }
        return kVar;
    }

    public static com.p314xaae8f345.p3210x3857dc.l i(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "getReportTarget fileExt is null");
            return null;
        }
        if (str.equalsIgnoreCase("ppt")) {
            return new com.p314xaae8f345.p3210x3857dc.l(j(str, false) ? 1880 : 1068, false);
        }
        if (str.equalsIgnoreCase("pptx")) {
            return new com.p314xaae8f345.p3210x3857dc.l(j(str, false) ? 1880 : 1068, true);
        }
        if (str.equalsIgnoreCase("xls")) {
            return new com.p314xaae8f345.p3210x3857dc.l(j(str, false) ? 1879 : 1070, false);
        }
        if (str.equalsIgnoreCase("xlsx")) {
            return new com.p314xaae8f345.p3210x3857dc.l(j(str, false) ? 1879 : 1070, true);
        }
        if (str.equalsIgnoreCase("doc")) {
            return new com.p314xaae8f345.p3210x3857dc.l(j(str, false) ? 1891 : 1069, false);
        }
        if (str.equalsIgnoreCase("docx")) {
            return new com.p314xaae8f345.p3210x3857dc.l(j(str, false) ? 1891 : 1069, true);
        }
        if (str.equalsIgnoreCase("pdf")) {
            return new com.p314xaae8f345.p3210x3857dc.l(1071, false);
        }
        if (str.equalsIgnoreCase("txt")) {
            return new com.p314xaae8f345.p3210x3857dc.l(1889, false);
        }
        if (k(str)) {
            return new com.p314xaae8f345.p3210x3857dc.l(1900, false);
        }
        return null;
    }

    public static boolean j(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p3210x3857dc.m b17 = com.p314xaae8f345.p3210x3857dc.t0.f302127a.b(str);
        if (z17) {
            by5.c4.f("XFilesReaderHelper", "getUseOfficeReader force = " + b17.toString());
        }
        if (b17 == com.p314xaae8f345.p3210x3857dc.m.none) {
            com.p314xaae8f345.p3210x3857dc.c z18 = com.p314xaae8f345.p3210x3857dc.c.z();
            z18.getClass();
            b17 = z18.x(str, org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m("tools"));
            if (z17) {
                by5.c4.f("XFilesReaderHelper", "getUseOfficeReader cmd = " + b17.toString());
            }
        }
        return b17 != com.p314xaae8f345.p3210x3857dc.m.no;
    }

    public static boolean k(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            java.lang.String[] strArr = f301875b;
            for (int i17 = 0; i17 < 4; i17++) {
                if (str.equalsIgnoreCase(strArr[i17])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void l(java.lang.String str, int i17, java.lang.String str2, java.lang.Throwable th6) {
        if (str == null || str.isEmpty() || str2 == null || th6 == null) {
            by5.c4.c("XFilesReaderHelper", "reportException wrong param");
            return;
        }
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th6.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.lang.String stringWriter2 = stringWriter.toString();
            java.lang.String str3 = "empty";
            if (stringWriter2.isEmpty()) {
                stringWriter2 = "empty";
            }
            java.lang.String replace = stringWriter2.substring(0, java.lang.Math.min(stringWriter2.length(), 1000)).replace(',', ' ').replace(':', ' ');
            java.lang.String str4 = str2 + " " + th6.getMessage();
            if (!str4.isEmpty()) {
                str3 = str4;
            }
            java.lang.String str5 = i17 + "," + str + "," + replace + "," + str3.substring(0, java.lang.Math.min(str3.length(), 1000)).replace(',', ' ').replace(':', ' ');
            by5.c4.b("XFilesReaderHelper", "reportException kv key:17565, val:" + str5);
            by5.s0.t(17565, str5);
        } catch (java.lang.Throwable th7) {
            by5.c4.d("XFilesReaderHelper", "reportException error", th7);
        }
    }

    public static long m(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportFileSize param is null");
            return 0L;
        }
        java.lang.String lowerCase = str2.toLowerCase();
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            by5.c4.c("XFilesReaderHelper", "reportFileSize file not exist");
            return 0L;
        }
        long length = file.length() / 1048576;
        if (length == 0) {
            length++;
        }
        java.lang.String str3 = (lowerCase.length() > 50 ? lowerCase.substring(0, 50) : lowerCase) + "," + length;
        by5.c4.b("XFilesReaderHelper", "reportFileSize kv key:17562, val:" + str3);
        by5.s0.t(17562, str3);
        com.p314xaae8f345.p3210x3857dc.l i17 = i(lowerCase);
        if (i17 == null) {
            by5.c4.b("XFilesReaderHelper", "reportFileSize idkey skip ".concat(lowerCase));
            return length;
        }
        boolean z17 = i17.f301860b;
        int i18 = length <= 10 ? z17 ? 24 : 20 : length <= 20 ? z17 ? 25 : 21 : length <= 50 ? z17 ? 26 : 22 : z17 ? 27 : 23;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportFileSize idkey id:");
        int i19 = i17.f301859a;
        sb6.append(i19);
        sb6.append(", key:");
        sb6.append(i18);
        by5.c4.b("XFilesReaderHelper", sb6.toString());
        by5.s0.e(i19, i18, 1L);
        return length;
    }

    public static void n(java.lang.String str, int i17) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportIDKeyByFileExt param is null");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.p314xaae8f345.p3210x3857dc.l i18 = i(lowerCase);
        if (i18 == null) {
            by5.c4.b("XFilesReaderHelper", "reportIDKeyByFileExt skip " + lowerCase);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportIDKeyByFileExt id:");
        int i19 = i18.f301859a;
        sb6.append(i19);
        sb6.append(", key:");
        sb6.append(i17);
        by5.c4.b("XFilesReaderHelper", sb6.toString());
        by5.s0.e(i19, i17, 1L);
    }

    public static void o(com.p314xaae8f345.p3210x3857dc.j jVar) {
        if (jVar == null) {
            by5.c4.c("XFilesReaderHelper", "reportOpenFile failed, data is null");
            return;
        }
        java.lang.String str = "android," + jVar.f301835a + "," + jVar.f301836b + "," + jVar.f301837c + "," + jVar.f301838d + "," + jVar.f301839e + "," + jVar.f301840f + "," + jVar.f301841g + "," + jVar.f301842h;
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportOpenFile failed, reportVal is empty");
        } else {
            by5.c4.f("XFilesReaderHelper", "reportOpenFile kv key:25414, val:".concat(str));
            by5.s0.t(25414, str);
        }
    }

    public static void p(com.p314xaae8f345.p3210x3857dc.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        if (jVar == null) {
            by5.c4.c("XFilesReaderHelper", "reportOpenFileRet failed, data is null");
            return;
        }
        java.lang.String str3 = jVar.f301847m;
        if (str3 != null && !str3.isEmpty()) {
            try {
                str = str3.substring(0, java.lang.Math.min(str3.length(), 150)).replace(',', ' ').replace(':', ' ');
            } catch (java.lang.Throwable th6) {
                by5.c4.c("XFilesReaderHelper", "getSafeMsg error: " + th6.getMessage());
            }
            str2 = "android," + jVar.f301835a + "," + jVar.f301836b + "," + jVar.f301837c + "," + jVar.f301838d + "," + jVar.f301839e + "," + jVar.f301840f + "," + jVar.f301841g + "," + jVar.f301842h + "," + jVar.f301843i + "," + jVar.f301844j + "," + jVar.f301845k + "," + jVar.f301846l + "," + str + "," + jVar.f301848n;
            if (str2 != null || str2.isEmpty()) {
                by5.c4.c("XFilesReaderHelper", "reportOpenFileRet failed, reportVal is empty");
            } else {
                by5.c4.f("XFilesReaderHelper", "reportOpenFileRet kv key:25415, val:".concat(str2));
                by5.s0.t(25415, str2);
                return;
            }
        }
        str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        str2 = "android," + jVar.f301835a + "," + jVar.f301836b + "," + jVar.f301837c + "," + jVar.f301838d + "," + jVar.f301839e + "," + jVar.f301840f + "," + jVar.f301841g + "," + jVar.f301842h + "," + jVar.f301843i + "," + jVar.f301844j + "," + jVar.f301845k + "," + jVar.f301846l + "," + str + "," + jVar.f301848n;
        if (str2 != null) {
        }
        by5.c4.c("XFilesReaderHelper", "reportOpenFileRet failed, reportVal is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.StringBuilder] */
    public static void q(java.lang.String str, java.lang.String str2) {
        char c17;
        int i17;
        ?? r76;
        java.lang.String str3;
        boolean z17;
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportPVUV param is null");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.p314xaae8f345.p3210x3857dc.l i18 = i(lowerCase);
        if (i18 == null) {
            by5.c4.b("XFilesReaderHelper", "reportPVUV skip " + lowerCase + ", " + str2);
            return;
        }
        boolean equalsIgnoreCase = "XWEB".equalsIgnoreCase(str2);
        boolean z18 = i18.f301860b;
        if (equalsIgnoreCase) {
            r76 = z18;
            i17 = z18 ? 3 : 2;
        } else {
            if ("X5".equalsIgnoreCase(str2)) {
                c17 = z18 ? (char) 5 : (char) 4;
                i17 = z18 ? 7 : 6;
            } else if ("QQBROWSER".equalsIgnoreCase(str2)) {
                c17 = z18 ? (char) 17 : (char) 16;
                i17 = z18 ? 19 : 18;
            } else if (!"THIRDAPP".equalsIgnoreCase(str2)) {
                by5.c4.c("XFilesReaderHelper", "reportPVUV unknown type, skip");
                return;
            } else {
                c17 = z18 ? '\t' : '\b';
                i17 = z18 ? 11 : 10;
            }
            r76 = c17;
        }
        try {
            str3 = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        } catch (java.lang.Throwable th6) {
            by5.c4.c("XFilesReaderHelper", "reportPVUV get cur date error: " + th6.getMessage());
            str3 = "";
        }
        java.lang.String str4 = lowerCase + "_" + str2 + "__report_uv_date";
        android.content.SharedPreferences b17 = by5.d4.b();
        if (b17 != null) {
            z17 = !b17.getString(str4, "").equals(str3);
        } else {
            by5.c4.c("XFilesReaderHelper", "reportPVUV sp is null, skip uv report");
            z17 = false;
        }
        ?? sb6 = new java.lang.StringBuilder("reportPV id:");
        int i19 = i18.f301859a;
        sb6.append(i19);
        sb6.append(", key:");
        sb6.append(r76);
        by5.c4.b("XFilesReaderHelper", sb6.toString());
        by5.s0.e(i19, (long) r76, 1L);
        if (z17) {
            by5.c4.b("XFilesReaderHelper", "reportUV id:" + i19 + ", key:" + i17);
            by5.s0.e((long) i19, (long) i17, 1L);
            android.content.SharedPreferences.Editor edit = b17.edit();
            if (edit == null) {
                by5.c4.c("XFilesReaderHelper", "reportPVUV editor is null, skip");
            } else {
                edit.putString(str4, str3);
                edit.commit();
            }
        }
    }

    public static void r(java.lang.String str, int i17, int i18, android.content.Context context, com.p314xaae8f345.p3210x3857dc.j jVar) {
        java.lang.String str2;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        java.lang.String str3;
        java.lang.String str4;
        if (jVar != null) {
            if (i18 == 0) {
                str4 = ya.b.f77504xbb80cbe3;
            } else if (i18 == -1) {
                str4 = "forbid_download_code";
            } else if (i18 == -2) {
                str4 = "plugin_not_installed";
            } else if (i18 == -3) {
                str4 = "invoke_error";
            } else if (i18 == -4) {
                str4 = "init_error";
            } else if (i18 == -5) {
                str4 = "wrong_param";
            } else if (i18 == -6) {
                str4 = "file_not_exist";
            } else if (i18 == -7) {
                str4 = "file_not_support";
            } else if (i18 == -8) {
                str4 = "task_exist";
            } else if (i18 == -9) {
                str4 = "task_prepare_error";
            } else if (i18 == -10) {
                str4 = "task_run_error";
            } else if (i18 == -11) {
                str4 = "version_too_old";
            } else if (i18 == -12) {
                str4 = "password_error";
            } else if (i18 == -13) {
                str4 = "so_error";
            } else if (i18 == -14) {
                str4 = "view_destroy";
            } else {
                if (i18 == -15) {
                    str4 = "download_cancel";
                } else if (i18 == -18) {
                    str4 = "download_start_failed";
                } else if (i18 == -19) {
                    str4 = "download_no_network";
                    str3 = str4;
                    str2 = "XFilesReaderHelper";
                    i27 = -1;
                    i19 = -2;
                    i28 = -3;
                    i29 = -4;
                    jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                    p(jVar);
                } else if (i18 == -20) {
                    str4 = "download_no_need_to_fetch_config";
                    str3 = str4;
                    str2 = "XFilesReaderHelper";
                    i27 = -1;
                    i19 = -2;
                    i28 = -3;
                    i29 = -4;
                    jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                    p(jVar);
                } else {
                    if (i18 == -21) {
                        str4 = "download_others_is_updating";
                    } else if (i18 == -22) {
                        str4 = "download_config_download_failed";
                    } else if (i18 == -23) {
                        str4 = "download_config_parse_failed";
                    } else if (i18 == -24) {
                        str4 = "download_no_plugin_in_config";
                    } else if (i18 == -25) {
                        str4 = "download_no_available_update";
                    } else if (i18 == -26) {
                        str4 = "download_plugin_update_error";
                    } else if (i18 == -27) {
                        str4 = "download_plugin_only_download_error";
                    } else if (i18 == -28) {
                        str4 = "download_plugin_only_install_error";
                    } else if (i18 == -17) {
                        str4 = "disable_password";
                    } else {
                        by5.c4.c("XFilesReaderHelper", "convertXWebErrorCodeToMsg unknown code: " + i18);
                        str3 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                        str2 = "XFilesReaderHelper";
                        i27 = -1;
                        i19 = -2;
                        i28 = -3;
                        i29 = -4;
                        jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                        p(jVar);
                    }
                    str3 = str4;
                    str2 = "XFilesReaderHelper";
                    i27 = -1;
                    i19 = -2;
                    i28 = -3;
                    i29 = -4;
                    jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                    p(jVar);
                }
                str3 = str4;
                str2 = "XFilesReaderHelper";
                i27 = -1;
                i19 = -2;
                i28 = -3;
                i29 = -4;
                jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                p(jVar);
            }
            str3 = str4;
            str2 = "XFilesReaderHelper";
            i27 = -1;
            i19 = -2;
            i28 = -3;
            i29 = -4;
            jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
            p(jVar);
        } else {
            str2 = "XFilesReaderHelper";
            i19 = -2;
            i27 = -1;
            i28 = -3;
            i29 = -4;
        }
        if (str == null || str.isEmpty()) {
            by5.c4.c(str2, "reportXWebErrorCode param is null");
            return;
        }
        if (i18 == 0) {
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.p314xaae8f345.p3210x3857dc.l i38 = i(lowerCase);
        if (i38 == null) {
            by5.c4.b(str2, "reportXWebErrorCode skip " + lowerCase);
            return;
        }
        java.lang.String str5 = i17 + "," + lowerCase + "," + i18 + ",xweb";
        by5.c4.b(str2, "reportXWebErrorCode kv key:17566, val:" + str5);
        by5.s0.t(17566, str5);
        int i39 = i38.f301860b ? 13 : 12;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportXWebErrorCode first idkey id:");
        int i47 = i38.f301859a;
        sb6.append(i47);
        sb6.append(", key:");
        sb6.append(i39);
        by5.c4.b(str2, sb6.toString());
        long j17 = i47;
        by5.s0.e(j17, i39, 1L);
        if (i18 == i27) {
            i37 = 151;
        } else if (i18 == i19) {
            i37 = 152;
        } else if (i18 == i28) {
            i37 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
        } else if (i18 == i29) {
            i37 = 154;
        } else if (i18 == -5) {
            i37 = 155;
        } else if (i18 == -6) {
            i37 = 156;
        } else if (i18 == -7) {
            i37 = 157;
        } else if (i18 == -8) {
            i37 = 158;
        } else if (i18 == -9) {
            i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de;
        } else if (i18 == -10) {
            i37 = 160;
        } else if (i18 == -11) {
            i37 = 161;
        } else if (i18 == -12) {
            i37 = 162;
        } else if (i18 == -13) {
            i37 = 163;
        } else if (i18 == -14) {
            i37 = 164;
        } else if (i18 == -15) {
            i37 = 165;
        } else if (i18 == -18 || i18 == -19 || i18 == -20 || i18 == -21 || i18 == -22 || i18 == -23 || i18 == -24 || i18 == -25 || i18 == -26 || i18 == -27 || i18 == -28) {
            i37 = 166;
        } else {
            if (i18 != -17) {
                by5.c4.c(str2, "reportXWebErrorCode idkey unknown ret: " + i18);
                return;
            }
            i37 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727;
        }
        by5.c4.b(str2, "reportXWebErrorCode second idkey id:" + i47 + ", key:" + i37);
        by5.s0.e(j17, (long) i37, 1L);
    }
}
