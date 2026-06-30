package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa;

/* renamed from: com.tencent.tavkit.composition.TAVClip */
/* loaded from: classes16.dex */
public class C25874xcf526e79 implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e, java.lang.Cloneable {
    private final java.lang.String TAG;

    /* renamed from: audioConfiguration */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 f48936xe2df74c0;

    /* renamed from: extraTrackInfoMap */
    private java.util.HashMap<java.lang.String, java.lang.Object> f48937x37f15e33;

    /* renamed from: resource */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 f48938xebabc40e;

    /* renamed from: startTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48939x81158a4f;

    /* renamed from: transition */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be f48940x993b6d55;

    /* renamed from: videoConfiguration */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 f48941xd372f03b;

    public C25874xcf526e79() {
        this.TAG = "TAVClip@" + java.lang.Integer.toHexString(hashCode());
        this.f48937x37f15e33 = new java.util.HashMap<>();
        this.f48939x81158a4f = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f48936xe2df74c0 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429();
        this.f48941xd372f03b = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4();
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25894x218fb1ae
    /* renamed from: audioCompositionTrackForComposition */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 mo98539x300462b8(com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4 c25644x906c22c4, int i17, boolean z17) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca = this.f48938xebabc40e.mo98718x83bc0ca(2, i17);
        if (mo98718x83bc0ca == null) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f48939x81158a4f, mo98718x83bc0ca.m98733xf66d37e3());
        com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 m98841xed8ec251 = z17 ? com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.m98841xed8ec251(c25644x906c22c4, c25738xead39d26, 2) : null;
        if (m98841xed8ec251 == null && mo98718x83bc0ca.m98732x7f025288() != 0) {
            m98841xed8ec251 = c25644x906c22c4.m96205x7f69e3b2(mo98718x83bc0ca.m98732x7f025288(), 0);
        }
        if (m98841xed8ec251 != null) {
            com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.m98840x9cb107d9(mo98718x83bc0ca, m98841xed8ec251, c25738xead39d26);
        }
        return m98841xed8ec251;
    }

    /* renamed from: fitToSpeed */
    public void m98542x55185d3b(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        this.f48938xebabc40e.m98728xfd7a0d10(this.f48938xebabc40e.m98725xe67265f().m97256x51e8b0a().m97236x636d539(1.0f / f17));
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd
    /* renamed from: getAudioConfiguration */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 mo98543xf63bd6b6() {
        return this.f48936xe2df74c0;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e
    /* renamed from: getAudioTransition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 mo98544x1d246395() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be c25897x4bfa75be = this.f48940x993b6d55;
        if (c25897x4bfa75be != null) {
            return c25897x4bfa75be.m98686x1d246395();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98545x51e8b0a() {
        return this.f48938xebabc40e.m98724x3583a504();
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053
    /* renamed from: getExtraTrackInfo */
    public java.lang.Object mo98546xd59b175f(java.lang.String str) {
        return this.f48937x37f15e33.get(str);
    }

    /* renamed from: getResource */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 m98547x67860184() {
        return this.f48938xebabc40e;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f
    /* renamed from: getStartTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98548x8082fb99() {
        return this.f48939x81158a4f;
    }

    /* renamed from: getTargetTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98549x680d61a9() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f48939x81158a4f, mo98545x51e8b0a());
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f
    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 mo98550xdd1fba() {
        return m98549x680d61a9();
    }

    /* renamed from: getTransition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be m98551x877c254b() {
        return this.f48940x993b6d55;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72
    /* renamed from: getVideoConfiguration */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 mo98552xe6cf5231() {
        return this.f48941xd372f03b;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743
    /* renamed from: getVideoTransition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 mo98553xc6f811fa() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be c25897x4bfa75be = this.f48940x993b6d55;
        if (c25897x4bfa75be != null) {
            return c25897x4bfa75be.m98688xc6f811fa();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25894x218fb1ae
    /* renamed from: numberOfAudioTracks */
    public int mo98554x1af018de() {
        return this.f48938xebabc40e.mo98719x411739fb(2).size();
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053
    /* renamed from: numberOfVideoTracks */
    public int mo98555x3ebcc1c3() {
        return this.f48938xebabc40e.mo98719x411739fb(1).size();
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053
    /* renamed from: putExtraTrackInfo */
    public void mo98556xc4b1c358(java.lang.String str, java.lang.Object obj) {
        this.f48937x37f15e33.put(str, obj);
    }

    /* renamed from: setAudioConfiguration */
    public void m98557x8d6758c2(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 c25895x5a280429) {
        this.f48936xe2df74c0 = c25895x5a280429;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f
    /* renamed from: setDuration */
    public void mo98558xffd6ec16(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48938xebabc40e.m98728xfd7a0d10(c25736x76b98a57);
    }

    /* renamed from: setResource */
    public void m98559x623e6290(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 abstractC25907xa033d2b7) {
        this.f48938xebabc40e = abstractC25907xa033d2b7;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f
    /* renamed from: setStartTime */
    public void mo98560xdcd6bc0d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48939x81158a4f = c25736x76b98a57;
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 c25902x4abb7fa4 = this.f48941xd372f03b;
        if (c25902x4abb7fa4 != null) {
            c25902x4abb7fa4.m98710x494a67a7(mo98550xdd1fba());
        }
    }

    /* renamed from: setTransition */
    public void m98561xb5a07357(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be c25897x4bfa75be) {
        this.f48940x993b6d55 = c25897x4bfa75be;
    }

    /* renamed from: setVideoConfiguration */
    public void m98562x7dfad43d(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 c25902x4abb7fa4) {
        this.f48941xd372f03b = c25902x4abb7fa4;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053
    /* renamed from: sourceImageAtTime */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98563xbca917c0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        return this.f48938xebabc40e.mo98721x62e466db(c25736x76b98a57, c25732x76648a85);
    }

    /* renamed from: toString */
    public java.lang.String m98564x9616526c() {
        return "TAVClip{resource=" + this.f48938xebabc40e + ", videoConfiguration=" + this.f48941xd372f03b + ", startTime=" + this.f48939x81158a4f + ", transition=" + this.f48940x993b6d55 + ", extraTrackInfoMap=" + this.f48937x37f15e33 + '}';
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053
    /* renamed from: videoCompositionTrackForComposition */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 mo98565xa18dec9d(com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4 c25644x906c22c4, int i17, boolean z17) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca = this.f48938xebabc40e.mo98718x83bc0ca(1, i17);
        if (mo98718x83bc0ca == null) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f48939x81158a4f, mo98718x83bc0ca.m98733xf66d37e3());
        com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 m98841xed8ec251 = z17 ? com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.m98841xed8ec251(c25644x906c22c4, c25738xead39d26, 1) : null;
        if (m98841xed8ec251 == null && mo98718x83bc0ca.m98732x7f025288() != 0) {
            m98841xed8ec251 = c25644x906c22c4.m96205x7f69e3b2(mo98718x83bc0ca.m98732x7f025288(), -1);
        }
        if (m98841xed8ec251 != null) {
            com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.m98840x9cb107d9(mo98718x83bc0ca, m98841xed8ec251, c25738xead39d26);
        }
        return m98841xed8ec251;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 m98541x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79();
        c25874xcf526e79.f48938xebabc40e = this.f48938xebabc40e.mo98716x5a5dd5d();
        c25874xcf526e79.f48941xd372f03b = this.f48941xd372f03b.m98697x5a5dd5d();
        c25874xcf526e79.f48936xe2df74c0 = this.f48936xe2df74c0.m98666x5a5dd5d();
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25897x4bfa75be c25897x4bfa75be = this.f48940x993b6d55;
        if (c25897x4bfa75be != null) {
            c25874xcf526e79.f48940x993b6d55 = c25897x4bfa75be;
        }
        c25874xcf526e79.f48937x37f15e33 = new java.util.HashMap<>(this.f48937x37f15e33);
        return c25874xcf526e79;
    }

    public C25874xcf526e79(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 abstractC25907xa033d2b7) {
        this();
        this.f48938xebabc40e = abstractC25907xa033d2b7;
    }

    public C25874xcf526e79(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2(abstractC25633x3c9fad0));
    }

    public C25874xcf526e79(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25905x21cef980(c25859x590b0095, c25736x76b98a57));
    }

    public C25874xcf526e79(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this(c25736x76b98a57, false);
    }

    public C25874xcf526e79(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        this(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(c25736x76b98a57, z17));
    }
}
