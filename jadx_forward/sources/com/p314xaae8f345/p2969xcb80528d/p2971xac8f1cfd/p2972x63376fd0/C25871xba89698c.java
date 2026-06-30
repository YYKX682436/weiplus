package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0;

/* renamed from: com.tencent.tavkit.component.effectchain.TAVVideoEffectContext */
/* loaded from: classes16.dex */
public class C25871xba89698c implements com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.InterfaceC25870x569a764c {

    /* renamed from: sourceVideoEffectProxy */
    protected final com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002 f48922x409f121d = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002();

    /* renamed from: videoMixEffectProxy */
    protected final com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c f48923x7bc10bc = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c();

    /* renamed from: globalVideoEffectProxy */
    protected final com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002 f48921x2f9f9da5 = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002();

    /* renamed from: addGlobalFilter */
    public void m98507x3da0183c(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f48921x2f9f9da5.m98515xd07db4cc().remove(interfaceC25918xca9d36a3);
    }

    /* renamed from: addSourceFilter */
    public void m98508xb41842b4(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f48922x409f121d.m98515xd07db4cc().remove(interfaceC25918xca9d36a3);
    }

    /* renamed from: addVideoMixFilter */
    public void m98509xa40e25ba(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb) {
        this.f48923x7bc10bc.m98528xd07db4cc().remove(interfaceC25919xc89aa8bb);
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.InterfaceC25870x569a764c
    /* renamed from: getGlobalVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 mo98504x859cc993() {
        return this.f48921x2f9f9da5;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.InterfaceC25870x569a764c
    /* renamed from: getSourceVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 mo98505xd2746a1b() {
        return this.f48922x409f121d;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.InterfaceC25870x569a764c
    /* renamed from: getVideoMixEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb mo98506x56fc9c8() {
        return this.f48923x7bc10bc;
    }

    /* renamed from: removeGlobalFilter */
    public void m98510x5ed1db9f(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f48921x2f9f9da5.m98515xd07db4cc().remove(interfaceC25918xca9d36a3);
        this.f48921x2f9f9da5.m98517x551d689d();
    }

    /* renamed from: removeSourceFilter */
    public void m98511xd54a0617(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f48922x409f121d.m98515xd07db4cc().remove(interfaceC25918xca9d36a3);
        this.f48922x409f121d.m98517x551d689d();
    }

    /* renamed from: removeVideoMixFilter */
    public void m98512x3fdc9c5d(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb) {
        this.f48923x7bc10bc.m98528xd07db4cc().remove(interfaceC25919xc89aa8bb);
        this.f48923x7bc10bc.m98530x551d689d();
    }
}
