package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.FlutterJNI */
/* loaded from: classes15.dex */
public class C28586x96e67e09 {
    private static final java.lang.String TAG = "FlutterJNI";

    /* renamed from: asyncWaitForVsyncDelegate */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AsyncWaitForVsyncDelegate f70859x8bd56e9e = null;

    /* renamed from: displayDensity */
    private static float f70860xbd5915c6 = -1.0f;

    /* renamed from: displayHeight */
    private static float f70861x80897c89 = -1.0f;

    /* renamed from: displayWidth */
    private static float f70862x5fd14e24 = -1.0f;

    /* renamed from: initCalled */
    private static boolean f70863xf313acad = false;

    /* renamed from: loadLibraryCalled */
    private static boolean f70864xc496d0d2 = false;

    /* renamed from: prefetchDefaultFontManagerCalled */
    private static boolean f70865xf9d18e51 = false;

    /* renamed from: refreshRateFPS */
    private static float f70866xda1d408e = 60.0f;

    /* renamed from: vmServiceUri */
    private static java.lang.String f70867x146408e;

    /* renamed from: accessibilityDelegate */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate f70868x7184d4f3;

    /* renamed from: deferredComponentManager */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f f70870xa57111ef;

    /* renamed from: isolateGroupName */
    private java.lang.String f70875x52cadd3f;

    /* renamed from: localizationPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c f70876x36f30b2c;

    /* renamed from: mUITaskRunnerJNI */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 f70877xe82c700f;

    /* renamed from: nativeShellHolderId */
    private java.lang.Long f70879x27ccab60;

    /* renamed from: platformMessageHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6 f70881x42601896;

    /* renamed from: platformViewsController */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 f70882x15cba3b7;

    /* renamed from: platformViewsController2 */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b f70883xa3a8d35b;

    /* renamed from: shellHolderLock */
    private java.util.concurrent.locks.ReentrantReadWriteLock f70885x76cf8f47 = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: operateSurfaceOnBackground */
    private boolean f70880x7aad0196 = true;

    /* renamed from: engineLifecycleListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener> f70871x778e2bd7 = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: flutterUiDisplayListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6> f70874xc61ee38d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: backgroundExecutor */
    private java.util.concurrent.Executor f70869x735fa421 = new io.p3284xd2ae381c.p3319x36f002.ExecutorC28968xd6131384();

    /* renamed from: flutterNextFrameDisplayListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28639xef994e18> f70872x998713b = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: flutterPreRenderFinishedListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3> f70873x6ecbb610 = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: preAttachTimingRecorder */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28600x2bf7fff0 f70884x722b2810 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28600x2bf7fff0();

    /* renamed from: mainLooper */
    private final android.os.Looper f70878xf7cbd6a = android.os.Looper.getMainLooper();

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$AccessibilityDelegate */
    /* loaded from: classes15.dex */
    public interface AccessibilityDelegate {
        /* renamed from: updateCustomAccessibilityActions */
        void mo137765xda104489(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr);

        /* renamed from: updateSemantics */
        void mo137766x104104a4(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$AppForegroundState */
    /* loaded from: classes11.dex */
    public enum AppForegroundState {
        UNKNOWN,
        BACKGROUND,
        FLOAT_WINDOW_FOREGROUND,
        FOREGROUND
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$AsyncWaitForVsyncDelegate */
    /* loaded from: classes14.dex */
    public interface AsyncWaitForVsyncDelegate {
        /* renamed from: asyncWaitForVsync */
        void mo137771x2f9a35f9(long j17);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$Factory */
    /* loaded from: classes11.dex */
    public static class Factory {
        /* renamed from: provideFlutterJNI */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137772xf9e7376a() {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09();
        }
    }

    /* renamed from: asyncWaitForVsync */
    private static void m137560x2f9a35f9(long j17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = f70859x8bd56e9e;
        if (asyncWaitForVsyncDelegate == null) {
            throw new java.lang.IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        asyncWaitForVsyncDelegate.mo137771x2f9a35f9(j17);
    }

    /* renamed from: decodeImage */
    public static android.graphics.Bitmap m137561x45e92c0d(java.nio.ByteBuffer byteBuffer, final long j17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                return android.graphics.ImageDecoder.decodeBitmap(android.graphics.ImageDecoder.createSource(byteBuffer), new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.FlutterJNI$$a
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137568x9596673d(j17, imageDecoder, imageInfo, source);
                    }
                });
            } catch (java.io.IOException e17) {
                io.p3284xd2ae381c.Log.e(TAG, "Failed to decode image", e17);
            }
        }
        return null;
    }

    /* renamed from: ensureAttachedToNative */
    private void m137562xed51e494() {
        if (this.f70879x27ccab60 == null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    /* renamed from: ensureNotAttachedToNative */
    private void m137563xb882c00b() {
        if (this.f70879x27ccab60 != null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    /* renamed from: ensureRunningOnMainThread */
    private void m137564x57aecaa3() {
        if (android.os.Looper.myLooper() == this.f70878xf7cbd6a) {
            return;
        }
        throw new java.lang.RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + java.lang.Thread.currentThread().getName());
    }

    /* renamed from: getVMServiceUri */
    public static java.lang.String m137565xc5a27ae4() {
        return f70867x146408e;
    }

    /* renamed from: getVulkanTestResult */
    public static int m137566x6c8b1a50() {
        return m137592xfd44d4b9();
    }

    /* renamed from: handlePlatformMessageResponse */
    private void m137567x4167792d(int i17, java.nio.ByteBuffer byteBuffer) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6 interfaceC28609x71a8c4b6 = this.f70881x42601896;
        if (interfaceC28609x71a8c4b6 != null) {
            interfaceC28609x71a8c4b6.mo137882x4167792d(i17, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$decodeImage$1 */
    public static /* synthetic */ void m137568x9596673d(long j17, android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        android.util.Size size = imageInfo.getSize();
        m137593x7818be96(j17, size.getWidth(), size.getHeight());
    }

    /* renamed from: nativeAfterInit */
    public static native void m137570x231e8ab5();

    /* renamed from: nativeAttach */
    private native long m137571x70797d3c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, long j17, java.lang.String str);

    /* renamed from: nativeAttachNotInMainThread */
    private native long m137572xa8d185bf(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, long j17, java.lang.String str);

    /* renamed from: nativeCanPreRender */
    private native boolean m137573xbbf2bde0(long j17);

    /* renamed from: nativeCheckLeak */
    private native void m137574xfe212e34(long j17);

    /* renamed from: nativeCleanupMessageData */
    private native void m137575x8e635f84(long j17);

    /* renamed from: nativeClearCurrentSurface */
    private native void m137576x4d350f0a(long j17);

    /* renamed from: nativeDeferredComponentInstallFailure */
    private native void m137577x9248e3d6(int i17, java.lang.String str, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeDestroy */
    public native void m137578x23caefe3(long j17);

    /* renamed from: nativeDispatchEmptyPlatformMessage */
    private native void m137579xbbee0a58(long j17, java.lang.String str, int i17);

    /* renamed from: nativeDispatchPlatformMessage */
    private native void m137580x22296623(long j17, java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, int i18);

    /* renamed from: nativeDispatchPointerDataPacket */
    private native void m137581xbbdc393e(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: nativeDispatchSemanticsAction */
    private native void m137582x61debe12(long j17, int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19);

    /* renamed from: nativeDumpGPUMemoryStatistics */
    private native void m137583x5ad15525(long j17, boolean z17);

    /* renamed from: nativeFlutterTextUtilsIsEmoji */
    private native boolean m137584x38501b3d(int i17);

    /* renamed from: nativeFlutterTextUtilsIsEmojiModifier */
    private native boolean m137585x537df534(int i17);

    /* renamed from: nativeFlutterTextUtilsIsEmojiModifierBase */
    private native boolean m137586xcc77b625(int i17);

    /* renamed from: nativeFlutterTextUtilsIsRegionalIndicator */
    private native boolean m137587xee9ceb27(int i17);

    /* renamed from: nativeFlutterTextUtilsIsVariationSelector */
    private native boolean m137588xe1b21789(int i17);

    /* renamed from: nativeGetBitmap */
    private native android.graphics.Bitmap m137589xf8b30dce(long j17);

    /* renamed from: nativeGetGPUMemoryUsageInBytes */
    private native long m137590x9acba453(long j17);

    /* renamed from: nativeGetIsSoftwareRenderingEnabled */
    private native boolean m137591x9aa4e945();

    /* renamed from: nativeGetVulkanTestResult */
    public static native int m137592xfd44d4b9();

    /* renamed from: nativeImageHeaderCallback */
    public static native void m137593x7818be96(long j17, int i17, int i18);

    /* renamed from: nativeInit */
    private static native void m137594xb90145c7(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, boolean z17);

    /* renamed from: nativeInitNotInMainThread */
    private static native void m137595xd0f435d4(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17);

    /* renamed from: nativeInstallNextFrameCallback */
    private native void m137596x7fa5bb7b(long j17);

    /* renamed from: nativeInvokePlatformMessageEmptyResponseCallback */
    private native void m137597x669ddf6e(long j17, int i17);

    /* renamed from: nativeInvokePlatformMessageResponseCallback */
    private native void m137598xfb07326b(long j17, int i17, java.nio.ByteBuffer byteBuffer, int i18);

    /* renamed from: nativeIsSurfaceControlEnabled */
    private native boolean m137599xfbdd5010(long j17);

    /* renamed from: nativeLoadDartDeferredLibrary */
    private native void m137600x92256180(long j17, int i17, java.lang.String[] strArr);

    @java.lang.Deprecated
    /* renamed from: nativeLookupCallbackInformation */
    public static native io.p3284xd2ae381c.p3320x373aa5.C28978xebc52e0b m137601xaa63bf76(long j17);

    /* renamed from: nativeMarkFlutterViewDraw */
    private native void m137602x554819a1(long j17);

    /* renamed from: nativeMarkTextureFrameAvailable */
    private native void m137603x1d1d64b3(long j17, long j18);

    /* renamed from: nativeNotifyLowMemoryWarning */
    private native void m137604xad3496c7(long j17);

    /* renamed from: nativeOnVsync */
    private native void m137605x7772155b(long j17, long j18, long j19);

    /* renamed from: nativePauseScheduleFrame */
    private native void m137606x8f8beb37(long j17);

    /* renamed from: nativePreCreateThreadMerger */
    private native void m137607xcb6ff92c(long j17, boolean z17);

    /* renamed from: nativePrefetchDefaultFontManager */
    private static native void m137608xefeebf2b(java.lang.String str);

    /* renamed from: nativeRecordStartupTiming */
    private native void m137609x59bd56bf(long j17, java.lang.String str);

    /* renamed from: nativeRecordStartupTimingWithDelta */
    private native void m137610xe6049693(long j17, java.lang.String str, long j18);

    /* renamed from: nativeRegisterImageTexture */
    private native void m137611x34e3d03a(long j17, long j18, java.lang.ref.WeakReference<io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer> weakReference, boolean z17);

    /* renamed from: nativeRegisterTexture */
    private native void m137612x934b67e1(long j17, long j18, java.lang.ref.WeakReference<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5> weakReference);

    /* renamed from: nativeReleaseGPUResource */
    private native void m137613x641222ca(long j17);

    /* renamed from: nativeRequestDrawLastFrame */
    private native void m137614xd631a3fb(long j17);

    /* renamed from: nativeRequestPreRender */
    private native void m137615x603f3e81(long j17, int i17, int i18);

    /* renamed from: nativeResumeScheduleFrame */
    private native void m137616xf94cc052(long j17);

    /* renamed from: nativeRunBundleAndSnapshotFromLibrary */
    private native void m137617xdee68e2c(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j18);

    /* renamed from: nativeScheduleFrame */
    private native void m137618x62c2a3f(long j17);

    /* renamed from: nativeSetAccessibilityFeatures */
    private native void m137619x1e91bfa0(long j17, int i17);

    /* renamed from: nativeSetLogHandler */
    private static native void m137620x70b5da91(long j17);

    /* renamed from: nativeSetSemanticsEnabled */
    private native void m137621x2bb649ff(long j17, boolean z17);

    /* renamed from: nativeSetViewportMetrics */
    private native void m137622x7792b8f2(long j17, float f17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int[] iArr, int[] iArr2, int[] iArr3, int i66);

    /* renamed from: nativeSpawn */
    private native io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137623x67b529a4(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, boolean z18, boolean z19, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSurfaceChanged */
    public native void m137624x7817893e(long j17, int i17, int i18);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSurfaceCreated */
    public native void m137625x895aa572(long j17, android.view.Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSurfaceDestroyed */
    public native void m137626xf0084223(long j17);

    /* renamed from: nativeSurfaceWindowChanged */
    private native void m137627x544967ae(long j17, android.view.Surface surface);

    /* renamed from: nativeSwapMemoryFile */
    private native void m137628x1ef8b807(long j17, java.lang.String str, boolean z17, boolean z18, boolean z19);

    /* renamed from: nativeUnregisterTexture */
    private native void m137629x42a11de8(long j17, long j18);

    /* renamed from: nativeUpdateAppForegroundState */
    private static native void m137630xa40d688d(int i17);

    /* renamed from: nativeUpdateDisplayMetrics */
    private native void m137631xbf0e4581(long j17);

    /* renamed from: nativeUpdateJavaAssetManager */
    private native void m137632x9f5ff5bf(long j17, android.content.res.AssetManager assetManager, java.lang.String str);

    /* renamed from: nativeUpdateRefreshRate */
    private native void m137633x3ee6f67b(float f17);

    /* renamed from: onPreEngineRestart */
    private void m137634x89b45f89() {
        java.util.Iterator it = new java.util.concurrent.CopyOnWriteArraySet(this.f70871x778e2bd7).iterator();
        while (it.hasNext()) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener) it.next()).mo9536x89b45f89();
        }
    }

    /* renamed from: setLogHandler */
    public static void m137635xcd29dd68(long j17) {
        m137620x70b5da91(j17);
    }

    /* renamed from: transferPreAttachTimingToNative */
    private void m137636xab562959() {
        if (this.f70884x722b2810.m137822x3439113c()) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Long> m137821xef7e5533 = this.f70884x722b2810.m137821xef7e5533();
        if (m137821xef7e5533.isEmpty()) {
            this.f70884x722b2810.m137817x6875920f();
            return;
        }
        long nanoTime = java.lang.System.nanoTime();
        m137609x59bd56bf(this.f70879x27ccab60.longValue(), "java_timing_reference_point");
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : m137821xef7e5533.entrySet()) {
            m137610xe6049693(this.f70879x27ccab60.longValue(), entry.getKey(), entry.getValue().longValue() - nanoTime);
        }
        this.f70884x722b2810.m137817x6875920f();
    }

    /* renamed from: updateAppForegroundState */
    public static void m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState appForegroundState) {
        m137630xa40d688d(appForegroundState.ordinal());
    }

    /* renamed from: updateCustomAccessibilityActions */
    private void m137638xda104489(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate accessibilityDelegate = this.f70868x7184d4f3;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.mo137765xda104489(byteBuffer, strArr);
        }
    }

    /* renamed from: updateSemantics */
    private void m137639x104104a4(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate accessibilityDelegate = this.f70868x7184d4f3;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.mo137766x104104a4(byteBuffer, strArr, byteBufferArr);
        }
    }

    /* renamed from: IsSurfaceControlEnabled */
    public boolean m137640xe695ca07() {
        return m137599xfbdd5010(this.f70879x27ccab60.longValue());
    }

    /* renamed from: addDisplayNextFrameListener */
    public void m137641xe19dea2d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28639xef994e18 interfaceC28639xef994e18) {
        if (this.f70879x27ccab60 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "addDisplayNextFrameListener error nativeShellHolderId is null");
            return;
        }
        m137564x57aecaa3();
        this.f70872x998713b.add(interfaceC28639xef994e18);
        m137596x7fa5bb7b(this.f70879x27ccab60.longValue());
    }

    /* renamed from: addEngineLifecycleListener */
    public void m137642x4aac123b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener engineLifecycleListener) {
        m137564x57aecaa3();
        this.f70871x778e2bd7.add(engineLifecycleListener);
    }

    /* renamed from: addEngineLifecycleListenerNotInMainThread */
    public void m137643xe8f072e0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener engineLifecycleListener) {
        synchronized (this.f70871x778e2bd7) {
            this.f70871x778e2bd7.add(engineLifecycleListener);
        }
    }

    /* renamed from: addIsDisplayingFlutterUiListener */
    public void m137644x9a2d27f9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        m137564x57aecaa3();
        this.f70874xc61ee38d.add(interfaceC28647x231975c6);
    }

    /* renamed from: addIsDisplayingFlutterUiListenerNotInMainThread */
    public void m137645xe8c56962(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        synchronized (this.f70874xc61ee38d) {
            this.f70874xc61ee38d.add(interfaceC28647x231975c6);
        }
    }

    /* renamed from: addPreRenderFinishedListener */
    public void m137646x8b0591de(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3 interfaceC28640xd440a6e3) {
        if (this.f70879x27ccab60 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "addPreRenderFinishedListener error nativeShellHolderId is null");
        } else {
            m137564x57aecaa3();
            this.f70873x6ecbb610.add(interfaceC28640xd440a6e3);
        }
    }

    /* renamed from: afterInitNotInMainThread */
    public void m137647xaa4b57ef() {
        m137570x231e8ab5();
    }

    /* renamed from: applyTransactions */
    public void m137648x13f0abe3() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("");
        }
        c28730x2376f77b.m138778x13f0abe3();
    }

    /* renamed from: attachNotInMainThread */
    public void m137649x5f9cc196() {
        m137563xb882c00b();
        this.f70885x76cf8f47.writeLock().lock();
        try {
            this.f70879x27ccab60 = java.lang.Long.valueOf(m137713x1660f19e(this));
            m137636xab562959();
        } finally {
            this.f70885x76cf8f47.writeLock().unlock();
        }
    }

    /* renamed from: attachToNative */
    public void m137650xd4207fd7() {
        m137564x57aecaa3();
        m137563xb882c00b();
        this.f70885x76cf8f47.writeLock().lock();
        try {
            this.f70879x27ccab60 = java.lang.Long.valueOf(m137712xe6d1af3d(this));
            m137636xab562959();
        } finally {
            this.f70885x76cf8f47.writeLock().unlock();
        }
    }

    /* renamed from: attachUITaskRunner */
    public void m137651x3aa8758e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 c28602x9ef83230) {
        this.f70877xe82c700f = c28602x9ef83230;
    }

    /* renamed from: canPreRender */
    public boolean m137652x64178429() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            return false;
        }
        return m137573xbbf2bde0(l17.longValue());
    }

    /* renamed from: checkLeak */
    public void m137653x17be348b() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "checkLeak error nativeShellHolderId is null");
        } else {
            m137574xfe212e34(l17.longValue());
        }
    }

    /* renamed from: cleanupMessageData */
    public void m137654xb3028b0d(long j17) {
        m137575x8e635f84(j17);
    }

    /* renamed from: clearCurrentRenderSurface */
    public void m137655xdbe50f2b() {
        if (this.f70879x27ccab60 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "clearCurrentRenderSurface error nativeShellHolderId is null");
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "clearCurrentRenderSurface");
        m137564x57aecaa3();
        m137562xed51e494();
        long longValue = this.f70879x27ccab60.longValue();
        io.p3284xd2ae381c.Log.i(TAG, "clearCurrentRenderSurface start: " + longValue);
        m137576x4d350f0a(longValue);
        io.p3284xd2ae381c.Log.i(TAG, "clearCurrentRenderSurface end: " + longValue);
    }

    /* renamed from: clearDisplayNextFrameListener */
    public void m137656x8e0ee3d9() {
        m137564x57aecaa3();
        this.f70872x998713b.clear();
    }

    /* renamed from: clearPreRenderFinishedListeners */
    public void m137657x29c5e901() {
        m137564x57aecaa3();
        this.f70873x6ecbb610.clear();
    }

    /* renamed from: computePlatformResolvedLocale */
    public java.lang.String[] m137658xd774ecdc(java.lang.String[] strArr) {
        if (this.f70876x36f30b2c == null) {
            return new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < strArr.length; i17 += 3) {
            java.lang.String str = strArr[i17 + 0];
            java.lang.String str2 = strArr[i17 + 1];
            java.lang.String str3 = strArr[i17 + 2];
            java.util.Locale.Builder builder = new java.util.Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        java.util.Locale m138570xd934f15d = this.f70876x36f30b2c.m138570xd934f15d(arrayList);
        return m138570xd934f15d == null ? new java.lang.String[0] : new java.lang.String[]{m138570xd934f15d.getLanguage(), m138570xd934f15d.getCountry(), m138570xd934f15d.getScript()};
    }

    /* renamed from: createOverlaySurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959 m137659x36e8ca59() {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = this.f70882x15cba3b7;
        if (c28724xcf987b97 != null) {
            return c28724xcf987b97.mo138629x36e8ca59();
        }
        throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    /* renamed from: createOverlaySurface2 */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959 m137660xa63080f9() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b != null) {
            return c28730x2376f77b.m138784x36e8ca59();
        }
        throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    /* renamed from: createTransaction */
    public android.view.SurfaceControl.Transaction m137661xacbfa442() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b != null) {
            return c28730x2376f77b.m138785xacbfa442();
        }
        throw new java.lang.RuntimeException("");
    }

    /* renamed from: deferredComponentInstallFailure */
    public void m137662x48987eed(int i17, java.lang.String str, boolean z17) {
        m137564x57aecaa3();
        m137577x9248e3d6(i17, str, z17);
    }

    /* renamed from: destroyOverlaySurface2 */
    public void m137663x5a00e63b() {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c28730x2376f77b.m138786x3cb5b4d7();
    }

    /* renamed from: destroyOverlaySurfaces */
    public void m137664x5a00e67c() {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = this.f70882x15cba3b7;
        if (c28724xcf987b97 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c28724xcf987b97.mo138632x5a00e67c();
    }

    /* renamed from: detachFromNativeAndReleaseResources */
    public void m137665xab1e58e1() {
        io.p3284xd2ae381c.Log.i(TAG, "detachFromNativeAndReleaseResources " + this.f70879x27ccab60);
        m137564x57aecaa3();
        m137562xed51e494();
        final java.lang.Long l17 = this.f70879x27ccab60;
        this.f70885x76cf8f47.writeLock().lock();
        try {
            this.f70879x27ccab60 = null;
            this.f70885x76cf8f47.writeLock().unlock();
            io.p3284xd2ae381c.Log.i(TAG, "detachFromNativeAndReleaseResources lock end");
            this.f70869x735fa421.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.1
                @Override // java.lang.Runnable
                public void run() {
                    io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeDestroy started");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.this.m137578x23caefe3(l17.longValue());
                    io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeDestroy completed: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            });
        } catch (java.lang.Throwable th6) {
            this.f70885x76cf8f47.writeLock().unlock();
            io.p3284xd2ae381c.Log.i(TAG, "detachFromNativeAndReleaseResources lock end");
            throw th6;
        }
    }

    /* renamed from: detachFromNativeAndReleaseResourcesNotInMainThread */
    public void m137666x7d7f4b7a() {
        io.p3284xd2ae381c.Log.i(TAG, "detachFromNativeAndReleaseResourcesNotInMainThread " + this.f70879x27ccab60);
        m137562xed51e494();
        java.lang.Long l17 = this.f70879x27ccab60;
        this.f70885x76cf8f47.writeLock().lock();
        try {
            this.f70879x27ccab60 = null;
            this.f70885x76cf8f47.writeLock().unlock();
            io.p3284xd2ae381c.Log.i(TAG, "nativeDestroy started");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            m137578x23caefe3(l17.longValue());
            io.p3284xd2ae381c.Log.i(TAG, "nativeDestroy completed: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            this.f70885x76cf8f47.writeLock().unlock();
            throw th6;
        }
    }

    /* renamed from: dispatchEmptyPlatformMessage */
    public void m137667xfe371ea1(java.lang.String str, int i17) {
        m137564x57aecaa3();
        if (m137686xf0d424ee()) {
            m137579xbbee0a58(this.f70879x27ccab60.longValue(), str, i17);
            return;
        }
        io.p3284xd2ae381c.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i17);
    }

    /* renamed from: dispatchPlatformMessage */
    public void m137668x5315083a(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        m137564x57aecaa3();
        if (m137686xf0d424ee()) {
            m137580x22296623(this.f70879x27ccab60.longValue(), str, byteBuffer, i17, i18);
            return;
        }
        io.p3284xd2ae381c.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i18);
    }

    /* renamed from: dispatchPointerDataPacket */
    public void m137669x6067b195(java.nio.ByteBuffer byteBuffer, int i17) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137581xbbdc393e(this.f70879x27ccab60.longValue(), byteBuffer, i17);
    }

    /* renamed from: dispatchSemanticsAction */
    public void m137671x92ca6029(int i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action) {
        m137672x92ca6029(i17, action, null);
    }

    /* renamed from: dumpGPUMemoryStatistics */
    public void m137673x8bbcf73c(boolean z17) {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "dumpGPUMemoryStatistics error nativeShellHolderId is null");
        } else {
            m137583x5ad15525(l17.longValue(), z17);
        }
    }

    /* renamed from: endFrame2 */
    public void m137674x4997a920() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("");
        }
        c28730x2376f77b.m138796xa92a451();
    }

    /* renamed from: endStartupTimingDuration */
    public void m137675xc56895c0(java.lang.String str) {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            this.f70884x722b2810.m137818x2da32f8f(str);
            return;
        }
        m137609x59bd56bf(l17.longValue(), str + "_end");
    }

    /* renamed from: getBitmap */
    public android.graphics.Bitmap m137676x12501425() {
        m137564x57aecaa3();
        m137562xed51e494();
        return m137589xf8b30dce(this.f70879x27ccab60.longValue());
    }

    /* renamed from: getGPUMemoryUsageInBytes */
    public long m137677x8754451c() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 != null) {
            return m137590x9acba453(l17.longValue());
        }
        io.p3284xd2ae381c.Log.e(TAG, "getGPUMemoryUsageInBytes error nativeShellHolderId is null");
        return 0L;
    }

    /* renamed from: getIsSoftwareRenderingEnabled */
    public boolean m137678xa17e5e1c() {
        return m137591x9aa4e945();
    }

    /* renamed from: getScaledFontSize */
    public float m137679xc209f860(float f17, int i17) {
        android.util.DisplayMetrics m138329xd8b4c49 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.m138329xd8b4c49(i17);
        if (m138329xd8b4c49 != null) {
            return android.util.TypedValue.applyDimension(2, f17, m138329xd8b4c49) / m138329xd8b4c49.density;
        }
        io.p3284xd2ae381c.Log.e(TAG, "getScaledFontSize called with configurationId " + java.lang.String.valueOf(i17) + ", which can't be found.");
        return -1.0f;
    }

    /* renamed from: handlePlatformMessage */
    public void m137680x67998ccc(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, long j17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6 interfaceC28609x71a8c4b6 = this.f70881x42601896;
        if (interfaceC28609x71a8c4b6 != null) {
            interfaceC28609x71a8c4b6.mo137881xbade3828(str, byteBuffer, i17, j17);
        } else {
            m137575x8e635f84(j17);
        }
    }

    /* renamed from: hideOverlaySurface2 */
    public void m137681x23e86ff3() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c28730x2376f77b.m138792xc75a141f();
    }

    /* renamed from: init */
    public void m137682x316510(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        if (f70863xf313acad) {
            io.p3284xd2ae381c.Log.w(TAG, "FlutterJNI.init called more than once");
        }
        m137594xb90145c7(context, strArr, str, str2, str3, j17, i17, true);
        f70863xf313acad = true;
    }

    /* renamed from: initNotInMainThread */
    public void m137683x403a7b6b(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        if (f70863xf313acad) {
            io.p3284xd2ae381c.Log.w(TAG, "FlutterJNI.init called more than once");
        }
        m137595xd0f435d4(context, strArr, str, str2, str3, j17, i17);
        f70863xf313acad = true;
    }

    /* renamed from: invokePlatformMessageEmptyResponseCallback */
    public void m137684x39053ff7(int i17) {
        this.f70885x76cf8f47.readLock().lock();
        try {
            if (m137686xf0d424ee()) {
                m137597x669ddf6e(this.f70879x27ccab60.longValue(), i17);
            } else {
                io.p3284xd2ae381c.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i17);
            }
        } finally {
            this.f70885x76cf8f47.readLock().unlock();
        }
    }

    /* renamed from: invokePlatformMessageResponseCallback */
    public void m137685xa0a5e042(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.f70885x76cf8f47.readLock().lock();
        try {
            if (m137686xf0d424ee()) {
                m137598xfb07326b(this.f70879x27ccab60.longValue(), i17, byteBuffer, i18);
            } else {
                io.p3284xd2ae381c.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i17);
            }
        } finally {
            this.f70885x76cf8f47.readLock().unlock();
        }
    }

    /* renamed from: isAttached */
    public boolean m137686xf0d424ee() {
        return this.f70879x27ccab60 != null;
    }

    /* renamed from: isCodePointEmoji */
    public boolean m137687xeab9822d(int i17) {
        return m137584x38501b3d(i17);
    }

    /* renamed from: isCodePointEmojiModifier */
    public boolean m137688xd1496c24(int i17) {
        return m137585x537df534(i17);
    }

    /* renamed from: isCodePointEmojiModifierBase */
    public boolean m137689xf8ce3515(int i17) {
        return m137586xcc77b625(i17);
    }

    /* renamed from: isCodePointRegionalIndicator */
    public boolean m137690x1af36a17(int i17) {
        return m137587xee9ceb27(i17);
    }

    /* renamed from: isCodePointVariantSelector */
    public boolean m137691xd5c220ab(int i17) {
        return m137588xe1b21789(i17);
    }

    /* renamed from: loadDartDeferredLibrary */
    public void m137692xc3110397(int i17, java.lang.String[] strArr) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137600x92256180(this.f70879x27ccab60.longValue(), i17, strArr);
    }

    /* renamed from: loadLibrary */
    public void m137693xeb57c8f5(android.content.Context context) {
        if (f70864xc496d0d2) {
            io.p3284xd2ae381c.Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28588x70a56539 c28588x70a56539 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28588x70a56539();
        c8.h hVar = new c8.h();
        hVar.f121177d = c28588x70a56539;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Given context is null");
        }
        hVar.c("Beginning load of %s...", "flutter");
        hVar.b(context, "flutter", null);
        f70864xc496d0d2 = true;
    }

    /* renamed from: markFlutterViewDraw */
    public void m137694xc48e5f38() {
        m137602x554819a1(this.f70879x27ccab60.longValue());
    }

    /* renamed from: markTextureFrameAvailable */
    public void m137695xc1a8dd0a(long j17) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137603x1d1d64b3(this.f70879x27ccab60.longValue(), j17);
    }

    /* renamed from: notifyLowMemoryWarning */
    public void m137696xcfd0d5d0() {
        m137564x57aecaa3();
        m137562xed51e494();
        m137604xad3496c7(this.f70879x27ccab60.longValue());
    }

    /* renamed from: onBeginFrame */
    public void m137697x806a183() {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = this.f70882x15cba3b7;
        if (c28724xcf987b97 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        c28724xcf987b97.mo138643x806a183();
    }

    /* renamed from: onDisplayOverlaySurface */
    public void m137698xf4d92300(int i17, int i18, int i19, int i27, int i28) {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = this.f70882x15cba3b7;
        if (c28724xcf987b97 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        c28724xcf987b97.mo138645xf4d92300(i17, i18, i19, i27, i28);
    }

    /* renamed from: onDisplayPlatformView */
    public void m137699x77ae573b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db c28622x9672b4db) {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = this.f70882x15cba3b7;
        if (c28724xcf987b97 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c28724xcf987b97.mo138646x77ae573b(i17, i18, i19, i27, i28, i29, i37, c28622x9672b4db);
    }

    /* renamed from: onDisplayPlatformView2 */
    public void m137700x7e1c9057(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db c28622x9672b4db) {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c28730x2376f77b.m138795x77ae573b(i17, i18, i19, i27, i28, i29, i37, c28622x9672b4db);
    }

    /* renamed from: onEndFrame */
    public void m137701xa92a451() {
        m137564x57aecaa3();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = this.f70882x15cba3b7;
        if (c28724xcf987b97 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        c28724xcf987b97.mo138647xa92a451();
    }

    /* renamed from: onFirstFrame */
    public void m137702xbc2673dc() {
        m137564x57aecaa3();
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6> it = this.f70874xc61ee38d.iterator();
        while (it.hasNext()) {
            it.next().mo2121x6c956b30();
        }
    }

    /* renamed from: onNextFrame */
    public void m137703x45564b1b() {
        m137564x57aecaa3();
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28639xef994e18> it = this.f70872x998713b.iterator();
        while (it.hasNext()) {
            it.next().mo138001x79dc32f5();
        }
        this.f70872x998713b.clear();
    }

    /* renamed from: onPreRenderFinished */
    public void m137704xecb7e18c(boolean z17, android.graphics.Bitmap bitmap) {
        m137564x57aecaa3();
        io.p3284xd2ae381c.Log.i(TAG, "onPreRenderFinished: " + z17 + ", bitmap: " + bitmap);
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3> it = this.f70873x6ecbb610.iterator();
        while (it.hasNext()) {
            it.next().mo2114xecb7e18c(z17, bitmap);
        }
        this.f70873x6ecbb610.clear();
    }

    /* renamed from: onRenderingStopped */
    public void m137705xcdf9c1a0() {
        m137564x57aecaa3();
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6> it = this.f70874xc61ee38d.iterator();
        while (it.hasNext()) {
            it.next().mo2122xb9179606();
        }
    }

    /* renamed from: onSurfaceChanged */
    public void m137706xd8f18906(final int i17, final int i18) {
        m137564x57aecaa3();
        m137562xed51e494();
        final long longValue = this.f70879x27ccab60.longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.3
            @Override // java.lang.Runnable
            public void run() {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeSurfaceChanged start: " + longValue);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.this.m137624x7817893e(longValue, i17, i18);
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeSurfaceChanged end: " + longValue);
            }
        };
        if (this.f70880x7aad0196) {
            this.f70869x735fa421.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: onSurfaceCreated */
    public void m137707xea34a53a(final android.view.Surface surface) {
        m137564x57aecaa3();
        m137562xed51e494();
        final long longValue = this.f70879x27ccab60.longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.2
            @Override // java.lang.Runnable
            public void run() {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeSurfaceCreated start: " + longValue);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.this.m137625x895aa572(longValue, surface);
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeSurfaceCreated end: " + longValue);
            }
        };
        if (this.f70880x7aad0196) {
            this.f70869x735fa421.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: onSurfaceDestroyed */
    public void m137708x82616feb() {
        if (this.f70879x27ccab60 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "onSurfaceDestroyed error nativeShellHolderId is null");
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "onSurfaceDestroyed");
        m137564x57aecaa3();
        m137562xed51e494();
        m137705xcdf9c1a0();
        final long longValue = this.f70879x27ccab60.longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.4
            @Override // java.lang.Runnable
            public void run() {
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeSurfaceDestroyed start: " + longValue);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.this.m137626xf0084223(longValue);
                io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, "nativeSurfaceDestroyed end: " + longValue);
            }
        };
        if (this.f70880x7aad0196) {
            this.f70869x735fa421.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: onSurfaceWindowChanged */
    public void m137709x97467176(android.view.Surface surface) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137627x544967ae(this.f70879x27ccab60.longValue(), surface);
    }

    /* renamed from: onVsync */
    public void m137710xb07ac572(long j17, long j18, long j19) {
        m137605x7772155b(j17, j18, j19);
    }

    /* renamed from: pauseScheduleFrame */
    public void m137711xb42b16c0() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "stopFrame error nativeShellHolderId is null");
        } else {
            m137606x8f8beb37(l17.longValue());
        }
    }

    /* renamed from: performNativeAttach */
    public long m137712xe6d1af3d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 c28602x9ef83230 = this.f70877xe82c700f;
        return m137571x70797d3c(c28586x96e67e09, c28602x9ef83230 != null ? c28602x9ef83230.m137836xf964d7be() : 0L, this.f70875x52cadd3f);
    }

    /* renamed from: performNativeAttachNotInMainThread */
    public long m137713x1660f19e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 c28602x9ef83230 = this.f70877xe82c700f;
        return m137572xa8d185bf(c28586x96e67e09, c28602x9ef83230 != null ? c28602x9ef83230.m137836xf964d7be() : 0L, this.f70875x52cadd3f);
    }

    /* renamed from: preCreateThreadMerger */
    public void m137714x823b3503(boolean z17) {
        m137607xcb6ff92c(this.f70879x27ccab60.longValue(), z17);
    }

    /* renamed from: prefetchDefaultFontManager */
    public void m137715xdcd251b4(java.lang.String str) {
        if (f70865xf9d18e51) {
            io.p3284xd2ae381c.Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        m137608xefeebf2b(str);
        f70865xf9d18e51 = true;
    }

    /* renamed from: recordStartupTiming */
    public void m137716xc9039c56(java.lang.String str) {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            this.f70884x722b2810.m137823x6ef007fb(str);
        } else {
            m137609x59bd56bf(l17.longValue(), str);
        }
    }

    /* renamed from: recordStartupTimingWithTimestamp */
    public void m137717xa1d1e63a(java.lang.String str, long j17) {
        if (this.f70879x27ccab60 == null) {
            this.f70884x722b2810.m137824x429e4eb5(str, j17);
        } else {
            m137610xe6049693(this.f70879x27ccab60.longValue(), str, j17 - java.lang.System.nanoTime());
        }
    }

    /* renamed from: registerImageTexture */
    public void m137718xae663d83(long j17, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer imageConsumer, boolean z17) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137611x34e3d03a(this.f70879x27ccab60.longValue(), j17, new java.lang.ref.WeakReference<>(imageConsumer), z17);
    }

    /* renamed from: registerTexture */
    public void m137719xa2ca10f8(long j17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5 c28650xcd7638e5) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137612x934b67e1(this.f70879x27ccab60.longValue(), j17, new java.lang.ref.WeakReference<>(c28650xcd7638e5));
    }

    /* renamed from: releaseGPUResource */
    public void m137720x88b14e53() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "releaseGPUResource error nativeShellHolderId is null");
        } else {
            m137613x641222ca(l17.longValue());
        }
    }

    /* renamed from: removeDisplayNextFrameListener */
    public void m137721xcbeeb110(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28639xef994e18 interfaceC28639xef994e18) {
        m137564x57aecaa3();
        this.f70872x998713b.remove(interfaceC28639xef994e18);
    }

    /* renamed from: removeEngineLifecycleListener */
    public void m137722x7b8562f8(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener engineLifecycleListener) {
        m137564x57aecaa3();
        this.f70871x778e2bd7.remove(engineLifecycleListener);
    }

    /* renamed from: removeEngineLifecycleListenerNotInMainThread */
    public void m137723xe8fdf083(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener engineLifecycleListener) {
        synchronized (this.f70871x778e2bd7) {
            this.f70871x778e2bd7.remove(engineLifecycleListener);
        }
    }

    /* renamed from: removeIsDisplayingFlutterUiListener */
    public void m137724x4c436f6(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        m137564x57aecaa3();
        this.f70874xc61ee38d.remove(interfaceC28647x231975c6);
    }

    /* renamed from: removeIsDisplayingFlutterUiListenerNotInMainThread */
    public void m137725x498e0c5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        synchronized (this.f70874xc61ee38d) {
            this.f70874xc61ee38d.remove(interfaceC28647x231975c6);
        }
    }

    /* renamed from: removePreRenderFinishedListener */
    public void m137726xeacda75b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3 interfaceC28640xd440a6e3) {
        m137564x57aecaa3();
        this.f70873x6ecbb610.remove(interfaceC28640xd440a6e3);
    }

    /* renamed from: requestDartDeferredLibrary */
    public void m137727xb0fa3b4e(int i17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f interfaceC28611x253f360f = this.f70870xa57111ef;
        if (interfaceC28611x253f360f != null) {
            interfaceC28611x253f360f.mo137891x1f0d4383(i17, null);
        } else {
            io.p3284xd2ae381c.Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    /* renamed from: requestDrawLastFrame */
    public void m137728x4fb41144() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "requestDrawLastFrame error nativeShellHolderId is null");
        } else {
            m137614xd631a3fb(l17.longValue());
        }
    }

    /* renamed from: requestPreRender */
    public void m137729x4095b84a(int i17, int i18) {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            return;
        }
        m137615x603f3e81(l17.longValue(), i17, i18);
    }

    /* renamed from: resumeScheduleFrame */
    public void m137730x689305e9() {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "startFrame error nativeShellHolderId is null");
        } else {
            m137616xf94cc052(l17.longValue());
        }
    }

    /* renamed from: runBundleAndSnapshotFromLibrary */
    public void m137731x95362943(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j17) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137617xdee68e2c(this.f70879x27ccab60.longValue(), str, str2, str3, assetManager, list, j17);
    }

    /* renamed from: scheduleFrame */
    public void m137732x62a02d16() {
        m137564x57aecaa3();
        m137562xed51e494();
        m137618x62c2a3f(this.f70879x27ccab60.longValue());
    }

    /* renamed from: setAccessibilityDelegate */
    public void m137733x4d4359b1(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate accessibilityDelegate) {
        m137564x57aecaa3();
        this.f70868x7184d4f3 = accessibilityDelegate;
    }

    /* renamed from: setAccessibilityFeatures */
    public void m137734xb1a6069(int i17) {
        m137564x57aecaa3();
        if (m137686xf0d424ee()) {
            m137735xaf966525(i17);
        }
    }

    /* renamed from: setAccessibilityFeaturesInNative */
    public void m137735xaf966525(int i17) {
        m137619x1e91bfa0(this.f70879x27ccab60.longValue(), i17);
    }

    /* renamed from: setAsyncWaitForVsyncDelegate */
    public void m137736xa727645c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate) {
        f70859x8bd56e9e = asyncWaitForVsyncDelegate;
    }

    /* renamed from: setBackgroundExecutor */
    public void m137737x1de78823(java.util.concurrent.Executor executor, boolean z17) {
        this.f70869x735fa421 = executor;
        this.f70880x7aad0196 = z17;
    }

    /* renamed from: setDeferredComponentManager */
    public void m137738x854a6c71(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f interfaceC28611x253f360f) {
        m137564x57aecaa3();
        this.f70870xa57111ef = interfaceC28611x253f360f;
        if (interfaceC28611x253f360f != null) {
            interfaceC28611x253f360f.mo137895xca026fe3(this);
        }
    }

    /* renamed from: setDeferredComponentManagerNotInMainThread */
    public synchronized void m137739x3b57a5ea(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f interfaceC28611x253f360f) {
        this.f70870xa57111ef = interfaceC28611x253f360f;
        if (interfaceC28611x253f360f != null) {
            interfaceC28611x253f360f.mo137895xca026fe3(this);
        }
    }

    /* renamed from: setIsolateGroupName */
    public void m137740x9e9fd9c1(java.lang.String str) {
        this.f70875x52cadd3f = str;
    }

    /* renamed from: setLocalizationPlugin */
    public void m137741xe17aef2e(io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c c28703xa4b6c74c) {
        m137564x57aecaa3();
        this.f70876x36f30b2c = c28703xa4b6c74c;
    }

    /* renamed from: setLocalizationPluginNotInMainThread */
    public synchronized void m137742x9483b18d(io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c c28703xa4b6c74c) {
        this.f70876x36f30b2c = c28703xa4b6c74c;
    }

    /* renamed from: setPlatformMessageHandler */
    public void m137743xde722b98(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6 interfaceC28609x71a8c4b6) {
        m137564x57aecaa3();
        this.f70881x42601896 = interfaceC28609x71a8c4b6;
    }

    /* renamed from: setPlatformMessageHandlerNotInMainThread */
    public synchronized void m137744xc112d3e3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6 interfaceC28609x71a8c4b6) {
        this.f70881x42601896 = interfaceC28609x71a8c4b6;
    }

    /* renamed from: setPlatformViewsController */
    public void m137745xfbfbf0f5(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97) {
        m137564x57aecaa3();
        this.f70882x15cba3b7 = c28724xcf987b97;
    }

    /* renamed from: setPlatformViewsController2 */
    public void m137746x83822ddd(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b) {
        m137564x57aecaa3();
        this.f70883xa3a8d35b = c28730x2376f77b;
    }

    /* renamed from: setPlatformViewsController2NotInMainThread */
    public synchronized void m137747x4a0f5efe(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b) {
        this.f70883xa3a8d35b = c28730x2376f77b;
    }

    /* renamed from: setPlatformViewsControllerNotInMainThread */
    public synchronized void m137748xf22408e6(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97) {
        this.f70882x15cba3b7 = c28724xcf987b97;
    }

    /* renamed from: setRefreshRateFPS */
    public void m137749x90ab7590(float f17) {
        f70866xda1d408e = f17;
        m137764x695fb5d2();
    }

    /* renamed from: setSemanticsEnabled */
    public void m137750x9afc8f96(boolean z17) {
        m137564x57aecaa3();
        if (m137686xf0d424ee()) {
            m137751xdde11752(z17);
        }
    }

    /* renamed from: setSemanticsEnabledInNative */
    public void m137751xdde11752(boolean z17) {
        m137621x2bb649ff(this.f70879x27ccab60.longValue(), z17);
    }

    /* renamed from: setViewportMetrics */
    public void m137752x9c31e47b(float f17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int[] iArr, int[] iArr2, int[] iArr3, int i66) {
        if (this.f70879x27ccab60 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "setViewportMetrics error nativeShellHolderId is null");
            return;
        }
        m137564x57aecaa3();
        m137562xed51e494();
        m137622x7792b8f2(this.f70879x27ccab60.longValue(), f17, i17, i18, i19, i27, i28, i29, i37, i38, i39, i47, i48, i49, i57, i58, i59, iArr, iArr2, iArr3, i66);
    }

    /* renamed from: showOverlaySurface2 */
    public void m137753x8936e4d8() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c28730x2376f77b.m138800xeba6ee9a();
    }

    /* renamed from: spawn */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137754x688f37b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, long j17) {
        return m137756x688f37b(str, str2, str3, list, false, true, false, j17);
    }

    /* renamed from: spawnNotInMainThread */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137757x120ce9a0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, boolean z18, boolean z19, long j17) {
        m137562xed51e494();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137623x67b529a4 = m137623x67b529a4(this.f70879x27ccab60.longValue(), str, str2, str3, list, z17, z18, z19, j17);
        java.lang.Long l17 = m137623x67b529a4.f70879x27ccab60;
        io.p3284xd2ae381c.p3319x36f002.C28970x7ccc697b.m139417xe071d469((l17 == null || l17.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return m137623x67b529a4;
    }

    /* renamed from: startStartupTimingDuration */
    public void m137758x2107a499(java.lang.String str) {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            this.f70884x722b2810.m137826x90d7f416(str);
            return;
        }
        m137609x59bd56bf(l17.longValue(), str + "_start");
    }

    /* renamed from: swapMemoryToFile */
    public void m137759x3c28882b(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.lang.Long l17 = this.f70879x27ccab60;
        if (l17 == null) {
            io.p3284xd2ae381c.Log.e(TAG, "swapMemoryToFile error nativeShellHolderId is null");
        } else {
            m137628x1ef8b807(l17.longValue(), str, z17, z18, z19);
        }
    }

    /* renamed from: swapTransactions */
    public void m137760x86262a88() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = this.f70883xa3a8d35b;
        if (c28730x2376f77b == null) {
            throw new java.lang.RuntimeException("");
        }
        c28730x2376f77b.m138801x86262a88();
    }

    /* renamed from: unregisterTexture */
    public void m137761x6d19dd3f(long j17) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137629x42a11de8(this.f70879x27ccab60.longValue(), j17);
    }

    /* renamed from: updateDisplayMetrics */
    public void m137762x3890b2ca(int i17, float f17, float f18, float f19) {
        f70862x5fd14e24 = f17;
        f70861x80897c89 = f18;
        f70860xbd5915c6 = f19;
        if (f70864xc496d0d2) {
            m137631xbf0e4581(this.f70879x27ccab60.longValue());
        }
    }

    /* renamed from: updateJavaAssetManager */
    public void m137763xc1fc34c8(android.content.res.AssetManager assetManager, java.lang.String str) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137632x9f5ff5bf(this.f70879x27ccab60.longValue(), assetManager, str);
    }

    /* renamed from: updateRefreshRate */
    public void m137764x695fb5d2() {
        if (f70864xc496d0d2) {
            m137633x3ee6f67b(f70866xda1d408e);
        }
    }

    /* renamed from: dispatchSemanticsAction */
    public void m137672x92ca6029(int i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action, java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        int i18;
        m137562xed51e494();
        if (obj != null) {
            byteBuffer = io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495.mo138408x6b057511(obj);
            i18 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i18 = 0;
        }
        m137670x92ca6029(i17, action.f72215x6ac9171, byteBuffer, i18);
    }

    /* renamed from: spawn */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137755x688f37b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, long j17) {
        return m137756x688f37b(str, str2, str3, list, false, true, z17, j17);
    }

    /* renamed from: spawn */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137756x688f37b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, boolean z18, boolean z19, long j17) {
        m137564x57aecaa3();
        m137562xed51e494();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137623x67b529a4 = m137623x67b529a4(this.f70879x27ccab60.longValue(), str, str2, str3, list, z17, z18, z19, j17);
        java.lang.Long l17 = m137623x67b529a4.f70879x27ccab60;
        io.p3284xd2ae381c.p3319x36f002.C28970x7ccc697b.m139417xe071d469((l17 == null || l17.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return m137623x67b529a4;
    }

    /* renamed from: dispatchSemanticsAction */
    public void m137670x92ca6029(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19) {
        m137564x57aecaa3();
        m137562xed51e494();
        m137582x61debe12(this.f70879x27ccab60.longValue(), i17, i18, byteBuffer, i19);
    }
}
