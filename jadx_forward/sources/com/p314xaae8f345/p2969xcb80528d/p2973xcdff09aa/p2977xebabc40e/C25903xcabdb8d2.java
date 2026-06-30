package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e;

/* renamed from: com.tencent.tavkit.composition.resource.TAVAssetTrackResource */
/* loaded from: classes16.dex */
public class C25903xcabdb8d2 extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 {

    /* renamed from: asset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f49020x58ceaf0;

    public C25903xcabdb8d2(java.lang.String str) {
        this(new com.p314xaae8f345.tav.p2945x58ceaf0.C25647xf4fd2ae1(str));
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m98717x742a913a() {
        return this.f49020x58ceaf0;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: trackInfoForType */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca(int i17, int i18) {
        com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b = mo98719x411739fb(i17).get(i18);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 c25908xa2ed4c79 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79();
        c25908xa2ed4c79.m98739x53c3b209(c25634xf527485b);
        c25908xa2ed4c79.m98738xcbae2dd3(m98725xe67265f());
        c25908xa2ed4c79.m98737x2d43d157(m98724x3583a504());
        return c25908xa2ed4c79;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: tracksForType */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> mo98719x411739fb(int i17) {
        com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0 = this.f49020x58ceaf0;
        return abstractC25633x3c9fad0 != null ? abstractC25633x3c9fad0.mo96143x6e29e370(i17) : new java.util.ArrayList();
    }

    public C25903xcabdb8d2(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this.f49020x58ceaf0 = abstractC25633x3c9fad0;
        this.f49027x89444d94 = abstractC25633x3c9fad0.m96116x51e8b0a();
        this.f49029x2a055495 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, abstractC25633x3c9fad0.m96116x51e8b0a());
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: clone */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2 c25903xcabdb8d2 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2(this.f49020x58ceaf0);
        c25903xcabdb8d2.f49029x2a055495 = this.f49029x2a055495.m97252x5a5dd5d();
        c25903xcabdb8d2.f49028x46ebd80e = this.f49028x46ebd80e.m97224x5a5dd5d();
        c25903xcabdb8d2.f49027x89444d94 = this.f49027x89444d94.m97224x5a5dd5d();
        return c25903xcabdb8d2;
    }
}
