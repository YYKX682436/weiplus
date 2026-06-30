package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMoviePlayerWrapper {
    private static final java.lang.String TAG = "MJLocalMoviePlayer";
    private com.tencent.maas.instamovie.MJMoviePlayer moviePlayer;
    private java.lang.String clipBundlePath = null;
    private android.view.Surface surface = null;
    private boolean looping = false;

    public MJMoviePlayerWrapper(com.tencent.maas.MJMaasCore mJMaasCore, android.os.Handler handler) {
        this.moviePlayer = mJMaasCore.m(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareAsync$0(float f17, com.tencent.maas.instamovie.MJTaskTrace mJTaskTrace) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareAsync$1(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete, com.tencent.maas.instamovie.base.MJError mJError) {
        if (onComplete != null) {
            onComplete.onComplete(mJError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(com.tencent.maas.instamovie.base.MJError mJError) {
        this.clipBundlePath = null;
        this.surface = null;
        this.looping = false;
        this.moviePlayer.release();
        this.moviePlayer = null;
    }

    public boolean isLooping() {
        return this.looping;
    }

    public boolean isPlaying() {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.moviePlayer;
        java.util.Objects.requireNonNull(mJMoviePlayer, "movieSession is null");
        return mJMoviePlayer.getCurrentState() == 5;
    }

    public void pause(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.moviePlayer;
        java.util.Objects.requireNonNull(mJMoviePlayer, "movieSession is null");
        mJMoviePlayer.stopPlaying(onComplete);
    }

    public void play(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        java.util.Objects.requireNonNull(this.moviePlayer, "movieSession is null");
        if (this.moviePlayer.getCurrentState() == 5) {
            onComplete.onComplete(null);
            return;
        }
        if (this.moviePlayer.getCurrentState() != 4) {
            throw new java.lang.IllegalStateException("movieSession state is incorrect: " + this.moviePlayer.getCurrentState() + ", should be Initial!");
        }
        com.tencent.maas.model.time.MJTime playbackDuration = this.moviePlayer.getPlaybackDuration();
        if (!playbackDuration.isValid()) {
            throw new java.lang.IllegalStateException("movieSession playback duration is invalid!");
        }
        this.moviePlayer.startPlaying(com.tencent.maas.model.time.MJTimeRange.fromSecondsStartTimeDuration(0.0d, playbackDuration.toSeconds()), com.tencent.maas.model.time.MJTime.ZeroTime, this.looping ? 999 : 1, true, onComplete);
    }

    public void prepareAsync(final com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        if (this.moviePlayer == null) {
            throw new java.lang.IllegalStateException("movieSession is null");
        }
        if (android.text.TextUtils.isEmpty(this.clipBundlePath)) {
            throw new java.lang.IllegalStateException("DataSource is empty");
        }
        this.moviePlayer.openWithClipBundle(this.clipBundlePath, new com.tencent.maas.instamovie.MJMoviePlayerWrapper$$b(), new com.tencent.maas.instamovie.MJMoviePlayer.OnComplete() { // from class: com.tencent.maas.instamovie.MJMoviePlayerWrapper$$c
            @Override // com.tencent.maas.instamovie.MJMoviePlayer.OnComplete
            public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
                com.tencent.maas.instamovie.MJMoviePlayerWrapper.lambda$prepareAsync$1(com.tencent.maas.instamovie.MJMoviePlayer.OnComplete.this, mJError);
            }
        });
    }

    public void release() {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.moviePlayer;
        if (mJMoviePlayer == null) {
            return;
        }
        mJMoviePlayer.tearDown(new com.tencent.maas.instamovie.MJMoviePlayer.OnComplete() { // from class: com.tencent.maas.instamovie.MJMoviePlayerWrapper$$a
            @Override // com.tencent.maas.instamovie.MJMoviePlayer.OnComplete
            public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
                com.tencent.maas.instamovie.MJMoviePlayerWrapper.this.lambda$release$2(mJError);
            }
        });
    }

    public void seekTo(int i17) {
        seekTo(i17, false);
    }

    public void setDataSource(java.lang.String str) {
        if (this.moviePlayer == null) {
            throw new java.lang.IllegalStateException("movieSession is null");
        }
        this.clipBundlePath = str;
    }

    public void setLooping(boolean z17) {
        if (this.moviePlayer == null) {
            throw new java.lang.IllegalStateException("movieSession is null");
        }
        this.looping = z17;
    }

    public void setSurface(android.view.Surface surface) {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.moviePlayer;
        java.util.Objects.requireNonNull(mJMoviePlayer, "movieSession is null");
        mJMoviePlayer.setSurface(surface);
    }

    public void seekTo(int i17, boolean z17) {
        com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = this.moviePlayer;
        java.util.Objects.requireNonNull(mJMoviePlayer, "movieSession is null");
        mJMoviePlayer.skimTo(com.tencent.maas.model.time.MJTime.fromMilliseconds(i17), 0L, true, z17);
    }
}
