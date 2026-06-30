package com.p314xaae8f345.p373xbe494963;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.LiveSettingJni */
/* loaded from: classes16.dex */
public class C3726xa247d561 {
    private static final java.lang.String TAG = "LiveSettingJni";

    /* renamed from: mUserId */
    private static java.lang.String f14383x1d975513;

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    /* renamed from: getUserId */
    public static java.lang.String m29039x3342513c() {
        return f14383x1d975513;
    }

    /* renamed from: nativeSetAppId */
    private static native void m29040x6aa9ed11(java.lang.String str);

    /* renamed from: nativeSetAppVersion */
    private static native void m29041x1866c6a2(java.lang.String str);

    /* renamed from: nativeSetUserId */
    private static native void m29042xcda7ef1(java.lang.String str);

    /* renamed from: setAppId */
    public static void m29043x52b73fda(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        m29040x6aa9ed11(str);
    }

    /* renamed from: setAppVersion */
    public static void m29044x74dac979(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        m29041x1866c6a2(str);
    }

    /* renamed from: setUserId */
    public static void m29045x26778548(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f14383x1d975513 = str;
        m29042xcda7ef1(str);
    }
}
