package com.tencent.matrix.openglleak.hook;

/* loaded from: classes12.dex */
public class OpenGLHook {
    private static final java.lang.String TAG = "MicroMsg.OpenGLHook";
    private static final com.tencent.matrix.openglleak.hook.OpenGLHook mInstance;
    private byte _hellAccFlag_;
    private mi.a mBindListener;
    private mi.b mErrorListener;
    private mi.c mMemoryListener;
    private mi.d mResourceListener;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("matrix-opengl-leak");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/openglleak/hook/OpenGLHook", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/openglleak/hook/OpenGLHook", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        mInstance = new com.tencent.matrix.openglleak.hook.OpenGLHook();
    }

    private OpenGLHook() {
    }

    public static native java.lang.String dumpBriefNativeStack(long j17);

    public static native java.lang.String dumpNativeStack(long j17);

    public static com.tencent.matrix.openglleak.hook.OpenGLHook getInstance() {
        return mInstance;
    }

    public static int getThrowable() {
        java.util.Map map = pi.f.f354500a;
        java.lang.Throwable th6 = new java.lang.Throwable();
        int hashCode = th6.hashCode();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) pi.f.f354500a;
        concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), th6);
        return hashCode;
    }

    public static native boolean hookEgl();

    private static native boolean hookGlBindBuffer(int i17);

    private static native boolean hookGlBindFramebuffer(int i17);

    private static native boolean hookGlBindRenderbuffer(int i17);

    private static native boolean hookGlBindTexture(int i17);

    private static native boolean hookGlBufferData(int i17);

    private static native boolean hookGlDeleteBuffers(int i17);

    private static native boolean hookGlDeleteFramebuffers(int i17);

    private static native boolean hookGlDeleteRenderbuffers(int i17);

    private static native boolean hookGlDeleteTextures(int i17);

    private static native boolean hookGlGenBuffers(int i17);

    private static native boolean hookGlGenFramebuffers(int i17);

    private static native boolean hookGlGenRenderbuffers(int i17);

    private static native boolean hookGlGenTextures(int i17);

    private static native boolean hookGlGetError(int i17);

    private static native boolean hookGlRenderbufferStorage(int i17);

    private static native boolean hookGlTexImage2D(int i17);

    private static native boolean hookGlTexImage3D(int i17);

    public static native boolean isEglContextAlive(long j17);

    public static native boolean isEglSurfaceAlive(long j17);

    public static void onEglContextCreate(java.lang.String str, int i17, long j17, long j18, long j19, long j27, java.lang.String str2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
        oi.e eVar = new oi.e(oi.d.EGL_CONTEXT, -1, str, j18, j27, 0L, 0L, pi.f.a(i17), j17, pi.b.b(str2), atomicInteger);
        oi.h hVar = oi.h.f345567e;
        hVar.d(eVar);
        java.lang.Long valueOf = java.lang.Long.valueOf(j19);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        synchronized (hVar.f345571d) {
            ((java.util.ArrayList) hVar.f345571d).add(valueOf2);
        }
        oj.j.c("Matrix.ResRecordManager", "shareContext: %s, newContext: %s", valueOf, valueOf2);
        getInstance().getClass();
    }

    public static void onEglContextDestroy(java.lang.String str, long j17, long j18, int i17) {
        oi.e eVar = new oi.e(oi.d.EGL_CONTEXT, -1, str, j17, j18);
        if (i17 == 0) {
            oj.j.b(TAG, "eglContextDestroy failed: thread=%s, context=%s, ret=%s, errno=%s", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(android.opengl.EGL14.eglGetError()));
            return;
        }
        oi.h hVar = oi.h.f345567e;
        hVar.a(eVar);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        synchronized (hVar.f345571d) {
            ((java.util.ArrayList) hVar.f345571d).remove(valueOf);
        }
        oj.j.c("Matrix.ResRecordManager", "destroyContext: %s", valueOf);
        getInstance().getClass();
    }

    public static void onGetError(int i17) {
        getInstance().getClass();
    }

    public static void onGlBindBuffer(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.BUFFER;
        ni.a.f337169a.b(dVar, i17, j17, i18 != 0 ? oi.h.f345567e.c(dVar, j17, j18, i18) : null);
        getInstance().getClass();
    }

    public static void onGlBindFramebuffer(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.FRAME_BUFFERS;
        ni.a.f337169a.b(dVar, i17, j17, i18 != 0 ? oi.h.f345567e.c(dVar, j17, j18, i18) : null);
        getInstance().getClass();
    }

    public static void onGlBindRenderbuffer(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.RENDER_BUFFERS;
        ni.a.f337169a.b(dVar, i17, j17, i18 != 0 ? oi.h.f345567e.c(dVar, j17, j18, i18) : null);
        getInstance().getClass();
    }

    public static void onGlBindTexture(int i17, int i18, long j17, long j18) {
        oi.d dVar = oi.d.TEXTURE;
        ni.a.f337169a.b(dVar, i17, j17, i18 != 0 ? oi.h.f345567e.c(dVar, j17, j18, i18) : null);
        getInstance().getClass();
    }

    public static void onGlBufferData(int i17, int i18, long j17, int i19, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f337169a;
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
        oi.b bVar = a17.f345560f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        bVar.f345532a = i17;
        bVar.f345538g = i18;
        bVar.f345536e = a17.f345556b;
        bVar.f345537f = a17.f345561g;
        bVar.f345542k = j17;
        pi.e eVar = bVar.f345539h;
        if (eVar != null) {
            eVar.a();
        }
        long j28 = bVar.f345540i;
        if (j28 != 0) {
            releaseNative(j28);
        }
        bVar.f345539h = a18;
        bVar.f345540i = j18;
        if (a17.f345560f != bVar) {
            a17.f345560f = bVar;
        }
        getInstance().getClass();
    }

    public static void onGlDeleteBuffers(int[] iArr, java.lang.String str, long j17, long j18) {
        if (iArr.length > 0) {
            for (int i17 : iArr) {
                oi.h.f345567e.a(new oi.e(oi.d.BUFFER, i17, str, j17, j18));
                getInstance().getClass();
            }
        }
    }

    public static void onGlDeleteFramebuffers(int[] iArr, java.lang.String str, long j17, long j18) {
        if (iArr.length > 0) {
            for (int i17 : iArr) {
                oi.h.f345567e.a(new oi.e(oi.d.FRAME_BUFFERS, i17, str, j17, j18));
                getInstance().getClass();
            }
        }
    }

    public static void onGlDeleteRenderbuffers(int[] iArr, java.lang.String str, long j17, long j18) {
        for (int i17 : iArr) {
            oi.h.f345567e.a(new oi.e(oi.d.RENDER_BUFFERS, i17, str, j17, j18));
            getInstance().getClass();
        }
    }

    public static void onGlDeleteTextures(int[] iArr, java.lang.String str, long j17, long j18) {
        if (iArr.length > 0) {
            for (int i17 : iArr) {
                oi.h.f345567e.a(new oi.e(oi.d.TEXTURE, i17, str, j17, j18));
                getInstance().getClass();
            }
        }
    }

    public static void onGlGenBuffers(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f345567e.d(new oi.e(oi.d.BUFFER, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                getInstance().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    public static void onGlGenFramebuffers(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f345567e.d(new oi.e(oi.d.FRAME_BUFFERS, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                getInstance().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    public static void onGlGenRenderbuffers(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f345567e.d(new oi.e(oi.d.RENDER_BUFFERS, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                getInstance().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    public static void onGlGenTextures(int[] iArr, java.lang.String str, int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(iArr2.length);
            pi.e a17 = pi.f.a(i17);
            int i18 = 0;
            for (int length = iArr2.length; i18 < length; length = length) {
                oi.h.f345567e.d(new oi.e(oi.d.TEXTURE, iArr2[i18], str, j18, j19, j27, j28, a17, j17, pi.b.b(str2), atomicInteger));
                getInstance().getClass();
                i18++;
                iArr2 = iArr;
            }
        }
    }

    public static void onGlRenderbufferStorage(int i17, int i18, int i19, int i27, long j17, int i28, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f337169a;
        oi.d dVar = oi.d.RENDER_BUFFERS;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlRenderbufferStorage: getCurrentResourceIdByTarget result == null, maybe didn't call glBindRenderbuffer()", new java.lang.Object[0]);
            return;
        }
        pi.e a18 = pi.f.a(i28);
        oi.b bVar = a17.f345560f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        bVar.f345532a = i17;
        bVar.f345534c = i19;
        bVar.f345535d = i27;
        bVar.f345533b = i18;
        bVar.f345536e = a17.f345556b;
        bVar.f345537f = a17.f345561g;
        bVar.f345542k = j17;
        pi.e eVar = bVar.f345539h;
        if (eVar != null) {
            eVar.a();
        }
        long j28 = bVar.f345540i;
        if (j28 != 0) {
            releaseNative(j28);
        }
        bVar.f345539h = a18;
        bVar.f345540i = j18;
        if (a17.f345560f != bVar) {
            a17.f345560f = bVar;
        }
        getInstance().getClass();
    }

    public static void onGlTexImage2D(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, long j17, int i39, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f337169a;
        oi.d dVar = oi.d.TEXTURE;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlTexImage2D: getCurrentResourceIdByTarget openGLID == null, maybe didn't call glBindTextures()", new java.lang.Object[0]);
            return;
        }
        pi.e a18 = pi.f.a(i39);
        oi.b bVar = a17.f345560f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        oi.b bVar2 = bVar;
        bVar2.c(i17, i18, i19, i27, i28, 0, i29, i37, i38, a17.f345556b, a17.f345561g, j17, a18, j18);
        if (a17.f345560f != bVar2) {
            a17.f345560f = bVar2;
        }
        getInstance().getClass();
    }

    public static void onGlTexImage3D(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, long j17, int i47, long j18, long j19, long j27) {
        ni.a aVar = ni.a.f337169a;
        oi.d dVar = oi.d.TEXTURE;
        oi.e a17 = aVar.a(dVar, j19, i17);
        if (a17 == null) {
            oj.j.b(TAG, "onGlTexImage3D: getCurrentResourceIdByTarget result == null, maybe didn't call glBindTextures()", new java.lang.Object[0]);
            return;
        }
        pi.e a18 = pi.f.a(i47);
        oi.b bVar = a17.f345560f;
        if (bVar == null) {
            bVar = new oi.b(dVar);
        }
        oi.b bVar2 = bVar;
        bVar2.c(i17, i18, i19, i27, i28, i29, i37, i38, i39, a17.f345556b, a17.f345561g, j17, a18, j18);
        if (a17.f345560f != bVar2) {
            a17.f345560f = bVar2;
        }
        getInstance().getClass();
    }

    public static native void releaseNative(long j17);

    public native int getResidualQueueSize();

    public boolean hook(java.lang.String str, int i17) {
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
                return hookGlDeleteBuffers(i17);
            case 1:
                return hookGlBindRenderbuffer(i17);
            case 2:
                return hookGlDeleteTextures(i17);
            case 3:
                return hookGlBufferData(i17);
            case 4:
                return hookGlGenRenderbuffers(i17);
            case 5:
                return hookGlTexImage2D(i17);
            case 6:
                return hookGlTexImage3D(i17);
            case 7:
                return hookGlBindTexture(i17);
            case '\b':
                return hookGlDeleteFramebuffers(i17);
            case '\t':
                return hookGlRenderbufferStorage(i17);
            case '\n':
                return hookGlGenBuffers(i17);
            case 11:
                return hookGlGenFramebuffers(i17);
            case '\f':
                return hookGlGetError(i17);
            case '\r':
                return hookGlBindFramebuffer(i17);
            case 14:
                return hookGlGenTextures(i17);
            case 15:
                return hookGlDeleteRenderbuffers(i17);
            case 16:
                return hookGlBindBuffer(i17);
            default:
                return false;
        }
    }

    public native boolean init();

    public void setBindListener(mi.a aVar) {
    }

    public void setErrorListener(mi.b bVar) {
    }

    public native void setJavaStackDump(boolean z17);

    public void setMemoryListener(mi.c cVar) {
    }

    public native void setNativeStackDump(boolean z17);

    public void setResourceListener(mi.d dVar) {
    }

    public native void updateCurrActivity(java.lang.String str);
}
