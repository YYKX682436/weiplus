package com.tencent.liteav.base;

/* loaded from: classes13.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int LOG_DIRECTORY = 3;
    private static final int NUM_DIRECTORIES = 4;
    private static final java.lang.String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final java.lang.String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static java.lang.String sCacheSubDirectory;
    private static java.lang.String sDataDirectorySuffix;
    private static java.util.concurrent.FutureTask<java.lang.String[]> sDirPathFetchTask;
    private static final java.util.concurrent.atomic.AtomicBoolean sInitializationStarted = new java.util.concurrent.atomic.AtomicBoolean();

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final java.lang.String[] f46278a = com.tencent.liteav.base.PathUtils.access$000();
    }

    private PathUtils() {
    }

    public static /* synthetic */ java.lang.String[] access$000() {
        return getOrComputeDirectoryPaths();
    }

    private static void chmod(java.lang.String str, int i17) {
        try {
            android.system.Os.chmod(str, i17);
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.Log.e(TAG, "Failed to set permissions for path \"" + str + "\"", new java.lang.Object[0]);
        }
    }

    public static java.lang.String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static java.lang.String getDataDirectory() {
        return getDirectoryPath(0);
    }

    private static java.lang.String getDirectoryPath(int i17) {
        return com.tencent.liteav.base.PathUtils.a.f46278a[i17];
    }

    public static java.lang.String getLogDirectory() {
        return getDirectoryPath(3);
    }

    private static java.lang.String[] getOrComputeDirectoryPaths() {
        try {
            if (!sDirPathFetchTask.cancel(false)) {
                return sDirPathFetchTask.get();
            }
            com.tencent.liteav.base.b a17 = com.tencent.liteav.base.b.a();
            try {
                return setPrivateDataDirectorySuffixInternal();
            } finally {
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    public static java.lang.String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static void setPrivateDataDirectorySuffix(java.lang.String str, java.lang.String str2) {
        if (sInitializationStarted.getAndSet(true)) {
            return;
        }
        sDataDirectorySuffix = str;
        sCacheSubDirectory = str2;
        sDirPathFetchTask = new java.util.concurrent.FutureTask<>(com.tencent.liteav.base.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String[] setPrivateDataDirectorySuffixInternal() {
        java.lang.String[] strArr = new java.lang.String[4];
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        java.lang.String path = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        strArr[0] = path;
        chmod(path, com.tencent.wcdb.FileUtils.S_IRWXU);
        strArr[1] = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0).getPath();
        if (applicationContext.getCacheDir() != null) {
            if (sCacheSubDirectory == null) {
                strArr[2] = applicationContext.getCacheDir().getPath();
            } else {
                strArr[2] = new java.io.File(applicationContext.getCacheDir(), sCacheSubDirectory).getPath();
            }
        }
        java.io.File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            strArr[3] = externalFilesDir.getAbsolutePath() + "/log/liteav";
        }
        return strArr;
    }

    public static void setPrivateDataDirectorySuffix(java.lang.String str) {
        setPrivateDataDirectorySuffix(str, null);
    }
}
