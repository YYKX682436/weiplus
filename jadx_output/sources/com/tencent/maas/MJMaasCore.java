package com.tencent.maas;

/* loaded from: classes5.dex */
public class MJMaasCore {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f47742a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.MJMaasCore.AnalyticsListener f47743b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f47744c = new android.util.ArrayMap();
    private final com.facebook.jni.HybridData mHybridData;

    /* renamed from: com.tencent.maas.MJMaasCore$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47745a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47746b;

        static {
            int[] iArr = new int[com.tencent.maas.MJMaasCore.LogLevel.values().length];
            f47746b = iArr;
            try {
                iArr[com.tencent.maas.MJMaasCore.LogLevel.ISSUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f47746b[com.tencent.maas.MJMaasCore.LogLevel.FATAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f47746b[com.tencent.maas.MJMaasCore.LogLevel.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f47746b[com.tencent.maas.MJMaasCore.LogLevel.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f47746b[com.tencent.maas.MJMaasCore.LogLevel.INFO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f47746b[com.tencent.maas.MJMaasCore.LogLevel.DEBUG.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.tencent.maas.MJMaasCore.LoginParams.LoginType.values().length];
            f47745a = iArr2;
            try {
                iArr2[com.tencent.maas.MJMaasCore.LoginParams.LoginType.ThirdApp.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f47745a[com.tencent.maas.MJMaasCore.LoginParams.LoginType.Visitor.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface AnalyticsListener {
        void onEvent(com.tencent.maas.analytics.MJAnalyticsEvent mJAnalyticsEvent);
    }

    /* loaded from: classes5.dex */
    public static class EnvironmentParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f47747a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f47748b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f47749c;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f47750d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f47751e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f47752f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f47753g;

        public EnvironmentParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
            this(str, str2, str3, str4, "", z17, str5);
        }

        public java.lang.String getCachesDirectory() {
            return this.f47748b;
        }

        public java.lang.String getClipbundleDirectory() {
            return this.f47751e;
        }

        public java.lang.String getLocaleID() {
            return this.f47753g;
        }

        public java.lang.String getPersistentDirectory() {
            return this.f47747a;
        }

        public java.lang.String getResourcesDirectory() {
            return this.f47750d;
        }

        public java.lang.String getTemporaryDirectory() {
            return this.f47749c;
        }

        public boolean isCreateDirectoryIfNotExist() {
            return this.f47752f;
        }

        public EnvironmentParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, java.lang.String str6) {
            this.f47747a = str;
            this.f47748b = str2;
            this.f47749c = str3;
            this.f47750d = str4;
            this.f47751e = str5;
            this.f47752f = z17;
            this.f47753g = str6;
        }
    }

    /* loaded from: classes5.dex */
    public static class ILinkContextParamsSelfManaged {

        /* renamed from: a, reason: collision with root package name */
        public final int f47761a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47762b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f47763c;

        public ILinkContextParamsSelfManaged(int i17, boolean z17, java.lang.String str) {
            this.f47761a = i17;
            this.f47762b = z17;
            this.f47763c = str;
        }

        public java.lang.String getDebugServerIP() {
            return this.f47763c;
        }

        public int getSessionModuleType() {
            return this.f47761a;
        }

        public boolean isUseDebugServer() {
            return this.f47762b;
        }
    }

    /* loaded from: classes5.dex */
    public enum LogLevel {
        ISSUE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG;

        public static com.tencent.maas.MJMaasCore.LogLevel fromInt(int i17) {
            return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? DEBUG : INFO : WARN : ERROR : FATAL : ISSUE;
        }

        public int getValue() {
            int i17 = com.tencent.maas.MJMaasCore.AnonymousClass1.f47746b[ordinal()];
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

    /* loaded from: classes5.dex */
    public interface LoggingListener {
        void onLog(com.tencent.maas.MJMaasCore.LogLevel logLevel, java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes5.dex */
    public static class LoginParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f47776a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f47777b;

        /* renamed from: c, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.LoginParams.LoginType f47778c;

        /* loaded from: classes5.dex */
        public enum LoginType {
            ThirdApp,
            Visitor
        }

        public LoginParams(java.lang.String str, java.lang.String str2, com.tencent.maas.MJMaasCore.LoginParams.LoginType loginType) {
            this.f47776a = str;
            this.f47777b = str2;
            this.f47778c = loginType;
        }

        public java.lang.String getAuthCode() {
            return this.f47776a;
        }

        public java.lang.String getClientInfo() {
            return this.f47777b;
        }

        public int getLoginType() {
            return com.tencent.maas.MJMaasCore.AnonymousClass1.f47745a[this.f47778c.ordinal()] != 2 ? 0 : 1;
        }
    }

    /* loaded from: classes5.dex */
    public interface LoginParamsCallback {
        com.tencent.maas.MJMaasCore.LoginParams onGetLoginParams();
    }

    /* loaded from: classes5.dex */
    public interface OnBoolComplete {
        void onComplete(boolean z17);
    }

    /* loaded from: classes5.dex */
    public interface OnComplete {
        void onComplete(com.tencent.maas.instamovie.base.MJError mJError);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SettingKey {
    }

    /* loaded from: classes5.dex */
    public interface SettingsListener {
        java.lang.String getSettingForKey(java.lang.String str);
    }

    /* loaded from: classes5.dex */
    public interface TemplateServiceProvider {
        com.tencent.maas.model.MJTemplateMetadata onRequestTemplateMetadata(java.lang.String str);
    }

    /* loaded from: classes5.dex */
    public static class WarmupParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f47791a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f47792b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f47793c;

        public WarmupParams(java.lang.String str, java.lang.String str2, boolean z17) {
            this.f47791a = str;
            this.f47792b = str2;
            this.f47793c = z17;
        }

        public java.lang.String getCamFunDirectory() {
            return this.f47792b;
        }

        public java.lang.String getInstaMovieDirectory() {
            return this.f47791a;
        }

        public boolean overwriteExisting() {
            return this.f47793c;
        }
    }

    public MJMaasCore(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f47742a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    public static void e(java.lang.String str, com.tencent.maas.MJMaasCore.AnalyticsListener analyticsListener) {
        if (analyticsListener != null) {
            com.tencent.maas.d dVar = com.tencent.maas.d.f48002b;
            synchronized (dVar) {
                if (dVar.f48003a == null) {
                    dVar.f48003a = analyticsListener;
                }
            }
        }
        nativeInitMetricsReporting(str, analyticsListener);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeCleanupAssetCachesExcludAssetInfos(java.util.Set<com.tencent.maas.instamovie.base.asset.MJAssetInfo> set, int i17);

    private native void nativeCleanupREResourceCaches(int i17);

    private native void nativeCleanupResourceCaches(com.tencent.maas.MJMaasCore.ResourceCacheCleanupOptions resourceCacheCleanupOptions, int i17);

    private native void nativeCleanupSDFCaches(int i17);

    private native void nativeDestroyResourcePreloader();

    private static native void nativeDisableLogging();

    private static native void nativeEnableLogging(com.tencent.maas.MJMaasCore.LoggingParams loggingParams);

    private native java.lang.Object nativeGetMaasService(java.lang.String str);

    private native android.opengl.EGLContext nativeGetSDKSharableEGL14EGLContext();

    private static native void nativeInitMetricsReporting(java.lang.String str, com.tencent.maas.MJMaasCore.AnalyticsListener analyticsListener);

    private native com.tencent.maas.camstudio.MJCamResourceManager nativeNewCamResourceManager(android.os.Handler handler);

    private native com.tencent.maas.camstudio.MJCamSession nativeNewCamSession(android.os.Handler handler, java.util.List<com.tencent.maas.model.MJModelInfo> list);

    private native com.tencent.maas.camstudio.MJCamSession nativeNewCamSessionWithInitParam(android.os.Handler handler, java.util.List<com.tencent.maas.model.MJModelInfo> list, com.tencent.maas.camstudio.MJCamInitParam mJCamInitParam);

    private native com.tencent.maas.camstudio.MJCamoSession nativeNewCamoSession(android.os.Handler handler, java.util.List<com.tencent.maas.model.MJModelInfo> list);

    private native com.tencent.maas.camstudio.MJCamoSession nativeNewCamoSessionWithInitParam(android.os.Handler handler, java.util.List<com.tencent.maas.model.MJModelInfo> list, com.tencent.maas.camstudio.MJCamInitParam mJCamInitParam);

    private native com.tencent.maas.imagestudio.MJImageSession nativeNewImageSession(android.os.Handler handler);

    private native com.tencent.maas.MJServiceManager nativeNewMJServiceManager(android.os.Handler handler);

    private native com.tencent.maas.material.MJMaterialManager nativeNewMaterialManager(android.os.Handler handler);

    private native com.tencent.maas.export.MJMovieExporter nativeNewMovieExporter(android.os.Handler handler, com.tencent.maas.export.MJExportProject mJExportProject);

    private native com.tencent.maas.instamovie.MJMoviePlayer nativeNewMoviePlayer(android.os.Handler handler);

    private native com.tencent.maas.instamovie.MJMovieSession nativeNewMovieSession(android.os.Handler handler, java.util.List<com.tencent.maas.model.MJModelInfo> list, java.util.Map<java.lang.String, java.lang.String> map);

    private native com.tencent.maas.moviecomposing.ProjectManager nativeNewProjectManager(android.os.Handler handler);

    private static native com.tencent.maas.instamovie.MJPublisherSessionMetrics nativeNewPublisherSessionMetrics(android.os.Handler handler, java.lang.String str, int i17, int i18, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2);

    private native com.tencent.maas.instamovie.MJResourcePreloader nativeNewResourcePreloader(android.os.Handler handler);

    private native com.tencent.maas.speech.MJSpeechManager nativeNewSpeechManager(android.os.Handler handler);

    private native com.tencent.maas.instamovie.base.MJError nativeQueryCamFunTemplateResourcesStatus(java.lang.String str, long j17, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeQueryInstaMovieTemplateResourcesStatus(java.lang.String str, long j17, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeRegisterAIModelInfos(java.util.List<com.tencent.maas.model.MJModelInfo> list);

    private native void nativeRegisterTextureProvider(com.tencent.maas.flutter.TextureProviderHolder textureProviderHolder);

    private native void nativeSetAnalyticsListener(com.tencent.maas.MJMaasCore.AnalyticsListener analyticsListener);

    private static native void nativeSetLogLevel(int i17);

    private native void nativeSetSettingForKey(java.lang.String str, java.lang.String str2);

    private native void nativeSetSettingsListener(com.tencent.maas.MJMaasCore.SettingsListener settingsListener);

    private native com.tencent.maas.instamovie.base.MJError nativeStartup(android.content.Context context, com.tencent.maas.MJMaasCore.ILinkParams iLinkParams, com.tencent.maas.MJMaasCore.EnvironmentParams environmentParams, com.tencent.maas.MJMaasCore.LoggingParams loggingParams, com.tencent.maas.MJMaasCore.WarmupParams warmupParams, com.tencent.maas.MJMaasCore.TemplateServiceParams templateServiceParams, com.tencent.maas.MJMaasCore.RenderingParams renderingParams, int i17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeTeardown(int i17);

    private native void nativeUnregisterTextureProvider();

    public static com.tencent.maas.instamovie.MJPublisherSessionMetrics o(android.os.Handler handler, java.lang.String str, int i17, int i18, java.util.Map map, java.lang.String str2) {
        return nativeNewPublisherSessionMetrics(handler, str, i17, i18, map, str2);
    }

    public void a(com.tencent.maas.MJMaasCore.ResourceCacheCleanupOptions resourceCacheCleanupOptions, com.tencent.maas.MJMaasCore.OnComplete onComplete) {
        int i17;
        if (onComplete != null) {
            i17 = this.f47742a.registerCallback(new com.tencent.maas.instamovie.MJMaasCoreCallback.CompleteCallback(this, onComplete));
        } else {
            i17 = -1;
        }
        nativeCleanupResourceCaches(resourceCacheCleanupOptions, i17);
    }

    public void b() {
        nativeDestroyResourcePreloader();
    }

    public java.lang.Object c(java.lang.String str) {
        synchronized (this.f47744c) {
            java.lang.Object obj = ((android.util.ArrayMap) this.f47744c).get(str);
            if (obj != null) {
                return obj;
            }
            java.lang.Object nativeGetMaasService = nativeGetMaasService(str);
            if (nativeGetMaasService == null) {
                return null;
            }
            ((android.util.ArrayMap) this.f47744c).put(str, nativeGetMaasService);
            return nativeGetMaasService;
        }
    }

    public android.opengl.EGLContext d() {
        return nativeGetSDKSharableEGL14EGLContext();
    }

    public com.tencent.maas.camstudio.MJCamResourceManager f(android.os.Handler handler) {
        return nativeNewCamResourceManager(handler);
    }

    public com.tencent.maas.camstudio.MJCamSession g(android.os.Handler handler, java.util.List list) {
        return nativeNewCamSession(handler, list);
    }

    public com.tencent.maas.camstudio.MJCamSession h(android.os.Handler handler, java.util.List list, com.tencent.maas.camstudio.MJCamInitParam mJCamInitParam) {
        return nativeNewCamSessionWithInitParam(handler, list, mJCamInitParam);
    }

    public com.tencent.maas.camstudio.MJCamoSession i(android.os.Handler handler, java.util.List list) {
        return nativeNewCamoSession(handler, list);
    }

    public com.tencent.maas.camstudio.MJCamoSession j(android.os.Handler handler, java.util.List list, com.tencent.maas.camstudio.MJCamInitParam mJCamInitParam) {
        return nativeNewCamoSessionWithInitParam(handler, list, mJCamInitParam);
    }

    public com.tencent.maas.imagestudio.MJImageSession k(android.os.Handler handler) {
        return nativeNewImageSession(handler);
    }

    public com.tencent.maas.material.MJMaterialManager l(android.os.Handler handler) {
        return nativeNewMaterialManager(handler);
    }

    public com.tencent.maas.instamovie.MJMoviePlayer m(android.os.Handler handler) {
        return nativeNewMoviePlayer(handler);
    }

    public com.tencent.maas.instamovie.MJMovieSession n(android.os.Handler handler, java.util.List list, java.util.Map map) {
        return nativeNewMovieSession(handler, list, map);
    }

    public com.tencent.maas.instamovie.MJResourcePreloader p(android.os.Handler handler) {
        return nativeNewResourcePreloader(handler);
    }

    public com.tencent.maas.speech.MJSpeechManager q(android.os.Handler handler) {
        return nativeNewSpeechManager(handler);
    }

    public com.tencent.maas.instamovie.base.MJError r(java.lang.String str, long j17, com.tencent.maas.MJMaasCore.OnBoolComplete onBoolComplete) {
        int i17;
        if (onBoolComplete != null) {
            i17 = this.f47742a.registerCallback(new com.tencent.maas.instamovie.MJMaasCoreCallback.BoolCompleteCallback(this, onBoolComplete));
        } else {
            i17 = -1;
        }
        return nativeQueryInstaMovieTemplateResourcesStatus(str, j17, i17);
    }

    public void s(com.tencent.maas.MJMaasCore.AnalyticsListener analyticsListener) {
        this.f47743b = analyticsListener;
        nativeSetAnalyticsListener(analyticsListener);
    }

    public void t(java.lang.String str, java.lang.String str2) {
        nativeSetSettingForKey(str, str2);
    }

    public com.tencent.maas.instamovie.base.MJError u(android.content.Context context, com.tencent.maas.MJMaasCore.ILinkParams iLinkParams, com.tencent.maas.MJMaasCore.EnvironmentParams environmentParams, com.tencent.maas.MJMaasCore.LoggingParams loggingParams, com.tencent.maas.MJMaasCore.WarmupParams warmupParams, com.tencent.maas.MJMaasCore.TemplateServiceParams templateServiceParams, com.tencent.maas.MJMaasCore.RenderingParams renderingParams, com.tencent.maas.MJMaasCore.OnComplete onComplete) {
        io.clipworks.corekit.HarmonyOSChecker.init();
        int registerCallbackWithReturnValue = iLinkParams.getLoginParamsCallback() != null ? this.f47742a.registerCallbackWithReturnValue(new com.tencent.maas.instamovie.MJMaasCoreCallback.ILinkLoginParamCallback(this, iLinkParams.getLoginParamsCallback())) : -1;
        int registerCallback = onComplete != null ? this.f47742a.registerCallback(new com.tencent.maas.instamovie.MJMaasCoreCallback.CompleteCallback(this, onComplete)) : -1;
        if (loggingParams.f47774b != null) {
            com.tencent.maas.a aVar = com.tencent.maas.a.f47794b;
            com.tencent.maas.MJMaasCore.LoggingListener loggingListener = loggingParams.f47774b;
            synchronized (aVar) {
                aVar.f47795a = loggingListener;
            }
        }
        return nativeStartup(context, iLinkParams, environmentParams, loggingParams, warmupParams, templateServiceParams, renderingParams, registerCallback, registerCallbackWithReturnValue);
    }

    public com.tencent.maas.instamovie.base.MJError v(com.tencent.maas.MJMaasCore.OnComplete onComplete) {
        synchronized (this.f47744c) {
            ((android.util.ArrayMap) this.f47744c).clear();
        }
        return nativeTeardown(onComplete != null ? this.f47742a.registerCallback(new com.tencent.maas.instamovie.MJMaasCoreCallback.CompleteCallback(this, onComplete)) : -1);
    }

    /* loaded from: classes5.dex */
    public static class ILinkContextParams {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.ILinkContextParamsSelfManaged f47758a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.ILinkContextParamsExternalManaged f47759b;

        public ILinkContextParams(com.tencent.maas.MJMaasCore.ILinkContextParamsSelfManaged iLinkContextParamsSelfManaged) {
            this.f47758a = iLinkContextParamsSelfManaged;
        }

        public com.tencent.maas.MJMaasCore.ILinkContextParamsExternalManaged getParamsExternalManaged() {
            return this.f47759b;
        }

        public com.tencent.maas.MJMaasCore.ILinkContextParamsSelfManaged getParamsSelfManaged() {
            return this.f47758a;
        }

        public ILinkContextParams(com.tencent.maas.MJMaasCore.ILinkContextParamsExternalManaged iLinkContextParamsExternalManaged) {
            this.f47759b = iLinkContextParamsExternalManaged;
        }
    }

    /* loaded from: classes5.dex */
    public static class ILinkContextParamsExternalManaged {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f47760a;

        public ILinkContextParamsExternalManaged(boolean z17) {
            this.f47760a = z17;
        }

        public boolean isUseCloudClient() {
            return this.f47760a;
        }

        public ILinkContextParamsExternalManaged() {
            this(true);
        }
    }

    /* loaded from: classes5.dex */
    public static class ResourceCacheCleanupOptions {

        /* renamed from: a, reason: collision with root package name */
        public final int f47786a;

        /* renamed from: b, reason: collision with root package name */
        public final int f47787b;

        public ResourceCacheCleanupOptions(int i17) {
            this.f47786a = i17;
            this.f47787b = 102400;
        }

        public int getCacheSizeLimit() {
            return this.f47786a;
        }

        public int getCleanupThreshold() {
            return this.f47787b;
        }

        public ResourceCacheCleanupOptions(int i17, int i18) {
            this.f47786a = i17;
            this.f47787b = i18;
        }
    }

    /* loaded from: classes5.dex */
    public static class TemplateServiceParams {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.TemplateServiceProvider f47788a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.TemplateServiceProvider f47789b;

        /* renamed from: c, reason: collision with root package name */
        public final com.tencent.maas.camstudio.MJCDNBridgeService f47790c;

        public TemplateServiceParams(com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider, com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider2) {
            this.f47788a = templateServiceProvider;
            this.f47789b = templateServiceProvider2;
        }

        public com.tencent.maas.MJMaasCore.TemplateServiceProvider getCamFunServiceProvider() {
            return this.f47789b;
        }

        public com.tencent.maas.MJMaasCore.TemplateServiceProvider getInstaMovieServiceProvider() {
            return this.f47788a;
        }

        public com.tencent.maas.camstudio.MJCDNBridgeService getMJCDNBridgeService() {
            return this.f47790c;
        }

        public boolean hasCamFunServiceProvider() {
            return this.f47789b != null;
        }

        public boolean hasCdnBridgeService() {
            return this.f47790c != null;
        }

        public boolean hasInstaMovieServiceProvider() {
            return this.f47788a != null;
        }

        public com.tencent.maas.model.MJTemplateMetadata requestCamFunTemplateMetadata(java.lang.String str) {
            com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider = this.f47789b;
            if (templateServiceProvider == null) {
                return null;
            }
            return templateServiceProvider.onRequestTemplateMetadata(str);
        }

        public com.tencent.maas.model.MJTemplateMetadata requestInstaMovieTemplateMetadata(java.lang.String str) {
            com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider = this.f47788a;
            if (templateServiceProvider == null) {
                return null;
            }
            return templateServiceProvider.onRequestTemplateMetadata(str);
        }

        public TemplateServiceParams(com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider, com.tencent.maas.MJMaasCore.TemplateServiceProvider templateServiceProvider2, com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService) {
            this.f47788a = templateServiceProvider;
            this.f47789b = templateServiceProvider2;
            this.f47790c = mJCDNBridgeService;
        }
    }

    /* loaded from: classes5.dex */
    public static class ILinkParams {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.ILinkContextParams f47764a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.ILinkAppClientParams f47765b;

        public ILinkParams(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            this.f47764a = new com.tencent.maas.MJMaasCore.ILinkContextParams(new com.tencent.maas.MJMaasCore.ILinkContextParamsExternalManaged());
            this.f47765b = new com.tencent.maas.MJMaasCore.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public com.tencent.maas.MJMaasCore.ILinkAppClientParams getAppClientParams() {
            return this.f47765b;
        }

        public java.lang.String getAppID() {
            return null;
        }

        public java.lang.String getAuthCode() {
            return null;
        }

        public java.lang.String getClientInfo() {
            return null;
        }

        public com.tencent.maas.MJMaasCore.ILinkContextParams getContextParams() {
            return this.f47764a;
        }

        public com.tencent.maas.MJMaasCore.LoginParamsCallback getLoginParamsCallback() {
            return this.f47765b.getLoginParamsCallback();
        }

        public ILinkParams(com.tencent.maas.MJMaasCore.ILinkContextParams iLinkContextParams, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            this.f47764a = iLinkContextParams;
            this.f47765b = new com.tencent.maas.MJMaasCore.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkParams(com.tencent.maas.MJMaasCore.ILinkContextParamsSelfManaged iLinkContextParamsSelfManaged, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            this.f47764a = new com.tencent.maas.MJMaasCore.ILinkContextParams(iLinkContextParamsSelfManaged);
            this.f47765b = new com.tencent.maas.MJMaasCore.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkParams(com.tencent.maas.MJMaasCore.ILinkContextParamsExternalManaged iLinkContextParamsExternalManaged, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            this.f47764a = new com.tencent.maas.MJMaasCore.ILinkContextParams(iLinkContextParamsExternalManaged);
            this.f47765b = new com.tencent.maas.MJMaasCore.ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }
    }

    /* loaded from: classes5.dex */
    public static class ILinkAppClientParams {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f47754a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f47755b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f47756c;

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.LoginParamsCallback f47757d;

        public ILinkAppClientParams(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            this.f47754a = str;
            this.f47755b = str2;
            this.f47756c = str3;
            this.f47757d = loginParamsCallback;
        }

        public java.lang.String getAppID() {
            return this.f47754a;
        }

        public java.lang.String getAuthCode() {
            return this.f47755b;
        }

        public java.lang.String getClientInfo() {
            return this.f47756c;
        }

        public com.tencent.maas.MJMaasCore.LoginParamsCallback getLoginParamsCallback() {
            return this.f47757d;
        }

        public ILinkAppClientParams(java.lang.String str, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            this.f47754a = str;
            this.f47757d = loginParamsCallback;
        }

        public ILinkAppClientParams(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f47754a = str;
            this.f47755b = str2;
            this.f47756c = str3;
        }
    }

    /* loaded from: classes5.dex */
    public static class LoggingParams {

        /* renamed from: a, reason: collision with root package name */
        public volatile long f47773a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.LoggingListener f47774b;

        /* renamed from: c, reason: collision with root package name */
        public final com.tencent.maas.MJMaasCore.LogLevel f47775c;

        public LoggingParams(long j17, com.tencent.maas.MJMaasCore.LogLevel logLevel) {
            this.f47773a = 0L;
            this.f47774b = null;
            this.f47775c = com.tencent.maas.MJMaasCore.LogLevel.INFO;
            this.f47773a = j17;
            this.f47775c = logLevel;
        }

        public long getLogFuncPointer() {
            return this.f47773a;
        }

        public com.tencent.maas.MJMaasCore.LoggingListener getLoggingListener() {
            return this.f47774b;
        }

        public com.tencent.maas.MJMaasCore.LogLevel getMaxLogLevel() {
            return this.f47775c;
        }

        public int getMaxLogLevelValue() {
            return this.f47775c.getValue();
        }

        public LoggingParams(com.tencent.maas.MJMaasCore.LoggingListener loggingListener, com.tencent.maas.MJMaasCore.LogLevel logLevel) {
            this.f47773a = 0L;
            this.f47774b = null;
            this.f47775c = com.tencent.maas.MJMaasCore.LogLevel.INFO;
            this.f47774b = loggingListener;
            this.f47775c = logLevel;
        }
    }

    /* loaded from: classes5.dex */
    public static class RenderingParams {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f47782a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47783b;

        /* renamed from: c, reason: collision with root package name */
        public final android.opengl.EGLContext f47784c;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f47785d;

        public RenderingParams(boolean z17, boolean z18, java.lang.String str, android.opengl.EGLContext eGLContext) {
            this.f47784c = null;
            this.f47782a = z17;
            this.f47783b = z18;
            this.f47784c = eGLContext;
            this.f47785d = str;
        }

        public java.lang.String GetP3To709LUTFilePath() {
            return this.f47785d;
        }

        public android.opengl.EGLContext getExternalContext() {
            return this.f47784c;
        }

        public boolean isEnableHDR() {
            return this.f47782a;
        }

        public boolean isEnablePrefetchSeqGen() {
            return this.f47783b;
        }

        public RenderingParams(boolean z17, boolean z18, java.lang.String str) {
            this.f47784c = null;
            this.f47782a = z17;
            this.f47783b = z18;
            this.f47785d = str;
        }

        public RenderingParams(boolean z17, boolean z18) {
            this.f47784c = null;
            this.f47782a = z17;
            this.f47783b = z18;
            this.f47785d = "";
        }

        public RenderingParams(boolean z17) {
            this.f47784c = null;
            this.f47782a = false;
            this.f47783b = z17;
            this.f47785d = "";
        }
    }
}
