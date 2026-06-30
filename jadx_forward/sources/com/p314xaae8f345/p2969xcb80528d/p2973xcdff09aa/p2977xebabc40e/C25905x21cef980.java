package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e;

/* renamed from: com.tencent.tavkit.composition.resource.TAVImageResource */
/* loaded from: classes16.dex */
public class C25905x21cef980 extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 {

    /* renamed from: ciImageHashMap */
    private java.util.HashMap<java.lang.Thread, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095> f49022x8389e319;

    /* renamed from: emptyAudioTrack */
    private boolean f49023xa7794042;

    /* renamed from: image */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 f49024x5faa95b;

    public C25905x21cef980(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this(c25859x590b0095, c25736x76b98a57, false);
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: imageAtTime */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98721x62e466db(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = this.f49028x46ebd80e;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        if (c25736x76b98a572.m97222xf922bec1(c25736x76b98a573)) {
            if (c25736x76b98a57.m97238x9f3f7b48(c25736x76b98a573) || c25736x76b98a57.m97222xf922bec1(this.f49028x46ebd80e)) {
                return null;
            }
        } else if (!this.f49029x2a055495.m97253x805f158c(c25736x76b98a57)) {
            return null;
        }
        if (this.f49024x5faa95b == null) {
            return null;
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 = this.f49022x8389e319.get(currentThread);
        if (c25859x590b0095 == null) {
            c25859x590b0095 = this.f49024x5faa95b.m98375xa9dffacb();
            this.f49022x8389e319.put(currentThread, c25859x590b0095);
        }
        c25859x590b0095.m98371x6761d4f();
        return c25859x590b0095;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: trackInfoForType */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca(int i17, int i18) {
        if (i17 == 1) {
            return m98726xca168b8c(i17, i18);
        }
        if (this.f49023xa7794042 && i17 == 2) {
            return m98726xca168b8c(i17, i18);
        }
        return null;
    }

    public C25905x21cef980(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        this.f49022x8389e319 = new java.util.HashMap<>();
        this.f49024x5faa95b = c25859x590b0095;
        this.f49027x89444d94 = c25736x76b98a57;
        this.f49029x2a055495 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25736x76b98a57);
        this.f49023xa7794042 = z17;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7
    /* renamed from: clone */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25905x21cef980 c25905x21cef980 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25905x21cef980(this.f49024x5faa95b, this.f49027x89444d94.m97224x5a5dd5d(), this.f49023xa7794042);
        c25905x21cef980.f49029x2a055495 = this.f49029x2a055495.m97252x5a5dd5d();
        c25905x21cef980.f49028x46ebd80e = this.f49028x46ebd80e.m97224x5a5dd5d();
        c25905x21cef980.f49022x8389e319 = this.f49022x8389e319;
        return c25905x21cef980;
    }
}
