package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetReaderVideoCompositionOutput */
/* loaded from: classes16.dex */
public class C25665x97f6fa3 extends com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 {
    public static final java.lang.String TAG = "AssetReaderVideoCompositionOutput";

    /* renamed from: assetExtension */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f47347xf1239f2f;

    /* renamed from: contextCreate */
    private com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 f47348xdfe8838b;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f47350x2d4a8826;

    /* renamed from: enableOptimizedVideoFrameSampling */
    private boolean f47352xb3116dbd;

    /* renamed from: frameRate */
    private int f47353x207cebed;

    /* renamed from: videoCompositing */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f47356xaffe9209;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f47357xaffe922f;

    /* renamed from: videoDecoderTrack */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 f47358x19cbe782;

    /* renamed from: videoSettings */
    private java.util.Map<java.lang.String, java.lang.Object> f47359x459a89be;

    /* renamed from: videoTracks */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> f47360x3fbab0e3;

    /* renamed from: customVideoCompositor */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f47349x2a0f6f2b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25689xf38a6abc();

    /* renamed from: decoderStarted */
    private boolean f47351xfd4a979d = false;

    /* renamed from: readFirstFrame */
    private boolean f47354x2df5c6d3 = false;

    /* renamed from: revertMode */
    private boolean f47355xd16405a7 = false;

    public C25665x97f6fa3(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> list, java.util.Map<java.lang.String, java.lang.Object> map, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.f47353x207cebed = -1;
        this.f47360x3fbab0e3 = list;
        this.f47359x459a89be = map;
        this.f47347xf1239f2f = c25657xb56a6b4f;
        this.f47343x7f94e13e = 1;
        if (map != null && map.containsKey("frame-rate")) {
            this.f47353x207cebed = ((java.lang.Integer) map.get("frame-rate")).intValue();
        }
        this.f47350x2d4a8826 = interfaceC25650x9122a0cf;
    }

    /* renamed from: tryStartDecoder */
    private void m96562x65d582dd() {
        if (this.f47351xfd4a979d) {
            return;
        }
        this.f47351xfd4a979d = true;
        this.f47358x19cbe782.mo96667x7c3e1dab(this.f47353x207cebed);
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f47358x19cbe782;
        com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 interfaceC25683x77c631c2 = this.f47348xdfe8838b;
        interfaceC25767xc9028e50.mo96673x68ac462(interfaceC25683x77c631c2 == null ? null : interfaceC25683x77c631c2.mo96593x399b739());
        this.f47358x19cbe782.mo96663xc9fc1b13(this.f47346x16fae70.m97260x75286aac(), false, true);
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96554xc291ccac() {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f47358x19cbe782;
        if (interfaceC25767xc9028e50 != null) {
            return interfaceC25767xc9028e50.mo96652xc291ccac();
        }
        return null;
    }

    /* renamed from: getVideoCompositing */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 m96563x57d6f97f() {
        return this.f47356xaffe9209;
    }

    /* renamed from: getVideoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m96564x57d6f9a5() {
        return this.f47357xaffe922f;
    }

    /* renamed from: getVideoSettings */
    public java.util.Map<java.lang.String, java.lang.Object> m96565x2fa4608() {
        return this.f47359x459a89be;
    }

    /* renamed from: getVideoTracks */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> m96566x1990f7ad() {
        return this.f47360x3fbab0e3;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: markConfigurationAsFinal */
    public void mo96544xcf9728fb() {
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: nextSampleBuffer */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96545x471e991d(boolean z17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0;
        if (this.f47358x19cbe782 == null) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L));
        }
        m96562x65d582dd();
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f47358x19cbe782;
        if (interfaceC25767xc9028e50 == null) {
            mo96660xe121b2e0 = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-100L));
        } else if (this.f47354x2df5c6d3) {
            mo96660xe121b2e0 = interfaceC25767xc9028e50.mo96659xe121b2e0();
        } else {
            mo96660xe121b2e0 = interfaceC25767xc9028e50.mo96660xe121b2e0(this.f47346x16fae70.m97260x75286aac());
            this.f47354x2df5c6d3 = true;
        }
        if (mo96660xe121b2e0.m97195xfb85bb43().m97238x9f3f7b48(this.f47346x16fae70.m97260x75286aac())) {
            return mo96660xe121b2e0;
        }
        if (!mo96660xe121b2e0.m97195xfb85bb43().m97238x9f3f7b48(this.f47346x16fae70.m97258xb58839a5())) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        if (z17) {
            this.f47358x19cbe782.mo96649xb8b7224f(mo96660xe121b2e0.m97195xfb85bb43());
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo96660xe121b2e0.m97195xfb85bb43().sub(this.f47346x16fae70.m97260x75286aac()), mo96660xe121b2e0.m97194x3a00ef33(), mo96660xe121b2e0.m97196x216ebaf7());
        c25734xcdff9c14.m97193x75286adb().f47857xa7c31030 = mo96660xe121b2e0.m97193x75286adb().f47857xa7c31030;
        return c25734xcdff9c14;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: release */
    public synchronized void mo96546x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f47358x19cbe782;
        if (interfaceC25767xc9028e50 != null) {
            interfaceC25767xc9028e50.mo96661x41012807();
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 interfaceC25701x7dc2d629 = this.f47356xaffe9209;
        if (interfaceC25701x7dc2d629 != null) {
            interfaceC25701x7dc2d629.mo96822x41012807();
            this.f47356xaffe9209 = null;
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: reset */
    public void mo96558x6761d4f(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "reset %s", c25738xead39d26);
        this.f47346x16fae70 = c25738xead39d26;
        this.f47358x19cbe782.mo96663xc9fc1b13(c25738xead39d26.m97260x75286aac(), false, true);
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: resetForReadingTimeRanges */
    public void mo96547x3bbb5dd5(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> list) {
    }

    /* renamed from: setEnableOptimizedVideoFrameSampling */
    public void m96567x7668c57b(boolean z17) {
        this.f47352xb3116dbd = z17;
    }

    /* renamed from: setVideoCompositing */
    public void m96568xfbd38e8b(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 interfaceC25701x7dc2d629) {
        this.f47356xaffe9209 = interfaceC25701x7dc2d629;
    }

    /* renamed from: setVideoComposition */
    public void m96569xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f47357xaffe922f = c25706x7dc2d64f;
    }

    /* renamed from: setVideoRevertMode */
    public void m96570x35f743c0(boolean z17) {
        this.f47355xd16405a7 = z17;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694
    /* renamed from: start */
    public void mo96550x68ac462(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25683x77c631c2 interfaceC25683x77c631c2, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        super.mo96550x68ac462(interfaceC25683x77c631c2, c25738xead39d26);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56 c25688xd2468b56 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56(this.f47347xf1239f2f, 1, this.f47350x2d4a8826, this.f47352xb3116dbd);
        int i17 = this.f47353x207cebed;
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : this.f47360x3fbab0e3) {
            if (c25634xf527485b != null && c25634xf527485b.m96165x7d80d2b7()) {
                c25688xd2468b56.m96803xb5bac52a(c25634xf527485b);
                if (c25634xf527485b.m96155xe9bce1e7() > 0.0f && this.f47353x207cebed < 0) {
                    i17 = (int) java.lang.Math.min(c25634xf527485b.m96155xe9bce1e7(), i17);
                }
            }
        }
        if (i17 <= 0) {
            i17 = 30;
        }
        c25688xd2468b56.m96811xfbd38eb1(this.f47357xaffe922f);
        c25688xd2468b56.m96810xfbd38e8b(this.f47356xaffe9209);
        c25688xd2468b56.mo96667x7c3e1dab(i17);
        c25688xd2468b56.m96808x3f91c0df(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, i17));
        this.f47348xdfe8838b = interfaceC25683x77c631c2;
        if (this.f47355xd16405a7) {
            this.f47358x19cbe782 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25788x4e51e660(c25688xd2468b56, true);
        } else {
            this.f47358x19cbe782 = c25688xd2468b56;
        }
        this.f47358x19cbe782.mo96668x16e44c92(this.f47342xbe97f590);
    }
}
