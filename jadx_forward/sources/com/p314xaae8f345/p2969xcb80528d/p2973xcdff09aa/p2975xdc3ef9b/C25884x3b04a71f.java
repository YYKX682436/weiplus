package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tavkit.composition.builder.AudioParamsBuilder */
/* loaded from: classes16.dex */
public class C25884x3b04a71f {

    /* renamed from: audioMixInputParametersHashMap */
    private java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805> f48966x8b1f9fc0 = new java.util.HashMap<>();

    /* renamed from: builderModel */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e f48967xf749a44e;

    public C25884x3b04a71f(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e c25887x114f86e) {
        this.f48967xf749a44e = c25887x114f86e;
    }

    /* renamed from: buildAudioParametersByTrackInfo */
    private void m98613x6aa84c90(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25885x80237baa c25885x80237baa) {
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25882x82a4b984 c25882x82a4b984 : c25885x80237baa.f48968x5b209b4f) {
            int m96163xfe2e0f70 = c25882x82a4b984.f48963x9beb71c1.m96163xfe2e0f70();
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805 c25878xc5e94805 = this.f48966x8b1f9fc0.get(java.lang.Integer.valueOf(m96163xfe2e0f70));
            if (c25878xc5e94805 == null) {
                c25878xc5e94805 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805(c25882x82a4b984.f48963x9beb71c1);
                this.f48966x8b1f9fc0.put(java.lang.Integer.valueOf(m96163xfe2e0f70), c25878xc5e94805);
            }
            c25878xc5e94805.m98601xe85e2341(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25882x82a4b984.f48962x58d9bd6.mo98548x8082fb99(), c25882x82a4b984.f48962x58d9bd6.mo98545x51e8b0a()), c25882x82a4b984.f48962x58d9bd6.mo98543xf63bd6b6());
            c25878xc5e94805.m96791x69406e3(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25880x4ecd29c(c25878xc5e94805.m98602x8a0795db()));
        }
    }

    /* renamed from: buildBgAudioInputParameters */
    private void m98614x1d41ae91() {
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25883xeb2f6494 c25883xeb2f6494 : this.f48967xf749a44e.m98622x277a6e59()) {
            int m96163xfe2e0f70 = c25883xeb2f6494.f48965x697f14b.m96163xfe2e0f70();
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805 c25878xc5e94805 = this.f48966x8b1f9fc0.get(java.lang.Integer.valueOf(m96163xfe2e0f70));
            if (c25878xc5e94805 == null) {
                c25878xc5e94805 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805(c25883xeb2f6494.f48965x697f14b);
                this.f48966x8b1f9fc0.put(java.lang.Integer.valueOf(m96163xfe2e0f70), c25878xc5e94805);
            }
            c25878xc5e94805.m98601xe85e2341(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25883xeb2f6494.f48964x58d9bd6.mo98548x8082fb99(), c25883xeb2f6494.f48964x58d9bd6.mo98545x51e8b0a()), c25883xeb2f6494.f48964x58d9bd6.mo98543xf63bd6b6());
            c25878xc5e94805.m96791x69406e3(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25880x4ecd29c(c25878xc5e94805.m98602x8a0795db()));
        }
    }

    /* renamed from: buildMainAudioInputParameters */
    private void m98615x5cca9a85() {
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25885x80237baa> m98625x741bdd72 = this.f48967xf749a44e.m98625x741bdd72();
        for (int i17 = 0; i17 < m98625x741bdd72.size(); i17++) {
            m98613x6aa84c90(m98625x741bdd72.get(i17));
        }
    }

    /* renamed from: build */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805> m98616x59bc66e() {
        m98615x5cca9a85();
        m98614x1d41ae91();
        return new java.util.ArrayList(this.f48966x8b1f9fc0.values());
    }
}
