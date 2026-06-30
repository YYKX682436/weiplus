package by5;

/* loaded from: classes13.dex */
public abstract class b4 {
    public static boolean a(android.content.Context context, java.io.File file, boolean z17) {
        dy5.a aVar;
        if (file == null) {
            by5.a1.g(context, "请确认应用权限，在权限管理打开应用的读写存储权限", z17);
            return false;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            by5.a1.g(context, "请确认应用权限，再确认指定目录下存在文件", z17);
            return false;
        }
        java.lang.String str = file.getPath() + java.io.File.separator + "apkxwebtest";
        try {
            java.io.File[] listFiles2 = new java.io.File(str).listFiles();
            if (listFiles2 == null || listFiles2.length == 0) {
                by5.a1.g(context, "目录(" + str + ")下没有文件，请确认应用权限，在权限管理打开应用的读写存储权限", z17);
                return false;
            }
            for (java.io.File file2 : listFiles2) {
                if (file2.getName().endsWith(".zip")) {
                    aVar = dy5.a.ZIP;
                    by5.c4.f("XWebLocalPackageInstaller", "loadPackageFromDir, found local zip package in apkxwebtest");
                } else if (file2.getName().endsWith(".7z")) {
                    aVar = dy5.a.SEVEN_ZIP;
                    by5.c4.f("XWebLocalPackageInstaller", "loadPackageFromDir, found local 7zip package in apkxwebtest");
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    return b(context, file2.getAbsolutePath(), file2.getName(), aVar, z17);
                }
            }
            by5.a1.g(context, "apkxwebtest目录下没有 .zip或.7z文件，请先按步骤将内核包传入到手机内部存储中", z17);
            return false;
        } catch (java.lang.Exception unused) {
            by5.a1.g(context, "没有找到目录(" + str + ")，请确认应用权限，在权限管理打开应用的读写存储权限", z17);
            return false;
        }
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, dy5.a aVar, boolean z17) {
        java.lang.Integer c17;
        by5.c4.f("XWebLocalPackageInstaller", "loadPackageFromFile, filePath:" + str + ", fileName:" + str2);
        zx5.d dVar = new zx5.d(str, str2, aVar);
        dy5.a aVar2 = dy5.a.SEVEN_ZIP;
        int i17 = dVar.f477235h;
        if (!by5.u.d(str, aVar2 == aVar ? by5.z3.c(i17) : by5.z3.e(i17))) {
            by5.a1.g(context, "安装失败，内核文件拷贝失败", z17);
            return false;
        }
        try {
            c17 = zx5.x.c(dVar);
        } catch (java.lang.Exception e17) {
            by5.a1.g(context, "安装失败，失败原因看日志", z17);
            by5.c4.d("XWebLocalPackageInstaller", "loadPackageFromFile, handle files fail, error", e17);
        }
        if (c17.intValue() == 0) {
            by5.a1.g(context, "安装内核包" + str2 + "成功", z17);
            return true;
        }
        by5.a1.g(context, "安装内核包" + str2 + "失败，错误码=" + c17, z17);
        return false;
    }
}
