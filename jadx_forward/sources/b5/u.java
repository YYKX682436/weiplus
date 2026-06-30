package b5;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f99422a = a5.a0.e("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f99423b = {"-journal", "-shm", "-wal"};

    public static void a(android.content.Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            java.lang.String str = f99422a;
            a5.a0.c().a(str, "Migrating WorkDatabase to the no-backup directory", new java.lang.Throwable[0]);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.io.File databasePath = context.getDatabasePath("androidx.work.workdb");
            java.io.File file = new java.io.File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (java.lang.String str2 : f99423b) {
                hashMap.put(new java.io.File(databasePath.getPath() + str2), new java.io.File(file.getPath() + str2));
            }
            for (java.io.File file2 : hashMap.keySet()) {
                java.io.File file3 = (java.io.File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        a5.a0.c().f(str, java.lang.String.format("Over-writing contents of %s", file3), new java.lang.Throwable[0]);
                    }
                    a5.a0.c().a(str, file2.renameTo(file3) ? java.lang.String.format("Migrated %s to %s", file2, file3) : java.lang.String.format("Renaming %s to %s failed", file2, file3), new java.lang.Throwable[0]);
                }
            }
        }
    }
}
