package com.p314xaae8f345.p2836x689789f0;

/* renamed from: com.tencent.nativecrash.NativeCrash */
/* loaded from: classes12.dex */
public final class C22999xca3e41b0 {

    /* renamed from: DEFAULT_FULL_FLAGS */
    public static final int f40029x3fef1195 = -1;

    /* renamed from: DEFAULT_SHORT_FLAGS */
    public static final int f40030xf65ec7a6 = 1867;

    /* renamed from: DUMP_ABORT_MESSAGE */
    public static final int f40031x11cad6ad = 1024;

    /* renamed from: DUMP_FILE_DESCRIPTORS */
    public static final int f40032x134ef76c = 2048;

    /* renamed from: DUMP_JAVA_STACK */
    public static final int f40033x80415136 = 64;

    /* renamed from: DUMP_MAPPINGS */
    public static final int f40034x4828e350 = 32;

    /* renamed from: DUMP_OTHER_THREADS */
    public static final int f40035x7c44062f = 128;

    /* renamed from: DUMP_PRESET_CUSTOM */
    public static final int f40036x382085c6 = 256;

    /* renamed from: DUMP_PROCESS */
    public static final int f40037xef814f04 = 1;

    /* renamed from: DUMP_REALTIME_CUSTOM */
    public static final int f40038x9094207a = 512;

    /* renamed from: DUMP_REGISTER */
    public static final int f40039x136e108e = 4;

    /* renamed from: DUMP_SIGNAL */
    public static final int f40040xeb4dd353 = 2;

    /* renamed from: DUMP_STACK */
    public static final int f40041x8bbd185d = 8;

    /* renamed from: DUMP_STACK_MEMORY */
    public static final int f40042x376ae323 = 16;
    private static final java.lang.String TAG = "NativeCrash";

    /* renamed from: UTF8 */
    private static final java.nio.charset.Charset f40043x27e791 = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);

    /* renamed from: mANRCallback */
    private static com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.ANRCallback f40044xfa97569d;

    /* renamed from: mCrashCallback */
    private static com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback f40045x61de599f;

    /* renamed from: _hellAccFlag_ */
    private byte f40046x7f11beae;

    /* renamed from: com.tencent.nativecrash.NativeCrash$ANRCallback */
    /* loaded from: classes12.dex */
    public interface ANRCallback {
        /* renamed from: onANRDumped */
        boolean m84141x3f2078b9(int i17, java.lang.String str);
    }

    /* renamed from: com.tencent.nativecrash.NativeCrash$CrashCallback */
    /* loaded from: classes12.dex */
    public interface CrashCallback {
        /* renamed from: onCrashDumped */
        boolean mo84142x49fed8bb(int i17, java.lang.String str, java.lang.String str2);
    }

    private C22999xca3e41b0() {
    }

    /* renamed from: anrCallback */
    public static com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.ANRCallback m84124x6246494a() {
        return f40044xfa97569d;
    }

    /* renamed from: crashCallback */
    public static com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback m84126x6d0510c() {
        return f40045x61de599f;
    }

    /* renamed from: customInfo */
    public static void m84128xa1b443bf(java.lang.String str) {
        if (str == null) {
            return;
        }
        m84132x87b07f36((!str.endsWith("\n") ? str.concat("\n\u0000") : str.concat("\u0000")).getBytes(f40043x27e791));
    }

    /* renamed from: init */
    public static void m84129x316510(java.lang.String str, int i17, int i18) {
        m84130x316510(str, i17, i18, false);
    }

    /* renamed from: nativeCustomInfo */
    private static native void m84132x87b07f36(byte[] bArr);

    /* renamed from: nativeInit */
    private static native void m84133xb90145c7(java.lang.String str, int i17, int i18, boolean z17);

    /* renamed from: nativeInitFd */
    private static native void m84134x7dc6f8e5(int[] iArr, int i17, int i18);

    /* renamed from: nativeReserveMemory */
    private static native void m84135x76f23606();

    /* renamed from: nativeResetCustomInfo */
    private static native void m84136xced07d57();

    /* renamed from: onANRDumped */
    private static boolean m84137x3f2078b9(int i17, java.lang.String str) {
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.ANRCallback aNRCallback = f40044xfa97569d;
        return aNRCallback != null && aNRCallback.m84141x3f2078b9(i17, str);
    }

    /* renamed from: onCrashDumped */
    private static boolean m84138x49fed8bb(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback crashCallback = f40045x61de599f;
        return crashCallback != null && crashCallback.mo84142x49fed8bb(i17, str, str2);
    }

    /* renamed from: reserveMemory */
    public static void m84139xd36638dd() {
        m84135x76f23606();
    }

    /* renamed from: resetCustomInfo */
    public static void m84140xde4f266e() {
        m84136xced07d57();
    }

    /* renamed from: anrCallback */
    public static com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.ANRCallback m84125x6246494a(com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.ANRCallback aNRCallback) {
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.ANRCallback aNRCallback2 = f40044xfa97569d;
        f40044xfa97569d = aNRCallback;
        return aNRCallback2;
    }

    /* renamed from: crashCallback */
    public static com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback m84127x6d0510c(com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback crashCallback) {
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback crashCallback2 = f40045x61de599f;
        f40045x61de599f = crashCallback;
        return crashCallback2;
    }

    /* renamed from: init */
    public static void m84130x316510(java.lang.String str, int i17, int i18, boolean z17) {
        if (!com.p314xaae8f345.p2836x689789f0.C22998x9e898ad0.f40028xf05706ea) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("wechatcrash");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/nativecrash/NativeCrash", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Ljava/lang/String;IIZ)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/nativecrash/NativeCrash", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Ljava/lang/String;IIZ)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        m84133xb90145c7(str, i17, i18, z17);
    }

    /* renamed from: init */
    public static void m84131x316510(android.os.ParcelFileDescriptor[] parcelFileDescriptorArr, int i17, int i18) {
        if (!com.p314xaae8f345.p2836x689789f0.C22998x9e898ad0.f40028xf05706ea) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("wechatcrash");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/nativecrash/NativeCrash", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "([Landroid/os/ParcelFileDescriptor;II)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/nativecrash/NativeCrash", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "([Landroid/os/ParcelFileDescriptor;II)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        int[] iArr = new int[parcelFileDescriptorArr.length];
        for (int i19 = 0; i19 < parcelFileDescriptorArr.length; i19++) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArr[i19];
            iArr[i19] = parcelFileDescriptor == null ? -1 : parcelFileDescriptor.getFd();
        }
        m84134x7dc6f8e5(iArr, i17, i18);
    }
}
