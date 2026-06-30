package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b;

/* renamed from: com.tencent.tavkit.composition.builder.TAVCompositionBuilder */
/* loaded from: classes16.dex */
public class C25889x1381b9fa {
    private static final java.lang.String TAG = "TAVCompositionBuilder";

    /* renamed from: builderModel */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e f48981xf749a44e;

    /* renamed from: isVideoTracksMerge */
    private boolean f48984xb24d65f = true;

    /* renamed from: isAudioTracksMerge */
    private boolean f48982x7a82b824 = true;

    /* renamed from: isReloadChannels */
    private boolean f48983xf709e853 = true;

    public C25889x1381b9fa(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61) {
        this.f48981xf749a44e = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e(c25875x73210e61);
    }

    /* renamed from: buildAudioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6<? extends com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae> m98641x1be2d734() {
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.C25878xc5e94805> m98616x59bc66e = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25884x3b04a71f(this.f48981xf749a44e).m98616x59bc66e();
        if (m98616x59bc66e.size() == 0) {
            return null;
        }
        return new com.p314xaae8f345.tav.p2947x2eaf9f.C25686xa9807cc(m98616x59bc66e);
    }

    /* renamed from: buildComposition */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m98642xe12a3a5c() {
        if (this.f48983xf709e853) {
            m98644x505e6089();
        }
        return new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25888x9fce6b1(this.f48981xf749a44e, this.f48984xb24d65f, this.f48982x7a82b824).m98640x59bc66e();
    }

    /* renamed from: buildVideoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m98643xf81000bd() {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955 c25703x3f371955 = new com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955();
        c25703x3f371955.m96933x3f91c0df(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30));
        c25703x3f371955.m96937x6390e0b9(this.f48981xf749a44e.m98631x356c92ad());
        c25703x3f371955.m96935x4cef9aa5(this.f48981xf749a44e.m98630xa8f30599());
        c25703x3f371955.m96932xcd6dcf0f(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25915xfbc5e7b2.class);
        c25703x3f371955.m96934xc4603327(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25891x5eb985db(this.f48981xf749a44e).m98657x59bc66e());
        return c25703x3f371955;
    }

    /* renamed from: reloadChannels */
    private void m98644x505e6089() {
        java.util.Iterator<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743>> it = this.f48981xf749a44e.m98633x2dbadb5().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.m98844x85c25a19(it.next());
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "buildComposition: reloadVideoChannels = " + this.f48981xf749a44e.m98633x2dbadb5());
        java.util.Iterator<java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e>> it6 = this.f48981xf749a44e.m98621x9f95aa10().iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.m98842x4f513ccf(it6.next());
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "buildComposition: reloadAudioChannels = " + this.f48981xf749a44e.m98621x9f95aa10());
    }

    /* renamed from: buildSource */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 m98645x86121029() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "buildSource: begin, tavComposition = " + this.f48981xf749a44e.m98632x64078b37());
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 c25876x5fee0d04 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04();
        c25876x5fee0d04.m98596x52b8abae(m98642xe12a3a5c());
        c25876x5fee0d04.m98598xfbd38eb1(m98643xf81000bd());
        c25876x5fee0d04.m98597xb0bd9928(m98641x1be2d734());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "buildSource: end, return source = " + c25876x5fee0d04);
        return c25876x5fee0d04;
    }

    /* renamed from: setAudioTracksMerge */
    public void m98646x1c6ef75c(boolean z17) {
        this.f48982x7a82b824 = z17;
    }

    /* renamed from: setReloadChannels */
    public void m98647x6ec958b(boolean z17) {
        this.f48983xf709e853 = z17;
    }

    /* renamed from: setVideoTracksMerge */
    public void m98648xad111597(boolean z17) {
        this.f48984xb24d65f = z17;
    }
}
