package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes14.dex */
public class TXLivePlayerJni implements com.tencent.rtmp.a, com.tencent.rtmp.ui.TXCloudVideoView.b {
    private static final java.lang.String TAG = "TXLivePlayerJni";
    private com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
    private com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeEvaluationListener;
    private java.lang.Object mGLContext = null;
    private com.tencent.rtmp.ITXLivePlayListener mListener;
    protected long mNativeTXLivePlayerJni;
    private com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private com.tencent.rtmp.TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;
    private com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener mVideoRenderListener;

    public TXLivePlayerJni(android.content.Context context) {
        this.mNativeTXLivePlayerJni = 0L;
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeTXLivePlayerJni = nativeCreate(new java.lang.ref.WeakReference(this));
    }

    private static java.lang.String genFilePath(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return null;
        }
        try {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
            java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date(java.lang.Long.valueOf(valueOf + "000").longValue()));
            java.lang.String diskFileDir = getDiskFileDir(context);
            if (android.text.TextUtils.isEmpty(diskFileDir)) {
                return null;
            }
            return new java.io.File(diskFileDir, java.lang.String.format("TXUGC_%s".concat(java.lang.String.valueOf(str)), format)).getAbsolutePath();
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "create file path failed.", e17);
            return null;
        }
    }

    private static java.lang.String getDiskFileDir(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(android.os.Environment.getExternalStorageState()) && android.os.Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_MOVIES);
        return externalFilesDir != null ? externalFilesDir.getPath() : null;
    }

    public static java.lang.String[] getMapKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] strArr = new java.lang.String[map.size()];
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            strArr[i17] = it.next();
            i17++;
        }
        return strArr;
    }

    public static java.lang.String[] getMapValues(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String[] strArr) {
        java.lang.String[] strArr2 = new java.lang.String[map.size()];
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            strArr2[i18] = map.get(strArr[i17]);
            i17++;
            i18++;
        }
        return strArr2;
    }

    private static native void nativeCallExperimentalAPI(long j17, java.lang.String str);

    private static native long nativeCreate(java.lang.ref.WeakReference<com.tencent.liteav.live.TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j17);

    private static native void nativeEnableAudioVolumeEvaluation(long j17, int i17);

    private static native void nativeEnableCustomAudioProcess(long j17, boolean z17);

    private static native void nativeEnableCustomRenderI420(long j17, boolean z17);

    private static native void nativeEnableCustomRenderTexture(long j17, boolean z17, java.lang.Object obj);

    private static native void nativeEnableHardwareDecode(long j17, boolean z17);

    private static native long nativeGetCurrentRenderPts(long j17);

    private static native boolean nativeIsPlaying(long j17);

    private static native void nativePause(long j17);

    private static native void nativeResume(long j17);

    private static native void nativeSetAudioRoute(long j17, int i17);

    private static native void nativeSetConfig(long j17, float f17, float f18, float f19, int i17, int i18, int i19, boolean z17, boolean z18, boolean z19, java.lang.String str, java.util.Map map);

    private static native void nativeSetMute(long j17, boolean z17);

    private static native void nativeSetPlayerView(long j17, com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget);

    private static native void nativeSetRenderMode(long j17, int i17);

    private static native void nativeSetRenderRotation(long j17, int i17);

    private static native void nativeSetVolume(long j17, int i17);

    private static native void nativeShowDebugView(long j17, boolean z17);

    private static native void nativeSnapshot(long j17);

    private static native int nativeStartPlay(long j17, java.lang.String str, int i17);

    private static native void nativeStartRecord(long j17, int i17, java.lang.String str);

    private static native void nativeStopPlay(long j17, boolean z17);

    private static native void nativeStopRecord(long j17);

    private static native int nativeSwitchStream(long j17, java.lang.String str);

    public static com.tencent.liteav.live.TXLivePlayerJni weakToStrongReference(java.lang.ref.WeakReference<com.tencent.liteav.live.TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    public boolean addVideoRawData(byte[] bArr) {
        return false;
    }

    @Override // com.tencent.rtmp.a
    public void callExperimentalAPI(java.lang.String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePlayerJni, str);
    }

    @Override // com.tencent.rtmp.a
    public void enableAudioVolumeEvaluation(int i17) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePlayerJni, i17);
    }

    @Override // com.tencent.rtmp.a
    public boolean enableHardwareDecode(boolean z17) {
        nativeEnableHardwareDecode(this.mNativeTXLivePlayerJni, z17);
        return true;
    }

    public void finalize() {
        nativeDestroy(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public long getCurrentRenderPts() {
        return nativeGetCurrentRenderPts(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public boolean isPlaying() {
        return nativeIsPlaying(this.mNativeTXLivePlayerJni);
    }

    public void onAudioInfoChanged(int i17, int i18, int i19) {
        com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i17, i18, i19);
        }
    }

    public void onAudioVolumeEvaluationNotify(int i17) {
        com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i17);
        }
    }

    public void onNetStatus(android.os.Bundle bundle) {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    public void onPcmDataAvailable(byte[] bArr, long j17) {
        com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onPcmDataAvailable(bArr, j17);
        }
    }

    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(i17, bundle);
        }
    }

    public void onRecordComplete(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
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
        com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i17, bundle);
        }
    }

    public void onRecordProgress(long j17) {
        com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j17);
        }
    }

    public void onRenderVideoFrame(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, long j17, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.mVideoRenderListener;
        if (iTXLivePlayVideoRenderListener != null) {
            com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture();
            tXLiteAVTexture.textureId = i19;
            tXLiteAVTexture.width = i27;
            tXLiteAVTexture.height = i28;
            tXLiteAVTexture.eglContext = obj;
            iTXLivePlayVideoRenderListener.onRenderVideoFrame(tXLiteAVTexture);
        }
        com.tencent.rtmp.TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.mVideoRawDataListener;
        if (iTXVideoRawDataListener != null) {
            iTXVideoRawDataListener.onVideoRawDataAvailable(bArr, i27, i28, (int) j17);
        }
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z17) {
        showDebugView(z17);
    }

    public void onSnapshot(android.graphics.Bitmap bitmap) {
        com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.a
    public void pause() {
        nativePause(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public void resume() {
        nativeResume(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRawDataListener(com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mAudioRawDataListener = iTXAudioRawDataListener;
        nativeEnableCustomAudioProcess(this.mNativeTXLivePlayerJni, iTXAudioRawDataListener != null);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRoute(int i17) {
        nativeSetAudioRoute(this.mNativeTXLivePlayerJni, i17);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioVolumeEvaluationListener(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.a
    public void setConfig(com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig) {
        if (tXLivePlayConfig == null) {
            return;
        }
        nativeSetConfig(this.mNativeTXLivePlayerJni, tXLivePlayConfig.getCacheTime(), tXLivePlayConfig.getMaxAutoAdjustCacheTime(), tXLivePlayConfig.getMinAutoAdjustCacheTime(), tXLivePlayConfig.getVideoBlockThreshold(), tXLivePlayConfig.getConnectRetryCount(), tXLivePlayConfig.getConnectRetryInterval(), tXLivePlayConfig.isAutoAdjustCacheTime(), tXLivePlayConfig.isEnableMessage(), tXLivePlayConfig.isEnableMetaData(), tXLivePlayConfig.getFlvSessionKey(), tXLivePlayConfig.getHeaders());
    }

    @Override // com.tencent.rtmp.a
    public void setMute(boolean z17) {
        nativeSetMute(this.mNativeTXLivePlayerJni, z17);
    }

    @Override // com.tencent.rtmp.a
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    @Override // com.tencent.rtmp.a
    public void setPlayerView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            com.tencent.liteav.live.a.a(tXCloudVideoView, new java.lang.ref.WeakReference(this));
            showDebugView(com.tencent.liteav.live.a.a(tXCloudVideoView));
        }
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, tXCloudVideoView != null ? new com.tencent.liteav.videobase.videobase.DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.rtmp.a
    public void setRenderMode(int i17) {
        nativeSetRenderMode(this.mNativeTXLivePlayerJni, i17);
    }

    @Override // com.tencent.rtmp.a
    public void setRenderRotation(int i17) {
        nativeSetRenderRotation(this.mNativeTXLivePlayerJni, i17);
    }

    @Override // com.tencent.rtmp.a
    public void setSurface(android.view.Surface surface) {
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, surface != null ? new com.tencent.liteav.videobase.videobase.DisplayTarget(surface) : null);
    }

    @Override // com.tencent.rtmp.a
    public void setSurfaceSize(int i17, int i18) {
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRawDataListener(com.tencent.rtmp.TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        synchronized (this) {
            if (this.mVideoRenderListener != null) {
                this.mVideoRenderListener = null;
                this.mGLContext = null;
                nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, null);
            }
            this.mVideoRawDataListener = iTXVideoRawDataListener;
            nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, iTXVideoRawDataListener != null);
        }
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRecordListener(com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.a
    public int setVideoRenderListener(com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, java.lang.Object obj) {
        synchronized (this) {
            if (this.mVideoRawDataListener != null) {
                this.mVideoRawDataListener = null;
                nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
            }
            this.mVideoRenderListener = iTXLivePlayVideoRenderListener;
            if (iTXLivePlayVideoRenderListener == null) {
                obj = null;
            }
            this.mGLContext = obj;
            nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, iTXLivePlayVideoRenderListener != null, obj);
        }
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public void setVolume(int i17) {
        nativeSetVolume(this.mNativeTXLivePlayerJni, i17);
    }

    @Override // com.tencent.rtmp.a
    public void showDebugView(boolean z17) {
        nativeShowDebugView(this.mNativeTXLivePlayerJni, z17);
    }

    @Override // com.tencent.rtmp.a
    public void snapshot(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public int startLivePlay(java.lang.String str, int i17) {
        return nativeStartPlay(this.mNativeTXLivePlayerJni, str, i17);
    }

    @Override // com.tencent.rtmp.a
    public int startRecord(int i17) {
        java.lang.String genFilePath = genFilePath(com.tencent.liteav.base.ContextUtils.getApplicationContext(), ".mp4");
        if (android.text.TextUtils.isEmpty(genFilePath)) {
            return -1;
        }
        nativeStartRecord(this.mNativeTXLivePlayerJni, i17, genFilePath);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int stopPlay(boolean z17) {
        nativeStopPlay(this.mNativeTXLivePlayerJni, z17);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int stopRecord() {
        nativeStopRecord(this.mNativeTXLivePlayerJni);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int switchStream(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            return nativeSwitchStream(this.mNativeTXLivePlayerJni, str);
        }
        com.tencent.liteav.base.util.LiteavLog.e(TAG, "Invalid params.");
        return -1;
    }
}
