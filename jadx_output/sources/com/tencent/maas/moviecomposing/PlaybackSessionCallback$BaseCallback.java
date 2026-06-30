package com.tencent.maas.moviecomposing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class PlaybackSessionCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.moviecomposing.PlaybackSession> playbackSessionRef;

    public PlaybackSessionCallback$BaseCallback(com.tencent.maas.moviecomposing.PlaybackSession playbackSession) {
        this.playbackSessionRef = new java.lang.ref.WeakReference<>(playbackSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.playbackSessionRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, T t17);

    public PlaybackSessionCallback$BaseCallback(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, boolean z17) {
        super(z17);
        this.playbackSessionRef = new java.lang.ref.WeakReference<>(playbackSession);
    }
}
