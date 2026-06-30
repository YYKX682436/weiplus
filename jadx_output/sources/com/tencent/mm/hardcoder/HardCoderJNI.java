package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public class HardCoderJNI {
    public static final int APP_SCENE_COMMUNICATE = 6;
    public static final int APP_SCENE_DATA_LOADING_AND_PROCESS = 4;
    public static final int APP_SCENE_MULTI_MEDIA_PROCESS = 5;
    public static final int APP_SCENE_STARTUP = 1;
    public static final int APP_SCENE_SYSTEM_DEVICE = 7;
    public static final int APP_SCENE_UNDEFINE = 0;
    public static final int APP_SCENE_WINDOW_SCROLL = 3;
    public static final int APP_SCENE_WINDOW_SWITCH = 2;
    public static final int CALLBACK_TYPE_BASE = 0;
    public static final int CALLBACK_TYPE_DATA = 2;
    public static final int CALLBACK_TYPE_STATUS = 1;
    public static final int CLIENT_CONNECT = -20000;
    public static final int CLIENT_DISCONNECT = -20001;
    public static final java.lang.String CLIENT_SOCK = ".hardcoder.client.sock";
    public static final int CPU_LEVEL_0 = 0;
    public static final int CPU_LEVEL_1 = 1;
    public static final int CPU_LEVEL_2 = 2;
    public static final int CPU_LEVEL_3 = 3;
    public static final int ERROR_CODE_CHECKENV_FAIL = -2;
    public static final int ERROR_CODE_DISCONNECT = -6;
    public static final int ERROR_CODE_FAILED = -1;
    public static final int ERROR_CODE_HCPERFMANAGER_NULL = -5;
    public static final int ERROR_CODE_NOT_ENABLE = -3;
    public static final int ERROR_CODE_NOT_FOREGROUND = -4;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERR_CLIENT_ALREADY_INIT = -20002;
    public static final int ERR_UNAUTHORIZED = -10001;
    public static final int FUNC_BASE = 1000;
    public static final int FUNC_CANCEL_CPU_CORE_FOR_THREAD = 1005;
    public static final int FUNC_CANCEL_CPU_HIGH_FREQ = 1003;
    public static final int FUNC_CANCEL_GPU_HIGH_FREQ = 1017;
    public static final int FUNC_CANCEL_HIGH_IO_FREQ = 1007;
    public static final int FUNC_CANCEL_UNIFY_CPU_IO_THREAD_CORE = 1014;
    public static final int FUNC_CHECK_PERMISSION = 1001;
    public static final int FUNC_CONFIGURE = 1018;
    public static final int FUNC_CPU_CORE_FOR_THREAD = 1004;
    public static final int FUNC_CPU_HIGH_FREQ = 1002;
    public static final int FUNC_GPU_HIGH_FREQ = 1016;
    public static final int FUNC_HIGH_IO_FREQ = 1006;
    public static final int FUNC_LOCAL = 0;
    public static final int FUNC_REG_ANR_CALLBACK = 1010;
    public static final int FUNC_REG_PRELOAD_BOOT_RESOURCE = 1011;
    public static final int FUNC_REG_SYSTEM_EVENT_CALLBACK = 1015;
    public static final int FUNC_RESET_SCREEN_RESOLUTION = 1009;
    public static final int FUNC_SET_SCREEN_RESOLUTION = 1008;
    public static final int FUNC_TERMINATE_APP = 1012;
    public static final int FUNC_UNIFY_CPU_IO_THREAD_CORE = 1013;
    public static final int GPU_LEVEL_0 = 0;
    public static final int GPU_LEVEL_1 = 1;
    public static final int IO_LEVEL_0 = 0;
    public static final int IO_LEVEL_1 = 1;
    public static final int IO_LEVEL_2 = 2;
    public static final int IO_LEVEL_3 = 3;
    public static final java.lang.String LIB_NAME = "hardcoder";
    public static final int RET_CPU_HIGH_FREQ = 8;
    public static final int RET_CPU_HIGH_FREQ_LEVEL_1 = 9;
    public static final int RET_CPU_HIGH_FREQ_LEVEL_2 = 10;
    public static final int RET_CPU_HIGH_FREQ_LEVEL_3 = 11;
    public static final int RET_GPU_HIGH_FREQ = 32;
    public static final int RET_HIGH_IO_FREQ = 16;
    public static final int RET_HIGH_IO_FREQ_LEVEL_1 = 17;
    public static final int RET_HIGH_IO_FREQ_LEVEL_2 = 18;
    public static final int RET_HIGH_IO_FREQ_LEVEL_3 = 19;
    public static final int RET_LEVEL_1 = 1;
    public static final int RET_LEVEL_2 = 2;
    public static final int RET_LEVEL_3 = 3;
    public static final int RET_OK = 0;
    public static final java.lang.String SERVER_PROP_KEY = "persist.sys.hardcoder.name";
    private static final java.lang.String TAG = "Hardcoder.HardCoderJNI";
    private static com.tencent.mm.hardcoder.HardCoderJNI.AnrCallback anrCallback = null;
    private static boolean checkEnv = false;
    private static boolean connect = false;
    private static com.tencent.mm.hardcoder.i connectStatusCallback = null;
    private static boolean hcDebug = false;
    private static boolean hcEnable = true;
    private static com.tencent.mm.hardcoder.f hcPerfManager = null;
    private static java.lang.reflect.Method sGetStringPropsMethod = null;
    private static volatile java.lang.Class<?> sSystemPropertiesClazz = null;
    public static com.tencent.mm.hardcoder.l sceneReportCallback = null;
    public static int tickRate = 100;
    private byte _hellAccFlag_;
    private static byte[] lock = new byte[0];
    private static java.util.HashMap<java.lang.Long, com.tencent.mm.hardcoder.j> funcRetCallback = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.Long, com.tencent.mm.hardcoder.k> requestStatusCallback = new java.util.HashMap<>();

    /* loaded from: classes15.dex */
    public interface AnrCallback {
        void onANR(byte[] bArr);
    }

    /* loaded from: classes10.dex */
    public interface HCPerfManagerThread {
        java.lang.Thread newThread(java.lang.Runnable runnable, java.lang.String str, int i17);
    }

    /* loaded from: classes15.dex */
    public interface NativeLibraryLoader {
        void loadLibrary(java.lang.String str);
    }

    private HardCoderJNI() {
    }

    public static native long cancelCpuCoreForThread(int[] iArr, int i17, long j17);

    public static native long cancelCpuHighFreq(int i17, long j17);

    public static native long cancelGpuHighFreq(int i17, long j17);

    public static native long cancelHighIOFreq(int i17, long j17);

    public static native long cancelUnifyCpuIOThreadCoreGpu(boolean z17, boolean z18, boolean z19, boolean z27, int[] iArr, int i17, long j17);

    public static native long checkPermission(java.lang.String[] strArr, java.lang.String[] strArr2, int i17, int i18, int i19, long j17);

    public static long checkPermission(java.lang.String[] strArr, java.lang.String[] strArr2, com.tencent.mm.hardcoder.j jVar) {
        if (!connect) {
            com.tencent.mm.hardcoder.n.b(TAG, "startPerformance error disconnect");
            return -6L;
        }
        long checkPermission = checkPermission(strArr, strArr2, android.os.Process.myPid(), android.os.Process.myUid(), android.os.Process.myTid(), android.os.SystemClock.elapsedRealtimeNanos());
        funcRetCallback.put(java.lang.Long.valueOf(checkPermission), jVar);
        return checkPermission;
    }

    public static native long configure(byte[] bArr, int i17, long j17);

    public static native long getParameters(byte[] bArr, int i17, long j17);

    private static native int getTickRate();

    private static native int initHardCoder(java.lang.String str, int i17, java.lang.String str2);

    public static int initHardCoder(java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread hCPerfManagerThread, com.tencent.mm.hardcoder.i iVar) {
        if (!isHcEnable()) {
            com.tencent.mm.hardcoder.n.b(TAG, java.lang.String.format("initHardCoder client not enable Hardcoder, hcEnable:%b, checkEnv:%b", java.lang.Boolean.valueOf(isHcEnable()), java.lang.Boolean.valueOf(isCheckEnv())));
            return -3;
        }
        checkEnv = (str == null || str.equals("")) ? false : true;
        synchronized (lock) {
            if (hcPerfManager == null) {
                if (hCPerfManagerThread == null) {
                    hCPerfManagerThread = new com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread() { // from class: com.tencent.mm.hardcoder.HardCoderJNI.1
                        @Override // com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread
                        public java.lang.Thread newThread(java.lang.Runnable runnable, java.lang.String str3, int i18) {
                            return new java.lang.Thread(runnable, str3);
                        }
                    };
                }
                hcPerfManager = new com.tencent.mm.hardcoder.f(hCPerfManagerThread);
            }
        }
        tickRate = getTickRate();
        connectStatusCallback = iVar;
        return initHardCoder(str, i17, str2);
    }

    public static boolean isCheckEnv() {
        return checkEnv;
    }

    public static boolean isHcDebug() {
        return hcDebug;
    }

    public static boolean isHcEnable() {
        return hcEnable;
    }

    public static native int isRunning();

    public static void loadLibrary(com.tencent.mm.hardcoder.HardCoderJNI.NativeLibraryLoader nativeLibraryLoader) {
        if (nativeLibraryLoader != null) {
            nativeLibraryLoader.loadLibrary(LIB_NAME);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(LIB_NAME);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/hardcoder/HardCoderJNI", "loadLibrary", "(Lcom/tencent/mm/hardcoder/HardCoderJNI$NativeLibraryLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/hardcoder/HardCoderJNI", "loadLibrary", "(Lcom/tencent/mm/hardcoder/HardCoderJNI$NativeLibraryLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void onData(int i17, long j17, long j18, int i18, int i19, int i27, byte[] bArr) {
        com.tencent.mm.hardcoder.n.c(TAG, "onData callbackType:" + i17 + ", requestId:" + j17 + ", timestamp:" + j18 + ", retCode:" + i18 + ", funcId:" + i19 + ", dataType:" + i27);
        if (i17 != 1) {
            if (i17 != 2) {
                onRequestCallback(i17, j17, i18, i19, i27, bArr);
                return;
            }
            if (i19 != 1010) {
                onRequestCallback(i17, j17, i18, i19, i27, bArr);
                return;
            }
            com.tencent.mm.hardcoder.HardCoderJNI.AnrCallback anrCallback2 = anrCallback;
            if (anrCallback2 != null) {
                anrCallback2.onANR(bArr);
                return;
            }
            return;
        }
        if (i19 != 0) {
            onRequestCallback(i17, j17, i18, i19, i27, bArr);
            return;
        }
        switch (i18) {
            case ERR_CLIENT_ALREADY_INIT /* -20002 */:
                connect = true;
                com.tencent.mm.hardcoder.n.c(TAG, "onData callback, already initHardcoder!");
                return;
            case CLIENT_DISCONNECT /* -20001 */:
                connect = false;
                com.tencent.mm.hardcoder.i iVar = connectStatusCallback;
                if (iVar != null) {
                    iVar.onConnectStatus(false);
                    return;
                }
                return;
            case CLIENT_CONNECT /* -20000 */:
                connect = true;
                com.tencent.mm.hardcoder.i iVar2 = connectStatusCallback;
                if (iVar2 != null) {
                    iVar2.onConnectStatus(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static void onRequestCallback(int i17, long j17, int i18, int i19, int i27, byte[] bArr) {
        java.util.HashMap<java.lang.Long, com.tencent.mm.hardcoder.k> hashMap = requestStatusCallback;
        com.tencent.mm.hardcoder.j jVar = null;
        com.tencent.mm.hardcoder.k remove = hashMap != null ? hashMap.remove(java.lang.Long.valueOf(j17)) : null;
        java.util.HashMap<java.lang.Long, com.tencent.mm.hardcoder.j> hashMap2 = funcRetCallback;
        if (hashMap2 != null && (jVar = hashMap2.remove(java.lang.Long.valueOf(j17))) != null) {
            jVar.onFuncRet(i17, j17, i18, i19, i27, bArr);
        }
        if (remove == null && jVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRequestCallback, funcId:");
        sb6.append(i19);
        sb6.append(", requestId:");
        sb6.append(j17);
        sb6.append(", retCode:");
        sb6.append(i18);
        sb6.append(", requestStatus:");
        sb6.append(remove == null ? "null" : remove.toString());
        sb6.append(", funcRetCallback:");
        sb6.append(jVar == null ? "false" : "true");
        com.tencent.mm.hardcoder.n.c(TAG, sb6.toString());
    }

    public static void putFuncRetHashMap(long j17, com.tencent.mm.hardcoder.j jVar) {
        java.util.HashMap<java.lang.Long, com.tencent.mm.hardcoder.j> hashMap = funcRetCallback;
        if (hashMap != null) {
            hashMap.put(java.lang.Long.valueOf(j17), jVar);
        }
    }

    public static void putRequestStatusHashMap(long j17, com.tencent.mm.hardcoder.k kVar) {
        java.util.HashMap<java.lang.Long, com.tencent.mm.hardcoder.k> hashMap = requestStatusCallback;
        if (hashMap != null) {
            hashMap.put(java.lang.Long.valueOf(j17), kVar);
        }
    }

    public static java.lang.String readServerAddr() {
        java.lang.String str;
        try {
            synchronized (lock) {
                if (sSystemPropertiesClazz == null) {
                    sSystemPropertiesClazz = java.lang.Class.forName("android.os.SystemProperties");
                    java.lang.reflect.Method declaredMethod = sSystemPropertiesClazz.getDeclaredMethod("get", java.lang.String.class, java.lang.String.class);
                    sGetStringPropsMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                str = (java.lang.String) sGetStringPropsMethod.invoke(null, SERVER_PROP_KEY, "");
                com.tencent.mm.hardcoder.n.c(TAG, java.lang.String.format("readServerAddr, serverprop[%s] result[%s]", SERVER_PROP_KEY, str));
            }
            return str;
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr = new java.lang.Object[0];
            com.tencent.mm.hardcoder.m mVar = com.tencent.mm.hardcoder.n.f68276a;
            if (mVar == null) {
                return "";
            }
            mVar.printErrStackTrace(TAG, th6, "readServerAddr", objArr);
            return "";
        }
    }

    public static native long registerANRCallback(int i17, long j17);

    public static long registerANRCallback(com.tencent.mm.hardcoder.HardCoderJNI.AnrCallback anrCallback2) {
        anrCallback = anrCallback2;
        return registerANRCallback(android.os.Process.myTid(), android.os.SystemClock.elapsedRealtime());
    }

    public static native long registerBootPreloadResource(java.lang.String[] strArr, int i17, long j17);

    public static native long registerSystemEventCallback(int i17, long j17);

    public static native long requestCpuCoreForThread(int i17, long j17, int[] iArr, int i18, int i19, long j18);

    public static native long requestCpuHighFreq(int i17, long j17, int i18, int i19, int i27, long j18);

    public static native long requestGpuHighFreq(int i17, long j17, int i18, int i19, int i27, long j18);

    public static native long requestHighIOFreq(int i17, long j17, int i18, int i19, int i27, long j18);

    public static native long requestScreenResolution(int i17, java.lang.String str, int i18, long j17);

    public static native long requestUnifyCpuIOThreadCoreGpu(int i17, long j17, int i18, int i19, int i27, int[] iArr, int i28, int i29, long j18);

    public static native long resetScreenResolution(int i17, long j17);

    public static void setCheckEnv(boolean z17) {
        checkEnv = z17;
    }

    private static native void setDebug(boolean z17);

    private static native void setHCEnable(boolean z17);

    public static void setHcDebug(boolean z17) {
        hcDebug = z17;
        if (checkEnv) {
            setDebug(z17);
        }
    }

    public static void setHcEnable(boolean z17) {
        hcEnable = z17;
        if (checkEnv) {
            setHCEnable(z17);
        }
    }

    public static native void setRetryConnectInterval(int i17);

    public static void setSceneReportCallback(com.tencent.mm.hardcoder.l lVar) {
        sceneReportCallback = lVar;
    }

    public static int startPerformance(int i17, int i18, int i19, int i27, int i28, int i29, long j17, int i37, java.lang.String str) {
        return startPerformance(i17, i18, i19, 0, new int[]{i27}, i28, i29, j17, i37, str);
    }

    public static native int startTraceCpuLoad(int i17, int i18);

    public static int stopPerformance(int i17) {
        com.tencent.mm.hardcoder.f fVar = hcPerfManager;
        if (fVar == null) {
            com.tencent.mm.hardcoder.n.b(TAG, "stopPerformance error HCPerfManager is null, please initHardCoder first!");
            return -5;
        }
        if (!connect) {
            com.tencent.mm.hardcoder.n.b(TAG, "stopPerformance error disconnect");
            return -6;
        }
        fVar.getClass();
        com.tencent.mm.hardcoder.e eVar = new com.tencent.mm.hardcoder.e();
        eVar.f68257a = java.lang.System.currentTimeMillis();
        eVar.f68258b = i17;
        boolean offer = i17 != 0 ? fVar.f68261c.offer(eVar) : false;
        com.tencent.mm.hardcoder.n.a("Hardcoder.HCPerfManager", java.lang.String.format("stop ret:%b, hashcode:%x", java.lang.Boolean.valueOf(offer), java.lang.Integer.valueOf(i17)));
        com.tencent.mm.hardcoder.n.c(TAG, java.lang.String.format("stopPerformance:%d, ret:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(offer)));
        return offer ? 0 : -1;
    }

    public static native int stopTraceCpuLoad(int i17);

    public static native long terminateApp(int i17, long j17);

    public boolean isConnect() {
        return connect;
    }

    public static int startPerformance(int i17, int i18, int i19, int i27, int[] iArr, int i28, int i29, long j17, int i37, java.lang.String str) {
        com.tencent.mm.hardcoder.f fVar = hcPerfManager;
        if (fVar == null) {
            com.tencent.mm.hardcoder.n.b(TAG, "startPerformance error HCPerfManager is null, please initHardCoder first!");
            return -5;
        }
        if (!connect) {
            com.tencent.mm.hardcoder.n.b(TAG, "startPerformance error disconnect");
            return -6;
        }
        fVar.getClass();
        int i38 = 0;
        if ((i17 >= 0 && i18 >= 0 && i27 >= 0 && i19 >= 0 && iArr != null && iArr.length > 0 && i28 > 0) && (i18 != 0 || i19 != 0 || i27 != 0 || iArr.length != 1 || iArr[0] != 0)) {
            com.tencent.mm.hardcoder.d dVar = new com.tencent.mm.hardcoder.d();
            dVar.f68237b = i17;
            dVar.f68239d = i18;
            dVar.f68241f = i19;
            dVar.f68242g = (int[]) iArr.clone();
            dVar.f68240e = i27;
            dVar.f68238c = i28;
            dVar.f68243h = i29;
            dVar.f68244i = j17;
            dVar.f68248m = i37;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            dVar.f68246k = currentTimeMillis;
            long j18 = currentTimeMillis + i17;
            dVar.f68245j = j18;
            dVar.f68247l = i28 + j18;
            dVar.f68249n = str;
            dVar.f68252q = j18;
            boolean offer = fVar.f68261c.offer(dVar);
            com.tencent.mm.hardcoder.n.a("Hardcoder.HCPerfManager", java.lang.String.format("start ret:%b ,task:%s", java.lang.Boolean.valueOf(offer), dVar.c(dVar.f68246k)));
            if (offer) {
                i38 = dVar.hashCode();
            }
        } else {
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(i18);
            objArr[2] = java.lang.Integer.valueOf(i19);
            objArr[3] = java.lang.Integer.valueOf(i27);
            objArr[4] = java.lang.Integer.valueOf(iArr == null ? 0 : iArr.length);
            objArr[5] = java.lang.Integer.valueOf(i28);
            com.tencent.mm.hardcoder.n.b("Hardcoder.HCPerfManager", java.lang.String.format("start error params, ignore this task! delay:%d, [cpu:%d, io:%d, gpu:%d], bindTids:%d, timeout:%d", objArr));
        }
        com.tencent.mm.hardcoder.n.c(TAG, java.lang.String.format("hcPerfManager startPerformance:%d, scene:%d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i29)));
        return i38;
    }
}
