package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class TXLivePusherJni implements com.tencent.rtmp.ITXLivePushListener, com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener, com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener, com.tencent.rtmp.TXLivePusher.ITXSnapshotListener, com.tencent.rtmp.TXLivePusher.OnBGMNotify, com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener, com.tencent.rtmp.b, com.tencent.rtmp.ui.TXCloudVideoView.b {
    private com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener mAudioCustomProcessListener;
    private com.tencent.liteav.audio.TXAudioEffectManager mAudioEffectManager;
    private com.tencent.liteav.beauty.TXBeautyManagerImpl mBeautyManager;
    private com.tencent.rtmp.TXLivePushConfig mConfig;
    private com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener mITXAudioVolumeEvaluationListener;
    private com.tencent.rtmp.ITXLivePushListener mITXLivePushListener;
    private com.tencent.rtmp.TXLivePusher.ITXSnapshotListener mITXSnapshotListener;
    private com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener mITXVideoRecordListener;
    private long mNativeTXLivePusherJni;
    private com.tencent.rtmp.TXLivePusher.OnBGMNotify mOnBGMNotify;
    private com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private int mVideoQuality = -1;

    public TXLivePusherJni(android.content.Context context) {
        this.mNativeTXLivePusherJni = 0L;
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        this.mConfig = new com.tencent.rtmp.TXLivePushConfig();
        long nativeCreate = nativeCreate(new java.lang.ref.WeakReference(this));
        this.mNativeTXLivePusherJni = nativeCreate;
        this.mAudioEffectManager = new com.tencent.liteav.audio.TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(nativeCreate));
        this.mBeautyManager = new com.tencent.liteav.beauty.TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeTXLivePusherJni));
        if (context instanceof android.app.Activity) {
            com.tencent.liteav.base.util.i.a().a((android.app.Activity) context);
        }
    }

    public static java.lang.String[] getMapKeys(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.lang.String[] strArr = new java.lang.String[hashMap.size()];
        java.util.Iterator<java.lang.String> it = hashMap.keySet().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            strArr[i17] = it.next();
            i17++;
        }
        return strArr;
    }

    public static java.lang.String[] getMapValues(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.String[] strArr) {
        java.lang.String[] strArr2 = new java.lang.String[hashMap.size()];
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            strArr2[i18] = hashMap.get(strArr[i17]);
            i17++;
            i18++;
        }
        return strArr2;
    }

    public static boolean isMapValid(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        for (java.lang.String str : hashMap.keySet()) {
            if (str == null || hashMap.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    private static native void nativeCallExperimentalAPI(long j17, java.lang.String str);

    private static native long nativeCreate(java.lang.ref.WeakReference<com.tencent.liteav.live.TXLivePusherJni> weakReference);

    private static native long nativeCreateAudioEffectManager(long j17);

    private static native long nativeCreateBeautyManager(long j17);

    private static native void nativeDestroy(long j17);

    private static native void nativeEnableAudioVolumeEvaluation(long j17, int i17);

    private static native int nativeGetMaxZoom(long j17);

    private static native int nativeGetMusicDuration(long j17, java.lang.String str);

    private static native boolean nativeIsPushing(long j17);

    private static native void nativeOnLogRecord(long j17, java.lang.String str);

    private static native boolean nativePauseBGM(long j17);

    private static native void nativePausePusher(long j17);

    private static native boolean nativePlayBGM(long j17, java.lang.String str);

    private static native boolean nativeResumeBGM(long j17);

    private static native void nativeResumePusher(long j17);

    private static native void nativeSendCustomPCMData(long j17, byte[] bArr);

    private static native void nativeSendCustomVideoFrame(long j17, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj, byte[] bArr);

    private static native void nativeSendMessage(long j17, byte[] bArr);

    private static native boolean nativeSendMessageEx(long j17, byte[] bArr);

    private static native void nativeSetAudioConfig(long j17, int i17, int i18, int i19, boolean z17, boolean z18);

    private static native void nativeSetBGMPitch(long j17, float f17);

    private static native boolean nativeSetBGMPosition(long j17, int i17);

    private static native boolean nativeSetBGMVolume(long j17, float f17);

    private static native boolean nativeSetBeautyFilter(long j17, int i17, int i18, int i19, int i27);

    private static native void nativeSetCaptureConfig(long j17, int i17, int i18, android.graphics.Bitmap bitmap, int i19, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i27);

    private static native void nativeSetEncoderConfig(long j17, int i17, int i18, boolean z17, int i19, int i27, int i28, int i29, int i37, boolean z18, int i38, boolean z19);

    private static native void nativeSetExposureCompensation(long j17, float f17);

    private static native void nativeSetFilter(long j17, android.graphics.Bitmap bitmap);

    private static native void nativeSetFocusPosition(long j17, float f17, float f18);

    private static native boolean nativeSetMicVolume(long j17, float f17);

    private static native boolean nativeSetMirror(long j17, boolean z17);

    private static native void nativeSetMute(long j17, boolean z17);

    private static native void nativeSetNetworkConfig(long j17, int i17, boolean z17, int i18, int i19, int i27, java.util.HashMap hashMap);

    private static native void nativeSetRenderRotation(long j17, int i17);

    private static native void nativeSetReverb(long j17, int i17);

    private static native void nativeSetSpecialRatio(long j17, float f17);

    private static native void nativeSetView(long j17, com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j17, int i17);

    private static native void nativeSetWaterMark(long j17, android.graphics.Bitmap bitmap, float f17, float f18, float f19);

    private static native boolean nativeSetZoom(long j17, int i17);

    private static native void nativeShowDebugView(long j17, boolean z17);

    private static native void nativeSnapshot(long j17);

    private static native void nativeStartCamera(long j17);

    private static native int nativeStartPusher(long j17, java.lang.String str);

    private static native int nativeStartRecord(long j17, java.lang.String str);

    private static native void nativeStartScreenCapture(long j17);

    private static native boolean nativeStopBGM(long j17);

    private static native void nativeStopCameraPreview(long j17, boolean z17);

    private static native void nativeStopPusher(long j17);

    private static native void nativeStopRecord(long j17);

    private static native void nativeStopScreenCapture(long j17);

    private static native void nativeSwitchCamera(long j17);

    private static native boolean nativeTurnOnFlashLight(long j17, boolean z17);

    public static com.tencent.liteav.live.TXLivePusherJni weakToStrongReference(java.lang.ref.WeakReference<com.tencent.liteav.live.TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.rtmp.b
    public void callExperimentalAPI(java.lang.String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public void enableAudioVolumeEvaluation(int i17) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePusherJni, i17);
    }

    public void finalize() {
        super.finalize();
        release();
    }

    @Override // com.tencent.rtmp.b
    public com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.rtmp.b
    public com.tencent.liteav.beauty.TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.rtmp.b
    public com.tencent.rtmp.TXLivePushConfig getConfig() {
        return this.mConfig;
    }

    @Override // com.tencent.rtmp.b
    public int getMaxZoom() {
        return nativeGetMaxZoom(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public int getMusicDuration(java.lang.String str) {
        return nativeGetMusicDuration(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public boolean isPushing() {
        return nativeIsPushing(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i17) {
        com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mITXAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i17);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMComplete(int i17) {
        com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMComplete(i17);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMProgress(long j17, long j18) {
        com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMProgress(j17, j18);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMStart() {
        com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMStart();
        }
    }

    public int onCustomPreprocessFrame(int i17, int i18, int i19) {
        return onTextureCustomProcess(i17, i18, i19);
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onDetectFacePoints(float[] fArr) {
        com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onDetectFacePoints(fArr);
        }
    }

    @Override // com.tencent.rtmp.b
    public void onLogRecord(java.lang.String str) {
        nativeOnLogRecord(this.mNativeTXLivePusherJni, str);
    }

    public byte[] onNativeRecordPcmData(byte[] bArr, long j17, int i17, int i18, int i19) {
        onRecordPcmData(bArr, j17, i17, i18, i19);
        return bArr;
    }

    public byte[] onNativeRecordRawPcmData(byte[] bArr, long j17, int i17, int i18, int i19, boolean z17) {
        onRecordRawPcmData(bArr, j17, i17, i18, i19, z17);
        return bArr;
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onNetStatus(android.os.Bundle bundle) {
        com.tencent.rtmp.ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onNetStatus(bundle);
        }
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onPushEvent(int i17, android.os.Bundle bundle) {
        com.tencent.rtmp.ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onPushEvent(i17, bundle);
        }
    }

    public void onRecordComplete(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            com.tencent.ugc.TXRecordCommon.TXRecordResult tXRecordResult = new com.tencent.ugc.TXRecordCommon.TXRecordResult();
            if (i17 == 0) {
                tXRecordResult.retCode = 0;
            } else {
                tXRecordResult.retCode = -1;
            }
            tXRecordResult.descMsg = str;
            tXRecordResult.videoPath = str2;
            tXRecordResult.coverPath = str3;
            iTXVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    public void onRecordEvent(int i17, android.os.Bundle bundle) {
        com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i17, bundle);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordPcmData(byte[] bArr, long j17, int i17, int i18, int i19) {
        com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordPcmData(bArr, j17, i17, i18, i19);
        }
    }

    public void onRecordProgress(long j17) {
        com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j17);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordRawPcmData(byte[] bArr, long j17, int i17, int i18, int i19, boolean z17) {
        com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordRawPcmData(bArr, j17, i17, i18, i19, z17);
        }
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z17) {
        nativeShowDebugView(this.mNativeTXLivePusherJni, z17);
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
    public void onSnapshot(android.graphics.Bitmap bitmap) {
        com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener = this.mITXSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public int onTextureCustomProcess(int i17, int i18, int i19) {
        com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.onTextureCustomProcess(i17, i18, i19);
        }
        return -1;
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onTextureDestoryed() {
        com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestoryed();
        }
    }

    @Override // com.tencent.rtmp.b
    public boolean pauseBGM() {
        return nativePauseBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void pausePusher() {
        nativePausePusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public boolean playBGM(java.lang.String str) {
        return nativePlayBGM(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public void release() {
        com.tencent.liteav.beauty.TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j17 = this.mNativeTXLivePusherJni;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativeTXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.rtmp.b
    public boolean resumeBGM() {
        return nativeResumeBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void resumePusher() {
        nativeResumePusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void sendCustomPCMData(byte[] bArr) {
        nativeSendCustomPCMData(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.b
    public int sendCustomVideoData(byte[] bArr, int i17, int i18, int i19) {
        com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType;
        if (i17 == 3) {
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420;
        } else {
            if (i17 != 5) {
                return -3;
            }
            pixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA;
        }
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, i18, i19, com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY.mValue, pixelFormatType.getValue(), -1, null, bArr);
        return 0;
    }

    @Override // com.tencent.rtmp.b
    public int sendCustomVideoTexture(int i17, int i18, int i19) {
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext == null) {
            return -1;
        }
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, i18, i19, com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D.mValue, com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA.getValue(), i17, eglGetCurrentContext, null);
        return 0;
    }

    @Override // com.tencent.rtmp.b
    public void sendMessage(byte[] bArr) {
        nativeSendMessage(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.b
    public boolean sendMessageEx(byte[] bArr) {
        return nativeSendMessageEx(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.b
    public void setAudioProcessListener(com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
        this.mAudioCustomProcessListener = audioCustomProcessListener;
    }

    @Override // com.tencent.rtmp.b
    public void setAudioVolumeEvaluationListener(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mITXAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.b
    public void setBGMNofify(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify) {
        this.mOnBGMNotify = onBGMNotify;
    }

    @Override // com.tencent.rtmp.b
    public void setBGMPitch(float f17) {
        nativeSetBGMPitch(this.mNativeTXLivePusherJni, f17);
    }

    @Override // com.tencent.rtmp.b
    public boolean setBGMPosition(int i17) {
        return nativeSetBGMPosition(this.mNativeTXLivePusherJni, i17);
    }

    @Override // com.tencent.rtmp.b
    public boolean setBGMVolume(float f17) {
        return nativeSetBGMVolume(this.mNativeTXLivePusherJni, f17);
    }

    @Override // com.tencent.rtmp.b
    public boolean setBeautyFilter(int i17, int i18, int i19, int i27) {
        return nativeSetBeautyFilter(this.mNativeTXLivePusherJni, i17, i18, i19, i27);
    }

    @Override // com.tencent.rtmp.b
    public void setChinLevel(int i17) {
        this.mBeautyManager.setChinLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public void setConfig(com.tencent.rtmp.TXLivePushConfig tXLivePushConfig) {
        if (tXLivePushConfig == null) {
            return;
        }
        this.mConfig = tXLivePushConfig;
        nativeSetCaptureConfig(this.mNativeTXLivePusherJni, tXLivePushConfig.mCustomModeType, tXLivePushConfig.mLocalVideoMirrorType, tXLivePushConfig.mPauseImg, tXLivePushConfig.mPauseFps, tXLivePushConfig.mFrontCamera, tXLivePushConfig.mTouchFocus, tXLivePushConfig.mEnableZoom, tXLivePushConfig.mEnableScreenCaptureAutoRotate, tXLivePushConfig.mEnableHighResolutionCapture, tXLivePushConfig.mPauseFlag);
        long j17 = this.mNativeTXLivePusherJni;
        com.tencent.rtmp.TXLivePushConfig tXLivePushConfig2 = this.mConfig;
        int i17 = tXLivePushConfig2.mHomeOrientation;
        int ordinal = tXLivePushConfig2.mVideoResolution.ordinal();
        com.tencent.rtmp.TXLivePushConfig tXLivePushConfig3 = this.mConfig;
        nativeSetEncoderConfig(j17, i17, ordinal, tXLivePushConfig3.mAutoAdjustBitrate, tXLivePushConfig3.mVideoBitrate, tXLivePushConfig3.mMaxVideoBitrate, tXLivePushConfig3.mMinVideoBitrate, tXLivePushConfig3.mVideoEncodeGop, tXLivePushConfig3.mVideoFPS, tXLivePushConfig3.mVideoEncoderXMirror, tXLivePushConfig3.mHardwareAccel, tXLivePushConfig3.mEnableVideoHardEncoderMainProfile);
        long j18 = this.mNativeTXLivePusherJni;
        com.tencent.rtmp.TXLivePushConfig tXLivePushConfig4 = this.mConfig;
        nativeSetWaterMark(j18, tXLivePushConfig4.mWatermark, tXLivePushConfig4.mWatermarkXF, tXLivePushConfig4.mWatermarkYF, tXLivePushConfig4.mWatermarkWidth);
        long j19 = this.mNativeTXLivePusherJni;
        com.tencent.rtmp.TXLivePushConfig tXLivePushConfig5 = this.mConfig;
        nativeSetAudioConfig(j19, tXLivePushConfig5.mAudioChannels, tXLivePushConfig5.mAudioSample, tXLivePushConfig5.mVolumeType, tXLivePushConfig5.mEnableAudioPreview, tXLivePushConfig5.mEnableAns);
        long j27 = this.mNativeTXLivePusherJni;
        com.tencent.rtmp.TXLivePushConfig tXLivePushConfig6 = this.mConfig;
        nativeSetNetworkConfig(j27, tXLivePushConfig6.mAutoAdjustStrategy, tXLivePushConfig6.mEnablePureAudioPush, tXLivePushConfig6.mConnectRetryCount, tXLivePushConfig6.mConnectRetryInterval, tXLivePushConfig6.mRtmpChannelType, tXLivePushConfig6.mMetaData);
    }

    @Override // com.tencent.rtmp.b
    public void setExposureCompensation(float f17) {
        nativeSetExposureCompensation(this.mNativeTXLivePusherJni, f17);
    }

    @Override // com.tencent.rtmp.b
    public void setEyeScaleLevel(int i17) {
        this.mBeautyManager.setEyeScaleLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public void setFaceShortLevel(int i17) {
        this.mBeautyManager.setFaceShortLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public void setFaceSlimLevel(int i17) {
        this.mBeautyManager.setFaceSlimLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public void setFaceVLevel(int i17) {
        this.mBeautyManager.setFaceVLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public void setFilter(android.graphics.Bitmap bitmap) {
        nativeSetFilter(this.mNativeTXLivePusherJni, bitmap);
    }

    @Override // com.tencent.rtmp.b
    public void setFocusPosition(float f17, float f18) {
        nativeSetFocusPosition(this.mNativeTXLivePusherJni, f17, f18);
    }

    @Override // com.tencent.rtmp.b
    public boolean setGreenScreenFile(java.lang.String str) {
        return this.mBeautyManager.setGreenScreenFile(str) != 0;
    }

    @Override // com.tencent.rtmp.b
    public boolean setMicVolume(float f17) {
        return nativeSetMicVolume(this.mNativeTXLivePusherJni, f17);
    }

    @Override // com.tencent.rtmp.b
    public boolean setMirror(boolean z17) {
        return nativeSetMirror(this.mNativeTXLivePusherJni, z17);
    }

    @Override // com.tencent.rtmp.b
    public void setMotionMute(boolean z17) {
        this.mBeautyManager.setMotionMute(z17);
    }

    @Override // com.tencent.rtmp.b
    public void setMotionTmpl(java.lang.String str) {
        this.mBeautyManager.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.b
    public void setMute(boolean z17) {
        nativeSetMute(this.mNativeTXLivePusherJni, z17);
    }

    @Override // com.tencent.rtmp.b
    public void setNoseSlimLevel(int i17) {
        this.mBeautyManager.setNoseSlimLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        this.mITXLivePushListener = iTXLivePushListener;
    }

    @Override // com.tencent.rtmp.b
    public void setRenderRotation(int i17) {
        nativeSetRenderRotation(this.mNativeTXLivePusherJni, i17);
    }

    @Override // com.tencent.rtmp.b
    public void setReverb(int i17) {
        nativeSetReverb(this.mNativeTXLivePusherJni, i17);
    }

    @Override // com.tencent.rtmp.b
    public void setSpecialRatio(float f17) {
        nativeSetSpecialRatio(this.mNativeTXLivePusherJni, f17);
    }

    @Override // com.tencent.rtmp.b
    public void setSurface(android.view.Surface surface) {
        nativeSetView(this.mNativeTXLivePusherJni, new com.tencent.liteav.videobase.videobase.DisplayTarget(surface));
    }

    @Override // com.tencent.rtmp.b
    public void setSurfaceSize(int i17, int i18) {
    }

    @Override // com.tencent.rtmp.b
    public void setVideoProcessListener(com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        this.mVideoCustomProcessListener = videoCustomProcessListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.rtmp.b
    public void setVideoQuality(int i17, boolean z17, boolean z18) {
        java.lang.Object[] objArr = z17 && z18;
        this.mConfig.setHardwareAcceleration(1);
        this.mConfig.setAutoAdjustBitrate(z17);
        switch (i17) {
            case 1:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(z18 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(301);
                } else {
                    this.mConfig.setMinVideoBitrate(500);
                }
                this.mConfig.setVideoBitrate(800);
                this.mConfig.setMaxVideoBitrate(900);
                break;
            case 2:
                this.mConfig.setVideoResolution(1);
                this.mConfig.setAutoAdjustStrategy(z18 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(800);
                }
                this.mConfig.setVideoBitrate(1200);
                this.mConfig.setMaxVideoBitrate(1500);
                break;
            case 3:
                this.mConfig.setVideoResolution(2);
                this.mConfig.setAutoAdjustStrategy(z18 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(1000);
                }
                this.mConfig.setVideoBitrate(1800);
                this.mConfig.setMaxVideoBitrate(1800);
                break;
            case 4:
                int i18 = this.mVideoQuality;
                if (i18 == 1) {
                    this.mConfig.setVideoResolution(0);
                    this.mConfig.setMinVideoBitrate(500);
                    this.mConfig.setVideoBitrate(800);
                    this.mConfig.setMaxVideoBitrate(900);
                } else if (i18 == 3) {
                    this.mConfig.setVideoResolution(2);
                    this.mConfig.setMinVideoBitrate(1000);
                    this.mConfig.setVideoBitrate(1800);
                    this.mConfig.setMaxVideoBitrate(1800);
                } else if (i18 == 7) {
                    this.mConfig.setVideoResolution(30);
                    this.mConfig.setMinVideoBitrate(2000);
                    this.mConfig.setVideoBitrate(3000);
                    this.mConfig.setMaxVideoBitrate(3000);
                } else {
                    this.mConfig.setVideoResolution(1);
                    this.mConfig.setMinVideoBitrate(800);
                    this.mConfig.setVideoBitrate(1200);
                    this.mConfig.setMaxVideoBitrate(1500);
                }
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 5:
                this.mConfig.setVideoResolution(6);
                this.mConfig.setMinVideoBitrate(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                this.mConfig.setVideoBitrate(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                this.mConfig.setMaxVideoBitrate(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 6:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(5);
                this.mConfig.setVideoEncodeGop(1);
                this.mConfig.setMinVideoBitrate(190);
                this.mConfig.setVideoBitrate(400);
                this.mConfig.setMaxVideoBitrate(810);
                break;
            case 7:
                this.mConfig.setVideoResolution(30);
                this.mConfig.setAutoAdjustStrategy(z18 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(2500);
                }
                this.mConfig.setVideoBitrate(3000);
                this.mConfig.setMaxVideoBitrate(3000);
                break;
            default:
                return;
        }
        this.mVideoQuality = i17;
        setConfig(this.mConfig);
    }

    @Override // com.tencent.rtmp.b
    public void setVideoRecordListener(com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mITXVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.b
    public void setVoiceChangerType(int i17) {
        nativeSetVoiceChangerType(this.mNativeTXLivePusherJni, i17);
    }

    @Override // com.tencent.rtmp.b
    public boolean setZoom(int i17) {
        return nativeSetZoom(this.mNativeTXLivePusherJni, i17);
    }

    @Override // com.tencent.rtmp.b
    public void snapshot(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.mITXSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void startCameraPreview(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            com.tencent.liteav.live.a.a(tXCloudVideoView, new java.lang.ref.WeakReference(this));
            nativeShowDebugView(this.mNativeTXLivePusherJni, com.tencent.liteav.live.a.a(tXCloudVideoView));
        }
        nativeSetView(this.mNativeTXLivePusherJni, new com.tencent.liteav.videobase.videobase.DisplayTarget(tXCloudVideoView));
        nativeStartCamera(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public int startPusher(java.lang.String str) {
        return nativeStartPusher(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public int startRecord(java.lang.String str) {
        return nativeStartRecord(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public void startScreenCapture() {
        nativeStartScreenCapture(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public boolean stopBGM() {
        return nativeStopBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void stopCameraPreview(boolean z17) {
        nativeStopCameraPreview(this.mNativeTXLivePusherJni, z17);
    }

    @Override // com.tencent.rtmp.b
    public void stopPusher() {
        nativeStopPusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void stopRecord() {
        nativeStopRecord(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void stopScreenCapture() {
        nativeStopScreenCapture(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void switchCamera() {
        this.mConfig.setFrontCamera(!r0.mFrontCamera);
        nativeSwitchCamera(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public boolean turnOnFlashLight(boolean z17) {
        return nativeTurnOnFlashLight(this.mNativeTXLivePusherJni, z17);
    }
}
