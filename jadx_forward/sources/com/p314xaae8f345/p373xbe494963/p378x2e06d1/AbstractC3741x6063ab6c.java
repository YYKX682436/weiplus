package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

/* renamed from: com.tencent.liteav.base.PathUtils */
/* loaded from: classes13.dex */
public abstract class AbstractC3741x6063ab6c {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f14616x7118e671 = false;

    /* renamed from: CACHE_DIRECTORY */
    private static final int f14617xa99b8db0 = 2;

    /* renamed from: DATA_DIRECTORY */
    private static final int f14618xf68303f8 = 0;

    /* renamed from: LOG_DIRECTORY */
    private static final int f14619x8e1eb2f2 = 3;

    /* renamed from: NUM_DIRECTORIES */
    private static final int f14620x17394052 = 4;
    private static final java.lang.String TAG = "PathUtils";

    /* renamed from: THUMBNAIL_DIRECTORY */
    private static final int f14621x6b25fa9a = 1;

    /* renamed from: THUMBNAIL_DIRECTORY_NAME */
    private static final java.lang.String f14622x6bafc110 = "textures";

    /* renamed from: sCacheSubDirectory */
    private static java.lang.String f14623xcb362c7c;

    /* renamed from: sDataDirectorySuffix */
    private static java.lang.String f14624x57e80fa1;

    /* renamed from: sDirPathFetchTask */
    private static java.util.concurrent.FutureTask<java.lang.String[]> f14625xed398fc0;

    /* renamed from: sInitializationStarted */
    private static final java.util.concurrent.atomic.AtomicBoolean f14626x31c3910e = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: com.tencent.liteav.base.PathUtils$a */
    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final java.lang.String[] f127811a = com.p314xaae8f345.p373xbe494963.p378x2e06d1.AbstractC3741x6063ab6c.m29266xbbd77af0();
    }

    private AbstractC3741x6063ab6c() {
    }

    /* renamed from: access$000 */
    public static /* synthetic */ java.lang.String[] m29266xbbd77af0() {
        return m29273xc88c7c3f();
    }

    /* renamed from: chmod */
    private static void m29268x5a4047d(java.lang.String str, int i17) {
        try {
            android.system.Os.chmod(str, i17);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Failed to set permissions for path \"" + str + "\"", new java.lang.Object[0]);
        }
    }

    /* renamed from: getCacheDirectory */
    public static java.lang.String m29269xbca9ae01() {
        return m29271xe0e6b47c(2);
    }

    /* renamed from: getDataDirectory */
    public static java.lang.String m29270x18650a2d() {
        return m29271xe0e6b47c(0);
    }

    /* renamed from: getDirectoryPath */
    private static java.lang.String m29271xe0e6b47c(int i17) {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.AbstractC3741x6063ab6c.a.f127811a[i17];
    }

    /* renamed from: getLogDirectory */
    public static java.lang.String m29272xb6ac99ff() {
        return m29271xe0e6b47c(3);
    }

    /* renamed from: getOrComputeDirectoryPaths */
    private static java.lang.String[] m29273xc88c7c3f() {
        try {
            if (!f14625xed398fc0.cancel(false)) {
                return f14625xed398fc0.get();
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.b a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a();
            try {
                return m29277x1420da70();
            } finally {
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: getThumbnailCacheDirectory */
    public static java.lang.String m29274x38a158e1() {
        return m29271xe0e6b47c(1);
    }

    /* renamed from: setPrivateDataDirectorySuffix */
    public static void m29276xe60cf293(java.lang.String str, java.lang.String str2) {
        if (f14626x31c3910e.getAndSet(true)) {
            return;
        }
        f14624x57e80fa1 = str;
        f14623xcb362c7c = str2;
        f14625xed398fc0 = new java.util.concurrent.FutureTask<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPrivateDataDirectorySuffixInternal */
    public static java.lang.String[] m29277x1420da70() {
        java.lang.String[] strArr = new java.lang.String[4];
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        java.lang.String path = m29240x6e669035.getDir(f14624x57e80fa1, 0).getPath();
        strArr[0] = path;
        m29268x5a4047d(path, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df);
        strArr[1] = m29240x6e669035.getDir(f14622x6bafc110, 0).getPath();
        if (m29240x6e669035.getCacheDir() != null) {
            if (f14623xcb362c7c == null) {
                strArr[2] = m29240x6e669035.getCacheDir().getPath();
            } else {
                strArr[2] = new java.io.File(m29240x6e669035.getCacheDir(), f14623xcb362c7c).getPath();
            }
        }
        java.io.File externalFilesDir = m29240x6e669035.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            strArr[3] = externalFilesDir.getAbsolutePath() + "/log/liteav";
        }
        return strArr;
    }

    /* renamed from: setPrivateDataDirectorySuffix */
    public static void m29275xe60cf293(java.lang.String str) {
        m29276xe60cf293(str, null);
    }
}
