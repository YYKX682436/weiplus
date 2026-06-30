package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e;

/* renamed from: com.tencent.tavkit.composition.resource.TAVEmptyResource */
/* loaded from: classes16.dex */
public class C25904x1e3cc372 extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 {

    /* renamed from: insertTimeRange */
    private boolean f49021x8e3e0bb7;

    public C25904x1e3cc372(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this(c25736x76b98a57, true);
    }

    /* renamed from: setInsertTimeRange */
    public void m98720xa97676f5(boolean z17) {
        this.f49021x8e3e0bb7 = z17;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: trackInfoForType */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca(int i17, int i18) {
        if (this.f49021x8e3e0bb7) {
            return super.mo98718x83bc0ca(i17, i18);
        }
        return null;
    }

    public C25904x1e3cc372(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        this.f49021x8e3e0bb7 = z17;
        this.f49027x89444d94 = c25736x76b98a57;
        this.f49029x2a055495 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25736x76b98a57);
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: clone */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372 c25904x1e3cc372 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(this.f49027x89444d94.m97224x5a5dd5d());
        c25904x1e3cc372.f49029x2a055495 = this.f49029x2a055495.m97252x5a5dd5d();
        c25904x1e3cc372.f49028x46ebd80e = this.f49028x46ebd80e.m97224x5a5dd5d();
        return c25904x1e3cc372;
    }
}
