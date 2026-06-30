package com.tencent.mm.libwxaudio;

/* loaded from: classes7.dex */
public class WxAudioNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_WXAUDIO_ERROR = -1000;
    public static int REPEAT_WXAUDIO_ERROR = -1001;
    public static java.lang.String TAG = "MicroMsg.WebAudio.WxAudioNative";
    private boolean initCallBackFlag = false;
    volatile long mNativeInst;

    /* loaded from: classes7.dex */
    public interface NativeAudioPcmCallback {
        void onPcmCallback(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27);
    }

    /* loaded from: classes7.dex */
    public interface NativeCallBackInterface {
        public static final java.lang.String KEY_GET_FILE_PATH_CACHE_DIR = "CACHE_DIR";

        java.lang.String getFilePath(java.lang.String str);

        void onCallBack(long j17, java.lang.String str);
    }

    public WxAudioNative(long j17, long j18, long j19) {
        this.mNativeInst = 0L;
        this.mNativeInst = initBindingWxAudio(j17, j18, j19);
    }

    private native void destroyBindingWxAudio(long j17);

    public static native void forcePauseAllPlayer(long j17, boolean z17);

    public static native void forceResumeAllPlayer(long j17, boolean z17);

    public static native void initAndroidAssetMgr(android.content.res.AssetManager assetManager);

    private native long initBindingWxAudio(long j17, long j18, long j19);

    private native int initCallBack(long j17, com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface nativeCallBackInterface);

    public static native void registerAudioPcmCallback(long j17, com.tencent.mm.libwxaudio.WxAudioNative.NativeAudioPcmCallback nativeAudioPcmCallback);

    private native void setJsAsyncCall(long j17, long j18);

    public static native void setMute(long j17, boolean z17);

    private native void testBindingWxAudio(long j17);

    public static native void unregisterAudioPcmCallback(long j17);

    private native void updateNativeInterface(long j17, long j18);

    public int InitCallBack(final com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface nativeCallBackInterface) {
        if (this.mNativeInst == -1) {
            return NEW_WXAUDIO_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_WXAUDIO_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface(this) { // from class: com.tencent.mm.libwxaudio.WxAudioNative.1
            @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
            public java.lang.String getFilePath(java.lang.String str) {
                return nativeCallBackInterface.getFilePath(str);
            }

            @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
            public void onCallBack(long j17, java.lang.String str) {
                nativeCallBackInterface.onCallBack(j17, str);
            }
        });
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void destroyWebAudioContext() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destroyBindingWxAudio(this.mNativeInst);
            this.mNativeInst = -1L;
        }
    }

    public void forcePauseAllPlayer(boolean z17) {
        if (this.mNativeInst == -1) {
            return;
        }
        forcePauseAllPlayer(this.mNativeInst, z17);
    }

    public void forceResumeAllPlayer(boolean z17) {
        if (this.mNativeInst == -1) {
            return;
        }
        forceResumeAllPlayer(this.mNativeInst, z17);
    }

    public void registerAudioPcmCallback(com.tencent.mm.libwxaudio.WxAudioNative.NativeAudioPcmCallback nativeAudioPcmCallback) {
        if (this.mNativeInst == -1) {
            return;
        }
        registerAudioPcmCallback(this.mNativeInst, nativeAudioPcmCallback);
    }

    public int setJsAsyncCall(long j17) {
        if (this.mNativeInst == -1) {
            return NEW_WXAUDIO_ERROR;
        }
        setJsAsyncCall(this.mNativeInst, j17);
        return 0;
    }

    public void setMute(boolean z17) {
        if (this.mNativeInst == -1) {
            return;
        }
        setMute(this.mNativeInst, z17);
    }

    public void testBind() {
        if (this.mNativeInst == -1) {
            return;
        }
        testBindingWxAudio(this.mNativeInst);
    }

    public void unregisterAudioPcmCallback() {
        if (this.mNativeInst == -1) {
            return;
        }
        unregisterAudioPcmCallback(this.mNativeInst);
    }

    public void update(long j17) {
        if (this.mNativeInst == -1) {
            return;
        }
        updateNativeInterface(this.mNativeInst, j17);
    }

    public void forcePauseAllPlayer() {
        forcePauseAllPlayer(true);
    }
}
