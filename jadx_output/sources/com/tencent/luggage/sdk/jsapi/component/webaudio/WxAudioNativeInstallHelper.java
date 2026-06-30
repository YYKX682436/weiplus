package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class WxAudioNativeInstallHelper {
    private static final java.lang.String TAG = "Luggage.WxAudioNativeInstallHelper";
    private static java.util.Vector<java.lang.String> mAppIdList = new java.util.Vector<>();
    private byte _hellAccFlag_;
    private boolean bMuteOnBg;
    private final com.tencent.luggage.sdk.jsapi.component.webaudio.q destroyTask;
    private boolean isGame;
    private boolean isSupportWebAudio;
    private boolean loadSoResult;
    private dl3.b mAudioOutputListener;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CustomLoadingStateEvent> mCustomLoadingStateEventListener;
    private com.tencent.mm.libwxaudio.WxAudioNative.NativeAudioPcmCallback nativeAudioPcmCallback;
    private java.util.Map<java.lang.String, dl3.a> sessionIdMap;
    protected com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative;
    private boolean xLibUVSwitch;

    public WxAudioNativeInstallHelper() {
        this(false);
    }

    public static int audioHardwareBufferSize() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return j62.e.g().i("clicfg_appbrand_android_webaudio_use_hw_buffer_size", 1, true, true) != 1 ? 0 : 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseAudio() {
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = this.wxAudioNative;
        if (wxAudioNative != null) {
            if (this.bMuteOnBg) {
                wxAudioNative.setMute(true);
            } else {
                wxAudioNative.forcePauseAllPlayer();
            }
        }
        dl3.i.s().a();
    }

    private static void printKeyLog(java.util.ArrayList<com.tencent.mars.smc.IDKey> arrayList) {
        java.util.Iterator<com.tencent.mars.smc.IDKey> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.smc.IDKey next = it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", key:");
            sb6.append(next.GetKey());
            sb6.append(" value:");
            sb6.append(next.GetValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeAudio() {
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = this.wxAudioNative;
        if (wxAudioNative != null) {
            if (this.bMuteOnBg) {
                wxAudioNative.setMute(false);
            } else {
                wxAudioNative.forceResumeAllPlayer(!this.isGame);
            }
        }
        dl3.i.s().f();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(2:8|(8:10|11|12|13|14|(1:16)|17|(2:19|20)(5:21|22|23|24|(2:26|27)(2:28|(2:30|31)(4:32|(1:34)|35|36)))))|51|11|12|13|14|(0)|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper.TAG, r0, "load so %s error!!", "c++_shared");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper.TAG, r0, "load so %s error!!", "c++_shared");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper.TAG, r0, "load so %s error!!", "c++_shared");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createWxAudioBinding(com.tencent.mm.plugin.appbrand.jsruntime.t r24, com.tencent.mm.plugin.appbrand.jsapi.l r25) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper.createWxAudioBinding(com.tencent.mm.plugin.appbrand.jsruntime.t, com.tencent.mm.plugin.appbrand.jsapi.l):void");
    }

    public void destroyWxAudioBinding(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mars.xlog.Log.i(TAG, "destroyWxAudioBinding");
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CustomLoadingStateEvent> iListener = this.mCustomLoadingStateEventListener;
        if (iListener != null) {
            iListener.dead();
        }
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e(TAG, "destroyWxAudioBinding jsruntime is null");
        } else {
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(this.destroyTask);
        }
    }

    public void initConfigWXAudio(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        if (tVar == null || d0Var == null) {
            com.tencent.mars.xlog.Log.e(TAG, "jsruntime or service is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(TAG, "jsThreadHandler is null");
        } else if (this.bMuteOnBg) {
            d0Var.t3().N.a(new com.tencent.luggage.sdk.jsapi.component.webaudio.m(this, f0Var));
        }
    }

    public void listenLifeCycle(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (!this.isSupportWebAudio) {
            com.tencent.mars.xlog.Log.e(TAG, "listenLifeCycle now is not support webaudio");
            return;
        }
        if (!this.loadSoResult) {
            com.tencent.mars.xlog.Log.e(TAG, "listenLifeCycle so load fail ");
            return;
        }
        java.lang.String appId = lVar.getAppId();
        com.tencent.luggage.sdk.jsapi.component.webaudio.o oVar = new com.tencent.luggage.sdk.jsapi.component.webaudio.o(this, appId);
        com.tencent.mars.xlog.Log.i(TAG, "listenLifeCycle appId:%s", appId);
        if (mAppIdList.contains(appId)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.x0.a(appId, oVar);
        mAppIdList.add(appId);
    }

    public void removeAudioOutputListener() {
        this.mAudioOutputListener = null;
        if (!this.isSupportWebAudio) {
            com.tencent.mars.xlog.Log.e(TAG, "listenLifeCycle now is not support webaudio");
            return;
        }
        if (!this.loadSoResult) {
            com.tencent.mars.xlog.Log.e(TAG, "listenLifeCycle so load fail ");
            return;
        }
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = this.wxAudioNative;
        if (wxAudioNative != null) {
            wxAudioNative.unregisterAudioPcmCallback();
        }
        this.sessionIdMap.clear();
    }

    public void setAudioOutputListener(dl3.b bVar) {
        this.mAudioOutputListener = bVar;
        if (!this.isSupportWebAudio) {
            com.tencent.mars.xlog.Log.e(TAG, "listenLifeCycle now is not support webaudio");
            return;
        }
        if (!this.loadSoResult) {
            com.tencent.mars.xlog.Log.e(TAG, "listenLifeCycle so load fail ");
            return;
        }
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = this.wxAudioNative;
        if (wxAudioNative != null && bVar != null) {
            wxAudioNative.registerAudioPcmCallback(this.nativeAudioPcmCallback);
        }
        this.sessionIdMap.clear();
    }

    public WxAudioNativeInstallHelper(boolean z17) {
        this.xLibUVSwitch = true;
        this.isSupportWebAudio = false;
        this.loadSoResult = false;
        this.isGame = false;
        this.mAudioOutputListener = null;
        this.bMuteOnBg = false;
        this.destroyTask = new com.tencent.luggage.sdk.jsapi.component.webaudio.q(this, new com.tencent.luggage.sdk.jsapi.component.webaudio.n(this));
        this.sessionIdMap = new java.util.HashMap();
        this.nativeAudioPcmCallback = new com.tencent.luggage.sdk.jsapi.component.webaudio.p(this);
        this.isGame = z17;
    }
}
