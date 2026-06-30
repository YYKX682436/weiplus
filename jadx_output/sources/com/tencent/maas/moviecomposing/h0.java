package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class h0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.b0 f48502a;

    public h0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, com.tencent.maas.moviecomposing.b0 b0Var, boolean z17) {
        super(playbackSession, z17);
        this.f48502a = b0Var;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.b0 b0Var = this.f48502a;
        if (b0Var != null) {
            b0Var.onFinished();
        }
    }
}
