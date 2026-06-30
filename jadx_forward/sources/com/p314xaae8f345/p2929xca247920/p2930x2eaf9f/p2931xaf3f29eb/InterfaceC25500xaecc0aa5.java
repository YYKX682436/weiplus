package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb;

/* renamed from: com.tencent.shadow.core.common.IWVAComponentDelegateV2 */
/* loaded from: classes7.dex */
public interface InterfaceC25500xaecc0aa5 extends com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25499x20ae6e49 {
    /* renamed from: moveToForeground */
    void mo46919x39b9148f();

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25499x20ae6e49
    /* renamed from: startActivity */
    default void mo94634xa4df9991(android.content.Intent intent) {
        mo46920xa4df9991(intent, false);
    }

    /* renamed from: startActivity */
    void mo46920xa4df9991(android.content.Intent intent, boolean z17);

    /* renamed from: supportRunInBackground */
    boolean mo46921xb09b2a8f();
}
