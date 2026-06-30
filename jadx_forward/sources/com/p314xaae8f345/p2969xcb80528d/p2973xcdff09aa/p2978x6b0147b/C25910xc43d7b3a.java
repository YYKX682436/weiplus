package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b;

/* renamed from: com.tencent.tavkit.composition.video.DefaultVideoMixFilter */
/* loaded from: classes10.dex */
class C25910xc43d7b3a implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter {
    /* renamed from: checkFillInRenderSize */
    private void m98740x342c9007(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair trackImagePair, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095) {
        if (trackImagePair.m98747x75359795() instanceof com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79) {
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 mo98552xe6cf5231 = ((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79) trackImagePair.m98747x75359795()).mo98552xe6cf5231();
            if (mo98552xe6cf5231.m98698xdf713550()) {
                return;
            }
            c25859x590b0095.m98351xf97b67f7(new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF(0.0f, 0.0f), c25912xbdf93b84.m98752x356c92ad()), mo98552xe6cf5231.m98699xc2a14486());
        }
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
    /* renamed from: apply */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98537x58b836e(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639 c25911x10613639, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84) {
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095(c25912xbdf93b84.m98752x356c92ad());
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair trackImagePair : c25911x10613639.m98744xb7c7ba96()) {
            com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98746x74984fa5 = trackImagePair.m98746x74984fa5();
            m98740x342c9007(c25912xbdf93b84, trackImagePair, m98746x74984fa5);
            m98746x74984fa5.m98367xf0aa9f5(c25859x590b0095);
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair trackImagePair2 : c25911x10613639.m98743xa7c2f332()) {
            com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 m98746x74984fa52 = trackImagePair2.m98746x74984fa5();
            m98740x342c9007(c25912xbdf93b84, trackImagePair2, m98746x74984fa52);
            m98746x74984fa52.m98367xf0aa9f5(c25859x590b0095);
        }
        return c25859x590b0095;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
    /* renamed from: release */
    public void mo98538x41012807() {
    }
}
