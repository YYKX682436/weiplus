package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter */
/* loaded from: classes15.dex */
public abstract class AbstractC16186x8412d8a8 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f37119x7118e671 = false;

    /* renamed from: DispatchCmdLv2Platform_city */
    private static final int f37120x7fd1850f = 4;

    /* renamed from: DispatchCmdLv2Platform_getScreenCapturedStatus */
    private static final int f37121x2fd4254e = 10;

    /* renamed from: DispatchCmdLv2Platform_internationalCity */
    private static final int f37122x79e4a3f5 = 9;

    /* renamed from: DispatchCmdLv2Platform_internationalCountry */
    private static final int f37123xe06bc8cc = 7;

    /* renamed from: DispatchCmdLv2Platform_internationalProvince */
    private static final int f37124x85de0ba = 8;

    /* renamed from: DispatchCmdLv2Platform_province */
    private static final int f37125x9c60a4d4 = 3;

    /* renamed from: DispatchCmdLv2Platform_region */
    private static final int f37126xeadeb998 = 5;

    /* renamed from: DispatchCmdLv2Platform_setKeepScreenOn */
    private static final int f37127x7eac4d6e = 2;

    /* renamed from: DispatchCmdLv2Platform_setScreenshotEnabled */
    private static final int f37128x458c965d = 12;

    /* renamed from: DispatchCmdLv2Platform_setTitleBackgroundColor */
    private static final int f37129x5e8606bb = 11;

    /* renamed from: DispatchCmdLv2Platform_showRegionPicker */
    private static final int f37130x761045e3 = 13;

    /* renamed from: DispatchCmdLv2Platform_startSpeechRecognition */
    private static final int f37131x952873d7 = 15;

    /* renamed from: DispatchCmdLv2Platform_stopSpeechRecognition */
    private static final int f37132x5cd96a6f = 16;

    /* renamed from: DispatchCmdLv2Platform_subDistrict */
    private static final int f37133xa62289ca = 6;

    /* renamed from: DispatchCmdLv2Platform_vibrateLong */
    private static final int f37134xf573d467 = 0;

    /* renamed from: DispatchCmdLv2Platform_vibrateShort */
    private static final int f37135xb96633f1 = 1;

    /* renamed from: DispatchCmdLv2Platform_whiteScreenWhenClosed */
    private static final int f37136x897699f7 = 14;

    /* renamed from: FRAMEWORK_TYPE_BASE */
    public static final java.lang.String f37137xa0346395 = "base";

    /* renamed from: FRAMEWORK_TYPE_NONE */
    public static final java.lang.String f37138xa03a0bfc = "none";

    /* renamed from: FRAMEWORK_TYPE_VUE */
    public static final java.lang.String f37139x810a4022 = "Vue";

    /* renamed from: FRAMEWORK_TYPE_VUE3 */
    public static final java.lang.String f37140xa03dc451 = "Vue3";

    /* renamed from: LITE_APP_BASE_LIB */
    public static final java.lang.String f37141xc474b466 = "wxalitebaselibrary";
    private static final java.lang.String TAG = "WxaLiteApp.LiteAppCenter";

    /* renamed from: handler */
    private static android.os.Handler f37147x294b574a = null;

    /* renamed from: isInitialized */
    public static boolean f37148xf582434a = false;

    /* renamed from: kJsApiGetNetworkInfo */
    private static final java.lang.String f37150xc1caf2cc = "GetNetworkInfo";

    /* renamed from: kLiteAppKeepAliveGroupFloat */
    public static final int f37151x7c7950bd = 2;

    /* renamed from: kLiteAppKeepAliveGroupGlobal */
    public static final int f37152x1465a162 = 0;

    /* renamed from: kLiteAppKeepAliveGroupStar */
    public static final int f37153x906d07d1 = 1;

    /* renamed from: mCallback */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback f37158x1ab9c7d2;

    /* renamed from: mDisplayMetrics */
    public static android.util.DisplayMetrics f37161xa0784b6e;

    /* renamed from: mVolumeBroadcastReceiver */
    private static android.content.BroadcastReceiver f37167xf303c2a9;

    /* renamed from: _hellAccFlag_ */
    private byte f37176x7f11beae;

    /* renamed from: sInitLib */
    private static final boolean[] f37174x8180ab62 = {false};

    /* renamed from: mAppUuid */
    private static java.util.concurrent.atomic.AtomicLong f37157x6ec69c4f = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: mDataUuid */
    private static java.util.concurrent.atomic.AtomicLong f37159x8fa11a12 = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: pageInfos */
    private static java.util.HashMap<java.lang.Long, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo> f37169x33762036 = new java.util.HashMap<>();

    /* renamed from: pageId */
    private static long f37168xc4a6040a = -1;

    /* renamed from: sCommApi */
    private static java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>> f37171x4605277b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sAppLevelApi */
    private static java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>>> f37170x85bca6c4 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sWxaLiteAppJsApiMap */
    private static java.util.Map<java.lang.String, jd.b> f37175xb2808b51 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sCommClassStoreMap */
    private static java.util.Map<java.lang.String, java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s>> f37172x7debba74 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sCommStoreMap */
    private static java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s> f37173x462003fa = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: mUICallback */
    public static java.util.Map<java.lang.Long, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback> f37166xc2dcd726 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: cachedNavigationBarHeight */
    public static volatile int f37142x6207eae4 = -1;

    /* renamed from: mReporters */
    private static java.util.Map<java.lang.Long, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874> f37165x65a801c5 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: mOpenExtraData */
    protected static java.util.Map<java.lang.Long, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData> f37164x41b0e543 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: mJsApiContext */
    private static java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> f37162xc5c15d6b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: fontScale */
    public static float f37145xa386663b = 1.0f;

    /* renamed from: fontScaleFollowSystem */
    public static boolean f37146x33108b1b = false;

    /* renamed from: mDebugCallback */
    private static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.e f37160xd58f204b = null;

    /* renamed from: keepAliveInfos */
    protected static java.util.Map<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo>> f37154xf01a461d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: mAppRootPath */
    private static java.lang.String f37156xccad56bb = "";

    /* renamed from: mLastVolume */
    private static int f37163x54a5959d = -1;

    /* renamed from: jsapiLocalId */
    private static final java.util.concurrent.atomic.AtomicInteger f37149x92ceec75 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: executingJsapiMap */
    public static final java.util.Map<java.lang.Integer, jd.b> f37144x164d47d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: executingDynamicModuleMap */
    public static final java.util.Map<java.lang.Integer, bd.d> f37143x4c65a0e3 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: lastPath */
    private static java.lang.String f37155xa9012fdb = "";

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$HostInfo */
    /* loaded from: classes15.dex */
    public static class HostInfo {

        /* renamed from: otherExtends */
        public java.util.Map<java.lang.String, java.lang.String> f37205xe2292b69;

        /* renamed from: system */
        public java.lang.String f37206xcb1c722f = "";

        /* renamed from: systemVersion */
        public java.lang.String f37207x8de43fa9 = "";

        /* renamed from: appVersion */
        public java.lang.String f37204x5875c377 = "";

        /* renamed from: appRevision */
        public java.lang.String f37203x1d08e51c = "";

        /* renamed from: appBranch */
        public java.lang.String f37199x3c3faf23 = "";

        /* renamed from: appBuildJob */
        public java.lang.String f37200xd74dcbb0 = "";

        /* renamed from: appBuildTime */
        public java.lang.String f37201x1270213a = "";

        /* renamed from: appFlavor */
        public java.lang.String f37202x42bea41f = "";
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$IFragmentCallback */
    /* loaded from: classes14.dex */
    public interface IFragmentCallback {
        /* renamed from: closeWindow */
        void mo65524x10864c08(android.content.Intent intent);

        /* renamed from: halfScreenScrollToBottom */
        default void mo65525x6851f6d2() {
        }

        /* renamed from: halfScreenScrollToResume */
        default void mo65526x831224d4() {
        }

        /* renamed from: halfScreenScrollToTop */
        default void mo65527xc117fe0e() {
        }

        /* renamed from: hideKeyboard */
        void mo65528x3f895349();

        /* renamed from: setPageOrientation */
        void mo65529xdaac6ff(int i17);
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$ILiteAppUICallback */
    /* loaded from: classes15.dex */
    public interface ILiteAppUICallback {
        /* renamed from: closeWindow */
        void mo28560x10864c08(android.content.Intent intent);

        /* renamed from: enterFullScreen */
        void mo28561x31f09cd3();

        /* renamed from: exitFullScreen */
        void mo28562xd02faf99();

        /* renamed from: getAppUuid */
        long mo28563xe7b2546();

        /* renamed from: getCurrentContext */
        android.content.Context mo28564xc88b72ec();

        /* renamed from: getDataUuid */
        long mo28565xe67daffb();

        /* renamed from: getExtraData */
        android.os.Bundle mo28566xf04ce124();

        /* renamed from: getSystemInfo */
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo28571x148d5373(int i17);

        /* renamed from: getWxaLiteAppActivity */
        android.app.Activity getF127508q();

        /* renamed from: hasCutOut */
        boolean mo28573xd48718e6();

        /* renamed from: hideKeyboard */
        void mo28574x3f895349();

        /* renamed from: isDarkMode */
        boolean mo28575x387a9983();

        /* renamed from: keyboardEnable */
        void mo28576xa5ddbc4a(boolean z17);

        /* renamed from: navigateBack */
        void mo28577xc55eddf8(boolean z17);

        /* renamed from: onBodySizeChange */
        default void mo29025x4e43b612(java.lang.String str, long j17, long j18, float f17, float f18) {
        }

        /* renamed from: onCheckBaseLibSumFail */
        void mo28578x2635de3e(java.lang.String str, java.util.List<java.lang.String> list);

        /* renamed from: onCheckLiteAppVersionError */
        default void mo65530xac5a411a(int i17) {
        }

        /* renamed from: onCheckSumFail */
        void mo28579x2d9f160(java.lang.String str, java.util.List<java.lang.String> list);

        /* renamed from: onCreateLitePageViewFinish */
        void mo28580x62158af0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo);

        /* renamed from: onLayoutComplete */
        default void mo29027xbed76e42(java.lang.String str, long j17, long j18, float f17, float f18) {
        }

        /* renamed from: onShowPageTimeStamp */
        void mo28581x97580b0b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo);

        /* renamed from: openApp */
        void mo28582xb4b4bf77();

        /* renamed from: openWebView */
        void mo28583x3d315a6f(java.util.Map map);

        /* renamed from: releaseKeepAlive */
        default void mo29032x856bf801() {
        }

        /* renamed from: removeBackgroundImage */
        default void mo28584xa3a97a9() {
        }

        /* renamed from: rightGestureEvent */
        default void mo28585xf285d70d(java.lang.String str, boolean z17) {
        }

        /* renamed from: setCanOverScroll */
        default void mo29033x49531b6f(boolean z17) {
        }

        /* renamed from: setDragToClose */
        default void mo29035x78a556a7(boolean z17) {
        }

        /* renamed from: setFlags */
        void mo28586x52fbaf45(int i17);

        /* renamed from: setForbidRightGestureEnable */
        default void mo28587x5189f8a6(boolean z17) {
        }

        /* renamed from: setIsPopGestureEnabled */
        void mo28588xf7fe169d(boolean z17);

        /* renamed from: setKeepScreenOn */
        void mo28589xb6f22792(boolean z17);

        /* renamed from: setPageOrientation */
        void mo28590xdaac6ff(int i17);

        /* renamed from: setScreenshotEnabled */
        void mo28591xae4d72b9(boolean z17);

        /* renamed from: setStatusBarHidden */
        default void mo28592x1c40f709(boolean z17) {
        }

        /* renamed from: setTitleBackgroundColor */
        default void mo65531xa1f17cdf(long j17, int i17, boolean z17) {
        }

        /* renamed from: showPage */
        void mo28593xebcbeb2c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo);

        /* renamed from: vibrateLong */
        void mo28594xaee4608b(long j17);

        /* renamed from: vibrateShort */
        void mo28595x2e072c4d(long j17, int i17);
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$IWxaLiteAppCallback */
    /* loaded from: classes15.dex */
    public interface IWxaLiteAppCallback {
        /* renamed from: addTask */
        default void mo65532xbb89e9c6(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        /* renamed from: callNativeRecorder */
        default java.lang.String mo65533x53781ff3(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            return "";
        }

        /* renamed from: callNativeSpeechRecognition */
        default void mo65534xd8bff1e0(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
            nativeCallback.m65629x9ad64344("{}");
        }

        /* renamed from: checkGlobalPkg */
        default java.lang.String mo65535x84cad301(java.lang.String str, java.lang.String str2) {
            return "";
        }

        /* renamed from: checkLiteAppAndGetPath */
        default java.lang.String mo65536x438af18f(java.lang.String str, boolean z17, boolean z18) {
            return "";
        }

        /* renamed from: clearScheduleWakeUp */
        default void mo65538x9731ac83(java.lang.String str) {
        }

        /* renamed from: dataReporting */
        void mo65539x7f55f5a4(java.lang.String str, java.lang.String str2, java.lang.String str3);

        /* renamed from: getAppInfo */
        java.lang.String[] mo65540xe759639(java.lang.String str);

        /* renamed from: getAppMemory */
        default long mo65541x4dc0b7cc() {
            return 0L;
        }

        /* renamed from: getBatteryInfo */
        default java.lang.String mo65542x526aff25() {
            return "{}";
        }

        /* renamed from: getClientVersion */
        java.lang.String mo65543xeb61b2d7();

        /* renamed from: getContext */
        default android.content.Context mo65544x76847179(long j17) {
            return null;
        }

        /* renamed from: getCpu */
        default float mo65545xb5883272() {
            return 0.0f;
        }

        /* renamed from: getDynamicLibraryPath */
        default java.lang.String mo65546x2d6383b7(java.lang.String str) {
            return "";
        }

        /* renamed from: getFilePathByLocalId */
        java.lang.String mo65547xf3f82618(java.lang.String str);

        /* renamed from: getHostInfo */
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo mo65548x69eaf7ec();

        /* renamed from: getImageInfo */
        default void mo65549xcb10cdf3(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
            nativeCallback.m65629x9ad64344("{}");
        }

        /* renamed from: getKeepAliveInfoCountLimit */
        default int mo65550x9977196c(int i17) {
            return 1;
        }

        /* renamed from: getKeepAliveTimeSecondsLimit */
        default int mo65551x8ad7dd9b(int i17, int i18) {
            return i17;
        }

        /* renamed from: getLiteAppBaselibInfo */
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef mo65552x63cce245(java.lang.String str);

        /* renamed from: getLiteAppEngineModelConfig */
        default java.lang.String mo65553x685374c() {
            return "{}";
        }

        /* renamed from: getLiteAppInfo */
        default com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 mo65554x3b2b08ab(java.lang.String str, java.lang.String str2) {
            return null;
        }

        /* renamed from: getLiteAppModelConfig */
        default java.lang.String mo65555x3591fd2e(java.lang.String str) {
            return "{}";
        }

        /* renamed from: getLiteAppRoot */
        java.lang.String mo65556x3b2f24df();

        /* renamed from: getLiteAppViewportMetrics */
        default com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppViewportMetrics mo65557x973c6520(android.content.Context context) {
            return null;
        }

        /* renamed from: getLiteAppWidgetStartReporter */
        default com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 mo65558x893771e2(java.lang.String str) {
            return null;
        }

        /* renamed from: getMulitExpt */
        default java.lang.String mo65559xa54be3d0(java.lang.String str, java.lang.String str2) {
            return str2;
        }

        /* renamed from: getNetworkInfo */
        default java.lang.String mo65561x6625b2c6() {
            return "{}";
        }

        /* renamed from: getOfflineResource */
        java.lang.String mo65562x97eb74db(java.lang.String str, java.lang.String str2, java.lang.String str3);

        /* renamed from: getOpenOption */
        default java.lang.String mo65563xfbfcf355(java.lang.String str) {
            return "{}";
        }

        /* renamed from: getPermissionBlackList */
        default java.util.List<java.lang.String> mo65564xc2f1ecf8(java.lang.String str) {
            return null;
        }

        /* renamed from: getRecentForward */
        java.lang.String mo65565xf485d434(java.lang.String str);

        /* renamed from: getRecentForwardTitle */
        java.lang.String mo65566x378bde84(java.lang.String str);

        /* renamed from: getRegionInfo */
        java.lang.String mo65567x77971db8(java.lang.String str, java.lang.String str2);

        /* renamed from: getScheduleWakeUpInfo */
        default java.lang.String mo65568xf749949a(java.lang.String str) {
            return "{}";
        }

        /* renamed from: getSystemInfo */
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373(int i17);

        /* renamed from: getTaskState */
        default java.lang.String mo65570x98cbb56(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            return "{}";
        }

        /* renamed from: getTaskSwitch */
        default java.lang.String mo65571x2838990f() {
            return "{}";
        }

        /* renamed from: getUin */
        java.lang.String mo65572xb5887524();

        /* renamed from: getUserAgent */
        java.lang.String mo65573x11fd7f44();

        /* renamed from: getUserAlbums */
        default java.lang.String mo65574x2df79b85(java.lang.String str, java.lang.String str2) {
            return "{}";
        }

        /* renamed from: getVideoInfo */
        default void mo65575x4edba913(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
            nativeCallback.m65629x9ad64344("{}");
        }

        /* renamed from: getVolume */
        default java.lang.String mo65576x34c20a10() {
            return "{}";
        }

        /* renamed from: getWebviewLocalIdByPath */
        default java.lang.String mo65577x7985af9f(java.lang.String str, java.lang.String str2) {
            return "";
        }

        /* renamed from: isDarkMode */
        boolean mo65578x387a9983();

        /* renamed from: liteAppWidgetCreateStore */
        default void mo65579x3a6c8e0e(java.lang.String str, int i17, boolean z17, int i18) {
        }

        /* renamed from: liteAppWidgetCreateStoreWithPkgPath */
        default void mo65580xb234c57d(java.lang.String str, int i17, java.lang.String str2) {
        }

        /* renamed from: liteAppWidgetDispatchStore */
        default int mo65581xbd125b10(java.lang.String str, java.lang.String str2, java.util.Map map) {
            return 0;
        }

        /* renamed from: liteAppWidgetPublishEventToTopPage */
        default void mo65582x2c375d87(int i17, int i18, java.lang.String str, java.util.Map map) {
        }

        /* renamed from: liteAppWidgetPublishGlobalEvent */
        default void mo65583xf0a63b3f(int i17, int i18, java.lang.String str, java.util.Map map) {
        }

        /* renamed from: liteAppWidgetPublishGlobalEventToAll */
        default void mo65584xa55b2127(java.lang.String str, java.util.Map map) {
        }

        /* renamed from: liteAppWidgetPublishGlobalEventToAllByAppId */
        default void mo65585xfdf9cdde(java.lang.String str, java.lang.String str2, java.util.Map map) {
        }

        /* renamed from: liteAppWidgetPublishGlobalEventToTopPage */
        default void mo65586x459b5a0a(int i17, java.lang.String str, java.util.Map map) {
        }

        /* renamed from: liteAppWidgetReleaseStore */
        default void mo65587x41cdfd71(java.lang.String str) {
        }

        /* renamed from: liteAppWidgetStoreIsAlive */
        default boolean mo65588x6fdd85f9(java.lang.String str) {
            return false;
        }

        /* renamed from: liteAppWidgetSubscribeStore */
        default void mo65589x9a12604e(java.lang.String str, java.util.List list) {
        }

        /* renamed from: liteAppWidgetUnsubscribeStore */
        default void mo65590x3f812567(java.lang.String str, java.util.List list) {
        }

        /* renamed from: loadLibrary */
        default void m65591xeb57c8f5(java.lang.String str) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/LiteAppCenter$IWxaLiteAppCallback", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/lite/LiteAppCenter$IWxaLiteAppCallback", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        /* renamed from: onCheckBaseLibSumFail */
        default void mo65592x2635de3e(java.lang.String str, java.util.List<java.lang.String> list) {
        }

        /* renamed from: onCheckSumFail */
        default void mo65593x2d9f160(java.lang.String str, java.util.List<java.lang.String> list) {
        }

        /* renamed from: onClearCurrentHandOff */
        default void mo65594x9cccaa15(java.lang.String str) {
        }

        /* renamed from: onInitJsRuntime */
        default void mo65595x5dcfd780(java.lang.String str, long j17, long j18, long j19, long j27) {
        }

        /* renamed from: onLiteAppWidgetPrepared */
        default void mo65596xb88c7b75() {
        }

        /* renamed from: onOpenCurrentPageOnPC */
        default void mo65597xb311f7d1(java.lang.String str) {
        }

        /* renamed from: onPreReleaseLiteApp */
        default void mo65598xc39385f0(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        }

        /* renamed from: onPreloadLitePageViewFailed */
        default void mo65599x9b632c49(java.lang.String str, java.lang.String str2) {
        }

        /* renamed from: onPreloadLitePageViewFinish */
        default void mo65600x9bd6249f(long j17, java.lang.String str, long j18) {
        }

        /* renamed from: onSetCurrentHandOff */
        default void mo65601xf695baa(java.lang.String str) {
        }

        /* renamed from: onSetUICallback */
        default void m65602x361ec93c(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback) {
        }

        /* renamed from: onShowStatusChange */
        default void mo65603xc060e1de(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17) {
        }

        /* renamed from: onStoreSendResult */
        void mo65604x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj);

        /* renamed from: onStoreSetData */
        void mo65605x295aba8a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);

        /* renamed from: onUnsetUICallback */
        default void mo65606xcc8b6703(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback) {
        }

        /* renamed from: onUpdateCurrentHandOff */
        default void mo65607x32cd686f(java.lang.String str) {
        }

        /* renamed from: openPage */
        void mo65608xe1e9c7f9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

        /* renamed from: prepareTask */
        default void mo65609xb1c1db2c(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        /* renamed from: reloadDebug */
        void mo65610x213c3a(java.lang.String str, java.lang.String str2);

        /* renamed from: removeForwardUser */
        default void mo65611xdb37fd0c(java.lang.String str) {
        }

        /* renamed from: removeTask */
        default void mo65612x417ac029(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        /* renamed from: reportIdKey */
        void mo65613xf0101a70(long j17, long j18, long j19);

        /* renamed from: reportKv */
        void mo65614xe68be1bf(int i17, java.lang.String str);

        /* renamed from: setOpenOption */
        default void mo65615x2a214161(java.lang.String str, java.lang.String str2) {
        }

        /* renamed from: setScheduleWakeUp */
        default void mo65616xc40ae9d8(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        }

        /* renamed from: showRegionPicker */
        default void m65617x4685b03f() {
        }

        /* renamed from: updateTask */
        default void mo65618xee5c55ee(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        /* renamed from: checkLiteAppAndGetPath */
        default void mo65537x438af18f(java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        }

        /* renamed from: getMulitExpt */
        default boolean mo65560xa54be3d0(java.lang.String str, boolean z17) {
            return z17;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$JsApi */
    /* loaded from: classes15.dex */
    public static class JsApi {

        /* renamed from: appId */
        public java.lang.String f37208x58b7f1c;

        /* renamed from: appPtr */
        public long f37209xabe4810d;

        /* renamed from: appUuid */
        public long f37210xd0ade97c;

        /* renamed from: callbackId */
        public long f37211x77352c40;

        /* renamed from: isFromView */
        public boolean f37212x868888b9;

        /* renamed from: method */
        public java.lang.String f37213xbfc5d0e1;

        /* renamed from: pageId */
        public long f37214xc4a6040a;

        /* renamed from: param */
        public java.lang.String f37215x658188d;

        public JsApi(long j17, java.lang.String str, long j18, long j19, java.lang.String str2, java.lang.String str3, long j27, boolean z17) {
            this.f37210xd0ade97c = j17;
            this.f37208x58b7f1c = str;
            this.f37209xabe4810d = j18;
            this.f37214xc4a6040a = j19;
            this.f37213xbfc5d0e1 = str2;
            this.f37215x658188d = str3;
            this.f37211x77352c40 = j27;
            this.f37212x868888b9 = z17;
        }

        /* renamed from: toString */
        public java.lang.String m65619x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appUuid:");
            stringBuffer.append(this.f37210xd0ade97c);
            stringBuffer.append("appid:");
            stringBuffer.append(this.f37208x58b7f1c);
            stringBuffer.append(" appPtr:");
            stringBuffer.append(this.f37209xabe4810d);
            stringBuffer.append(" pageId:");
            stringBuffer.append(this.f37214xc4a6040a);
            stringBuffer.append(" method:");
            stringBuffer.append(this.f37213xbfc5d0e1);
            stringBuffer.append(" param:");
            stringBuffer.append(this.f37215x658188d);
            stringBuffer.append(" callback:");
            stringBuffer.append(this.f37211x77352c40);
            stringBuffer.append(" isFromView:");
            stringBuffer.append(this.f37212x868888b9);
            return stringBuffer.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$KeepAliveInfo */
    /* loaded from: classes15.dex */
    public static class KeepAliveInfo {

        /* renamed from: appUuid */
        public long f37216xd0ade97c;

        /* renamed from: engineId */
        public int f37217x6c827afd;
        public java.lang.String key;

        /* renamed from: releaseRunnable */
        public java.lang.Runnable f37218xa4826844;

        /* renamed from: runnable */
        public java.lang.Runnable f37219x316fd31d;

        /* renamed from: sessionId */
        public java.lang.String f37220x243a3e51;
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$LVUICallback */
    /* loaded from: classes15.dex */
    public static class LVUICallback {

        /* renamed from: appId */
        public java.lang.String f37221x58b7f1c;

        /* renamed from: callback */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback f37224xf5bc2045;

        /* renamed from: height */
        private int f37225xb7389127;

        /* renamed from: width */
        private int f37228x6be2dc6;

        /* renamed from: store */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f37227x68af8e1 = null;

        /* renamed from: isPreload */
        public boolean f37226xca75b57f = false;

        /* renamed from: autoWidth */
        private boolean f37223x628f9557 = false;

        /* renamed from: autoHeight */
        private boolean f37222xd5941bb6 = false;

        public LVUICallback(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback) {
            this.f37221x58b7f1c = str;
            this.f37224xf5bc2045 = iLiteAppUICallback;
        }

        /* renamed from: getStore */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s m65620x75289f2b() {
            return this.f37227x68af8e1;
        }

        /* renamed from: getSystemInfo */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo m65621x148d5373(int i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback = this.f37224xf5bc2045;
            if (iLiteAppUICallback != null) {
                return iLiteAppUICallback.mo28571x148d5373(i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65569x148d5373(i17);
            mo65569x148d5373.f37309x58b7f1c = this.f37221x58b7f1c;
            mo65569x148d5373.f37313x67343749 = false;
            return mo65569x148d5373;
        }

        /* renamed from: onBodySizeChange */
        public void m65622x4e43b612(java.lang.String str, long j17, long j18, float f17, float f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback = this.f37224xf5bc2045;
            if (iLiteAppUICallback != null) {
                iLiteAppUICallback.mo29025x4e43b612(str, j17, j18, f17, f18);
            }
        }

        /* renamed from: onLayoutComplete */
        public void m65623xbed76e42(java.lang.String str, long j17, long j18, float f17, float f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback = this.f37224xf5bc2045;
            if (iLiteAppUICallback != null) {
                iLiteAppUICallback.mo29027xbed76e42(str, j17, j18, f17, f18);
            }
        }

        /* renamed from: onPreloadLitePageViewFinish */
        public void m65624x9bd6249f(long j17, java.lang.String str, long j18) {
            if (this.f37224xf5bc2045 != null) {
                return;
            }
            kd.c.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "onPreloadLitePageViewFinish appUuid=%d realAppUuid=%d autoHeight:%d size=%d %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f37222xd5941bb6 ? 1 : 0), java.lang.Integer.valueOf(this.f37228x6be2dc6), java.lang.Integer.valueOf(this.f37225xb7389127));
            boolean z17 = this.f37223x628f9557;
            if (z17 || this.f37222xd5941bb6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65460xcc5360d2(j18, z17, this.f37222xd5941bb6, false);
            }
            if (this.f37228x6be2dc6 > 0 || this.f37225xb7389127 > 0) {
                android.content.Context context = zc.c.f552872b;
                if (context == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                    throw null;
                }
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f17 = displayMetrics.density;
                float f18 = 48 * f17;
                android.content.Context context2 = zc.c.f552872b;
                if (context2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                    throw null;
                }
                android.graphics.Point b17 = es.u.b(context2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65466xde3207a6(j18, this.f37228x6be2dc6 / f17, this.f37225xb7389127 / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18 / f17, 0.0f, 0.0f);
            }
        }

        /* renamed from: setAutoSize */
        public void m65625xcc5360d2(boolean z17, boolean z18) {
            this.f37223x628f9557 = z17;
            this.f37222xd5941bb6 = z18;
        }

        /* renamed from: setSize */
        public void m65626x76500f83(int i17, int i18) {
            this.f37228x6be2dc6 = i17;
            this.f37225xb7389127 = i18;
        }

        /* renamed from: setStore */
        public void m65627x53b6b99f(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback;
            this.f37227x68af8e1 = sVar;
            if (sVar == null || (iLiteAppUICallback = this.f37224xf5bc2045) == null) {
                return;
            }
            sVar.f225699c = iLiteAppUICallback.mo28563xe7b2546();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar2 = this.f37227x68af8e1;
            android.content.Context mo28564xc88b72ec = this.f37224xf5bc2045.mo28564xc88b72ec();
            sVar2.getClass();
            sVar2.f225702f = new java.lang.ref.WeakReference(mo28564xc88b72ec);
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$LiteAppHandOffInfo */
    /* loaded from: classes15.dex */
    public static class LiteAppHandOffInfo {

        /* renamed from: id, reason: collision with root package name */
        public java.lang.String f224937id = "";

        /* renamed from: title */
        public java.lang.String f37234x6942258 = "";

        /* renamed from: icon */
        public java.lang.String f37231x313c79 = "";

        /* renamed from: appId */
        public java.lang.String f37229x58b7f1c = "";

        /* renamed from: page */
        public java.lang.String f37232x34628f = "";

        /* renamed from: query */
        public java.lang.String f37233x66f18c8 = "";

        /* renamed from: type */
        public java.lang.String f37235x368f3a = "";
        public java.lang.String url = "";

        /* renamed from: extraData */
        public java.lang.String f37230xf0df6fda = "";
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$LiteAppViewportMetrics */
    /* loaded from: classes15.dex */
    public static class LiteAppViewportMetrics {

        /* renamed from: width */
        public int f37247x6be2dc6 = 0;

        /* renamed from: height */
        public int f37241xb7389127 = 0;

        /* renamed from: deviceWidth */
        public int f37240xa393a510 = 0;

        /* renamed from: deviceHeight */
        public int f37239xb512031d = 0;

        /* renamed from: statusBarHeight */
        public int f37246xd27f48 = 0;

        /* renamed from: actionBarHeight */
        public int f37236xcbf69d84 = 0;

        /* renamed from: navigationBarHeight */
        public int f37245xb0fc8b66 = 0;

        /* renamed from: densityDpi */
        public int f37238xba56f55 = 0;

        /* renamed from: density */
        public float f37237x5c8c94e8 = 0.0f;

        /* renamed from: inMultiWindowMode */
        public boolean f37242x571b6be7 = false;

        /* renamed from: multiWindowWidth */
        public int f37244x7644dcbd = 0;

        /* renamed from: multiWindowHeight */
        public int f37243x3887c110 = 0;

        /* renamed from: toString */
        public java.lang.String m65628x9616526c() {
            return "LiteAppViewportMetrics {width=" + this.f37247x6be2dc6 + ", height=" + this.f37241xb7389127 + ", deviceWidth=" + this.f37240xa393a510 + ", deviceHeight=" + this.f37239xb512031d + ", statusBarHeight=" + this.f37246xd27f48 + ", actionBarHeight=" + this.f37236xcbf69d84 + ", navigationBarHeight=" + this.f37245xb0fc8b66 + ", densityDpi=" + this.f37238xba56f55 + ", density=" + this.f37237x5c8c94e8 + ", inMultiWindowMode=" + this.f37242x571b6be7 + ", multiWindowWidth=" + this.f37244x7644dcbd + ", multiWindowHeight=" + this.f37243x3887c110 + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$MethodInfo */
    /* loaded from: classes15.dex */
    public static class MethodInfo {

        /* renamed from: METHOD_ASYNC */
        public static final int f37248xee7457e = 1;

        /* renamed from: METHOD_SYNC */
        public static final int f37249x4ad5eb39 = 0;

        /* renamed from: PARAM_BOOL */
        public static final int f37250x39a8077c = 1;

        /* renamed from: PARAM_BUFFER */
        public static final int f37251x70148052 = 5;

        /* renamed from: PARAM_CALLBACK */
        public static final int f37252xd6a4bd7 = 6;

        /* renamed from: PARAM_CHAR */
        public static final int f37253x39a85fe8 = 2;

        /* renamed from: PARAM_JSON */
        public static final int f37254x39abb97a = 4;

        /* renamed from: PARAM_NUMBER */
        public static final int f37255x8491c75b = 0;

        /* renamed from: PARAM_STRING */
        public static final int f37256x8d0e4c23 = 3;

        /* renamed from: isReturnBuffer */
        public boolean f37257xe6f70bda = false;

        /* renamed from: methodType */
        public int f37259xd4e87bbb = 0;

        /* renamed from: methodName */
        public java.lang.String f37258xd4e5670c = "";

        /* renamed from: paramTypes */
        public java.util.List<java.lang.Integer> f37260x1a6a9fec = new java.util.ArrayList();

        /* renamed from: returnTypes */
        public java.util.Map<java.lang.String, java.lang.Integer> f37261xa6d0e929 = new java.util.HashMap();
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$ModuleInfo */
    /* loaded from: classes15.dex */
    public static class ModuleInfo {

        /* renamed from: moduleName */
        public java.lang.String f37263xcc1f7f17 = "";

        /* renamed from: methods */
        public java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.MethodInfo> f37262x38f44bb2 = new java.util.HashMap();
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$NativeCallback */
    /* loaded from: classes15.dex */
    public static class NativeCallback {

        /* renamed from: callbackId */
        private final long f37264x77352c40;

        public NativeCallback(long j17) {
            this.f37264x77352c40 = j17;
        }

        /* renamed from: onCallback */
        public void m65629x9ad64344(java.lang.Object obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65388xdaecd7c(this.f37264x77352c40, obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData */
    /* loaded from: classes15.dex */
    public static class OpenExtraData {

        /* renamed from: query */
        public java.lang.String f37265x66f18c8;

        /* renamed from: referrerInfo */
        public java.lang.String f37266x83282d6d;

        /* renamed from: store */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f37267x68af8e1;
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$PageConfig */
    /* loaded from: classes15.dex */
    public static class PageConfig {

        /* renamed from: VIEWPORT_DEFAULT */
        public static final int f37268xa960eb88 = 0;

        /* renamed from: VIEWPORT_EXTEND_TO_SCREEN */
        public static final int f37269x3f842644 = 3;

        /* renamed from: VIEWPORT_EXTEND_TO_STATUSBAR */
        public static final int f37270xf0887de9 = 1;

        /* renamed from: VIEWPORT_FULLSCREEN */
        public static final int f37271xa3ce10f4 = 7;

        /* renamed from: VIEWPORT_HIDE_STATUSBAR */
        public static final int f37272xf8168bd = 5;

        /* renamed from: backgroundColor */
        public int f37273x4cb7f6d5 = 0;

        /* renamed from: darkBackgroundColor */
        public int f37275x16bc247f = 0;

        /* renamed from: titleBackgroundColor */
        public int f37280x79d2915d = 0;

        /* renamed from: darkTitleBackgroundColor */
        public int f37276x3e7a5df3 = 0;

        /* renamed from: pageOrientation */
        public int f37279xf2725bc1 = 0;

        /* renamed from: viewport */
        public int f37281x4753f8a6 = 0;

        /* renamed from: backgroundImage */
        public org.json.JSONObject f37274x4d0b70cd = null;

        /* renamed from: globalPkgAppId */
        public java.lang.String f37277x37ed3173 = "";

        /* renamed from: globalPkgMinVersion */
        public java.lang.String f37278x6398da2f = "";

        /* renamed from: getBackgroundColor */
        public int m65630x3119c89f(boolean z17) {
            return z17 ? this.f37275x16bc247f : this.f37273x4cb7f6d5;
        }

        /* renamed from: getBackgroundImageMode */
        public android.widget.ImageView.ScaleType m65631x5d70ccda() {
            java.lang.String optString = this.f37274x4d0b70cd.optString("mode", "");
            optString.getClass();
            char c17 = 65535;
            switch (optString.hashCode()) {
                case 3143043:
                    if (optString.equals("fill")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case 94852023:
                    if (optString.equals("cover")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case 951526612:
                    if (optString.equals("contain")) {
                        c17 = 2;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    return android.widget.ImageView.ScaleType.FIT_XY;
                case 1:
                    return android.widget.ImageView.ScaleType.CENTER_CROP;
                case 2:
                    return android.widget.ImageView.ScaleType.CENTER_INSIDE;
                default:
                    return android.widget.ImageView.ScaleType.FIT_XY;
            }
        }

        /* renamed from: getBackgroundImagePath */
        public java.lang.String m65632x5d71f75c(boolean z17) {
            org.json.JSONObject jSONObject;
            java.lang.String str;
            if (z17) {
                jSONObject = this.f37274x4d0b70cd;
                str = "darkUrl";
            } else {
                jSONObject = this.f37274x4d0b70cd;
                str = "url";
            }
            return jSONObject.optString(str, "");
        }

        /* renamed from: getTitleBackgroundColor */
        public int m65633x279e4dd3(boolean z17) {
            return z17 ? this.f37276x3e7a5df3 : this.f37280x79d2915d;
        }

        /* renamed from: isFullScreenViewport */
        public boolean m65634x19054c6b() {
            return (this.f37281x4753f8a6 & 2) != 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$PageShowInfo */
    /* loaded from: classes15.dex */
    public static class PageShowInfo {

        /* renamed from: codeCacheResult */
        public int f37296x65712e12;

        /* renamed from: codeCacheSwitch */
        public boolean f37297x681f1d29;

        /* renamed from: compilePageCost */
        public long f37298x715c824f;

        /* renamed from: evalBaseLibCost */
        public long f37299x24cd2da5;

        /* renamed from: evalPageCost */
        public long f37300xfe405fb8;

        /* renamed from: extraInfo */
        public java.lang.String f37301xf0e1e4de;

        /* renamed from: hitSnapshotSwitch */
        public boolean f37302x56f6388b;

        /* renamed from: snapshotRuntimeType */
        public int f37303xb1c876ce;

        /* renamed from: timestamp */
        public long f37304x3492916;

        public PageShowInfo(long j17, boolean z17, int i17, long j18, long j19, long j27, boolean z18, int i18, java.lang.String str) {
            this.f37304x3492916 = j17;
            this.f37297x681f1d29 = z17;
            this.f37296x65712e12 = i17;
            this.f37298x715c824f = j18;
            this.f37300xfe405fb8 = j19;
            this.f37299x24cd2da5 = j27;
            this.f37302x56f6388b = z18;
            this.f37303xb1c876ce = i18;
            this.f37301xf0e1e4de = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$PlatformInfo */
    /* loaded from: classes15.dex */
    public static class PlatformInfo {

        /* renamed from: userAgent */
        public java.lang.String f37308x12900dfa = "";

        /* renamed from: rootPath */
        public java.lang.String f37307xf60c1827 = "";
        public java.lang.String uin = "";

        /* renamed from: clientVersion */
        public java.lang.String f37305x2e01f68d = "";

        /* renamed from: engineModelConfig */
        public java.lang.String f37306x754db829 = "";
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$RunnableTask */
    /* loaded from: classes.dex */
    public interface RunnableTask {
        void run(boolean z17);
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$SystemInfo */
    /* loaded from: classes15.dex */
    public static class SystemInfo {

        /* renamed from: networkType */
        public java.lang.String f37317x8c549688 = "";

        /* renamed from: brand */
        public java.lang.String f37310x59a4b87 = "";

        /* renamed from: model */
        public java.lang.String f37315x633fb29 = "";

        /* renamed from: appId */
        public java.lang.String f37309x58b7f1c = "";

        /* renamed from: language */
        public java.lang.String f37314x9fd29358 = "";

        /* renamed from: platform */
        public java.lang.String f37319x6fbd6873 = "";

        /* renamed from: system */
        public java.lang.String f37321xcb1c722f = "";

        /* renamed from: version */
        public java.lang.String f37323x14f51cd8 = "";

        /* renamed from: fontScale */
        public float f37312xa386663b = 1.0f;

        /* renamed from: pixelRatio */
        public float f37318xfd923125 = 0.0f;

        /* renamed from: navigationBarHeight */
        public float f37316xb0fc8b66 = 0.0f;

        /* renamed from: statusBarHeight */
        public float f37320xd27f48 = 0.0f;

        /* renamed from: titleBarHeight */
        public float f37322x7f4b7fa2 = 0.0f;

        /* renamed from: darkMode */
        public boolean f37311x67c2f239 = false;

        /* renamed from: isHalfScreen */
        public boolean f37313x67343749 = false;

        /* renamed from: toJsonString */
        public java.lang.String m65637x9d6b37f4() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("networkType", this.f37317x8c549688);
                jSONObject.put("brand", this.f37310x59a4b87);
                jSONObject.put("model", this.f37315x633fb29);
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f37314x9fd29358);
                jSONObject.put("platform", this.f37319x6fbd6873);
                jSONObject.put("system", this.f37321xcb1c722f);
                jSONObject.put("fontScale", this.f37312xa386663b);
                jSONObject.put("version", this.f37323x14f51cd8);
                jSONObject.put("pixelRatio", this.f37318xfd923125);
                jSONObject.put("navigationBarHeight", this.f37316xb0fc8b66);
                jSONObject.put("statusBarHeight", this.f37320xd27f48);
                jSONObject.put("titleBarHeight", this.f37322x7f4b7fa2);
                jSONObject.put("darkMode", this.f37311x67c2f239);
                jSONObject.put("isHalfScreen", this.f37313x67343749);
            } catch (org.json.JSONException e17) {
                kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "toJasonString JSONException" + e17.toString(), new java.lang.Object[0]);
            }
            return jSONObject.toString();
        }
    }

    /* renamed from: DynamicModuleCallback */
    public static native void m65233x3b9fa0d0(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, boolean z17, boolean z18, boolean z19);

    /* renamed from: DynamicModuleParamCallback */
    public static native void m65234x8585de47(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, boolean z17, boolean z18);

    /* renamed from: _getPageConfig */
    private static native java.lang.String m65235xf0b0f4a8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: addGlobalStore */
    public static void m65248xf235039d(java.lang.String str, java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s> cls) {
        f37172x7debba74.put(str, cls);
    }

    /* renamed from: addJsApi */
    public static void m65249xb52dd7f0(java.lang.String str, java.lang.Class<? extends jd.b> cls) {
        if (!f37171x4605277b.containsKey(str)) {
            f37171x4605277b.put(str, cls);
            return;
        }
        throw new java.lang.RuntimeException(str + " has been exists");
    }

    /* renamed from: addKeepAliveInfo */
    private static void m65255x4e4de1f5(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo keepAliveInfo, int i17) {
        java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> concurrentLinkedQueue = f37154xf01a461d.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
            f37154xf01a461d.put(java.lang.Integer.valueOf(i17), concurrentLinkedQueue);
        }
        if (concurrentLinkedQueue.size() >= m65327x9977196c(i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo poll = concurrentLinkedQueue.poll();
            m65322x67189314().removeCallbacks(poll.f37219x316fd31d);
            poll.f37218xa4826844.run();
        }
        concurrentLinkedQueue.add(keepAliveInfo);
    }

    /* renamed from: addTask */
    private static void m65256xbb89e9c6(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65532xbb89e9c6(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: cacheNavigationBarHeight */
    public static int m65257x13ca2084(android.content.Context context, int i17, long j17) {
        if (context == null) {
            kd.c.e(TAG, "cacheNavigationBarHeight: context is null", new java.lang.Object[0]);
            return -1;
        }
        try {
            int b17 = md.n.b(context, i17);
            if (b17 >= 0) {
                if (b17 != i17 || f37142x6207eae4 != i17) {
                    m65489x42927ce9(j17, -1.0f, b17 / context.getResources().getDisplayMetrics().density, true);
                }
                f37142x6207eae4 = b17;
                kd.c.c(TAG, "Navigation bar height cached in LiteAppCenter: %d", java.lang.Integer.valueOf(b17));
                return b17;
            }
        } catch (java.lang.Exception e17) {
            kd.c.e(TAG, "cacheNavigationBarHeight error: %s", e17.getMessage());
        }
        return -1;
    }

    /* renamed from: callDynamicModule */
    private static java.lang.String m65258x1f2d85cd(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j19, boolean z17) {
        java.lang.String str5;
        java.lang.reflect.Method method;
        bd.g gVar;
        boolean z18;
        java.util.List list;
        java.util.List list2;
        boolean z19;
        boolean z27;
        java.lang.reflect.Method method2;
        java.util.List list3;
        java.util.List list4;
        java.lang.Object[] objArr;
        bd.d dVar;
        bd.i iVar;
        java.util.List list5;
        bd.d dVar2;
        java.util.List list6;
        bd.i iVar2;
        int i17;
        bd.i iVar3 = bd.i.f100748e;
        iVar3.getClass();
        try {
            java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) iVar3.f100751c).get(str);
            method = null;
            gVar = map != null ? (bd.g) map.get(str2) : null;
            if (gVar == null) {
                gVar = (bd.g) ((java.util.concurrent.ConcurrentHashMap) iVar3.f100750b).get(str2);
            }
        } catch (java.lang.Exception e17) {
            e = e17;
            str5 = "WxaLiteApp.WxaLiteAppModuleMgr";
        }
        if (gVar == null) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "DynamicModule " + str2 + " isn't registered!", new java.lang.Object[0]);
            return "\"module isn't registered!\"";
        }
        java.util.Map map2 = gVar.f100741a;
        java.util.Iterator it = ((java.util.HashMap) map2).keySet().iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                list = null;
                list2 = null;
                z19 = false;
                z27 = false;
                break;
            }
            java.lang.String str6 = (java.lang.String) it.next();
            if (str6.equals(str3)) {
                bd.f fVar = (bd.f) ((java.util.HashMap) map2).get(str6);
                java.lang.reflect.Method method3 = fVar.f100736a;
                list2 = fVar.f100738c;
                z19 = true;
                z27 = true;
                list = fVar.f100739d;
                method = method3;
                break;
            }
        }
        if (!z19) {
            java.util.Map map3 = gVar.f100742b;
            for (java.lang.String str7 : ((java.util.HashMap) map3).keySet()) {
                java.lang.reflect.Method method4 = method;
                if (str7.equals(str3)) {
                    bd.f fVar2 = (bd.f) ((java.util.HashMap) map3).get(str7);
                    method2 = fVar2.f100736a;
                    list3 = fVar2.f100738c;
                    z27 = false;
                    list4 = fVar2.f100739d;
                    break;
                }
                method = method4;
            }
        }
        z18 = z19;
        method2 = method;
        list3 = list2;
        list4 = list;
        if (!z18) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "DynamicModule " + str2 + " hasn't method " + str3, new java.lang.Object[0]);
            return "\"method isn't found!\"";
        }
        bd.d dVar3 = (bd.d) gVar.f100743c.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        int andIncrement = iVar3.f100749a.getAndIncrement();
        bd.d dVar4 = dVar3;
        java.util.List list7 = list4;
        java.util.List list8 = list3;
        java.lang.reflect.Method method5 = method2;
        str5 = "WxaLiteApp.WxaLiteAppModuleMgr";
        try {
            dVar4.m10171x6c4ebec7(new bd.e(j17, str, j18, j19, andIncrement, z17));
            if (j19 > 0) {
                ((java.util.concurrent.ConcurrentHashMap) iVar3.f100752d).put(java.lang.Integer.valueOf(andIncrement), dVar4);
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray(str4);
            objArr = new java.lang.Object[jSONArray.length()];
            int i18 = 0;
            while (i18 < jSONArray.length()) {
                if (list8.contains(java.lang.Integer.valueOf(i18))) {
                    list5 = list8;
                    dVar2 = dVar4;
                    objArr[i18] = java.nio.ByteBuffer.wrap(m65311x12f2b736(str, j17, jSONArray.optJSONObject(i18).getInt("__id"), z17));
                    iVar2 = iVar3;
                    list6 = list7;
                    i17 = i18;
                } else {
                    list5 = list8;
                    dVar2 = dVar4;
                    java.util.List list9 = list7;
                    if (list9.contains(java.lang.Integer.valueOf(i18))) {
                        list6 = list9;
                        iVar2 = iVar3;
                        i17 = i18;
                        objArr[i17] = new bd.b(j17, str, j18, jSONArray.optLong(i18), z17);
                    } else {
                        list6 = list9;
                        iVar2 = iVar3;
                        i17 = i18;
                        objArr[i17] = jSONArray.get(i17);
                    }
                }
                i18 = i17 + 1;
                dVar4 = dVar2;
                list8 = list5;
                iVar3 = iVar2;
                list7 = list6;
            }
            dVar = dVar4;
            iVar = iVar3;
        } catch (java.lang.Exception e18) {
            e = e18;
            kd.c.b(str5, "callDynamicModule " + e.toString(), new java.lang.Object[0]);
            return "\"error\"";
        }
        if (!z27) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new bd.h(iVar, method5, dVar, objArr));
            return "\"error\"";
        }
        java.lang.Object invoke = method5.invoke(dVar, objArr);
        java.lang.Class<?> returnType = method5.getReturnType();
        if (invoke == null) {
            return "null";
        }
        if (returnType.getName().toLowerCase().contains("map")) {
            return new org.json.JSONObject((java.util.Map) invoke).toString();
        }
        if (returnType.getName().toLowerCase().contains("list")) {
            return new org.json.JSONArray((java.util.Collection) invoke).toString();
        }
        if (!returnType.getName().toLowerCase().contains("string")) {
            if (!returnType.getName().toLowerCase().contains("byte")) {
                return invoke instanceof bd.a ? bd.j.a((bd.a) invoke, str, j17, z17) : invoke.toString();
            }
            return "{\"__id\":" + m65461x627eb42(str, j17, ((java.nio.ByteBuffer) invoke).array(), z17) + "}";
        }
        java.lang.String str8 = (java.lang.String) invoke;
        if (m65382xb9a4c932(str8)) {
            return str8;
        }
        return "\"" + m65287x77baa7f2(str8) + "\"";
    }

    /* renamed from: callNativeRecorder */
    private static java.lang.String m65259x53781ff3(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65533x53781ff3(j17, str, str3, str4);
        }
        kd.c.b(TAG, "callNativeRecorder mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* renamed from: canIUse */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m65260x20bf944e(java.lang.String r6, java.lang.String r7) {
        /*
            bd.i r0 = bd.i.f100748e
            java.util.Map r1 = r0.f100750b
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r1 = r1.containsKey(r7)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L10
        Le:
            r0 = r3
            goto L28
        L10:
            java.util.Map r0 = r0.f100751c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L27
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L27
            goto Le
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2b
            return r3
        L2b:
            java.lang.String r0 = "jsapi"
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L34
            return r3
        L34:
            java.lang.String r1 = "."
            boolean r4 = r7.contains(r1)
            if (r4 == 0) goto L81
            int r1 = r7.indexOf(r1)
            java.lang.String r4 = r7.substring(r2, r1)
            int r1 = r1 + r3
            int r5 = r7.length()
            java.lang.String r7 = r7.substring(r1, r5)
            int r1 = r7.length()
            if (r1 <= 0) goto L81
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37171x4605277b
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L80
            java.util.Map<java.lang.String, jd.b> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37175xb2808b51
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L6a
            goto L80
        L6a:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>>> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37170x85bca6c4
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>>> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37170x85bca6c4
            java.lang.Object r6 = r0.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L81
        L80:
            return r3
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65260x20bf944e(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: checkAndGetLiteAppPath */
    public static java.lang.String m65261xb98ad5b1(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.mo65536x438af18f(str, z17, z18) : "";
    }

    /* renamed from: checkBaseLib */
    public static native int m65263xe88edfcc(java.lang.String str);

    /* renamed from: checkGlobalPkg */
    public static java.lang.String m65264x84cad301(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig pageConfig) {
        return (f37158x1ab9c7d2 == null || pageConfig == null || pageConfig.f37277x37ed3173.isEmpty()) ? "" : f37158x1ab9c7d2.mo65535x84cad301(pageConfig.f37277x37ed3173, pageConfig.f37278x6398da2f);
    }

    /* renamed from: checkLiteAppPkg */
    public static native int m65265x8cf57961(java.lang.String str);

    /* renamed from: checkPageExists */
    public static native boolean m65266x7cc9f2f3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: checkSessionId */
    public static native boolean m65267x91e5a229(java.lang.String str);

    /* renamed from: clearScheduleWakeUp */
    private static void m65268x9731ac83(java.lang.String str) {
        kd.c.c(TAG, "clearScheduleWakeUp appId: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65538x9731ac83(str);
        }
    }

    /* renamed from: closeWindow */
    public static void m65269x10864c08(long j17, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28560x10864c08(intent);
        }
    }

    /* renamed from: createStore */
    public static native void m65271xe1eba545(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    /* renamed from: createStoreForLiteAppWidget */
    public static void m65272xc4fb67d3(java.lang.String str, int i17, boolean z17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65579x3a6c8e0e(str, i17, z17, i18);
        }
    }

    /* renamed from: createStoreWithPkgPathForLiteAppWidget */
    public static void m65273xe9e03674(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65580xb234c57d(str, i17, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dataReporting */
    public static void m65274x7f55f5a4(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65539x7f55f5a4(str, str2, str3);
        }
    }

    /* renamed from: deleteAuthInfo */
    public static native boolean m65275xdafbb141(java.lang.String str);

    /* renamed from: deleteBaselibInfo */
    public static native boolean m65276x35a20637(java.lang.String str);

    /* renamed from: deleteConfigInfo */
    public static native boolean m65277xd6e4731b(java.lang.String str);

    /* renamed from: deleteLiteAppInfo */
    public static native boolean m65278x672c3b36(java.lang.String str);

    /* renamed from: deleteSamplingConfigInfo */
    public static native boolean m65279x2b466f62(java.lang.String str);

    /* renamed from: destroyPage */
    public static native void m65280x89d4e9a9(long j17, java.lang.String str, long j18);

    /* renamed from: dispatchCmdNoRet */
    private static void m65281x432ba0a0(long j17, java.lang.String str, long j18, final long j19, int i17, final java.lang.String str2) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (i17 == 0) {
            if (m65361xd4eb96cf != null) {
                m65361xd4eb96cf.mo28594xaee4608b(400L);
                return;
            }
            return;
        }
        if (i17 == 1) {
            if (m65361xd4eb96cf != null) {
                int i18 = 192;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    if (jSONObject.has("type")) {
                        java.lang.String string = jSONObject.getString("type");
                        if ("heavy".equals(string)) {
                            i18 = 255;
                        } else if ("light".equals(string)) {
                            i18 = 128;
                        }
                    }
                } catch (org.json.JSONException unused) {
                }
                m65361xd4eb96cf.mo28595x2e072c4d(15L, i18);
                return;
            }
            return;
        }
        try {
            if (i17 != 2) {
                switch (i17) {
                    case 11:
                        m65322x67189314().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.6
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback.this != null) {
                                    try {
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback.this.mo65531xa1f17cdf(j19, jSONObject2.getInt("color"), jSONObject2.getBoolean("darkMode"));
                                    } catch (org.json.JSONException unused2) {
                                    }
                                }
                            }
                        });
                        return;
                    case 12:
                        if (m65361xd4eb96cf != null) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                            if (jSONObject2.has("enabled")) {
                                m65361xd4eb96cf.mo28591xae4d72b9(jSONObject2.getBoolean("enabled"));
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 13:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
                        if (iWxaLiteAppCallback != null) {
                            iWxaLiteAppCallback.m65617x4685b03f();
                            return;
                        }
                        return;
                    case 14:
                        m65444x856bf801(str, j17);
                        return;
                    default:
                        return;
                }
            } else {
                if (m65361xd4eb96cf == null) {
                    return;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(str2);
                if (!jSONObject3.has("on")) {
                } else {
                    m65361xd4eb96cf.mo28589xb6f22792(jSONObject3.getBoolean("on"));
                }
            }
        } catch (org.json.JSONException unused2) {
        }
    }

    /* renamed from: dispatchCmdWithRet */
    private static java.lang.String m65282xfa81037b(java.lang.String str, long j17, long j18, int i17, java.lang.String str2) {
        switch (i17) {
            case 3:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
                return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.mo65567x77971db8("province", str2) : "";
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback2 = f37158x1ab9c7d2;
                return iWxaLiteAppCallback2 != null ? iWxaLiteAppCallback2.mo65567x77971db8("city", str2) : "";
            case 5:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback3 = f37158x1ab9c7d2;
                return iWxaLiteAppCallback3 != null ? iWxaLiteAppCallback3.mo65567x77971db8("region", str2) : "";
            case 6:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback4 = f37158x1ab9c7d2;
                return iWxaLiteAppCallback4 != null ? iWxaLiteAppCallback4.mo65567x77971db8("subDistrict", str2) : "";
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback5 = f37158x1ab9c7d2;
                return iWxaLiteAppCallback5 != null ? iWxaLiteAppCallback5.mo65567x77971db8("internationalCountry", str2) : "";
            case 8:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback6 = f37158x1ab9c7d2;
                return iWxaLiteAppCallback6 != null ? iWxaLiteAppCallback6.mo65567x77971db8("internationalProvince", str2) : "";
            case 9:
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback7 = f37158x1ab9c7d2;
                return iWxaLiteAppCallback7 != null ? iWxaLiteAppCallback7.mo65567x77971db8("internationalCity", str2) : "";
            default:
                return "";
        }
    }

    /* renamed from: dispatchPlatformCmdWithCallback */
    private static void m65283xa99302b8(long j17, java.lang.String str, long j18, int i17, java.lang.String str2, boolean z17, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback(j19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback == null) {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            nativeCallback.m65629x9ad64344("{}");
        } else if (i17 == 15) {
            iWxaLiteAppCallback.mo65534xd8bff1e0(j17, str, j18, "startSpeechRecognition", str2, z17, nativeCallback);
        } else {
            if (i17 != 16) {
                return;
            }
            iWxaLiteAppCallback.mo65534xd8bff1e0(j17, str, j18, "stopSpeechRecognition", str2, z17, nativeCallback);
        }
    }

    /* renamed from: dispatchStore */
    public static int m65284x81288087(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return m65285x81288087(str, str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s.b(obj, "{}"));
    }

    /* renamed from: dispatchStore */
    private static native int m65285x81288087(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: dispatchStoreForLiteAppWidget */
    public static int m65286x88ed7f15(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65581xbd125b10(str, str2, map);
        }
        return 0;
    }

    /* renamed from: escapeString */
    public static java.lang.String m65287x77baa7f2(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        int i17 = 0;
        while (i17 < sb6.length()) {
            char charAt = sb6.charAt(i17);
            if (charAt == '\t') {
                sb6.replace(i17, i17 + 1, "\\t");
            } else if (charAt == '\n') {
                sb6.replace(i17, i17 + 1, "\\n");
            } else if (charAt == '\r') {
                sb6.replace(i17, i17 + 1, "\\r");
            } else if (charAt == '\"') {
                sb6.replace(i17, i17 + 1, "\\\"");
            } else if (charAt != '\\') {
                i17++;
            } else {
                sb6.replace(i17, i17 + 1, "\\\\");
            }
            i17 += 2;
        }
        return sb6.toString();
    }

    /* renamed from: genAppUuid */
    public static long m65288x9f34180c() {
        long andIncrement;
        do {
            andIncrement = f37157x6ec69c4f.getAndIncrement() & 65535;
        } while (andIncrement == 0);
        return andIncrement;
    }

    /* renamed from: genDataUuid */
    public static long m65289x6ce315f5() {
        return f37159x8fa11a12.incrementAndGet();
    }

    /* renamed from: genLiteAppSessionId */
    public static java.lang.String m65290xce8d5c6e() {
        return java.util.UUID.randomUUID().toString();
    }

    /* renamed from: generateLiteAppLocalId */
    public static native java.lang.String m65291x71b41ca8(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: getAllBaselibInfo */
    public static native void m65292xf50de977(java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef> list);

    /* renamed from: getAllConfigInfo */
    public static native void m65293xd4cf27db(java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063> list);

    /* renamed from: getAllDynamicModule */
    private static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo[] m65294x955512e0(java.lang.String str) {
        java.util.Iterator it;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        bd.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo moduleInfo;
        bd.i iVar;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.CharSequence charSequence;
        java.lang.String str5;
        java.lang.CharSequence charSequence2;
        int i17;
        java.lang.String str6;
        bd.i iVar2 = bd.i.f100748e;
        iVar2.getClass();
        int i18 = 0;
        if (str == null || str.isEmpty()) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "invalid appId", new java.lang.Object[0]);
            return null;
        }
        java.util.List a17 = iVar2.a(str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
        while (it6.hasNext()) {
            bd.g gVar2 = (bd.g) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo moduleInfo2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo();
            moduleInfo2.f37263xcc1f7f17 = gVar2.f100744d;
            java.util.Iterator it7 = ((java.util.HashMap) gVar2.f100741a).entrySet().iterator();
            while (true) {
                java.lang.String str7 = "bool";
                it = it6;
                str2 = "short";
                arrayList = arrayList2;
                gVar = gVar2;
                moduleInfo = moduleInfo2;
                iVar = iVar2;
                str3 = "string";
                if (!it7.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it7.next();
                java.util.Iterator it8 = it7;
                java.lang.CharSequence charSequence3 = "callback";
                ((bd.f) entry.getValue()).f100738c = new java.util.ArrayList();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.MethodInfo methodInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.MethodInfo();
                methodInfo.f37259xd4e87bbb = 0;
                methodInfo.f37258xd4e5670c = (java.lang.String) entry.getKey();
                java.lang.CharSequence charSequence4 = "byte";
                if (((bd.f) entry.getValue()).f100736a.getReturnType().getName().toLowerCase().contains("buffer")) {
                    methodInfo.f37257xe6f70bda = true;
                }
                java.lang.Class<?>[] parameterTypes = ((bd.f) entry.getValue()).f100736a.getParameterTypes();
                int length = parameterTypes.length;
                int i19 = 0;
                int i27 = 0;
                while (i19 < length) {
                    java.lang.Class<?>[] clsArr = parameterTypes;
                    java.lang.String lowerCase = parameterTypes[i19].getName().toLowerCase();
                    if (lowerCase.contains("string")) {
                        i17 = length;
                        methodInfo.f37260x1a6a9fec.add(4);
                    } else {
                        i17 = length;
                        if (lowerCase.contains("list")) {
                            methodInfo.f37260x1a6a9fec.add(4);
                        } else if (lowerCase.contains("map")) {
                            methodInfo.f37260x1a6a9fec.add(4);
                        } else if (lowerCase.contains("json")) {
                            methodInfo.f37260x1a6a9fec.add(4);
                        } else if (lowerCase.contains("short")) {
                            methodInfo.f37260x1a6a9fec.add(0);
                        } else if (lowerCase.contains("int")) {
                            methodInfo.f37260x1a6a9fec.add(0);
                        } else if (lowerCase.contains("long")) {
                            methodInfo.f37260x1a6a9fec.add(0);
                        } else if (lowerCase.contains("float")) {
                            methodInfo.f37260x1a6a9fec.add(0);
                        } else if (lowerCase.contains("double")) {
                            methodInfo.f37260x1a6a9fec.add(0);
                        } else {
                            if (lowerCase.contains(str7)) {
                                str6 = str7;
                                methodInfo.f37260x1a6a9fec.add(1);
                            } else {
                                str6 = str7;
                                if (lowerCase.contains("char")) {
                                    methodInfo.f37260x1a6a9fec.add(2);
                                } else {
                                    java.lang.CharSequence charSequence5 = charSequence4;
                                    if (lowerCase.contains(charSequence5)) {
                                        charSequence4 = charSequence5;
                                        methodInfo.f37260x1a6a9fec.add(5);
                                        ((java.util.ArrayList) ((bd.f) entry.getValue()).f100738c).add(java.lang.Integer.valueOf(i27));
                                    } else {
                                        charSequence4 = charSequence5;
                                        java.lang.CharSequence charSequence6 = charSequence3;
                                        if (lowerCase.contains(charSequence6)) {
                                            charSequence3 = charSequence6;
                                            methodInfo.f37260x1a6a9fec.add(6);
                                            ((java.util.ArrayList) ((bd.f) entry.getValue()).f100739d).add(java.lang.Integer.valueOf(i27));
                                        } else {
                                            charSequence3 = charSequence6;
                                        }
                                    }
                                }
                            }
                            i27++;
                            i19++;
                            length = i17;
                            parameterTypes = clsArr;
                            str7 = str6;
                        }
                    }
                    str6 = str7;
                    i27++;
                    i19++;
                    length = i17;
                    parameterTypes = clsArr;
                    str7 = str6;
                }
                methodInfo.f37261xa6d0e929 = iVar.b((bd.f) entry.getValue());
                moduleInfo.f37262x38f44bb2.put((java.lang.String) entry.getKey(), methodInfo);
                iVar2 = iVar;
                moduleInfo2 = moduleInfo;
                it6 = it;
                arrayList2 = arrayList;
                gVar2 = gVar;
                it7 = it8;
            }
            java.lang.CharSequence charSequence7 = "bool";
            java.lang.CharSequence charSequence8 = "callback";
            java.lang.CharSequence charSequence9 = "byte";
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo moduleInfo3 = moduleInfo;
            bd.i iVar3 = iVar;
            java.util.Iterator it9 = ((java.util.HashMap) gVar.f100742b).entrySet().iterator();
            while (it9.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it9.next();
                java.util.Iterator it10 = it9;
                ((bd.f) entry2.getValue()).f100738c = new java.util.ArrayList();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.MethodInfo methodInfo2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.MethodInfo();
                methodInfo2.f37259xd4e87bbb = 1;
                methodInfo2.f37258xd4e5670c = (java.lang.String) entry2.getKey();
                if (((bd.f) entry2.getValue()).f100737b.booleanValue()) {
                    methodInfo2.f37257xe6f70bda = true;
                }
                java.lang.Class<?>[] parameterTypes2 = ((bd.f) entry2.getValue()).f100736a.getParameterTypes();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo moduleInfo4 = moduleInfo3;
                int length2 = parameterTypes2.length;
                bd.i iVar4 = iVar3;
                int i28 = 0;
                int i29 = 0;
                while (i28 < length2) {
                    int i37 = length2;
                    java.lang.String lowerCase2 = parameterTypes2[i28].getName().toLowerCase();
                    if (lowerCase2.contains(str3)) {
                        str4 = str3;
                        methodInfo2.f37260x1a6a9fec.add(4);
                    } else {
                        str4 = str3;
                        if (lowerCase2.contains("list")) {
                            methodInfo2.f37260x1a6a9fec.add(4);
                        } else if (lowerCase2.contains("map")) {
                            methodInfo2.f37260x1a6a9fec.add(4);
                        } else if (lowerCase2.contains("json")) {
                            methodInfo2.f37260x1a6a9fec.add(4);
                        } else if (lowerCase2.contains(str2)) {
                            methodInfo2.f37260x1a6a9fec.add(0);
                        } else if (lowerCase2.contains("int")) {
                            methodInfo2.f37260x1a6a9fec.add(0);
                        } else if (lowerCase2.contains("long")) {
                            methodInfo2.f37260x1a6a9fec.add(0);
                        } else if (lowerCase2.contains("float")) {
                            methodInfo2.f37260x1a6a9fec.add(0);
                        } else if (lowerCase2.contains("double")) {
                            methodInfo2.f37260x1a6a9fec.add(0);
                        } else {
                            charSequence = charSequence7;
                            if (lowerCase2.contains(charSequence)) {
                                str5 = str2;
                                methodInfo2.f37260x1a6a9fec.add(1);
                            } else {
                                str5 = str2;
                                if (lowerCase2.contains("char")) {
                                    methodInfo2.f37260x1a6a9fec.add(2);
                                } else {
                                    java.lang.CharSequence charSequence10 = charSequence9;
                                    if (lowerCase2.contains(charSequence10)) {
                                        charSequence9 = charSequence10;
                                        methodInfo2.f37260x1a6a9fec.add(5);
                                        ((java.util.ArrayList) ((bd.f) entry2.getValue()).f100738c).add(java.lang.Integer.valueOf(i29));
                                        charSequence2 = charSequence8;
                                    } else {
                                        charSequence9 = charSequence10;
                                        java.lang.CharSequence charSequence11 = charSequence8;
                                        if (lowerCase2.contains(charSequence11)) {
                                            charSequence2 = charSequence11;
                                            methodInfo2.f37260x1a6a9fec.add(6);
                                            ((java.util.ArrayList) ((bd.f) entry2.getValue()).f100739d).add(java.lang.Integer.valueOf(i29));
                                            i29++;
                                            i28++;
                                            charSequence7 = charSequence;
                                            str3 = str4;
                                            length2 = i37;
                                            str2 = str5;
                                            charSequence8 = charSequence2;
                                        } else {
                                            charSequence2 = charSequence11;
                                        }
                                    }
                                    i29++;
                                    i28++;
                                    charSequence7 = charSequence;
                                    str3 = str4;
                                    length2 = i37;
                                    str2 = str5;
                                    charSequence8 = charSequence2;
                                }
                            }
                            charSequence2 = charSequence8;
                            i29++;
                            i28++;
                            charSequence7 = charSequence;
                            str3 = str4;
                            length2 = i37;
                            str2 = str5;
                            charSequence8 = charSequence2;
                        }
                    }
                    str5 = str2;
                    charSequence = charSequence7;
                    charSequence2 = charSequence8;
                    i29++;
                    i28++;
                    charSequence7 = charSequence;
                    str3 = str4;
                    length2 = i37;
                    str2 = str5;
                    charSequence8 = charSequence2;
                }
                iVar3 = iVar4;
                methodInfo2.f37261xa6d0e929 = iVar3.b((bd.f) entry2.getValue());
                moduleInfo4.f37262x38f44bb2.put((java.lang.String) entry2.getKey(), methodInfo2);
                moduleInfo3 = moduleInfo4;
                it9 = it10;
                str3 = str3;
                str2 = str2;
                charSequence8 = charSequence8;
            }
            arrayList.add(moduleInfo3);
            arrayList2 = arrayList;
            iVar2 = iVar3;
            it6 = it;
            i18 = 0;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo[]) arrayList2.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ModuleInfo[i18]);
    }

    /* renamed from: getAllLiteAppInfo */
    public static java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441> m65295x26981e76() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            m65296x26981e76(arrayList);
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, e17.toString(), new java.lang.Object[0]);
        }
        return arrayList;
    }

    /* renamed from: getAllLiteAppInfo */
    public static native void m65296x26981e76(java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441> list);

    /* renamed from: getAppInfo */
    private static boolean m65297xe759639(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String[] mo65540xe759639;
        if (strArr == null || strArr.length != 2) {
            kd.c.b(TAG, "info invalid", new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback == null || (mo65540xe759639 = iWxaLiteAppCallback.mo65540xe759639(str)) == null || mo65540xe759639.length != strArr.length) {
            return false;
        }
        strArr[0] = mo65540xe759639[0];
        strArr[1] = mo65540xe759639[1];
        return true;
    }

    /* renamed from: getAppMemory */
    private static long m65298x4dc0b7cc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65541x4dc0b7cc();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return 0L;
    }

    /* renamed from: getAppRootPath */
    private static java.lang.String m65299xfc768c32() {
        if (!f37156xccad56bb.isEmpty()) {
            return f37156xccad56bb;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            java.lang.String mo65556x3b2f24df = iWxaLiteAppCallback.mo65556x3b2f24df();
            f37156xccad56bb = mo65556x3b2f24df;
            return mo65556x3b2f24df;
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = zc.c.f552872b;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
            throw null;
        }
        sb6.append(context.getFilesDir());
        sb6.append("/liteapp");
        return sb6.toString();
    }

    /* renamed from: getAuthInfo */
    public static native boolean m65300xd133dfec(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089 c3709x6860e089);

    /* renamed from: getAuthUrl */
    public static native java.lang.String m65301x1743ea71(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    /* renamed from: getBaseLibBuildTypeByPath */
    public static native java.lang.String m65302x51e01c66(java.lang.String str);

    /* renamed from: getBaseLibBuildTypeByString */
    public static native java.lang.String m65303x60740c12(java.lang.String str);

    /* renamed from: getBaseLibMajorVersion */
    public static native java.lang.String m65304x4e6e15bd();

    /* renamed from: getBaseLibMajorVersionByPath */
    public static native java.lang.String m65305xac32e139(java.lang.String str);

    /* renamed from: getBaseLibVersionByPath */
    public static native java.lang.String m65306xf20fbaf6(java.lang.String str);

    /* renamed from: getBaseLibVersionByString */
    public static native java.lang.String m65307xb33646a2(java.lang.String str);

    /* renamed from: getBaseLibVersionNumber */
    public static native int m65308x65eb523(java.lang.String str);

    /* renamed from: getBaselibInfo */
    public static native boolean m65309x9a0d3ac(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef);

    /* renamed from: getBatteryInfo */
    private static java.lang.String m65310x526aff25() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65542x526aff25();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getBuffer */
    public static native byte[] m65311x12f2b736(java.lang.String str, long j17, int i17, boolean z17);

    /* renamed from: getCacheKeyByUrl */
    public static native java.lang.String m65312x55c41065(java.lang.String str, long j17, long j18, java.lang.String str2);

    /* renamed from: getCheckVersionResult */
    public static native int m65313x5e26e8e3(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: getClientVersion */
    private static java.lang.String m65314xeb61b2d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65543xeb61b2d7();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getConfigInfo */
    public static native boolean m65315x1fcba306(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063 c3711x9fbaf063);

    /* renamed from: getCpu */
    private static float m65316xb5883272() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65545xb5883272();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return 0.0f;
    }

    /* renamed from: getCurrentContext */
    public static android.content.Context m65317xc88b72ec(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65544x76847179(j17);
        }
        return null;
    }

    /* renamed from: getDynamicLibraryPath */
    private static java.lang.String m65318x2d6383b7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65546x2d6383b7(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getDynamicModuleType */
    private static java.lang.String m65319x31de54af(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = ((java.util.ArrayList) bd.i.f100748e.a(str)).iterator();
        while (it.hasNext()) {
            bd.g gVar = (bd.g) it.next();
            if (gVar.f100744d.equals(str2)) {
                if (((java.util.HashMap) gVar.f100741a).containsKey(str3)) {
                    return "sync";
                }
                if (((java.util.HashMap) gVar.f100742b).containsKey(str3)) {
                    return "async";
                }
            }
        }
        return "";
    }

    /* renamed from: getFilePathByLocalId */
    private static java.lang.String m65320xf3f82618(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65547xf3f82618(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getGlobalStore */
    private static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s m65321xa70519c8(java.lang.String str) {
        java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s> cls;
        if (f37173x462003fa.containsKey(str)) {
            return f37173x462003fa.get(str);
        }
        if (!f37172x7debba74.containsKey(str) || (cls = f37172x7debba74.get(str)) == null) {
            return null;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s newInstance = cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (newInstance == null) {
                return null;
            }
            newInstance.f225701e = str;
            f37173x462003fa.put(str, newInstance);
            return newInstance;
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, "getGlobalStore fail :%s", e17.toString());
            return null;
        }
    }

    /* renamed from: getHandler */
    public static android.os.Handler m65322x67189314() {
        if (f37147x294b574a == null) {
            f37147x294b574a = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return f37147x294b574a;
    }

    /* renamed from: getImageInfo */
    private static void m65323xcb10cdf3(java.lang.String str, java.lang.String str2, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65549xcb10cdf3(str, str2, nativeCallback);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            nativeCallback.m65629x9ad64344("{}");
        }
    }

    /* renamed from: getInProcessAppIds */
    public static native java.util.HashSet<java.lang.String> m65324x2c27d8cb();

    /* renamed from: getJsApiContextForAppId */
    public static android.content.Context m65325xac4bbec7(java.lang.String str) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!f37162xc5c15d6b.containsKey(str) || (weakReference = f37162xc5c15d6b.get(str)) == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getKeepAliveInfo */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo m65326xf711960(java.lang.String str, int i17) {
        java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> concurrentLinkedQueue = f37154xf01a461d.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedQueue == null) {
            return null;
        }
        java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo next = it.next();
            if (next.key.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: getKeepAliveInfoCountLimit */
    private static int m65327x9977196c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65550x9977196c(i17);
        }
        return 1;
    }

    /* renamed from: getKeepAliveTimeSecondsLimit */
    private static int m65328x8ad7dd9b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.mo65551x8ad7dd9b(i17, i18) : i17;
    }

    /* renamed from: getLastPath */
    public static java.lang.String m65329x24db6d51() {
        return f37155xa9012fdb;
    }

    /* renamed from: getLatestBaselibInfo */
    public static native boolean m65330xdb9f0225(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef);

    /* renamed from: getLiteAppEngineModelConfig */
    private static java.lang.String m65331x685374c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65553x685374c();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getLiteAppInfo */
    private static com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 m65332x3b2b08ab(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65554x3b2b08ab(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return null;
    }

    /* renamed from: getLiteAppInfo */
    public static native boolean m65333x3b2b08ab(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441);

    /* renamed from: getLiteAppMinBaseLibMajorVersion */
    public static native java.lang.String m65334xc682c3fe(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: getLiteAppMinLiteAppBaseLib */
    public static native java.lang.String m65335xcd7491f6(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: getLiteAppModelConfig */
    private static java.lang.String m65336x3591fd2e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65555x3591fd2e(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getLiteAppReporter */
    public static com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65337x3e9425e(long j17) {
        return f37165x65a801c5.get(java.lang.Long.valueOf(j17));
    }

    /* renamed from: getLiteAppVersion */
    public static native java.lang.String m65338x15e79bbb(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: getLiteAppVersionType */
    public static native java.lang.String m65339x5d154995(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: getMulitExpt */
    private static boolean m65341xa54be3d0(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65560xa54be3d0(str, z17);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return z17;
    }

    /* renamed from: getNetworkInfo */
    private static void m65342x6625b2c6(final java.lang.String str, final long j17, final long j18, final long j19, final boolean z17) {
        if (f37158x1ab9c7d2 != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.4
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String str2;
                    java.lang.String mo65561x6625b2c6 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65561x6625b2c6();
                    if (mo65561x6625b2c6 != null) {
                        str2 = "[null, " + mo65561x6625b2c6 + "]";
                    } else {
                        str2 = "[null, {}]";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(str, j17, j18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37150xc1caf2cc, j19, str2, false, z17);
                }
            });
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            m65383xaee8e776(str, j17, j18, f37150xc1caf2cc, j19, "[new Error(\"callback is null\"), undefined]", false, z17);
        }
    }

    /* renamed from: getOfflineResource */
    private static java.lang.String m65343x97eb74db(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65562x97eb74db(str, str2, str3);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getOpenExtraData */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData m65344xa40298fa(long j17) {
        if (j17 <= 0 || !f37164x41b0e543.containsKey(java.lang.Long.valueOf(j17))) {
            return null;
        }
        return f37164x41b0e543.get(java.lang.Long.valueOf(j17));
    }

    /* renamed from: getOpenOption */
    private static java.lang.String m65345xfbfcf355(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65563xfbfcf355(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getPathByLiteAppLocalId */
    public static native java.lang.String m65346x5462dac5(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: getRecentForward */
    private static java.lang.String m65347xf485d434(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65565xf485d434(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getRecentForwardTitle */
    private static java.lang.String m65348x378bde84(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65566x378bde84(str);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getResourcePath */
    public static native java.lang.String[] m65349x4a0777c9(java.lang.String str, long j17, long j18, int[] iArr);

    /* renamed from: getSamplingConfigInfo */
    public static native boolean m65350x4860844d(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa c3713xdb8f24aa);

    /* renamed from: getScheduleWakeUpInfo */
    private static java.lang.String m65351xf749949a(java.lang.String str) {
        kd.c.c(TAG, "getScheduleWakeUpInfo appId: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.mo65568xf749949a(str) : "{}";
    }

    /* renamed from: getSdkMaxBaseLibVersionNumber */
    public static native int m65352xc0f53e8d();

    /* renamed from: getSdkMaxVersionNumber */
    public static native int m65353x55fe7861();

    /* renamed from: getSdkMinBaseLibVersion */
    public static native java.lang.String m65354xff556a92();

    /* renamed from: getSdkMinBaseLibVersionNumber */
    public static native int m65355x77297c7b();

    /* renamed from: getSdkVersion */
    public static native java.lang.String m65356x79455b34();

    /* renamed from: getSdkVersionNumber */
    public static native int m65357xd316eb9d();

    /* renamed from: getSystemInfo */
    private static java.lang.String m65358x148d5373(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback = f37166xc2dcd726.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            return lVUICallback.m65621x148d5373(-1).m65637x9d6b37f4();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65569x148d5373(-1).m65637x9d6b37f4();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getTaskState */
    private static java.lang.String m65359x98cbb56(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65570x98cbb56(str, j17, str2, str3, str4);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getTaskSwitch */
    private static java.lang.String m65360x2838990f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65571x2838990f();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getUICallback */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback = f37166xc2dcd726.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            return lVUICallback.f37224xf5bc2045;
        }
        kd.c.b(TAG, "getUICallback null, appUuid: %d", java.lang.Long.valueOf(j17));
        return null;
    }

    /* renamed from: getUin */
    private static java.lang.String m65362xb5887524() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65572xb5887524();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getUserAgent */
    private static java.lang.String m65363x11fd7f44() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65573x11fd7f44();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: getUserAlbums */
    private static java.lang.String m65364x2df79b85(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65574x2df79b85(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getVideoInfo */
    private static void m65365x4edba913(java.lang.String str, java.lang.String str2, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65575x4edba913(str, str2, nativeCallback);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
            nativeCallback.m65629x9ad64344("{}");
        }
    }

    /* renamed from: getViewportMetrics */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LiteAppViewportMetrics m65366x655b4b07(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65557x973c6520(context);
        }
        return null;
    }

    /* renamed from: getVolume */
    private static java.lang.String m65367x34c20a10() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65576x34c20a10();
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "{}";
    }

    /* renamed from: getWebviewLocalIdByPath */
    private static java.lang.String m65368x7985af9f(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65577x7985af9f(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return "";
    }

    /* renamed from: hasCutOut */
    private static boolean m65369xd48718e6(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            return m65361xd4eb96cf.mo28573xd48718e6();
        }
        return false;
    }

    /* renamed from: hasKeepAlive */
    public static boolean m65370x556ec2ce(java.lang.String str, boolean z17) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo>>> it = f37154xf01a461d.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> it6 = it.next().getValue().iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo next = it6.next();
                if (next != null && next.key.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: hideKeyboard */
    private static void m65371x3f895349(long j17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65322x67189314().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.5
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback.this.mo28574x3f895349();
                }
            });
        }
    }

    /* renamed from: initLib */
    public static boolean m65372x7420eb55() {
        boolean[] zArr = f37174x8180ab62;
        synchronized (zArr) {
            if (!zArr[0]) {
                try {
                    m65387xeb57c8f5("liteapphelper");
                    m65387xeb57c8f5("mmv8");
                    m65387xeb57c8f5("flutter");
                    m65387xeb57c8f5("wechatlv");
                    m65387xeb57c8f5("owl");
                    m65373x5e761c80();
                    m65482xa07c5d43();
                    zArr[0] = true;
                } catch (java.lang.UnsatisfiedLinkError e17) {
                    kd.c.b(TAG, "initLib fail. %s", e17.toString());
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: initWechatLv */
    public static native void m65373x5e761c80();

    /* renamed from: innerShowView */
    private static native void m65374x7373bfb8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, long j17, boolean z17, java.lang.String str8, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.Object obj, int i18, java.lang.String str9, java.lang.String str10);

    /* renamed from: insertOrReplaceAuthInfo */
    public static native boolean m65375x7f07b32e(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089 c3709x6860e089);

    /* renamed from: insertOrReplaceBaselibInfo */
    public static native boolean m65376x86f6212a(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef);

    /* renamed from: insertOrReplaceConfigInfo */
    public static native boolean m65377xa7f7adc8(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063 c3711x9fbaf063);

    /* renamed from: insertOrReplaceLiteAppInfo */
    public static native boolean m65378xb8805629(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441);

    /* renamed from: insertOrReplaceSamplingConfigInfo */
    public static native boolean m65379xecbead0f(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa c3713xdb8f24aa);

    /* renamed from: invokeJsApi */
    private static void m65380x3865da79(final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi) {
        kd.c.c(TAG, "invokeJsApi:%s", jsApi.m65619x9616526c());
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this;
                    java.lang.String str = jsApi2.f37208x58b7f1c;
                    if (str == null) {
                        kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "invalid api", new java.lang.Object[0]);
                        return;
                    }
                    if (jsApi2.f37213xbfc5d0e1 != null && jsApi2.f37215x658188d != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
                        jd.b bVar = null;
                        java.util.List<java.lang.String> mo65564xc2f1ecf8 = iWxaLiteAppCallback != null ? iWxaLiteAppCallback.mo65564xc2f1ecf8(str) : null;
                        if (mo65564xc2f1ecf8 != null && mo65564xc2f1ecf8.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37213xbfc5d0e1)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this;
                            long j17 = jsApi3.f37211x77352c40;
                            if (j17 > 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(jsApi3.f37208x58b7f1c, jsApi3.f37210xd0ade97c, jsApi3.f37214xc4a6040a, jsApi3.f37213xbfc5d0e1, j17, "{\"result\": false, \"errMsg\": \"permission api\", \"data\": {}}", false, jsApi3.f37212x868888b9);
                                return;
                            }
                            return;
                        }
                        java.lang.Class cls = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37170x85bca6c4.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37208x58b7f1c) ? (java.lang.Class) ((java.util.Map) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37170x85bca6c4.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37208x58b7f1c)).get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37213xbfc5d0e1) : null;
                        if (cls == null) {
                            cls = (java.lang.Class) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37171x4605277b.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37213xbfc5d0e1);
                        }
                        if (cls != null) {
                            bVar = (jd.b) cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37175xb2808b51.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37213xbfc5d0e1)) {
                            bVar = (jd.b) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37175xb2808b51.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37213xbfc5d0e1);
                        }
                        if (bVar == null) {
                            kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "not found api ", new java.lang.Object[0]);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi4 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this;
                            long j18 = jsApi4.f37211x77352c40;
                            if (j18 > 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(jsApi4.f37208x58b7f1c, jsApi4.f37210xd0ade97c, jsApi4.f37214xc4a6040a, jsApi4.f37213xbfc5d0e1, j18, "{\"result\": false, \"errMsg\":\"not found\" ,\"data\": {}}", false, jsApi4.f37212x868888b9);
                                return;
                            }
                            return;
                        }
                        int andIncrement = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37149x92ceec75.getAndIncrement();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi5 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this;
                        java.lang.String str2 = jsApi5.f37213xbfc5d0e1;
                        bVar.f380556d = str2;
                        jd.c cVar = new jd.c(jsApi5.f37210xd0ade97c, jsApi5.f37208x58b7f1c, jsApi5.f37214xc4a6040a, str2, jsApi5.f37211x77352c40, andIncrement, jsApi5.f37212x868888b9);
                        cVar.f380564h = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37169x33762036.get(java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37214xc4a6040a));
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) bVar).f224975e = cVar;
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37211x77352c40 > 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37144x164d47d.put(java.lang.Integer.valueOf(andIncrement), bVar);
                        }
                        bVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37208x58b7f1c, new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37215x658188d), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this.f37212x868888b9);
                        return;
                    }
                    kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "invalid api ", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this;
                    long j19 = jsApi6.f37211x77352c40;
                    if (j19 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(jsApi6.f37208x58b7f1c, jsApi6.f37210xd0ade97c, jsApi6.f37214xc4a6040a, jsApi6.f37213xbfc5d0e1, j19, "{\"result\": false, \"errMsg\": \"invalid api\", \"data\": {}}", false, jsApi6.f37212x868888b9);
                    }
                } catch (java.lang.Exception e17) {
                    kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "invokeJsApi :%s", e17.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi jsApi7 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.JsApi.this;
                    long j27 = jsApi7.f37211x77352c40;
                    if (j27 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65383xaee8e776(jsApi7.f37208x58b7f1c, jsApi7.f37210xd0ade97c, jsApi7.f37214xc4a6040a, jsApi7.f37213xbfc5d0e1, j27, "{\"result\": false, \"errMsg\":\"exception\", \"data\": {}}", false, jsApi7.f37212x868888b9);
                    }
                }
            }
        });
    }

    /* renamed from: isCurrentDarkMode */
    public static boolean m65381x1cd9fc48() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        return iWxaLiteAppCallback != null ? iWxaLiteAppCallback.mo65578x387a9983() : es.u.e();
    }

    /* renamed from: isJson */
    public static boolean m65382xb9a4c932(java.lang.String str) {
        if (str != null && str.length() != 0) {
            try {
                new org.json.JSONObject(str);
                return true;
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }

    /* renamed from: jsApiCallback */
    public static native void m65383xaee8e776(java.lang.String str, long j17, long j18, java.lang.String str2, long j19, java.lang.String str3, boolean z17, boolean z18);

    /* renamed from: keepAlive */
    public static boolean m65384x962be848(final java.lang.String str, int i17, long j17, java.lang.String str2, int i18, java.lang.Runnable runnable, final int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo m65326xf711960 = m65326xf711960(str, i19);
        kd.c.c(TAG, "keepAlive seconds=%d %s", java.lang.Integer.valueOf(i18), str);
        if (i18 == 0) {
            if (m65326xf711960 != null) {
                m65322x67189314().removeCallbacks(m65326xf711960.f37219x316fd31d);
                m65326xf711960.f37218xa4826844.run();
                kd.c.c(TAG, "Removing key:%s keepAliveInfo from group:%d", str, java.lang.Integer.valueOf(i19));
                m65454x53548af2(str, i19);
            }
            return false;
        }
        kd.c.c(TAG, "keepAlive start %s, timeout:%d appUuid:%d engineId:%d sessionId:%s", str, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str2);
        if (m65326xf711960 != null) {
            if (m65326xf711960.f37217x6c827afd == i17) {
                kd.c.b(TAG, "ignore keepAlive", new java.lang.Object[0]);
                return true;
            }
            kd.c.b(TAG, "release keepAlive because leak %s", str);
            m65322x67189314().removeCallbacks(m65326xf711960.f37219x316fd31d);
            m65326xf711960.f37218xa4826844.run();
            m65454x53548af2(str, i19);
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo keepAliveInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo();
        keepAliveInfo.key = str;
        keepAliveInfo.f37217x6c827afd = i17;
        keepAliveInfo.f37216xd0ade97c = j17;
        keepAliveInfo.f37220x243a3e51 = str2;
        keepAliveInfo.f37218xa4826844 = runnable;
        keepAliveInfo.f37219x316fd31d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo m65326xf7119602 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65326xf711960(str, i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo keepAliveInfo2 = keepAliveInfo;
                if (keepAliveInfo2 != m65326xf7119602) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(m65326xf7119602 == null ? 0 : 1);
                    kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "ignore release keepAlive %d", objArr);
                } else {
                    kd.c.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "release keepAlive because timeout %s", keepAliveInfo2.key);
                    keepAliveInfo.f37218xa4826844.run();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65454x53548af2(str, i19);
                }
            }
        };
        m65255x4e4de1f5(keepAliveInfo, i19);
        m65322x67189314().postDelayed(keepAliveInfo.f37219x316fd31d, m65328x8ad7dd9b(i18, i19) * 1000);
        return true;
    }

    /* renamed from: liteAppWidgetGetStartReport */
    public static com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 m65385xa9637197(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65558x893771e2(str);
        }
        return null;
    }

    /* renamed from: loadBaseLibByMajorVersion */
    private static boolean m65386x60ead0a4(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef mo65552x63cce245;
        java.lang.String m65334xc682c3fe = m65334xc682c3fe(str, str2, str3);
        if ((m65334xc682c3fe.isEmpty() || m65334xc682c3fe.equals(m65304x4e6e15bd())) && !f37155xa9012fdb.isEmpty()) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback == null || (mo65552x63cce245 = iWxaLiteAppCallback.mo65552x63cce245(m65334xc682c3fe)) == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo hostInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback2 = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback2 != null) {
            hostInfo = iWxaLiteAppCallback2.mo65548x69eaf7ec();
        }
        java.lang.String str4 = mo65552x63cce245.f14330x346425;
        f37155xa9012fdb = str4;
        return m65479x764e93a7(str4, hostInfo, f37137xa0346395) == 0;
    }

    /* renamed from: loadLibrary */
    private static void m65387xeb57c8f5(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.m65591xeb57c8f5(str);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/LiteAppCenter", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/lite/LiteAppCenter", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nativeCallback */
    public static native void m65388xdaecd7c(long j17, java.lang.Object obj);

    /* renamed from: navigateBack */
    public static void m65389xc55eddf8(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf == null) {
            kd.c.b(TAG, "navigateBack failed appUuid=" + j17, new java.lang.Object[0]);
        } else {
            kd.c.c(TAG, "navigateBack appUuid=" + j17, new java.lang.Object[0]);
            m65361xd4eb96cf.mo28577xc55eddf8(z17);
        }
    }

    /* renamed from: notifyLiteAppPkgUpdate */
    public static native void m65390xe3b961cb(java.lang.String str, java.lang.String str2);

    /* renamed from: onBackground */
    public static native void m65391x77b5b46d(java.lang.String str, long j17);

    /* renamed from: onBodySizeChange */
    private static void m65392x4e43b612(long j17, java.lang.String str, long j18, float f17, float f18) {
        kd.c.c(TAG, "onBodySizeChange appId: %s size=%f %f", str, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback = f37166xc2dcd726.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            lVUICallback.m65622x4e43b612(str, j17, j18, f17, f18);
        }
    }

    /* renamed from: onCheckBaseLibSumFail */
    private static void m65393x2635de3e(long j17, java.lang.String str, java.util.List<java.lang.String> list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28578x2635de3e(str, list);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65592x2635de3e(str, list);
        }
    }

    /* renamed from: onCheckLiteAppVersionError */
    private static void m65394xac5a411a(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo65530xac5a411a(i17);
        }
    }

    /* renamed from: onCheckSumFail */
    private static void m65395x2d9f160(long j17, java.lang.String str, java.util.List<java.lang.String> list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28579x2d9f160(str, list);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65593x2d9f160(str, list);
        }
    }

    /* renamed from: onClearCurrentHandOff */
    private static void m65396x9cccaa15(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65594x9cccaa15(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: onCreateLitePageViewFinish */
    private static void m65397x62158af0(final long j17, long j18, final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo, final long j19) {
        kd.c.c(TAG, "onCreateLitePageViewFinish appUuid: " + j17 + ", preloadAppUuid: " + j19, new java.lang.Object[0]);
        m65322x67189314().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.7
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37169x33762036.put(java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo.this.f37290xc4a6040a), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo.this);
                long unused = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37168xc4a6040a = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo.this.f37290xc4a6040a;
                long j27 = j19;
                if (j27 != 0 && j27 != j17 && (lVUICallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.get(java.lang.Long.valueOf(j27))) != null && lVUICallback.f37226xca75b57f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65507x21a416e2(j19, lVUICallback);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.get(java.lang.Long.valueOf(j17));
                if (lVUICallback2 != null) {
                    lVUICallback2.f37224xf5bc2045.mo28580x62158af0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo.this);
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo.this.f37289xca75b57f || lVUICallback2.m65620x75289f2b() == null) {
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s m65620x75289f2b = lVUICallback2.m65620x75289f2b();
                    java.util.HashMap hashMap = m65620x75289f2b.f225698b;
                    int size = hashMap.size();
                    java.lang.String[] strArr = new java.lang.String[size];
                    java.lang.String[] strArr2 = new java.lang.String[size];
                    int i17 = 0;
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        strArr[i17] = (java.lang.String) entry.getKey();
                        strArr2[i17] = (java.lang.String) entry.getValue();
                        i17++;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65500xb4182f0b(m65620x75289f2b.f225699c, m65620x75289f2b.f225701e, strArr, strArr2);
                }
            }
        });
    }

    /* renamed from: onDebugEventTriggered */
    private static void m65398x233b7bb1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.e eVar = f37160xd58f204b;
        if (eVar != null) {
            qa3.o oVar = (qa3.o) eVar;
            if (str != null) {
                oVar.d(str);
            } else {
                oVar.getClass();
            }
        }
    }

    /* renamed from: onForeground */
    public static native void m65399x3d65c882(java.lang.String str, long j17);

    /* renamed from: onInitJsRuntime */
    private static void m65400x5dcfd780(java.lang.String str, long j17, long j18, long j19, long j27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65595x5dcfd780(str, j17, j18, j19, j27);
        }
    }

    /* renamed from: onLayoutComplete */
    private static void m65401xbed76e42(java.lang.String str, long j17, long j18, float f17, float f18) {
        kd.c.c(TAG, "onLayoutComplete appId: %s size=%f %f", str, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback = f37166xc2dcd726.get(java.lang.Long.valueOf(j17));
        if (lVUICallback != null) {
            lVUICallback.m65623xbed76e42(str, j17, j18, f17, f18);
        }
    }

    /* renamed from: onNativeRecorderFrameData */
    public static native void m65402x18bbdb63(long j17, byte[] bArr, boolean z17);

    /* renamed from: onOpenCurrentPageOnPC */
    private static void m65403xb311f7d1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65597xb311f7d1(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: onPreReleaseLiteApp */
    private static void m65404xc39385f0(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65598xc39385f0(str, j17, str2, z17);
        }
    }

    /* renamed from: onPreloadLitePageViewFailed */
    private static void m65405x9b632c49(final java.lang.String str, final java.lang.String str2) {
        kd.c.b(TAG, "onPreloadLitePageViewFailed appId: " + str + ", page: " + str2, new java.lang.Object[0]);
        m65322x67189314().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.9
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
                if (iWxaLiteAppCallback != null) {
                    iWxaLiteAppCallback.mo65599x9b632c49(str, str2);
                }
            }
        });
    }

    /* renamed from: onPreloadLitePageViewFinish */
    private static void m65406x9bd6249f(final long j17, final java.lang.String str, final long j18) {
        kd.c.c(TAG, "onPreloadLitePageViewFinish appUuid: " + j17 + ", realAppUuid: " + j18, new java.lang.Object[0]);
        m65322x67189314().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.8
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
                if (iWxaLiteAppCallback != null) {
                    iWxaLiteAppCallback.mo65600x9bd6249f(j17, str, j18);
                }
                long j19 = j17;
                if (j19 == 0) {
                    return;
                }
                if (j18 != j19) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.containsKey(java.lang.Long.valueOf(j19))) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.get(java.lang.Long.valueOf(j17)).f37226xca75b57f) {
                            kd.c.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "remove appUuid: " + j17, new java.lang.Object[0]);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65492x30fe4db(j18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.get(java.lang.Long.valueOf(j17)));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.remove(java.lang.Long.valueOf(j17));
                        }
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.containsKey(java.lang.Long.valueOf(j18)) && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.get(java.lang.Long.valueOf(j18)).f37226xca75b57f) {
                        kd.c.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "remove realAppUuid: " + j18, new java.lang.Object[0]);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.remove(java.lang.Long.valueOf(j18));
                    }
                    j19 = j18;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726.get(java.lang.Long.valueOf(j19));
                if (lVUICallback != null) {
                    lVUICallback.m65624x9bd6249f(j17, str, j18);
                }
            }
        });
    }

    /* renamed from: onRecvDebugMsg */
    public static native void m65407x950b97b3(java.lang.String str);

    /* renamed from: onReleaseLiteApp */
    private static void m65408x6eefbc4b(java.lang.String str, long j17, int i17) {
    }

    /* renamed from: onSetCurrentHandOff */
    private static void m65409xf695baa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65601xf695baa(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: onShowPageTimeStamp */
    private static void m65410x97580b0b(long j17, long j18, long j19, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo) {
        kd.c.c(TAG, "onShowPageTimeStamp appUuid:%s, codeCacheSwitch:%s, codeCacheResult:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(pageShowInfo.f37297x681f1d29), java.lang.Integer.valueOf(pageShowInfo.f37296x65712e12));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28581x97580b0b(j19, pageShowInfo);
        }
    }

    /* renamed from: onShowStatusChange */
    private static void m65411xc060e1de(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65603xc060e1de(str, str2, j17, j18, z17);
        }
    }

    /* renamed from: onStoreDispatch */
    private static boolean m65412xc01b14dc(java.lang.String str, long j17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s m65620x75289f2b;
        if (str4 == null || str4.length() <= 0) {
            m65620x75289f2b = f37166xc2dcd726.containsKey(java.lang.Long.valueOf(j18)) ? f37166xc2dcd726.get(java.lang.Long.valueOf(j18)).m65620x75289f2b() : null;
        } else {
            m65620x75289f2b = m65321xa70519c8(str4);
            if (m65620x75289f2b != null) {
                m65620x75289f2b.f225699c = j18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = m65620x75289f2b;
        if (sVar == null || sVar.f225700d == null) {
            return false;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.q(sVar, j17, i17, str2, str3));
        return true;
    }

    /* renamed from: onStoreSendResult */
    private static void m65413x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65604x884ffda7(str, i17, str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s.a(str3));
        }
    }

    /* renamed from: onStoreSetData */
    private static void m65414x295aba8a(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (f37158x1ab9c7d2 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = strArr.length;
            if (length < strArr2.length) {
                length = strArr2.length;
            }
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(strArr[i17], com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s.a(strArr2[i17]));
            }
            f37158x1ab9c7d2.mo65605x295aba8a(str, hashMap);
        }
    }

    /* renamed from: onStoreSyncCall */
    private static java.lang.String m65415x1b6313fb(java.lang.String str, long j17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s m65620x75289f2b;
        java.lang.String str5;
        if (str4 == null || str4.length() <= 0) {
            m65620x75289f2b = f37166xc2dcd726.containsKey(java.lang.Long.valueOf(j18)) ? f37166xc2dcd726.get(java.lang.Long.valueOf(j18)).m65620x75289f2b() : null;
        } else {
            m65620x75289f2b = m65321xa70519c8(str4);
            if (m65620x75289f2b != null) {
                m65620x75289f2b.f225699c = j18;
            }
        }
        return (m65620x75289f2b == null || (str5 = (java.lang.String) m65620x75289f2b.f225698b.get(str3)) == null) ? "" : str5;
    }

    /* renamed from: onSystemInfoChange */
    public static native void m65416xa1d5fd8c(java.lang.String str);

    /* renamed from: onUpdateCurrentHandOff */
    private static void m65417x32cd686f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65607x32cd686f(str);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: openPage */
    private static void m65418xe1e9c7f9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65608xe1e9c7f9(str, str2, str3, str4);
        }
    }

    /* renamed from: postJsThreadTask */
    public static native void m65419x7c3b4198(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.RunnableTask runnableTask);

    /* renamed from: preloadView */
    public static native void m65420xd9c4f04e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, long j17);

    /* renamed from: preloadViewBaseLib */
    private static native void m65421x71cdb9c6(int i17, java.lang.String str);

    /* renamed from: prepareCppEngineId */
    public static native int m65422x34c50e39();

    /* renamed from: prepareTask */
    private static void m65423xb1c1db2c(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65609xb1c1db2c(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: publishEventToNode */
    public static native void m65424x740699c8(long j17, long j18, int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: publishEventToNode */
    public static void m65425x740699c8(long j17, long j18, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        m65424x740699c8(j17, j18, i17, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    /* renamed from: publishEventToTopPage */
    public static native void m65426x4a281bfe(long j17, int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: publishEventToTopPage */
    public static void m65427x4a281bfe(long j17, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        m65426x4a281bfe(j17, i17, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    /* renamed from: publishEventToTopPageForLiteAppWidget */
    public static void m65428xcc4d4c8c(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65582x2c375d87(i17, i18, str, map);
        }
    }

    /* renamed from: publishGlobalEvent */
    public static native void m65429x38afe828(long j17, long j18, java.lang.String str, java.lang.String str2);

    /* renamed from: publishGlobalEvent */
    public static void m65430x38afe828(long j17, long j18, java.lang.String str, org.json.JSONObject jSONObject) {
        m65429x38afe828(j17, j18, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    /* renamed from: publishGlobalEventForLiteAppWidget */
    public static void m65431x659b84b6(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65583xf0a63b3f(i17, i18, str, map);
        }
    }

    /* renamed from: publishGlobalEventToAll */
    public static native void m65432xa161dde(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: publishGlobalEventToAllByAppIdForLiteAppWidget */
    public static void m65433x5d05e3d5(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65585xfdf9cdde(str, str2, map);
        }
    }

    /* renamed from: publishGlobalEventToAllForLiteAppWidget */
    public static void m65434x2ebb8e6c(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65584xa55b2127(str, map);
        }
    }

    /* renamed from: publishGlobalEventToTopPage */
    public static native void m65435xa68b2341(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: publishGlobalEventToTopPage */
    public static void m65436xa68b2341(long j17, java.lang.String str, org.json.JSONObject jSONObject) {
        m65435xa68b2341(j17, str, jSONObject == null ? "{}" : jSONObject.toString());
    }

    /* renamed from: publishGlobalEventToTopPageForLiteAppWidget */
    public static void m65437xc4376dcf(int i17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65586x459b5a0a(i17, str, map);
        }
    }

    /* renamed from: queryPreloadAppInfo */
    public static native com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo m65438xe4663f0e(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: readPageConfig */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig m65439x6a0f1ce7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String m65235xf0b0f4a8 = m65235xf0b0f4a8(str, str2, str3, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig pageConfig = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig();
        if (m65235xf0b0f4a8 != null && !m65235xf0b0f4a8.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(m65235xf0b0f4a8);
                pageConfig.f37273x4cb7f6d5 = jSONObject.optInt("bgColor");
                pageConfig.f37275x16bc247f = jSONObject.optInt("darkBgColor");
                pageConfig.f37280x79d2915d = jSONObject.optInt("titleBgColor");
                pageConfig.f37276x3e7a5df3 = jSONObject.optInt("darkTitleBgColor");
                pageConfig.f37279xf2725bc1 = jSONObject.optInt("pageOrientation");
                pageConfig.f37281x4753f8a6 = jSONObject.optInt("viewport", 0);
                pageConfig.f37274x4d0b70cd = jSONObject.optJSONObject("bgImage");
                pageConfig.f37277x37ed3173 = jSONObject.optString("globalPkgAppId");
                pageConfig.f37278x6398da2f = jSONObject.optString("globalPkgMinVersion");
            } catch (org.json.JSONException unused) {
            }
        }
        return pageConfig;
    }

    /* renamed from: registerAudioBroadCaseReceiver */
    public static void m65440x9f16b22e(final android.content.Context context) {
        if (f37167xf303c2a9 != null) {
            return;
        }
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.10
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
                    int streamVolume = ((android.media.AudioManager) context.getSystemService("audio")).getStreamVolume(3);
                    if (java.lang.Math.abs(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37163x54a5959d - streamVolume) >= 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65518xccca9143(streamVolume / r4.getStreamMaxVolume(3));
                    }
                    int unused = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37163x54a5959d = streamVolume;
                }
            }
        };
        f37167xf303c2a9 = broadcastReceiver;
        try {
            context.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, e17.toString(), new java.lang.Object[0]);
        }
    }

    /* renamed from: registerModule */
    public static void m65441xd8c9faef(java.lang.String str, java.lang.Class<? extends bd.d> cls) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bd.i.f100748e.f100750b;
        if (concurrentHashMap.containsKey(str)) {
            kd.c.c("WxaLiteApp.WxaLiteAppModuleMgr", "module: %s has been registered", str);
        } else {
            concurrentHashMap.put(str, new bd.g(str, cls));
        }
    }

    /* renamed from: releaseKeepAlive */
    public static void m65444x856bf801(java.lang.String str, long j17) {
        kd.c.c(TAG, "releaseKeepAlive appId:%s, appUuid:%d", str, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo29032x856bf801();
        } else {
            m65443x856bf801(str);
        }
    }

    /* renamed from: releasePage */
    private static void m65446xcb5a336(long j17, long j18) {
        f37169x33762036.remove(java.lang.Long.valueOf(j18));
    }

    /* renamed from: releasePreloadView */
    public static native void m65447xf93ff5c7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17);

    /* renamed from: releaseStore */
    public static native void m65448x8a31cd1a(java.lang.String str);

    /* renamed from: releaseStoreForLiteAppWidget */
    public static void m65449x1f6945a8(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65587x41cdfd71(str);
        }
    }

    /* renamed from: reloadDebug */
    private static void m65450x213c3a(long j17, java.lang.String str, int i17, java.lang.String str2) {
        kd.c.c(TAG, "[liteDebug] reloadDebug, appId=" + str + ";appUuid=" + j17 + ";pageCount=" + i17 + "; qrcodeDebugQueryString=" + str2, new java.lang.Object[0]);
        for (int i18 = 0; i18 < i17; i18++) {
            m65389xc55eddf8(j17, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65610x213c3a(str, str2);
        }
    }

    /* renamed from: removeForwardUser */
    private static void m65451xdb37fd0c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65611xdb37fd0c(str);
        }
    }

    /* renamed from: removeGlobalStore */
    public static void m65452x45dbc7da(java.lang.String str) {
        f37172x7debba74.remove(str);
        f37173x462003fa.remove(str);
    }

    /* renamed from: removeJsApiContextForAppId */
    public static void m65453x7642c4f5(java.lang.String str) {
        f37162xc5c15d6b.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeKeepAliveInfo */
    public static void m65454x53548af2(java.lang.String str, int i17) {
        java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> concurrentLinkedQueue = f37154xf01a461d.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedQueue == null) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo next = it.next();
            if (next.key.equals(str)) {
                concurrentLinkedQueue.remove(next);
                break;
            }
        }
        if (concurrentLinkedQueue.isEmpty()) {
            f37154xf01a461d.remove(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: removeTask */
    private static void m65455x417ac029(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65612x417ac029(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: reopen */
    public static native void m65456xc84be2fd(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: reportIdKey */
    private static void m65457xf0101a70(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65613xf0101a70(j17, j18, j19);
        }
    }

    /* renamed from: reportKv */
    private static void m65458xe68be1bf(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65614xe68be1bf(i17, str);
        }
    }

    /* renamed from: setAuthInfo */
    public static native void m65459xcbec40f8(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, boolean z17);

    /* renamed from: setAutoSize */
    public static native void m65460xcc5360d2(long j17, boolean z17, boolean z18, boolean z19);

    /* renamed from: setBuffer */
    public static native int m65461x627eb42(java.lang.String str, long j17, byte[] bArr, boolean z17);

    /* renamed from: setCookie */
    public static native void m65462x78c6166(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    /* renamed from: setDarkMode */
    private static native void m65463xde5590bb(boolean z17);

    /* renamed from: setDebugCallback */
    public static void m65464xcab73a76(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.e eVar) {
        f37160xd58f204b = eVar;
    }

    /* renamed from: setDeveloperFlag */
    public static native void m65465xf5db8914(boolean z17);

    /* renamed from: setDisplayParams */
    public static native void m65466xde3207a6(long j17, float f17, float f18, float f19, float f27, int i17, float f28, float f29, float f37, float f38);

    /* renamed from: setDragToClose */
    private static void m65467x78a556a7(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo29035x78a556a7(z17);
        }
    }

    /* renamed from: setFlags */
    private static void m65468x52fbaf45(long j17, long j18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28586x52fbaf45(i17);
        }
    }

    /* renamed from: setFontScale */
    private static native void m65469xff4797f9(float f17);

    /* renamed from: setForbidRightGestureEnable */
    private static void m65470x5189f8a6(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28587x5189f8a6(z17);
        }
    }

    /* renamed from: setForceUseSyncCall */
    public static native void m65471x18a49ed7(boolean z17);

    /* renamed from: setIsHalfScreen */
    public static native void m65472xfe6fc4cb(long j17, boolean z17);

    /* renamed from: setJsApiContextForAppId */
    public static void m65473x269eedd3(android.content.Context context, java.lang.String str) {
        f37162xc5c15d6b.put(str, new java.lang.ref.WeakReference<>(context));
    }

    /* renamed from: setLocale */
    public static native void m65474x16e2655c(java.lang.String str, java.lang.String str2);

    /* renamed from: setOpenExtraData */
    public static void m65475x36d8ff6e(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData) {
        if (openExtraData == null) {
            kd.c.c(TAG, "romove mOpenExtraData uuid:%d", java.lang.Long.valueOf(j17));
            f37164x41b0e543.remove(java.lang.Long.valueOf(j17));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = openExtraData.f37265x66f18c8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = openExtraData.f37267x68af8e1;
        objArr[2] = sVar != null ? sVar.f225701e : "";
        objArr[3] = java.lang.Long.valueOf(sVar != null ? sVar.f225699c : -1L);
        kd.c.c(TAG, "setOpenExtraData uuid:%d query:%s store_appid:%s store_appuuid:%d", objArr);
        f37164x41b0e543.put(java.lang.Long.valueOf(j17), openExtraData);
    }

    /* renamed from: setOpenOption */
    private static void m65476x2a214161(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65615x2a214161(str, str2);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: setPageInfo */
    private static void m65477xa9c7fa5f(long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        f37169x33762036.put(java.lang.Long.valueOf(j18), pageInfo);
    }

    /* renamed from: setPageOrientation */
    private static void m65478xdaac6ff(long j17, long j18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28590xdaac6ff(i17);
        }
    }

    /* renamed from: setPath */
    public static native int m65479x764e93a7(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo hostInfo, java.lang.String str2);

    /* renamed from: setPath */
    public static void m65480x764e93a7(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = f37155xa9012fdb;
        if (str3 != null && str != null && str3.equals(str)) {
            kd.c.c(TAG, "baselib path has set, ignore! path: %s", str);
            return;
        }
        f37155xa9012fdb = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo hostInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            hostInfo = iWxaLiteAppCallback.mo65548x69eaf7ec();
        }
        m65479x764e93a7(str, hostInfo, str2);
    }

    /* renamed from: setPlatformInfo */
    public static void m65482xa07c5d43() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PlatformInfo platformInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PlatformInfo();
        platformInfo.f37308x12900dfa = m65363x11fd7f44();
        platformInfo.f37307xf60c1827 = m65299xfc768c32();
        platformInfo.f37305x2e01f68d = m65314xeb61b2d7();
        m65483xa07c5d43(platformInfo);
    }

    /* renamed from: setPlatformInfo */
    public static native void m65483xa07c5d43(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PlatformInfo platformInfo);

    /* renamed from: setPlatformUIAlreadyRelease */
    public static native void m65484x5539bd38(long j17);

    /* renamed from: setReporter */
    public static void m65485x5d1e8363(long j17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        if (abstractC3700xe41a2874 != null) {
            f37165x65a801c5.put(java.lang.Long.valueOf(j17), abstractC3700xe41a2874);
        }
    }

    /* renamed from: setSafeAreaInsets */
    public static native void m65486xf2dfa652(long j17, float f17, float f18, float f19, float f27, boolean z17);

    /* renamed from: setScheduleWakeUp */
    private static void m65487xc40ae9d8(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        kd.c.c(TAG, "setScheduleWakeUp appId: %s, interval: %d, repeat: %d, actionName: %s, actionPayload: %s, forceDispatch: %s, aliveDuration: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str3, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65616xc40ae9d8(str, i17, i18, str2, str3, z17, i19);
        }
    }

    /* renamed from: setStatusBarHidden */
    private static void m65488x1c40f709(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf != null) {
            m65361xd4eb96cf.mo28592x1c40f709(z17);
        }
    }

    /* renamed from: setSystemBarHeight */
    public static native void m65489x42927ce9(long j17, float f17, float f18, boolean z17);

    /* renamed from: setTestServiceConfig */
    public static native void m65490x94296a3(java.lang.String str);

    /* renamed from: setTestServiceEnable */
    public static native void m65491xc9838e4(boolean z17);

    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* renamed from: setUICallback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData m65492x30fe4db(long r8, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback r10) {
        /*
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$LVUICallback> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37166xc2dcd726
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.put(r1, r10)
            com.tencent.mm.plugin.lite.LiteAppCenter$ILiteAppUICallback r0 = r10.f37224xf5bc2045
            if (r0 == 0) goto La8
            long r0 = r0.mo28565xe67daffb()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37164x41b0e543
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            boolean r3 = r3.containsKey(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37164x41b0e543
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "WxaLiteApp.LiteAppCenter"
            java.lang.String r4 = "setUICallback dataUuid:%d containsKey:%b mOpenExtraData.size:%d"
            kd.c.c(r3, r4, r2)
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37164x41b0e543
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r4 = r4.getValue()
            com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData) r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Key: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = ", Value_query: "
            r6.append(r5)
            java.lang.String r4 = r4.f37265x66f18c8
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            kd.c.c(r3, r4, r5)
            goto L42
        L79:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto La8
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37164x41b0e543
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto La8
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37164x41b0e543
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData) r2
            com.tencent.mm.plugin.lite.s r3 = r2.f37267x68af8e1
            if (r3 == 0) goto L9e
            r10.m65627x53b6b99f(r3)
        L9e:
            java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37164x41b0e543
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.remove(r0)
            goto La9
        La8:
            r2 = 0
        La9:
            com.tencent.mm.plugin.lite.s r0 = r10.m65620x75289f2b()
            if (r0 == 0) goto Lb5
            com.tencent.mm.plugin.lite.s r0 = r10.m65620x75289f2b()
            r0.f225699c = r8
        Lb5:
            com.tencent.mm.plugin.lite.LiteAppCenter$IWxaLiteAppCallback r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2
            if (r0 == 0) goto Lbc
            r0.m65602x361ec93c(r8, r10)
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65492x30fe4db(long, com.tencent.mm.plugin.lite.LiteAppCenter$LVUICallback):com.tencent.mm.plugin.lite.LiteAppCenter$OpenExtraData");
    }

    /* renamed from: setWcWssLibPath */
    public static native void m65493x762c4ca1(java.lang.String str);

    /* renamed from: setWxaLiteAppCallback */
    public static void m65494x4587863a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback) {
        f37158x1ab9c7d2 = iWxaLiteAppCallback;
        kx5.n.h().f394856m = new kx5.l() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.2
            @Override // kx5.l
            /* renamed from: dataReporting */
            public void mo65523x7f55f5a4(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65274x7f55f5a4(str, str2, str3);
            }
        };
    }

    /* renamed from: showPage */
    private static void m65495xebcbeb2c(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = m65361xd4eb96cf(j17);
        if (m65361xd4eb96cf == null || (pageInfo = f37169x33762036.get(java.lang.Long.valueOf(j19))) == null) {
            return;
        }
        m65361xd4eb96cf.mo28593xebcbeb2c(pageInfo);
    }

    /* renamed from: showView */
    public static void m65496xebcec342(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, long j17, boolean z17, java.lang.String str8, java.lang.String[] strArr, java.lang.String[] strArr2, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, int i18, java.lang.String str9, java.lang.String str10) {
        m65374x7373bfb8(str, str2, str3, str4, str5, str6, str7, i17, j17, z17, str8, strArr, strArr2, abstractC3700xe41a2874, i18, str9, str10);
    }

    /* renamed from: storeIsAlive */
    public static native boolean m65497xb84155a2(java.lang.String str);

    /* renamed from: storeIsAliveForLiteAppWidget */
    public static boolean m65498x67a6be30(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65588x6fdd85f9(str);
        }
        return false;
    }

    /* renamed from: storeSendResult */
    public static native void m65499xdd68ad86(long j17, long j18, int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: storeSetData */
    public static native void m65500xb4182f0b(long j17, java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: subscribeStore */
    public static native int m65501x58c0e9b7(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: subscribeStoreForLiteAppWidget */
    public static void m65502xfc6d8845(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65589x9a12604e(str, list);
        }
    }

    /* renamed from: triggerLiteAppEvent */
    public static native void m65503xde82919f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2);

    /* renamed from: unRegisterAudioBroadCaseReceiver */
    public static void m65504xc3947b27(android.content.Context context) {
        android.content.BroadcastReceiver broadcastReceiver = f37167xf303c2a9;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
                f37167xf303c2a9 = null;
            } catch (java.lang.Exception e17) {
                kd.c.b(TAG, e17.toString(), new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: unSubscribeStore */
    public static native int m65505xd0f9c4b0(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: unsetReporter */
    public static void m65506xad558b2a(long j17) {
        if (f37165x65a801c5.containsKey(java.lang.Long.valueOf(j17))) {
            f37165x65a801c5.remove(java.lang.Long.valueOf(j17));
        }
    }

    /* renamed from: unsetUICallback */
    public static void m65507x21a416e2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback) {
        kd.c.c(TAG, "unsetUICallback appUuid: " + j17, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65606xcc8b6703(j17, lVUICallback);
        }
        if (f37166xc2dcd726.containsKey(java.lang.Long.valueOf(j17))) {
            m65484x5539bd38(j17);
            f37166xc2dcd726.remove(java.lang.Long.valueOf(j17));
        }
    }

    /* renamed from: unsubscribeStoreForLiteAppWidget */
    public static void m65508x3680c51e(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65590x3f812567(str, list);
        }
    }

    /* renamed from: updateDarkMode */
    public static void m65509x9ba0b622(boolean z17) {
        m65463xde5590bb(z17);
        m65416xa1d5fd8c("{\"darkMode\": " + java.lang.String.valueOf(z17) + "}");
    }

    /* renamed from: updateDeviceOrientation */
    public static void m65510x25dfd1(int i17) {
        m65416xa1d5fd8c("{\"orientation\": " + java.lang.String.valueOf(i17) + "}");
    }

    /* renamed from: updateDisplayParam */
    public static void m65511x2582e054(android.content.Context context, long j17) {
        android.graphics.Point b17 = es.u.b(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.Float valueOf = java.lang.Float.valueOf(displayMetrics.density);
        int e17 = md.n.e(context);
        int b18 = md.n.b(context, -1);
        float floatValue = 48 * valueOf.floatValue();
        m65466xde3207a6(j17, i17 / valueOf.floatValue(), i18 / valueOf.floatValue(), b17.x / valueOf.floatValue(), b17.y / valueOf.floatValue(), displayMetrics.densityDpi, valueOf.floatValue(), floatValue / valueOf.floatValue(), e17 / valueOf.floatValue(), b18 / valueOf.floatValue());
        kd.c.c(TAG, "updateLvCppDisplayParams appUuid=%d w=%d h=%d screen=%d,%d densityDpi=%d density=%f statusBarHeight:%d navigationBarHeight:%d actionBarHeight:%f", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), valueOf, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(b18), java.lang.Float.valueOf(floatValue));
    }

    /* renamed from: updateEngineConfig */
    public static native void m65512xdd4bd78d(java.lang.String str);

    /* renamed from: updateFontScale */
    public static void m65513xeb611f72(float f17) {
        m65469xff4797f9(f17);
        m65416xa1d5fd8c("{\"fontScale\": " + java.lang.String.format("%.5f", java.lang.Float.valueOf(f17)) + "}");
    }

    /* renamed from: updateLiteAppInfoLastUseTime */
    public static native boolean m65514x55a05906(java.lang.String str, long j17);

    /* renamed from: updateRotationLocked */
    public static void m65515x54698951(int i17) {
        m65416xa1d5fd8c("{\"rotationLocked\": " + java.lang.String.valueOf(i17 == 0) + "}");
    }

    /* renamed from: updateSize */
    public static native void m65516xee5c006a(long j17, float f17, float f18);

    /* renamed from: updateTask */
    private static void m65517xee5c55ee(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65618xee5c55ee(str, j17, str2, str3, str4);
        } else {
            kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        }
    }

    /* renamed from: updateVolume */
    public static void m65518xccca9143(float f17) {
        m65416xa1d5fd8c("{\"volume\": " + java.lang.String.format("%.4f", java.lang.Float.valueOf(f17)) + "}");
    }

    /* renamed from: useKeepAlive */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo m65519xd5848a81(java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo m65326xf711960 = m65326xf711960(str, i17);
        if (m65326xf711960 == null || !m65326xf711960.key.equals(str)) {
            return null;
        }
        if (!z17) {
            kd.c.c(TAG, "reuse keepAlive %s, appUuid:%d", str, java.lang.Long.valueOf(m65326xf711960.f37216xd0ade97c));
            m65322x67189314().removeCallbacks(m65326xf711960.f37219x316fd31d);
            m65454x53548af2(str, i17);
            return m65326xf711960;
        }
        kd.c.c(TAG, "release keepAlive because ignore %s", str);
        m65322x67189314().removeCallbacks(m65326xf711960.f37219x316fd31d);
        m65326xf711960.f37218xa4826844.run();
        m65454x53548af2(str, i17);
        return null;
    }

    /* renamed from: versionGreater */
    public static boolean m65520x18714402(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int min = java.lang.Math.min(split.length, split2.length);
        for (int i17 = 0; i17 < min; i17++) {
            if (!split[i17].equals(split2[i17])) {
                if (split[i17].length() > split2[i17].length()) {
                    return true;
                }
                return split[i17].length() >= split2[i17].length() && split[i17].compareTo(split2[i17]) > 0;
            }
        }
        return false;
    }

    /* renamed from: versionGreaterEqual */
    public static boolean m65521x97246452(java.lang.String str, java.lang.String str2) {
        return m65520x18714402(str, str2) || java.util.Objects.equals(str, str2);
    }

    /* renamed from: willPopApp */
    public static native void m65522x1128d882(java.lang.String str, long j17, boolean z17);

    /* renamed from: addGlobalStore */
    public static void m65247xf235039d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        sVar.f225701e = str;
        f37173x462003fa.put(str, sVar);
    }

    /* renamed from: checkAndGetLiteAppPath */
    public static void m65262xb98ad5b1(java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65537x438af18f(str, z17, z18, lVar);
        } else {
            lVar.mo146xb9724478("");
        }
    }

    /* renamed from: closeWindow */
    private static void m65270x10864c08(java.lang.String str, long j17, boolean z17) {
        m65269x10864c08(j17, new android.content.Intent());
    }

    /* renamed from: addJsApi */
    public static void m65254xb52dd7f0(java.util.Map<java.lang.String, java.lang.Class> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Class> entry : map.entrySet()) {
            if (jd.b.class.isAssignableFrom(entry.getValue())) {
                m65249xb52dd7f0(entry.getKey(), (java.lang.Class<? extends jd.b>) entry.getValue());
            } else {
                throw new java.lang.RuntimeException("api must be subclass of WxaLiteAppJsApi");
            }
        }
    }

    /* renamed from: getMulitExpt */
    private static java.lang.String m65340xa54be3d0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            return iWxaLiteAppCallback.mo65559xa54be3d0(str, str2);
        }
        kd.c.b(TAG, "mCallback is null", new java.lang.Object[0]);
        return str2;
    }

    /* renamed from: releaseKeepAlive */
    public static void m65445x856bf801(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String str4 = str + "_" + str2 + "_" + str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo m65326xf711960 = m65326xf711960(str4, i17);
        if (m65326xf711960 == null) {
            kd.c.e(TAG, "releaseKeepAlive get keepAliveInfo is null", new java.lang.Object[0]);
            return;
        }
        m65322x67189314().removeCallbacks(m65326xf711960.f37219x316fd31d);
        m65326xf711960.f37218xa4826844.run();
        m65454x53548af2(str4, i17);
    }

    /* renamed from: registerModule */
    public static void m65442xd8c9faef(java.lang.String str, java.lang.String str2, java.lang.Class<? extends bd.d> cls) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bd.i.f100748e.f100751c;
        java.util.Map map = (java.util.Map) concurrentHashMap.get(str);
        if (map == null) {
            map = new java.util.HashMap();
            concurrentHashMap.put(str, map);
        }
        if (map.containsKey(str2)) {
            kd.c.c("WxaLiteApp.WxaLiteAppModuleMgr", "module: %s has been registered", str2);
        } else {
            map.put(str2, new bd.g(str2, cls));
        }
    }

    /* renamed from: addJsApi */
    public static void m65250xb52dd7f0(java.lang.String str, java.lang.String str2, java.lang.Class<? extends jd.b> cls) {
        java.util.Map<java.lang.String, java.lang.Class<? extends jd.b>> map = f37170x85bca6c4.get(str);
        if (map == null) {
            map = new java.util.concurrent.ConcurrentHashMap<>();
            f37170x85bca6c4.put(str, map);
        }
        if (!map.containsKey(str2)) {
            map.put(str2, cls);
            return;
        }
        throw new java.lang.RuntimeException(str + ":" + str2 + " has been exists");
    }

    /* renamed from: setPath */
    public static void m65481x764e93a7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
        f37155xa9012fdb = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo hostInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.HostInfo();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            hostInfo = iWxaLiteAppCallback.mo65548x69eaf7ec();
        }
        hostInfo.f37205xe2292b69 = new java.util.HashMap();
        if (map != null && map.size() > 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                hostInfo.f37205xe2292b69.put(entry.getKey(), entry.getValue());
            }
        }
        m65479x764e93a7(str, hostInfo, str2);
    }

    /* renamed from: releaseKeepAlive */
    public static void m65443x856bf801(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Integer, java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo>> entry : f37154xf01a461d.entrySet()) {
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo> it = entry.getValue().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo next = it.next();
                if (next != null && next.key.startsWith(str)) {
                    arrayList.add(new java.util.AbstractMap.SimpleEntry(entry.getKey(), next));
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
            kd.c.c(TAG, "release keepAlive %s appId:%s", ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo) entry2.getValue()).key, str);
            m65322x67189314().removeCallbacks(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo) entry2.getValue()).f37219x316fd31d);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo) entry2.getValue()).f37218xa4826844.run();
            m65454x53548af2(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.KeepAliveInfo) entry2.getValue()).key, ((java.lang.Integer) entry2.getKey()).intValue());
        }
    }

    /* renamed from: addJsApi */
    public static void m65251xb52dd7f0(java.lang.String str, java.util.Map<java.lang.String, java.lang.Class> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Class> entry : map.entrySet()) {
            if (jd.b.class.isAssignableFrom(entry.getValue())) {
                m65250xb52dd7f0(str, entry.getKey(), entry.getValue());
            } else {
                throw new java.lang.RuntimeException(str + ":api must be subclass of WxaLiteAppJsApi");
            }
        }
    }

    /* renamed from: addJsApi */
    public static void m65252xb52dd7f0(java.lang.String str, jd.b bVar) {
        f37175xb2808b51.put(str, bVar);
    }

    /* renamed from: addJsApi */
    public static void m65253xb52dd7f0(java.util.HashMap<java.lang.String, jd.b> hashMap) {
        f37175xb2808b51.putAll(hashMap);
    }

    /* renamed from: com.tencent.mm.plugin.lite.LiteAppCenter$PageInfo */
    /* loaded from: classes15.dex */
    public static class PageInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo> f37282x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo>() { // from class: com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo[] newArray(int i17) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo[i17];
            }
        };

        /* renamed from: appId */
        public java.lang.String f37283x58b7f1c;

        /* renamed from: appPtr */
        public long f37284xabe4810d;

        /* renamed from: appUuid */
        public long f37285xd0ade97c;

        /* renamed from: basePath */
        public java.lang.String f37286x99620e96;

        /* renamed from: engineId */
        public int f37287x6c827afd;

        /* renamed from: flags */
        public int f37288x5cfee87;

        /* renamed from: isPreload */
        public boolean f37289xca75b57f;

        /* renamed from: pageId */
        public long f37290xc4a6040a;

        /* renamed from: pageOrientation */
        public int f37291xf2725bc1;

        /* renamed from: pageUrl */
        public java.lang.String f37292xd01aac60;

        /* renamed from: renderId */
        public long f37293xe2813d51;

        /* renamed from: sessionId */
        public java.lang.String f37294x243a3e51;

        /* renamed from: success */
        public int f37295x90b54003;

        public PageInfo(int i17, long j17, int i18, long j18, long j19, long j27, java.lang.String str, java.lang.String str2, int i19, int i27, java.lang.String str3, java.lang.String str4, boolean z17) {
            try {
                kd.c.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, "PageInfo success: %d, appUuid: %d, appPtr: %d, pageId: %d, renderId: %d, basePath: %s, pageUrl: %s, flags: %d, pageOrientation: %d, appId: %s, sessionId: %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, str4);
                this.f37295x90b54003 = i17;
                this.f37285xd0ade97c = j17;
                this.f37287x6c827afd = i18;
                this.f37284xabe4810d = j18;
                this.f37290xc4a6040a = j19;
                this.f37293xe2813d51 = j27;
                this.f37286x99620e96 = str;
                this.f37292xd01aac60 = str2;
                this.f37288x5cfee87 = i19;
                this.f37291xf2725bc1 = i27;
                this.f37283x58b7f1c = str3;
                this.f37294x243a3e51 = str4;
                this.f37289xca75b57f = z17;
            } catch (java.lang.Exception e17) {
                kd.c.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.TAG, e17.toString(), new java.lang.Object[0]);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m65636x9616526c() {
            return "PageInfo{success=" + this.f37295x90b54003 + ", uuid=" + this.f37285xd0ade97c + ", engineId=" + this.f37287x6c827afd + ", appPtr=" + this.f37284xabe4810d + ", pageId=" + this.f37290xc4a6040a + ", renderId=" + this.f37293xe2813d51 + ", basePath='" + this.f37286x99620e96 + "', pageUrl='" + this.f37292xd01aac60 + "', flags=" + this.f37288x5cfee87 + ", pageOrientation=" + this.f37291xf2725bc1 + ", appId=" + this.f37283x58b7f1c + ", sessionId=" + this.f37294x243a3e51 + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f37295x90b54003);
            parcel.writeLong(this.f37285xd0ade97c);
            parcel.writeInt(this.f37287x6c827afd);
            parcel.writeLong(this.f37284xabe4810d);
            parcel.writeLong(this.f37290xc4a6040a);
            parcel.writeLong(this.f37293xe2813d51);
            parcel.writeString(this.f37286x99620e96);
            parcel.writeString(this.f37292xd01aac60);
            parcel.writeInt(this.f37288x5cfee87);
            parcel.writeInt(this.f37291xf2725bc1);
            parcel.writeString(this.f37283x58b7f1c);
            parcel.writeString(this.f37294x243a3e51);
        }

        public PageInfo(android.os.Parcel parcel) {
            this.f37295x90b54003 = parcel.readInt();
            this.f37285xd0ade97c = parcel.readLong();
            this.f37287x6c827afd = parcel.readInt();
            this.f37284xabe4810d = parcel.readLong();
            this.f37290xc4a6040a = parcel.readLong();
            this.f37293xe2813d51 = parcel.readLong();
            this.f37286x99620e96 = parcel.readString();
            this.f37292xd01aac60 = parcel.readString();
            this.f37288x5cfee87 = parcel.readInt();
            this.f37291xf2725bc1 = parcel.readInt();
            this.f37283x58b7f1c = parcel.readString();
            this.f37294x243a3e51 = parcel.readString();
        }
    }
}
