package com.tencent.maas.moviecomposing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class ExportSessionCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.moviecomposing.ExportSession> exportSessionRef;

    public ExportSessionCallback$BaseCallback(com.tencent.maas.moviecomposing.ExportSession exportSession) {
        this.exportSessionRef = new java.lang.ref.WeakReference<>(exportSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.exportSessionRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.moviecomposing.ExportSession exportSession, T t17);

    public ExportSessionCallback$BaseCallback(com.tencent.maas.moviecomposing.ExportSession exportSession, boolean z17) {
        super(z17);
        this.exportSessionRef = new java.lang.ref.WeakReference<>(exportSession);
    }
}
