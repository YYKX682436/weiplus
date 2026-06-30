package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.PathUtils */
/* loaded from: classes13.dex */
public abstract class AbstractC29329x6063ab6c {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73359x7118e671 = false;

    /* renamed from: CACHE_DIRECTORY */
    private static final int f73360xa99b8db0 = 2;

    /* renamed from: DATA_DIRECTORY */
    private static final int f73361xf68303f8 = 0;

    /* renamed from: NUM_DIRECTORIES */
    private static final int f73362x17394052 = 3;
    private static final java.lang.String TAG = "PathUtils";

    /* renamed from: THUMBNAIL_DIRECTORY */
    private static final int f73363x6b25fa9a = 1;

    /* renamed from: THUMBNAIL_DIRECTORY_NAME */
    private static final java.lang.String f73364x6bafc110 = "textures";

    /* renamed from: sCacheDirectoryBasePath */
    private static java.lang.String f73365xd25e9d14;

    /* renamed from: sCacheSubDirectory */
    private static java.lang.String f73366xcb362c7c;

    /* renamed from: sDataDirectoryBasePath */
    private static java.lang.String f73367xc4752e6;

    /* renamed from: sDataDirectorySuffix */
    private static java.lang.String f73368x57e80fa1;

    /* renamed from: sDirPathFetchTask */
    private static java.util.concurrent.FutureTask<java.lang.String[]> f73369xed398fc0;

    /* renamed from: sInitializationStarted */
    private static final java.util.concurrent.atomic.AtomicBoolean f73370x31c3910e = new java.util.concurrent.atomic.AtomicBoolean();

    private AbstractC29329x6063ab6c() {
    }

    /* renamed from: chmod */
    private static void m152566x5a4047d(java.lang.String str, int i17) {
        try {
            android.system.Os.chmod(str, i17);
        } catch (java.lang.Exception unused) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Failed to set permissions for path \"" + str + "\"");
        }
    }

    /* renamed from: getAllPrivateDownloadsDirectories */
    public static java.lang.String[] m152567x42444298() {
        java.util.List arrayList = new java.util.ArrayList();
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152646x9633ec9a = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152646x9633ec9a();
        try {
            java.io.File[] externalFilesDirs = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getExternalFilesDirs(android.os.Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = java.util.Arrays.asList(externalFilesDirs);
            }
            if (m152646x9633ec9a != null) {
                m152646x9633ec9a.close();
            }
            return m152582x535f262b(arrayList);
        } catch (java.lang.Throwable th6) {
            if (m152646x9633ec9a != null) {
                try {
                    m152646x9633ec9a.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: getCacheDirectory */
    public static java.lang.String m152568xbca9ae01() {
        return m152570xe0e6b47c(2);
    }

    /* renamed from: getDataDirectory */
    public static java.lang.String m152569x18650a2d() {
        return m152570xe0e6b47c(0);
    }

    /* renamed from: getDirectoryPath */
    private static java.lang.String m152570xe0e6b47c(int i17) {
        return m152575xc88c7c3f()[i17];
    }

    /* renamed from: getDownloadsDirectory */
    public static java.lang.String m152571x102c2fb8() {
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7 = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152645xccdf4b7();
        try {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                java.lang.String path = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS).getPath();
                if (m152645xccdf4b7 != null) {
                    m152645xccdf4b7.close();
                }
                return path;
            }
            java.lang.String[] m152567x42444298 = m152567x42444298();
            java.lang.String str = m152567x42444298.length == 0 ? "" : m152567x42444298[0];
            if (m152645xccdf4b7 != null) {
                m152645xccdf4b7.close();
            }
            return str;
        } catch (java.lang.Throwable th6) {
            if (m152645xccdf4b7 != null) {
                try {
                    m152645xccdf4b7.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: getExternalDownloadVolumesNames */
    public static java.lang.String[] m152572x3241db8() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29395xdcec3710.m152851xa36c44d(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035())) {
            if (!android.text.TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                java.io.File m152859x8092085d = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29396xdcec3711.m152859x8092085d((android.os.storage.StorageManager) org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152797xac92a5d0(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), android.os.storage.StorageManager.class), android.provider.MediaStore.Files.getContentUri(str));
                java.io.File file = new java.io.File(m152859x8092085d, android.os.Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), m152859x8092085d.getAbsolutePath(), java.lang.Boolean.valueOf(m152859x8092085d.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return m152582x535f262b(arrayList);
    }

    /* renamed from: getExternalStorageDirectory */
    public static java.lang.String m152573xc9acd993() {
        return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    /* renamed from: getNativeLibraryDirectory */
    private static java.lang.String m152574x2830391f() {
        android.content.pm.ApplicationInfo applicationInfo = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo();
        int i17 = applicationInfo.flags;
        return ((i17 & 128) != 0 || (i17 & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    /* renamed from: getOrComputeDirectoryPaths */
    private static java.lang.String[] m152575xc88c7c3f() {
        if (!f73369xed398fc0.isDone()) {
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152646x9633ec9a = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152646x9633ec9a();
            try {
                f73369xed398fc0.run();
                if (m152646x9633ec9a != null) {
                    m152646x9633ec9a.close();
                }
            } catch (java.lang.Throwable th6) {
                if (m152646x9633ec9a != null) {
                    try {
                        m152646x9633ec9a.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        try {
            return f73369xed398fc0.get();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getThumbnailCacheDirectory */
    public static java.lang.String m152576x38a158e1() {
        return m152570xe0e6b47c(1);
    }

    /* renamed from: resetForTesting */
    public static void m152577x2c3fdbb6() {
        f73370x31c3910e.set(false);
        f73369xed398fc0 = null;
        f73368x57e80fa1 = null;
        f73366xcb362c7c = null;
        f73367xc4752e6 = null;
        f73365xd25e9d14 = null;
    }

    /* renamed from: setPrivateDataDirectorySuffix */
    public static void m152579xe60cf293(java.lang.String str, java.lang.String str2) {
        m152580x82463af1(null, null, str, str2);
    }

    /* renamed from: setPrivateDirectoryPath */
    public static void m152580x82463af1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (f73370x31c3910e.getAndSet(true)) {
            return;
        }
        f73367xc4752e6 = str;
        f73365xd25e9d14 = str2;
        f73368x57e80fa1 = str3;
        f73366xcb362c7c = str4;
        f73369xed398fc0 = new java.util.concurrent.FutureTask<>(new org.p3343x72743996.p3344x2e06d1.CallableC29330xeeaa18f5());
        org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.f73579x921e6421.execute(f73369xed398fc0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPrivateDirectoryPathInternal */
    public static java.lang.String[] m152581x17b2e4ce() {
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr = new java.lang.String[3];
        android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
        if (f73367xc4752e6 == null) {
            file = m152349x6e669035.getDir(f73368x57e80fa1, 0);
            file2 = m152349x6e669035.getDir(f73364x6bafc110, 0);
        } else {
            file = new java.io.File(f73367xc4752e6, f73368x57e80fa1);
            file.mkdirs();
            java.io.File file3 = new java.io.File(f73367xc4752e6, f73364x6bafc110);
            file3.mkdirs();
            file2 = file3;
        }
        java.io.File file4 = f73365xd25e9d14 != null ? new java.io.File(f73365xd25e9d14) : m152349x6e669035.getCacheDir();
        if (file4 != null) {
            if (f73366xcb362c7c != null) {
                file4 = new java.io.File(file4, f73366xcb362c7c);
            }
            if (f73365xd25e9d14 != null || f73366xcb362c7c != null) {
                file4.mkdirs();
                m152566x5a4047d(file4.getPath(), 1472);
            }
            strArr[2] = file4.getPath();
        }
        java.lang.String path = file.getPath();
        strArr[0] = path;
        m152566x5a4047d(path, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df);
        strArr[1] = file2.getPath();
        return strArr;
    }

    /* renamed from: toAbsolutePathStrings */
    private static java.lang.String[] m152582x535f262b(java.util.List<java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : list) {
            if (file != null && !android.text.TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    /* renamed from: setPrivateDataDirectorySuffix */
    public static void m152578xe60cf293(java.lang.String str) {
        m152579xe60cf293(str, null);
    }
}
