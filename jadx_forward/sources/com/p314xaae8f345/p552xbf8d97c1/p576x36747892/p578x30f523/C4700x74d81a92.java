package com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523;

/* renamed from: com.tencent.matrix.openglleak.hook.OpenGLHook */
/* loaded from: classes12.dex */
public class C4700x74d81a92 {
    private static final java.lang.String TAG = "MicroMsg.OpenGLHook";

    /* renamed from: mInstance */
    private static final com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92 f20000x46143c22;

    /* renamed from: _hellAccFlag_ */
    private byte f20001x7f11beae;

    /* renamed from: mBindListener */
    private mi.a f20002xd1c4d91e;

    /* renamed from: mErrorListener */
    private mi.b f20003x761b7b6f;

    /* renamed from: mMemoryListener */
    private mi.c f20004x52c45ea2;

    /* renamed from: mResourceListener */
    private mi.d f20005xb94c96f;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("matrix-opengl-leak");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/openglleak/hook/OpenGLHook", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/openglleak/hook/OpenGLHook", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        f20000x46143c22 = new com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92();
    }

    private C4700x74d81a92() {
    }

    /* renamed from: dumpBriefNativeStack */
    public static native java.lang.String m41157x3b671deb(long j17);

    /* renamed from: dumpNativeStack */
    public static native java.lang.String m41158xab5661d(long j17);

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92 m41159x9cf0d20b() {
        return f20000x46143c22;
    }

    /* renamed from: getThrowable */
    public static int m41160xb494ca8a() {
        java.util.Map map = pi.f.f436033a;
        java.lang.Throwable th6 = new java.lang.Throwable();
        int hashCode = th6.hashCode();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) pi.f.f436033a;
        concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), th6);
        return hashCode;
    }

    /* renamed from: hookEgl */
    public static native boolean m41161x413fe3e7();

    /* renamed from: hookGlBindBuffer */
    private static native boolean m41162xbb053e65(int i17);

    /* renamed from: hookGlBindFramebuffer */
    private static native boolean m41163x2cc69ce8(int i17);

    /* renamed from: hookGlBindRenderbuffer */
    private static native boolean m41164x98e187bb(int i17);

    /* renamed from: hookGlBindTexture */
    private static native boolean m41165x43896f96(int i17);

    /* renamed from: hookGlBufferData */
    private static native boolean m41166x147d5392(int i17);

    /* renamed from: hookGlDeleteBuffers */
    private static native boolean m41167x7084d780(int i17);

    /* renamed from: hookGlDeleteFramebuffers */
    private static native boolean m41168x61b16af9(int i17);

    /* renamed from: hookGlDeleteRenderbuffers */
    private static native boolean m41169x4238536a(int i17);

    /* renamed from: hookGlDeleteTextures */
    private static native boolean m41170xbf0b550b(int i17);

    /* renamed from: hookGlGenBuffers */
    private static native boolean m41171x7f029e4b(int i17);

    /* renamed from: hookGlGenFramebuffers */
    private static native boolean m41172x13472b0e(int i17);

    /* renamed from: hookGlGenRenderbuffers */
    private static native boolean m41173xc35a95f5(int i17);

    /* renamed from: hookGlGenTextures */
    private static native boolean m41174x804667a0(int i17);

    /* renamed from: hookGlGetError */
    private static native boolean m41175x840135da(int i17);

    /* renamed from: hookGlRenderbufferStorage */
    private static native boolean m41176xffbd7dbd(int i17);

    /* renamed from: hookGlTexImage2D */
    private static native boolean m41177x59e7ee4e(int i17);

    /* renamed from: hookGlTexImage3D */
    private static native boolean m41178x59e7ee6d(int i17);

    /* renamed from: isEglContextAlive */
    public static native boolean m41179x6c8d36fe(long j17);

    /* renamed from: isEglSurfaceAlive */
    public static native boolean m41180xa6b2ec0(long j17);

    /* renamed from: onEglContextCreate */
    public static void m41181x30efbfa0(java.lang.String str, int i17, long j17, long j18, long j19, long j27, java.lang.String str2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
        oi.e eVar = new oi.e(oi.d.EGL_CONTEXT, -1, str, j18, j27, 0L, 0L, pi.f.a(i17), j17, pi.b.b(str2), atomicInteger);
        oi.h hVar = oi.h.f427100e;
        hVar.d(eVar);
        java.lang.Long valueOf = java.lang.Long.valueOf(j19);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        synchronized (hVar.f427104d) {
            ((java.util.ArrayList) hVar.f427104d).add(valueOf2);
        }
        oj.j.c("Matrix.ResRecordManager", "shareContext: %s, newContext: %s", valueOf, valueOf2);
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onEglContextDestroy */
    public static void m41182xc8d55d6(java.lang.String str, long j17, long j18, int i17) {
        oi.e eVar = new oi.e(oi.d.EGL_CONTEXT, -1, str, j17, j18);
        if (i17 == 0) {
            oj.j.b(TAG, "eglContextDestroy failed: thread=%s, context=%s, ret=%s, errno=%s", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(android.opengl.EGL14.eglGetError()));
            return;
        }
        oi.h hVar = oi.h.f427100e;
        hVar.a(eVar);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        synchronized (hVar.f427104d) {
            ((java.util.ArrayList) hVar.f427104d).remove(valueOf);
        }
        oj.j.c("Matrix.ResRecordManager", "destroyContext: %s", valueOf);
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGetError */
    public static void m41183x197c9b51(int i17) {
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlBindBuffer */
    public static void m41184xed291d21(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.BUFFER;
        ni.a.f418702a.b(dVar, i17, j17, i18 != 0 ? oi.h.f427100e.c(dVar, j17, j18, i18) : null);
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlBindFramebuffer */
    public static void m41185xed2c93ac(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.FRAME_BUFFERS;
        ni.a.f418702a.b(dVar, i17, j17, i18 != 0 ? oi.h.f427100e.c(dVar, j17, j18, i18) : null);
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlBindRenderbuffer */
    public static void m41186xe53a6977(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.RENDER_BUFFERS;
        ni.a.f418702a.b(dVar, i17, j17, i18 != 0 ? oi.h.f427100e.c(dVar, j17, j18, i18) : null);
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlBindTexture */
    public static void m41187x55e1685a(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.TEXTURE;
        ni.a.f418702a.b(dVar, i17, j17, i18 != 0 ? oi.h.f427100e.c(dVar, j17, j18, i18) : null);
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlBufferData */
    public static void m41188x46a1324e(int i17, int i18, long j17, int i19, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f418702a;
        oi.d dVar = oi.d.BUFFER;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlBufferData: getCurrentResourceIdByTarget result == null, maybe didn't call glBindBuffer()", new java.lang.Object[0]);
            return;
        }
        if (i17 == 35052) {
            j17 *= 2;
        }
        pi.e a18 = pi.f.a(i19);
        oi.b bVar = a17.f427093f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        bVar.f427065a = i17;
        bVar.f427071g = i18;
        bVar.f427069e = a17.f427089b;
        bVar.f427070f = a17.f427094g;
        bVar.f427075k = j17;
        pi.e eVar = bVar.f427072h;
        if (eVar != null) {
            eVar.a();
        }
        long j28 = bVar.f427073i;
        if (j28 != 0) {
            m41200xb27602fe(j28);
        }
        bVar.f427072h = a18;
        bVar.f427073i = j18;
        if (a17.f427093f != bVar) {
            a17.f427093f = bVar;
        }
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlDeleteBuffers */
    public static void m41189x4cc1af44(int[] iArr, java.lang.String str, long j17, long j18) {
        if (iArr.length > 0) {
            for (int i17 : iArr) {
                oi.h.f427100e.a(new oi.e(oi.d.BUFFER, i17, str, j17, j18));
                m41159x9cf0d20b().getClass();
            }
        }
    }

    /* renamed from: onGlDeleteFramebuffers */
    public static void m41190xfb58cdb5(int[] iArr, java.lang.String str, long j17, long j18) {
        if (iArr.length > 0) {
            for (int i17 : iArr) {
                oi.h.f427100e.a(new oi.e(oi.d.FRAME_BUFFERS, i17, str, j17, j18));
                m41159x9cf0d20b().getClass();
            }
        }
    }

    /* renamed from: onGlDeleteRenderbuffers */
    public static void m41191xdd7d482e(int[] iArr, java.lang.String str, long j17, long j18) {
        for (int i17 : iArr) {
            oi.h.f427100e.a(new oi.e(oi.d.RENDER_BUFFERS, i17, str, j17, j18));
            m41159x9cf0d20b().getClass();
        }
    }

    /* renamed from: onGlDeleteTextures */
    public static void m41192x6a6975c7(int[] iArr, java.lang.String str, long j17, long j18) {
        if (iArr.length > 0) {
            for (int i17 : iArr) {
                oi.h.f427100e.a(new oi.e(oi.d.TEXTURE, i17, str, j17, j18));
                m41159x9cf0d20b().getClass();
            }
        }
    }

    /* renamed from: onGlGenBuffers */
    public static void m41193xb1267d07(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f427100e.d(new oi.e(oi.d.BUFFER, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                m41159x9cf0d20b().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    /* renamed from: onGlGenFramebuffers */
    public static void m41194xd3ad21d2(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f427100e.d(new oi.e(oi.d.FRAME_BUFFERS, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                m41159x9cf0d20b().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    /* renamed from: onGlGenRenderbuffers */
    public static void m41195xfb377b1(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f427100e.d(new oi.e(oi.d.RENDER_BUFFERS, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                m41159x9cf0d20b().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    /* renamed from: onGlGenTextures */
    public static void m41196x929e6064(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f427100e.d(new oi.e(oi.d.TEXTURE, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                m41159x9cf0d20b().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    /* renamed from: onGlRenderbufferStorage */
    public static void m41197x9b027281(int i17, int i18, int i19, int i27, long j17, int i28, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f418702a;
        oi.d dVar = oi.d.RENDER_BUFFERS;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlRenderbufferStorage: getCurrentResourceIdByTarget result == null, maybe didn't call glBindRenderbuffer()", new java.lang.Object[0]);
            return;
        }
        pi.e a18 = pi.f.a(i28);
        oi.b bVar = a17.f427093f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        bVar.f427065a = i17;
        bVar.f427067c = i19;
        bVar.f427068d = i27;
        bVar.f427066b = i18;
        bVar.f427069e = a17.f427089b;
        bVar.f427070f = a17.f427094g;
        bVar.f427075k = j17;
        pi.e eVar = bVar.f427072h;
        if (eVar != null) {
            eVar.a();
        }
        long j28 = bVar.f427073i;
        if (j28 != 0) {
            m41200xb27602fe(j28);
        }
        bVar.f427072h = a18;
        bVar.f427073i = j18;
        if (a17.f427093f != bVar) {
            a17.f427093f = bVar;
        }
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlTexImage2D */
    public static void m41198x8c0bcd0a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, long j17, int i39, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f418702a;
        oi.d dVar = oi.d.TEXTURE;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlTexImage2D: getCurrentResourceIdByTarget openGLID == null, maybe didn't call glBindTextures()", new java.lang.Object[0]);
            return;
        }
        pi.e a18 = pi.f.a(i39);
        oi.b bVar = a17.f427093f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        oi.b bVar2 = bVar;
        bVar2.c(i17, i18, i19, i27, i28, 0, i29, i37, i38, a17.f427089b, a17.f427094g, j17, a18, j18);
        if (a17.f427093f != bVar2) {
            a17.f427093f = bVar2;
        }
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: onGlTexImage3D */
    public static void m41199x8c0bcd29(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, long j17, int i47, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f418702a;
        oi.d dVar = oi.d.TEXTURE;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlTexImage3D: getCurrentResourceIdByTarget result == null, maybe didn't call glBindTextures()", new java.lang.Object[0]);
            return;
        }
        pi.e a18 = pi.f.a(i47);
        oi.b bVar = a17.f427093f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        oi.b bVar2 = bVar;
        bVar2.c(i17, i18, i19, i27, i28, i29, i37, i38, i39, a17.f427089b, a17.f427094g, j17, a18, j18);
        if (a17.f427093f != bVar2) {
            a17.f427093f = bVar2;
        }
        m41159x9cf0d20b().getClass();
    }

    /* renamed from: releaseNative */
    public static native void m41200xb27602fe(long j17);

    /* renamed from: getResidualQueueSize */
    public native int m41201x77b489b7();

    /* renamed from: hook */
    public boolean m41202x30f523(java.lang.String str, int i17) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1579524317:
                if (str.equals("glDeleteBuffers")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1458259656:
                if (str.equals("glBindRenderbuffer")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1201225272:
                if (str.equals("glDeleteTextures")) {
                    c17 = 2;
                    break;
                }
                break;
            case -782326065:
                if (str.equals("glBufferData")) {
                    c17 = 3;
                    break;
                }
                break;
            case -745683086:
                if (str.equals("glGenRenderbuffers")) {
                    c17 = 4;
                    break;
                }
                break;
            case 382288267:
                if (str.equals("glTexImage2D")) {
                    c17 = 5;
                    break;
                }
                break;
            case 382288298:
                if (str.equals("glTexImage3D")) {
                    c17 = 6;
                    break;
                }
                break;
            case 584221689:
                if (str.equals("glBindTexture")) {
                    c17 = 7;
                    break;
                }
                break;
            case 836645174:
                if (str.equals("glDeleteFramebuffers")) {
                    c17 = '\b';
                    break;
                }
                break;
            case 891911968:
                if (str.equals("glRenderbufferStorage")) {
                    c17 = '\t';
                    break;
                }
                break;
            case 1004794248:
                if (str.equals("glGenBuffers")) {
                    c17 = '\n';
                    break;
                }
                break;
            case 1163482609:
                if (str.equals("glGenFramebuffers")) {
                    c17 = 11;
                    break;
                }
                break;
            case 1319646295:
                if (str.equals("glGetError")) {
                    c17 = '\f';
                    break;
                }
                break;
            case 1591265227:
                if (str.equals("glBindFramebuffer")) {
                    c17 = '\r';
                    break;
                }
                break;
            case 1603238915:
                if (str.equals("glGenTextures")) {
                    c17 = 14;
                    break;
                }
                break;
            case 2007258317:
                if (str.equals("glDeleteRenderbuffers")) {
                    c17 = 15;
                    break;
                }
                break;
            case 2011599266:
                if (str.equals("glBindBuffer")) {
                    c17 = 16;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return m41167x7084d780(i17);
            case 1:
                return m41164x98e187bb(i17);
            case 2:
                return m41170xbf0b550b(i17);
            case 3:
                return m41166x147d5392(i17);
            case 4:
                return m41173xc35a95f5(i17);
            case 5:
                return m41177x59e7ee4e(i17);
            case 6:
                return m41178x59e7ee6d(i17);
            case 7:
                return m41165x43896f96(i17);
            case '\b':
                return m41168x61b16af9(i17);
            case '\t':
                return m41176xffbd7dbd(i17);
            case '\n':
                return m41171x7f029e4b(i17);
            case 11:
                return m41172x13472b0e(i17);
            case '\f':
                return m41175x840135da(i17);
            case '\r':
                return m41163x2cc69ce8(i17);
            case 14:
                return m41174x804667a0(i17);
            case 15:
                return m41169x4238536a(i17);
            case 16:
                return m41162xbb053e65(i17);
            default:
                return false;
        }
    }

    /* renamed from: init */
    public native boolean m41203x316510();

    /* renamed from: setBindListener */
    public void m41204xd16b4d93(mi.a aVar) {
    }

    /* renamed from: setErrorListener */
    public void m41205x6b43959a(mi.b bVar) {
    }

    /* renamed from: setJavaStackDump */
    public native void m41206xc6dcb58(boolean z17);

    /* renamed from: setMemoryListener */
    public void m41207x29f89d7(mi.c cVar) {
    }

    /* renamed from: setNativeStackDump */
    public native void m41208x68925183(boolean z17);

    /* renamed from: setResourceListener */
    public void m41209x3151fb64(mi.d dVar) {
    }

    /* renamed from: updateCurrActivity */
    public native void m41210x3ca472ca(java.lang.String str);
}
