package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa;

/* renamed from: com.tencent.tavkit.composition.TAVComposition */
/* loaded from: classes16.dex */
public class C25875x73210e61 {

    /* renamed from: audioChannels */
    private java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e>> f48942xe235edc6;

    /* renamed from: audios */
    private java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd> f48943xac25df5d;

    /* renamed from: backgroundColor */
    private int f48944x4cb7f6d5;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48945xef5b9e21;

    /* renamed from: globalVideoEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 f48946x32684249;

    /* renamed from: overlays */
    private java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72> f48947x1f944623;

    /* renamed from: renderLayoutMode */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode f48948x11a9e23;

    /* renamed from: renderSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48949x472bdab7;

    /* renamed from: sourceVideoEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 f48950x7f3fe2d1;

    /* renamed from: videoChannels */
    private java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743>> f48951x457bf16b;

    /* renamed from: videoMixEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb f48952x16d7fcd2;

    public C25875x73210e61(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79... c25874xcf526e79Arr) {
        this((java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79>) com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25927x2def4293.m98846x5c8469f0(c25874xcf526e79Arr));
    }

    /* renamed from: addAudioChannel */
    public void m98566x493d7f8e(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e> list) {
        if (this.f48942xe235edc6 == null) {
            this.f48942xe235edc6 = new java.util.ArrayList();
        }
        this.f48942xe235edc6.add(new java.util.ArrayList(list));
    }

    /* renamed from: addVideoChannel */
    public void m98567x9f05f349(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743> list) {
        if (this.f48951x457bf16b == null) {
            this.f48951x457bf16b = new java.util.ArrayList();
        }
        this.f48951x457bf16b.add(new java.util.ArrayList(list));
    }

    /* renamed from: attachVideoEffectChain */
    public void m98568x6b84109a(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.InterfaceC25870x569a764c interfaceC25870x569a764c) {
        this.f48950x7f3fe2d1 = interfaceC25870x569a764c.mo98505xd2746a1b();
        this.f48952x16d7fcd2 = interfaceC25870x569a764c.mo98506x56fc9c8();
        this.f48946x32684249 = interfaceC25870x569a764c.mo98504x859cc993();
    }

    /* renamed from: getAudioChannels */
    public java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e>> m98569x9f95aa10() {
        return this.f48942xe235edc6;
    }

    /* renamed from: getAudios */
    public java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd> m98570x113d0253() {
        return this.f48943xac25df5d;
    }

    /* renamed from: getBackgroundColor */
    public int m98571x3119c89f() {
        return this.f48944x4cb7f6d5;
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98572x51e8b0a() {
        java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743>> list = this.f48951x457bf16b;
        if (list == null) {
            return com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        }
        int size = list.size();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = c25736x76b98a57;
        for (int i17 = 0; i17 < size; i17++) {
            java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743> list2 = this.f48951x457bf16b.get(i17);
            if (list2 != null) {
                for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743 interfaceC25899x6103f743 : list2) {
                    if (interfaceC25899x6103f743 != null) {
                        c25736x76b98a572 = c25736x76b98a572.add(interfaceC25899x6103f743.mo98545x51e8b0a());
                    }
                }
                if (c25736x76b98a572.m97222xf922bec1(c25736x76b98a57)) {
                    c25736x76b98a57 = c25736x76b98a572;
                }
                c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            }
        }
        return c25736x76b98a57;
    }

    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98573xacbb5a6b() {
        return this.f48945xef5b9e21;
    }

    /* renamed from: getGlobalVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 m98574x859cc993() {
        return this.f48946x32684249;
    }

    /* renamed from: getOverlays */
    public java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72> m98575x9b6e8399() {
        return this.f48947x1f944623;
    }

    /* renamed from: getRenderLayoutMode */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode m98576xa8f30599() {
        return this.f48948x11a9e23;
    }

    /* renamed from: getRenderSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98577x356c92ad() {
        return this.f48949x472bdab7;
    }

    /* renamed from: getSourceVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 m98578xd2746a1b() {
        return this.f48950x7f3fe2d1;
    }

    /* renamed from: getVideoChannels */
    public java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743>> m98579x2dbadb5() {
        return this.f48951x457bf16b;
    }

    /* renamed from: getVideoMixEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb m98580x56fc9c8() {
        return this.f48952x16d7fcd2;
    }

    /* renamed from: setAudioChannels */
    public void m98581x326c1084(java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e>> list) {
        this.f48942xe235edc6 = list;
    }

    /* renamed from: setAudios */
    public void m98582x472365f(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd> list) {
        this.f48943xac25df5d = list;
    }

    /* renamed from: setBackgroundColor */
    public void m98583x67f06213(int i17) {
        this.f48944x4cb7f6d5 = i17;
    }

    /* renamed from: setFrameDuration */
    public void m98584x3f91c0df(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48945xef5b9e21 = c25736x76b98a57;
    }

    /* renamed from: setGlobalVideoEffect */
    public void m98585x6132d607(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f48946x32684249 = interfaceC25918xca9d36a3;
    }

    /* renamed from: setOverlays */
    public void m98586x9626e4a5(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72> list) {
        this.f48947x1f944623 = list;
    }

    /* renamed from: setRenderLayoutMode */
    public void m98587x4cef9aa5(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode renderLayoutMode) {
        this.f48948x11a9e23 = renderLayoutMode;
    }

    /* renamed from: setRenderSize */
    public void m98588x6390e0b9(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        this.f48949x472bdab7 = c25732x76648a85;
    }

    /* renamed from: setSourceVideoEffect */
    public void m98589xae0a768f(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f48950x7f3fe2d1 = interfaceC25918xca9d36a3;
    }

    /* renamed from: setVideoChannels */
    public void m98590x95b21429(java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743>> list) {
        this.f48951x457bf16b = list;
    }

    /* renamed from: setVideoMixEffect */
    public void m98591xcd6631d4(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb) {
        this.f48952x16d7fcd2 = interfaceC25919xc89aa8bb;
    }

    /* renamed from: toString */
    public java.lang.String m98592x9616526c() {
        return "TAVComposition{\nrenderSize=" + this.f48949x472bdab7 + ", renderLayoutMode=" + this.f48948x11a9e23 + ", backgroundColor=" + this.f48944x4cb7f6d5 + ", frameDuration=" + this.f48945xef5b9e21 + "\nvideoChannels=" + this.f48951x457bf16b + "\naudioChannels=" + this.f48942xe235edc6 + "\noverlays=" + this.f48947x1f944623 + "\naudios=" + this.f48943xac25df5d + '}';
    }

    public C25875x73210e61(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79> list) {
        this(list, list);
    }

    public C25875x73210e61(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743> list, java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e> list2) {
        this();
        m98567x9f05f349(list);
        m98566x493d7f8e(list2);
    }

    public C25875x73210e61() {
        this.f48951x457bf16b = new java.util.ArrayList();
        this.f48942xe235edc6 = new java.util.ArrayList();
        this.f48944x4cb7f6d5 = -16777216;
    }
}
