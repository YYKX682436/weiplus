package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class g0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.x f48497a;

    public g0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, boolean z17, com.tencent.maas.moviecomposing.x xVar) {
        super(playbackSession, z17);
        this.f48497a = xVar;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnHandleBoxSettingsDidChangeArg onHandleBoxSettingsDidChangeArg = (com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnHandleBoxSettingsDidChangeArg) obj;
        if (this.f48497a == null || onHandleBoxSettingsDidChangeArg == null) {
            return;
        }
        com.tencent.maas.moviecomposing.HandleBoxSettings handleBoxSettings = onHandleBoxSettingsDidChangeArg.handleBoxSettings;
        kotlin.jvm.internal.o.g(handleBoxSettings, "handleBoxSettings");
        handleBoxSettings.toString();
    }
}
