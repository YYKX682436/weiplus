package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b;

/* renamed from: com.tencent.tavkit.composition.builder.AudioInfo */
/* loaded from: classes16.dex */
class C25882x82a4b984 {

    /* renamed from: audio */
    com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e f48962x58d9bd6;

    /* renamed from: compositionTrack */
    com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 f48963x9beb71c1;

    public C25882x82a4b984(com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 c25639x69afb5e1, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e interfaceC25898x5fe17e9e) {
        this.f48963x9beb71c1 = c25639x69afb5e1;
        this.f48962x58d9bd6 = interfaceC25898x5fe17e9e;
    }

    /* renamed from: getCurrentSegmentBy */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 m98612x8ab388e7() {
        for (int i17 = 0; i17 < this.f48963x9beb71c1.mo96159xbac98516().size(); i17++) {
            com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = this.f48963x9beb71c1.mo96159xbac98516().get(i17);
            if (c25640x7df05212.m96173x35b5540b().m97241x30959487().m97255xb2c87fbf(this.f48962x58d9bd6.mo98550xdd1fba())) {
                return c25640x7df05212;
            }
        }
        return null;
    }
}
