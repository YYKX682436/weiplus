package com.p314xaae8f345.p457x3304c6;

/* renamed from: com.tencent.maas.MJMaasCore */
/* loaded from: classes5.dex */
public class C3962x4bd0d642 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129275a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener f129276b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f129277c = new android.util.ArrayMap();

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15752x39e86013;

    /* renamed from: com.tencent.maas.MJMaasCore$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129278a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f129279b;

        static {
            int[] iArr = new int[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.m32356xcee59d22().length];
            f129279b = iArr;
            try {
                iArr[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.ISSUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f129279b[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.FATAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f129279b[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f129279b[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f129279b[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.INFO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f129279b[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.DEBUG.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParams.LoginType.m32369xcee59d22().length];
            f129278a = iArr2;
            try {
                iArr2[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParams.LoginType.ThirdApp.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f129278a[com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParams.LoginType.Visitor.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$AnalyticsListener */
    /* loaded from: classes5.dex */
    public interface AnalyticsListener {
        /* renamed from: onEvent */
        void mo9327xaf8c47fb(com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3968xe11269b1 c3968xe11269b1);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$EnvironmentParams */
    /* loaded from: classes5.dex */
    public static class EnvironmentParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f129280a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f129281b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f129282c;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f129283d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f129284e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f129285f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f129286g;

        public EnvironmentParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
            this(str, str2, str3, str4, "", z17, str5);
        }

        /* renamed from: getCachesDirectory */
        public java.lang.String m32330x4f669606() {
            return this.f129281b;
        }

        /* renamed from: getClipbundleDirectory */
        public java.lang.String m32331x21b0af85() {
            return this.f129284e;
        }

        /* renamed from: getLocaleID */
        public java.lang.String m32332xed26266b() {
            return this.f129286g;
        }

        /* renamed from: getPersistentDirectory */
        public java.lang.String m32333x78280660() {
            return this.f129280a;
        }

        /* renamed from: getResourcesDirectory */
        public java.lang.String m32334xddb4fbbe() {
            return this.f129283d;
        }

        /* renamed from: getTemporaryDirectory */
        public java.lang.String m32335x6608ad12() {
            return this.f129282c;
        }

        /* renamed from: isCreateDirectoryIfNotExist */
        public boolean m32336x16ddf9c8() {
            return this.f129285f;
        }

        public EnvironmentParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, java.lang.String str6) {
            this.f129280a = str;
            this.f129281b = str2;
            this.f129282c = str3;
            this.f129283d = str4;
            this.f129284e = str5;
            this.f129285f = z17;
            this.f129286g = str6;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$ILinkContextParamsSelfManaged */
    /* loaded from: classes5.dex */
    public static class ILinkContextParamsSelfManaged {

        /* renamed from: a, reason: collision with root package name */
        public final int f129294a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f129295b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f129296c;

        public ILinkContextParamsSelfManaged(int i17, boolean z17, java.lang.String str) {
            this.f129294a = i17;
            this.f129295b = z17;
            this.f129296c = str;
        }

        /* renamed from: getDebugServerIP */
        public java.lang.String m32344x94582767() {
            return this.f129296c;
        }

        /* renamed from: getSessionModuleType */
        public int m32345xc93fb646() {
            return this.f129294a;
        }

        /* renamed from: isUseDebugServer */
        public boolean m32346x14d8e739() {
            return this.f129295b;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$LogLevel */
    /* loaded from: classes5.dex */
    public enum LogLevel {
        ISSUE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG;

        /* renamed from: fromInt */
        public static com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel m32354xdc92efe5(int i17) {
            return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? DEBUG : INFO : WARN : ERROR : FATAL : ISSUE;
        }

        /* renamed from: getValue */
        public int m32357x754a37bb() {
            int i17 = com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnonymousClass1.f129279b[ordinal()];
            if (i17 == 1) {
                return 0;
            }
            if (i17 == 2) {
                return 1;
            }
            if (i17 == 3) {
                return 2;
            }
            if (i17 != 4) {
                return i17 != 5 ? 5 : 4;
            }
            return 3;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$LoggingListener */
    /* loaded from: classes5.dex */
    public interface LoggingListener {
        /* renamed from: onLog */
        void m32358x64f5ce5(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel logLevel, java.lang.String str, java.lang.String str2);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$LoginParams */
    /* loaded from: classes5.dex */
    public static class LoginParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f129309a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f129310b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParams.LoginType f129311c;

        /* renamed from: com.tencent.maas.MJMaasCore$LoginParams$LoginType */
        /* loaded from: classes5.dex */
        public enum LoginType {
            ThirdApp,
            Visitor
        }

        public LoginParams(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParams.LoginType loginType) {
            this.f129309a = str;
            this.f129310b = str2;
            this.f129311c = loginType;
        }

        /* renamed from: getAuthCode */
        public java.lang.String m32364xd131292b() {
            return this.f129309a;
        }

        /* renamed from: getClientInfo */
        public java.lang.String m32365x2ff1a70f() {
            return this.f129310b;
        }

        /* renamed from: getLoginType */
        public int m32366x98f3878d() {
            return com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnonymousClass1.f129278a[this.f129311c.ordinal()] != 2 ? 0 : 1;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$LoginParamsCallback */
    /* loaded from: classes5.dex */
    public interface LoginParamsCallback {
        /* renamed from: onGetLoginParams */
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParams mo9337x50d8d0d8();
    }

    /* renamed from: com.tencent.maas.MJMaasCore$OnBoolComplete */
    /* loaded from: classes5.dex */
    public interface OnBoolComplete {
        /* renamed from: onComplete */
        void mo9333x815f5438(boolean z17);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$OnComplete */
    /* loaded from: classes5.dex */
    public interface OnComplete {
        /* renamed from: onComplete */
        void mo9351x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.maas.MJMaasCore$SettingKey */
    /* loaded from: classes6.dex */
    public @interface SettingKey {
    }

    /* renamed from: com.tencent.maas.MJMaasCore$SettingsListener */
    /* loaded from: classes5.dex */
    public interface SettingsListener {
        /* renamed from: getSettingForKey */
        java.lang.String m32376x4d733390(java.lang.String str);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$TemplateServiceProvider */
    /* loaded from: classes5.dex */
    public interface TemplateServiceProvider {
        /* renamed from: onRequestTemplateMetadata */
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586 mo9344x9a8f6999(java.lang.String str);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$WarmupParams */
    /* loaded from: classes5.dex */
    public static class WarmupParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f129324a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f129325b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f129326c;

        public WarmupParams(java.lang.String str, java.lang.String str2, boolean z17) {
            this.f129324a = str;
            this.f129325b = str2;
            this.f129326c = z17;
        }

        /* renamed from: getCamFunDirectory */
        public java.lang.String m32385x23c8d6e7() {
            return this.f129325b;
        }

        /* renamed from: getInstaMovieDirectory */
        public java.lang.String m32386x3f8c85a2() {
            return this.f129324a;
        }

        /* renamed from: overwriteExisting */
        public boolean m32387xea4de36() {
            return this.f129326c;
        }
    }

    public C3962x4bd0d642(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f129275a = c4099x76754671;
        this.f15752x39e86013 = m32292xfce9a72c(handler, c4099x76754671);
    }

    public static void e(java.lang.String str, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener analyticsListener) {
        if (analyticsListener != null) {
            com.p314xaae8f345.p457x3304c6.d dVar = com.p314xaae8f345.p457x3304c6.d.f129535b;
            synchronized (dVar) {
                if (dVar.f129536a == null) {
                    dVar.f129536a = analyticsListener;
                }
            }
        }
        m32302xcada6c92(str, analyticsListener);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32292xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeCleanupAssetCachesExcludAssetInfos */
    private native void m32293x68c65654(java.util.Set<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> set, int i17);

    /* renamed from: nativeCleanupREResourceCaches */
    private native void m32294x9be99c7f(int i17);

    /* renamed from: nativeCleanupResourceCaches */
    private native void m32295x3648a6cc(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ResourceCacheCleanupOptions resourceCacheCleanupOptions, int i17);

    /* renamed from: nativeCleanupSDFCaches */
    private native void m32296x9393b1b9(int i17);

    /* renamed from: nativeDestroyResourcePreloader */
    private native void m32297xe418da65();

    /* renamed from: nativeDisableLogging */
    private static native void m32298x403b534e();

    /* renamed from: nativeEnableLogging */
    private static native void m32299xfaac9185(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingParams loggingParams);

    /* renamed from: nativeGetMaasService */
    private native java.lang.Object m32300x4e8f7dd0(java.lang.String str);

    /* renamed from: nativeGetSDKSharableEGL14EGLContext */
    private native android.opengl.EGLContext m32301xbedbdf97();

    /* renamed from: nativeInitMetricsReporting */
    private static native void m32302xcada6c92(java.lang.String str, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener analyticsListener);

    /* renamed from: nativeNewCamResourceManager */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d m32303xd9d699d9(android.os.Handler handler);

    /* renamed from: nativeNewCamSession */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 m32304x90cdfeb0(android.os.Handler handler, java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list);

    /* renamed from: nativeNewCamSessionWithInitParam */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 m32305x8deeea67(android.os.Handler handler, java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4009xba3b408b c4009xba3b408b);

    /* renamed from: nativeNewCamoSession */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 m32306x1583322d(android.os.Handler handler, java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list);

    /* renamed from: nativeNewCamoSessionWithInitParam */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 m32307x8fd00a0a(android.os.Handler handler, java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4009xba3b408b c4009xba3b408b);

    /* renamed from: nativeNewImageSession */
    private native com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 m32308x2bf62964(android.os.Handler handler);

    /* renamed from: nativeNewMJServiceManager */
    private native com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 m32309x4b4f3e3e(android.os.Handler handler);

    /* renamed from: nativeNewMaterialManager */
    private native com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 m32310xce45e73d(android.os.Handler handler);

    /* renamed from: nativeNewMovieExporter */
    private native com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4044x4821e414 m32311x75072728(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4042xaee26a28 c4042xaee26a28);

    /* renamed from: nativeNewMoviePlayer */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 m32312x9d870468(android.os.Handler handler);

    /* renamed from: nativeNewMovieSession */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 m32313xa71549ef(android.os.Handler handler, java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list, java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: nativeNewProjectManager */
    private native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4156x26db2a74 m32314x68eabcbd(android.os.Handler handler);

    /* renamed from: nativeNewPublisherSessionMetrics */
    private static native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c m32315x3648ee20(android.os.Handler handler, java.lang.String str, int i17, int i18, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2);

    /* renamed from: nativeNewResourcePreloader */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4086x69972beb m32316x4d3cc4ff(android.os.Handler handler);

    /* renamed from: nativeNewSpeechManager */
    private native com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce m32317x6e5aece2(android.os.Handler handler);

    /* renamed from: nativeQueryCamFunTemplateResourcesStatus */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32318x945f97dc(java.lang.String str, long j17, int i17);

    /* renamed from: nativeQueryInstaMovieTemplateResourcesStatus */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32319xc1d8b8d7(java.lang.String str, long j17, int i17);

    /* renamed from: nativeRegisterAIModelInfos */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32320xb8558efe(java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list);

    /* renamed from: nativeRegisterTextureProvider */
    private native void m32321xba1860f2(com.p314xaae8f345.p457x3304c6.p465xd2ae381c.C4048xaea72cd8 c4048xaea72cd8);

    /* renamed from: nativeSetAnalyticsListener */
    private native void m32322x397d04cf(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener analyticsListener);

    /* renamed from: nativeSetLogLevel */
    private static native void m32323xc712448b(int i17);

    /* renamed from: nativeSetSettingForKey */
    private native void m32324xfff3203b(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeSetSettingsListener */
    private native void m32325x6b07c8e2(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.SettingsListener settingsListener);

    /* renamed from: nativeStartup */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32326x55e29266(android.content.Context context, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkParams iLinkParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.EnvironmentParams environmentParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingParams loggingParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.WarmupParams warmupParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceParams templateServiceParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.RenderingParams renderingParams, int i17, int i18);

    /* renamed from: nativeTeardown */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32327xb4cc133b(int i17);

    /* renamed from: nativeUnregisterTextureProvider */
    private native void m32328xf9371ff9();

    public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c o(android.os.Handler handler, java.lang.String str, int i17, int i18, java.util.Map map, java.lang.String str2) {
        return m32315x3648ee20(handler, str, i17, i18, map, str2);
    }

    public void a(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ResourceCacheCleanupOptions resourceCacheCleanupOptions, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete onComplete) {
        int i17;
        if (onComplete != null) {
            i17 = this.f129275a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.CompleteCallback(this, onComplete));
        } else {
            i17 = -1;
        }
        m32295x3648a6cc(resourceCacheCleanupOptions, i17);
    }

    public void b() {
        m32297xe418da65();
    }

    public java.lang.Object c(java.lang.String str) {
        synchronized (this.f129277c) {
            java.lang.Object obj = ((android.util.ArrayMap) this.f129277c).get(str);
            if (obj != null) {
                return obj;
            }
            java.lang.Object m32300x4e8f7dd0 = m32300x4e8f7dd0(str);
            if (m32300x4e8f7dd0 == null) {
                return null;
            }
            ((android.util.ArrayMap) this.f129277c).put(str, m32300x4e8f7dd0);
            return m32300x4e8f7dd0;
        }
    }

    public android.opengl.EGLContext d() {
        return m32301xbedbdf97();
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d f(android.os.Handler handler) {
        return m32303xd9d699d9(handler);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 g(android.os.Handler handler, java.util.List list) {
        return m32304x90cdfeb0(handler, list);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 h(android.os.Handler handler, java.util.List list, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4009xba3b408b c4009xba3b408b) {
        return m32305x8deeea67(handler, list, c4009xba3b408b);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 i(android.os.Handler handler, java.util.List list) {
        return m32306x1583322d(handler, list);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 j(android.os.Handler handler, java.util.List list, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4009xba3b408b c4009xba3b408b) {
        return m32307x8fd00a0a(handler, list, c4009xba3b408b);
    }

    public com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 k(android.os.Handler handler) {
        return m32308x2bf62964(handler);
    }

    public com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 l(android.os.Handler handler) {
        return m32310xce45e73d(handler);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 m(android.os.Handler handler) {
        return m32312x9d870468(handler);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 n(android.os.Handler handler, java.util.List list, java.util.Map map) {
        return m32313xa71549ef(handler, list, map);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4086x69972beb p(android.os.Handler handler) {
        return m32316x4d3cc4ff(handler);
    }

    public com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce q(android.os.Handler handler) {
        return m32317x6e5aece2(handler);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b r(java.lang.String str, long j17, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete onBoolComplete) {
        int i17;
        if (onBoolComplete != null) {
            i17 = this.f129275a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BoolCompleteCallback(this, onBoolComplete));
        } else {
            i17 = -1;
        }
        return m32319xc1d8b8d7(str, j17, i17);
    }

    public void s(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener analyticsListener) {
        this.f129276b = analyticsListener;
        m32322x397d04cf(analyticsListener);
    }

    public void t(java.lang.String str, java.lang.String str2) {
        m32324xfff3203b(str, str2);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b u(android.content.Context context, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkParams iLinkParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.EnvironmentParams environmentParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingParams loggingParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.WarmupParams warmupParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceParams templateServiceParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.RenderingParams renderingParams, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete onComplete) {
        io.p3277xa1c40a32.p3282x38e8d6d7.C28523x6550670b.m136897x316510();
        int m33785x764a4853 = iLinkParams.m32352x5117847e() != null ? this.f129275a.m33785x764a4853(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.ILinkLoginParamCallback(this, iLinkParams.m32352x5117847e())) : -1;
        int m33784xe7f76008 = onComplete != null ? this.f129275a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.CompleteCallback(this, onComplete)) : -1;
        if (loggingParams.f129307b != null) {
            com.p314xaae8f345.p457x3304c6.a aVar = com.p314xaae8f345.p457x3304c6.a.f129327b;
            com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingListener loggingListener = loggingParams.f129307b;
            synchronized (aVar) {
                aVar.f129328a = loggingListener;
            }
        }
        return m32326x55e29266(context, iLinkParams, environmentParams, loggingParams, warmupParams, templateServiceParams, renderingParams, m33784xe7f76008, m33785x764a4853);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b v(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete onComplete) {
        synchronized (this.f129277c) {
            ((android.util.ArrayMap) this.f129277c).clear();
        }
        return m32327xb4cc133b(onComplete != null ? this.f129275a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$ILinkContextParams */
    /* loaded from: classes5.dex */
    public static class ILinkContextParams {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsSelfManaged f129291a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsExternalManaged f129292b;

        public ILinkContextParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsSelfManaged iLinkContextParamsSelfManaged) {
            this.f129291a = iLinkContextParamsSelfManaged;
        }

        /* renamed from: getParamsExternalManaged */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsExternalManaged m32341x20ce0d38() {
            return this.f129292b;
        }

        /* renamed from: getParamsSelfManaged */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsSelfManaged m32342xddd87097() {
            return this.f129291a;
        }

        public ILinkContextParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsExternalManaged iLinkContextParamsExternalManaged) {
            this.f129292b = iLinkContextParamsExternalManaged;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$ILinkContextParamsExternalManaged */
    /* loaded from: classes5.dex */
    public static class ILinkContextParamsExternalManaged {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f129293a;

        public ILinkContextParamsExternalManaged(boolean z17) {
            this.f129293a = z17;
        }

        /* renamed from: isUseCloudClient */
        public boolean m32343xfbce0223() {
            return this.f129293a;
        }

        public ILinkContextParamsExternalManaged() {
            this(true);
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$ResourceCacheCleanupOptions */
    /* loaded from: classes5.dex */
    public static class ResourceCacheCleanupOptions {

        /* renamed from: a, reason: collision with root package name */
        public final int f129319a;

        /* renamed from: b, reason: collision with root package name */
        public final int f129320b;

        public ResourceCacheCleanupOptions(int i17) {
            this.f129319a = i17;
            this.f129320b = 102400;
        }

        /* renamed from: getCacheSizeLimit */
        public int m32374x1294e3ce() {
            return this.f129319a;
        }

        /* renamed from: getCleanupThreshold */
        public int m32375x9e484d9d() {
            return this.f129320b;
        }

        public ResourceCacheCleanupOptions(int i17, int i18) {
            this.f129319a = i17;
            this.f129320b = i18;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$TemplateServiceParams */
    /* loaded from: classes5.dex */
    public static class TemplateServiceParams {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider f129321a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider f129322b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c f129323c;

        public TemplateServiceParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider2) {
            this.f129321a = templateServiceProvider;
            this.f129322b = templateServiceProvider2;
        }

        /* renamed from: getCamFunServiceProvider */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider m32377x9df5a0c0() {
            return this.f129322b;
        }

        /* renamed from: getInstaMovieServiceProvider */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider m32378xbbec173b() {
            return this.f129321a;
        }

        /* renamed from: getMJCDNBridgeService */
        public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c m32379xb5d91d52() {
            return this.f129323c;
        }

        /* renamed from: hasCamFunServiceProvider */
        public boolean m32380xeaab0ffc() {
            return this.f129322b != null;
        }

        /* renamed from: hasCdnBridgeService */
        public boolean m32381x5b38e279() {
            return this.f129323c != null;
        }

        /* renamed from: hasInstaMovieServiceProvider */
        public boolean m32382xc59f8877() {
            return this.f129321a != null;
        }

        /* renamed from: requestCamFunTemplateMetadata */
        public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586 m32383x9d977e88(java.lang.String str) {
            com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider = this.f129322b;
            if (templateServiceProvider == null) {
                return null;
            }
            return templateServiceProvider.mo9344x9a8f6999(str);
        }

        /* renamed from: requestInstaMovieTemplateMetadata */
        public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586 m32384x1927f2ed(java.lang.String str) {
            com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider = this.f129321a;
            if (templateServiceProvider == null) {
                return null;
            }
            return templateServiceProvider.mo9344x9a8f6999(str);
        }

        public TemplateServiceParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.TemplateServiceProvider templateServiceProvider2, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c) {
            this.f129321a = templateServiceProvider;
            this.f129322b = templateServiceProvider2;
            this.f129323c = c4001x1040777c;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$ILinkParams */
    /* loaded from: classes5.dex */
    public static class ILinkParams {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams f129297a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkAppClientParams f129298b;

        public ILinkParams(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            this.f129297a = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams(new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsExternalManaged());
            this.f129298b = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        /* renamed from: getAppClientParams */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkAppClientParams m32347xc91d0bbc() {
            return this.f129298b;
        }

        /* renamed from: getAppID */
        public java.lang.String m32348x74292546() {
            return null;
        }

        /* renamed from: getAuthCode */
        public java.lang.String m32349xd131292b() {
            return null;
        }

        /* renamed from: getClientInfo */
        public java.lang.String m32350x2ff1a70f() {
            return null;
        }

        /* renamed from: getContextParams */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams m32351xb28d985f() {
            return this.f129297a;
        }

        /* renamed from: getLoginParamsCallback */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback m32352x5117847e() {
            return this.f129298b.m32340x5117847e();
        }

        public ILinkParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams iLinkContextParams, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            this.f129297a = iLinkContextParams;
            this.f129298b = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsSelfManaged iLinkContextParamsSelfManaged, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            this.f129297a = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams(iLinkContextParamsSelfManaged);
            this.f129298b = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParamsExternalManaged iLinkContextParamsExternalManaged, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            this.f129297a = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkContextParams(iLinkContextParamsExternalManaged);
            this.f129298b = new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$ILinkAppClientParams */
    /* loaded from: classes5.dex */
    public static class ILinkAppClientParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f129287a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f129288b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f129289c;

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback f129290d;

        public ILinkAppClientParams(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            this.f129287a = str;
            this.f129288b = str2;
            this.f129289c = str3;
            this.f129290d = loginParamsCallback;
        }

        /* renamed from: getAppID */
        public java.lang.String m32337x74292546() {
            return this.f129287a;
        }

        /* renamed from: getAuthCode */
        public java.lang.String m32338xd131292b() {
            return this.f129288b;
        }

        /* renamed from: getClientInfo */
        public java.lang.String m32339x2ff1a70f() {
            return this.f129289c;
        }

        /* renamed from: getLoginParamsCallback */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback m32340x5117847e() {
            return this.f129290d;
        }

        public ILinkAppClientParams(java.lang.String str, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            this.f129287a = str;
            this.f129290d = loginParamsCallback;
        }

        public ILinkAppClientParams(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f129287a = str;
            this.f129288b = str2;
            this.f129289c = str3;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$LoggingParams */
    /* loaded from: classes5.dex */
    public static class LoggingParams {

        /* renamed from: a, reason: collision with root package name */
        public volatile long f129306a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingListener f129307b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel f129308c;

        public LoggingParams(long j17, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel logLevel) {
            this.f129306a = 0L;
            this.f129307b = null;
            this.f129308c = com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.INFO;
            this.f129306a = j17;
            this.f129308c = logLevel;
        }

        /* renamed from: getLogFuncPointer */
        public long m32360x445fadeb() {
            return this.f129306a;
        }

        /* renamed from: getLoggingListener */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingListener m32361xd049f6fd() {
            return this.f129307b;
        }

        /* renamed from: getMaxLogLevel */
        public com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel m32362xc9ed1eee() {
            return this.f129308c;
        }

        /* renamed from: getMaxLogLevelValue */
        public int m32363x2ea0a723() {
            return this.f129308c.m32357x754a37bb();
        }

        public LoggingParams(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoggingListener loggingListener, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel logLevel) {
            this.f129306a = 0L;
            this.f129307b = null;
            this.f129308c = com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LogLevel.INFO;
            this.f129307b = loggingListener;
            this.f129308c = logLevel;
        }
    }

    /* renamed from: com.tencent.maas.MJMaasCore$RenderingParams */
    /* loaded from: classes5.dex */
    public static class RenderingParams {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f129315a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f129316b;

        /* renamed from: c, reason: collision with root package name */
        public final android.opengl.EGLContext f129317c;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f129318d;

        public RenderingParams(boolean z17, boolean z18, java.lang.String str, android.opengl.EGLContext eGLContext) {
            this.f129317c = null;
            this.f129315a = z17;
            this.f129316b = z18;
            this.f129317c = eGLContext;
            this.f129318d = str;
        }

        /* renamed from: GetP3To709LUTFilePath */
        public java.lang.String m32370x506a3540() {
            return this.f129318d;
        }

        /* renamed from: getExternalContext */
        public android.opengl.EGLContext m32371x36a1712e() {
            return this.f129317c;
        }

        /* renamed from: isEnableHDR */
        public boolean m32372x2096a069() {
            return this.f129315a;
        }

        /* renamed from: isEnablePrefetchSeqGen */
        public boolean m32373x91a87bf5() {
            return this.f129316b;
        }

        public RenderingParams(boolean z17, boolean z18, java.lang.String str) {
            this.f129317c = null;
            this.f129315a = z17;
            this.f129316b = z18;
            this.f129318d = str;
        }

        public RenderingParams(boolean z17, boolean z18) {
            this.f129317c = null;
            this.f129315a = z17;
            this.f129316b = z18;
            this.f129318d = "";
        }

        public RenderingParams(boolean z17) {
            this.f129317c = null;
            this.f129315a = false;
            this.f129316b = z17;
            this.f129318d = "";
        }
    }
}
