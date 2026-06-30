package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMoviePlayer {
    public static final int PLAYER_STATE_ERROR = -1;
    public static final int PLAYER_STATE_INITIAL = 0;
    public static final int PLAYER_STATE_PLAYING = 5;
    public static final int PLAYER_STATE_PREPARED = 2;
    public static final int PLAYER_STATE_PREPAREING = 1;
    public static final int PLAYER_STATE_STARTED = 4;
    public static final int PLAYER_STATE_STARTING = 3;
    public static final int PLAYER_STATE_STOPPING = 6;
    public static final int PLAYER_STATE_TEARDOWNING = 7;
    private static final java.lang.String TAG = "MJMoviePlayer";
    private io.clipworks.displaysys.DSViewProxy dsViewProxy;
    private final com.tencent.maas.internal.NativeCallbackManager mCallbackManager;
    private final com.facebook.jni.HybridData mHybridData;

    /* loaded from: classes5.dex */
    public interface OnComplete {
        void onComplete(com.tencent.maas.instamovie.base.MJError mJError);
    }

    /* loaded from: classes5.dex */
    public interface OnMediaTimeChange {
        void onMediaTimeChange(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17);
    }

    /* loaded from: classes5.dex */
    public interface OnPlaybackDidFinish {
        void onFinished();
    }

    /* loaded from: classes5.dex */
    public interface OnTaskProgress {
        void onTaskProgress(float f17, com.tencent.maas.instamovie.MJTaskTrace mJTaskTrace);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PlayerState {
    }

    public MJMoviePlayer(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native com.tencent.maas.instamovie.base.MJError nativeConnectToView(java.lang.Object obj);

    private native com.tencent.maas.instamovie.base.MJError nativeDisconnectFromView();

    private native com.tencent.maas.model.time.MJTime nativeGetCurrentPlaybackTime();

    private native int nativeGetCurrentState();

    private native com.tencent.maas.model.time.MJTime nativeGetPlaybackDuration();

    private native void nativeSetIsAudioMuted(boolean z17);

    private native void nativeSetOnPlaybackDidFinishFunc(int i17);

    private native void nativeSetOnPlaybackMediaTimeDidChangeFunc(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeShutdownPlayback(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeSkimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18);

    private native com.tencent.maas.instamovie.MJAsyncTaskInfo nativeStartMovieCreationUsingProject(java.lang.String str, int i17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeStartPlaying(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17, int i18);

    private native com.tencent.maas.instamovie.base.MJError nativeStartupPlayback(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeStopPlaying(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeTeardown(int i17);

    public com.tencent.maas.model.time.MJTime GetCurrentPlaybackTime() {
        return nativeGetCurrentPlaybackTime();
    }

    public void changeMuteState(boolean z17) {
        nativeSetIsAudioMuted(z17);
    }

    public int getCurrentState() {
        switch (nativeGetCurrentState()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return -1;
        }
    }

    public com.tencent.maas.model.time.MJTime getPlaybackDuration() {
        return nativeGetPlaybackDuration();
    }

    public void notifySurfaceChanged(int i17, int i18, int i19) {
        io.clipworks.displaysys.DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy == null || !(dSViewProxy instanceof io.clipworks.displaysys.DSProxySurface)) {
            io.clipworks.corekit.NativeLogger.error(TAG, "current surface is not DSProxySurface");
            throw new java.lang.IllegalStateException("current surface is not DSProxySurface");
        }
        ((io.clipworks.displaysys.DSProxySurface) dSViewProxy).notifySurfaceChanged(i17, i18, i19);
    }

    public com.tencent.maas.instamovie.MJAsyncTaskInfo openWithClipBundle(java.lang.String str, com.tencent.maas.instamovie.MJMoviePlayer.OnTaskProgress onTaskProgress, com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new com.tencent.maas.instamovie.MJMoviePlayerCallback.TaskProgressCallback(this, onTaskProgress, false), new com.tencent.maas.instamovie.MJMoviePlayerCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingProject(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public void release() {
        this.mCallbackManager.removeAllCallback();
        this.mCallbackManager.removeAllCallbackWithReturnValue();
        this.mHybridData.resetNative();
    }

    public void setOnPlaybackDidFinishCallback(com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish onPlaybackDidFinish) {
        nativeSetOnPlaybackDidFinishFunc(onPlaybackDidFinish != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.OnPlaybackDidFinishCallback(this, onPlaybackDidFinish, false)) : -1);
    }

    public void setOnPlaybackMediaTimeDidChange(com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange onMediaTimeChange) {
        nativeSetOnPlaybackMediaTimeDidChangeFunc(onMediaTimeChange != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.MediaTimeChangeCallback(this, onMediaTimeChange, false)) : -1);
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

    public com.tencent.maas.instamovie.base.MJError shutdownPlayback(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        return nativeShutdownPlayback(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError skimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18) {
        return nativeSkimTo(mJTime, j17, z17, z18);
    }

    public com.tencent.maas.instamovie.base.MJError startPlaying(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17, com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        return nativeStartPlaying(mJTimeRange, mJTime, i17, z17, onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError startupPlayback(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        return nativeStartupPlayback(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError stopPlaying(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        return nativeStopPlaying(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError tearDown(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        if (this.dsViewProxy != null) {
            io.clipworks.corekit.NativeLogger.info(TAG, "nativeDisconnectFromView");
            nativeDisconnectFromView();
            this.dsViewProxy = null;
        }
        return nativeTeardown(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.instamovie.MJMoviePlayerCallback.CompleteCallback(this, onComplete)) : -1);
    }
}
