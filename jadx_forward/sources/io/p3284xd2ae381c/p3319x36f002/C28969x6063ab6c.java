package io.p3284xd2ae381c.p3319x36f002;

/* renamed from: io.flutter.util.PathUtils */
/* loaded from: classes12.dex */
public final class C28969x6063ab6c {

    /* renamed from: flutterCacheDirName */
    private static java.lang.String f72137xe25f7912;

    /* renamed from: getCacheDirectory */
    public static java.lang.String m139410xbca9ae01(android.content.Context context) {
        java.io.File codeCacheDir = context.getCodeCacheDir();
        if (codeCacheDir == null) {
            codeCacheDir = context.getCacheDir();
        }
        if (codeCacheDir == null) {
            codeCacheDir = new java.io.File(m139411xe5152a12(context), "cache");
        }
        if (f72137xe25f7912 == null) {
            f72137xe25f7912 = android.os.Build.MODEL;
        }
        java.io.File file = new java.io.File(codeCacheDir, "flutter_" + f72137xe25f7912);
        file.mkdirs();
        return file.getPath();
    }

    /* renamed from: getDataDirPath */
    private static java.lang.String m139411xe5152a12(android.content.Context context) {
        return context.getDataDir().getPath();
    }

    /* renamed from: getDataDirectory */
    public static java.lang.String m139412x18650a2d(android.content.Context context) {
        java.io.File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new java.io.File(m139411xe5152a12(context), "app_flutter");
        }
        return dir.getPath();
    }

    /* renamed from: getFilesDir */
    public static java.lang.String m139413x5010680c(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new java.io.File(m139411xe5152a12(context), "files");
        }
        return filesDir.getPath();
    }

    /* renamed from: setFlutterCacheDirName */
    public static void m139414x88d41550(java.lang.String str) {
        f72137xe25f7912 = str;
    }
}
