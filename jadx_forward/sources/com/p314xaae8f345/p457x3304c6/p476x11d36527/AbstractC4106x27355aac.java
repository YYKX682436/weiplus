package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.material.MJMaterialManagerCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4106x27355aac<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: mjMaterialManagerWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929> f16087xc087ac0a;

    public AbstractC4106x27355aac(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929) {
        this.f16087xc087ac0a = new java.lang.ref.WeakReference<>(c4105x45a51929);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo33813x48671b37(this.f16087xc087ac0a.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo33813x48671b37(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929, T t17);

    public AbstractC4106x27355aac(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929, boolean z17) {
        super(z17);
        this.f16087xc087ac0a = new java.lang.ref.WeakReference<>(c4105x45a51929);
    }
}
