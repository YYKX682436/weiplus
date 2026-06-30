package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class c0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.u f48484a;

    public c0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, com.tencent.maas.moviecomposing.u uVar) {
        super(playbackSession);
        this.f48484a = uVar;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.CompleteArg completeArg = (com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.CompleteArg) obj;
        com.tencent.maas.moviecomposing.u uVar = this.f48484a;
        if (uVar == null || completeArg == null) {
            return;
        }
        uVar.onComplete(completeArg.error);
    }
}
