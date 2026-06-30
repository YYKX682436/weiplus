package up;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f511293a = jz5.h.b(up.e.f511291d);

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.lang.String f511294b;

    static {
        jz5.h.b(up.f.f511292d);
    }

    public static final void a(android.app.Application application, java.lang.String revision) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(application, "application");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revision, "revision");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274656s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CsoStartup", "skip initialize because cso is not enabled");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) {
            com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
            com.p314xaae8f345.cso.C2941xefde02d2.f127473g = up.c.f511289d;
            com.p314xaae8f345.cso.C2941xefde02d2.f127475i = up.d.f511290d;
            return;
        }
        long m43626x5620902d = com.p314xaae8f345.mm.cso.log.C10428x78dce0e5.m43626x5620902d();
        com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d22 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
        sc.f fVar = new sc.f(m43626x5620902d);
        if (com.p314xaae8f345.cso.C2941xefde02d2.f127468b) {
            fVar.mo152xb9724478();
        } else {
            synchronized (com.p314xaae8f345.cso.C2941xefde02d2.f127469c) {
                if (com.p314xaae8f345.cso.C2941xefde02d2.f127468b) {
                    fVar.mo152xb9724478();
                } else {
                    com.p314xaae8f345.cso.C2941xefde02d2.f127471e = fVar;
                }
            }
        }
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        java.lang.String str2 = lp0.a.f401781b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "baseRevision(...)");
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = str2.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        java.lang.String sourceDir = application.getApplicationInfo().sourceDir;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sourceDir, "sourceDir");
        byte[] bytes2 = sourceDir.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        messageDigest.update(bytes2);
        java.lang.String encodeToString = android.util.Base64.encodeToString(messageDigest.digest(), 11);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "run(...)");
        if (32 < encodeToString.length()) {
            encodeToString = encodeToString.substring(0, 32);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "substring(...)");
        }
        java.lang.String str3 = encodeToString;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(revision, lp0.a.f401781b)) {
            str = null;
        } else if (32 < revision.length()) {
            str = revision.substring(0, 32);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        } else {
            str = revision;
        }
        java.lang.String str4 = str;
        f511294b = str3.concat(revision);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        java.util.List i17 = kz5.c0.i(application.getApplicationInfo().sourceDir, application.getApplicationInfo().nativeLibraryDir);
        if (com.p314xaae8f345.cso.C2941xefde02d2.f127468b) {
            return;
        }
        synchronized (com.p314xaae8f345.cso.C2941xefde02d2.f127469c) {
            if (com.p314xaae8f345.cso.C2941xefde02d2.f127468b) {
                return;
            }
            java.lang.String str5 = application.getApplicationInfo().sourceDir;
            java.io.File dataDir = application.getDataDir();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dataDir);
            java.lang.String absolutePath = vz5.q.f(dataDir, "cso").getAbsolutePath();
            jz5.l a17 = sc.h.a(application);
            java.lang.String[] strArr = (java.lang.String[]) a17.f384366d;
            java.lang.String[] strArr2 = (java.lang.String[]) a17.f384367e;
            boolean z17 = (application.getApplicationInfo().flags & 268435456) != 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(absolutePath);
            com.p314xaae8f345.cso.C2941xefde02d2.f127470d = new sc.d(str5, absolutePath, str3, str4, (java.lang.String[]) i17.toArray(new java.lang.String[0]), n17, strArr, strArr2, z17);
        }
    }
}
