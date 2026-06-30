package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMovieSessionCallback {

    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.CompleteArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete;

        public CompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
            super(mJMovieSession);
            this.onComplete = onComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.CompleteArg completeArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete = this.onComplete;
            if (onComplete == null || completeArg == null) {
                return;
            }
            onComplete.onComplete(completeArg.error);
        }

        public CompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete, boolean z17) {
            super(mJMovieSession, z17);
            this.onComplete = onComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class ExportClipBundleCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ExportClipBundleArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnExportClipBundle onExportClipBundle;

        public ExportClipBundleCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnExportClipBundle onExportClipBundle) {
            super(mJMovieSession);
            this.onExportClipBundle = onExportClipBundle;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ExportClipBundleArg exportClipBundleArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnExportClipBundle onExportClipBundle = this.onExportClipBundle;
            if (onExportClipBundle == null || exportClipBundleArg == null) {
                return;
            }
            onExportClipBundle.onExportClipBundle(exportClipBundleArg.path, exportClipBundleArg.error);
        }

        public ExportClipBundleCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnExportClipBundle onExportClipBundle) {
            super(mJMovieSession, z17);
            this.onExportClipBundle = onExportClipBundle;
        }
    }

    /* loaded from: classes5.dex */
    public static class ExportClipBundleCallbackExt extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ExportClipBundleArgV2> {
        private final com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback onExportClipBundle;

        public ExportClipBundleCallbackExt(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
            super(mJMovieSession);
            this.onExportClipBundle = snapshotAndExportClipBundleCallback;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ExportClipBundleArgV2 exportClipBundleArgV2) {
            com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback = this.onExportClipBundle;
            if (snapshotAndExportClipBundleCallback == null || exportClipBundleArgV2 == null) {
                return;
            }
            com.tencent.maas.instamovie.base.MJError mJError = exportClipBundleArgV2.error;
            if (mJError != null) {
                snapshotAndExportClipBundleCallback.onError(mJError);
            } else {
                snapshotAndExportClipBundleCallback.onSuccess(exportClipBundleArgV2.info);
            }
        }

        public ExportClipBundleCallbackExt(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17, com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
            super(mJMovieSession, z17);
            this.onExportClipBundle = snapshotAndExportClipBundleCallback;
        }
    }

    /* loaded from: classes5.dex */
    public static class ExportCompleteCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ExportCompleteArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnExportComplete onExportComplete;

        public ExportCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnExportComplete onExportComplete) {
            super(mJMovieSession);
            this.onExportComplete = onExportComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ExportCompleteArg exportCompleteArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnExportComplete onExportComplete = this.onExportComplete;
            if (onExportComplete == null || exportCompleteArg == null) {
                return;
            }
            onExportComplete.onExportComplete(exportCompleteArg.coverImageFilePath, exportCompleteArg.error);
        }

        public ExportCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnExportComplete onExportComplete, boolean z17) {
            super(mJMovieSession, z17);
            this.onExportComplete = onExportComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class MediaTimeChangeCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.MediaTimeChangeArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange onMediaTimeChange;

        public MediaTimeChangeCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange onMediaTimeChange) {
            super(mJMovieSession);
            this.onMediaTimeChange = onMediaTimeChange;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.MediaTimeChangeArg mediaTimeChangeArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange onMediaTimeChange = this.onMediaTimeChange;
            if (onMediaTimeChange == null || mediaTimeChangeArg == null) {
                return;
            }
            onMediaTimeChange.onMediaTimeChange(mediaTimeChangeArg.lastFrameTime, mediaTimeChangeArg.mediaTimeRange, mediaTimeChangeArg.tag);
        }

        public MediaTimeChangeCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange onMediaTimeChange, boolean z17) {
            super(mJMovieSession, z17);
            this.onMediaTimeChange = onMediaTimeChange;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnDidTapSegmentCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnDidTapSegmentArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment onDidTapSegment;

        public OnDidTapSegmentCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment onDidTapSegment) {
            super(mJMovieSession);
            this.onDidTapSegment = onDidTapSegment;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnDidTapSegmentArg onDidTapSegmentArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment onDidTapSegment = this.onDidTapSegment;
            if (onDidTapSegment == null || onDidTapSegmentArg == null) {
                return;
            }
            onDidTapSegment.onDidTapSegment(onDidTapSegmentArg.ID, onDidTapSegmentArg.hints);
        }

        public OnDidTapSegmentCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment onDidTapSegment) {
            super(mJMovieSession, z17);
            this.onDidTapSegment = onDidTapSegment;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnHandleBoxSettingsChangeCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnHandleBoxSettingsDidChangeArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged;

        public OnHandleBoxSettingsChangeCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged) {
            super(mJMovieSession);
            this.onHandleBoxSettingsChanged = onHandleBoxSettingsChanged;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnHandleBoxSettingsDidChangeArg onHandleBoxSettingsDidChangeArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged = this.onHandleBoxSettingsChanged;
            if (onHandleBoxSettingsChanged == null || onHandleBoxSettingsDidChangeArg == null) {
                return;
            }
            onHandleBoxSettingsChanged.handleBoxSettingsChanged(onHandleBoxSettingsDidChangeArg.handleBoxSettings);
        }

        public OnHandleBoxSettingsChangeCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged) {
            super(mJMovieSession, z17);
            this.onHandleBoxSettingsChanged = onHandleBoxSettingsChanged;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnHanldeBoxCompleteCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnHandleBoxCompleteArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete onHandleBoxComplete;

        public OnHanldeBoxCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete onHandleBoxComplete) {
            super(mJMovieSession);
            this.onHandleBoxComplete = onHandleBoxComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnHandleBoxCompleteArg onHandleBoxCompleteArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete onHandleBoxComplete = this.onHandleBoxComplete;
            if (onHandleBoxComplete == null || onHandleBoxCompleteArg == null) {
                return;
            }
            onHandleBoxComplete.onHandleBoxComplete(onHandleBoxCompleteArg.segmentID);
        }

        public OnHanldeBoxCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete onHandleBoxComplete) {
            super(mJMovieSession, z17);
            this.onHandleBoxComplete = onHandleBoxComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnWillShowHandleBoxCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnWillShowHandleBoxArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox onWillShowHandleBox;

        public OnWillShowHandleBoxCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox onWillShowHandleBox) {
            super(mJMovieSession);
            this.onWillShowHandleBox = onWillShowHandleBox;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.OnWillShowHandleBoxArg onWillShowHandleBoxArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox onWillShowHandleBox = this.onWillShowHandleBox;
            if (onWillShowHandleBox == null || onWillShowHandleBoxArg == null) {
                return;
            }
            onWillShowHandleBox.onWillShowHandleBox(onWillShowHandleBoxArg.ID, onWillShowHandleBoxArg.position, onWillShowHandleBoxArg.scale, onWillShowHandleBoxArg.rotation);
        }

        public OnWillShowHandleBoxCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox onWillShowHandleBox) {
            super(mJMovieSession, z17);
            this.onWillShowHandleBox = onWillShowHandleBox;
        }
    }

    /* loaded from: classes5.dex */
    public static class ProgressCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ProgressArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnProgress onProgress;

        public ProgressCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnProgress onProgress) {
            super(mJMovieSession);
            this.onProgress = onProgress;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.ProgressArg progressArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnProgress onProgress = this.onProgress;
            if (onProgress == null || progressArg == null) {
                return;
            }
            onProgress.onProgress(progressArg.progress);
        }

        public ProgressCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnProgress onProgress, boolean z17) {
            super(mJMovieSession, z17);
            this.onProgress = onProgress;
        }
    }

    /* loaded from: classes5.dex */
    public static class RecommendCompleteCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.RecommendCompleteArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete;

        public RecommendCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete) {
            super(mJMovieSession);
            this.onRecommendComplete = onRecommendComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.RecommendCompleteArg recommendCompleteArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete = this.onRecommendComplete;
            if (onRecommendComplete == null || recommendCompleteArg == null) {
                return;
            }
            onRecommendComplete.onRecommendComplete(recommendCompleteArg.result, recommendCompleteArg.error);
        }

        public RecommendCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete, boolean z17) {
            super(mJMovieSession, z17);
            this.onRecommendComplete = onRecommendComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class RecommendMusicCompleteCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.RecommendMusicCompleteArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete onRecommendComplete;

        public RecommendMusicCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete onMusicRecommendComplete) {
            super(mJMovieSession);
            this.onRecommendComplete = onMusicRecommendComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.RecommendMusicCompleteArg recommendMusicCompleteArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete onMusicRecommendComplete = this.onRecommendComplete;
            if (onMusicRecommendComplete == null || recommendMusicCompleteArg == null) {
                return;
            }
            onMusicRecommendComplete.onRecommendComplete(recommendMusicCompleteArg.result, recommendMusicCompleteArg.error);
        }

        public RecommendMusicCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete onMusicRecommendComplete, boolean z17) {
            super(mJMovieSession, z17);
            this.onRecommendComplete = onMusicRecommendComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class TaskProgressCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.TaskProgressArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress;

        public TaskProgressCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress) {
            super(mJMovieSession);
            this.onTaskProgress = onTaskProgress;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.TaskProgressArg taskProgressArg) {
            com.tencent.maas.instamovie.MJTaskTrace mJTaskTrace;
            if (this.onTaskProgress == null || taskProgressArg == null) {
                return;
            }
            java.nio.ByteBuffer byteBuffer = taskProgressArg.taskTracePBData;
            if (byteBuffer != null) {
                try {
                    mJTaskTrace = new com.tencent.maas.instamovie.MJTaskTrace(taskProgressArg.timestamp, byteBuffer);
                } catch (java.lang.Exception e17) {
                    io.clipworks.corekit.NativeLogger.error("MJMovieSessionCallback", e17.getMessage());
                }
                this.onTaskProgress.onTaskProgress(taskProgressArg.progress, mJTaskTrace);
            }
            mJTaskTrace = null;
            this.onTaskProgress.onTaskProgress(taskProgressArg.progress, mJTaskTrace);
        }

        public TaskProgressCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onTaskProgress, boolean z17) {
            super(mJMovieSession, z17);
            this.onTaskProgress = onTaskProgress;
        }
    }

    /* loaded from: classes5.dex */
    public static class TemplateBuildCompleteCallback extends com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback<com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.TemplateBuildCompleteArg> {
        private final com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onComplete;

        public TemplateBuildCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onTemplateBuildComplete) {
            super(mJMovieSession);
            this.onComplete = onTemplateBuildComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMovieSessionCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg.TemplateBuildCompleteArg templateBuildCompleteArg) {
            com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onTemplateBuildComplete = this.onComplete;
            if (onTemplateBuildComplete == null || templateBuildCompleteArg == null) {
                return;
            }
            onTemplateBuildComplete.onTemplateBuildComplete(templateBuildCompleteArg.result, templateBuildCompleteArg.error);
        }

        public TemplateBuildCompleteCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, com.tencent.maas.instamovie.MJMovieSession.OnTemplateBuildComplete onTemplateBuildComplete, boolean z17) {
            super(mJMovieSession, z17);
            this.onComplete = onTemplateBuildComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.tencent.maas.internal.a {
        private final java.lang.ref.WeakReference<com.tencent.maas.instamovie.MJMovieSession> mjMovieSessionRef;

        public BaseCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession) {
            this.mjMovieSessionRef = new java.lang.ref.WeakReference<>(mJMovieSession);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.maas.internal.a
        public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjMovieSessionRef.get(), callbackArgs);
        }

        public abstract void onInvoke(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, T t17);

        public BaseCallback(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, boolean z17) {
            super(z17);
            this.mjMovieSessionRef = new java.lang.ref.WeakReference<>(mJMovieSession);
        }
    }

    /* loaded from: classes5.dex */
    public static class MJMoveSessionCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

        /* loaded from: classes5.dex */
        public static class CompleteArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;

            public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
            }
        }

        /* loaded from: classes5.dex */
        public static class ExportClipBundleArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;
            public final java.lang.String path;

            public ExportClipBundleArg(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
                this.path = str;
                this.error = mJError;
            }
        }

        /* loaded from: classes5.dex */
        public static class ExportClipBundleArgV2 extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;
            public final com.tencent.maas.instamovie.MJMovieSession.ClipBundleInfo info;

            public ExportClipBundleArgV2(com.tencent.maas.instamovie.MJMovieSession.ClipBundleInfo clipBundleInfo, com.tencent.maas.instamovie.base.MJError mJError) {
                this.info = clipBundleInfo;
                this.error = mJError;
            }
        }

        /* loaded from: classes5.dex */
        public static class ExportCompleteArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final java.lang.String coverImageFilePath;
            public final com.tencent.maas.instamovie.base.MJError error;

            public ExportCompleteArg(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
                this.coverImageFilePath = str;
            }
        }

        /* loaded from: classes5.dex */
        public static class MediaTimeChangeArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public com.tencent.maas.model.time.MJTime lastFrameTime;
            public com.tencent.maas.model.time.MJTimeRange mediaTimeRange;
            public long tag;

            public MediaTimeChangeArg(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17) {
                this.lastFrameTime = mJTime;
                this.mediaTimeRange = mJTimeRange;
                this.tag = j17;
            }
        }

        /* loaded from: classes5.dex */
        public static class OnHandleBoxCompleteArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final java.lang.String segmentID;

            public OnHandleBoxCompleteArg(java.lang.String str) {
                this.segmentID = str;
            }
        }

        /* loaded from: classes5.dex */
        public static class OnHandleBoxSettingsDidChangeArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.handlebox.model.MJHandleBoxSettings handleBoxSettings;

            public OnHandleBoxSettingsDidChangeArg(com.tencent.maas.handlebox.model.MJHandleBoxSettings mJHandleBoxSettings) {
                this.handleBoxSettings = mJHandleBoxSettings;
            }
        }

        /* loaded from: classes5.dex */
        public static class OnWillShowHandleBoxArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final java.lang.String ID;
            public final com.tencent.maas.base.Vec2 position;
            public float rotation;
            public final com.tencent.maas.base.Vec2 scale;

            public OnWillShowHandleBoxArg(java.lang.String str, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22, float f17) {
                this.ID = str;
                this.position = vec2;
                this.scale = vec22;
                this.rotation = f17;
            }
        }

        /* loaded from: classes5.dex */
        public static class ProgressArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final float progress;

            public ProgressArg(float f17) {
                this.progress = f17;
            }
        }

        /* loaded from: classes5.dex */
        public static class RecommendCompleteArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;
            public final com.tencent.maas.model.MJTemplateRecommendResult result;

            public RecommendCompleteArg(com.tencent.maas.model.MJTemplateRecommendResult mJTemplateRecommendResult, com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
                this.result = mJTemplateRecommendResult;
            }
        }

        /* loaded from: classes5.dex */
        public static class RecommendMusicCompleteArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;
            public final com.tencent.maas.model.MJMusicInfo[] result;

            public RecommendMusicCompleteArg(java.lang.Object[] objArr, com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
                this.result = objArr != null ? (com.tencent.maas.model.MJMusicInfo[]) java.util.Arrays.copyOf(objArr, objArr.length, com.tencent.maas.model.MJMusicInfo[].class) : null;
            }
        }

        /* loaded from: classes5.dex */
        public static class TaskProgressArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final float progress;
            public final java.nio.ByteBuffer taskTracePBData;
            public final double timestamp;

            public TaskProgressArg(float f17, double d17, java.nio.ByteBuffer byteBuffer) {
                this.progress = f17;
                this.timestamp = d17;
                this.taskTracePBData = byteBuffer;
            }
        }

        /* loaded from: classes5.dex */
        public static class TemplateBuildCompleteArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;
            public final com.tencent.maas.model.MJTemplateBuildResult result;

            public TemplateBuildCompleteArg(com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult, com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
                this.result = mJTemplateBuildResult;
            }
        }

        /* loaded from: classes5.dex */
        public static class OnDidTapSegmentArg extends com.tencent.maas.instamovie.MJMovieSessionCallback.MJMoveSessionCallbackArg {
            public java.lang.String ID;
            public long hints;

            public OnDidTapSegmentArg() {
                this.ID = null;
                this.hints = 0L;
            }

            public OnDidTapSegmentArg(java.lang.String str, long j17) {
                this.ID = str;
                this.hints = j17;
            }
        }
    }
}
