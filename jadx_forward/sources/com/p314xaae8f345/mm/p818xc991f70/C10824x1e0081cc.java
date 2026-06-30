package com.p314xaae8f345.mm.p818xc991f70;

/* renamed from: com.tencent.mm.libwxaudio.WxAudioNative */
/* loaded from: classes7.dex */
public class C10824x1e0081cc {

    /* renamed from: INIT_ERROR */
    public static int f29636x769b8df9 = -1002;

    /* renamed from: NEW_WXAUDIO_ERROR */
    public static int f29637x537c2e1f = -1000;

    /* renamed from: REPEAT_WXAUDIO_ERROR */
    public static int f29638xf80356fa = -1001;
    public static java.lang.String TAG = "MicroMsg.WebAudio.WxAudioNative";

    /* renamed from: initCallBackFlag */
    private boolean f29639x64b1eea1 = false;

    /* renamed from: mNativeInst */
    volatile long f29640x95333f4a;

    /* renamed from: com.tencent.mm.libwxaudio.WxAudioNative$NativeAudioPcmCallback */
    /* loaded from: classes7.dex */
    public interface NativeAudioPcmCallback {
        /* renamed from: onPcmCallback */
        void mo32202xd3bd43e0(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27);
    }

    /* renamed from: com.tencent.mm.libwxaudio.WxAudioNative$NativeCallBackInterface */
    /* loaded from: classes7.dex */
    public interface NativeCallBackInterface {

        /* renamed from: KEY_GET_FILE_PATH_CACHE_DIR */
        public static final java.lang.String f29641xc9b6f710 = "CACHE_DIR";

        /* renamed from: getFilePath */
        java.lang.String mo32199x5000ed37(java.lang.String str);

        /* renamed from: onCallBack */
        void mo32200x9ac7b764(long j17, java.lang.String str);
    }

    public C10824x1e0081cc(long j17, long j18, long j19) {
        this.f29640x95333f4a = 0L;
        this.f29640x95333f4a = m46436x89985060(j17, j18, j19);
    }

    /* renamed from: destroyBindingWxAudio */
    private native void m46432xfb5c29ca(long j17);

    /* renamed from: forcePauseAllPlayer */
    public static native void m46433xdcc13257(long j17, boolean z17);

    /* renamed from: forceResumeAllPlayer */
    public static native void m46434xdce257ca(long j17, boolean z17);

    /* renamed from: initAndroidAssetMgr */
    public static native void m46435x2d426967(android.content.res.AssetManager assetManager);

    /* renamed from: initBindingWxAudio */
    private native long m46436x89985060(long j17, long j18, long j19);

    /* renamed from: initCallBack */
    private native int m46437x7ccb4d95(long j17, com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface nativeCallBackInterface);

    /* renamed from: registerAudioPcmCallback */
    public static native void m46438x5738f24c(long j17, com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeAudioPcmCallback nativeAudioPcmCallback);

    /* renamed from: setJsAsyncCall */
    private native void m46439xe58d01ef(long j17, long j18);

    /* renamed from: setMute */
    public static native void m46440x764d819b(long j17, boolean z17);

    /* renamed from: testBindingWxAudio */
    private native void m46441xf596e462(long j17);

    /* renamed from: unregisterAudioPcmCallback */
    public static native void m46442xfc4d05e5(long j17);

    /* renamed from: updateNativeInterface */
    private native void m46443x3efb1ad9(long j17, long j18);

    /* renamed from: InitCallBack */
    public int m46444x8696a1b5(final com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface nativeCallBackInterface) {
        if (this.f29640x95333f4a == -1) {
            return f29637x537c2e1f;
        }
        if (this.f29639x64b1eea1) {
            return f29638xf80356fa;
        }
        int m46437x7ccb4d95 = m46437x7ccb4d95(this.f29640x95333f4a, new com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface(this) { // from class: com.tencent.mm.libwxaudio.WxAudioNative.1
            @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
            /* renamed from: getFilePath */
            public java.lang.String mo32199x5000ed37(java.lang.String str) {
                return nativeCallBackInterface.mo32199x5000ed37(str);
            }

            @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
            /* renamed from: onCallBack */
            public void mo32200x9ac7b764(long j17, java.lang.String str) {
                nativeCallBackInterface.mo32200x9ac7b764(j17, str);
            }
        });
        if (m46437x7ccb4d95 != 0) {
            return f29636x769b8df9;
        }
        this.f29639x64b1eea1 = true;
        return m46437x7ccb4d95;
    }

    /* renamed from: destroyWebAudioContext */
    public void m46445xbc3bfb13() {
        if (this.f29640x95333f4a != -1 && this.f29639x64b1eea1) {
            this.f29639x64b1eea1 = false;
            m46432xfb5c29ca(this.f29640x95333f4a);
            this.f29640x95333f4a = -1L;
        }
    }

    /* renamed from: forcePauseAllPlayer */
    public void m46447xdcc13257(boolean z17) {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46433xdcc13257(this.f29640x95333f4a, z17);
    }

    /* renamed from: forceResumeAllPlayer */
    public void m46448xdce257ca(boolean z17) {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46434xdce257ca(this.f29640x95333f4a, z17);
    }

    /* renamed from: registerAudioPcmCallback */
    public void m46449x5738f24c(com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeAudioPcmCallback nativeAudioPcmCallback) {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46438x5738f24c(this.f29640x95333f4a, nativeAudioPcmCallback);
    }

    /* renamed from: setJsAsyncCall */
    public int m46450xe58d01ef(long j17) {
        if (this.f29640x95333f4a == -1) {
            return f29637x537c2e1f;
        }
        m46439xe58d01ef(this.f29640x95333f4a, j17);
        return 0;
    }

    /* renamed from: setMute */
    public void m46451x764d819b(boolean z17) {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46440x764d819b(this.f29640x95333f4a, z17);
    }

    /* renamed from: testBind */
    public void m46452xbb9d43ef() {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46441xf596e462(this.f29640x95333f4a);
    }

    /* renamed from: unregisterAudioPcmCallback */
    public void m46453xfc4d05e5() {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46442xfc4d05e5(this.f29640x95333f4a);
    }

    /* renamed from: update */
    public void m46454xce0038c9(long j17) {
        if (this.f29640x95333f4a == -1) {
            return;
        }
        m46443x3efb1ad9(this.f29640x95333f4a, j17);
    }

    /* renamed from: forcePauseAllPlayer */
    public void m46446xdcc13257() {
        m46447xdcc13257(true);
    }
}
