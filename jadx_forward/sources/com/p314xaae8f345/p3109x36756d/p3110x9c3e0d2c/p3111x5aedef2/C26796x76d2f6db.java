package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2;

/* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager */
/* loaded from: classes16.dex */
public class C26796x76d2f6db {

    /* renamed from: ENGINE_PACKAGE_NAME */
    private static final java.lang.String f57307xe553c9e1 = "com.huawei.multimedia.audioengine";

    /* renamed from: PACKAGE_INFO_FLAG */
    private static final int f57309x97325384 = 0;
    private static final java.lang.String TAG = "DaisyAudioKit.DaisyFeatureKitManager";

    /* renamed from: sInstance */
    private static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db f57312xbfaed628;

    /* renamed from: mCallBack */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26801xf73addce f57313x1aab3bf2 = null;

    /* renamed from: SET_CALL_BACK_LOCK */
    private static final java.lang.Object f57310x9cfe627f = new java.lang.Object();

    /* renamed from: NEW_FEATUREMANAGER_LOCK */
    private static final java.lang.Object f57308x1e5c7b34 = new java.lang.Object();

    /* renamed from: BIND_SERVICE_LOCK */
    private static final java.lang.Object f57306xa21b5157 = new java.lang.Object();

    /* renamed from: UNBIND_SERVICE_LOCK */
    private static final java.lang.Object f57311xd020abde = new java.lang.Object();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db m105693x9cf0d20b() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db c26796x76d2f6db;
        synchronized (f57308x1e5c7b34) {
            if (f57312xbfaed628 == null) {
                f57312xbfaed628 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db();
            }
            c26796x76d2f6db = f57312xbfaed628;
        }
        return c26796x76d2f6db;
    }

    /* renamed from: isAudioKitSupport */
    public static boolean m105694xbfc3d205(android.content.Context context) {
        if (context == null) {
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            return packageManager.getPackageInfo(f57307xe553c9e1, 0) != null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    /* renamed from: bindService */
    public void m105695x54856bb8(android.content.Context context, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        synchronized (f57306xa21b5157) {
            if (context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(f57307xe553c9e1, str);
            try {
                context.bindService(intent, serviceConnection, 1);
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "bindService, SecurityException, %s", e17.getMessage());
            }
        }
    }

    /* renamed from: createFeatureKit */
    public <T extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26793xee5f3695> T m105696x63d3b21c(int i17, android.content.Context context) {
        if (context == null || i17 != 1) {
            return null;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140(context);
        c26794xe6f50140.m105662x33ebcb90(context);
        return c26794xe6f50140;
    }

    /* renamed from: getCallBack */
    public com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26801xf73addce m105697x7187d1db() {
        return this.f57313x1aab3bf2;
    }

    /* renamed from: onCallBack */
    public void m105698x9ac7b764(int i17) {
        synchronized (f57310x9cfe627f) {
            if (m105697x7187d1db() != null) {
                m105697x7187d1db().mo105712x57429edc(i17);
            }
        }
    }

    /* renamed from: setCallBack */
    public void m105699x6c4032e7(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26801xf73addce interfaceC26801xf73addce) {
        this.f57313x1aab3bf2 = interfaceC26801xf73addce;
    }

    /* renamed from: unbindService */
    public void m105700xa4bc737f(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        synchronized (f57311xd020abde) {
            if (context != null) {
                context.unbindService(serviceConnection);
            }
        }
    }
}
