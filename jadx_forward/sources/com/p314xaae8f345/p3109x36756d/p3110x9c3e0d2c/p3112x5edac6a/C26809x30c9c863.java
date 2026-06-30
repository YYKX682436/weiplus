package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager */
/* loaded from: classes16.dex */
public class C26809x30c9c863 {

    /* renamed from: ENGINE_PACKAGE_NAME */
    private static final java.lang.String f57420xe553c9e1 = "com.hihonor.android.magicx.media.audioengine";

    /* renamed from: PACKAGE_INFO_FLAG */
    private static final int f57422x97325384 = 0;

    /* renamed from: SUB_VERSION_MASK */
    private static final int f57424x3bb55dd2 = 1000;
    private static final java.lang.String TAG = "HnAudioEngine.FeatureKitManager";

    /* renamed from: mMinVersion */
    public static long f57426xca77a673;

    /* renamed from: sInstance */
    private static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 f57427xbfaed628;

    /* renamed from: mCallBack */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26816x4a2b96a5 f57428x1aab3bf2 = null;

    /* renamed from: SET_CALL_BACK_LOCK */
    private static final java.lang.Object f57423x9cfe627f = new java.lang.Object();

    /* renamed from: NEW_FEATUREMANAGER_LOCK */
    private static final java.lang.Object f57421x1e5c7b34 = new java.lang.Object();

    /* renamed from: BIND_SERVICE_LOCK */
    private static final java.lang.Object f57419xa21b5157 = new java.lang.Object();

    /* renamed from: UNBIND_SERVICE_LOCK */
    private static final java.lang.Object f57425xd020abde = new java.lang.Object();

    private C26809x30c9c863() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 m105832x9cf0d20b() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 c26809x30c9c863;
        synchronized (f57421x1e5c7b34) {
            if (f57427xbfaed628 == null) {
                f57427xbfaed628 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863();
            }
            c26809x30c9c863 = f57427xbfaed628;
        }
        return c26809x30c9c863;
    }

    /* renamed from: isAudioKitSupport */
    public static boolean m105833xbfc3d205(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "context is null");
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager == null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "packageManager is null");
                return false;
            }
            int i17 = packageManager.getPackageInfo(f57420xe553c9e1, 0).versionCode / 1000;
            long j17 = i17;
            if (j17 > 1000001) {
                j17 = 1000001;
            }
            f57426xca77a673 = j17;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, " isDeviceSupport is true, enginVersionCode=" + i17 + " audioKitVersionCode=1000001");
            return true;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    /* renamed from: bindService */
    public void m105834x54856bb8(android.content.Context context, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        synchronized (f57419xa21b5157) {
            if (context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(f57420xe553c9e1, str);
            try {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "bindService");
                context.bindService(intent, serviceConnection, 1);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "bindService, SecurityException, " + th6.getMessage());
            }
        }
    }

    /* renamed from: createFeatureKit */
    public <T extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d> T m105835x63d3b21c(int i17, android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "createFeatureKit, type =".concat(java.lang.String.valueOf(i17)));
        if (context == null) {
            return null;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7(context);
            c26808x5890a1e7.m105825x33ebcb90(context);
            return c26808x5890a1e7;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb c26806xdc65f6eb = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb(context);
                c26806xdc65f6eb.m105809x33ebcb90(context);
                return c26806xdc65f6eb;
            }
            if (i17 != 4) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "createFeatureKit, type error");
                return null;
            }
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28 c26803xe6048c28 = new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28(context);
        c26803xe6048c28.m105756x33ebcb90(context);
        return c26803xe6048c28;
    }

    /* renamed from: getCallBack */
    public com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26816x4a2b96a5 m105836x7187d1db() {
        return this.f57428x1aab3bf2;
    }

    /* renamed from: onCallBack */
    public void m105837x9ac7b764(int i17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "onCallBack, result =".concat(java.lang.String.valueOf(i17)));
        synchronized (f57423x9cfe627f) {
            if (m105836x7187d1db() != null) {
                m105836x7187d1db().mo105734x57429edc(i17);
            }
        }
    }

    /* renamed from: setCallBack */
    public void m105838x6c4032e7(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26816x4a2b96a5 interfaceC26816x4a2b96a5) {
        this.f57428x1aab3bf2 = interfaceC26816x4a2b96a5;
    }

    /* renamed from: unbindService */
    public void m105839xa4bc737f(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "unbindService");
        synchronized (f57425xd020abde) {
            if (context != null) {
                context.unbindService(serviceConnection);
            }
        }
    }
}
