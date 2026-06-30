package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes13.dex */
public final class n implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 f226386a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2) {
        this.f226386a = c16293xe2a3baf2;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener
    /* renamed from: onScaleViewChanged */
    public void mo36381x92aceca4(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = this.f226386a;
        c16293xe2a3baf2.f226232p2 = f17;
        if (f17 > 20.0f || c16293xe2a3baf2.f226230n2 == null || c16293xe2a3baf2.f226231o2 == null) {
            c16293xe2a3baf2.setVisibility(8);
        } else {
            c16293xe2a3baf2.setVisibility(0);
        }
    }
}
