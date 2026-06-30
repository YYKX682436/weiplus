package com.p314xaae8f345.p457x3304c6.p482xca9708e2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.speech.MJSpeechManagerCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4199x9a901327<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: mjSpeechManagerWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce> f16164xd0c50f85;

    public AbstractC4199x9a901327(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce) {
        this.f16164xd0c50f85 = new java.lang.ref.WeakReference<>(c4198x4175a9ce);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo34689x48671b37(this.f16164xd0c50f85.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo34689x48671b37(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce, T t17);

    public AbstractC4199x9a901327(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce, boolean z17) {
        super(z17);
        this.f16164xd0c50f85 = new java.lang.ref.WeakReference<>(c4198x4175a9ce);
    }
}
