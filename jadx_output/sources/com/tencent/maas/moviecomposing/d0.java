package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class d0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.t f48489a;

    public d0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, com.tencent.maas.moviecomposing.t tVar, boolean z17) {
        super(playbackSession, z17);
        this.f48489a = tVar;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.MediaTimeChangeArg mediaTimeChangeArg = (com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.MediaTimeChangeArg) obj;
        com.tencent.maas.moviecomposing.t tVar = this.f48489a;
        if (tVar == null || mediaTimeChangeArg == null) {
            return;
        }
        tVar.onMediaTimeChange(mediaTimeChangeArg.f48398a, mediaTimeChangeArg.f48399b, mediaTimeChangeArg.f48400c);
    }
}
