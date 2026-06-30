package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81;

/* renamed from: com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder */
/* loaded from: classes16.dex */
public class C25511x2e0111ec {

    /* renamed from: contentProviderDelegateProvider */
    static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25510xed41f020 f46647x8a5af840;

    /* renamed from: sPrepareListener */
    private static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.DelegateProviderHolderPrepareListener f46648x7bb8a1e8;

    /* renamed from: com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder$DelegateProviderHolderPrepareListener */
    /* loaded from: classes16.dex */
    public interface DelegateProviderHolderPrepareListener {
        /* renamed from: onPrepare */
        void mo94655x3cac0e28();
    }

    /* renamed from: notifyDelegateProviderHolderPrepare */
    private static void m94652x4e3d27fc() {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.DelegateProviderHolderPrepareListener delegateProviderHolderPrepareListener = f46648x7bb8a1e8;
        if (delegateProviderHolderPrepareListener != null) {
            delegateProviderHolderPrepareListener.mo94655x3cac0e28();
        }
    }

    /* renamed from: setContentProviderDelegateProvider */
    public static void m94653xbe81277e(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25510xed41f020 interfaceC25510xed41f020) {
        f46647x8a5af840 = interfaceC25510xed41f020;
        m94652x4e3d27fc();
    }

    /* renamed from: setDelegateProviderHolderPrepareListener */
    public static void m94654xbd94db57(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.C25511x2e0111ec.DelegateProviderHolderPrepareListener delegateProviderHolderPrepareListener) {
        f46648x7bb8a1e8 = delegateProviderHolderPrepareListener;
    }
}
