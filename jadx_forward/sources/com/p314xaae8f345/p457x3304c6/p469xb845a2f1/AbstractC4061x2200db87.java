package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.imagestudio.MJImageSceneCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4061x2200db87<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: imageSceneRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e> f15927x23364ee2;

    public AbstractC4061x2200db87(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e) {
        this.f15927x23364ee2 = new java.lang.ref.WeakReference<>(c4060x7aac656e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo33115x48671b37(this.f15927x23364ee2.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo33115x48671b37(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e, T t17);

    public AbstractC4061x2200db87(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e, boolean z17) {
        super(z17);
        this.f15927x23364ee2 = new java.lang.ref.WeakReference<>(c4060x7aac656e);
    }
}
