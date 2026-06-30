package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.util.CommonUtil */
/* loaded from: classes16.dex */
public class C3774xbd6c7cad {

    /* renamed from: mNativeNtpTimeManagerDelegate */
    private static long f14740x2d4445ff;

    /* renamed from: sCallback */
    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.a f14741x945461d8;

    /* renamed from: com.tencent.liteav.base.util.CommonUtil$a */
    /* loaded from: classes16.dex */
    public interface a {
        void a(int i17, java.lang.String str);
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    /* renamed from: equals */
    public static boolean m29498xb2c87fbf(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: getFileExtension */
    public static java.lang.String m29499x71d56e6d(java.lang.String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: getNetworkTimestamp */
    public static long m29500x78c9e9fe() {
        if (m29505x7c4c2db4()) {
            return m29503x983a467(f14740x2d4445ff);
        }
        return 0L;
    }

    /* renamed from: getSDKVersionStr */
    public static java.lang.String m29501xdb46aa5d() {
        return m29504x981ddc5d();
    }

    /* renamed from: nativeCreate */
    private static native long m29502x73c02ff3();

    /* renamed from: nativeGetNetworkTimestamp */
    private static native long m29503x983a467(long j17);

    /* renamed from: nativeGetSDKVersion */
    public static native java.lang.String m29504x981ddc5d();

    /* renamed from: nativeNtpTimeManagerDelegateHasBeenCreated */
    private static boolean m29505x7c4c2db4() {
        return f14741x945461d8 != null;
    }

    /* renamed from: nativeSetGlobalEnv */
    private static native int m29506xcabbb1bf(java.lang.String str);

    /* renamed from: nativeSetSocks5Proxy */
    private static native boolean m29507xf0d2bb5d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, boolean z19);

    /* renamed from: nativeUpdateNetworkTime */
    private static native int m29508x1dece23b(long j17);

    /* renamed from: onUpdateNetworkTime */
    public static void m29509xd6b96d73(int i17, java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.a aVar = f14741x945461d8;
        if (aVar != null) {
            aVar.a(i17, str);
        }
    }

    /* renamed from: setGlobalEnv */
    public static int m29510x72e07808(java.lang.String str) {
        return m29506xcabbb1bf(str);
    }

    /* renamed from: setSocks5Proxy */
    public static boolean m29511x22df1366(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, boolean z19) {
        return m29507xf0d2bb5d(str, i17, str2, str3, z17, z18, z19);
    }

    /* renamed from: setUpdateNetworkTimeCallback */
    public static void m29512xc12469b5(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.a aVar) {
        if (m29505x7c4c2db4()) {
            return;
        }
        f14740x2d4445ff = m29502x73c02ff3();
        f14741x945461d8 = aVar;
    }

    /* renamed from: updateNetworkTime */
    public static int m29513x4865a192() {
        if (m29505x7c4c2db4()) {
            return m29508x1dece23b(f14740x2d4445ff);
        }
        return -1;
    }
}
