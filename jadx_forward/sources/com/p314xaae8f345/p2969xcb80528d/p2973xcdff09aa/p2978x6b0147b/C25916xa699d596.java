package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b;

/* renamed from: com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction */
/* loaded from: classes16.dex */
public class C25916xa699d596 extends com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf {
    private static final java.lang.String TAG = "TAVVideoCompositionInst";

    /* renamed from: channelLayers */
    private java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> f49052x48ac3025;

    /* renamed from: globalVideoEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 f49053x32684249;

    /* renamed from: overlayLayers */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> f49054xeee389b2;

    /* renamed from: sourceVideoEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 f49055x7f3fe2d1;

    /* renamed from: timeRange */
    private final com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f49056x16fae70;

    /* renamed from: videoMixEffect */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb f49057x16d7fcd2;

    public C25916xa699d596(java.util.List<java.lang.Integer> list, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47663x7fabd847 = list;
        this.f49056x16fae70 = c25738xead39d26;
        this.f47660x3800ec36 = false;
        this.f47659x4cb7f6d5 = -16777216;
        this.f49052x48ac3025 = new java.util.ArrayList();
        this.f49054xeee389b2 = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf, com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6
    /* renamed from: getBackgroundColor */
    public int mo96908x3119c89f() {
        return this.f47659x4cb7f6d5;
    }

    /* renamed from: getChannelLayers */
    public java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> m98772x60bec6f() {
        return this.f49052x48ac3025;
    }

    /* renamed from: getGlobalVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 m98773x859cc993() {
        return this.f49053x32684249;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf, com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6
    /* renamed from: getLayerInstructions */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> mo96909xd5a1e4e0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> it = this.f49052x48ac3025.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        arrayList.addAll(this.f49054xeee389b2);
        return arrayList;
    }

    /* renamed from: getOverlayLayers */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> m98774xac4345fc() {
        return this.f49054xeee389b2;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf, com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6
    /* renamed from: getPassthroughTrackID */
    public int mo96910x33cffd68() {
        return -1;
    }

    /* renamed from: getSourceVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 m98775xd2746a1b() {
        return this.f49055x7f3fe2d1;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25707xa7006bf, com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25700xb60b20d6
    /* renamed from: getTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 mo96912xdd1fba() {
        return this.f49056x16fae70;
    }

    /* renamed from: getVideoMixEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb m98776x56fc9c8() {
        return this.f49057x16d7fcd2;
    }

    /* renamed from: setBackgroundColor */
    public void m98777x67f06213(int i17) {
        this.f47659x4cb7f6d5 = i17;
    }

    /* renamed from: setChannelLayers */
    public void m98778x98e252e3(java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> list) {
        if (list == null) {
            return;
        }
        this.f49052x48ac3025 = list;
    }

    /* renamed from: setEnablePostProcessing */
    public void m98779x601fd7b8(boolean z17) {
        this.f47660x3800ec36 = z17;
    }

    /* renamed from: setGlobalVideoEffect */
    public void m98780x6132d607(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f49053x32684249 = interfaceC25918xca9d36a3;
    }

    /* renamed from: setOverlayLayers */
    public void m98781x3f19ac70(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list) {
        if (list == null) {
            return;
        }
        this.f49054xeee389b2 = list;
        this.f47663x7fabd847.clear();
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> it = list.iterator();
        while (it.hasNext()) {
            this.f47663x7fabd847.add(java.lang.Integer.valueOf(it.next().mo96946xfe2e0f70()));
        }
    }

    /* renamed from: setSourceVideoEffect */
    public void m98782xae0a768f(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        this.f49055x7f3fe2d1 = interfaceC25918xca9d36a3;
    }

    /* renamed from: setVideoMixEffect */
    public void m98783xcd6631d4(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb) {
        this.f49057x16d7fcd2 = interfaceC25919xc89aa8bb;
    }

    /* renamed from: toString */
    public java.lang.String m98784x9616526c() {
        return "TAVVideoCompositionInstruction{timeRange=" + this.f49056x16fae70.m97266x7af9727e() + ", backgroundColor=" + this.f47659x4cb7f6d5 + ", overlayLayers=" + this.f49054xeee389b2 + '}';
    }
}
