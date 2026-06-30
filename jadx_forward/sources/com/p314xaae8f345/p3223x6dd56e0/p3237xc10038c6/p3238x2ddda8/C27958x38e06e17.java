package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8;

/* renamed from: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface */
/* loaded from: classes14.dex */
public class C27958x38e06e17 {

    /* renamed from: DAT_SUFFIX */
    private static final java.lang.String f62583xd2a5dd19 = "SDK.dat";

    /* renamed from: LICENCE_SUFFIX */
    private static final java.lang.String f62584xa632b11f = "SDK.licence";

    /* renamed from: SDK_NAME */
    private static final java.lang.String f62585x4083eb90 = "YoutuFaceTrack";

    /* renamed from: SDK_PREFIX */
    private static final java.lang.String f62586x338cf257 = "YT";
    private static final java.lang.String TAG = "log_print_java";

    /* renamed from: VERSION */
    private static java.lang.String f62587x3fc0a8b8 = "1.2";

    /* renamed from: handle */
    private static long f62588xb7026e28 = 0;

    /* renamed from: isReportStarted */
    private static boolean f62589xdb3a57a3 = false;

    /* renamed from: licenceStr */
    private static java.lang.String f62590xab4e5620 = "";

    /* renamed from: mListener */
    private static com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.HttpResponseListener f62591x753a6c41 = new com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.HttpResponseListener() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.3
        @Override // com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.HttpResponseListener
        /* renamed from: onFail */
        public void mo121217xc399519d(int i17) {
            try {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.TAG, "http request error : " + i17);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.TAG, "handle: " + com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.f62588xb7026e28);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.m121243x52f33f6d(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.f62588xb7026e28, null);
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.HttpResponseListener
        /* renamed from: onSuccess */
        public void mo121218xe05b4124(java.lang.String str) {
            try {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.TAG, "response: " + str);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.TAG, "handle: " + com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.f62588xb7026e28);
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.m121243x52f33f6d(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.f62588xb7026e28, str);
            } catch (java.lang.Exception unused) {
            }
        }
    };

    /* renamed from: timerFlush */
    private static java.util.Timer f62592x61a406bf;

    /* renamed from: timerReport */
    private static java.util.Timer f62593xe6f200d9;

    /* renamed from: nativePtr */
    private long f62594xc3e75f57;

    /* renamed from: access$000 */
    public static /* synthetic */ java.lang.String m121227xbbd77af0() {
        return m121236xc126b0ef();
    }

    /* renamed from: access$100 */
    public static /* synthetic */ long m121228xbbd77eb1() {
        return m121240x66fc712d();
    }

    /* renamed from: check */
    public static boolean m121232x5a3e508() {
        boolean m121239x66d01b31 = m121239x66d01b31(f62588xb7026e28);
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i("sdk", "--------------check");
        return m121239x66d01b31;
    }

    /* renamed from: getCurrentAuthStatus */
    private static native int m121233x260195d(long j17);

    /* renamed from: getHandle */
    public static long m121234x1c19911e() {
        return f62588xb7026e28;
    }

    /* renamed from: getIsNeedReport */
    private static native int m121235x906310aa(long j17);

    /* renamed from: getReportContent */
    private static native java.lang.String m121236xc126b0ef();

    /* renamed from: init */
    public static int m121237x316510(android.content.Context context, java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "start init");
        java.lang.String str2 = context.getFilesDir().getPath() + "/YTYoutuFaceTrackSDK.dat";
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "path: " + str2);
        f62588xb7026e28 = m121241x67277367(context, i17, str, context.getAssets(), str2);
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "handleinit: " + f62588xb7026e28);
        if (m121235x906310aa(f62588xb7026e28) == 0) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "no need to report");
        } else {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "need report");
            m121246xa19bc003();
        }
        return m121233x260195d(f62588xb7026e28);
    }

    /* renamed from: isInMainThread */
    private static boolean m121238x88548272() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    /* renamed from: nativeCheck */
    private static native boolean m121239x66d01b31(long j17);

    /* renamed from: nativeFlush */
    private static native long m121240x66fc712d();

    /* renamed from: nativeInitN */
    private static native long m121241x67277367(android.content.Context context, int i17, java.lang.String str, android.content.res.AssetManager assetManager, java.lang.String str2);

    /* renamed from: nativePreInitAndCheck */
    private static native int m121242x45a343cd(byte[] bArr, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeUpdateFromServer */
    public static native long m121243x52f33f6d(long j17, java.lang.String str);

    /* renamed from: preCheckAndInitWithLicenceStr */
    public static int m121244x29a01fc8(android.content.Context context, java.lang.String str) {
        f62590xab4e5620 = str;
        try {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            if (length <= 0) {
                throw new java.io.IOException("licence error");
            }
            java.lang.String str2 = context.getFilesDir().getPath() + "/YTYoutuFaceTrackSDK.dat";
            java.lang.String packageName = context.getPackageName();
            java.lang.String m121221xedf764 = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27957x2e1a652e.m121221xedf764(context);
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "Package name: " + packageName);
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "Device id: " + m121221xedf764);
            return m121242x45a343cd(bytes, length, packageName, m121221xedf764, str2);
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: report */
    public static void m121245xc84c5534(final java.lang.String str) {
        if (m121238x88548272()) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.m121216x3498a0("https://api.youtu.qq.com/auth/report", str, com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.f62591x753a6c41);
                    } catch (java.io.IOException unused) {
                    }
                }
            }).start();
        } else {
            try {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.m121216x3498a0("https://api.youtu.qq.com/auth/report", str, f62591x753a6c41);
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: startTimer */
    private static void m121246xa19bc003() {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "start timer");
        if (f62589xdb3a57a3) {
            return;
        }
        java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                java.lang.String m121227xbbd77af0 = com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.m121227xbbd77af0();
                if (m121227xbbd77af0 != "") {
                    com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.m121245xc84c5534(m121227xbbd77af0);
                }
            }
        };
        java.util.Timer timer = new java.util.Timer(true);
        f62593xe6f200d9 = timer;
        timer.schedule(timerTask, 600000L, 600000L);
        java.util.TimerTask timerTask2 = new java.util.TimerTask() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.TAG, "flush in java ");
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27958x38e06e17.m121228xbbd77eb1();
            }
        };
        java.util.Timer timer2 = new java.util.Timer(true);
        f62592x61a406bf = timer2;
        timer2.schedule(timerTask2, 600000L, 600000L);
        f62589xdb3a57a3 = true;
    }
}
