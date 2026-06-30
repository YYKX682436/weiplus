package com.tencent.liteav.trtc;

/* loaded from: classes16.dex */
public class TRTCCloudImpl extends com.tencent.trtc.TRTCCloud implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f46567a;

    /* renamed from: b, reason: collision with root package name */
    private static com.tencent.liteav.trtc.TRTCCloudImpl f46568b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f46569c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.trtc.TRTCCloudListener f46570d;

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.liteav.trtc.TrtcCloudJni f46571e;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.trtc.TRTCCloud.BGMNotify f46572f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.audio.TXAudioEffectManagerImpl f46573g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.liteav.device.TXDeviceManagerImpl f46574h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.liteav.beauty.TXBeautyManagerImpl f46575i;

    /* renamed from: j, reason: collision with root package name */
    private int f46576j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.liteav.trtc.TRTCCloudImpl> f46577k = new java.util.ArrayList<>();

    private TRTCCloudImpl(android.content.Context context, boolean z17) {
        b(context);
        this.f46569c = context;
        a(context, 0L, z17);
    }

    private static void b(android.content.Context context) {
        synchronized (com.tencent.liteav.trtc.TRTCCloudImpl.class) {
            if (!f46567a) {
                com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
                com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
                com.tencent.liteav.trtc.TrtcCloudJni.init(0);
                f46567a = true;
            }
            if (context instanceof android.app.Activity) {
                com.tencent.liteav.base.util.i.a().a((android.app.Activity) context);
            }
        }
    }

    private java.lang.String c() {
        return this.f46569c.getCacheDir() + java.io.File.separator + "liteav_effect";
    }

    public static com.tencent.trtc.TRTCCloud createInstance(android.content.Context context) {
        return new com.tencent.liteav.trtc.TRTCCloudImpl(context, false);
    }

    public static void destroyInstance(com.tencent.trtc.TRTCCloud tRTCCloud) {
        if (tRTCCloud instanceof com.tencent.liteav.trtc.TRTCCloudImpl) {
            ((com.tencent.liteav.trtc.TRTCCloudImpl) tRTCCloud).b();
        } else {
            com.tencent.liteav.base.util.LiteavLog.w("TRTCCloudImpl", "destroyInstance trtcCloud=".concat(java.lang.String.valueOf(tRTCCloud)));
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(java.lang.String str) {
        this.f46571e.connectOtherRoom(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        this.f46571e.disconnectOtherRoom();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void addListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener) {
        this.f46571e.addListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public java.lang.String callExperimentalAPI(java.lang.String str) {
        return this.f46571e.callExperimentalAPI(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int checkAudioCapabilitySupport(int i17) {
        return (i17 == 2 && this.f46574h.isLowLatencyEarMonitorSupported()) ? 1 : 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public com.tencent.trtc.TRTCCloud createSubCloud() {
        com.tencent.liteav.trtc.TRTCCloudImpl tRTCCloudImpl;
        synchronized (com.tencent.liteav.trtc.TRTCCloudImpl.class) {
            tRTCCloudImpl = new com.tencent.liteav.trtc.TRTCCloudImpl(com.tencent.liteav.base.ContextUtils.getApplicationContext(), this.f46571e.getTrtcCloudJni());
            this.f46577k.add(tRTCCloudImpl);
        }
        return tRTCCloudImpl;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(com.tencent.trtc.TRTCCloud tRTCCloud) {
        synchronized (com.tencent.liteav.trtc.TRTCCloudImpl.class) {
            if (tRTCCloud instanceof com.tencent.liteav.trtc.TRTCCloudImpl) {
                com.tencent.liteav.base.util.LiteavLog.i("TRTCCloudImpl", "destructor destroySubCloud");
                ((com.tencent.liteav.trtc.TRTCCloudImpl) tRTCCloud).b();
                this.f46577k.remove(tRTCCloud);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enable3DSpatialAudioEffect(boolean z17) {
        this.f46571e.enable3DSpatialAudioEffect(z17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioEarMonitoring(boolean z17) {
        this.f46573g.enableVoiceEarMonitor(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.f46571e.enableAudioVolumeEvaluation(z17, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z17) {
        this.f46571e.enableCustomAudioCapture(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioRendering(boolean z17) {
        this.f46571e.enableCustomAudioRendering(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(int i17, boolean z17) {
        this.f46571e.enableCustomVideoCapture(i17, z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return this.f46571e.enableEncSmallVideoStream(z17, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableMixExternalAudioFrame(boolean z17, boolean z18) {
        this.f46571e.enableMixExternalAudioFrame(z17, z18);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enablePayloadPrivateEncryption(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        return this.f46571e.enablePayloadPrivateEncryption(z17, tRTCPayloadPrivateEncryptionConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean enableTorch(boolean z17) {
        return this.f46574h.enableCameraTorch(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams, int i17) {
        this.f46571e.enterRoom(tRTCParams, i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        this.f46571e.exitRoom();
        try {
            java.io.File file = new java.io.File(c());
            if (file.exists() && file.isDirectory() && com.tencent.liteav.base.util.e.a(file, 5) > 52428800) {
                for (java.io.File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.w("TRTCCloudImpl", "clearCache error " + e17.toString());
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public long generateCustomPTS() {
        return com.tencent.liteav.base.util.TimeUtil.a();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return this.f46571e.getAudioCaptureVolume();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager() {
        return this.f46573g;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return this.f46571e.getAudioPlayoutVolume();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int getBGMDuration(java.lang.String str) {
        return (int) this.f46573g.getMusicDurationInMS(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public com.tencent.liteav.beauty.TXBeautyManager getBeautyManager() {
        return this.f46575i;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void getCustomAudioRenderingFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f46571e.getCustomAudioRenderingFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public com.tencent.liteav.device.TXDeviceManager getDeviceManager() {
        return this.f46574h;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.f46574h.isCameraAutoFocusFaceModeSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.f46574h.isCameraFocusPositionInPreviewSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraTorchSupported() {
        return this.f46574h.isCameraTorchSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraZoomSupported() {
        return this.f46574h.isCameraZoomSupported();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int mixExternalAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return -1;
        }
        return this.f46571e.mixExternalAudioFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(boolean z17) {
        this.f46571e.muteAllRemoteAudio(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z17) {
        this.f46571e.muteAllRemoteVideoStreams(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(boolean z17) {
        this.f46571e.muteLocalAudio(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(int i17, boolean z17) {
        this.f46571e.muteLocalVideo(i17, z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(java.lang.String str, boolean z17) {
        this.f46571e.muteRemoteAudio(str, z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(java.lang.String str, int i17, boolean z17) {
        this.f46571e.muteRemoteVideoStream(str, i17, z17);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        com.tencent.trtc.TRTCCloud.BGMNotify bGMNotify = this.f46572f;
        if (bGMNotify != null) {
            bGMNotify.onBGMComplete(i18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
        com.tencent.trtc.TRTCCloud.BGMNotify bGMNotify = this.f46572f;
        if (bGMNotify != null) {
            bGMNotify.onBGMProgress(j17, j18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        com.tencent.trtc.TRTCCloud.BGMNotify bGMNotify = this.f46572f;
        if (bGMNotify != null) {
            bGMNotify.onBGMStart(i18);
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseAudioEffect(int i17) {
        this.f46573g.pauseAudioEffect(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseBGM() {
        this.f46573g.pausePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
        this.f46571e.pauseScreenCapture(this.f46576j);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playAudioEffect(com.tencent.trtc.TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        if (tRTCAudioEffectParam == null) {
            return;
        }
        final int i17 = tRTCAudioEffectParam.effectId;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = new com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam(i17, b(tRTCAudioEffectParam.path));
        audioMusicParam.publish = tRTCAudioEffectParam.publish;
        audioMusicParam.loopCount = tRTCAudioEffectParam.loopCount;
        audioMusicParam.isShortFile = true;
        this.f46573g.playAudioEffect(audioMusicParam);
        this.f46573g.setEffectObserver(i17, new com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.liteav.trtc.TRTCCloudImpl.1
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onComplete(int i18, int i19) {
                com.tencent.trtc.TRTCCloudListener tRTCCloudListener = com.tencent.liteav.trtc.TRTCCloudImpl.this.f46570d;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onAudioEffectFinished(i17, i19);
                }
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onPlayProgress(int i18, long j17, long j18) {
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onStart(int i18, int i19) {
                com.tencent.trtc.TRTCCloudListener tRTCCloudListener = com.tencent.liteav.trtc.TRTCCloudImpl.this.f46570d;
                if (tRTCCloudListener == null || i19 >= 0) {
                    return;
                }
                tRTCCloudListener.onAudioEffectFinished(i17, i19);
            }
        });
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playBGM(java.lang.String str, com.tencent.trtc.TRTCCloud.BGMNotify bGMNotify) {
        this.f46572f = bGMNotify;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = new com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam(Integer.MAX_VALUE, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        this.f46573g.setMusicObserver(Integer.MAX_VALUE, this);
        this.f46573g.startPlayMusic(audioMusicParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void removeListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener) {
        this.f46571e.removeListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeAudioEffect(int i17) {
        this.f46573g.resumeAudioEffect(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeBGM() {
        this.f46573g.resumePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
        this.f46571e.resumeScreenCapture(this.f46576j);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void selectMotionTmpl(java.lang.String str) {
        this.f46575i.setMotionTmpl(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f46571e.sendCustomAudioData(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i17, byte[] bArr, boolean z17, boolean z18) {
        if (bArr != null) {
            return this.f46571e.sendCustomCmdMsg(i17, bArr, z17, z18);
        }
        com.tencent.liteav.base.util.LiteavLog.w("TRTCCloudImpl", "custom msg data is null.");
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            com.tencent.liteav.base.util.LiteavLog.w("TRTCCloudImpl", "sendCustomVideoData frame is null");
            return;
        }
        if (tRTCVideoFrame.bufferType == 3) {
            android.opengl.GLES20.glFinish();
        }
        this.f46571e.sendCustomVideoData(i17, tRTCVideoFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i17) {
        if (bArr != null && i17 != 0) {
            return this.f46571e.sendSEIMsg(bArr, i17);
        }
        com.tencent.liteav.base.util.LiteavLog.w("TRTCCloudImpl", "sei msg data is null or repeatCount is zero.");
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void set3DSpatialReceivingRange(java.lang.String str, int i17) {
        this.f46571e.set3DSpatialReceivingRange(str, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAllAudioEffectsVolume(int i17) {
        this.f46573g.setAllAudioEffectsVolume(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i17) {
        this.f46571e.setAudioCaptureVolume(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioEffectVolume(int i17, int i18) {
        this.f46573g.setAudioEffectVolume(i17, i18);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f46571e.setAudioFrameListener(tRTCAudioFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i17) {
        this.f46571e.setAudioPlayoutVolume(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioQuality(int i17) {
        this.f46571e.setAudioQuality(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i17) {
        this.f46574h.setAudioRoute(com.tencent.liteav.device.TXDeviceManagerImpl.audioRouteFromInt(i17));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPlayoutVolume(int i17) {
        this.f46573g.setMusicPlayoutVolume(Integer.MAX_VALUE, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setBGMPosition(int i17) {
        this.f46573g.seekMusicToPosInMS(Integer.MAX_VALUE, i17);
        return 0;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPublishVolume(int i17) {
        this.f46573g.setMusicPublishVolume(Integer.MAX_VALUE, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMVolume(int i17) {
        this.f46573g.setMusicPlayoutVolume(Integer.MAX_VALUE, i17);
        this.f46573g.setMusicPublishVolume(Integer.MAX_VALUE, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBeautyStyle(int i17, int i18, int i19, int i27) {
        this.f46575i.setBeautyStyle(i17);
        this.f46575i.setBeautyLevel(i18);
        this.f46575i.setWhitenessLevel(i19);
        this.f46575i.setRuddyLevel(i27);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setCapturedAudioFrameCallbackFormat(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f46571e.setCapturedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setChinLevel(int i17) {
        this.f46575i.setChinLevel(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(java.lang.String str, com.tencent.trtc.TRTCCloud.TRTCViewMargin tRTCViewMargin) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z17, boolean z18) {
        this.f46571e.setDefaultStreamRecvMode(z17, z18);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setEyeScaleLevel(int i17) {
        this.f46575i.setEyeScaleLevel(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceShortLevel(int i17) {
        this.f46575i.setFaceShortLevel(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceSlimLevel(int i17) {
        this.f46575i.setFaceSlimLevel(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceVLevel(int i17) {
        this.f46575i.setFaceVLevel(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilter(android.graphics.Bitmap bitmap) {
        this.f46575i.setFilter(bitmap);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilterConcentration(float f17) {
        this.f46575i.setFilterStrength(f17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFocusPosition(int i17, int i18) {
        this.f46574h.setCameraFocusPosition(i17, i18);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setGSensorMode(int i17) {
        this.f46571e.setGSensorMode(0, i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGravitySensorAdaptiveMode(int i17) {
        this.f46571e.setGravitySensorAdaptiveMode(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setGreenScreenFile(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener) {
        com.tencent.liteav.base.Log.d("TRTCCloudImpl", "setListener ".concat(java.lang.String.valueOf(tRTCCloudListener)), new java.lang.Object[0]);
        this.f46570d = tRTCCloudListener;
        this.f46571e.setListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(android.os.Handler handler) {
        this.f46571e.setListenerHandler(handler);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalProcessedAudioFrameCallbackFormat(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f46571e.setLocalProcessedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalRenderParams(com.tencent.trtc.TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        setLocalViewFillMode(tRTCRenderParams.fillMode);
        setLocalViewRotation(tRTCRenderParams.rotation);
        setLocalViewMirror(tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoProcessListener(int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        return this.f46571e.setLocalVideoProcessListener(0, i17, i18, tRTCVideoFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f46571e.setLocalVideoRenderListener(i17, i18, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewFillMode(int i17) {
        this.f46571e.setLocalViewFillMode(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewMirror(int i17) {
        this.f46571e.setLocalViewMirror(i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewRotation(int i17) {
        this.f46571e.setLocalViewRotation(b(i17));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMicVolumeOnMixing(int i17) {
        this.f46573g.setVoiceCaptureVolume(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixExternalAudioVolume(int i17, int i18) {
        this.f46571e.setMixExternalAudioVolume(i17, i18);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMixTranscodingConfig(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f46571e.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setMixedPlayAudioFrameCallbackFormat(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f46571e.setMixedPlayAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMotionMute(boolean z17) {
        this.f46575i.setMotionMute(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(com.tencent.trtc.TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f46571e.setNetworkQosParam(tRTCNetworkQosParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setNoseSlimLevel(int i17) {
        this.f46575i.setNoseSlimLevel(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setPerspectiveCorrectionPoints(java.lang.String str, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2) {
        this.f46571e.setPerspectiveCorrectionPoints(str, pointFArr, pointFArr2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setPriorRemoteVideoStreamType(int i17) {
        return this.f46571e.setPriorRemoteVideoStreamType(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioParallelParams(com.tencent.trtc.TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f46571e.setRemoteAudioParallelParams(tRTCAudioParallelParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(java.lang.String str, int i17) {
        this.f46571e.setRemoteAudioVolume(str, i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteRenderParams(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        this.f46571e.setRemoteViewFillMode(str, i17, tRTCRenderParams.fillMode);
        this.f46571e.setRemoteViewRotation(str, i17, b(tRTCRenderParams.rotation));
        this.f46571e.setRemoteViewMirror(str, i17, tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewFillMode(java.lang.String str, int i17) {
        this.f46571e.setRemoteViewFillMode(str, 2, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewRotation(java.lang.String str, int i17) {
        this.f46571e.setRemoteViewRotation(str, 2, b(i17));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f46571e.setRemoteVideoRenderListener(str, i17, i18, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(java.lang.String str, int i17) {
        return this.f46571e.setRemoteVideoStreamType(str, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewFillMode(java.lang.String str, int i17) {
        this.f46571e.setRemoteViewFillMode(str, 0, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewRotation(java.lang.String str, int i17) {
        this.f46571e.setRemoteViewRotation(str, 0, b(i17));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setReverbType(int i17) {
        this.f46573g.setVoiceReverbType(com.tencent.liteav.audio.TXAudioEffectManagerImpl.voiceReverbTypeFromInt(i17));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSubStreamEncoderParam(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f46571e.setVideoEncoderParams(2, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setSystemVolumeType(int i17) {
        this.f46574h.setSystemVolumeType(com.tencent.liteav.device.TXDeviceManagerImpl.systemVolumeTypefromInt(i17));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderMirror(boolean z17) {
        this.f46571e.setVideoEncoderMirror(z17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam == null) {
            return;
        }
        this.f46571e.setVideoEncoderParams(0, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderRotation(int i17) {
        this.f46571e.setVideoEncoderRotation(b(i17));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(android.graphics.Bitmap bitmap, int i17) {
        this.f46571e.setVideoMuteImage(bitmap, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setVoiceChangerType(int i17) {
        this.f46573g.setVoiceChangerType(com.tencent.liteav.audio.TXAudioEffectManagerImpl.voiceChangerTypeFromInt(i17));
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19) {
        this.f46571e.setWatermark(bitmap, i17, f17, f18, f19);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setZoom(int i17) {
        this.f46574h.setCameraZoomRatio(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i17) {
        this.f46571e.showDashboardManager(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f46571e.snapshotVideo(str, i17, i18, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(com.tencent.trtc.TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return this.f46571e.startAudioRecording(tRTCAudioRecordingParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio(int i17) {
        this.f46571e.startLocalAudio(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f46571e.startLocalPreview(z17, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalRecording(com.tencent.trtc.TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f46571e.startLocalRecording(tRTCLocalRecordingParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishCDNStream(com.tencent.trtc.TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f46571e.startPublishCDNStream(tRTCPublishCDNParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishMediaStream(com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f46571e.startPublishMediaStream(tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishing(java.lang.String str, int i17) {
        this.f46571e.startPublishing(str, i17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteSubStreamView(java.lang.String str, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        startRemoteView(str, 2, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f46571e.startRemoteView(str, i17, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f46576j = i17;
        this.f46571e.startScreenCapture(i17, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startSpeedTest(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f46571e.startSpeedTest(tRTCSpeedTestParams);
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSystemAudioLoopback() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            com.tencent.liteav.base.util.LiteavLog.e("TRTCCloudImpl", "current system don't support system audio loopback");
        } else {
            this.f46571e.startSystemAudioLoopback();
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAllAudioEffects() {
        this.f46573g.stopAllAudioEffects();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        this.f46571e.stopAllRemoteView();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAudioEffect(int i17) {
        this.f46573g.stopAudioEffect(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
        this.f46571e.stopAudioRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopBGM() {
        this.f46573g.stopPlayMusic(Integer.MAX_VALUE);
        this.f46573g.setMusicObserver(Integer.MAX_VALUE, null);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
        this.f46571e.stopLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
        this.f46571e.stopLocalPreview();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalRecording() {
        this.f46571e.stopLocalRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishCDNStream() {
        this.f46571e.stopPublishCDNStream();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishMediaStream(java.lang.String str) {
        this.f46571e.stopPublishMediaStream(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishing() {
        this.f46571e.stopPublishing();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteSubStreamView(java.lang.String str) {
        stopRemoteView(str, 2);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(java.lang.String str, int i17) {
        this.f46571e.stopRemoteView(str, i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
        this.f46571e.stopScreenCapture(this.f46576j);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
        this.f46571e.stopSpeedTest();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSystemAudioLoopback() {
        this.f46571e.stopSystemAudioLoopback();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void switchCamera() {
        this.f46574h.switchCamera(!this.f46574h.isFrontCamera());
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i17) {
        this.f46571e.switchRole(i17);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(com.tencent.trtc.TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f46571e.switchRoom(tRTCSwitchRoomConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateLocalView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f46571e.updateLocalView(tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateOtherRoomForwardMode(java.lang.String str) {
        this.f46571e.updateOtherRoomForwardMode(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updatePublishMediaStream(java.lang.String str, com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f46571e.updatePublishMediaStream(str, tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemote3DSpatialPosition(java.lang.String str, int[] iArr) {
        this.f46571e.updateRemote3DSpatialPosition(str, iArr);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemoteView(java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f46571e.updateRemoteView(str, i17, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f46571e.updateSelf3DSpatialPosition(iArr, fArr, fArr2, fArr3);
    }

    public static com.tencent.trtc.TRTCCloud a(android.content.Context context) {
        com.tencent.liteav.trtc.TRTCCloudImpl tRTCCloudImpl;
        synchronized (com.tencent.liteav.trtc.TRTCCloudImpl.class) {
            if (f46568b == null) {
                f46568b = new com.tencent.liteav.trtc.TRTCCloudImpl(context, true);
            }
            tRTCCloudImpl = f46568b;
        }
        return tRTCCloudImpl;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i17, boolean z17) {
        com.tencent.trtc.TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams = new com.tencent.trtc.TRTCCloudDef.TRTCAudioVolumeEvaluateParams();
        tRTCAudioVolumeEvaluateParams.interval = i17;
        tRTCAudioVolumeEvaluateParams.enableVadDetection = z17;
        tRTCAudioVolumeEvaluateParams.enablePitchCalculation = false;
        tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation = false;
        enableAudioVolumeEvaluation(true, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableCustomVideoCapture(boolean z17) {
        enableCustomVideoCapture(0, z17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteLocalVideo(boolean z17) {
        this.f46571e.muteLocalVideo(0, z17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteRemoteVideoStream(java.lang.String str, boolean z17) {
        muteRemoteVideoStream(str, 0, z17);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void snapshotVideo(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f46571e.snapshotVideo(str, i17, 1, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startLocalAudio() {
        this.f46571e.startLocalAudio();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteView(java.lang.String str, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f46571e.startRemoteView(str, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startSpeedTest(int i17, java.lang.String str, java.lang.String str2) {
        this.f46571e.startSpeedTest(i17, str, str2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteView(java.lang.String str) {
        this.f46571e.stopRemoteView(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i17, java.lang.String str) {
        this.f46571e.switchRole(i17, str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startScreenCapture(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f46576j = 0;
        startScreenCapture(0, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void sendCustomVideoData(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        sendCustomVideoData(0, tRTCVideoFrame);
    }

    private TRTCCloudImpl(android.content.Context context, long j17) {
        b(context);
        this.f46569c = context;
        a(context, j17, false);
    }

    public static void a() {
        synchronized (com.tencent.liteav.trtc.TRTCCloudImpl.class) {
            if (f46568b != null) {
                com.tencent.liteav.base.util.LiteavLog.i("TRTCCloudImpl", "destructor destroySharedInstance");
                java.util.Iterator<com.tencent.liteav.trtc.TRTCCloudImpl> it = f46568b.f46577k.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                f46568b.b();
                f46568b = null;
            }
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i17) {
        enableAudioVolumeEvaluation(i17, false);
    }

    private void b() {
        com.tencent.liteav.beauty.TXBeautyManagerImpl tXBeautyManagerImpl = this.f46575i;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        this.f46571e.destroy();
    }

    public static void b(boolean z17) {
        com.tencent.liteav.trtc.TrtcCloudJni.setLogCompressEnabled(z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[Catch: Exception -> 0x010e, TRY_LEAVE, TryCatch #1 {Exception -> 0x010e, blocks: (B:11:0x003f, B:13:0x004e, B:14:0x005e, B:17:0x006a, B:18:0x00a4, B:20:0x00aa, B:22:0x00b5, B:26:0x00bf, B:35:0x00d2, B:36:0x00d5, B:37:0x00d8, B:42:0x00f8, B:44:0x00fd, B:50:0x0102, B:55:0x0107, B:52:0x010d, B:67:0x008a, B:68:0x0052, B:70:0x0058, B:75:0x0028, B:10:0x0018), top: B:9:0x0018, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.TRTCCloudImpl.b(java.lang.String):java.lang.String");
    }

    private void a(android.content.Context context, long j17, boolean z17) {
        this.f46569c = context.getApplicationContext();
        if (j17 == 0) {
            this.f46571e = new com.tencent.liteav.trtc.TrtcCloudJni(z17);
        } else {
            this.f46571e = new com.tencent.liteav.trtc.TrtcCloudJni(j17, z17);
        }
        this.f46574h = new com.tencent.liteav.device.TXDeviceManagerImpl(this.f46571e.createDeviceManager());
        this.f46573g = new com.tencent.liteav.audio.TXAudioEffectManagerImpl(this.f46571e.createAudioEffectManager());
        this.f46575i = new com.tencent.liteav.beauty.TXBeautyManagerImpl(this.f46571e.createBeautyManager());
    }

    public static void a(int i17) {
        com.tencent.liteav.trtc.TrtcCloudJni.setLogLevel(i17);
    }

    public static void a(boolean z17) {
        com.tencent.liteav.trtc.TrtcCloudJni.setConsoleEnabled(z17);
    }

    public static void a(java.lang.String str) {
        com.tencent.liteav.trtc.TrtcCloudJni.setLogDirPath(str);
    }

    private static int b(int i17) {
        if (i17 < 0) {
            return 0;
        }
        return i17 > 3 ? (i17 / 90) % 4 : i17;
    }
}
