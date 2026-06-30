package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback */
/* loaded from: classes16.dex */
public abstract class AbstractC4021x2ef8d971<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: mjCamSessionWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944> f15883x8f0e37cf;

    /* renamed from: mjCamoSessionWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19> f15884x810f911a;

    public AbstractC4021x2ef8d971(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944) {
        this.f15883x8f0e37cf = new java.lang.ref.WeakReference<>(c4020x8c1a4944);
        this.f15884x810f911a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944> weakReference = this.f15883x8f0e37cf;
        if (weakReference != null) {
            mo32751x48671b37(weakReference.get(), (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944) callbackArgs);
        } else {
            mo32752x48671b37(this.f15884x810f911a.get(), (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19) callbackArgs);
        }
    }

    /* renamed from: onInvoke */
    public abstract void mo32751x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944, T t17);

    /* renamed from: onInvoke */
    public abstract void mo32752x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19, T t17);

    public AbstractC4021x2ef8d971(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944, boolean z17) {
        super(z17);
        this.f15883x8f0e37cf = new java.lang.ref.WeakReference<>(c4020x8c1a4944);
        this.f15884x810f911a = null;
    }

    public AbstractC4021x2ef8d971(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19) {
        this(c4027x83c03a19, true);
    }

    public AbstractC4021x2ef8d971(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19, boolean z17) {
        super(z17);
        this.f15883x8f0e37cf = null;
        this.f15884x810f911a = new java.lang.ref.WeakReference<>(c4027x83c03a19);
    }
}
