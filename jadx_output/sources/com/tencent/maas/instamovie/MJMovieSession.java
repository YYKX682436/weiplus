package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMovieSession {
    public static final int INVALID_REQUEST_ID = 0;
    public static final java.lang.String MJDUMMY_TEMPLATE_ID = "MJDummyTemplate";
    public static final long MJSEGMENT_OPTIONS_NOT_EDITABLE = 0;
    public static final long MJSEGMENT_OPTIONS_POSITION_EDITABLE = 1;
    public static final long MJSEGMENT_OPTIONS_ROTATION_EDITABLE = 2;
    public static final long MJSEGMENT_OPTIONS_SCALE_EDITABLE = 4;
    public static final long MJSEGMENT_OPTIONS_TEXT_EDITABLE = 8;
    private static final java.lang.String TAG = "MJMovieSession";
    private io.clipworks.displaysys.DSViewProxy dsViewProxy;
    private final com.tencent.maas.internal.NativeCallbackManager mCallbackManager;
    private final com.facebook.jni.HybridData mHybridData;

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType;

        static {
            int[] iArr = new int[com.tencent.maas.model.MJMusicOptions.SourceType.values().length];
            $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType = iArr;
            try {
                iArr[com.tencent.maas.model.MJMusicOptions.SourceType.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType[com.tencent.maas.model.MJMusicOptions.SourceType.TemplateBuiltin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType[com.tencent.maas.model.MJMusicOptions.SourceType.Recommendation.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ClipBundleInfo {
        private final java.lang.String clipbundleAbsPath;
        private final java.lang.String clipbundleId;
        private final java.lang.String clipbundleRelPath;
        public final java.lang.String coverPath;
        public final long sizeInDisk;

        public ClipBundleInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
            this.clipbundleId = str;
            this.clipbundleAbsPath = str2;
            this.clipbundleRelPath = str3;
            this.coverPath = str4;
            this.sizeInDisk = j17;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.tencent.maas.instamovie.MJMovieSession.ClipBundleInfo clipBundleInfo = (com.tencent.maas.instamovie.MJMovieSession.ClipBundleInfo) obj;
            return this.sizeInDisk == clipBundleInfo.sizeInDisk && this.clipbundleId.equals(clipBundleInfo.clipbundleId) && this.coverPath.equals(clipBundleInfo.coverPath);
        }

        public java.lang.String getClipbundleId() {
            return this.clipbundleId;
        }

        public java.lang.String getClipbundlePath() {
            return this.clipbundleAbsPath;
        }

        public java.lang.String getCoverPath() {
            return this.coverPath;
        }

        public long getSizeInDisk() {
            return this.sizeInDisk;
        }

        public int hashCode() {
            return java.util.Objects.hash(this.clipbundleId, this.coverPath, java.lang.Long.valueOf(this.sizeInDisk));
        }
    }

    /* loaded from: classes5.dex */
    public enum MJMovieComposingMode {
        Clipping(0),
        Simple(1);

        private final int value;

        MJMovieComposingMode(int i17) {
            this.value = i17;
        }

        public static com.tencent.maas.instamovie.MJMovieSession.MJMovieComposingMode fromInt(int i17) {
            for (com.tencent.maas.instamovie.MJMovieSession.MJMovieComposingMode mJMovieComposingMode : values()) {
                if (mJMovieComposingMode.getValue() == i17) {
                    return mJMovieComposingMode;
                }
            }
            return Clipping;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes5.dex */
    public interface OnComplete {
        void onComplete(com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnDidTapSegment {
        void onDidTapSegment(java.lang.String str, long j17);
    }

    /* loaded from: classes5.dex */
    public interface OnExportClipBundle {
        void onExportClipBundle(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnExportComplete {
        void onExportComplete(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnHandleBoxComplete {
        void onHandleBoxComplete(java.lang.String str);
    }

    /* loaded from: classes5.dex */
    public interface OnHandleBoxSettingsChanged {
        void handleBoxSettingsChanged(com.tencent.maas.handlebox.model.MJHandleBoxSettings mJHandleBoxSettings);
    }

    /* loaded from: classes5.dex */
    public interface OnMediaTimeChange {
        void onMediaTimeChange(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17);
    }

    /* loaded from: classes5.dex */
    public interface OnMusicRecommendComplete {
        void onRecommendComplete(com.tencent.maas.model.MJMusicInfo[] mJMusicInfoArr, com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnProgress {
        void onProgress(float f17);
    }

    /* loaded from: classes5.dex */
    public interface OnRecommendComplete {
        void onRecommendComplete(com.tencent.maas.model.MJTemplateRecommendResult mJTemplateRecommendResult, com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnTaskProgress {
        void onTaskProgress(float f17, com.tencent.maas.instamovie.MJTaskTrace mJTaskTrace);
    }

    /* loaded from: classes5.dex */
    public interface OnTemplateBuildComplete {
        void onTemplateBuildComplete(com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult, com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnWillShowHandleBox {
        void onWillShowHandleBox(java.lang.String str, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22, float f17);
    }

    /* loaded from: classes5.dex */
    public interface SnapshotAndExportClipBundleCallback {
        void onError(com.tencent.maas.instamovie.base.MJError mJError);

        void onSuccess(com.tencent.maas.instamovie.MJMovieSession.ClipBundleInfo clipBundleInfo);
    }

    public MJMovieSession(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native com.tencent.maas.instamovie.MJSegment nativeAddStickerSegment(java.lang.String str, boolean z17);

    private native com.tencent.maas.instamovie.MJSegment nativeAddTextSegment(java.lang.String str, com.tencent.maas.model.MJSpatialInfo mJSpatialInfo, com.tencent.maas.model.MJTextStyle mJTextStyle, com.tencent.maas.model.MJLayerStyle mJLayerStyle, float f17, boolean z17);

    private native void nativeBeginClipping(int i17);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeBuildBlankTemplate(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeBuildTemplateWithMusic(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeBuildTemplateWithTemplate(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeCancelBuildTemplate(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeCancelExporting(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeCancelMovieCreation(int i17);

    private native void nativeCancelMusicRecommend(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeCancelRecreation(int i17);

    private native void nativeCancelTemplateRecommend(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeCommitChangesAndNotifyRenderUpdate(boolean z17);

    private native com.tencent.maas.instamovie.base.MJError nativeCommitChangesAndNotifyRenderUpdateByPreviewTime(com.tencent.maas.model.time.MJTime mJTime, boolean z17);

    private native com.tencent.maas.instamovie.base.MJError nativeConnectToView(java.lang.Object obj);

    private native com.tencent.maas.base.Vec2 nativeConvertCanvasPointToViewPoint(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native com.tencent.maas.base.Vec2 nativeConvertViewPointToCanvasPoint(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native com.tencent.maas.instamovie.base.MJError nativeDisconnectFromView();

    private native void nativeEndClipping(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeEnterFocusMode(java.lang.String str);

    private native void nativeExportClipBundle(int i17);

    private native com.tencent.maas.instamovie.base.asset.MJAssetInfo nativeGetAssetInfo(java.lang.String str);

    private native java.lang.Object[] nativeGetCurrentLyricInfos();

    private native com.tencent.maas.instamovie.MJMovieOptions nativeGetCurrentMovieOptions();

    private native com.tencent.maas.model.MJMusicInfo nativeGetCurrentMusicInfo();

    private native com.tencent.maas.model.MJMusicOptions nativeGetCurrentMusicOptions();

    private native com.tencent.maas.model.time.MJTime nativeGetCurrentPlaybackTime();

    private native int nativeGetCurrentState();

    private native com.tencent.maas.model.MJTemplateInfo nativeGetCurrentTemplateInfo();

    private native java.lang.Object[] nativeGetCurrentTemplateMusicInfos();

    private native com.tencent.maas.instamovie.MJTemplateSettings nativeGetCurrentTemplateSettings();

    private native com.tencent.maas.model.time.MJTime nativeGetPlaybackDuration();

    private native java.lang.Object[] nativeGetRecommendedMusicInfos();

    private native com.tencent.maas.model.time.MJTime nativeGetSegmentClipDuration(java.lang.String str);

    private native com.tencent.maas.base.Rect2 nativeGetSegmentNormalizedCropRect(java.lang.String str);

    private native int nativeGetSegmentRotationMode(java.lang.String str);

    private native com.tencent.maas.model.MJSpatialInfo nativeGetSegmentSpatialInfo(java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetSegmentTimeRangeInClip(java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetSegmentTimeRangeInTimeline(java.lang.String str);

    private native com.tencent.maas.instamovie.MJSegment nativeGetStickerSegmentById(java.lang.String str);

    private native java.lang.Object[] nativeGetStorylineClipSegments();

    private native byte[] nativeGetTemplateAnalysisPbData();

    private native com.tencent.maas.instamovie.MJSegment nativeGetTextSegmentById(java.lang.String str);

    private native com.tencent.maas.model.MJLayerStyle nativeGetTextSegmentLayerStyle(java.lang.String str);

    private native java.lang.String nativeGetTextSegmentText(java.lang.String str);

    private native com.tencent.maas.model.MJTextStyle nativeGetTextSegmentTextStyle(java.lang.String str);

    private native double nativeGetVideoAspectRatio();

    private native com.tencent.maas.instamovie.base.MJError nativeLeaveFocusMode();

    private native void nativeOnTapRenderView(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native void nativeOnUpdateSegmentFlip();

    private native void nativeOnUpdateSegmentPosition(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native void nativeOnUpdateSegmentRotation(float f17);

    private native void nativeOnUpdateSegmentScale(float f17);

    private native void nativeOnUpdateSegmentScaleDidFinish();

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeRecreateUsingBlankTemplate(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeRecreateWithMusic(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeRecreateWithTemplate(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18);

    private native void nativeRemoveHandleBox();

    private native com.tencent.maas.instamovie.base.MJError nativeRemoveSegment(java.lang.String str, boolean z17);

    private native void nativeRemoveSegmentByHandleBox();

    private native int nativeRequestMusicRecommend(java.lang.String str, long j17, java.nio.ByteBuffer byteBuffer, int i17);

    private native int nativeRequestTemplateRecommend(java.lang.String str, boolean z17, java.util.List<java.lang.String> list, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeSetAssetsByAIModelType(java.lang.String str, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list);

    private native void nativeSetHandleBoxSettingsChangeCallback(int i17, com.tencent.maas.base.Vec2 vec2);

    private native void nativeSetOnDidRemoveHandleBoxCallback(int i17);

    private native void nativeSetOnDidRemoveSegmentCallback(int i17);

    private native void nativeSetOnDidTapSegmentCallback(int i17);

    private native void nativeSetOnPlaybackMediaTimeDidChangeFunc(int i17);

    private native void nativeSetOnWillShowHandleBoxCallback(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeSetSegmentNormalizedCropRect(java.lang.String str, com.tencent.maas.base.Rect2 rect2, boolean z17);

    private native com.tencent.maas.instamovie.base.MJError nativeSetSegmentRotationMode(java.lang.String str, int i17, boolean z17);

    private native com.tencent.maas.instamovie.base.MJError nativeSetSegmentTimeRangeInClip(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange);

    private native void nativeSetTextResolver(com.tencent.maas.instamovie.MJTextResolver mJTextResolver);

    private native void nativeShowHandleBox(java.lang.String str, com.tencent.maas.base.Rect2 rect2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list);

    private native com.tencent.maas.instamovie.base.MJError nativeSkimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18);

    private native com.tencent.maas.instamovie.base.MJError nativeSkimToSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartExporting(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationAutoRecommendTemplate(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationUsingBlankTemplate(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, int i17, int i18, int i19);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationUsingProject(java.lang.String str, boolean z17, int i17, int i18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationUsingTemplate(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18, int i19);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationUsingTemplate(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list2, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, int i17, int i18, int i19);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationWithComposingDesc(java.nio.ByteBuffer byteBuffer, java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, int i17, int i18, int i19);

    private native com.tencent.maas.instamovie.base.MJError nativeStartPlaying(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeStopPlaying(int i17);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeSwitchTemplateWithBuildResult(com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult, int i17);

    private native void nativeTakeSnapshotAndExportClipBundle(com.tencent.maas.instamovie.MJSnapshotCoverOptions mJSnapshotCoverOptions, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeTeardown(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeUpdateMovieOptions(com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeUpdateSegmentSpatialInfo(java.lang.String str, com.tencent.maas.model.MJSpatialInfo mJSpatialInfo, boolean z17);

    private native com.tencent.maas.instamovie.base.MJError nativeUpdateTextSegmentStyle(java.lang.String str, com.tencent.maas.model.MJTextStyle mJTextStyle, com.tencent.maas.model.MJLayerStyle mJLayerStyle, boolean z17);

    private native com.tencent.maas.instamovie.base.MJError nativeUpdateTextSegmentText(java.lang.String str, java.lang.String str2, boolean z17);

    public com.tencent.maas.model.time.MJTime GetCurrentPlaybackTime() {
        return nativeGetCurrentPlaybackTime();
    }

    public com.tencent.maas.instamovie.g addStickerSegment(java.lang.String str, boolean z17) {
        com.tencent.maas.instamovie.MJSegment nativeAddStickerSegment = nativeAddStickerSegment(str, z17);
        if (nativeAddStickerSegment == null) {
            return null;
        }
        return new com.tencent.maas.instamovie.g(nativeAddStickerSegment.f48165a, this);
    }

    public com.tencent.maas.instamovie.h addTextSegment(java.lang.String str, com.tencent.maas.model.MJSpatialInfo mJSpatialInfo, com.tencent.maas.model.MJTextStyle mJTextStyle, com.tencent.maas.model.MJLayerStyle mJLayerStyle, float f17, boolean z17) {
        com.tencent.maas.instamovie.MJSegment nativeAddTextSegment = nativeAddTextSegment(str, mJSpatialInfo, mJTextStyle, mJLayerStyle, f17, z17);
        if (nativeAddTextSegment == null) {
            return null;
        }
        return new com.tencent.maas.instamovie.h(nativeAddTextSegment.f48165a, this);
    }

    public void beginClipping(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        nativeBeginClipping(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo buildBlankTemplate(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onTemplateBuildComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.TemplateBuildCompleteCallback(this, onTemplateBuildComplete));
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeBuildBlankTemplate(str, mJMovieOptions, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo buildTemplateWithMusic(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onTemplateBuildComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.TemplateBuildCompleteCallback(this, onTemplateBuildComplete));
        return nativeBuildTemplateWithMusic(str, mJMovieOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo buildTemplateWithTemplate(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onTemplateBuildComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.TemplateBuildCompleteCallback(this, onTemplateBuildComplete));
        return nativeBuildTemplateWithTemplate(str, android.text.TextUtils.isEmpty(str2) ? null : str2, mJMovieOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.base.MJError cancelBuildTemplate(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeCancelBuildTemplate(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError cancelExporting(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        try {
            return nativeCancelExporting(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
        } catch (java.lang.Exception e17) {
            return new com.tencent.maas.instamovie.base.MJError(com.tencent.maas.instamovie.base.MJError.MaasEC.InvalidState.getErrorCode(), e17.getMessage());
        }
    }

    public com.tencent.maas.instamovie.base.MJError cancelMovieCreation(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeCancelMovieCreation(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void cancelMusicRecommend(int i17) {
        try {
            nativeCancelMusicRecommend(i17);
        } catch (java.lang.Exception unused) {
        }
    }

    public com.tencent.maas.instamovie.base.MJError cancelRecreation(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeCancelRecreation(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void cancelTemplateRecommend(int i17) {
        try {
            nativeCancelTemplateRecommend(i17);
        } catch (java.lang.Exception unused) {
        }
    }

    public com.tencent.maas.instamovie.base.MJError commitChangesAndNotifyRenderUpdate() {
        return nativeCommitChangesAndNotifyRenderUpdate(false);
    }

    public com.tencent.maas.base.Vec2 convertCanvasPointToViewPoint(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2) {
        return nativeConvertCanvasPointToViewPoint(vec2, rect2);
    }

    public com.tencent.maas.base.Vec2 convertViewPointToCanvasPoint(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2) {
        return nativeConvertViewPointToCanvasPoint(vec2, rect2);
    }

    public mg.a createMJHandleBoxTouchHelper(android.content.Context context, com.tencent.maas.base.Vec2 vec2, og.a aVar, mg.d dVar) {
        return new mg.a(this, context, vec2, aVar, dVar);
    }

    public void endClipping(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        nativeEndClipping(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError enterFocusMode(java.lang.String str) {
        return nativeEnterFocusMode(str);
    }

    public void exportClipBundle(com.tencent.maas.instamovie.MJMovieSession.OnExportClipBundle onExportClipBundle) {
        nativeExportClipBundle(onExportClipBundle != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.ExportClipBundleCallback(this, onExportClipBundle)) : -1);
    }

    public com.tencent.maas.instamovie.base.asset.MJAssetInfo getAssetInfo(java.lang.String str) {
        return nativeGetAssetInfo(str);
    }

    public java.util.List<com.tencent.maas.model.MJLyricInfo> getCurrentLyricInfos() {
        java.lang.Object[] nativeGetCurrentLyricInfos = nativeGetCurrentLyricInfos();
        if (nativeGetCurrentLyricInfos == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(nativeGetCurrentLyricInfos.length);
        for (java.lang.Object obj : nativeGetCurrentLyricInfos) {
            arrayList.add((com.tencent.maas.model.MJLyricInfo) obj);
        }
        return arrayList;
    }

    public com.tencent.maas.instamovie.MJMovieOptions getCurrentMovieOptions() {
        return nativeGetCurrentMovieOptions();
    }

    public com.tencent.maas.model.MJMusicInfo getCurrentMusicInfo() {
        return nativeGetCurrentMusicInfo();
    }

    public com.tencent.maas.model.MJMusicOptions getCurrentMusicOptions() {
        return nativeGetCurrentMusicOptions();
    }

    public com.tencent.maas.instamovie.MJMovieSessionState getCurrentState() {
        return com.tencent.maas.instamovie.MJMovieSessionState.fromInt(nativeGetCurrentState());
    }

    public java.util.List<com.tencent.maas.model.MJMusicInfo> getCurrentTemplateBuiltinMusicInfos() {
        java.lang.Object[] nativeGetCurrentTemplateMusicInfos = nativeGetCurrentTemplateMusicInfos();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (nativeGetCurrentTemplateMusicInfos != null) {
            for (java.lang.Object obj : nativeGetCurrentTemplateMusicInfos) {
                arrayList.add((com.tencent.maas.model.MJMusicInfo) obj);
            }
        }
        return arrayList;
    }

    public com.tencent.maas.model.MJTemplateInfo getCurrentTemplateInfo() {
        return nativeGetCurrentTemplateInfo();
    }

    public java.util.List<com.tencent.maas.model.MJMusicInfo> getCurrentTemplateMusicInfos() {
        java.util.ArrayList arrayList;
        com.tencent.maas.model.MJMusicOptions currentMusicOptions = getCurrentMusicOptions();
        if (currentMusicOptions == null) {
            return getCurrentTemplateBuiltinMusicInfos();
        }
        int i17 = com.tencent.maas.instamovie.MJMovieSession.AnonymousClass1.$SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType[currentMusicOptions.getSourceType().ordinal()];
        if (i17 == 1) {
            com.tencent.maas.instamovie.MJMovieOptions currentMovieOptions = getCurrentMovieOptions();
            if (currentMovieOptions != null) {
                arrayList = currentMovieOptions.shouldAutoRecommendBGM() ? new java.util.ArrayList(getRecommendedMusicInfos()) : new java.util.ArrayList(getCurrentTemplateBuiltinMusicInfos());
            }
            arrayList = null;
        } else if (i17 != 2) {
            if (i17 == 3) {
                arrayList = new java.util.ArrayList(getRecommendedMusicInfos());
            }
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(getCurrentTemplateBuiltinMusicInfos());
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        com.tencent.maas.model.MJMusicInfo musicInfo = currentMusicOptions.getMusicInfo();
        if (musicInfo != null && !arrayList.contains(musicInfo)) {
            arrayList.add(0, musicInfo);
        }
        return arrayList;
    }

    public com.tencent.maas.instamovie.MJTemplateSettings getCurrentTemplateSettings() {
        return nativeGetCurrentTemplateSettings();
    }

    public com.tencent.maas.model.time.MJTime getPlaybackDuration() {
        return nativeGetPlaybackDuration();
    }

    public java.util.List<com.tencent.maas.model.MJMusicInfo> getRecommendedMusicInfos() {
        java.lang.Object[] nativeGetRecommendedMusicInfos = nativeGetRecommendedMusicInfos();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (nativeGetRecommendedMusicInfos != null) {
            for (java.lang.Object obj : nativeGetRecommendedMusicInfos) {
                arrayList.add((com.tencent.maas.model.MJMusicInfo) obj);
            }
        }
        return arrayList;
    }

    public com.tencent.maas.model.time.MJTime getSegmentClipDuration(java.lang.String str) {
        return nativeGetSegmentClipDuration(str);
    }

    public com.tencent.maas.base.Rect2 getSegmentNormalizedCropRect(java.lang.String str) {
        return nativeGetSegmentNormalizedCropRect(str);
    }

    public int getSegmentRotationMode(java.lang.String str) {
        return nativeGetSegmentRotationMode(str);
    }

    public com.tencent.maas.model.MJSpatialInfo getSegmentSpatialInfo(java.lang.String str) {
        return nativeGetSegmentSpatialInfo(str);
    }

    public com.tencent.maas.model.time.MJTimeRange getSegmentTimeRangeInClip(java.lang.String str) {
        return nativeGetSegmentTimeRangeInClip(str);
    }

    public com.tencent.maas.model.time.MJTimeRange getSegmentTimeRangeInTimeline(java.lang.String str) {
        return nativeGetSegmentTimeRangeInTimeline(str);
    }

    public com.tencent.maas.instamovie.g getStickerSegmentById(java.lang.String str) {
        com.tencent.maas.instamovie.MJSegment nativeGetStickerSegmentById = nativeGetStickerSegmentById(str);
        if (nativeGetStickerSegmentById == null) {
            return null;
        }
        return new com.tencent.maas.instamovie.g(nativeGetStickerSegmentById.f48165a, this);
    }

    public java.util.List<com.tencent.maas.instamovie.a> getStorylineClipSegments() {
        java.lang.Object[] nativeGetStorylineClipSegments = nativeGetStorylineClipSegments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (nativeGetStorylineClipSegments != null) {
            for (java.lang.Object obj : nativeGetStorylineClipSegments) {
                arrayList.add(new com.tencent.maas.instamovie.a((com.tencent.maas.internal.MJClipSegmentInfo) obj, this));
            }
        }
        return arrayList;
    }

    public byte[] getTemplateAnalysisPbData() {
        return nativeGetTemplateAnalysisPbData();
    }

    public com.tencent.maas.instamovie.h getTextSegmentById(java.lang.String str) {
        com.tencent.maas.instamovie.MJSegment nativeGetTextSegmentById = nativeGetTextSegmentById(str);
        if (nativeGetTextSegmentById == null) {
            return null;
        }
        return new com.tencent.maas.instamovie.h(nativeGetTextSegmentById.f48165a, this);
    }

    public com.tencent.maas.model.MJLayerStyle getTextSegmentLayerStyle(java.lang.String str) {
        return nativeGetTextSegmentLayerStyle(str);
    }

    public java.lang.String getTextSegmentText(java.lang.String str) {
        return nativeGetTextSegmentText(str);
    }

    public com.tencent.maas.model.MJTextStyle getTextSegmentTextStyle(java.lang.String str) {
        return nativeGetTextSegmentTextStyle(str);
    }

    public java.lang.Double getVideoAspectRatio() {
        return java.lang.Double.valueOf(nativeGetVideoAspectRatio());
    }

    public com.tencent.maas.instamovie.base.MJError leaveFocusMode() {
        return nativeLeaveFocusMode();
    }

    public void notifySurfaceChanged(int i17, int i18, int i19) {
        io.clipworks.displaysys.DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy == null || !(dSViewProxy instanceof io.clipworks.displaysys.DSProxySurface)) {
            io.clipworks.corekit.NativeLogger.error(TAG, "current surface is not DSProxySurface");
            throw new java.lang.IllegalStateException("current surface is not DSProxySurface");
        }
        ((io.clipworks.displaysys.DSProxySurface) dSViewProxy).notifySurfaceChanged(i17, i18, i19);
    }

    public void onTapRenderView(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2) {
        nativeOnTapRenderView(vec2, rect2);
    }

    public void onUpdateSegmentFlip() {
        nativeOnUpdateSegmentFlip();
    }

    public void onUpdateSegmentPosition(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2) {
        nativeOnUpdateSegmentPosition(vec2, rect2);
    }

    public void onUpdateSegmentRotation(float f17) {
        nativeOnUpdateSegmentRotation(f17);
    }

    public void onUpdateSegmentScale(float f17) {
        nativeOnUpdateSegmentScale(f17);
    }

    public void onUpdateSegmentScaleDidFinish() {
        nativeOnUpdateSegmentScaleDidFinish();
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo recreateUsingBlankTemplate(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeRecreateUsingBlankTemplate(str, mJMovieOptions, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo recreateWithMusicID(java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeRecreateWithMusic(str, mJMovieOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo recreateWithTemplate(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeRecreateWithTemplate(str, android.text.TextUtils.isEmpty(str2) ? null : str2, mJMovieOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public void release() {
        this.mHybridData.resetNative();
    }

    public void removeHandleBox() {
        nativeRemoveHandleBox();
    }

    public com.tencent.maas.instamovie.base.MJError removeSegment(java.lang.String str, boolean z17) {
        return nativeRemoveSegment(str, z17);
    }

    public void removeSegmentByHandleBox() {
        nativeRemoveSegmentByHandleBox();
    }

    public int requestMusicRecommend(java.lang.String str, long j17, com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete onMusicRecommendComplete) {
        return nativeRequestMusicRecommend(str, j17, null, this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.RecommendMusicCompleteCallback(this, onMusicRecommendComplete)));
    }

    public int requestTemplateRecommend(java.lang.String str, boolean z17, java.util.List<java.lang.String> list, com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete) {
        return nativeRequestTemplateRecommend(str, z17, list, this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.RecommendCompleteCallback(this, onRecommendComplete)));
    }

    public com.tencent.maas.instamovie.base.MJError setAssetsByAIModelType(java.lang.String str, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list) {
        return nativeSetAssetsByAIModelType(str, list);
    }

    public void setOnDidRemoveHandleBoxCallback(com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete onHandleBoxComplete) {
        nativeSetOnDidRemoveHandleBoxCallback(onHandleBoxComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.OnHanldeBoxCompleteCallback(this, false, onHandleBoxComplete)) : -1);
    }

    public void setOnDidRemoveSegmentCallback(com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete onHandleBoxComplete) {
        nativeSetOnDidRemoveSegmentCallback(onHandleBoxComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.OnHanldeBoxCompleteCallback(this, false, onHandleBoxComplete)) : -1);
    }

    public void setOnDidTapSegmentCallback(com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment onDidTapSegment) {
        nativeSetOnDidTapSegmentCallback(onDidTapSegment != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.OnDidTapSegmentCallback(this, false, onDidTapSegment)) : -1);
    }

    public void setOnHandleBoxSettingsChangeCallback(com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged, com.tencent.maas.base.Vec2 vec2) {
        nativeSetHandleBoxSettingsChangeCallback(onHandleBoxSettingsChanged != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.OnHandleBoxSettingsChangeCallback(this, false, onHandleBoxSettingsChanged)) : -1, vec2);
    }

    public void setOnPlaybackMediaTimeDidChange(com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange onMediaTimeChange) {
        nativeSetOnPlaybackMediaTimeDidChangeFunc(onMediaTimeChange != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.MediaTimeChangeCallback(this, onMediaTimeChange, false)) : -1);
    }

    public void setOnWillShowHandleBoxCallback(com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox onWillShowHandleBox) {
        nativeSetOnWillShowHandleBoxCallback(onWillShowHandleBox != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.OnWillShowHandleBoxCallback(this, false, onWillShowHandleBox)) : -1);
    }

    public void setRenderView(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.clipworks.displaysys.DSRenderView)) {
            io.clipworks.corekit.NativeLogger.error(TAG, "renderView must be SDK DSRenderView");
            throw new java.security.InvalidParameterException("renderView must be SDK DSRenderView");
        }
        if (this.dsViewProxy != null) {
            io.clipworks.corekit.NativeLogger.error(TAG, "Already a view connected!");
            throw new java.lang.IllegalStateException("Already a view connected!");
        }
        io.clipworks.displaysys.DSViewProxy dSViewProxy = ((io.clipworks.displaysys.DSRenderView) surfaceView).getDSViewProxy();
        com.tencent.maas.instamovie.base.MJError nativeConnectToView = nativeConnectToView(dSViewProxy);
        if (nativeConnectToView == null) {
            this.dsViewProxy = dSViewProxy;
            return;
        }
        io.clipworks.corekit.NativeLogger.error(TAG, "Fail to connect to RenderView, " + nativeConnectToView.message);
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + nativeConnectToView.message);
    }

    public com.tencent.maas.instamovie.base.MJError setSegmentNormalizedCropRect(java.lang.String str, com.tencent.maas.base.Rect2 rect2, boolean z17) {
        return nativeSetSegmentNormalizedCropRect(str, rect2, z17);
    }

    public com.tencent.maas.instamovie.base.MJError setSegmentRotationMode(java.lang.String str, int i17, boolean z17) {
        return nativeSetSegmentRotationMode(str, i17, z17);
    }

    public com.tencent.maas.instamovie.base.MJError setSegmentTimeRangeInClip(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        return nativeSetSegmentTimeRangeInClip(str, mJTimeRange);
    }

    public void setSurface(android.view.Surface surface) {
        io.clipworks.displaysys.DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy != null && !(dSViewProxy instanceof io.clipworks.displaysys.DSProxySurface)) {
            io.clipworks.corekit.NativeLogger.error(TAG, "Already a non surface output connected");
            throw new java.lang.IllegalArgumentException("Already a non surface output connected");
        }
        if (surface == null && dSViewProxy == null) {
            return;
        }
        if (dSViewProxy != null) {
            io.clipworks.displaysys.DSProxySurface dSProxySurface = (io.clipworks.displaysys.DSProxySurface) dSViewProxy;
            if (surface == null) {
                dSProxySurface.updateSurface(null);
                dSProxySurface.notifySurfaceDidDestroy();
                io.clipworks.corekit.NativeLogger.info(TAG, "setSurface, surface destroyed");
                return;
            } else {
                if (dSProxySurface.getSurface() != null) {
                    io.clipworks.corekit.NativeLogger.error(TAG, "Already a surface connect, please setSurface(null) firstly");
                    throw new java.lang.IllegalStateException("Already a surface connect, please setSurface(null) firstly");
                }
                dSProxySurface.updateSurface(surface);
                dSProxySurface.notifySurfaceCreated(surface);
                io.clipworks.corekit.NativeLogger.info(TAG, "setSurface, surface changed: " + surface);
                return;
            }
        }
        io.clipworks.displaysys.DSProxySurface dSProxySurface2 = new io.clipworks.displaysys.DSProxySurface(surface);
        com.tencent.maas.instamovie.base.MJError nativeConnectToView = nativeConnectToView(dSProxySurface2);
        if (nativeConnectToView == null) {
            this.dsViewProxy = dSProxySurface2;
            dSProxySurface2.notifySurfaceCreated(surface);
            io.clipworks.corekit.NativeLogger.info(TAG, "nativeConnectToView, new surface created: " + surface);
            return;
        }
        io.clipworks.corekit.NativeLogger.error(TAG, "Fail to connect to surface, " + nativeConnectToView.message);
        throw new java.lang.IllegalStateException("Fail to connect to surface, " + nativeConnectToView.message);
    }

    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        io.clipworks.displaysys.DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy != null) {
            if (dSViewProxy instanceof io.clipworks.displaysys.DSProxySurfaceHolder) {
                return;
            }
            io.clipworks.corekit.NativeLogger.error(TAG, "Already a non SurfaceHolder connected");
            throw new java.lang.IllegalArgumentException("Already a non SurfaceHolder connected");
        }
        if (surfaceHolder == null) {
            return;
        }
        io.clipworks.displaysys.DSProxySurfaceHolder dSProxySurfaceHolder = new io.clipworks.displaysys.DSProxySurfaceHolder(surfaceHolder);
        com.tencent.maas.instamovie.base.MJError nativeConnectToView = nativeConnectToView(dSProxySurfaceHolder);
        if (nativeConnectToView == null) {
            this.dsViewProxy = dSProxySurfaceHolder;
            if (surfaceHolder.getSurface() != null) {
                this.dsViewProxy.notifySurfaceCreated(surfaceHolder.getSurface());
                return;
            }
            return;
        }
        io.clipworks.corekit.NativeLogger.error(TAG, "Fail to connect to surface, " + nativeConnectToView.message);
        throw new java.lang.IllegalStateException("Fail to connect to surface, " + nativeConnectToView.message);
    }

    public void setTextResolver(com.tencent.maas.instamovie.MJTextResolver mJTextResolver) {
        nativeSetTextResolver(mJTextResolver);
    }

    public void showHandleBox(java.lang.String str, com.tencent.maas.base.Rect2 rect2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list) {
        nativeShowHandleBox(str, rect2, mJEdgeInsets, mJHandleBoxBorderStyle, list);
    }

    public com.tencent.maas.instamovie.base.MJError skimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18) {
        return nativeSkimTo(mJTime, j17, z17, z18);
    }

    public com.tencent.maas.instamovie.base.MJError skimToSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime) {
        return nativeSkimToSegment(str, mJTime, 0L, false, false);
    }

    public void snapshotAndExportClipbundle(com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
        snapshotAndExportClipbundle(new com.tencent.maas.instamovie.MJSnapshotCoverOptions(new com.tencent.maas.instamovie.f()), snapshotAndExportClipBundleCallback);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startExporting(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnExportComplete onExportComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.ExportCompleteCallback(this, onExportComplete));
        return nativeStartExporting(str, mJTimeRange, mJExportSettings, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationAutoRecommendTemplate(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.RecommendCompleteCallback(this, onRecommendComplete));
        return nativeStartMovieCreationAutoRecommendTemplate(list, mJMovieOptions, mJRecommendOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationUsingBlankTemplate(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete2) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingBlankTemplate(list, android.text.TextUtils.isEmpty(str) ? null : str, mJMovieOptions, mJRecommendOptions, registerProgressWithComplete[0], registerProgressWithComplete[1], onComplete2 != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete2)) : -1);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationUsingProject(java.lang.String str, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return startMovieCreationUsingProject(str, false, onTaskProgress, onComplete);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationUsingTemplate(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete2) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingTemplate(str, str2, list, mJMovieOptions, mJRecommendOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1], onComplete2 != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete2)) : -1);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationWithComposingDesc(kg.a aVar, java.lang.String str, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete2) {
        this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        if (onComplete2 != null) {
            this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete2));
        }
        try {
            kg.x.newBuilder();
            throw null;
        } catch (java.lang.IllegalArgumentException e17) {
            return new com.tencent.maas.instamovie.MJAsyncTaskInfo(new com.tencent.maas.instamovie.base.MJError(com.tencent.maas.instamovie.base.MJError.MaasEC.InvalidArgument.getErrorCode(), e17.getMessage()), -1L, "");
        } catch (java.lang.Exception e18) {
            return new com.tencent.maas.instamovie.MJAsyncTaskInfo(new com.tencent.maas.instamovie.base.MJError(com.tencent.maas.instamovie.base.MJError.MaasEC.GeneralError.getErrorCode(), e18.getMessage()), -1L, "");
        }
    }

    public com.tencent.maas.instamovie.base.MJError startPlaying(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeStartPlaying(mJTimeRange, mJTime, i17, z17, onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError stopPlaying(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeStopPlaying(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo switchTemplateWithBuildResult(com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeSwitchTemplateWithBuildResult(mJTemplateBuildResult, onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError tearDown(com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        if (this.dsViewProxy != null) {
            io.clipworks.corekit.NativeLogger.info(TAG, "nativeDisconnectFromView");
            nativeDisconnectFromView();
            this.dsViewProxy = null;
        }
        return nativeTeardown(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError updateMovieOptions(com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        return nativeUpdateMovieOptions(mJMovieOptions, onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError updateSegmentSpatialInfo(java.lang.String str, com.tencent.maas.model.MJSpatialInfo mJSpatialInfo, boolean z17) {
        return nativeUpdateSegmentSpatialInfo(str, mJSpatialInfo, z17);
    }

    public com.tencent.maas.instamovie.base.MJError updateTextSegmentStyle(java.lang.String str, com.tencent.maas.model.MJTextStyle mJTextStyle, com.tencent.maas.model.MJLayerStyle mJLayerStyle, boolean z17) {
        return nativeUpdateTextSegmentStyle(str, mJTextStyle, mJLayerStyle, z17);
    }

    public com.tencent.maas.instamovie.base.MJError updateTextSegmentText(java.lang.String str, java.lang.String str2, boolean z17) {
        return nativeUpdateTextSegmentText(str, str2, z17);
    }

    public com.tencent.maas.instamovie.base.MJError commitChangesAndNotifyRenderUpdate(boolean z17) {
        return nativeCommitChangesAndNotifyRenderUpdate(z17);
    }

    public mg.a createMJHandleBoxTouchHelper(android.content.Context context, com.tencent.maas.base.Vec2 vec2, og.a aVar) {
        return new mg.a(this, context, vec2, aVar, null);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationUsingProject(java.lang.String str, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingProject(str, z17, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public com.tencent.maas.instamovie.base.MJError commitChangesAndNotifyRenderUpdate(com.tencent.maas.model.time.MJTime mJTime) {
        return nativeCommitChangesAndNotifyRenderUpdateByPreviewTime(mJTime, false);
    }

    public int requestMusicRecommend(java.lang.String str, long j17, java.nio.ByteBuffer byteBuffer, com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete onMusicRecommendComplete) {
        return nativeRequestMusicRecommend(str, j17, byteBuffer, this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.RecommendMusicCompleteCallback(this, onMusicRecommendComplete)));
    }

    public com.tencent.maas.instamovie.base.MJError commitChangesAndNotifyRenderUpdate(com.tencent.maas.model.time.MJTime mJTime, boolean z17) {
        return nativeCommitChangesAndNotifyRenderUpdateByPreviewTime(mJTime, z17);
    }

    public void snapshotAndExportClipbundle(com.tencent.maas.instamovie.MJSnapshotCoverOptions mJSnapshotCoverOptions, com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
        nativeTakeSnapshotAndExportClipBundle(mJSnapshotCoverOptions, snapshotAndExportClipBundleCallback != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.ExportClipBundleCallbackExt(this, snapshotAndExportClipBundleCallback)) : -1);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationUsingTemplate(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list2, com.tencent.maas.instamovie.MJMovieOptions mJMovieOptions, com.tencent.maas.instamovie.MJRecommendOptions mJRecommendOptions, com.tencent.maas.instamovie.MJMovieOutroInfo mJMovieOutroInfo, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete2) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingTemplate(str, list, list2, mJMovieOptions, mJRecommendOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1], onComplete2 != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMovieSessionCallback.CompleteCallback(this, onComplete2)) : -1);
    }
}
