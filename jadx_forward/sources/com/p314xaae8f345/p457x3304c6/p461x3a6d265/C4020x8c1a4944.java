package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamSession */
/* loaded from: classes16.dex */
public class C4020x8c1a4944 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129434a;

    /* renamed from: b, reason: collision with root package name */
    public io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa f129435b = null;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15882x39e86013;

    public C4020x8c1a4944(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f129434a = c4099x76754671;
        this.f15882x39e86013 = m32679xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32679xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeBeginAdjustSpatialDesc */
    private native void m32680xc58f2df4(int i17);

    /* renamed from: nativeBeginPlayBackgroundMusic */
    private native void m32681x16a9c791(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, boolean z17, int i17);

    /* renamed from: nativeBeginUseAssetInput */
    private native void m32682xf14d1def(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, int i17);

    /* renamed from: nativeBeginUseCameraInput */
    private native void m32683x7878ef10(int i17);

    /* renamed from: nativeBeginUseComponentGroup */
    private native void m32684xfdbc2837(java.lang.String str, int i17);

    /* renamed from: nativeBeginUseTemplate */
    private native void m32685x506260ef(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b, int i17);

    /* renamed from: nativeCancelAIGCTask */
    private native void m32686x49cfeb1a(int i17);

    /* renamed from: nativeCancelExportingVideo */
    private native void m32687x34e3f93e(int i17);

    /* renamed from: nativeClearComponentGroup */
    private native void m32688x6ac93198(int i17);

    /* renamed from: nativeClearTemplate */
    private native void m32689x28c64710(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b, int i17);

    /* renamed from: nativeConnectRenderView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32690xc8102e8e(java.lang.String str);

    /* renamed from: nativeConnectToView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32691x61149273(java.lang.Object obj);

    /* renamed from: nativeDisconnectFromView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32692xa78516a2();

    /* renamed from: nativeEndAdjustSpatialDesc */
    private native void m32693x7e7c19c2(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63, int i17);

    /* renamed from: nativeExportPhoto */
    private native void m32694x5bd69e47(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2, java.lang.String str, boolean z17, int i17, boolean z18, boolean z19, int i18);

    /* renamed from: nativeGetBeautyAdjustmentDesc */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 m32695xdd444f99();

    /* renamed from: nativeGetCurrentBackgroundMusicDesc */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 m32696xc99559ae();

    /* renamed from: nativeGetCurrentState */
    private native int m32697xa85883f7();

    /* renamed from: nativeGetFilterDesc */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4007x274e54bb m32698x35337748();

    /* renamed from: nativeGetGestureRecognizerSettings */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4008x4d8fb63e m32699xb5d98811();

    /* renamed from: nativeGetMusicVolumeDesc */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e m32700x37f60311();

    /* renamed from: nativeGetPreferredCameraDimensionLevel */
    private static native int m32701x740b6ee5();

    /* renamed from: nativeGetSDKSharableEGL14EGLContext */
    private native android.opengl.EGLContext m32702xbedbdf97();

    /* renamed from: nativeGetSDKSharableEGLContext */
    private native java.lang.Object m32703xd5f78560();

    /* renamed from: nativeIsBeautyAndMakeupDisabled */
    private native boolean m32704x1673725f();

    /* renamed from: nativeNotifyAIGCTaskDidCompleted */
    private native void m32705x578e8415();

    /* renamed from: nativeNotifyDidModifyFov */
    private native void m32706xa6f17e54(float f17);

    /* renamed from: nativeNotifyDidSwitchCamera */
    private native void m32707x99b78b38(boolean z17);

    /* renamed from: nativeOnExposureValueChecked */
    private native void m32708xdd396113(int i17);

    /* renamed from: nativeOpenAsyncAIGCDraft */
    private native void m32709xf64eab62(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, int i17);

    /* renamed from: nativePauseBackgroundMusic */
    private native void m32710xee3c6f78(int i17);

    /* renamed from: nativePausePreviewing */
    private native void m32711x7ec99c99(boolean z17, int i17);

    /* renamed from: nativeRegisterAIGCBridgeService */
    private native void m32712xb47981ae(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b);

    /* renamed from: nativeRegisterCDNBridgeService */
    private native void m32713x33a52fb9(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c);

    /* renamed from: nativeResumeBackgroundMusic */
    private native void m32714xeb1c69d3(int i17);

    /* renamed from: nativeResumePreviewing */
    private native void m32715xf7e7555e(int i17);

    /* renamed from: nativeSaveAsyncAIGCDraft */
    private native void m32716x209b3155(java.lang.String str, int i17);

    /* renamed from: nativeSendAudioFrame */
    private native void m32717xa7bb9cd6(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 c3977x2c5458b4);

    /* renamed from: nativeSendVideoFrame */
    private native void m32718xeaf3c351(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2);

    /* renamed from: nativeSetAIGCFinishCallback */
    private native void m32719x6c3b9627(int i17);

    /* renamed from: nativeSetAIGCRequestConditionNotMetFunc */
    private native void m32720x40c6ca88(int i17);

    /* renamed from: nativeSetAIGCStartedCallback */
    private native void m32721xeb9af197(int i17);

    /* renamed from: nativeSetAudioDeviceType */
    private native void m32722xc4b06adb(int i17);

    /* renamed from: nativeSetBeautyAdjustmentDesc */
    private native void m32723x57977ea5(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c4000x86998277, int i17);

    /* renamed from: nativeSetBeautyAndMakeupDisabled */
    private native void m32724x8dfc09f5(boolean z17, int i17);

    /* renamed from: nativeSetBeginRequestAIGCFunc */
    private native void m32725x2e4210f9(int i17);

    /* renamed from: nativeSetDidRenderFirstAudioFrameFunc */
    private native void m32726xf3772aa1(int i17);

    /* renamed from: nativeSetExposureCheckParams */
    private native void m32727x476fd25c(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4029xcd150c4a c4029xcd150c4a);

    /* renamed from: nativeSetFaceGender */
    private native void m32728xccf6bea9(int i17, int i18);

    /* renamed from: nativeSetFilterDesc */
    private native void m32729x6357c554(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4007x274e54bb c4007x274e54bb, int i17);

    /* renamed from: nativeSetFirstFrameDidPresentAfterSwitchTemplateFunc */
    private native void m32730x195f9cea(int i17);

    /* renamed from: nativeSetFirstFrameDidPresentFunc */
    private native void m32731x4fde8e08(int i17);

    /* renamed from: nativeSetGestureEventFunc */
    private native void m32732x481d8820(int i17);

    /* renamed from: nativeSetLocationInfo */
    private native void m32733x843e7a6e(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5, int i17);

    /* renamed from: nativeSetMusicVolumeDesc */
    private native void m32734x6ecc9c85(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e c4013x695a957e, int i17);

    /* renamed from: nativeSetRecordingDidFailFunc */
    private native void m32735xdaa0ab5b(int i17);

    /* renamed from: nativeSetRecordingTimeDidChangeFunc */
    private native void m32736x2bd181e0(int i17);

    /* renamed from: nativeSetSegmentationDesc */
    private native void m32737x7d4bac3e(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, int i17);

    /* renamed from: nativeSetWeslamLibPath */
    private native void m32738x1f7565ac(java.lang.String str);

    /* renamed from: nativeStartExportingVideo */
    private native void m32739x5ee040d8(int i17);

    /* renamed from: nativeStartExportingVideo */
    private native void m32740x5ee040d8(boolean z17, int i17);

    /* renamed from: nativeStartPreviewing */
    private native void m32741x5f4a2405(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, int i17);

    /* renamed from: nativeStartPreviewingWithTemplate */
    private native void m32742x27195405(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b2, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, int i17);

    /* renamed from: nativeStartRecording */
    private native void m32743xf40d4fa6(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, int i17);

    /* renamed from: nativeStopRecording */
    private native void m32744x66dc7538(boolean z17, int i17);

    /* renamed from: nativeSwitchToTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m32745x8dfb3ca0(java.lang.String str, int i17, int i18);

    /* renamed from: nativeTeardown */
    private native void m32746xb4cc133b(int i17);

    /* renamed from: nativeToggleFaceGender */
    private native void m32747xa3dcc029(int i17);

    /* renamed from: nativeUpdateAIGCResult */
    private native void m32748xe3e52001(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 c3975xde78a307, int i17);

    /* renamed from: nativeUpdateMusicLyrics */
    private native void m32749xd03a5a99(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, int i17);

    /* renamed from: nativeUpdateRenderAspectRatio */
    private native void m32750xd845df3d(int i17, int i18, int i19);

    public void A(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32714xeb1c69d3(i17);
    }

    public void B(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32715xf7e7555e(i17);
    }

    public void C(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 i0Var) {
        int i17;
        if (i0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.t0(this, i0Var));
        } else {
            i17 = -1;
        }
        m32716x209b3155(str, i17);
    }

    public void D(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 c3977x2c5458b4) {
        m32717xa7bb9cd6(c3977x2c5458b4);
    }

    public void E(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2) {
        m32718xeaf3c351(interfaceC4037x150215d2);
    }

    public void F(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var, false));
        } else {
            i17 = -1;
        }
        m32719x6c3b9627(i17);
    }

    public void G(com.p314xaae8f345.p457x3304c6.p461x3a6d265.a0 a0Var) {
        int i17;
        if (a0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.l0(this, a0Var, false));
        } else {
            i17 = -1;
        }
        m32720x40c6ca88(i17);
    }

    public void H(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c4000x86998277, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32723x57977ea5(c4000x86998277, i17);
    }

    public void I(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32724x8dfc09f5(z17, i17);
    }

    public void J(com.p314xaae8f345.p457x3304c6.p461x3a6d265.c0 c0Var) {
        int i17;
        if (c0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.n0(this, c0Var, false));
        } else {
            i17 = -1;
        }
        m32725x2e4210f9(i17);
    }

    public void K(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4029xcd150c4a c4029xcd150c4a) {
        m32727x476fd25c(c4029xcd150c4a);
    }

    public void L(com.p314xaae8f345.p457x3304c6.p461x3a6d265.g0 g0Var) {
        int i17;
        if (g0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.r0(this, g0Var, false));
        } else {
            i17 = -1;
        }
        m32708xdd396113(i17);
    }

    public void M(jg.d dVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32728xccf6bea9(dVar.f381066d, i17);
    }

    public void N(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4007x274e54bb c4007x274e54bb, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32729x6357c554(c4007x274e54bb, i17);
    }

    public void O(com.p314xaae8f345.p457x3304c6.p461x3a6d265.e0 e0Var) {
        int i17;
        if (e0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.p0(this, e0Var, false));
        } else {
            i17 = -1;
        }
        m32730x195f9cea(i17);
    }

    public void P(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32731x4fde8e08(i17);
    }

    public void Q(com.p314xaae8f345.p457x3304c6.p461x3a6d265.f0 f0Var) {
        int i17;
        if (f0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.q0(this, f0Var, false));
        } else {
            i17 = -1;
        }
        m32732x481d8820(i17);
    }

    public void R(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32733x843e7a6e(c4186x9bb007e5, i17);
    }

    public void S(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e c4013x695a957e, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32734x6ecc9c85(c4013x695a957e, i17);
    }

    public void T(com.p314xaae8f345.p457x3304c6.p461x3a6d265.h0 h0Var) {
        int i17;
        if (h0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.s0(this, h0Var, false));
        } else {
            i17 = -1;
        }
        m32736x2bd181e0(i17);
    }

    public void U(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208("MJCamSession", "renderView must be SDK DSRenderView");
            throw new java.security.InvalidParameterException("renderView must be SDK DSRenderView");
        }
        if (this.f129435b != null) {
            throw new java.lang.IllegalStateException("Already a view connected!");
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa m136921x4fd765e4 = ((io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) surfaceView).m136921x4fd765e4();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32691x61149273 = m32691x61149273(m136921x4fd765e4);
        if (m32691x61149273 == null) {
            this.f129435b = m136921x4fd765e4;
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208("MJCamSession", "Fail to connect to RenderView, " + m32691x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + m32691x61149273.f16057x38eb0007);
    }

    public void V(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32737x7d4bac3e(c4019xd47cd265, i17);
    }

    public void W(java.lang.String str) {
        m32738x1f7565ac(str);
    }

    public void X(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0 j0Var) {
        int i17;
        if (j0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.u0(this, j0Var));
        } else {
            i17 = -1;
        }
        m32740x5ee040d8(z17, i17);
    }

    public void Y(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32741x5f4a2405(c4015x3370f4b9, i17);
    }

    public void Z(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32743xf40d4fa6(str, c4084x74642117, c3978x9b06196b, i17);
    }

    public void a(com.p314xaae8f345.p457x3304c6.p461x3a6d265.b0 b0Var) {
        int i17;
        if (b0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.m0(this, b0Var));
        } else {
            i17 = -1;
        }
        m32680xc58f2df4(i17);
    }

    public void a0(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0 j0Var) {
        int i17;
        if (j0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.u0(this, j0Var));
        } else {
            i17 = -1;
        }
        m32744x66dc7538(z17, i17);
    }

    public void b(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32681x16a9c791(c4012xe1ac9984, true, i17);
    }

    public void b0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (this.f129435b != null) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae("MJCamSession", "nativeDisconnectFromView");
            m32692xa78516a2();
            this.f129435b = null;
        }
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32746xb4cc133b(i17);
    }

    public void c(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (c4084x74642117 == null) {
            c4084x74642117 = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117.m33699x37f11911();
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x746421172 = c4084x74642117;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32682xf14d1def(c4094x2bd762a1, str, c4084x746421172, c3978x9b06196b, i17);
    }

    public void c0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 c3975xde78a307, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32748xe3e52001(c3975xde78a307, i17);
    }

    public void d(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32683x7878ef10(i17);
    }

    public void d0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32749xd03a5a99(c4012xe1ac9984, i17);
    }

    public void e(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32684xfdbc2837(str, i17);
    }

    public void f(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.k0 k0Var) {
        int i17;
        if (k0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v0(this, k0Var));
        } else {
            i17 = -1;
        }
        m32685x506260ef(str, null, i17);
    }

    public void g(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.k0 k0Var) {
        int i17;
        if (k0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v0(this, k0Var));
        } else {
            i17 = -1;
        }
        m32685x506260ef(str, c4025xdf96d81b, i17);
    }

    public void h(com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f enumC3989x2312e1f) {
        m32686x49cfeb1a(enumC3989x2312e1f.m32488x754a37bb());
    }

    public void i(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32687x34e3f93e(i17);
    }

    public void j(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32688x6ac93198(i17);
    }

    public void k(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32689x28c64710(null, i17);
    }

    public void l(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32693x7e7c19c2(c4023x59e5ad63, i17);
    }

    public void m(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2, java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.z zVar, boolean z18, boolean z19, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32694x5bd69e47(interfaceC4037x150215d2, str, z17, zVar.f129534d, z18, z19, i17);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 n() {
        return m32696xc99559ae();
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e o() {
        return m32700x37f60311();
    }

    public android.opengl.EGLContext p() {
        return m32702xbedbdf97();
    }

    public boolean q() {
        return m32704x1673725f();
    }

    public void r() {
        m32705x578e8415();
    }

    public void s(float f17) {
        m32706xa6f17e54(f17);
    }

    public void t(boolean z17) {
        m32707x99b78b38(z17);
    }

    public void u(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32709xf64eab62(str, str2, c4084x74642117, c3978x9b06196b, i17);
    }

    public void v(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32710xee3c6f78(i17);
    }

    public void w(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        int i17;
        if (d0Var != null) {
            i17 = this.f129434a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.o0(this, d0Var));
        } else {
            i17 = -1;
        }
        m32711x7ec99c99(z17, i17);
    }

    public void x(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b) {
        m32712xb47981ae(c3985x6b47324b);
    }

    public void y(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c) {
        m32713x33a52fb9(c4001x1040777c);
    }

    public void z() {
        this.f15882x39e86013.m16727xc85fe246();
    }
}
