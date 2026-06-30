package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e;

/* renamed from: com.tencent.tavkit.composition.resource.TAVImageTrackResource */
/* loaded from: classes16.dex */
public class C25906xa6c80047 extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 {

    /* renamed from: emptyAudioTrack */
    private boolean f49025xa7794042;

    /* renamed from: path */
    private java.lang.String f49026x346425;

    public C25906xa6c80047(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this(str, c25736x76b98a57, true);
    }

    /* renamed from: getPath */
    public java.lang.String m98722xfb83cc9b() {
        return this.f49026x346425;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: imageAtTime */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98721x62e466db(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        return null;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: trackInfoForType */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca(int i17, int i18) {
        if (i17 != 1 && !this.f49025xa7794042) {
            return null;
        }
        if (i17 == 1) {
            i17 = 3;
        }
        java.lang.String str = this.f49026x346425;
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f49029x2a055495;
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(str, 0, c25738xead39d26, c25738xead39d26, i17);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 c25908xa2ed4c79 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79();
        c25908xa2ed4c79.m98736xaa53c770(c25640x7df05212);
        c25908xa2ed4c79.m98738xcbae2dd3(m98725xe67265f());
        c25908xa2ed4c79.m98737x2d43d157(m98724x3583a504());
        return c25908xa2ed4c79;
    }

    public C25906xa6c80047(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        this.f49026x346425 = str;
        this.f49025xa7794042 = z17;
        this.f49027x89444d94 = c25736x76b98a57;
        this.f49029x2a055495 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25736x76b98a57);
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: clone */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25906xa6c80047 mo98716x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25906xa6c80047 c25906xa6c80047 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25906xa6c80047(this.f49026x346425, this.f49027x89444d94.m97224x5a5dd5d());
        c25906xa6c80047.f49029x2a055495 = this.f49029x2a055495.m97252x5a5dd5d();
        c25906xa6c80047.f49028x46ebd80e = this.f49028x46ebd80e.m97224x5a5dd5d();
        return c25906xa6c80047;
    }
}
