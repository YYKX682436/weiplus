package com.tencent.liteav;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class LiveSettingJni {
    private static final java.lang.String TAG = "LiveSettingJni";
    private static java.lang.String mUserId;

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public static java.lang.String getUserId() {
        return mUserId;
    }

    private static native void nativeSetAppId(java.lang.String str);

    private static native void nativeSetAppVersion(java.lang.String str);

    private static native void nativeSetUserId(java.lang.String str);

    public static void setAppId(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        nativeSetAppId(str);
    }

    public static void setAppVersion(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        nativeSetAppVersion(str);
    }

    public static void setUserId(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        mUserId = str;
        nativeSetUserId(str);
    }
}
