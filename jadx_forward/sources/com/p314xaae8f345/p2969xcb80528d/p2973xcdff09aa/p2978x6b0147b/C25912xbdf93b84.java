package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b;

/* renamed from: com.tencent.tavkit.composition.video.RenderInfo */
/* loaded from: classes10.dex */
public class C25912xbdf93b84 {

    /* renamed from: ciContext */
    private final com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669 f49038x8dc22269;

    /* renamed from: renderSize */
    private final com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f49039x472bdab7;

    /* renamed from: time */
    private final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49040x3652cd;

    /* renamed from: tracks */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053> f49041xcc663888 = new java.util.ArrayList();

    public C25912xbdf93b84(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669 c25858x90ea669) {
        this.f49040x3652cd = c25736x76b98a57;
        this.f49039x472bdab7 = c25732x76648a85;
        this.f49038x8dc22269 = c25858x90ea669;
    }

    /* renamed from: addTrack */
    public void m98748xb5bac52a(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 interfaceC25901x3c3e4053) {
        if (this.f49041xcc663888.contains(interfaceC25901x3c3e4053)) {
            return;
        }
        this.f49041xcc663888.add(interfaceC25901x3c3e4053);
    }

    /* renamed from: getCiContext */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669 m98749x8d2f93b3() {
        return this.f49038x8dc22269;
    }

    /* renamed from: getParam */
    public java.lang.Object m98750x74f5bed7(java.lang.String str) {
        com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m97631x29c21c7c = this.f49038x8dc22269.m98342xc0f97383().m97631x29c21c7c();
        if (m97631x29c21c7c != null) {
            return m97631x29c21c7c.m97646x74f5bed7(str);
        }
        return null;
    }

    /* renamed from: getRenderHeight */
    public int m98751x798d48d3() {
        return (int) this.f49039x472bdab7.f47832xb7389127;
    }

    /* renamed from: getRenderSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98752x356c92ad() {
        return this.f49039x472bdab7;
    }

    /* renamed from: getRenderWidth */
    public int m98753x785dd09a() {
        return (int) this.f49039x472bdab7.f47833x6be2dc6;
    }

    /* renamed from: getTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98754xfb85bb43() {
        return this.f49040x3652cd;
    }

    /* renamed from: getTrackExtraInfo */
    public java.lang.Object m98755x7f3724c9(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053> it = this.f49041xcc663888.iterator();
        while (it.hasNext()) {
            java.lang.Object mo98546xd59b175f = it.next().mo98546xd59b175f(str);
            if (mo98546xd59b175f != null) {
                return mo98546xd59b175f;
            }
        }
        return null;
    }

    /* renamed from: getTracks */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053> m98756x317d5b7e() {
        return this.f49041xcc663888;
    }

    /* renamed from: putParam */
    public void m98757x6a4406be(java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m97631x29c21c7c = this.f49038x8dc22269.m98342xc0f97383().m97631x29c21c7c();
        if (m97631x29c21c7c != null) {
            m97631x29c21c7c.m97647x6a4406be(str, obj);
        }
    }
}
