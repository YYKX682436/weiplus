package com.tencent.maas.imagestudio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJImageSceneCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.imagestudio.MJImageScene> imageSceneRef;

    public MJImageSceneCallback$BaseCallback(com.tencent.maas.imagestudio.MJImageScene mJImageScene) {
        this.imageSceneRef = new java.lang.ref.WeakReference<>(mJImageScene);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.imageSceneRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.imagestudio.MJImageScene mJImageScene, T t17);

    public MJImageSceneCallback$BaseCallback(com.tencent.maas.imagestudio.MJImageScene mJImageScene, boolean z17) {
        super(z17);
        this.imageSceneRef = new java.lang.ref.WeakReference<>(mJImageScene);
    }
}
