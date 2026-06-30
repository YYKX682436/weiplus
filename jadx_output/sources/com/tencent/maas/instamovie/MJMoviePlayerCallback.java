package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMoviePlayerCallback {

    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback<com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.CompleteArg> {
        private final com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete;

        public CompleteCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
            super(mJMoviePlayer);
            this.onComplete = onComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.CompleteArg completeArg) {
            com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = this.onComplete;
            if (onComplete == null || completeArg == null) {
                return;
            }
            onComplete.onComplete(completeArg.error);
        }

        public CompleteCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete, boolean z17) {
            super(mJMoviePlayer, z17);
            this.onComplete = onComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class MJMoviePlayerCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

        /* loaded from: classes5.dex */
        public static class CompleteArg extends com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;

            public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
            }
        }

        /* loaded from: classes5.dex */
        public static class MediaTimeChangeArg extends com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg {
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
        public static class OnPlaybackDidFinishArgs extends com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg {
        }

        /* loaded from: classes5.dex */
        public static class ProgressArg extends com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg {
            public final float progress;

            public ProgressArg(float f17) {
                this.progress = f17;
            }
        }

        /* loaded from: classes5.dex */
        public static class TaskProgressArg extends com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg {
            public final float progress;
            public final java.nio.ByteBuffer taskTracePBData;
            public final double timestamp;

            public TaskProgressArg(float f17, double d17, java.nio.ByteBuffer byteBuffer) {
                this.progress = f17;
                this.timestamp = d17;
                this.taskTracePBData = byteBuffer;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class MediaTimeChangeCallback extends com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback<com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.MediaTimeChangeArg> {
        private final com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange onMediaTimeChange;

        public MediaTimeChangeCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange onMediaTimeChange) {
            super(mJMoviePlayer);
            this.onMediaTimeChange = onMediaTimeChange;
        }

        @Override // com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.MediaTimeChangeArg mediaTimeChangeArg) {
            com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange onMediaTimeChange = this.onMediaTimeChange;
            if (onMediaTimeChange == null || mediaTimeChangeArg == null) {
                return;
            }
            onMediaTimeChange.onMediaTimeChange(mediaTimeChangeArg.lastFrameTime, mediaTimeChangeArg.mediaTimeRange, mediaTimeChangeArg.tag);
        }

        public MediaTimeChangeCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange onMediaTimeChange, boolean z17) {
            super(mJMoviePlayer, z17);
            this.onMediaTimeChange = onMediaTimeChange;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnPlaybackDidFinishCallback extends com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback<com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.OnPlaybackDidFinishArgs> {
        private final com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish onPlaybackDidFinish;

        public OnPlaybackDidFinishCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish onPlaybackDidFinish) {
            super(mJMoviePlayer);
            this.onPlaybackDidFinish = onPlaybackDidFinish;
        }

        @Override // com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.OnPlaybackDidFinishArgs onPlaybackDidFinishArgs) {
            com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish onPlaybackDidFinish = this.onPlaybackDidFinish;
            if (onPlaybackDidFinish != null) {
                onPlaybackDidFinish.onFinished();
            }
        }

        public OnPlaybackDidFinishCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish onPlaybackDidFinish, boolean z17) {
            super(mJMoviePlayer, z17);
            this.onPlaybackDidFinish = onPlaybackDidFinish;
        }
    }

    /* loaded from: classes5.dex */
    public static class TaskProgressCallback extends com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback<com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.TaskProgressArg> {
        private final com.tencent.maas.instamovie.MJMoviePlayer.OnTaskProgress onTaskProgress;

        public TaskProgressCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnTaskProgress onTaskProgress) {
            super(mJMoviePlayer);
            this.onTaskProgress = onTaskProgress;
        }

        @Override // com.tencent.maas.instamovie.MJMoviePlayerCallback.BaseCallback
        public void onInvoke(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayerCallback.MJMoviePlayerCallbackArg.TaskProgressArg taskProgressArg) {
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

        public TaskProgressCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, com.tencent.maas.instamovie.MJMoviePlayer.OnTaskProgress onTaskProgress, boolean z17) {
            super(mJMoviePlayer, z17);
            this.onTaskProgress = onTaskProgress;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.tencent.maas.internal.a {
        private final java.lang.ref.WeakReference<com.tencent.maas.instamovie.MJMoviePlayer> mjMoviePlayerRef;

        public BaseCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer) {
            this.mjMoviePlayerRef = new java.lang.ref.WeakReference<>(mJMoviePlayer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.maas.internal.a
        public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjMoviePlayerRef.get(), callbackArgs);
        }

        public abstract void onInvoke(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, T t17);

        public BaseCallback(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, boolean z17) {
            super(z17);
            this.mjMoviePlayerRef = new java.lang.ref.WeakReference<>(mJMoviePlayer);
        }
    }
}
