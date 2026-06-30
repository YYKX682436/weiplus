package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tavkit.composition.builder.BuilderModel */
/* loaded from: classes16.dex */
public class C25887x114f86e {

    /* renamed from: tavComposition */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 f48976x756fbe41;

    /* renamed from: mainVideoTrackInfo */
    private final java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25890xc6e057a9>> f48974x6639ec77 = new java.util.ArrayList();

    /* renamed from: mainAudioTrackInfo */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25885x80237baa> f48973x60bf7b7c = new java.util.ArrayList();

    /* renamed from: overlayTrackInfo */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25892x978041c3> f48975x4f78e229 = new java.util.ArrayList();

    /* renamed from: audioTrackInfo */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25883xeb2f6494> f48972x38e2a163 = new java.util.ArrayList();

    public C25887x114f86e(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61) {
        this.f48976x756fbe41 = c25875x73210e61;
    }

    /* renamed from: addAudioTrackInfo */
    public void m98617xc436b864(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25883xeb2f6494 c25883xeb2f6494) {
        this.f48972x38e2a163.add(c25883xeb2f6494);
    }

    /* renamed from: addMainAudioTrackInfo */
    public void m98618x663e29fd(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25885x80237baa c25885x80237baa) {
        this.f48973x60bf7b7c.add(c25885x80237baa);
    }

    /* renamed from: addMainVideoTrackInfo */
    public void m98619x6bb89af8(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25890xc6e057a9> list) {
        this.f48974x6639ec77.add(list);
    }

    /* renamed from: addOverlayTrackInfo */
    public void m98620x56233cea(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25892x978041c3 c25892x978041c3) {
        this.f48975x4f78e229.add(c25892x978041c3);
    }

    /* renamed from: getAudioChannels */
    public java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e>> m98621x9f95aa10() {
        return this.f48976x756fbe41.m98569x9f95aa10();
    }

    /* renamed from: getAudioTrackInfo */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25883xeb2f6494> m98622x277a6e59() {
        return this.f48972x38e2a163;
    }

    /* renamed from: getBackgroundColor */
    public int m98623x3119c89f() {
        return this.f48976x756fbe41.m98571x3119c89f();
    }

    /* renamed from: getGlobalVideoEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 m98624x859cc993() {
        return this.f48976x756fbe41.m98574x859cc993();
    }

    /* renamed from: getMainAudioTrackInfo */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25885x80237baa> m98625x741bdd72() {
        return this.f48973x60bf7b7c;
    }

    /* renamed from: getMainVideoTrackInfo */
    public java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25890xc6e057a9>> m98626x79964e6d() {
        return this.f48974x6639ec77;
    }

    /* renamed from: getMixAudios */
    public java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25893x1ae335cd> m98627xfd62ae23() {
        return this.f48976x756fbe41.m98570x113d0253();
    }

    /* renamed from: getOverlayTrackInfo */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25892x978041c3> m98628xf751499f() {
        return this.f48975x4f78e229;
    }

    /* renamed from: getOverlays */
    public java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25900x1c05ae72> m98629x9b6e8399() {
        return this.f48976x756fbe41.m98575x9b6e8399();
    }

    /* renamed from: getRenderLayoutMode */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.RenderLayoutMode m98630xa8f30599() {
        return this.f48976x756fbe41.m98576xa8f30599();
    }

    /* renamed from: getRenderSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98631x356c92ad() {
        return this.f48976x756fbe41.m98577x356c92ad();
    }

    /* renamed from: getTavComposition */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 m98632x64078b37() {
        return this.f48976x756fbe41;
    }

    /* renamed from: getVideoChannels */
    public java.util.List<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743>> m98633x2dbadb5() {
        return this.f48976x756fbe41.m98579x2dbadb5();
    }

    /* renamed from: getVideoMixEffect */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb m98634x56fc9c8() {
        return this.f48976x756fbe41.m98580x56fc9c8();
    }
}
