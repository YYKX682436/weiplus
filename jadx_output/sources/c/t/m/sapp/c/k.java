package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class k {
    public static boolean a(android.content.Context context, int i17) {
        try {
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses().iterator();
            while (it.hasNext()) {
                if (it.next().pid == i17) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static int b(android.content.Context context) {
        java.util.List<c.t.m.sapp.c.a> d17 = c.t.m.sapp.c.q.d(c.t.m.sapp.c.q.c(context, "__SP_Tencent_Loc_COMP_INFO__sapp_", ""));
        int e17 = e(context);
        if (e17 <= 3) {
            c.t.m.sapp.c.q.d(context, "__pro_dex_load_info___sapp", "default");
        }
        if (d17.size() == 0) {
            return 0;
        }
        java.lang.String c17 = c.t.m.sapp.c.q.c(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
        if (c17 == null || c17.equals("")) {
            return 1;
        }
        return a(d17, c.t.m.sapp.c.q.d(c17)) ? e17 <= 3 ? 2 : 3 : e17 <= 3 ? 6 : 5;
    }

    public static boolean c(android.content.Context context) {
        java.lang.String a17;
        if (!c.t.m.sapp.c.q.c(context, "__SP_UPDATE_TencentLoc_COMP_SDK_VER__sapp_", "").equals(c.t.m.sapp.c.g.f36890a)) {
            return false;
        }
        java.lang.String c17 = c.t.m.sapp.c.q.c(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
        if (c17 == null || c17.equals("")) {
            return false;
        }
        java.util.List<c.t.m.sapp.c.a> d17 = c.t.m.sapp.c.q.d(c17);
        if (d17.isEmpty()) {
            return false;
        }
        java.lang.String c18 = c.t.m.sapp.c.q.c(context, "__bad_dex_info___sapp", "preference_default_sapp");
        java.util.List<c.t.m.sapp.c.a> d18 = c.t.m.sapp.c.q.d(c18);
        if (!c18.equals("preference_default_sapp") && !d18.isEmpty() && a(d17, d18)) {
            return false;
        }
        byte[] bArr = new byte[2048];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getFilesDir().getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append(c.t.m.sapp.c.q.f36916b);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = context.getFilesDir().getAbsolutePath() + str + "TencentLocation_sapp/UpCp";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = true;
        for (c.t.m.sapp.c.a aVar : d17) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str2);
            java.lang.String str3 = java.io.File.separator;
            sb8.append(str3);
            sb8.append(aVar.f36857c);
            java.util.List<c.t.m.sapp.c.a> list = d17;
            java.lang.String str4 = str2;
            if (c.t.m.sapp.c.q.b(context, sb8.toString(), sb7, "tmp_backup__sapp" + aVar.f36857c, aVar.f36858d, bArr)) {
                arrayList.add(aVar);
                d17 = list;
                str2 = str4;
            } else {
                java.io.File file = new java.io.File(sb7 + str3 + "tmp_backup__sapp" + aVar.f36857c);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
                d17 = list;
                str2 = str4;
                z17 = false;
            }
        }
        java.util.List<c.t.m.sapp.c.a> list2 = d17;
        if (!z17) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.io.File file2 = new java.io.File(sb7 + java.io.File.separator + "tmp_backup__sapp" + ((c.t.m.sapp.c.a) it.next()).f36857c);
                if (file2.exists() && file2.isFile()) {
                    file2.delete();
                }
            }
            arrayList.clear();
            return false;
        }
        if (list2.size() != arrayList.size()) {
            return false;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            c.t.m.sapp.c.a aVar2 = (c.t.m.sapp.c.a) it6.next();
            java.io.File file3 = new java.io.File(sb7, aVar2.f36857c);
            if (file3.exists() && file3.isFile()) {
                file3.delete();
            }
            if (new java.io.File(sb7, "tmp_backup__sapp" + aVar2.f36857c).renameTo(file3) && ((a17 = c.t.m.sapp.c.q.a(file3)) == null || !a17.equals(aVar2.f36859e))) {
                return false;
            }
        }
        java.lang.String a18 = c.t.m.sapp.c.q.a(arrayList);
        c.t.m.sapp.c.q.d(context, "__SP_Tencent_Loc_COMP_INFO__sapp_", a18);
        c.t.m.sapp.c.e.a(context).a("DBC", a18);
        return true;
    }

    public static boolean d(android.content.Context context) {
        boolean z17;
        java.lang.String c17 = c.t.m.sapp.c.q.c(context);
        if (!c.t.m.sapp.c.q.a(c17)) {
            c.t.m.sapp.c.i.a("clear private dir failed");
        }
        java.lang.String str = "TencentLocationComp_sapp";
        java.lang.String b17 = c.t.m.sapp.c.q.b(context, "TencentLocationComp_sapp" + java.io.File.separator + "comp_list");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("base comp info:");
        sb6.append(b17);
        c.t.m.sapp.c.i.a(sb6.toString());
        java.util.List<c.t.m.sapp.c.a> d17 = c.t.m.sapp.c.q.d(b17);
        byte[] bArr = new byte[2048];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<c.t.m.sapp.c.a> it = d17.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = true;
                break;
            }
            c.t.m.sapp.c.a next = it.next();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str);
            java.lang.String str2 = java.io.File.separator;
            sb7.append(str2);
            sb7.append(next.f36857c);
            java.lang.String sb8 = sb7.toString();
            next.f36857c += com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
            java.lang.String str3 = "tmp_asset__sapp" + next.f36857c;
            java.lang.String str4 = str;
            java.util.Iterator<c.t.m.sapp.c.a> it6 = it;
            if (c.t.m.sapp.c.q.a(context, sb8, c17, str3, next.f36858d, bArr)) {
                arrayList.add(next);
                it = it6;
                str = str4;
            } else {
                java.io.File file = new java.io.File(c17 + str2 + str3);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
                z17 = false;
            }
        }
        if (!z17) {
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                java.io.File file2 = new java.io.File(c17 + java.io.File.separator + "tmp_asset__sapp" + ((c.t.m.sapp.c.a) it7.next()).f36857c);
                if (file2.exists() && file2.isFile()) {
                    file2.delete();
                }
            }
            return false;
        }
        if (arrayList.size() != d17.size()) {
            return false;
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            c.t.m.sapp.c.a aVar = (c.t.m.sapp.c.a) it8.next();
            java.io.File file3 = new java.io.File(c17, aVar.f36857c);
            if (file3.exists() && file3.isFile()) {
                file3.delete();
            }
            new java.io.File(c17, "tmp_asset__sapp" + aVar.f36857c).renameTo(file3);
        }
        c.t.m.sapp.c.q.d(context, "__SP_Tencent_Loc_COMP_INFO__sapp_", c.t.m.sapp.c.q.a(d17));
        return true;
    }

    public static int e(android.content.Context context) {
        java.lang.String c17 = c.t.m.sapp.c.q.c(context, "__pro_dex_load_info___sapp", "default");
        boolean z17 = true;
        if (c17.equals("default")) {
            return 1;
        }
        try {
            java.lang.String[] split = c17.split("#");
            if (split != null && split.length > 0) {
                boolean z18 = true;
                for (java.lang.String str : split) {
                    java.lang.String[] split2 = str.split("&");
                    if (split2 != null && split2.length == 2) {
                        java.lang.String str2 = split2[1];
                        if (a(context, java.lang.Integer.parseInt(split2[0]))) {
                            z18 = false;
                        }
                    }
                }
                z17 = z18;
            }
            return z17 ? 3 : 4;
        } catch (java.lang.Exception unused) {
            return 4;
        }
    }

    public static void f(android.content.Context context) {
        java.lang.String d17 = c.t.m.sapp.c.q.d(context);
        if (d17 == null) {
            return;
        }
        int g17 = c.t.m.sapp.c.q.g();
        java.lang.String c17 = c.t.m.sapp.c.q.c(context, "__pro_dex_load_info___sapp", "default");
        if (c17.equals("default")) {
            c.t.m.sapp.c.q.d(context, "__pro_dex_load_info___sapp", g17 + "&" + d17 + "#");
            return;
        }
        try {
            java.lang.String[] split = c17.split("#");
            if (split == null || split.length <= 0) {
                return;
            }
            boolean z17 = false;
            for (int i17 = 0; i17 < split.length; i17++) {
                java.lang.String[] split2 = split[i17].split("&");
                if (split2 != null && split2.length == 2) {
                    java.lang.String str = split2[1];
                    java.lang.Integer.parseInt(split2[0]);
                    if (d17.equals(str)) {
                        split[i17] = g17 + "&" + d17;
                        z17 = true;
                    }
                }
            }
            java.lang.String str2 = "";
            for (java.lang.String str3 : split) {
                str2 = str2 + str3 + "#";
            }
            if (!z17) {
                str2 = str2 + g17 + "&" + d17 + "#";
            }
            c.t.m.sapp.c.q.d(context, "__pro_dex_load_info___sapp", str2);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void a(android.content.Context context) {
        try {
            java.io.File file = new java.io.File(context.getFilesDir(), c.t.m.sapp.c.q.f36917c);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.canRead() && file.canWrite() && file.canExecute()) {
                c.t.m.sapp.c.e.b().a("DMK", "ods:ok");
                return;
            }
            boolean readable = file.setReadable(true);
            c.t.m.sapp.c.e.b().a("DMK", "ods:" + file.setWritable(true) + "_" + readable + "_" + file.setExecutable(true));
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (java.io.File file2 : listFiles) {
                if (file2.canRead() && file2.canWrite() && file2.canExecute()) {
                    c.t.m.sapp.c.e.b().a("DMK", "ofs:ok");
                }
                c.t.m.sapp.c.e.b().a("DMK", "ofs:" + file2.setWritable(true) + "_" + file2.setReadable(true) + "_" + file2.setExecutable(true));
            }
        } catch (java.lang.Throwable th6) {
            c.t.m.sapp.c.e.b().a("DMK", "exp:" + th6.toString());
        }
    }

    public static boolean a(java.util.List<c.t.m.sapp.c.a> list, java.util.List<c.t.m.sapp.c.a> list2) {
        boolean z17;
        boolean z18 = true;
        for (c.t.m.sapp.c.a aVar : list) {
            if (!aVar.f36857c.contains(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                aVar.f36857c += com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
            }
            java.util.Iterator<c.t.m.sapp.c.a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                c.t.m.sapp.c.a next = it.next();
                if (!next.f36857c.contains(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                    next.f36857c += com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
                }
                if (aVar.f36857c.equals(next.f36857c) && aVar.f36858d == next.f36858d && aVar.f36859e.equals(next.f36859e)) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                z18 = false;
            }
        }
        return z18;
    }
}
