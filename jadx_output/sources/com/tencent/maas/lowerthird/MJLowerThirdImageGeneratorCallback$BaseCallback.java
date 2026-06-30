package com.tencent.maas.lowerthird;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJLowerThirdImageGeneratorCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.lowerthird.MJLowerThirdImageGenerator> mjLowerThirdImageGeneratorWeakReference;

    public MJLowerThirdImageGeneratorCallback$BaseCallback(com.tencent.maas.lowerthird.MJLowerThirdImageGenerator mJLowerThirdImageGenerator) {
        this.mjLowerThirdImageGeneratorWeakReference = new java.lang.ref.WeakReference<>(mJLowerThirdImageGenerator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.mjLowerThirdImageGeneratorWeakReference.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.lowerthird.MJLowerThirdImageGenerator mJLowerThirdImageGenerator, T t17);

    public MJLowerThirdImageGeneratorCallback$BaseCallback(com.tencent.maas.lowerthird.MJLowerThirdImageGenerator mJLowerThirdImageGenerator, boolean z17) {
        super(z17);
        this.mjLowerThirdImageGeneratorWeakReference = new java.lang.ref.WeakReference<>(mJLowerThirdImageGenerator);
    }
}
