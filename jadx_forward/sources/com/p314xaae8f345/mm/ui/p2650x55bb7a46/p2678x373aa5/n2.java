package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes5.dex */
public final class n2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public n2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.uq uqVar = event.f136212g;
        java.lang.String str = uqVar != null ? uqVar.f89659b : null;
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20039x36497ecd();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerConfig_ResetMultiSelectCopyWarningDialog")) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MicroMsg.MultiSelectCopyWarningDialog", 2, null);
        N.putBoolean("multiselect_copy_warning_dialog_accepted", false);
        N.remove("multiselect_copy_warning_dialog_accepted");
        return true;
    }
}
