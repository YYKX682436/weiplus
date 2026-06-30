package md;

/* loaded from: classes13.dex */
public abstract class k {
    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            kd.c.e("WxaLiteApp.FileUtil", "deleteFolder fail. path is null.", new java.lang.Object[0]);
            return false;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            file.delete();
            return true;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2.getPath());
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
        return true;
    }
}
