package ak0;

/* loaded from: classes11.dex */
public abstract class z {
    public static boolean a(java.io.File file) {
        java.io.File[] listFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            b(file);
            return true;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return true;
        }
        for (java.io.File file2 : listFiles) {
            a(file2);
        }
        b(file);
        return true;
    }

    public static boolean b(java.io.File file) {
        boolean z17 = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LegacyTinkerFileUtil", "safeDeleteFile, try to delete path: " + file.getPath());
            z17 = file.delete();
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LegacyTinkerFileUtil", "Failed to delete file, try to delete when exit. path: " + file.getPath());
                file.deleteOnExit();
            }
        }
        return z17;
    }
}
