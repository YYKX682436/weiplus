package by5;

/* loaded from: classes13.dex */
public class s3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        if (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().dataDir == null) {
            by5.c4.c("XWebCleaner", "clearAllVersion failed, context is null");
        } else {
            java.io.File file = new java.io.File(context.getApplicationInfo().dataDir);
            if (file.exists()) {
                java.io.File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    by5.c4.c("XWebCleaner", "clearAllVersion failed, files is null");
                } else {
                    for (java.io.File file2 : listFiles) {
                        java.lang.String name = file2.getName();
                        if (name.startsWith("app_xwalk_") && file2.isDirectory()) {
                            by5.c4.f("XWebCleaner", "clearAllVersion, version:".concat(name));
                            int e17 = by5.c1.e(file2);
                            if (e17 > 0) {
                                by5.c1.h(e17);
                            }
                            by5.u.h(file2.getAbsolutePath());
                        }
                        if (name.equals("app_xweb_data") && file2.isDirectory()) {
                            java.io.File[] listFiles2 = file2.listFiles();
                            if (listFiles2 == null) {
                                by5.c4.c("XWebCleaner", "clearAllVersion, subFiles is null");
                            } else {
                                for (java.io.File file3 : listFiles2) {
                                    java.lang.String name2 = file3.getName();
                                    if (name2.startsWith("xweb_") && file3.isDirectory()) {
                                        by5.c4.f("XWebCleaner", "clearAllVersion, version:".concat(name2));
                                        int e18 = by5.c1.e(file3);
                                        if (e18 > 0) {
                                            by5.c1.h(e18);
                                        }
                                        by5.u.h(file3.getAbsolutePath());
                                    }
                                }
                            }
                        }
                    }
                    zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
                    by5.u3.e(-1, null, "armeabi-v7a");
                    by5.u3.e(-1, null, "arm64-v8a");
                }
            } else {
                by5.c4.c("XWebCleaner", "clearAllVersion failed, dataDir not exist");
            }
        }
        return qx5.a.b();
    }
}
