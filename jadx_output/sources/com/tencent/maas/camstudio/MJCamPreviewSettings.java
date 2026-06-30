package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamPreviewSettings {
    private float aigcGeneratingTimeout;
    private rg.c cameraDimensionLevel;
    private com.tencent.maas.moviecomposing.c defaultAspectRatio;
    private final com.tencent.maas.camstudio.MJCamLyricsStyle defaultLyricsStyle;
    private rg.c forcedUseDimensionLevel;
    private boolean isAsyncAIGCEnabled;
    private final boolean isDeformNeedCrop;
    private boolean isUseAIGCBridgeService;
    private final boolean isUseEchoCancellation;
    private boolean isUseLongSide1920Policy;
    private boolean isUsingFrontCamera;
    private float lensDirtyCheckThreshold;
    private boolean needRunningCaptureSession;
    private com.tencent.maas.camstudio.MJCaptureSession preloadCaptureSession;
    private final rg.c previewDimensionLevel;

    public MJCamPreviewSettings(float f17, rg.c cVar, rg.c cVar2, boolean z17, boolean z18, com.tencent.maas.camstudio.MJCamLyricsStyle mJCamLyricsStyle, float f18, boolean z19, boolean z27, rg.c cVar3) {
        this.isUseAIGCBridgeService = false;
        this.isAsyncAIGCEnabled = false;
        this.defaultAspectRatio = null;
        this.preloadCaptureSession = null;
        this.needRunningCaptureSession = true;
        this.lensDirtyCheckThreshold = f17;
        this.previewDimensionLevel = cVar;
        this.forcedUseDimensionLevel = cVar2;
        this.isDeformNeedCrop = z17;
        this.isUseEchoCancellation = z18;
        this.defaultLyricsStyle = mJCamLyricsStyle;
        this.aigcGeneratingTimeout = f18;
        this.isUseLongSide1920Policy = z19;
        this.isUsingFrontCamera = z27;
        this.cameraDimensionLevel = cVar3;
    }

    public float getAigcGeneratingTimeout() {
        return this.aigcGeneratingTimeout;
    }

    public int getCameraDimensionLevel() {
        rg.c cVar = this.cameraDimensionLevel;
        if (cVar != null) {
            return cVar.f395149d;
        }
        rg.c cVar2 = rg.c.DIMENSION_LEVEL_360;
        return 5;
    }

    public int getDefaultAspectRatio() {
        com.tencent.maas.moviecomposing.c cVar = this.defaultAspectRatio;
        if (cVar == null) {
            return -1;
        }
        return cVar.f48482d;
    }

    public com.tencent.maas.camstudio.MJCamLyricsStyle getDefaultLyricsStyle() {
        return this.defaultLyricsStyle;
    }

    public int getForcedUseDimensionLevel() {
        rg.c cVar = this.forcedUseDimensionLevel;
        if (cVar == null) {
            return -1;
        }
        return cVar.f395149d;
    }

    public float getLensDirtyCheckThreshold() {
        return this.lensDirtyCheckThreshold;
    }

    public com.tencent.maas.camstudio.MJCaptureSession getPreloadCaptureSession() {
        return this.preloadCaptureSession;
    }

    public int getPreviewDimensionLevel() {
        return this.previewDimensionLevel.f395149d;
    }

    public boolean isAsyncAIGCEnabled() {
        return this.isAsyncAIGCEnabled;
    }

    public boolean isDeformNeedCrop() {
        return this.isDeformNeedCrop;
    }

    public boolean isNeedRunningCaptureSession() {
        return this.needRunningCaptureSession;
    }

    public boolean isUseAIGCBridgeService() {
        return this.isUseAIGCBridgeService;
    }

    public boolean isUseEchoCancellation() {
        return this.isUseEchoCancellation;
    }

    public boolean isUseLongSide1920Policy() {
        return this.isUseLongSide1920Policy;
    }

    public boolean isUsingFrontCamera() {
        return this.isUsingFrontCamera;
    }

    public void setAigcGeneratingTimeout(float f17) {
        this.aigcGeneratingTimeout = f17;
    }

    public void setAsyncAIGCEnabled(boolean z17) {
        this.isAsyncAIGCEnabled = z17;
    }

    public void setCameraDimensionLevel(rg.c cVar) {
        this.cameraDimensionLevel = cVar;
    }

    public void setDefaultAspectRatio(com.tencent.maas.moviecomposing.c cVar) {
        this.defaultAspectRatio = cVar;
    }

    public void setForcedUseDimensionLevel(rg.c cVar) {
        this.forcedUseDimensionLevel = cVar;
    }

    public void setLensDirtyCheckThreshold(float f17) {
        this.lensDirtyCheckThreshold = f17;
    }

    public void setNeedRunningCaptureSession(boolean z17) {
        this.needRunningCaptureSession = z17;
    }

    public void setPreloadCaptureSession(com.tencent.maas.camstudio.MJCaptureSession mJCaptureSession) {
        this.preloadCaptureSession = mJCaptureSession;
    }

    public void setUseAIGCBridgeService(boolean z17) {
        this.isUseAIGCBridgeService = z17;
    }

    public void setUseLongSide1920Policy(boolean z17) {
        this.isUseLongSide1920Policy = z17;
    }

    public void setUsingFrontCamera(boolean z17) {
        this.isUsingFrontCamera = z17;
    }

    public MJCamPreviewSettings(rg.c cVar) {
        this.aigcGeneratingTimeout = 30.0f;
        this.isUseAIGCBridgeService = false;
        this.isAsyncAIGCEnabled = false;
        this.lensDirtyCheckThreshold = 0.75f;
        this.isUseLongSide1920Policy = false;
        this.defaultAspectRatio = null;
        this.isUsingFrontCamera = false;
        this.cameraDimensionLevel = null;
        this.preloadCaptureSession = null;
        this.needRunningCaptureSession = true;
        this.previewDimensionLevel = cVar;
        this.forcedUseDimensionLevel = null;
        this.isDeformNeedCrop = false;
        this.isUseEchoCancellation = false;
        this.defaultLyricsStyle = null;
    }

    public MJCamPreviewSettings(rg.c cVar, boolean z17) {
        this.aigcGeneratingTimeout = 30.0f;
        this.isUseAIGCBridgeService = false;
        this.isAsyncAIGCEnabled = false;
        this.lensDirtyCheckThreshold = 0.75f;
        this.isUseLongSide1920Policy = false;
        this.defaultAspectRatio = null;
        this.cameraDimensionLevel = null;
        this.preloadCaptureSession = null;
        this.needRunningCaptureSession = true;
        this.isUsingFrontCamera = z17;
        this.previewDimensionLevel = cVar;
        this.forcedUseDimensionLevel = null;
        this.isDeformNeedCrop = false;
        this.isUseEchoCancellation = false;
        this.defaultLyricsStyle = null;
    }

    public MJCamPreviewSettings(rg.c cVar, boolean z17, boolean z18) {
        this.aigcGeneratingTimeout = 30.0f;
        this.isUseAIGCBridgeService = false;
        this.isAsyncAIGCEnabled = false;
        this.lensDirtyCheckThreshold = 0.75f;
        this.isUseLongSide1920Policy = false;
        this.defaultAspectRatio = null;
        this.isUsingFrontCamera = false;
        this.cameraDimensionLevel = null;
        this.preloadCaptureSession = null;
        this.needRunningCaptureSession = true;
        this.previewDimensionLevel = cVar;
        this.forcedUseDimensionLevel = null;
        this.isDeformNeedCrop = z17;
        this.isUseEchoCancellation = z18;
        this.defaultLyricsStyle = null;
    }

    public MJCamPreviewSettings(rg.c cVar, boolean z17, boolean z18, com.tencent.maas.camstudio.MJCamLyricsStyle mJCamLyricsStyle) {
        this.aigcGeneratingTimeout = 30.0f;
        this.isUseAIGCBridgeService = false;
        this.isAsyncAIGCEnabled = false;
        this.lensDirtyCheckThreshold = 0.75f;
        this.isUseLongSide1920Policy = false;
        this.defaultAspectRatio = null;
        this.isUsingFrontCamera = false;
        this.cameraDimensionLevel = null;
        this.preloadCaptureSession = null;
        this.needRunningCaptureSession = true;
        this.previewDimensionLevel = cVar;
        this.forcedUseDimensionLevel = null;
        this.isDeformNeedCrop = z17;
        this.isUseEchoCancellation = z18;
        this.defaultLyricsStyle = mJCamLyricsStyle;
    }
}
