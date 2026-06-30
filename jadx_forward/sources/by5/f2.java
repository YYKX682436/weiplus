package by5;

/* loaded from: classes13.dex */
public class f2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        boolean z17 = true;
        boolean z18 = lVar != null;
        java.io.File externalCacheDir = context.getExternalCacheDir();
        java.io.File[] listFiles = externalCacheDir.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            by5.a1.g(context, "请确认应用权限，再确认指定目录下存在文件", z18);
            z17 = false;
        } else {
            java.lang.String str = externalCacheDir.getAbsolutePath() + java.io.File.separator + "xweb_dump";
            by5.u.h(str);
            by5.c4.f("XWebSavePageHelper", "clearSavedPage, delete dir:" + str);
        }
        return !z17 ? qx5.a.a() : qx5.a.b();
    }
}
