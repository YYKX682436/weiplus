package com.tencent.maas.export;

/* loaded from: classes5.dex */
abstract class MJMovieExporterCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.export.MJMovieExporter> mjMovieExporterRef;

    public MJMovieExporterCallback$BaseCallback(com.tencent.maas.export.MJMovieExporter mJMovieExporter) {
        this.mjMovieExporterRef = new java.lang.ref.WeakReference<>(mJMovieExporter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.mjMovieExporterRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.export.MJMovieExporter mJMovieExporter, T t17);

    public MJMovieExporterCallback$BaseCallback(com.tencent.maas.export.MJMovieExporter mJMovieExporter, boolean z17) {
        super(z17);
        this.mjMovieExporterRef = new java.lang.ref.WeakReference<>(mJMovieExporter);
    }
}
