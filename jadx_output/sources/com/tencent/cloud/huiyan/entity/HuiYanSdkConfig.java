package com.tencent.cloud.huiyan.entity;

/* loaded from: classes14.dex */
public class HuiYanSdkConfig {
    private com.tencent.cloud.huiyan.enums.HuiYanAction[] actions;
    private boolean isDeleteVideoCache = true;
    private java.lang.String authLicense = "";
    private java.lang.String useCustomerModelPath = "";
    private long prepareFaceTimeOutMs = 30000;
    private long authTimeOutMs = 30000;
    private boolean isCloseEncrypt = false;
    private com.tencent.cloud.huiyan.enums.LanguageStyle languageStyle = com.tencent.cloud.huiyan.enums.LanguageStyle.AUTO;
    private java.lang.String languageCode = "";
    private boolean isRecordVideo = true;
    private com.tencent.cloud.huiyan.enums.RecordVideoParam recordVideoParam = new com.tencent.cloud.huiyan.enums.RecordVideoParam.Builder().build();
    private boolean isCutRecordVideo = false;
    private long cutVideoDurationMs = 2000;
    private boolean isBackgroundStopAuth = true;
    private boolean waitingUserCompare = false;
    private boolean disableSystemRecordScreen = false;
    private boolean isUseBackCamera = false;
    private int bestImageContinuousFrameNum = 1;
    private com.tencent.cloud.huiyan.enums.HuiYanLiveMode huiYanLiveMode = com.tencent.cloud.huiyan.enums.HuiYanLiveMode.ACTION_REFLECT_MODE;
    private com.tencent.cloud.huiyan.enums.HuiYanEncryptMode encryptMode = com.tencent.cloud.huiyan.enums.HuiYanEncryptMode.AES;
    private boolean isOpenLog = true;
    private com.tencent.cloud.aicamare.enums.CameraZoom zoomLevel = com.tencent.cloud.aicamare.enums.CameraZoom.ZOOM_1X;
    private boolean mustDiffMinAndMaxFps = false;
    private boolean isOpenAngleDetect = false;
    private boolean isAutoScreenBrightness = true;
    private boolean isOpenLongCheck = false;
    private boolean isUseBestFaceImage = false;
    private boolean isLandMode = false;
    private float landCloseRatio = 0.35f;
    private float portraitCloseRatio = 0.5f;
    private boolean isShowPrepareTimeout = true;
    private boolean isShowLongCheckTimeout = true;
    private boolean isShowActionTimeout = true;
    private boolean longCheckUseLocalCloseMouthThreshold = false;
    private boolean longCheckUseBlurMode = false;
    private boolean openFullLog = false;
    private boolean showDebugView = false;
    private boolean justCheckRawCamera = false;
    private boolean isOpenLightReflectAnim = false;
    private boolean useTransition = false;
    private long transitionTime = 3000;
    private long checkEnvRiskTimeout = 3000;
    private volatile boolean isHaveResultFragment = false;
    private com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig = new com.tencent.cloud.huiyan.entity.AuthUiConfig();
    private boolean isOpenAudio = false;

    public com.tencent.cloud.huiyan.enums.HuiYanAction[] getActions() {
        return this.actions;
    }

    public java.lang.String getAuthLicense() {
        return this.authLicense;
    }

    public long getAuthTimeOutMs() {
        return this.authTimeOutMs;
    }

    public com.tencent.cloud.huiyan.entity.AuthUiConfig getAuthUiConfig() {
        return this.authUiConfig;
    }

    public int getBestImageContinuousFrameNum() {
        return this.bestImageContinuousFrameNum;
    }

    public long getCheckEnvRiskTimeout() {
        return this.checkEnvRiskTimeout;
    }

    public long getCutVideoDurationMs() {
        return this.cutVideoDurationMs;
    }

    public com.tencent.cloud.huiyan.enums.HuiYanEncryptMode getEncryptMode() {
        return this.encryptMode;
    }

    public com.tencent.cloud.huiyan.enums.HuiYanLiveMode getHuiYanLiveMode() {
        return this.huiYanLiveMode;
    }

    public float getLandCloseRatio() {
        return this.landCloseRatio;
    }

    public java.lang.String getLanguageCode() {
        return this.languageCode;
    }

    public com.tencent.cloud.huiyan.enums.LanguageStyle getLanguageStyle() {
        return this.languageStyle;
    }

    public float getPortraitCloseRatio() {
        return this.portraitCloseRatio;
    }

    public long getPrepareFaceTimeOutMs() {
        return this.prepareFaceTimeOutMs;
    }

    public com.tencent.cloud.huiyan.enums.RecordVideoParam getRecordVideoParam() {
        return this.recordVideoParam;
    }

    public long getTransitionTime() {
        return this.transitionTime;
    }

    public java.lang.String getUseCustomerModelPath() {
        return this.useCustomerModelPath;
    }

    public com.tencent.cloud.aicamare.enums.CameraZoom getZoomLevel() {
        return this.zoomLevel;
    }

    public boolean isAutoScreenBrightness() {
        return this.isAutoScreenBrightness;
    }

    public boolean isBackgroundStopAuth() {
        return this.isBackgroundStopAuth;
    }

    public boolean isCloseEncrypt() {
        return this.isCloseEncrypt;
    }

    public boolean isCutRecordVideo() {
        return this.isCutRecordVideo;
    }

    public boolean isDeleteVideoCache() {
        return this.isDeleteVideoCache;
    }

    public boolean isDisableSystemRecordScreen() {
        return this.disableSystemRecordScreen;
    }

    public boolean isHaveResultFragment() {
        return this.isHaveResultFragment;
    }

    public boolean isJustCheckRawCamera() {
        return this.justCheckRawCamera;
    }

    public boolean isLandMode() {
        return this.isLandMode;
    }

    public boolean isLongCheckUseBlurMode() {
        return this.longCheckUseBlurMode;
    }

    public boolean isLongCheckUseLocalCloseMouthThreshold() {
        return this.longCheckUseLocalCloseMouthThreshold;
    }

    public boolean isMustDiffMinAndMaxFps() {
        return this.mustDiffMinAndMaxFps;
    }

    public boolean isOpenAngleDetect() {
        return this.isOpenAngleDetect;
    }

    public boolean isOpenAudio() {
        return this.isOpenAudio;
    }

    public boolean isOpenFullLog() {
        return this.openFullLog;
    }

    public boolean isOpenLightReflectAnim() {
        return this.isOpenLightReflectAnim;
    }

    public boolean isOpenLog() {
        return this.isOpenLog;
    }

    public boolean isOpenLongCheck() {
        return this.isOpenLongCheck;
    }

    public boolean isRecordVideo() {
        return this.isRecordVideo;
    }

    public boolean isShowActionTimeout() {
        return this.isShowActionTimeout;
    }

    public boolean isShowDebugView() {
        return this.showDebugView;
    }

    public boolean isShowLongCheckTimeout() {
        return this.isShowLongCheckTimeout;
    }

    public boolean isShowPrepareTimeout() {
        return this.isShowPrepareTimeout;
    }

    public boolean isUseBackCamera() {
        return this.isUseBackCamera;
    }

    public boolean isUseBestFaceImage() {
        return this.isUseBestFaceImage;
    }

    public boolean isUseTransition() {
        return this.useTransition;
    }

    public boolean isWaitingUserCompare() {
        return this.waitingUserCompare;
    }

    public void setActions(com.tencent.cloud.huiyan.enums.HuiYanAction[] huiYanActionArr) {
        this.actions = huiYanActionArr;
    }

    public void setAuthLicense(java.lang.String str) {
        this.authLicense = str;
    }

    public void setAuthTimeOutMs(long j17) {
        this.authTimeOutMs = j17;
    }

    public void setAuthUiConfig(com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig) {
        this.authUiConfig = authUiConfig;
    }

    public void setAutoScreenBrightness(boolean z17) {
        this.isAutoScreenBrightness = z17;
    }

    public void setBackgroundStopAuth(boolean z17) {
        this.isBackgroundStopAuth = z17;
    }

    public void setBestImageContinuousFrameNum(int i17) {
        this.bestImageContinuousFrameNum = i17;
    }

    public void setCheckEnvRiskTimeout(long j17) {
        this.checkEnvRiskTimeout = j17;
    }

    public void setCloseEncrypt(boolean z17) {
        this.isCloseEncrypt = z17;
    }

    public void setCutRecordVideo(boolean z17) {
        this.isCutRecordVideo = z17;
    }

    public void setCutVideoDurationMs(long j17) {
        if (j17 < 2000) {
            this.cutVideoDurationMs = 2000L;
        } else if (j17 > androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
            this.cutVideoDurationMs = androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        } else {
            this.cutVideoDurationMs = j17;
        }
    }

    public void setDeleteVideoCache(boolean z17) {
        this.isDeleteVideoCache = z17;
    }

    public void setDisableSystemRecordScreen(boolean z17) {
        this.disableSystemRecordScreen = z17;
    }

    public void setEncryptMode(com.tencent.cloud.huiyan.enums.HuiYanEncryptMode huiYanEncryptMode) {
        this.encryptMode = huiYanEncryptMode;
    }

    public void setHaveResultFragment(boolean z17) {
        this.isHaveResultFragment = z17;
    }

    public void setHuiYanLiveMode(com.tencent.cloud.huiyan.enums.HuiYanLiveMode huiYanLiveMode) {
        this.huiYanLiveMode = huiYanLiveMode;
    }

    public void setJustCheckRawCamera(boolean z17) {
        this.justCheckRawCamera = z17;
    }

    public void setLandCloseRatio(float f17) {
        this.landCloseRatio = f17;
    }

    public void setLandMode(boolean z17) {
        this.isLandMode = z17;
    }

    public void setLanguageCode(java.lang.String str) {
        this.languageCode = str;
    }

    public void setLanguageStyle(com.tencent.cloud.huiyan.enums.LanguageStyle languageStyle) {
        this.languageStyle = languageStyle;
    }

    public void setLongCheckUseBlurMode(boolean z17) {
        this.longCheckUseBlurMode = z17;
    }

    public void setLongCheckUseLocalCloseMouthThreshold(boolean z17) {
        this.longCheckUseLocalCloseMouthThreshold = z17;
    }

    public void setMustDiffMinAndMaxFps(boolean z17) {
        this.mustDiffMinAndMaxFps = z17;
    }

    public void setOpenAngleDetect(boolean z17) {
        this.isOpenAngleDetect = z17;
    }

    public void setOpenAudio(boolean z17) {
        this.isOpenAudio = z17;
    }

    public void setOpenFullLog(boolean z17) {
        this.openFullLog = z17;
    }

    public void setOpenLightReflectAnim(boolean z17) {
        this.isOpenLightReflectAnim = z17;
    }

    public void setOpenLog(boolean z17) {
        this.isOpenLog = z17;
    }

    public void setOpenLongCheck(boolean z17) {
        this.isOpenLongCheck = z17;
    }

    public void setPortraitCloseRatio(float f17) {
        this.portraitCloseRatio = f17;
    }

    public void setPrepareFaceTimeOutMs(long j17) {
        this.prepareFaceTimeOutMs = j17;
    }

    public void setRecordVideo(boolean z17) {
        this.isRecordVideo = z17;
    }

    public void setRecordVideoParam(com.tencent.cloud.huiyan.enums.RecordVideoParam recordVideoParam) {
        this.recordVideoParam = recordVideoParam;
    }

    public void setShowActionTimeout(boolean z17) {
        this.isShowActionTimeout = z17;
    }

    public void setShowDebugView(boolean z17) {
        this.showDebugView = z17;
    }

    public void setShowLongCheckTimeout(boolean z17) {
        this.isShowLongCheckTimeout = z17;
    }

    public void setShowPrepareTimeout(boolean z17) {
        this.isShowPrepareTimeout = z17;
    }

    public void setTransitionTime(long j17) {
        this.transitionTime = j17;
    }

    public void setUseBackCamera(boolean z17) {
        this.isUseBackCamera = z17;
    }

    public void setUseBestFaceImage(boolean z17) {
        this.isUseBestFaceImage = z17;
    }

    public void setUseCustomerModelPath(java.lang.String str) {
        this.useCustomerModelPath = str;
    }

    public void setUseTransition(boolean z17) {
        this.useTransition = z17;
    }

    public void setWaitingUserCompare(boolean z17) {
        this.waitingUserCompare = z17;
    }

    public void setZoomLevel(com.tencent.cloud.aicamare.enums.CameraZoom cameraZoom) {
        this.zoomLevel = cameraZoom;
    }

    public java.lang.String toString() {
        return "HuiYanSdkConfig{isDeleteVideoCache=" + this.isDeleteVideoCache + ", authLicense='" + this.authLicense + "', useCustomerModelPath='" + this.useCustomerModelPath + "', prepareFaceTimeOutMs=" + this.prepareFaceTimeOutMs + ", authTimeOutMs=" + this.authTimeOutMs + ", isCloseEncrypt=" + this.isCloseEncrypt + ", languageStyle=" + this.languageStyle + ", languageCode='" + this.languageCode + "', isRecordVideo=" + this.isRecordVideo + ", isCutRecordVideo=" + this.isCutRecordVideo + ", isBackgroundStopAuth=" + this.isBackgroundStopAuth + ", waitingUserCompare=" + this.waitingUserCompare + ", disableSystemRecordScreen=" + this.disableSystemRecordScreen + ", isUseBackCamera=" + this.isUseBackCamera + ", bestImageContinuousFrameNum=" + this.bestImageContinuousFrameNum + ", huiYanLiveMode=" + this.huiYanLiveMode + ", encryptMode=" + this.encryptMode + ", isOpenAngleDetect=" + this.isOpenAngleDetect + ", isAutoScreenBrightness=" + this.isAutoScreenBrightness + ", isOpenLongCheck=" + this.isOpenLongCheck + ", actions=" + java.util.Arrays.toString(this.actions) + '}';
    }
}
