package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e;

/* renamed from: com.tencent.tavkit.composition.resource.TAVResource */
/* loaded from: classes16.dex */
public abstract class AbstractC25907xa033d2b7 implements java.lang.Cloneable {

    /* renamed from: duration */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49027x89444d94;

    /* renamed from: scaledDuration */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49028x46ebd80e;

    /* renamed from: sourceTimeRange */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f49029x2a055495;

    public AbstractC25907xa033d2b7() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        this.f49027x89444d94 = c25736x76b98a57;
        this.f49029x2a055495 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a57);
        this.f49028x46ebd80e = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d();

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98723x51e8b0a() {
        return this.f49027x89444d94;
    }

    /* renamed from: getScaledDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98724x3583a504() {
        return this.f49028x46ebd80e.m97228xb2c87fbf(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0) ? this.f49029x2a055495.m97256x51e8b0a() : this.f49028x46ebd80e;
    }

    /* renamed from: getSourceTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98725xe67265f() {
        return this.f49029x2a055495;
    }

    /* renamed from: imageAtTime */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98721x62e466db(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        return null;
    }

    /* renamed from: newEmptyTrackInfo */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 m98726xca168b8c(int i17, int i18) {
        com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b = mo98719x411739fb(i17).get(i18);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 c25908xa2ed4c79 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79();
        c25908xa2ed4c79.m98739x53c3b209(c25634xf527485b);
        c25908xa2ed4c79.m98738xcbae2dd3(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30)));
        c25908xa2ed4c79.m98737x2d43d157(m98724x3583a504());
        return c25908xa2ed4c79;
    }

    /* renamed from: setDuration */
    public void m98727xffd6ec16(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f49027x89444d94 = c25736x76b98a57;
    }

    /* renamed from: setScaledDuration */
    public void m98728xfd7a0d10(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f49028x46ebd80e = c25736x76b98a57;
    }

    /* renamed from: setSourceTimeRange */
    public void m98729x453dbfd3(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f49029x2a055495 = c25738xead39d26.m97252x5a5dd5d();
    }

    /* renamed from: toString */
    public java.lang.String m98730x9616526c() {
        return "TAVResource{durationUs=" + this.f49027x89444d94.m97232x31040141() + ", sourceTimeRange=" + this.f49029x2a055495.m97266x7af9727e() + ", scaledDurationUs=" + this.f49028x46ebd80e.m97232x31040141() + '}';
    }

    /* renamed from: trackInfoForType */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 mo98718x83bc0ca(int i17, int i18) {
        return m98726xca168b8c(i17, i18);
    }

    /* renamed from: tracksForType */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> mo98719x411739fb(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 m96205x7f69e3b2 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4().m96205x7f69e3b2(i17, 0);
        m96205x7f69e3b2.m96229xdf07c6bc(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, this.f49027x89444d94));
        arrayList.add(m96205x7f69e3b2);
        return arrayList;
    }
}
