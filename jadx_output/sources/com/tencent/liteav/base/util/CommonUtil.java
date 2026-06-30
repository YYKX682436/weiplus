package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class CommonUtil {
    private static long mNativeNtpTimeManagerDelegate;
    private static com.tencent.liteav.base.util.CommonUtil.a sCallback;

    /* loaded from: classes16.dex */
    public interface a {
        void a(int i17, java.lang.String str);
    }

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static java.lang.String getFileExtension(java.lang.String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static long getNetworkTimestamp() {
        if (nativeNtpTimeManagerDelegateHasBeenCreated()) {
            return nativeGetNetworkTimestamp(mNativeNtpTimeManagerDelegate);
        }
        return 0L;
    }

    public static java.lang.String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    private static native long nativeCreate();

    private static native long nativeGetNetworkTimestamp(long j17);

    public static native java.lang.String nativeGetSDKVersion();

    private static boolean nativeNtpTimeManagerDelegateHasBeenCreated() {
        return sCallback != null;
    }

    private static native int nativeSetGlobalEnv(java.lang.String str);

    private static native boolean nativeSetSocks5Proxy(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, boolean z19);

    private static native int nativeUpdateNetworkTime(long j17);

    public static void onUpdateNetworkTime(int i17, java.lang.String str) {
        com.tencent.liteav.base.util.CommonUtil.a aVar = sCallback;
        if (aVar != null) {
            aVar.a(i17, str);
        }
    }

    public static int setGlobalEnv(java.lang.String str) {
        return nativeSetGlobalEnv(str);
    }

    public static boolean setSocks5Proxy(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, boolean z19) {
        return nativeSetSocks5Proxy(str, i17, str2, str3, z17, z18, z19);
    }

    public static void setUpdateNetworkTimeCallback(com.tencent.liteav.base.util.CommonUtil.a aVar) {
        if (nativeNtpTimeManagerDelegateHasBeenCreated()) {
            return;
        }
        mNativeNtpTimeManagerDelegate = nativeCreate();
        sCallback = aVar;
    }

    public static int updateNetworkTime() {
        if (nativeNtpTimeManagerDelegateHasBeenCreated()) {
            return nativeUpdateNetworkTime(mNativeNtpTimeManagerDelegate);
        }
        return -1;
    }
}
