package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class k0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.z f48508a;

    public k0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, com.tencent.maas.moviecomposing.z zVar) {
        super(playbackSession);
        this.f48508a = zVar;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnSnapshotCompleteArg onSnapshotCompleteArg = (com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnSnapshotCompleteArg) obj;
        com.tencent.maas.moviecomposing.z zVar = this.f48508a;
        if (zVar == null || onSnapshotCompleteArg == null) {
            return;
        }
        ((gx0.ue) zVar).f277040a.resumeWith(kotlin.Result.m521constructorimpl(onSnapshotCompleteArg.bitmap));
    }
}
