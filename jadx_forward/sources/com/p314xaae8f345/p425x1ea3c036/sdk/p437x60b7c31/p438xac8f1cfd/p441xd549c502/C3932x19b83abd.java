package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* renamed from: com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper */
/* loaded from: classes7.dex */
public class C3932x19b83abd {
    private static final java.lang.String TAG = "Luggage.WxAudioNativeInstallHelper";

    /* renamed from: mAppIdList */
    private static java.util.Vector<java.lang.String> f15689xc219ffed = new java.util.Vector<>();

    /* renamed from: _hellAccFlag_ */
    private byte f15690x7f11beae;

    /* renamed from: bMuteOnBg */
    private boolean f15691xf9cd0ebf;

    /* renamed from: destroyTask */
    private final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.q f15692x89d6bc9f;

    /* renamed from: isGame */
    private boolean f15693xb9a3283c;

    /* renamed from: isSupportWebAudio */
    private boolean f15694xdbffeb47;

    /* renamed from: loadSoResult */
    private boolean f15695x7832709f;

    /* renamed from: mAudioOutputListener */
    private dl3.b f15696x2ab3b89e;

    /* renamed from: mCustomLoadingStateEventListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5291xdc800f54> f15697x5617d61b;

    /* renamed from: nativeAudioPcmCallback */
    private com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeAudioPcmCallback f15698x2835abc0;

    /* renamed from: sessionIdMap */
    private java.util.Map<java.lang.String, dl3.a> f15699xd5db014b;

    /* renamed from: wxAudioNative */
    protected com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc f15700xee6151ec;

    /* renamed from: xLibUVSwitch */
    private boolean f15701x9af8eb22;

    public C3932x19b83abd() {
        this(false);
    }

    /* renamed from: audioHardwareBufferSize */
    public static int m32186x897e96df() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return j62.e.g().i("clicfg_appbrand_android_webaudio_use_hw_buffer_size", 1, true, true) != 1 ? 0 : 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pauseAudio */
    public void m32187xfb89cf80() {
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = this.f15700xee6151ec;
        if (c10824x1e0081cc != null) {
            if (this.f15691xf9cd0ebf) {
                c10824x1e0081cc.m46451x764d819b(true);
            } else {
                c10824x1e0081cc.m46446xdcc13257();
            }
        }
        dl3.i.s().a();
    }

    /* renamed from: printKeyLog */
    private static void m32188xddab2572(java.util.ArrayList<com.p314xaae8f345.p542x3306d5.smc.C4582x424c344> arrayList) {
        java.util.Iterator<com.p314xaae8f345.p542x3306d5.smc.C4582x424c344> it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 next = it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", key:");
            sb6.append(next.m40328x7eed3b49());
            sb6.append(" value:");
            sb6.append(next.m40329x79249bdb());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeAudio */
    public void m32189xf9a3f7a9() {
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = this.f15700xee6151ec;
        if (c10824x1e0081cc != null) {
            if (this.f15691xf9cd0ebf) {
                c10824x1e0081cc.m46451x764d819b(false);
            } else {
                c10824x1e0081cc.m46448xdce257ca(!this.f15693xb9a3283c);
            }
        }
        dl3.i.s().f();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(2:8|(8:10|11|12|13|14|(1:16)|17|(2:19|20)(5:21|22|23|24|(2:26|27)(2:28|(2:30|31)(4:32|(1:34)|35|36)))))|51|11|12|13|14|(0)|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd.TAG, r0, "load so %s error!!", "c++_shared");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd.TAG, r0, "load so %s error!!", "c++_shared");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd.TAG, r0, "load so %s error!!", "c++_shared");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* renamed from: createWxAudioBinding */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m32190x259eeb6c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t r24, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r25) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd.m32190x259eeb6c(com.tencent.mm.plugin.appbrand.jsruntime.t, com.tencent.mm.plugin.appbrand.jsapi.l):void");
    }

    /* renamed from: destroyWxAudioBinding */
    public void m32191x2b6bd5ea(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "destroyWxAudioBinding");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5291xdc800f54> abstractC20980x9b9ad01d = this.f15697x5617d61b;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "destroyWxAudioBinding jsruntime is null");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(this.f15692x89d6bc9f);
        }
    }

    /* renamed from: initConfigWXAudio */
    public void m32192x778e78c3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        if (tVar == null || d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "jsruntime or service is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "jsThreadHandler is null");
        } else if (this.f15691xf9cd0ebf) {
            d0Var.t3().N.a(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.m(this, f0Var));
        }
    }

    /* renamed from: listenLifeCycle */
    public void m32193x47569943(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (!this.f15694xdbffeb47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listenLifeCycle now is not support webaudio");
            return;
        }
        if (!this.f15695x7832709f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listenLifeCycle so load fail ");
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.o oVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.o(this, mo48798x74292566);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "listenLifeCycle appId:%s", mo48798x74292566);
        if (f15689xc219ffed.contains(mo48798x74292566)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(mo48798x74292566, oVar);
        f15689xc219ffed.add(mo48798x74292566);
    }

    /* renamed from: removeAudioOutputListener */
    public void m32194xf1600327() {
        this.f15696x2ab3b89e = null;
        if (!this.f15694xdbffeb47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listenLifeCycle now is not support webaudio");
            return;
        }
        if (!this.f15695x7832709f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listenLifeCycle so load fail ");
            return;
        }
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = this.f15700xee6151ec;
        if (c10824x1e0081cc != null) {
            c10824x1e0081cc.m46453xfc4d05e5();
        }
        this.f15699xd5db014b.clear();
    }

    /* renamed from: setAudioOutputListener */
    public void m32195xe68c4689(dl3.b bVar) {
        this.f15696x2ab3b89e = bVar;
        if (!this.f15694xdbffeb47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listenLifeCycle now is not support webaudio");
            return;
        }
        if (!this.f15695x7832709f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "listenLifeCycle so load fail ");
            return;
        }
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = this.f15700xee6151ec;
        if (c10824x1e0081cc != null && bVar != null) {
            c10824x1e0081cc.m46449x5738f24c(this.f15698x2835abc0);
        }
        this.f15699xd5db014b.clear();
    }

    public C3932x19b83abd(boolean z17) {
        this.f15701x9af8eb22 = true;
        this.f15694xdbffeb47 = false;
        this.f15695x7832709f = false;
        this.f15693xb9a3283c = false;
        this.f15696x2ab3b89e = null;
        this.f15691xf9cd0ebf = false;
        this.f15692x89d6bc9f = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.q(this, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.n(this));
        this.f15699xd5db014b = new java.util.HashMap();
        this.f15698x2835abc0 = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.p(this);
        this.f15693xb9a3283c = z17;
    }
}
