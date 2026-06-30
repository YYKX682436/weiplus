package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.camstudio.MJCamResourceManagerCallback$BaseCallback */
/* loaded from: classes16.dex */
public abstract class AbstractC4017x4a8755e8<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: mjCamResourceManagerWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d> f15874xac241b46;

    /* renamed from: mjCamoSessionWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19> f15875x810f911a;

    public AbstractC4017x4a8755e8(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d c4016x48c9106d) {
        this.f15874xac241b46 = new java.lang.ref.WeakReference<>(c4016x48c9106d);
        this.f15875x810f911a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d> weakReference = this.f15874xac241b46;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d c4016x48c9106d = weakReference != null ? weakReference.get() : null;
        java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19> weakReference2 = this.f15875x810f911a;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = weakReference2 != null ? weakReference2.get() : null;
        if (c4016x48c9106d != null) {
            mo32674x48671b37(c4016x48c9106d, (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d) callbackArgs);
        } else if (c4027x83c03a19 != null) {
            mo32675x48671b37(c4027x83c03a19, (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19) callbackArgs);
        }
    }

    /* renamed from: onInvoke */
    public abstract void mo32674x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d c4016x48c9106d, T t17);

    /* renamed from: onInvoke */
    public abstract void mo32675x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19, T t17);

    public AbstractC4017x4a8755e8(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d c4016x48c9106d, boolean z17) {
        super(z17);
        this.f15874xac241b46 = new java.lang.ref.WeakReference<>(c4016x48c9106d);
        this.f15875x810f911a = null;
    }

    public AbstractC4017x4a8755e8(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19) {
        this.f15875x810f911a = new java.lang.ref.WeakReference<>(c4027x83c03a19);
        this.f15874xac241b46 = null;
    }

    public AbstractC4017x4a8755e8(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19, boolean z17) {
        super(z17);
        this.f15875x810f911a = new java.lang.ref.WeakReference<>(c4027x83c03a19);
        this.f15874xac241b46 = null;
    }
}
