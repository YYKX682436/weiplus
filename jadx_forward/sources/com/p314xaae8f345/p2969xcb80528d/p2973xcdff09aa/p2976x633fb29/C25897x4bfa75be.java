package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29;

/* renamed from: com.tencent.tavkit.composition.model.TAVTransition */
/* loaded from: classes16.dex */
public class C25897x4bfa75be {

    /* renamed from: audioTransition */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 f49002x38c291cb;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49003x89444d94;

    /* renamed from: videoTransition */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 f49004xe2964030;

    /* renamed from: com.tencent.tavkit.composition.model.TAVTransition$EmptyAudioTransition */
    /* loaded from: classes16.dex */
    public static class EmptyAudioTransition implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 {

        /* renamed from: duration */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49005x89444d94;

        /* renamed from: identifier */
        private java.lang.String f49006x9f88aca9;

        public EmptyAudioTransition(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
            this.f49005x89444d94 = c25736x76b98a57;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302
        /* renamed from: applyNextAudioMixInputParameters */
        public void mo98607x96c5f90d(com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8 c25687xc3e1dfe8, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302
        /* renamed from: applyPreviousAudioMixInputParameters */
        public void mo98608x4112db89(com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8 c25687xc3e1dfe8, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302
        /* renamed from: getDuration */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98609x51e8b0a() {
            return this.f49005x89444d94;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302
        /* renamed from: getIdentifier */
        public java.lang.String mo98610x8dc9649f() {
            return this.f49006x9f88aca9;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302
        /* renamed from: setIdentifier */
        public void mo98611xbbedb2ab(java.lang.String str) {
            this.f49006x9f88aca9 = str;
        }
    }

    /* renamed from: com.tencent.tavkit.composition.model.TAVTransition$EmptyVideoTransition */
    /* loaded from: classes16.dex */
    public static class EmptyVideoTransition implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 {

        /* renamed from: duration */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49007x89444d94;

        public EmptyVideoTransition(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
            this.f49007x89444d94 = c25736x76b98a57;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167
        /* renamed from: createFilter */
        public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167.Filter mo98691x44bdab94() {
            return null;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167
        /* renamed from: effectId */
        public java.lang.String mo98692xc35ea28c() {
            return toString();
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167
        /* renamed from: getDuration */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98693x51e8b0a() {
            return this.f49007x89444d94;
        }
    }

    public C25897x4bfa75be(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f49003x89444d94 = c25736x76b98a57;
        this.f49002x38c291cb = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be.EmptyAudioTransition(c25736x76b98a57);
        this.f49004xe2964030 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be.EmptyVideoTransition(c25736x76b98a57);
    }

    /* renamed from: getAudioTransition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 m98686x1d246395() {
        return this.f49002x38c291cb;
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98687x51e8b0a() {
        return this.f49003x89444d94;
    }

    /* renamed from: getVideoTransition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 m98688xc6f811fa() {
        return this.f49004xe2964030;
    }

    /* renamed from: setAudioTransition */
    public void m98689x53fafd09(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 interfaceC25881xbf556302) {
        this.f49002x38c291cb = interfaceC25881xbf556302;
    }

    /* renamed from: setVideoTransition */
    public void m98690xfdceab6e(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 interfaceC25920x69291167) {
        this.f49004xe2964030 = interfaceC25920x69291167;
    }
}
