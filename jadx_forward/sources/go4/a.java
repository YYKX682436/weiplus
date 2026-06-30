package go4;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static u7.i f355646a;

    public static u7.i a(android.content.Context context) {
        u7.i iVar = f355646a;
        if (iVar != null) {
            return iVar;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.J());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.J();
        }
        x7.a aVar = new x7.a(context);
        java.io.File externalCacheDir = "mounted".equals(android.os.Environment.getExternalStorageState()) ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        if (externalCacheDir == null) {
            externalCacheDir = new java.io.File("/data/data/" + context.getPackageName() + "/cache/");
        }
        new java.io.File(externalCacheDir, "video-cache");
        java.util.concurrent.Executors.newSingleThreadExecutor();
        if (536870912 <= 0) {
            throw new java.lang.IllegalArgumentException("Max size must be positive number!");
        }
        u7.i iVar2 = new u7.i(new u7.c(new java.io.File(kk.w.a(r6Var.u(), false)), new v7.i(), new v7.j(134217728L), aVar, new w7.a()), null);
        f355646a = iVar2;
        return iVar2;
    }
}
