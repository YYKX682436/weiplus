package com.tencent.maas.speech;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJSpeechManagerCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.speech.MJSpeechManager> mjSpeechManagerWeakReference;

    public MJSpeechManagerCallback$BaseCallback(com.tencent.maas.speech.MJSpeechManager mJSpeechManager) {
        this.mjSpeechManagerWeakReference = new java.lang.ref.WeakReference<>(mJSpeechManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.mjSpeechManagerWeakReference.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, T t17);

    public MJSpeechManagerCallback$BaseCallback(com.tencent.maas.speech.MJSpeechManager mJSpeechManager, boolean z17) {
        super(z17);
        this.mjSpeechManagerWeakReference = new java.lang.ref.WeakReference<>(mJSpeechManager);
    }
}
