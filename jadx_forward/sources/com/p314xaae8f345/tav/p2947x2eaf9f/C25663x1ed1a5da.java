package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetReaderAudioMixOutput */
/* loaded from: classes16.dex */
public class C25663x1ed1a5da extends com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 {
    public static final java.lang.String TAG = "AssetReaderAudioMixOutput";

    /* renamed from: audioCompositionDecoderTrack */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b f47337xebcfd97b;

    /* renamed from: audioSettings */
    private java.util.Map<java.lang.String, java.lang.Object> f47338xe2548619;

    /* renamed from: audioTracks */
    private java.util.ArrayList<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> f47339x1bee07fe;

    /* renamed from: decoderStarted */
    private boolean f47340xfd4a979d = false;

    public C25663x1ed1a5da(java.util.ArrayList<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> arrayList, java.util.Map<java.lang.String, java.lang.Object> map, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.f47339x1bee07fe = arrayList;
        this.f47338xe2548619 = map;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b(arrayList, 2, interfaceC25650x9122a0cf);
        this.f47337xebcfd97b = c25669xd1aeed9b;
        c25669xd1aeed9b.f47428xbe97f590 = this.f47342xbe97f590;
    }

    /* renamed from: getAudioSettings */
    public java.util.Map<java.lang.String, java.lang.Object> m96542x9fb44263() {
        return this.f47338xe2548619;
    }

    /* renamed from: getAudioTracks */
    public java.util.ArrayList<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> m96543xf5c44ec8() {
        return this.f47339x1bee07fe;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: markConfigurationAsFinal */
    public void mo96544xcf9728fb() {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: nextSampleBuffer */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96545x471e991d(boolean z17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0 = this.f47337xebcfd97b.mo96659xe121b2e0();
        return mo96659xe121b2e0.m97195xfb85bb43().m97238x9f3f7b48(this.f47346x16fae70.m97260x75286aac()) ? mo96659xe121b2e0 : mo96659xe121b2e0.m97195xfb85bb43().m97238x9f3f7b48(this.f47346x16fae70.m97258xb58839a5()) ? new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo96659xe121b2e0.m97195xfb85bb43().sub(this.f47346x16fae70.m97260x75286aac()), mo96659xe121b2e0.m97192x1d62828(), mo96659xe121b2e0.m97196x216ebaf7()) : new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: release */
    public void mo96546x41012807() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f47337xebcfd97b;
        if (c25669xd1aeed9b != null) {
            c25669xd1aeed9b.mo96661x41012807();
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: resetForReadingTimeRanges */
    public void mo96547x3bbb5dd5(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> list) {
    }

    /* renamed from: setAudioInfo */
    public void m96548x66f3cb62(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47337xebcfd97b.m96664x66f3cb62(c25756x82a4b984);
    }

    /* renamed from: setAudioMix */
    public void m96549xb0bd9928(com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f47337xebcfd97b;
        if (c25669xd1aeed9b != null) {
            c25669xd1aeed9b.m96665xb0bd9928(c25671x3e055ec6);
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: start */
    public void mo96550x68ac462(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 interfaceC25683x77c631c2, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        super.mo96550x68ac462(interfaceC25683x77c631c2, c25738xead39d26);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f47337xebcfd97b;
        if (c25669xd1aeed9b == null || this.f47340xfd4a979d) {
            return;
        }
        c25669xd1aeed9b.mo96673x68ac462(null);
        this.f47337xebcfd97b.mo96663xc9fc1b13(c25738xead39d26.m97260x75286aac(), false, true);
        this.f47340xfd4a979d = true;
    }
}
