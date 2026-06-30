package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6;

/* renamed from: com.tencent.tavkit.composition.audio.TAVAudioTapProcessor */
/* loaded from: classes16.dex */
public class C25880x4ecd29c implements com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305 {

    /* renamed from: audioConfigurationSegmentList */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca> f48959x5a85ad91;

    /* renamed from: audioTapProcessorHashMap */
    private java.util.HashMap<java.lang.String, com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305> f48960x3b966a89 = new java.util.HashMap<>();

    /* renamed from: destAudioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f48961x4aed1122;

    public C25880x4ecd29c(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca> list) {
        this.f48959x5a85ad91 = list;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305
    /* renamed from: getDestAudioInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 mo96699x84ccd6c() {
        return this.f48961x4aed1122;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305
    /* renamed from: processAudioPCM */
    public java.nio.ByteBuffer mo96700x9d40a4b3(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f48961x4aed1122 = c25756x82a4b984;
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25877x6978e2ca c25877x6978e2ca : this.f48959x5a85ad91) {
            if (c25877x6978e2ca != null && c25877x6978e2ca.f48957xc78203e6.m97253x805f158c(c25736x76b98a57)) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 c25895x5a280429 = c25877x6978e2ca.f48956xe2df74c0;
                if (c25895x5a280429.m98668x74dfb8fb() != null) {
                    for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7 interfaceC25879x655c64e7 : c25895x5a280429.m98668x74dfb8fb()) {
                        java.lang.String mo98605x8dc9649f = interfaceC25879x655c64e7.mo98605x8dc9649f();
                        com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305 interfaceC25674xc28db305 = this.f48960x3b966a89.get(mo98605x8dc9649f);
                        if (interfaceC25674xc28db305 == null) {
                            interfaceC25674xc28db305 = interfaceC25879x655c64e7.mo98604x8177c578();
                            this.f48960x3b966a89.put(mo98605x8dc9649f, interfaceC25674xc28db305);
                        }
                        if (interfaceC25674xc28db305 != null) {
                            byteBuffer = interfaceC25674xc28db305.mo96700x9d40a4b3(c25736x76b98a57, byteBuffer, c25756x82a4b984);
                            this.f48961x4aed1122 = interfaceC25674xc28db305.mo96699x84ccd6c();
                        }
                    }
                }
            }
        }
        return byteBuffer;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305
    /* renamed from: release */
    public void mo96701x41012807() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305> it = this.f48960x3b966a89.values().iterator();
        while (it.hasNext()) {
            it.next().mo96701x41012807();
        }
    }

    /* renamed from: toString */
    public java.lang.String m98606x9616526c() {
        return "TAVAudioTapProcessor{audioConfigurationSegmentList=" + this.f48959x5a85ad91 + ", audioTapProcessorHashMap=" + this.f48960x3b966a89 + '}';
    }
}
