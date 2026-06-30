package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.FlutterEngine */
/* loaded from: classes15.dex */
public class C28580x69eec95e implements io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.DisplayUpdater {
    private static final java.lang.String TAG = "FlutterEngine";

    /* renamed from: idToEngine */
    private static final java.util.Map<java.lang.Long, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e> f70782x9e8e12d8 = new java.util.HashMap();

    /* renamed from: nextEngineId */
    private static long f70783x2e5bc710 = 1;

    /* renamed from: accessibilityChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 f70784xcb08dfd5;

    /* renamed from: backGestureChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28653xe9df5061 f70785x7c1b9441;

    /* renamed from: dartExecutor */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 f70786xe1635d72;

    /* renamed from: deferredComponentChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365 f70787x9fb37f45;

    /* renamed from: engineId */
    private final long f70788x6c827afd;

    /* renamed from: engineLifecycleListener */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener f70789xca0cd81c;

    /* renamed from: engineLifecycleListeners */
    private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener> f70790x778e2bd7;

    /* renamed from: flutterJNI */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f70791x2014a1e9;

    /* renamed from: lifecycleChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659 f70792x6c3e239;

    /* renamed from: localizationChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a f70793xefd3602a;

    /* renamed from: localizationPlugin */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c f70794x36f30b2c;

    /* renamed from: mouseCursorChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848 f70795x54071c28;

    /* renamed from: navigationChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28661x219a8c2f f70796x36d64c4f;

    /* renamed from: platformChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0 f70797x8548d510;

    /* renamed from: platformViewsController */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 f70798x15cba3b7;

    /* renamed from: platformViewsController2 */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b f70799xa3a8d35b;

    /* renamed from: pluginRegistry */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39 f70800x9ec12090;

    /* renamed from: processTextChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47 f70801x8d1f9127;

    /* renamed from: renderer */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f70802xe28140c3;

    /* renamed from: restorationChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5 f70803x9d32f685;

    /* renamed from: scribeChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 f70804xebd32699;

    /* renamed from: sensitiveContentChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60 f70805xd36c7280;

    /* renamed from: settingsChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340 f70806xf43efb60;

    /* renamed from: skiaChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28671x1c7fd953 f70807xb9163173;

    /* renamed from: spellCheckChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003 f70808x7ac1d023;

    /* renamed from: statChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28673xc6a7afef f70809x633e080f;

    /* renamed from: systemChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28674xd499cfb4 f70810xa4fa9fd4;

    /* renamed from: textInputChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 f70811xda083a6;

    /* renamed from: io.flutter.embedding.engine.FlutterEngine$EngineLifecycleListener */
    /* loaded from: classes15.dex */
    public interface EngineLifecycleListener {
        /* renamed from: onEngineWillDestroy */
        void mo9535x8a6a5407();

        /* renamed from: onPreEngineRestart */
        void mo9536x89b45f89();
    }

    public C28580x69eec95e(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: attachToJni */
    private void m137410xd29783e5() {
        io.p3284xd2ae381c.Log.v(TAG, "Attaching to JNI.");
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            io.p3284xd2ae381c.Log.i(TAG, "Attaching to JNI in main thread");
            this.f70791x2014a1e9.m137650xd4207fd7();
        } else {
            io.p3284xd2ae381c.Log.i(TAG, "Attaching to JNI not in main thread");
            this.f70791x2014a1e9.m137649x5f9cc196();
        }
        if (!m137412x7d170edc()) {
            throw new java.lang.RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    /* renamed from: engineForId */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137411x6402b6a2(long j17) {
        return f70782x9e8e12d8.get(java.lang.Long.valueOf(j17));
    }

    /* renamed from: isAttachedToJni */
    private boolean m137412x7d170edc() {
        return this.f70791x2014a1e9.m137686xf0d424ee();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void m137413x51ef5f0f(android.content.Context context) {
        this.f70794x36f30b2c.m138571x71f8eb70(context.getResources().getConfiguration());
    }

    /* renamed from: resetNextEngineId */
    public static void m137414xafc8b9ff() {
        f70783x2e5bc710 = 1L;
    }

    /* renamed from: addEngineLifecycleListener */
    public void m137415x4aac123b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener engineLifecycleListener) {
        this.f70790x778e2bd7.add(engineLifecycleListener);
    }

    /* renamed from: beforeDestroyInAnyThread */
    public void m137416x1b5040f6() {
        io.p3284xd2ae381c.Log.i(TAG, "beforeDestroyInAnyThread");
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener> it = this.f70790x778e2bd7.iterator();
        while (it.hasNext()) {
            it.next().mo9535x8a6a5407();
        }
        this.f70802xe28140c3.m138036x41012807();
        this.f70790x778e2bd7.clear();
        this.f70800x9ec12090.m137481x5cd39ffa();
        this.f70798x15cba3b7.mo138644x3d3e7ea();
        this.f70786xe1635d72.m137865x3d3e7ea();
        this.f70791x2014a1e9.m137722x7b8562f8(this.f70789xca0cd81c);
        this.f70791x2014a1e9.m137738x854a6c71(null);
        if (io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136949xa57111ef() != null) {
            io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136949xa57111ef().mo137889x5cd39ffa();
            this.f70787x9fb37f45.m138163x854a6c71(null);
        }
    }

    /* renamed from: canPreRender */
    public boolean m137417x64178429() {
        return this.f70791x2014a1e9.m137652x64178429();
    }

    /* renamed from: checkLeak */
    public void m137418x17be348b() {
        this.f70791x2014a1e9.m137653x17be348b();
    }

    /* renamed from: destroy */
    public void m137419x5cd39ffa() {
        io.p3284xd2ae381c.Log.v(TAG, "Destroying.");
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener> it = this.f70790x778e2bd7.iterator();
        while (it.hasNext()) {
            it.next().mo9535x8a6a5407();
        }
        this.f70802xe28140c3.m138036x41012807();
        this.f70790x778e2bd7.clear();
        this.f70800x9ec12090.m137481x5cd39ffa();
        this.f70798x15cba3b7.mo138644x3d3e7ea();
        this.f70799xa3a8d35b.m138794x3d3e7ea();
        this.f70786xe1635d72.m137865x3d3e7ea();
        this.f70791x2014a1e9.m137722x7b8562f8(this.f70789xca0cd81c);
        this.f70791x2014a1e9.m137738x854a6c71(null);
        this.f70791x2014a1e9.m137665xab1e58e1();
        if (io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136949xa57111ef() != null) {
            io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136949xa57111ef().mo137889x5cd39ffa();
            this.f70787x9fb37f45.m138163x854a6c71(null);
        }
        f70782x9e8e12d8.remove(java.lang.Long.valueOf(this.f70788x6c827afd));
    }

    /* renamed from: destroyInAnyThread */
    public void m137420x957d8717() {
        io.p3284xd2ae381c.Log.i(TAG, "Destroying not in main thread.");
        this.f70791x2014a1e9.m137666x7d7f4b7a();
    }

    /* renamed from: dumpGPUMemoryStatistics */
    public void m137421x8bbcf73c(boolean z17) {
        this.f70791x2014a1e9.m137673x8bbcf73c(z17);
    }

    /* renamed from: getAccessibilityChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 m137422x78d49c4b() {
        return this.f70784xcb08dfd5;
    }

    /* renamed from: getActivityControlSurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f m137423x1983fc75() {
        return this.f70800x9ec12090;
    }

    /* renamed from: getBackGestureChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28653xe9df5061 m137424x8f77f637() {
        return this.f70785x7c1b9441;
    }

    /* renamed from: getBroadcastReceiverControlSurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28629x9d440a60 m137425x9106104a() {
        return this.f70800x9ec12090;
    }

    /* renamed from: getContentProviderControlSurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28632xee0fa49a m137426x478e1d04() {
        return this.f70800x9ec12090;
    }

    /* renamed from: getDartExecutor */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 m137427x4255efe8() {
        return this.f70786xe1635d72;
    }

    /* renamed from: getDeferredComponentChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365 m137428xcfc010bb() {
        return this.f70787x9fb37f45;
    }

    /* renamed from: getEngineId */
    public long m137429xe85cb873() {
        return this.f70788x6c827afd;
    }

    /* renamed from: getGPUMemoryUsageInBytes */
    public long m137430x8754451c() {
        return this.f70791x2014a1e9.m137677x8754451c();
    }

    /* renamed from: getLifecycleChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659 m137431xae9c49af() {
        return this.f70792x6c3e239;
    }

    /* renamed from: getLocalizationChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a m137432x48033cf4() {
        return this.f70793xefd3602a;
    }

    /* renamed from: getLocalizationPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c m137433x4a4f6d22() {
        return this.f70794x36f30b2c;
    }

    /* renamed from: getMouseCursorChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848 m137434x67637e1e() {
        return this.f70795x54071c28;
    }

    /* renamed from: getNavigationChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28661x219a8c2f m137435x8a0ad399() {
        return this.f70796x36d64c4f;
    }

    /* renamed from: getPlatformChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0 m137436x69aaa6da() {
        return this.f70797x8548d510;
    }

    /* renamed from: getPlatformViewsController */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 m137437xe5cc0b81() {
        return this.f70798x15cba3b7;
    }

    /* renamed from: getPlatformViewsController2 */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b m137438xd3b564d1() {
        return this.f70799xa3a8d35b;
    }

    /* renamed from: getPlugins */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a() {
        return this.f70800x9ec12090;
    }

    /* renamed from: getProcessTextChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47 m137440xa07bf31d() {
        return this.f70801x8d1f9127;
    }

    /* renamed from: getRenderer */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39() {
        return this.f70802xe28140c3;
    }

    /* renamed from: getRestorationChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5 m137442xb08f587b() {
        return this.f70803x9d32f685;
    }

    /* renamed from: getScribeChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 m137443xa932e2e3() {
        return this.f70804xebd32699;
    }

    /* renamed from: getSensitiveContentChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60 m137444xa36cda4a() {
        return this.f70805xd36c7280;
    }

    /* renamed from: getServiceControlSurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28636x96284e85 m137445x34f2d0ef() {
        return this.f70800x9ec12090;
    }

    /* renamed from: getSettingsChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340 m137446xd8a0cd2a() {
        return this.f70806xf43efb60;
    }

    /* renamed from: getSkiaChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28671x1c7fd953 m137447x92ec783d() {
        return this.f70807xb9163173;
    }

    /* renamed from: getSpellCheckChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003 m137448xcdf6576d() {
        return this.f70808x7ac1d023;
    }

    /* renamed from: getStatChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28673xc6a7afef m137449x3d144ed9() {
        return this.f70809x633e080f;
    }

    /* renamed from: getSystemChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28674xd499cfb4 m137450x625a5c1e() {
        return this.f70810xa4fa9fd4;
    }

    /* renamed from: getTextInputChannel */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 m137451xb578eb1c() {
        return this.f70811xda083a6;
    }

    /* renamed from: markFlutterViewDraw */
    public void m137452xc48e5f38() {
        this.f70791x2014a1e9.m137694xc48e5f38();
    }

    /* renamed from: preCreateThreadMerger */
    public void m137453x823b3503(boolean z17) {
        this.f70791x2014a1e9.m137714x823b3503(z17);
    }

    /* renamed from: recordStartupTiming */
    public void m137454xc9039c56(java.lang.String str) {
        this.f70791x2014a1e9.m137716xc9039c56(str);
    }

    /* renamed from: recordStartupTimingWithTimestamp */
    public void m137455xa1d1e63a(java.lang.String str, long j17) {
        this.f70791x2014a1e9.m137717xa1d1e63a(str, j17);
    }

    /* renamed from: releaseGPUResource */
    public void m137456x88b14e53() {
        this.f70791x2014a1e9.m137720x88b14e53();
    }

    /* renamed from: removeEngineLifecycleListener */
    public void m137457x7b8562f8(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener engineLifecycleListener) {
        this.f70790x778e2bd7.remove(engineLifecycleListener);
    }

    /* renamed from: requestPreRender */
    public void m137458x4095b84a(int i17, int i18, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3 interfaceC28640xd440a6e3) {
        this.f70791x2014a1e9.m137646x8b0591de(interfaceC28640xd440a6e3);
        this.f70791x2014a1e9.m137729x4095b84a(i17, i18);
    }

    /* renamed from: setBackgroundExecutor */
    public void m137459x1de78823(java.util.concurrent.Executor executor, boolean z17) {
        this.f70802xe28140c3.m138043x1de78823(executor);
        this.f70791x2014a1e9.m137737x1de78823(executor, z17);
    }

    /* renamed from: spawn */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137460x688f37b(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.lang.String str, java.util.List<java.lang.String> list, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, boolean z17, boolean z18) {
        return m137461x688f37b(context, dartEntrypoint, str, list, c28724xcf987b97, z17, z18, false, true);
    }

    /* renamed from: swapMemFromFile */
    public void m137462x1d91eda8(java.lang.String str, boolean z17, boolean z18) {
        this.f70791x2014a1e9.m137759x3c28882b(str, false, z17, z18);
    }

    /* renamed from: swapMemToFile */
    public void m137463xb3410479(java.lang.String str, boolean z17, boolean z18) {
        this.f70791x2014a1e9.m137759x3c28882b(str, true, z17, z18);
    }

    @Override // io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.DisplayUpdater
    /* renamed from: updateDisplayMetrics */
    public void mo137464x3890b2ca(float f17, float f18, float f19) {
        this.f70791x2014a1e9.m137762x3890b2ca(0, f17, f18, f19);
    }

    public C28580x69eec95e(android.content.Context context, java.lang.String[] strArr) {
        this(context, null, null, strArr, true);
    }

    /* renamed from: spawn */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137461x688f37b(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.lang.String str, java.util.List<java.lang.String> list, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, boolean z17, boolean z18, boolean z19, boolean z27) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137757x120ce9a0;
        if (m137412x7d170edc()) {
            long nanoTime = java.lang.System.nanoTime();
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                m137757x120ce9a0 = this.f70791x2014a1e9.m137756x688f37b(dartEntrypoint.f71021xd7b69460, dartEntrypoint.f71022x5e3250be, str, list, z19, z27, false, f70783x2e5bc710);
            } else {
                m137757x120ce9a0 = this.f70791x2014a1e9.m137757x120ce9a0(dartEntrypoint.f71021xd7b69460, dartEntrypoint.f71022x5e3250be, str, list, z19, z27, false, f70783x2e5bc710);
            }
            m137757x120ce9a0.m137717xa1d1e63a("java_spawn_start", nanoTime);
            m137757x120ce9a0.m137716xc9039c56("java_spawn_jni_created");
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e(context, null, m137757x120ce9a0, c28724xcf987b97, null, z17, z18);
            m137757x120ce9a0.m137716xc9039c56("java_spawn_engine_created");
            return c28580x69eec95e;
        }
        throw new java.lang.IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public C28580x69eec95e(android.content.Context context, java.lang.String[] strArr, boolean z17) {
        this(context, null, null, strArr, z17);
    }

    public C28580x69eec95e(android.content.Context context, java.lang.String[] strArr, boolean z17, boolean z18) {
        this(context, null, null, new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97(), strArr, z17, z18);
    }

    public C28580x69eec95e(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this(context, c28615x75ebff2f, c28586x96e67e09, null, true);
    }

    public C28580x69eec95e(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, java.lang.String[] strArr, boolean z17) {
        this(context, c28615x75ebff2f, c28586x96e67e09, new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97(), strArr, z17);
    }

    public C28580x69eec95e(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, java.lang.String[] strArr, boolean z17) {
        this(context, c28615x75ebff2f, c28586x96e67e09, c28724xcf987b97, strArr, z17, false);
    }

    public C28580x69eec95e(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, java.lang.String[] strArr, boolean z17, boolean z18) {
        this(context, c28615x75ebff2f, c28586x96e67e09, c28724xcf987b97, strArr, z17, z18, "", null);
    }

    public C28580x69eec95e(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, java.lang.String[] strArr, boolean z17, boolean z18, java.lang.String str) {
        this(context, c28615x75ebff2f, c28586x96e67e09, c28724xcf987b97, strArr, z17, z18, str, null);
    }

    public C28580x69eec95e(final android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, java.lang.String[] strArr, boolean z17, boolean z18, java.lang.String str, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1) {
        android.content.res.AssetManager assets;
        this.f70790x778e2bd7 = new java.util.HashSet();
        this.f70789xca0cd81c = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngine.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onEngineWillDestroy */
            public void mo9535x8a6a5407() {
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onPreEngineRestart */
            public void mo9536x89b45f89() {
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.TAG, "onPreEngineRestart()");
                java.util.Iterator it = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this.f70790x778e2bd7.iterator();
                while (it.hasNext()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener) it.next()).mo9536x89b45f89();
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this.f70798x15cba3b7.mo138648x89b45f89();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this.f70799xa3a8d35b.m138797x89b45f89();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this.f70803x9d32f685.m138304xb4382b97();
            }
        };
        long nanoTime = java.lang.System.nanoTime();
        long j17 = f70783x2e5bc710;
        f70783x2e5bc710 = 1 + j17;
        this.f70788x6c827afd = j17;
        f70782x9e8e12d8.put(java.lang.Long.valueOf(j17), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        long nanoTime2 = java.lang.System.nanoTime();
        io.p3284xd2ae381c.C28534x4dc80f50 m136946x21169495 = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m137772xf9e7376a = c28586x96e67e09 == null ? m136946x21169495.m136952xffee662b().m137772xf9e7376a() : c28586x96e67e09;
        this.f70791x2014a1e9 = m137772xf9e7376a;
        m137772xf9e7376a.m137717xa1d1e63a("java_flutter_engine_constructor_start", nanoTime);
        m137772xf9e7376a.m137717xa1d1e63a("java_asset_manager_created", nanoTime2);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192(m137772xf9e7376a, assets, this.f70788x6c827afd);
        this.f70786xe1635d72 = c28604xeb2eb192;
        m137772xf9e7376a.m137716xc9039c56("java_dart_executor_created");
        c28604xeb2eb192.m137863x2ee69847();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f m136949xa57111ef = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136949xa57111ef();
        m137772xf9e7376a.m137758x2107a499("java_channels_creation");
        this.f70784xcb08dfd5 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5(c28604xeb2eb192, m137772xf9e7376a);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365 c28654x1f81a365 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365(c28604xeb2eb192);
        this.f70787x9fb37f45 = c28654x1f81a365;
        this.f70792x6c3e239 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659(c28604xeb2eb192);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a c28659x3a87280a = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a(c28604xeb2eb192);
        this.f70793xefd3602a = c28659x3a87280a;
        this.f70795x54071c28 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848(c28604xeb2eb192);
        this.f70796x36d64c4f = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28661x219a8c2f(c28604xeb2eb192);
        this.f70785x7c1b9441 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28653xe9df5061(c28604xeb2eb192);
        this.f70797x8548d510 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0(c28604xeb2eb192);
        this.f70801x8d1f9127 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47(c28604xeb2eb192, context.getPackageManager());
        this.f70803x9d32f685 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5(c28604xeb2eb192, z18);
        this.f70804xebd32699 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679(c28604xeb2eb192);
        this.f70805xd36c7280 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60(c28604xeb2eb192);
        this.f70806xf43efb60 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340(c28604xeb2eb192);
        this.f70808x7ac1d023 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003(c28604xeb2eb192);
        this.f70810xa4fa9fd4 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28674xd499cfb4(c28604xeb2eb192);
        this.f70811xda083a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6(c28604xeb2eb192);
        this.f70807xb9163173 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28671x1c7fd953(c28604xeb2eb192);
        this.f70809x633e080f = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28673xc6a7afef(c28604xeb2eb192);
        m137772xf9e7376a.m137675xc56895c0("java_channels_creation");
        if (m136949xa57111ef != null) {
            m136949xa57111ef.mo137894x7f8cd9c7(c28654x1f81a365);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c c28703xa4b6c74c = new io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c(context, c28659x3a87280a);
        this.f70794x36f30b2c = c28703xa4b6c74c;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f = c28615x75ebff2f == null ? m136946x21169495.m136951x464ccf4f() : c28615x75ebff2f;
        m137772xf9e7376a.m137758x2107a499("java_flutter_loader_init");
        if (!m137772xf9e7376a.m137686xf0d424ee()) {
            m136951x464ccf4f.m137938x6fa2b5a2(context.getApplicationContext());
            m136951x464ccf4f.m137932xa072d3d7(context, strArr, android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        }
        m137772xf9e7376a.m137675xc56895c0("java_flutter_loader_init");
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b();
        c28730x2376f77b.m138799x4d6ecebf(c28724xcf987b97.mo138640x52b66db3());
        c28730x2376f77b.m138798x3c79a7eb(m137772xf9e7376a);
        c28724xcf987b97.m138757x3c79a7eb(m137772xf9e7376a);
        m137772xf9e7376a.m137740x9e9fd9c1(str);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            m137772xf9e7376a.m137642x4aac123b(this.f70789xca0cd81c);
            m137772xf9e7376a.m137745xfbfbf0f5(c28724xcf987b97);
            m137772xf9e7376a.m137746x83822ddd(c28730x2376f77b);
            m137772xf9e7376a.m137741xe17aef2e(c28703xa4b6c74c);
            m137772xf9e7376a.m137738x854a6c71(m136946x21169495.m136949xa57111ef());
        } else {
            m137772xf9e7376a.m137643xe8f072e0(this.f70789xca0cd81c);
            m137772xf9e7376a.m137748xf22408e6(c28724xcf987b97);
            m137772xf9e7376a.m137747x4a0f5efe(c28730x2376f77b);
            m137772xf9e7376a.m137742x9483b18d(c28703xa4b6c74c);
            m137772xf9e7376a.m137739x3b57a5ea(m136946x21169495.m136949xa57111ef());
        }
        if (!m137772xf9e7376a.m137686xf0d424ee()) {
            m137772xf9e7376a.m137716xc9039c56("java_attach_to_jni_start");
            m137410xd29783e5();
            m137772xf9e7376a.m137716xc9039c56("java_attach_to_jni_end");
        }
        this.f70802xe28140c3 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df(m137772xf9e7376a);
        this.f70798x15cba3b7 = c28724xcf987b97;
        this.f70799xa3a8d35b = c28730x2376f77b;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39 c28583xadf77f39 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39(context.getApplicationContext(), this, m136951x464ccf4f, c28584x3d6c67c1);
        this.f70800x9ec12090 = c28583xadf77f39;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            c28703xa4b6c74c.m138571x71f8eb70(context.getResources().getConfiguration());
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterEngine$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this.m137413x51ef5f0f(context);
                }
            });
        }
        if (z17 && m136951x464ccf4f.m137930xd546f15a()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3298x36f002.C28638x8c7ff645.m138000x8dcb33d4(this);
        }
        io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139424x1d99141b(context, this);
        c28583xadf77f39.add(new io.p3284xd2ae381c.p3301xc5476f33.p3308x36452d.C28746x47d2866f(m137440xa07bf31d()));
        m137772xf9e7376a.m137716xc9039c56("java_flutter_engine_done");
    }
}
