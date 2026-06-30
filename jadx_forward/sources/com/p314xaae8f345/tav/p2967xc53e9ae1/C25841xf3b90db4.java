package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.PlayerItem */
/* loaded from: classes16.dex */
public class C25841xf3b90db4 {

    /* renamed from: asset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f48636x58ceaf0;

    /* renamed from: assetExtension */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f48637xf1239f2f;

    /* renamed from: audioCompositionDecoderTrack */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b f48638xebcfd97b;

    /* renamed from: audioMix */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 f48639x3a2afaa6;

    /* renamed from: audioTimePitchAlgorithm */
    java.lang.String f48640x2d6bbb2;

    /* renamed from: customVideoCompositor */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f48641x2a0f6f2b;

    /* renamed from: decoderFactory */
    com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f48642x2d4a8826;

    /* renamed from: decoderTrackList */
    private java.util.List<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> f48643x7f6278a5;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48644x89444d94;

    /* renamed from: enableLut */
    private boolean f48645xda597388;

    /* renamed from: errorMsg */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25833x57112479 f48646x5336c059;

    /* renamed from: forwardPlaybackEndTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48647x8e5ca28;

    /* renamed from: layer */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 f48648x61fd551;

    /* renamed from: lutBitmap */
    private android.graphics.Bitmap f48649x75b90d1a;

    /* renamed from: maxCacheSize */
    private int f48650x8a2abd9f;

    /* renamed from: outputs */
    java.util.List<com.p314xaae8f345.tav.p2967xc53e9ae1.C25842xf552fbd5> f48651xbe120792;

    /* renamed from: player */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 f48652xc53e9ae1;

    /* renamed from: playerThreadAudio */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25850x88403a2b f48653x9d7bfa4b;

    /* renamed from: playerThreadMain */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b f48654x707484a4;

    /* renamed from: presentationSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48655x5f89363b;

    /* renamed from: rate */
    private float f48656x354ce0;

    /* renamed from: realVDecoderTrack */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 f48657x258f99ff;

    /* renamed from: reversePlaybackEndTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48658x41a92c6b;

    /* renamed from: seekableTimeRanges */
    private java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> f48659x31854575;

    /* renamed from: seekingWaitsForVideoCompositionRendering */
    private boolean f48660x618527c8;

    /* renamed from: status */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4.PlayerItemStatus f48661xcacdcff2;

    /* renamed from: timedMetadata */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> f48662xd558bf86;

    /* renamed from: tracks */
    private java.util.List<com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7> f48663xcc663888;

    /* renamed from: vDecoderTrack */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 f48664xb60ab2fd;

    /* renamed from: videoApertureMode */
    int f48665xdb40496e;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f48666xaffe922f;

    /* renamed from: com.tencent.tav.player.PlayerItem$PlayerItemStatus */
    /* loaded from: classes6.dex */
    public enum PlayerItemStatus {
        PlayerItemStatusUnknown,
        PlayerItemStatusReadyToPlay,
        PlayerItemStatusFailed
    }

    public C25841xf3b90db4(java.lang.String str) {
        this(new com.p314xaae8f345.tav.p2945x58ceaf0.C25647xf4fd2ae1(str), null);
    }

    /* renamed from: getVideoFrameRate */
    private float m98101x21f69ea8() {
        return this.f48666xaffe922f != null ? (r0.mo96926xacbb5a6b().f47868x17e7e7d * 1.0f) / ((float) this.f48666xaffe922f.mo96926xacbb5a6b().m97233x754a37bb()) : com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25840x38b2c951.f48634xbd074a24.f47868x17e7e7d;
    }

    /* renamed from: initVideoCompositionDecoderTrack */
    private void m98102xa91cb866() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56 c25688xd2468b56 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25688xd2468b56(this.f48637xf1239f2f, 1, this.f48642x2d4a8826, false);
        int i17 = 24;
        for (com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7 c25843xdee463f7 : this.f48663xcc663888) {
            if (c25843xdee463f7 != null && c25843xdee463f7.m98161x7d80d2b7() && c25843xdee463f7.m98158x6c962431().m96152x7f025288() == 1) {
                c25688xd2468b56.m96803xb5bac52a(c25843xdee463f7.m98158x6c962431());
                i17 = (int) java.lang.Math.min(c25843xdee463f7.m98159x5563a5d5(), i17);
            }
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f48666xaffe922f;
        if (c25706x7dc2d64f != null && c25706x7dc2d64f.mo96926xacbb5a6b() != null) {
            i17 = (int) (this.f48666xaffe922f.mo96926xacbb5a6b().f47868x17e7e7d / this.f48666xaffe922f.mo96926xacbb5a6b().f47870x6ac9171);
        }
        if (i17 <= 0) {
            i17 = 30;
        }
        c25688xd2468b56.m96811xfbd38eb1(this.f48666xaffe922f);
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 interfaceC25701x7dc2d629 = this.f48641x2a0f6f2b;
        if (interfaceC25701x7dc2d629 != null) {
            c25688xd2468b56.m96810xfbd38e8b(interfaceC25701x7dc2d629);
        }
        c25688xd2468b56.mo96667x7c3e1dab(i17);
        c25688xd2468b56.m96808x3f91c0df(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, i17));
        this.f48657x258f99ff = c25688xd2468b56;
    }

    /* renamed from: addOutput */
    public void m98103xf948c102(com.p314xaae8f345.tav.p2967xc53e9ae1.C25842xf552fbd5 c25842xf552fbd5) {
        this.f48651xbe120792.add(c25842xf552fbd5);
    }

    /* renamed from: bindLayer */
    public void m98104xc77cdf14(com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 c25845x838a96d0) {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50;
        this.f48648x61fd551 = c25845x838a96d0;
        if (this.f48654x707484a4 == null) {
            return;
        }
        float f17 = this.f48656x354ce0;
        if (f17 < 0.0f) {
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25788x4e51e660 c25788x4e51e660 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25788x4e51e660(this.f48657x258f99ff, f17 < 0.0f);
            this.f48664xb60ab2fd = c25788x4e51e660;
            c25788x4e51e660.m97774x1e56f9f8(this.f48650x8a2abd9f);
            interfaceC25767xc9028e50 = this.f48664xb60ab2fd;
        } else {
            interfaceC25767xc9028e50 = this.f48657x258f99ff;
        }
        this.f48654x707484a4.m98229x6fcb91b0(interfaceC25767xc9028e50, c25845x838a96d0);
    }

    /* renamed from: cancelPendingSeeks */
    public void m98105xfeb893e() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48654x707484a4;
        if (c25849xfbce7c6b != null) {
            c25849xfbce7c6b.m98230xd00ad80b();
        }
    }

    /* renamed from: currentTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98106x23d61fe6() {
        return null;
    }

    /* renamed from: getAsset */
    public com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m98107x742a913a() {
        return this.f48636x58ceaf0;
    }

    /* renamed from: getAssetExtension */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f m98108xdfbb6c25() {
        return this.f48637xf1239f2f;
    }

    /* renamed from: getAudioCompositionDecoderTrack */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b m98109x37aabff1() {
        return this.f48638xebcfd97b;
    }

    /* renamed from: getAudioMix */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 m98110xb605381c() {
        return this.f48639x3a2afaa6;
    }

    /* renamed from: getAudioTimePitchAlgorithm */
    public java.lang.String m98111xd2d7237c() {
        return this.f48640x2d6bbb2;
    }

    /* renamed from: getCustomVideoCompositor */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 m98112x35bb4175() {
        return this.f48641x2a0f6f2b;
    }

    /* renamed from: getDecoderFactory */
    public com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf m98113x1be2551c() {
        return this.f48642x2d4a8826;
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98114x51e8b0a() {
        return this.f48644x89444d94;
    }

    /* renamed from: getErrorMsg */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25833x57112479 m98115xcf10fdcf() {
        return this.f48646x5336c059;
    }

    /* renamed from: getForwardPlaybackEndTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98116x72b4411e() {
        return this.f48647x8e5ca28;
    }

    /* renamed from: getLaggingTime */
    public long m98117x213de1e4() {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48657x258f99ff;
        if (interfaceC25767xc9028e50 != null) {
            return interfaceC25767xc9028e50.mo96656x213de1e4();
        }
        return 0L;
    }

    /* renamed from: getOutputs */
    public java.util.List<com.p314xaae8f345.tav.p2967xc53e9ae1.C25842xf552fbd5> m98118xfbdf435c() {
        return this.f48651xbe120792;
    }

    /* renamed from: getPlayerThreadAudio */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25850x88403a2b m98119xf0b08195() {
        return this.f48653x9d7bfa4b;
    }

    /* renamed from: getPlayerThreadMain */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b m98120x184cec1a() {
        return this.f48654x707484a4;
    }

    /* renamed from: getPresentationSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98121x7619db1() {
        return this.f48655x5f89363b == null ? this.f48636x58ceaf0.mo96120x47007694() : new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(16.0f, 16.0f);
    }

    /* renamed from: getRealDecoderTrack */
    public com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 m98122x8853f79b() {
        return this.f48657x258f99ff;
    }

    /* renamed from: getReversePlaybackEndTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98123xab77a361() {
        return this.f48658x41a92c6b;
    }

    /* renamed from: getSeekableTimeRanges */
    public java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> m98124x44e1a76b() {
        return this.f48659x31854575;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4.PlayerItemStatus m98125x2fe4f2e8() {
        return this.f48661xcacdcff2;
    }

    /* renamed from: getTimedMetadata */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m98126x92b87bd0() {
        return this.f48662xd558bf86;
    }

    /* renamed from: getTracks */
    public java.util.List<com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7> m98127x317d5b7e() {
        return this.f48663xcc663888;
    }

    /* renamed from: getVideoApertureMode */
    public int m98128x2e74d0b8() {
        return this.f48665xdb40496e;
    }

    /* renamed from: getVideoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m98129x57d6f9a5() {
        return this.f48666xaffe922f;
    }

    /* renamed from: initAudioCompositionDecoderTrack */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b m98130xa8851aab() {
        this.f48638xebcfd97b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b(2, this.f48642x2d4a8826);
        for (com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7 c25843xdee463f7 : this.f48663xcc663888) {
            if (c25843xdee463f7 != null && c25843xdee463f7.m98161x7d80d2b7() && c25843xdee463f7.m98158x6c962431().m96152x7f025288() == 2) {
                this.f48638xebcfd97b.m96648xb5bac52a(c25843xdee463f7.m98158x6c962431());
            }
        }
        this.f48638xebcfd97b.m96665xb0bd9928(this.f48639x3a2afaa6);
        return this.f48638xebcfd97b;
    }

    /* renamed from: isSeekingWaitsForVideoCompositionRendering */
    public boolean m98131xb23d2712() {
        return this.f48660x618527c8;
    }

    /* renamed from: release */
    public void m98132x41012807() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 c25845x838a96d0 = this.f48648x61fd551;
        if (c25845x838a96d0 != null) {
            c25845x838a96d0.m98175x41012807();
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6 = this.f48639x3a2afaa6;
        if (c25671x3e055ec6 != null) {
            c25671x3e055ec6.m96686x41012807();
        }
    }

    /* renamed from: removeOutput */
    public void m98133xc65d8aa5(com.p314xaae8f345.tav.p2967xc53e9ae1.C25842xf552fbd5 c25842xf552fbd5) {
        this.f48651xbe120792.remove(c25842xf552fbd5);
    }

    /* renamed from: seekToTime */
    public void m98135xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        m98134xe9aa2080(c25736x76b98a57, c25736x76b98a572, c25736x76b98a572, interfaceC25832xf9968465);
    }

    /* renamed from: setAudioMix */
    public void m98136xb0bd9928(com.p314xaae8f345.tav.p2947x2eaf9f.C25671x3e055ec6 c25671x3e055ec6) {
        this.f48639x3a2afaa6 = c25671x3e055ec6;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f48638xebcfd97b;
        if (c25669xd1aeed9b != null) {
            c25669xd1aeed9b.m96665xb0bd9928(c25671x3e055ec6);
        }
    }

    /* renamed from: setAudioTimePitchAlgorithm */
    public void m98137xe90708f0(java.lang.String str) {
        this.f48640x2d6bbb2 = str;
    }

    /* renamed from: setCustomVideoCompositor */
    public void m98138x5cdf3e9(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 interfaceC25701x7dc2d629) {
        this.f48641x2a0f6f2b = interfaceC25701x7dc2d629;
    }

    /* renamed from: setDecoderFactory */
    public void m98139xe3d8bd28(com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.f48642x2d4a8826 = interfaceC25650x9122a0cf;
    }

    /* renamed from: setEnableLut */
    public void m98140x361aa546(boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f48645xda597388 = false;
            return;
        }
        this.f48645xda597388 = z17;
        this.f48649x75b90d1a = bitmap;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48654x707484a4;
        if (c25849xfbce7c6b != null) {
            c25849xfbce7c6b.m98243x361aa546(z17, bitmap);
        }
    }

    /* renamed from: setForwardPlaybackEndTime */
    public void m98141xa4f7dd2a(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48647x8e5ca28 = c25736x76b98a57;
    }

    /* renamed from: setOutputs */
    public void m98142x6f5090d0(java.util.List<com.p314xaae8f345.tav.p2967xc53e9ae1.C25842xf552fbd5> list) {
        this.f48651xbe120792 = list;
    }

    /* renamed from: setRate */
    public void m98143x764f7c62(float f17, int i17) {
        this.f48656x354ce0 = f17;
        this.f48650x8a2abd9f = i17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48654x707484a4;
        if (c25849xfbce7c6b != null) {
            c25849xfbce7c6b.m98246x764f7c62(f17);
        }
    }

    /* renamed from: setReversePlaybackEndTime */
    public void m98144xddbb3f6d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48658x41a92c6b = c25736x76b98a57;
    }

    /* renamed from: setSeekableTimeRanges */
    public void m98145xdc0d2977(java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> list) {
        this.f48659x31854575 = list;
    }

    /* renamed from: setSeekingWaitsForVideoCompositionRendering */
    public void m98146x1dad3e4a(boolean z17) {
        this.f48660x618527c8 = z17;
    }

    /* renamed from: setVideoApertureMode */
    public void m98147xa0add2c(int i17) {
        this.f48665xdb40496e = i17;
    }

    /* renamed from: setVideoComposition */
    public void m98148xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f48666xaffe922f = c25706x7dc2d64f;
        if (c25706x7dc2d64f != null) {
            this.f48641x2a0f6f2b = c25706x7dc2d64f.mo96924x35bb4175();
        }
    }

    /* renamed from: start */
    public void m98149x68ac462(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701) {
        m98102xa91cb866();
        m98130xa8851aab();
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f48648x61fd551 == null ? null : this.f48664xb60ab2fd;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = this.f48638xebcfd97b;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98121x7619db1 = m98121x7619db1();
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 c25845x838a96d0 = this.f48648x61fd551;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b(interfaceC25767xc9028e50, c25669xd1aeed9b, m98121x7619db1, c25845x838a96d0 == null ? null : c25845x838a96d0.m98169xcf572877(), c25839x8ea38701.f48609x9e97c8a4, c25839x8ea38701);
        this.f48654x707484a4 = c25849xfbce7c6b;
        c25849xfbce7c6b.m98243x361aa546(this.f48645xda597388, this.f48649x75b90d1a);
        this.f48654x707484a4.m98246x764f7c62(this.f48656x354ce0);
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f48666xaffe922f;
        if (c25706x7dc2d64f != null) {
            this.f48654x707484a4.m98244x3f91c0df(c25706x7dc2d64f.mo96926xacbb5a6b());
        }
    }

    /* renamed from: updateComposition */
    public void m98150x8a105121(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this.f48636x58ceaf0 = abstractC25633x3c9fad0;
        this.f48663xcc663888.clear();
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : abstractC25633x3c9fad0.mo96129x317d5b7e()) {
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7 c25843xdee463f7 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7();
            c25843xdee463f7.m98162x9aba723d(c25634xf527485b);
            c25843xdee463f7.m98163x25765849(m98101x21f69ea8());
            c25843xdee463f7.m98164x514e147f(true);
            this.f48663xcc663888.add(c25843xdee463f7);
        }
    }

    /* renamed from: updateDecoderTrack */
    public void m98151x81f206d0() {
        m98102xa91cb866();
        m98130xa8851aab();
    }

    public C25841xf3b90db4(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this(abstractC25633x3c9fad0, new com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27));
    }

    /* renamed from: seekToTime */
    public void m98134xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48654x707484a4;
        if (c25849xfbce7c6b != null) {
            c25849xfbce7c6b.m98248x12b50238(c25736x76b98a57);
            this.f48654x707484a4.m98239x2936bf5f(5, c25736x76b98a57, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
        }
    }

    public C25841xf3b90db4(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f) {
        this.f48661xcacdcff2 = com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4.PlayerItemStatus.PlayerItemStatusUnknown;
        this.f48663xcc663888 = new java.util.ArrayList();
        this.f48656x354ce0 = 1.0f;
        this.f48648x61fd551 = null;
        this.f48650x8a2abd9f = 60;
        this.f48636x58ceaf0 = abstractC25633x3c9fad0;
        this.f48637xf1239f2f = c25657xb56a6b4f;
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : abstractC25633x3c9fad0.mo96129x317d5b7e()) {
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7 c25843xdee463f7 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25843xdee463f7();
            c25843xdee463f7.m98162x9aba723d(c25634xf527485b);
            c25843xdee463f7.m98163x25765849(m98101x21f69ea8());
            c25843xdee463f7.m98164x514e147f(true);
            this.f48663xcc663888.add(c25843xdee463f7);
        }
    }
}
