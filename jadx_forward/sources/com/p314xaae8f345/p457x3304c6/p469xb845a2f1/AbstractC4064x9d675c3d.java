package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4064x9d675c3d<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: imageSessionRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8> f15931x16a67dd8;

    public AbstractC4064x9d675c3d(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8) {
        this.f15931x16a67dd8 = new java.lang.ref.WeakReference<>(c4063x855a1ef8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo33152x48671b37(this.f15931x16a67dd8.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo33152x48671b37(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, T t17);

    public AbstractC4064x9d675c3d(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, boolean z17) {
        super(z17);
        this.f15931x16a67dd8 = new java.lang.ref.WeakReference<>(c4063x855a1ef8);
    }
}
