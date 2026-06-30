package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6;

/* renamed from: com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters */
/* loaded from: classes16.dex */
public class C25878xc5e94805 extends com.p314xaae8f345.tav.p2947x2eaf9f.C25687xc3e1dfe8 {
    private static final java.lang.String TAG = "TAVAudioMixInputParameters";

    /* renamed from: audioConfigurationSegmentList */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca> f48958x5a85ad91;

    public C25878xc5e94805(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        super(c25634xf527485b);
        this.f48958x5a85ad91 = new java.util.ArrayList();
    }

    /* renamed from: addAudioConfiguration */
    public void m98601xe85e2341(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 c25895x5a280429) {
        this.f48958x5a85ad91.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca(c25738xead39d26, c25895x5a280429));
    }

    /* renamed from: getAudioConfigurationSegmentList */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca> m98602x8a0795db() {
        return this.f48958x5a85ad91;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae
    /* renamed from: getVolumeAtTime */
    public float mo96692xdd6babd0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca c25877x6978e2ca : this.f48958x5a85ad91) {
            if (c25877x6978e2ca != null && c25877x6978e2ca.f48957xc78203e6.m97253x805f158c(c25736x76b98a57)) {
                return (c25877x6978e2ca.f48956xe2df74c0.m98669xf9148bc3() == null || !c25877x6978e2ca.f48957xc78203e6.m97260x75286aac().add(c25877x6978e2ca.f48956xe2df74c0.m98669xf9148bc3().m98677x51e8b0a()).m97222xf922bec1(c25736x76b98a57)) ? (c25877x6978e2ca.f48956xe2df74c0.m98667x68fcb77c() == null || !c25877x6978e2ca.f48957xc78203e6.m97258xb58839a5().sub(c25877x6978e2ca.f48956xe2df74c0.m98667x68fcb77c().m98677x51e8b0a()).m97238x9f3f7b48(c25736x76b98a57)) ? c25877x6978e2ca.f48956xe2df74c0.m98671x34c20a10(c25736x76b98a57) : c25877x6978e2ca.f48956xe2df74c0.m98667x68fcb77c().m98681x34c20a10(c25736x76b98a57.sub(c25877x6978e2ca.f48957xc78203e6.m97258xb58839a5().sub(c25877x6978e2ca.f48956xe2df74c0.m98667x68fcb77c().m98677x51e8b0a()))) : c25877x6978e2ca.f48956xe2df74c0.m98669xf9148bc3().m98681x34c20a10(c25736x76b98a57.sub(c25877x6978e2ca.f48957xc78203e6.m97260x75286aac()));
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "没有设置正确audioConfiguration，走到了非预想的分支");
        return super.mo96692xdd6babd0(c25736x76b98a57);
    }

    /* renamed from: setAudioConfigurationSegments */
    public void m98603x5b352282(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca> list) {
        this.f48958x5a85ad91.clear();
        this.f48958x5a85ad91.addAll(list);
    }
}
