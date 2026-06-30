package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class i0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.a0 f48506a;

    public i0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, com.tencent.maas.moviecomposing.a0 a0Var, boolean z17) {
        super(playbackSession, z17);
        this.f48506a = a0Var;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnPlaybackFailArgs onPlaybackFailArgs = (com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnPlaybackFailArgs) obj;
        if (this.f48506a != null) {
            com.tencent.maas.instamovie.base.MJError mJError = onPlaybackFailArgs.error;
            com.tencent.mars.xlog.Log.i("MovieComp.PlaybackControlUIC", "playbackSession fail");
        }
    }
}
