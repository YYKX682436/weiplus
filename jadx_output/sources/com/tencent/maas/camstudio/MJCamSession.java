package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class MJCamSession {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f47901a;

    /* renamed from: b, reason: collision with root package name */
    public io.clipworks.displaysys.DSViewProxy f47902b = null;
    private final com.facebook.jni.HybridData mHybridData;

    public MJCamSession(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f47901a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeBeginAdjustSpatialDesc(int i17);

    private native void nativeBeginPlayBackgroundMusic(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, boolean z17, int i17);

    private native void nativeBeginUseAssetInput(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo, java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, int i17);

    private native void nativeBeginUseCameraInput(int i17);

    private native void nativeBeginUseComponentGroup(java.lang.String str, int i17);

    private native void nativeBeginUseTemplate(java.lang.String str, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, int i17);

    private native void nativeCancelAIGCTask(int i17);

    private native void nativeCancelExportingVideo(int i17);

    private native void nativeClearComponentGroup(int i17);

    private native void nativeClearTemplate(com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeConnectRenderView(java.lang.String str);

    private native com.tencent.maas.instamovie.base.MJError nativeConnectToView(java.lang.Object obj);

    private native com.tencent.maas.instamovie.base.MJError nativeDisconnectFromView();

    private native void nativeEndAdjustSpatialDesc(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, int i17);

    private native void nativeExportPhoto(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, int i17, boolean z18, boolean z19, int i18);

    private native com.tencent.maas.camstudio.MJBeautyAdjustmentDesc nativeGetBeautyAdjustmentDesc();

    private native com.tencent.maas.camstudio.MJCamMusicDesc nativeGetCurrentBackgroundMusicDesc();

    private native int nativeGetCurrentState();

    private native com.tencent.maas.camstudio.MJCamFilterDesc nativeGetFilterDesc();

    private native com.tencent.maas.camstudio.MJCamGestureRecognizerSettings nativeGetGestureRecognizerSettings();

    private native com.tencent.maas.camstudio.MJCamMusicVolumeDesc nativeGetMusicVolumeDesc();

    private static native int nativeGetPreferredCameraDimensionLevel();

    private native android.opengl.EGLContext nativeGetSDKSharableEGL14EGLContext();

    private native java.lang.Object nativeGetSDKSharableEGLContext();

    private native boolean nativeIsBeautyAndMakeupDisabled();

    private native void nativeNotifyAIGCTaskDidCompleted();

    private native void nativeNotifyDidModifyFov(float f17);

    private native void nativeNotifyDidSwitchCamera(boolean z17);

    private native void nativeOnExposureValueChecked(int i17);

    private native void nativeOpenAsyncAIGCDraft(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, int i17);

    private native void nativePauseBackgroundMusic(int i17);

    private native void nativePausePreviewing(boolean z17, int i17);

    private native void nativeRegisterAIGCBridgeService(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService);

    private native void nativeRegisterCDNBridgeService(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService);

    private native void nativeResumeBackgroundMusic(int i17);

    private native void nativeResumePreviewing(int i17);

    private native void nativeSaveAsyncAIGCDraft(java.lang.String str, int i17);

    private native void nativeSendAudioFrame(com.tencent.maas.camerafun.MJAudioFrame mJAudioFrame);

    private native void nativeSendVideoFrame(com.tencent.maas.camstudio.frame.VideoFrame videoFrame);

    private native void nativeSetAIGCFinishCallback(int i17);

    private native void nativeSetAIGCRequestConditionNotMetFunc(int i17);

    private native void nativeSetAIGCStartedCallback(int i17);

    private native void nativeSetAudioDeviceType(int i17);

    private native void nativeSetBeautyAdjustmentDesc(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, int i17);

    private native void nativeSetBeautyAndMakeupDisabled(boolean z17, int i17);

    private native void nativeSetBeginRequestAIGCFunc(int i17);

    private native void nativeSetDidRenderFirstAudioFrameFunc(int i17);

    private native void nativeSetExposureCheckParams(com.tencent.maas.camstudio.MJExposureCheckParams mJExposureCheckParams);

    private native void nativeSetFaceGender(int i17, int i18);

    private native void nativeSetFilterDesc(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc, int i17);

    private native void nativeSetFirstFrameDidPresentAfterSwitchTemplateFunc(int i17);

    private native void nativeSetFirstFrameDidPresentFunc(int i17);

    private native void nativeSetGestureEventFunc(int i17);

    private native void nativeSetLocationInfo(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, int i17);

    private native void nativeSetMusicVolumeDesc(com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc, int i17);

    private native void nativeSetRecordingDidFailFunc(int i17);

    private native void nativeSetRecordingTimeDidChangeFunc(int i17);

    private native void nativeSetSegmentationDesc(com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, int i17);

    private native void nativeSetWeslamLibPath(java.lang.String str);

    private native void nativeStartExportingVideo(int i17);

    private native void nativeStartExportingVideo(boolean z17, int i17);

    private native void nativeStartPreviewing(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, int i17);

    private native void nativeStartPreviewingWithTemplate(java.lang.String str, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, java.lang.String str2, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams2, com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, int i17);

    private native void nativeStartRecording(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, int i17);

    private native void nativeStopRecording(boolean z17, int i17);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeSwitchToTemplate(java.lang.String str, int i17, int i18);

    private native void nativeTeardown(int i17);

    private native void nativeToggleFaceGender(int i17);

    private native void nativeUpdateAIGCResult(com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams, int i17);

    private native void nativeUpdateMusicLyrics(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, int i17);

    private native void nativeUpdateRenderAspectRatio(int i17, int i18, int i19);

    public void A(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeResumeBackgroundMusic(i17);
    }

    public void B(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeResumePreviewing(i17);
    }

    public void C(java.lang.String str, com.tencent.maas.camstudio.i0 i0Var) {
        int i17;
        if (i0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.t0(this, i0Var));
        } else {
            i17 = -1;
        }
        nativeSaveAsyncAIGCDraft(str, i17);
    }

    public void D(com.tencent.maas.camerafun.MJAudioFrame mJAudioFrame) {
        nativeSendAudioFrame(mJAudioFrame);
    }

    public void E(com.tencent.maas.camstudio.frame.VideoFrame videoFrame) {
        nativeSendVideoFrame(videoFrame);
    }

    public void F(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var, false));
        } else {
            i17 = -1;
        }
        nativeSetAIGCFinishCallback(i17);
    }

    public void G(com.tencent.maas.camstudio.a0 a0Var) {
        int i17;
        if (a0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.l0(this, a0Var, false));
        } else {
            i17 = -1;
        }
        nativeSetAIGCRequestConditionNotMetFunc(i17);
    }

    public void H(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetBeautyAdjustmentDesc(mJBeautyAdjustmentDesc, i17);
    }

    public void I(boolean z17, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetBeautyAndMakeupDisabled(z17, i17);
    }

    public void J(com.tencent.maas.camstudio.c0 c0Var) {
        int i17;
        if (c0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.n0(this, c0Var, false));
        } else {
            i17 = -1;
        }
        nativeSetBeginRequestAIGCFunc(i17);
    }

    public void K(com.tencent.maas.camstudio.MJExposureCheckParams mJExposureCheckParams) {
        nativeSetExposureCheckParams(mJExposureCheckParams);
    }

    public void L(com.tencent.maas.camstudio.g0 g0Var) {
        int i17;
        if (g0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.r0(this, g0Var, false));
        } else {
            i17 = -1;
        }
        nativeOnExposureValueChecked(i17);
    }

    public void M(jg.d dVar, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetFaceGender(dVar.f299533d, i17);
    }

    public void N(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetFilterDesc(mJCamFilterDesc, i17);
    }

    public void O(com.tencent.maas.camstudio.e0 e0Var) {
        int i17;
        if (e0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.p0(this, e0Var, false));
        } else {
            i17 = -1;
        }
        nativeSetFirstFrameDidPresentAfterSwitchTemplateFunc(i17);
    }

    public void P(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetFirstFrameDidPresentFunc(i17);
    }

    public void Q(com.tencent.maas.camstudio.f0 f0Var) {
        int i17;
        if (f0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.q0(this, f0Var, false));
        } else {
            i17 = -1;
        }
        nativeSetGestureEventFunc(i17);
    }

    public void R(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetLocationInfo(geographicInfo, i17);
    }

    public void S(com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetMusicVolumeDesc(mJCamMusicVolumeDesc, i17);
    }

    public void T(com.tencent.maas.camstudio.h0 h0Var) {
        int i17;
        if (h0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.s0(this, h0Var, false));
        } else {
            i17 = -1;
        }
        nativeSetRecordingTimeDidChangeFunc(i17);
    }

    public void U(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.clipworks.displaysys.DSRenderView)) {
            io.clipworks.corekit.NativeLogger.error("MJCamSession", "renderView must be SDK DSRenderView");
            throw new java.security.InvalidParameterException("renderView must be SDK DSRenderView");
        }
        if (this.f47902b != null) {
            throw new java.lang.IllegalStateException("Already a view connected!");
        }
        io.clipworks.displaysys.DSViewProxy dSViewProxy = ((io.clipworks.displaysys.DSRenderView) surfaceView).getDSViewProxy();
        com.tencent.maas.instamovie.base.MJError nativeConnectToView = nativeConnectToView(dSViewProxy);
        if (nativeConnectToView == null) {
            this.f47902b = dSViewProxy;
            return;
        }
        io.clipworks.corekit.NativeLogger.error("MJCamSession", "Fail to connect to RenderView, " + nativeConnectToView.message);
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + nativeConnectToView.message);
    }

    public void V(com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeSetSegmentationDesc(mJCamSegmentationDesc, i17);
    }

    public void W(java.lang.String str) {
        nativeSetWeslamLibPath(str);
    }

    public void X(boolean z17, com.tencent.maas.camstudio.j0 j0Var) {
        int i17;
        if (j0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.u0(this, j0Var));
        } else {
            i17 = -1;
        }
        nativeStartExportingVideo(z17, i17);
    }

    public void Y(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeStartPreviewing(mJCamPreviewSettings, i17);
    }

    public void Z(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeStartRecording(str, mJRecordingSettings, mJAuditCaptureSettings, i17);
    }

    public void a(com.tencent.maas.camstudio.b0 b0Var) {
        int i17;
        if (b0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.m0(this, b0Var));
        } else {
            i17 = -1;
        }
        nativeBeginAdjustSpatialDesc(i17);
    }

    public void a0(boolean z17, com.tencent.maas.camstudio.j0 j0Var) {
        int i17;
        if (j0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.u0(this, j0Var));
        } else {
            i17 = -1;
        }
        nativeStopRecording(z17, i17);
    }

    public void b(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeBeginPlayBackgroundMusic(mJCamMusicDesc, true, i17);
    }

    public void b0(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (this.f47902b != null) {
            io.clipworks.corekit.NativeLogger.info("MJCamSession", "nativeDisconnectFromView");
            nativeDisconnectFromView();
            this.f47902b = null;
        }
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeTeardown(i17);
    }

    public void c(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo, java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (mJRecordingSettings == null) {
            mJRecordingSettings = com.tencent.maas.instamovie.MJRecordingSettings.getDefault1080pSettings();
        }
        com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings2 = mJRecordingSettings;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeBeginUseAssetInput(mJAssetInfo, str, mJRecordingSettings2, mJAuditCaptureSettings, i17);
    }

    public void c0(com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeUpdateAIGCResult(mJAIGCParams, i17);
    }

    public void d(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeBeginUseCameraInput(i17);
    }

    public void d0(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeUpdateMusicLyrics(mJCamMusicDesc, i17);
    }

    public void e(java.lang.String str, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeBeginUseComponentGroup(str, i17);
    }

    public void f(java.lang.String str, com.tencent.maas.camstudio.k0 k0Var) {
        int i17;
        if (k0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.v0(this, k0Var));
        } else {
            i17 = -1;
        }
        nativeBeginUseTemplate(str, null, i17);
    }

    public void g(java.lang.String str, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, com.tencent.maas.camstudio.k0 k0Var) {
        int i17;
        if (k0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.v0(this, k0Var));
        } else {
            i17 = -1;
        }
        nativeBeginUseTemplate(str, mJCamTemplateOverridingParams, i17);
    }

    public void h(com.tencent.maas.camstudio.MJAIGCCancelReason mJAIGCCancelReason) {
        nativeCancelAIGCTask(mJAIGCCancelReason.getValue());
    }

    public void i(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeCancelExportingVideo(i17);
    }

    public void j(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeClearComponentGroup(i17);
    }

    public void k(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeClearTemplate(null, i17);
    }

    public void l(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeEndAdjustSpatialDesc(mJCamSpatialDesc, i17);
    }

    public void m(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeExportPhoto(videoFrame, str, z17, zVar.f48001d, z18, z19, i17);
    }

    public com.tencent.maas.camstudio.MJCamMusicDesc n() {
        return nativeGetCurrentBackgroundMusicDesc();
    }

    public com.tencent.maas.camstudio.MJCamMusicVolumeDesc o() {
        return nativeGetMusicVolumeDesc();
    }

    public android.opengl.EGLContext p() {
        return nativeGetSDKSharableEGL14EGLContext();
    }

    public boolean q() {
        return nativeIsBeautyAndMakeupDisabled();
    }

    public void r() {
        nativeNotifyAIGCTaskDidCompleted();
    }

    public void s(float f17) {
        nativeNotifyDidModifyFov(f17);
    }

    public void t(boolean z17) {
        nativeNotifyDidSwitchCamera(z17);
    }

    public void u(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativeOpenAsyncAIGCDraft(str, str2, mJRecordingSettings, mJAuditCaptureSettings, i17);
    }

    public void v(com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativePauseBackgroundMusic(i17);
    }

    public void w(boolean z17, com.tencent.maas.camstudio.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f47901a.registerCallback(new com.tencent.maas.camstudio.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        nativePausePreviewing(z17, i17);
    }

    public void x(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService) {
        nativeRegisterAIGCBridgeService(mJAIGCBridgeService);
    }

    public void y(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService) {
        nativeRegisterCDNBridgeService(mJCDNBridgeService);
    }

    public void z() {
        this.mHybridData.resetNative();
    }
}
