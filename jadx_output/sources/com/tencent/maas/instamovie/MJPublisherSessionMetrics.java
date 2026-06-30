package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJPublisherSessionMetrics {
    private final com.facebook.jni.HybridData mHybridData;

    public MJPublisherSessionMetrics(android.os.Handler handler) {
        this.mHybridData = initHybrid(handler);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler);

    private native java.lang.String nativeGetCurrentMovieComposingTaskID();

    private native java.lang.String nativeGetSessionID();

    private native long nativeGetVisitedStates();

    private native void nativeMarkDidEnd(java.lang.String str);

    private native void nativeMarkDidEndMovieComposing(java.lang.String str);

    private native void nativeMarkDidEndShootComposing(java.lang.String str);

    private native void nativeMarkMCDidCancelExporting();

    private native void nativeMarkMCDidCompleteCreation();

    private native void nativeMarkMCDidEndComposing(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCDidEndExporting(java.lang.String str, boolean z17, java.lang.String str2, boolean z18);

    private native void nativeMarkMCDidEndImporting();

    private native void nativeMarkMCDidEndLoadingDraft(java.lang.String str);

    private native void nativeMarkMCDidEndRecordingNarration();

    private native void nativeMarkMCDidEndSampleComposing();

    private native void nativeMarkMCDidEndTemplateExporting(java.lang.String str, java.lang.String str2);

    private native void nativeMarkMCDidExitClippingUI(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCDidExitMusicUI(java.lang.String str, boolean z17, boolean z18, boolean z19, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCDidExitNarrationUI(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCDidExitStickerUI(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCDidExitTextUI(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCDidStartComposing(com.tencent.maas.moviecomposing.Timeline timeline);

    private native void nativeMarkMCDidStartExporting(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    private native void nativeMarkMCDidStartImporting();

    private native void nativeMarkMCWillEnterClippingUI(java.lang.String str);

    private native void nativeMarkMCWillEnterMusicUI(java.lang.String str);

    private native void nativeMarkMCWillEnterNarrationUI(java.lang.String str);

    private native void nativeMarkMCWillEnterStickerUI(java.lang.String str);

    private native void nativeMarkMCWillEnterTextUI(java.lang.String str);

    private native void nativeMarkMCWillStartComposing();

    private native void nativeMarkMCWillStartExporting(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18);

    private native void nativeMarkMCWillStartImporting(boolean z17, int i17, boolean z18);

    private native void nativeMarkMCWillStartLoadingDraft();

    private native void nativeMarkMCWillStartRecordingNarration();

    private native void nativeMarkMCWillStartSampleComposing();

    private native void nativeMarkMCWillStartTemplateCreating(int i17, int i18, int i19);

    private native void nativeMarkSCDidCancelRecording(java.lang.String str, java.lang.String str2);

    private native void nativeMarkSCDidCompleteCreation();

    private native void nativeMarkSCDidEndAssetCreating(java.lang.String str, java.lang.String str2);

    private native void nativeMarkSCDidEndAssetCreatingExporting(java.lang.String str);

    private native void nativeMarkSCDidEndPostEditing();

    private native void nativeMarkSCDidEndPreviewing();

    private native void nativeMarkSCDidEndRecording(java.lang.String str, boolean z17);

    private native void nativeMarkSCDidExitMusicUI(java.lang.String str, boolean z17);

    private native void nativeMarkSCDidExitVisageUI();

    private native void nativeMarkSCDidStartPreviewing();

    private native void nativeMarkSCDidStartRecording();

    private native void nativeMarkSCWillEnterMusicUI();

    private native void nativeMarkSCWillEnterVisageUI();

    private native void nativeMarkSCWillStartAssetCreating(int i17, int i18, int i19);

    private native void nativeMarkSCWillStartAssetCreatingExporting();

    private native void nativeMarkSCWillStartPostEditing();

    private native void nativeMarkSCWillStartPreviewing(java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3, boolean z18, boolean z19, boolean z27, boolean z28);

    private native void nativeMarkSCWillStartRecording();

    private native void nativeMarkWillBegin();

    private native void nativeMarkWillBeginMovieComposing();

    private native void nativeMarkWillBeginShootComposing();

    private native void nativeNotifyMCAddAssets(int i17);

    private native void nativeNotifyMCApplyBatchClipping(java.lang.String str);

    private native void nativeNotifyMCApplyColorAdjustment(float f17, float f18, float f19, float f27, float f28, float f29);

    private native void nativeNotifyMCAutoAddBGM(java.lang.String str);

    private native void nativeNotifyMCCaptionStartTyping();

    private native void nativeNotifyMCCloseFilterGuiding();

    private native void nativeNotifyMCCloseMusicGuiding();

    private native void nativeNotifyMCCloseOSTRecognitionGuiding();

    private native void nativeNotifyMCCloseTitleInputGuiding();

    private native void nativeNotifyMCDeleteSegment();

    private native void nativeNotifyMCDraftExist();

    private native void nativeNotifyMCDragPlaybackProgressSlider();

    private native void nativeNotifyMCEditContentRange();

    private native void nativeNotifyMCEnterAddingAssetUI();

    private native void nativeNotifyMCEnterBatchClippingUI();

    private native void nativeNotifyMCEnterCanvasUI();

    private native void nativeNotifyMCEnterCaptionStyleUI();

    private native void nativeNotifyMCEnterColorAdjustmentUI();

    private native void nativeNotifyMCEnterCropUI();

    private native void nativeNotifyMCEnterFilterUI();

    private native void nativeNotifyMCEnterLyricStyleUI();

    private native void nativeNotifyMCEnterNarrationVolumeAdjustmentUI();

    private native void nativeNotifyMCEnterSpeedAdjustmentUI();

    private native void nativeNotifyMCEnterStickerEmoticonUI();

    private native void nativeNotifyMCEnterStickerFancyTextUI();

    private native void nativeNotifyMCEnterStickerWhenWhereUI();

    private native void nativeNotifyMCEnterTextClipTitleUI();

    private native void nativeNotifyMCEnterTextFancyTextUI();

    private native void nativeNotifyMCEnterTextMovieTitleUI();

    private native void nativeNotifyMCEnterTextOSTRecognitionUI();

    private native void nativeNotifyMCEnterVoiceChangeUI();

    private native void nativeNotifyMCEnterVolumeAdjustmentUI();

    private native void nativeNotifyMCExposeFilterGuiding();

    private native void nativeNotifyMCExposeMusicGuiding();

    private native void nativeNotifyMCExposeOSTRecognitionGuiding();

    private native void nativeNotifyMCExposeTitleInputGuiding();

    private native void nativeNotifyMCFirstVideoFrameDidPresent();

    private native void nativeNotifyMCGenerateDraft();

    private native void nativeNotifyMCMusicTouchEnableLyric();

    private native void nativeNotifyMCMusicTouchEnableMusic();

    private native void nativeNotifyMCMusicTouchEnableOST();

    private native void nativeNotifyMCRedo();

    private native void nativeNotifyMCReorderSegments();

    private native void nativeNotifyMCRotateSegment();

    private native void nativeNotifyMCScaleTimeline(float f17);

    private native void nativeNotifyMCSelectAnimID(java.lang.String str);

    private native void nativeNotifyMCSelectCaptionTextStyleID(java.lang.String str);

    private native void nativeNotifyMCSelectClipTitleTextStyleID(java.lang.String str);

    private native void nativeNotifyMCSelectEmoticonID(java.lang.String str);

    private native void nativeNotifyMCSelectFancyTextStyleID(java.lang.String str, boolean z17);

    private native void nativeNotifyMCSelectFilter(java.lang.String str);

    private native void nativeNotifyMCSelectMovieTitleTextStyleID(java.lang.String str);

    private native void nativeNotifyMCSelectStickerID(java.lang.String str);

    private native void nativeNotifyMCSelectTextToSpeechRoleID(java.lang.String str);

    private native void nativeNotifyMCSelectVoiceChangeRoleID(java.lang.String str);

    private native void nativeNotifyMCSelectWhenWhereID(java.lang.String str);

    private native void nativeNotifyMCSpeechRecognition();

    private native void nativeNotifyMCSplitSegment();

    private native void nativeNotifyMCStartPlaying();

    private native void nativeNotifyMCStickerFinishTyping(java.lang.String str);

    private native void nativeNotifyMCStopPlaying();

    private native void nativeNotifyMCTapCanvas();

    private native void nativeNotifyMCTemplateCreatingEnterSearchingMusic();

    private native void nativeNotifyMCTemplateCreatingExposeTemplate(java.lang.String str);

    private native void nativeNotifyMCTemplateCreatingSelectMusic(java.lang.String str);

    private native void nativeNotifyMCTemplateCreatingSelectTemplate(java.lang.String str);

    private native void nativeNotifyMCTemplateCreatingStartEditing();

    private native void nativeNotifyMCTemplateCreatingSwitchBGM(boolean z17);

    private native void nativeNotifyMCTemplateCreatingSwitchOST(boolean z17);

    private native void nativeNotifyMCTextCaptionCancelRecognition();

    private native void nativeNotifyMCTextCaptionRecognitionComplete();

    private native void nativeNotifyMCTextCaptionRecognitionFailed();

    private native void nativeNotifyMCTextCaptionRetryRecognition();

    private native void nativeNotifyMCTextCaptionStartRecognition();

    private native void nativeNotifyMCTextFinishTyping(java.lang.String str);

    private native void nativeNotifyMCTextStartTyping();

    private native void nativeNotifyMCTouchDigiZoom();

    private native void nativeNotifyMCTouchEnableOST();

    private native void nativeNotifyMCTouchFilterGuiding();

    private native void nativeNotifyMCTouchMusicGuiding();

    private native void nativeNotifyMCTouchOSTRecognitionGuiding();

    private native void nativeNotifyMCTouchPlayButton();

    private native void nativeNotifyMCTouchTitleInputGuiding();

    private native void nativeNotifyMCTrimSegment();

    private native void nativeNotifyMCUndo();

    private native void nativeNotifySCAdjustBeauty(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc);

    private native void nativeNotifySCAssetCreatingBackToAlbum();

    private native void nativeNotifySCAssetCreatingBeautyMakeupChanged(boolean z17);

    private native void nativeNotifySCAssetCreatingCropFlip();

    private native void nativeNotifySCAssetCreatingCropMove();

    private native void nativeNotifySCAssetCreatingCropReset();

    private native void nativeNotifySCAssetCreatingCropRotate();

    private native void nativeNotifySCAssetCreatingCropScale();

    private native void nativeNotifySCAssetCreatingEnterAlbum();

    private native void nativeNotifySCAssetCreatingEnterCropUI();

    private native void nativeNotifySCAssetCreatingEnterMovieComposing();

    private native void nativeNotifySCAssetCreatingTouchBeautyMakeupButton();

    private native void nativeNotifySCAssetCreatingTouchFeedbackButton();

    private native void nativeNotifySCAssetCreatingTouchSaveVideoButton();

    private native void nativeNotifySCBackgroundOff();

    private native void nativeNotifySCBackgroundOn();

    private native void nativeNotifySCCaptionOff();

    private native void nativeNotifySCCaptionOn();

    private native void nativeNotifySCCloseMicrophone();

    private native void nativeNotifySCDisableMusic();

    private native void nativeNotifySCDuetShootOff();

    private native void nativeNotifySCDuetShootOn();

    private native void nativeNotifySCEndExposeTemplate(java.lang.String str);

    private native void nativeNotifySCEnterAlbum();

    private native void nativeNotifySCEnterTemplatePanelShowingMode();

    private native void nativeNotifySCEnterTemplateTab(java.lang.String str);

    private native void nativeNotifySCEnterVisageBeautyAdjustmentUI();

    private native void nativeNotifySCEnterVisageBeautyUI();

    private native void nativeNotifySCEnterVisageFaceEffectUI();

    private native void nativeNotifySCEnterVisageFilterUI();

    private native void nativeNotifySCEnterVisageMakeupUI();

    private native void nativeNotifySCExposeCaptionButton();

    private native void nativeNotifySCExposeShootGuiding();

    private native void nativeNotifySCExposeTemplate(java.lang.String str);

    private native void nativeNotifySCFillInLightAuto();

    private native void nativeNotifySCFillInLightOff();

    private native void nativeNotifySCFillInLightOn();

    private native void nativeNotifySCFirstVideoFrameDidPresent();

    private native void nativeNotifySCNoMicrophonePermission();

    private native void nativeNotifySCOpenMicrophone();

    private native void nativeNotifySCReplay();

    private native void nativeNotifySCSelectBeautyParam(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc);

    private native void nativeNotifySCSelectCountDownMode(java.lang.String str);

    private native void nativeNotifySCSelectFaceEffectID(java.lang.String str);

    private native void nativeNotifySCSelectFilterID(java.lang.String str);

    private native void nativeNotifySCSelectGenderMode(java.lang.String str);

    private native void nativeNotifySCSelectMakeupID(java.lang.String str);

    private native void nativeNotifySCSelectRecordingDurationLimitMode(java.lang.String str);

    private native void nativeNotifySCSwitchToFrontFacingCamera();

    private native void nativeNotifySCSwitchToRearBackCamera();

    private native void nativeNotifySCTouchBackgroundButton();

    private native void nativeNotifySCTouchCameraSwitchButton();

    private native void nativeNotifySCTouchCaptionButton();

    private native void nativeNotifySCTouchCountDownButton();

    private native void nativeNotifySCTouchFavoriteButton(java.lang.String str, boolean z17);

    private native void nativeNotifySCTouchFillInLightButton();

    private native void nativeNotifySCTouchGenderSwitchButton();

    private native void nativeNotifySCTouchMicrophoneButton();

    private native void nativeNotifySCTouchRecordingDurationLimitButton();

    private native void nativeNotifySCUpdateFavoriteState(java.lang.String str, boolean z17);

    public void A(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCWillStartExporting(timeline, i17, i18);
    }

    public void A0() {
        nativeNotifyMCMusicTouchEnableMusic();
    }

    public void A1() {
        nativeNotifySCAssetCreatingTouchSaveVideoButton();
    }

    public void B(boolean z17, int i17, boolean z18) {
        nativeMarkMCWillStartImporting(z17, i17, z18);
    }

    public void B0() {
        nativeNotifyMCRedo();
    }

    public void B1() {
        nativeNotifySCBackgroundOff();
    }

    public void C() {
        nativeMarkMCWillStartRecordingNarration();
    }

    public void C0() {
        nativeNotifyMCReorderSegments();
    }

    public void C1() {
        nativeNotifySCBackgroundOn();
    }

    public void D(int i17, int i18, int i19) {
        nativeMarkMCWillStartTemplateCreating(i17, i18, i19);
    }

    public void D0() {
        nativeNotifyMCRotateSegment();
    }

    public void D1() {
        nativeNotifySCCaptionOff();
    }

    public void E(java.lang.String str, java.lang.String str2) {
        nativeMarkSCDidCancelRecording(str, str2);
    }

    public void E0(float f17) {
        nativeNotifyMCScaleTimeline(f17);
    }

    public void E1() {
        nativeNotifySCCaptionOn();
    }

    public void F() {
        nativeMarkSCDidCompleteCreation();
    }

    public void F0(java.lang.String str) {
        nativeNotifyMCSelectAnimID(str);
    }

    public void F1() {
        nativeNotifySCCloseMicrophone();
    }

    public void G(java.lang.String str, java.lang.String str2) {
        nativeMarkSCDidEndAssetCreating(str, str2);
    }

    public void G0(java.lang.String str) {
        nativeNotifyMCSelectCaptionTextStyleID(str);
    }

    public void G1() {
        nativeNotifySCDisableMusic();
    }

    public void H(java.lang.String str) {
        nativeMarkSCDidEndAssetCreatingExporting(str);
    }

    public void H0(java.lang.String str) {
        nativeNotifyMCSelectClipTitleTextStyleID(str);
    }

    public void H1(java.lang.String str) {
        nativeNotifySCEndExposeTemplate(str);
    }

    public void I() {
        nativeMarkSCDidEndPostEditing();
    }

    public void I0(java.lang.String str) {
        nativeNotifyMCSelectEmoticonID(str);
    }

    public void I1() {
        nativeNotifySCEnterAlbum();
    }

    public void J() {
        nativeMarkSCDidEndPreviewing();
    }

    public void J0(java.lang.String str) {
        nativeNotifyMCSelectFancyTextStyleID(str, false);
    }

    public void J1() {
        nativeNotifySCEnterTemplatePanelShowingMode();
    }

    public void K(java.lang.String str, boolean z17) {
        nativeMarkSCDidEndRecording(str, z17);
    }

    public void K0(java.lang.String str) {
        nativeNotifyMCSelectFilter(str);
    }

    public void K1(java.lang.String str) {
        nativeNotifySCEnterTemplateTab(str);
    }

    public void L(java.lang.String str, boolean z17) {
        nativeMarkSCDidExitMusicUI(str, z17);
    }

    public void L0(java.lang.String str) {
        nativeNotifyMCSelectMovieTitleTextStyleID(str);
    }

    public void L1() {
        nativeNotifySCEnterVisageBeautyUI();
    }

    public void M() {
        nativeMarkSCDidExitVisageUI();
    }

    public void M0(java.lang.String str) {
        nativeNotifyMCSelectTextToSpeechRoleID(str);
    }

    public void M1() {
        nativeNotifySCEnterVisageFaceEffectUI();
    }

    public void N() {
        nativeMarkSCWillEnterMusicUI();
    }

    public void N0(java.lang.String str) {
        nativeNotifyMCSelectVoiceChangeRoleID(str);
    }

    public void N1() {
        nativeNotifySCEnterVisageFilterUI();
    }

    public void O() {
        nativeMarkSCWillEnterVisageUI();
    }

    public void O0(java.lang.String str) {
        nativeNotifyMCSelectWhenWhereID(str);
    }

    public void O1() {
        nativeNotifySCEnterVisageMakeupUI();
    }

    public void P(int i17, int i18, int i19) {
        nativeMarkSCWillStartAssetCreating(i17, i18, i19);
    }

    public void P0() {
        nativeNotifyMCSpeechRecognition();
    }

    public void P1() {
        nativeNotifySCExposeCaptionButton();
    }

    public void Q() {
        nativeMarkSCWillStartAssetCreatingExporting();
    }

    public void Q0() {
        nativeNotifyMCSplitSegment();
    }

    public void Q1() {
        nativeNotifySCExposeShootGuiding();
    }

    public void R() {
        nativeMarkSCWillStartPostEditing();
    }

    public void R0() {
        nativeNotifyMCStartPlaying();
    }

    public void R1(java.lang.String str) {
        nativeNotifySCExposeTemplate(str);
    }

    public void S(java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3, boolean z18, boolean z19, boolean z27, boolean z28) {
        nativeMarkSCWillStartPreviewing(str, str2, i17, z17, str3, z18, z19, z27, z28);
    }

    public void S0() {
        nativeNotifyMCStopPlaying();
    }

    public void S1() {
        nativeNotifySCFillInLightAuto();
    }

    public void T() {
        nativeMarkSCWillStartRecording();
    }

    public void T0() {
        nativeNotifyMCTapCanvas();
    }

    public void T1() {
        nativeNotifySCFillInLightOff();
    }

    public void U() {
        nativeMarkWillBegin();
    }

    public void U0(java.lang.String str) {
        nativeNotifyMCTemplateCreatingExposeTemplate(str);
    }

    public void U1() {
        nativeNotifySCFillInLightOn();
    }

    public void V() {
        nativeMarkWillBeginMovieComposing();
    }

    public void V0(java.lang.String str) {
        nativeNotifyMCTemplateCreatingSelectMusic(str);
    }

    public void V1() {
        nativeNotifySCNoMicrophonePermission();
    }

    public void W() {
        nativeMarkWillBeginShootComposing();
    }

    public void W0(java.lang.String str) {
        nativeNotifyMCTemplateCreatingSelectTemplate(str);
    }

    public void W1() {
        nativeNotifySCOpenMicrophone();
    }

    public void X(int i17) {
        nativeNotifyMCAddAssets(i17);
    }

    public void X0() {
        nativeNotifyMCTemplateCreatingStartEditing();
    }

    public void X1() {
        nativeNotifySCReplay();
    }

    public void Y(java.lang.String str) {
        nativeNotifyMCApplyBatchClipping(str);
    }

    public void Y0() {
        nativeNotifyMCTextCaptionCancelRecognition();
    }

    public void Y1(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc) {
        nativeNotifySCSelectBeautyParam(mJBeautyAdjustmentDesc);
    }

    public void Z(float f17, float f18, float f19, float f27, float f28, float f29) {
        nativeNotifyMCApplyColorAdjustment(f17, f18, f19, f27, f28, f29);
    }

    public void Z0() {
        nativeNotifyMCTextCaptionRecognitionComplete();
    }

    public void Z1(java.lang.String str) {
        nativeNotifySCSelectCountDownMode(str);
    }

    public java.lang.String a() {
        return nativeGetSessionID();
    }

    public void a0() {
        nativeNotifyMCCaptionStartTyping();
    }

    public void a1() {
        nativeNotifyMCTextCaptionRecognitionFailed();
    }

    public void a2(java.lang.String str) {
        nativeNotifySCSelectFaceEffectID(str);
    }

    public long b() {
        return nativeGetVisitedStates();
    }

    public void b0() {
        nativeNotifyMCCloseMusicGuiding();
    }

    public void b1() {
        nativeNotifyMCTextCaptionRetryRecognition();
    }

    public void b2(java.lang.String str) {
        nativeNotifySCSelectFilterID(str);
    }

    public void c(java.lang.String str) {
        nativeMarkDidEnd(str);
    }

    public void c0() {
        nativeNotifyMCCloseOSTRecognitionGuiding();
    }

    public void c1() {
        nativeNotifyMCTextCaptionStartRecognition();
    }

    public void c2(java.lang.String str) {
        nativeNotifySCSelectGenderMode(str);
    }

    public void d(java.lang.String str) {
        nativeMarkDidEndMovieComposing(str);
    }

    public void d0() {
        nativeNotifyMCCloseTitleInputGuiding();
    }

    public void d1(java.lang.String str) {
        nativeNotifyMCTextFinishTyping(str);
    }

    public void d2(java.lang.String str) {
        nativeNotifySCSelectMakeupID(str);
    }

    public void e(java.lang.String str) {
        nativeMarkDidEndShootComposing(str);
    }

    public void e0() {
        nativeNotifyMCDeleteSegment();
    }

    public void e1() {
        nativeNotifyMCTextStartTyping();
    }

    public void e2(java.lang.String str) {
        nativeNotifySCSelectRecordingDurationLimitMode(str);
    }

    public void f() {
        nativeMarkMCDidCancelExporting();
    }

    public void f0() {
        nativeNotifyMCDragPlaybackProgressSlider();
    }

    public void f1() {
        nativeNotifyMCTouchDigiZoom();
    }

    public void f2() {
        nativeNotifySCSwitchToFrontFacingCamera();
    }

    public void g() {
        nativeMarkMCDidCompleteCreation();
    }

    public void g0() {
        nativeNotifyMCEditContentRange();
    }

    public void g1() {
        nativeNotifyMCTouchEnableOST();
    }

    public void g2() {
        nativeNotifySCSwitchToRearBackCamera();
    }

    public void h(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCDidEndComposing(timeline, i17, i18);
    }

    public void h0() {
        nativeNotifyMCEnterAddingAssetUI();
    }

    public void h1() {
        nativeNotifyMCTouchMusicGuiding();
    }

    public void h2() {
        nativeNotifySCTouchBackgroundButton();
    }

    public void i(java.lang.String str, boolean z17, java.lang.String str2, boolean z18) {
        nativeMarkMCDidEndExporting(str, z17, str2, z18);
    }

    public void i0() {
        nativeNotifyMCEnterBatchClippingUI();
    }

    public void i1() {
        nativeNotifyMCTouchOSTRecognitionGuiding();
    }

    public void i2() {
        nativeNotifySCTouchCameraSwitchButton();
    }

    public void j() {
        nativeMarkMCDidEndImporting();
    }

    public void j0() {
        nativeNotifyMCEnterCaptionStyleUI();
    }

    public void j1() {
        nativeNotifyMCTouchPlayButton();
    }

    public void j2() {
        nativeNotifySCTouchCaptionButton();
    }

    public void k() {
        nativeMarkMCDidEndRecordingNarration();
    }

    public void k0() {
        nativeNotifyMCEnterColorAdjustmentUI();
    }

    public void k1() {
        nativeNotifyMCTouchTitleInputGuiding();
    }

    public void k2() {
        nativeNotifySCTouchCountDownButton();
    }

    public void l(java.lang.String str, java.lang.String str2) {
        nativeMarkMCDidEndTemplateExporting(str, str2);
    }

    public void l0() {
        nativeNotifyMCEnterFilterUI();
    }

    public void l1() {
        nativeNotifyMCTrimSegment();
    }

    public void l2(java.lang.String str, boolean z17) {
        nativeNotifySCTouchFavoriteButton(str, z17);
    }

    public void m(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCDidExitClippingUI(timeline, i17, i18);
    }

    public void m0() {
        nativeNotifyMCEnterNarrationVolumeAdjustmentUI();
    }

    public void m1() {
        nativeNotifyMCUndo();
    }

    public void m2() {
        nativeNotifySCTouchFillInLightButton();
    }

    public void n(java.lang.String str, boolean z17, boolean z18, boolean z19, com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCDidExitMusicUI(str, z17, z18, z19, timeline, i17, i18);
    }

    public void n0() {
        nativeNotifyMCEnterSpeedAdjustmentUI();
    }

    public void n1(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc) {
        nativeNotifySCAdjustBeauty(mJBeautyAdjustmentDesc);
    }

    public void n2() {
        nativeNotifySCTouchGenderSwitchButton();
    }

    public void o(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCDidExitNarrationUI(timeline, i17, i18);
    }

    public void o0() {
        nativeNotifyMCEnterStickerEmoticonUI();
    }

    public void o1() {
        nativeNotifySCAssetCreatingBackToAlbum();
    }

    public void o2() {
        nativeNotifySCTouchMicrophoneButton();
    }

    public void p(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCDidExitStickerUI(timeline, i17, i18);
    }

    public void p0() {
        nativeNotifyMCEnterStickerWhenWhereUI();
    }

    public void p1(boolean z17) {
        nativeNotifySCAssetCreatingBeautyMakeupChanged(z17);
    }

    public void p2() {
        nativeNotifySCTouchRecordingDurationLimitButton();
    }

    public void q(com.tencent.maas.moviecomposing.Timeline timeline, int i17, int i18) {
        nativeMarkMCDidExitTextUI(timeline, i17, i18);
    }

    public void q0() {
        nativeNotifyMCEnterTextClipTitleUI();
    }

    public void q1() {
        nativeNotifySCAssetCreatingCropFlip();
    }

    public void q2() {
        this.mHybridData.resetNative();
    }

    public void r(com.tencent.maas.moviecomposing.Timeline timeline) {
        nativeMarkMCDidStartComposing(timeline);
    }

    public void r0() {
        nativeNotifyMCEnterTextFancyTextUI();
    }

    public void r1() {
        nativeNotifySCAssetCreatingCropMove();
    }

    public void s(java.lang.String str, java.util.Map map) {
        nativeMarkMCDidStartExporting(str, map);
    }

    public void s0() {
        nativeNotifyMCEnterTextMovieTitleUI();
    }

    public void s1() {
        nativeNotifySCAssetCreatingCropReset();
    }

    public void t() {
        nativeMarkMCDidStartImporting();
    }

    public void t0() {
        nativeNotifyMCEnterTextOSTRecognitionUI();
    }

    public void t1() {
        nativeNotifySCAssetCreatingCropRotate();
    }

    public void u(java.lang.String str) {
        nativeMarkMCWillEnterClippingUI(str);
    }

    public void u0() {
        nativeNotifyMCEnterVoiceChangeUI();
    }

    public void u1() {
        nativeNotifySCAssetCreatingCropScale();
    }

    public void v(java.lang.String str) {
        nativeMarkMCWillEnterMusicUI(str);
    }

    public void v0() {
        nativeNotifyMCEnterVolumeAdjustmentUI();
    }

    public void v1() {
        nativeNotifySCAssetCreatingEnterAlbum();
    }

    public void w(java.lang.String str) {
        nativeMarkMCWillEnterNarrationUI(str);
    }

    public void w0() {
        nativeNotifyMCExposeMusicGuiding();
    }

    public void w1() {
        nativeNotifySCAssetCreatingEnterCropUI();
    }

    public void x(java.lang.String str) {
        nativeMarkMCWillEnterStickerUI(str);
    }

    public void x0() {
        nativeNotifyMCExposeOSTRecognitionGuiding();
    }

    public void x1() {
        nativeNotifySCAssetCreatingEnterMovieComposing();
    }

    public void y(java.lang.String str) {
        nativeMarkMCWillEnterTextUI(str);
    }

    public void y0() {
        nativeNotifyMCExposeTitleInputGuiding();
    }

    public void y1() {
        nativeNotifySCAssetCreatingTouchBeautyMakeupButton();
    }

    public void z() {
        nativeMarkMCWillStartComposing();
    }

    public void z0() {
        nativeNotifyMCMusicTouchEnableLyric();
    }

    public void z1() {
        nativeNotifySCAssetCreatingTouchFeedbackButton();
    }
}
