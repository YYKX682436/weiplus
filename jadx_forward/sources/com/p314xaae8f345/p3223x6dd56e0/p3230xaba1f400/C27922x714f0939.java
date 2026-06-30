package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface */
/* loaded from: classes14.dex */
public class C27922x714f0939 {

    /* renamed from: ERRCODE_GET_ACTREFLECTDATA_FAILED */
    private static int f62355x55e4611 = 4;

    /* renamed from: ERRCODE_JNI_DETECT_FAILED */
    private static int f62356xbafd0bd2 = 3;

    /* renamed from: ERRCODE_JSON_DECODE_FAILED */
    private static int f62357xa55be544 = 2;

    /* renamed from: ERRCODE_NET_RETURN_PARSE_NULL */
    private static int f62358x77746813 = 0;

    /* renamed from: ERRCODE_UPLOAD_VIDEO_FAILED */
    private static int f62359xf93c1712 = 1;
    private static final java.lang.String TAG = "YoutuLightLiveCheck";

    /* renamed from: VERSION */
    public static final java.lang.String f62360x3fc0a8b8 = "3.6.9.2";

    /* renamed from: mAppId */
    public static java.lang.String f62364xbdc8caaf = "";

    /* renamed from: mCamera */
    private static android.hardware.Camera f62365xfde5e9f2;

    /* renamed from: mCameraRotatedTag */
    private static int f62366xfcaef403;

    /* renamed from: mCheckResult */
    private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.LightLiveCheckResult f62367xd555c498;

    /* renamed from: mColorSeq */
    private static java.lang.String f62368xff825d89;

    /* renamed from: mGetValueTimer */
    private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703 f62369xc27984dd;

    /* renamed from: mOnGetValueCount */
    private static int f62371x693bda48;

    /* renamed from: mReflectListener */
    private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener f62373xf0c52264;

    /* renamed from: mReflectNotice */
    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3234xc20796d8.InterfaceC27947x5a0ae09a f62374x2b6ba088;

    /* renamed from: mState */
    private static int f62375xbec81024;

    /* renamed from: mAGSettings */
    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27923xf59fb73f f62363xe45dbe96 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27923xf59fb73f();

    /* renamed from: mInitModel */
    private static int f62370x6a5b9a0c = 0;

    /* renamed from: initLock */
    private static java.util.concurrent.locks.Lock f62362xffc965b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: getLiveStyleResultHandler */
    private static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult f62361x4bd5d73e = null;

    /* renamed from: mOverlayAlpha */
    private static int f62372xa6f5c7fb = 0;

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$GetLiveStyleResult */
    /* loaded from: classes14.dex */
    public interface GetLiveStyleResult {
        /* renamed from: onFailed */
        void mo120861x428b6afc(int i17, java.lang.String str, java.lang.String str2);

        /* renamed from: onSuccess */
        void mo120862xe05b4124(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.YTLiveStyleReq yTLiveStyleReq, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.C27949xad84f366 c27949xad84f366);
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$IYTReflectListener */
    /* loaded from: classes14.dex */
    public interface IYTReflectListener {
        /* renamed from: onGetAppBrightness */
        float mo120900xee427d9b();

        /* renamed from: onReflectEvent */
        void mo120901xbd8fe55c(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17);

        /* renamed from: onReflectStart */
        void mo120902xbe543724(long j17);
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$LightLiveCheckResult */
    /* loaded from: classes14.dex */
    public interface LightLiveCheckResult {

        /* renamed from: AUTH_FAILED */
        public static final int f62376xe4d682b4 = 1;

        /* renamed from: FINISH_ERRORBASE */
        public static final int f62377xe252c40d = 300;

        /* renamed from: INIT_ERRORBASE */
        public static final int f62378x81e0e84a = 100;

        /* renamed from: NOT_INIT_MODEL */
        public static final int f62379xaa35c026 = 2;

        /* renamed from: NOT_SET_RGBREQUEST */
        public static final int f62380x332704b = 4;

        /* renamed from: NOT_SET_UPLOADREQUEST */
        public static final int f62381xd925d185 = 5;

        /* renamed from: REFLECT_ERRORBASE */
        public static final int f62382xcb6e2197 = 200;

        /* renamed from: SUCCESS */
        public static final int f62383xbb80cbe3 = 0;

        /* renamed from: USER_CANCEL */
        public static final int f62384xf7ce716e = 3;

        /* renamed from: onFailed */
        void mo120896x428b6afc(int i17, java.lang.String str, java.lang.String str2);

        /* renamed from: onSuccess */
        void mo120897xe05b4124(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27931x532e7d68 c27931x532e7d68);
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$LightLiveProcessState */
    /* loaded from: classes6.dex */
    public interface LightLiveProcessState {

        /* renamed from: GET_RGBCONFIG */
        public static final int f62385x2310c066 = 1;

        /* renamed from: HANGUP */
        public static final int f62386x7e956e8d = 0;

        /* renamed from: REFLECTING */
        public static final int f62387xcb79d805 = 2;

        /* renamed from: UPLOAD */
        public static final int f62388x95970201 = 3;
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$YTSAFETYLEVEL */
    /* loaded from: classes6.dex */
    public interface YTSAFETYLEVEL {

        /* renamed from: SAFETY_HIGH */
        public static final int f62389xcffa6eef = 2;

        /* renamed from: SAFETY_LOW */
        public static final int f62390x1739b047 = 1;

        /* renamed from: SAFETY_RECOMMEND */
        public static final int f62391xd1124f6f = 0;
    }

    /* renamed from: access$008 */
    public static /* synthetic */ int m121047xbbd77af8() {
        int i17 = f62371x693bda48;
        f62371x693bda48 = i17 + 1;
        return i17;
    }

    /* renamed from: cancel */
    public static void m121052xae7a2e7a() {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.cancel] --- ");
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121111x7510799b();
    }

    /* renamed from: getAGSettings */
    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27923xf59fb73f m121053xf66c7e3f() {
        return f62363xe45dbe96;
    }

    /* renamed from: getLiveCheckType */
    public static int m121054x161b9920(android.content.Context context, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult getLiveStyleResult) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] --- start");
        int i17 = 1;
        if (getLiveStyleResult != null) {
            if (context == null) {
                getLiveStyleResult.mo120861x428b6afc(1, "Input context is null.", "You can try to input getActivity().getApplicationContext() and test again.");
                i17 = 2;
            } else {
                if (f62361x4bd5d73e != null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] repeated calls. this may cause the previous call lost callback.");
                }
                f62361x4bd5d73e = getLiveStyleResult;
                f62371x693bda48 = 0;
                int m121192x68ac462 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.m121190x9cf0d20b().m121192x68ac462(context, new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.OnGetValue() { // from class: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.1
                    @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.OnGetValue
                    /* renamed from: onGetValue */
                    public void mo121071x1a645aba(float f17) {
                        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121047xbbd77af8();
                        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onGetValue] get value: " + f17 + " mOnGetValueCount: " + com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62371x693bda48);
                        if (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62371x693bda48 > 1) {
                            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onGetValue] get value: " + f17);
                            if (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62369xc27984dd != null) {
                                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62369xc27984dd.m121206xae7a2e7a();
                                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703 unused = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62369xc27984dd = null;
                            }
                            if (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62361x4bd5d73e != null) {
                                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62361x4bd5d73e.mo120862xe05b4124(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.YTLiveStyleReq(f17, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62364xbdc8caaf), new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.C27949xad84f366());
                                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult unused2 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62361x4bd5d73e = null;
                            }
                            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.m121190x9cf0d20b().m121193x360802();
                        }
                    }
                });
                if (m121192x68ac462 == 1) {
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] Can't find light sensor.");
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult getLiveStyleResult2 = f62361x4bd5d73e;
                    if (getLiveStyleResult2 != null) {
                        getLiveStyleResult2.mo120862xe05b4124(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.YTLiveStyleReq(-1.0f, f62364xbdc8caaf), new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.C27949xad84f366());
                        f62361x4bd5d73e = null;
                    }
                } else if (m121192x68ac462 != 0) {
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult getLiveStyleResult3 = f62361x4bd5d73e;
                    if (getLiveStyleResult3 != null) {
                        getLiveStyleResult3.mo120862xe05b4124(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.YTLiveStyleReq(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27952xc2b51bd1.m121190x9cf0d20b().m121191xb58854d9(), f62364xbdc8caaf), new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.C27949xad84f366());
                        f62361x4bd5d73e = null;
                    }
                } else {
                    long j17 = 3000;
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703 abstractC27954x5371a703 = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703(j17, j17) { // from class: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.2
                        @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703
                        /* renamed from: onFinish */
                        public void mo121072x42fe6352() {
                            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onFinish] ");
                            if (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62361x4bd5d73e != null) {
                                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62361x4bd5d73e.mo120862xe05b4124(new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.YTLiveStyleReq(-2.0f, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62364xbdc8caaf), new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.C27949xad84f366());
                                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult unused = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62361x4bd5d73e = null;
                            }
                        }

                        @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703
                        /* renamed from: onTick */
                        public void mo121073xc39fcc1c(long j18) {
                            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onTick] onTick");
                        }
                    };
                    f62369xc27984dd = abstractC27954x5371a703;
                    abstractC27954x5371a703.m121207x68ac462();
                }
                i17 = 0;
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] --- finish. ret: " + i17);
        return i17;
    }

    /* renamed from: getRawYuvDatas */
    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3232x677d413e.C27934xe970fa7c[] m121055xbb1af461() {
        return com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121102xf58c744d();
    }

    /* renamed from: getReflectListener */
    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener m121056x578c45b() {
        return f62373xf0c52264;
    }

    /* renamed from: initModel */
    public static synchronized int m121057xefa44ff9(java.lang.String str, java.lang.String str2) {
        int i17;
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.class) {
            try {
                try {
                    f62362xffc965b.lock();
                    if (f62370x6a5b9a0c > 0) {
                        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "initModel repeated calls.");
                    } else {
                        f62364xbdc8caaf = str;
                        if (str == null) {
                            f62364xbdc8caaf = "";
                        }
                    }
                    f62370x6a5b9a0c++;
                    i17 = 0;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "initModel failed. message: " + e17.getMessage());
                    f62362xffc965b.unlock();
                    i17 = -1;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121080xb625734(str2);
            } finally {
                f62362xffc965b.unlock();
            }
        }
        return i17;
    }

    /* renamed from: onCameraChanged */
    public static void m121058x12733830(int i17) {
        try {
            android.hardware.Camera.Parameters parameters = f62365xfde5e9f2.getParameters();
            parameters.setExposureCompensation(i17);
            f62365xfde5e9f2.setParameters(parameters);
        } catch (java.lang.Exception e17) {
            e17.getLocalizedMessage();
        }
    }

    /* renamed from: onFetchCameraInfo */
    public static int[] m121059x1dad13ee() {
        int i17;
        int i18;
        android.hardware.Camera.Parameters parameters;
        int i19 = 0;
        try {
            parameters = f62365xfde5e9f2.getParameters();
            i17 = parameters.getExposureCompensation();
        } catch (java.lang.Exception e17) {
            e = e17;
            i17 = 0;
            i18 = 0;
        }
        try {
            try {
                i17 = java.lang.Integer.parseInt(parameters.get("iso"));
            } catch (java.lang.Exception e18) {
                e18.getLocalizedMessage();
            }
            i18 = parameters.getMinExposureCompensation();
        } catch (java.lang.Exception e19) {
            e = e19;
            i18 = 0;
            e.getLocalizedMessage();
            return new int[]{i17, i18, i19};
        }
        try {
            i19 = parameters.getMaxExposureCompensation();
        } catch (java.lang.Exception e27) {
            e = e27;
            e.getLocalizedMessage();
            return new int[]{i17, i18, i19};
        }
        return new int[]{i17, i18, i19};
    }

    /* renamed from: onFinish */
    public static void m121060x42fe6352() {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "on finished");
        int m121093x37acd5c7 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121093x37acd5c7(false, f62366xfcaef403);
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "on finished " + m121093x37acd5c7);
        if (m121093x37acd5c7 == 0) {
            f62367xd555c498.mo120897xe05b4124(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121094x2f8be9b5());
            return;
        }
        f62367xd555c498.mo120896x428b6afc(-1, "JNI return failed.[" + m121093x37acd5c7 + "]", "Please make sure you have called the YTAGReflectLiveCheckInterface.onPreviewFrame during the hole reflecting process. Check log for more information. code: " + m121093x37acd5c7);
    }

    /* renamed from: onScreenChanged */
    public static void m121061xb1740d09(int i17, int i18, int i19, int i27, float f17) {
        android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = new android.graphics.ColorMatrixColorFilter(f62372xa6f5c7fb != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, i18, 0.0f, 0.0f, 0.0f, 0.0f, i19, 0.0f, 0.0f, 0.0f, 0.0f, i27, 0.0f, 0.0f, 0.0f, i17, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, i18, 0.0f, 0.0f, 0.0f, 0.0f, i19, 0.0f, 0.0f, 0.0f, 0.0f, i27, 0.0f, 0.0f, 0.0f, 0.0f, i17});
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener iYTReflectListener = f62373xf0c52264;
        if (iYTReflectListener == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "On reflection screen change failed:mReflectListener is null");
        } else {
            iYTReflectListener.mo120901xbd8fe55c(colorMatrixColorFilter, f17);
        }
    }

    /* renamed from: onStateChanged */
    public static void m121062xaba1ac62(int i17) {
        f62375xbec81024 = i17;
        try {
            if (i17 == 0) {
                android.hardware.Camera.Parameters parameters = f62365xfde5e9f2.getParameters();
                parameters.setAutoWhiteBalanceLock(true);
                f62365xfde5e9f2.setParameters(parameters);
                return;
            }
            if (i17 == 1) {
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3234xc20796d8.InterfaceC27947x5a0ae09a interfaceC27947x5a0ae09a = f62374x2b6ba088;
                if (interfaceC27947x5a0ae09a != null) {
                    interfaceC27947x5a0ae09a.mo120899xe22c6b59();
                    return;
                }
                return;
            }
            if (i17 == 2) {
                try {
                    try {
                        android.hardware.Camera.Parameters parameters2 = f62365xfde5e9f2.getParameters();
                        parameters2.setAutoWhiteBalanceLock(false);
                        f62365xfde5e9f2.setParameters(parameters2);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "on finish get param failed:" + e17.getLocalizedMessage());
                    }
                } finally {
                    m121060x42fe6352();
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "on state changed failed:" + e18.getLocalizedMessage());
        }
    }

    /* renamed from: pushImageData */
    public static void m121063x4128b5ab(byte[] bArr, int i17, int i18, long j17, int i19, float[] fArr, float f17, float f18, float f19) {
        int i27 = f62375xbec81024;
        if (i27 != 0) {
            if (i27 == 1) {
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[ReflectController.onPreviewFrameReceived] record ios");
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121109xe411f396(bArr, i17, i18);
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121108xe162a914(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27926xa6b2ec2c.m121074xef7ca0fe(j17));
                return;
            }
            return;
        }
        int m121096x13b3853d = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121096x13b3853d() - 2;
        int m121097x1e2aa6f = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121097x1e2aa6f() + 4;
        int m121103xebb1475b = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121103xebb1475b();
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "onPreviewFrameReceived. beginFrame: " + m121096x13b3853d + " endFrame: " + m121097x1e2aa6f + " currentFrame: " + m121103xebb1475b);
        if (m121103xebb1475b <= m121096x13b3853d || m121103xebb1475b >= m121097x1e2aa6f) {
            return;
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "onPreviewFrameReceived. insertYuv and time");
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121110x26f570f4(bArr, i17, i18, j17, i19, fArr);
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121107x50415d4d(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27926xa6b2ec2c.m121074xef7ca0fe(j17));
    }

    /* renamed from: releaseModel */
    public static synchronized void m121064x89dacf62() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.class) {
            try {
                f62362xffc965b.lock();
                int i17 = f62370x6a5b9a0c - 1;
                f62370x6a5b9a0c = i17;
                if (i17 <= 0) {
                    f62370x6a5b9a0c = 0;
                    f62374x2b6ba088 = null;
                    f62373xf0c52264 = null;
                    com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.AbstractC27954x5371a703 abstractC27954x5371a703 = f62369xc27984dd;
                    if (abstractC27954x5371a703 != null) {
                        abstractC27954x5371a703.m121206xae7a2e7a();
                        f62369xc27984dd = null;
                    }
                    f62361x4bd5d73e = null;
                    f62365xfde5e9f2 = null;
                }
                f62362xffc965b.unlock();
                com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121081xf5161202();
            } catch (java.lang.Throwable th6) {
                f62362xffc965b.unlock();
                throw th6;
            }
        }
    }

    /* renamed from: setAGSettings */
    public static void m121065x2490cc4b(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27923xf59fb73f c27923xf59fb73f) {
        f62363xe45dbe96 = c27923xf59fb73f;
    }

    /* renamed from: setReflectListener */
    public static void m121066x3c4f5dcf(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener iYTReflectListener) {
        f62373xf0c52264 = iYTReflectListener;
    }

    /* renamed from: setReflectNotice */
    public static void m121067x2093bab3(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3234xc20796d8.InterfaceC27947x5a0ae09a interfaceC27947x5a0ae09a) {
        f62374x2b6ba088 = interfaceC27947x5a0ae09a;
    }

    /* renamed from: setSafetyLevel */
    public static void m121068xbd12ba10(int i17) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.setSafetyLevel] --- level: " + i17);
        f62363xe45dbe96.f62394x4e99eff2 = i17;
    }

    /* renamed from: setupConfig */
    public static void m121069x8a00181f(java.lang.String str, java.lang.String str2) {
        if (str == "overlay_alpha") {
            try {
                f62372xa6f5c7fb = java.lang.Integer.parseInt(str2);
            } catch (java.lang.NumberFormatException unused) {
                f62372xa6f5c7fb = 0;
            }
        }
    }

    /* renamed from: start */
    public static void m121070x68ac462(android.content.Context context, android.hardware.Camera camera, int i17, java.lang.String str, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.LightLiveCheckResult lightLiveCheckResult, int i18) {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "[YTAGReflectLiveCheckInterface.start] ---");
        if (lightLiveCheckResult == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "On reflection start failed:checkResult is null");
            return;
        }
        f62367xd555c498 = lightLiveCheckResult;
        if (f62370x6a5b9a0c <= 0) {
            lightLiveCheckResult.mo120896x428b6afc(2, "Not init model.", "Call YTAGReflectLiveCheckInterface.initModel() before.");
            return;
        }
        f62366xfcaef403 = i17;
        f62368xff825d89 = str;
        f62365xfde5e9f2 = camera;
        long[] jArr = new long[2];
        if (f62373xf0c52264 == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "On reflection start failed:mReflectListener is null");
        }
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener iYTReflectListener = f62373xf0c52264;
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121086x9cf0d20b().m121104x7c199bfc(false, str, f62363xe45dbe96.f62394x4e99eff2, jArr, iYTReflectListener != null ? iYTReflectListener.mo120900xee427d9b() : -1.0f, i18);
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.C27927x5486a314.m121089xc3e74fad(TAG, "output duration ms" + jArr[0] + " " + jArr[1]);
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.IYTReflectListener iYTReflectListener2 = f62373xf0c52264;
        if (iYTReflectListener2 != null) {
            iYTReflectListener2.mo120902xbe543724(jArr[0]);
        }
    }
}
