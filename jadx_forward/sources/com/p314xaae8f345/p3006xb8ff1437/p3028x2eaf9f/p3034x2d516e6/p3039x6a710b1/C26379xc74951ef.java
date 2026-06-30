package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLFileSystem */
/* loaded from: classes13.dex */
public class C26379xc74951ef {
    /* renamed from: clearCache */
    public static void m102447xd2bef135(android.content.Context context) {
        m102451x46748578(context);
        m102449xd958e12a(context);
    }

    /* renamed from: clearExternalCache */
    public static void m102449xd958e12a(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102491xf664687d(m102456xa2f488ac(context));
    }

    /* renamed from: clearInternalCache */
    public static void m102451x46748578(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102491xf664687d(m102462x3f11dc1e(context));
    }

    /* renamed from: deleteDirectory */
    public static void m102453xf53fe902(android.content.Context context, java.lang.String str) {
        m102455x7db421c5(context, str);
        m102454xabf5477(context, str);
    }

    /* renamed from: deleteExternalDirectory */
    public static void m102454xabf5477(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102491xf664687d(m102460xf2e9762c(context, str));
    }

    /* renamed from: deleteInternalDirectory */
    public static void m102455x7db421c5(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102491xf664687d(m102466x65de437a(context, str));
    }

    /* renamed from: getExternalCacheDirectory */
    public static java.io.File m102456xa2f488ac(android.content.Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: getExternalCacheFile */
    public static java.io.File m102458xb43dfdd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File m102457xa2f488ac = m102457xa2f488ac(context, str);
        if (m102457xa2f488ac == null) {
            return null;
        }
        return new java.io.File(m102457xa2f488ac, str2);
    }

    /* renamed from: getExternalDirectory */
    public static java.io.File m102459xf2e9762c(android.content.Context context) {
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(externalStorageDirectory.getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append("Android");
        sb6.append(str);
        sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        sb6.append(str);
        sb6.append(context.getPackageName());
        sb6.append(str);
        sb6.append("files");
        return new java.io.File(sb6.toString());
    }

    /* renamed from: getExternalFile */
    public static java.io.File m102461xe50825d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File m102460xf2e9762c = m102460xf2e9762c(context, str);
        if (m102460xf2e9762c == null) {
            return null;
        }
        return new java.io.File(m102460xf2e9762c, str2);
    }

    /* renamed from: getInternalCacheDirectory */
    public static java.io.File m102462x3f11dc1e(android.content.Context context) {
        return context.getCacheDir();
    }

    /* renamed from: getInternalCacheFile */
    public static java.io.File m102464x7e38ad2b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File m102463x3f11dc1e = m102463x3f11dc1e(context, str);
        if (m102463x3f11dc1e == null) {
            return null;
        }
        return new java.io.File(m102463x3f11dc1e, str2);
    }

    /* renamed from: getInternalDirectory */
    public static java.io.File m102465x65de437a(android.content.Context context) {
        return context.getFilesDir();
    }

    /* renamed from: getInternalFile */
    public static java.io.File m102467x5c281c4f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File m102466x65de437a = m102466x65de437a(context, str);
        if (m102466x65de437a == null) {
            return null;
        }
        return new java.io.File(m102466x65de437a, str2);
    }

    /* renamed from: getNewerCacheFile */
    public static java.io.File m102468x86856d47(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102475x38a73ce5(m102464x7e38ad2b(context, str, str2), m102458xb43dfdd(context, str, str2));
    }

    /* renamed from: getNewerFile */
    public static java.io.File m102469xfa72bab3(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102475x38a73ce5(m102467x5c281c4f(context, str, str2), m102461xe50825d(context, str, str2));
    }

    /* renamed from: getProperCacheDirectory */
    public static java.io.File m102470xb4a5c0f1(android.content.Context context, java.lang.String str) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102484x59a899f2() ? m102457xa2f488ac(context, str) : m102463x3f11dc1e(context, str);
    }

    /* renamed from: getProperCacheFile */
    public static java.io.File m102471x6f07d078(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102484x59a899f2() ? m102458xb43dfdd(context, str, str2) : m102464x7e38ad2b(context, str, str2);
    }

    /* renamed from: getProperDirectory */
    public static java.io.File m102472x56ad66c7(android.content.Context context, java.lang.String str) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102484x59a899f2() ? m102460xf2e9762c(context, str) : m102466x65de437a(context, str);
    }

    /* renamed from: getProperFile */
    public static java.io.File m102473xb6f95ce2(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102484x59a899f2() ? m102461xe50825d(context, str, str2) : m102467x5c281c4f(context, str, str2);
    }

    /* renamed from: clearExternalCache */
    public static void m102450xd958e12a(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102491xf664687d(m102457xa2f488ac(context, str));
    }

    /* renamed from: clearInternalCache */
    public static void m102452x46748578(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102491xf664687d(m102463x3f11dc1e(context, str));
    }

    /* renamed from: getExternalCacheDirectory */
    public static java.io.File m102457xa2f488ac(android.content.Context context, java.lang.String str) {
        java.io.File m102456xa2f488ac = m102456xa2f488ac(context);
        if (m102456xa2f488ac == null) {
            return null;
        }
        return new java.io.File(m102456xa2f488ac.getAbsolutePath() + java.io.File.separator + str);
    }

    /* renamed from: getInternalCacheDirectory */
    public static java.io.File m102463x3f11dc1e(android.content.Context context, java.lang.String str) {
        java.io.File m102462x3f11dc1e = m102462x3f11dc1e(context);
        if (m102462x3f11dc1e == null) {
            return null;
        }
        return new java.io.File(m102462x3f11dc1e.getAbsolutePath() + java.io.File.separator + str);
    }

    /* renamed from: getInternalDirectory */
    public static java.io.File m102466x65de437a(android.content.Context context, java.lang.String str) {
        java.io.File m102465x65de437a = m102465x65de437a(context);
        if (m102465x65de437a == null) {
            return null;
        }
        return new java.io.File(m102465x65de437a.getAbsolutePath() + java.io.File.separator + str);
    }

    /* renamed from: clearCache */
    public static void m102448xd2bef135(android.content.Context context, java.lang.String str) {
        m102452x46748578(context, str);
        m102450xd958e12a(context, str);
    }

    /* renamed from: getExternalDirectory */
    public static java.io.File m102460xf2e9762c(android.content.Context context, java.lang.String str) {
        java.io.File m102459xf2e9762c = m102459xf2e9762c(context);
        if (m102459xf2e9762c == null) {
            return null;
        }
        return new java.io.File(m102459xf2e9762c.getAbsolutePath() + java.io.File.separator + str);
    }
}
