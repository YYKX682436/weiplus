package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b;

/* renamed from: com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction */
/* loaded from: classes16.dex */
public class C25917xe9e06e75 implements com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec {

    /* renamed from: imageSource */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 f49058x81644d56;

    /* renamed from: preferredTransform */
    private android.graphics.Matrix f49059x5880ffeb;

    /* renamed from: timeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f49060x16fae70;

    /* renamed from: trackID */
    private int f49061xc060d3a6;

    /* renamed from: transition */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 f49062x993b6d55;

    /* renamed from: videoConfiguration */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 f49063xd372f03b;

    public C25917xe9e06e75(int i17, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 c25902x4abb7fa4, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 interfaceC25901x3c3e4053) {
        this.f49061xc060d3a6 = i17;
        this.f49063xd372f03b = c25902x4abb7fa4;
        this.f49058x81644d56 = interfaceC25901x3c3e4053;
        this.f49059x5880ffeb = new android.graphics.Matrix();
    }

    /* renamed from: applySourceImage */
    public android.graphics.Bitmap m98785x38ae7db2(android.graphics.Bitmap bitmap, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getCropRectangleRampForTime */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.CropRectangleRamp mo96944x19c4e1fb(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return null;
    }

    /* renamed from: getImageSource */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 m98786x5b3a9420() {
        return this.f49058x81644d56;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getOpacityRampForTime */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.OpacityRamp mo96945x3ae3e7af(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return null;
    }

    /* renamed from: getPreferredTransform */
    public android.graphics.Matrix m98787x6bdd61e1() {
        return this.f49059x5880ffeb;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98788xdd1fba() {
        return this.f49060x16fae70;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getTrackID */
    public int mo96946xfe2e0f70() {
        return this.f49061xc060d3a6;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec
    /* renamed from: getTransformRampForTime */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.InterfaceC25708x5f378eec.TransformRamp mo96947xfae6982e(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        return null;
    }

    /* renamed from: getTransition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 m98789x877c254b() {
        return this.f49062x993b6d55;
    }

    /* renamed from: getVideoConfiguration */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 m98790xe6cf5231() {
        return this.f49063xd372f03b;
    }

    /* renamed from: setPreferredTransform */
    public void m98791x308e3ed(android.graphics.Matrix matrix) {
        this.f49059x5880ffeb = matrix;
    }

    /* renamed from: setTimeRange */
    public void m98792x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f49060x16fae70 = c25738xead39d26;
    }

    /* renamed from: setTrackID */
    public void m98793x719f5ce4(int i17) {
        this.f49061xc060d3a6 = i17;
    }

    /* renamed from: setTransition */
    public void m98794xb5a07357(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 interfaceC25920x69291167) {
        this.f49062x993b6d55 = interfaceC25920x69291167;
    }

    /* renamed from: toString */
    public java.lang.String m98795x9616526c() {
        return "TAVVideoCompositionLayerInstruction{trackID=" + this.f49061xc060d3a6 + ", timeRange=" + this.f49060x16fae70.m97266x7af9727e() + ", preferredTransform=" + this.f49059x5880ffeb + ", imageSource=" + this.f49058x81644d56 + ", transition=" + this.f49062x993b6d55 + ", videoConfiguration=" + this.f49063xd372f03b + '}';
    }

    public C25917xe9e06e75(int i17, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743 interfaceC25899x6103f743) {
        this(i17, interfaceC25899x6103f743.mo98552xe6cf5231(), interfaceC25899x6103f743);
        m98792x5d30e02e(interfaceC25899x6103f743.mo98550xdd1fba());
        m98794xb5a07357(interfaceC25899x6103f743.mo98553xc6f811fa());
    }
}
