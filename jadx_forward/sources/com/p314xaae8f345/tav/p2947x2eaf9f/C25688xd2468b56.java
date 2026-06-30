package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.VideoCompositionDecoderTrack */
/* loaded from: classes16.dex */
public class C25688xd2468b56 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 {
    private static final java.lang.String TAG = "VideoComDecoderTrack";

    /* renamed from: WAIT_TIME */
    private static final int f47546x6dce1b57 = 200;

    /* renamed from: assetExtension */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f f47547xf1239f2f;

    /* renamed from: assetTrackList */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> f47548x4122fb79;

    /* renamed from: asynced */
    private boolean f47549xd656601b;

    /* renamed from: decodeReporter */
    private final com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b f47550xb3470cef;

    /* renamed from: decoderFactory */
    private com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf f47551x2d4a8826;

    /* renamed from: decoderTrackList */
    private java.util.List<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> f47552x7f6278a5;

    /* renamed from: frameDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47553xef5b9e21;

    /* renamed from: frameRate */
    private int f47554x207cebed;

    /* renamed from: isEnableOptimizedFrameSampling */
    private final boolean f47555x9a513a3a;

    /* renamed from: lastSampleState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f47556x8ad81491;

    /* renamed from: logger */
    private com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f47557xbe97f590;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a f47558x399b739;

    /* renamed from: trackId */
    private int f47559xc060d3c6;

    /* renamed from: videoCompositing */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 f47560xaffe9209;

    /* renamed from: videoComposition */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f f47561xaffe922f;

    public C25688xd2468b56(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f, int i17) {
        this(c25657xb56a6b4f, i17, null, false);
    }

    /* renamed from: createVideoCompositionRequest */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 m96798xac53d0c4(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8 = new com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8(this, this.f47547xf1239f2f);
        c25699x9dbd9fd8.m96904x53cfd9f7(this.f47558x399b739);
        c25699x9dbd9fd8.m96903x5a0e56d5(c25736x76b98a57);
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = this.f47561xaffe922f;
        if (c25706x7dc2d64f != null) {
            c25699x9dbd9fd8.m96905xc33d9d1d(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f.m96958x64780115(c25706x7dc2d64f, c25736x76b98a57));
        }
        return c25699x9dbd9fd8;
    }

    /* renamed from: getSampleFromRequest */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96799x6beacac5(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        synchronized (this) {
            if (c25699x9dbd9fd8.m96901x2fe4f2e8() == Integer.MIN_VALUE) {
                m96802x6bdbc14e(200);
            }
        }
        if (c25699x9dbd9fd8.m96901x2fe4f2e8() == 0) {
            this.f47556x8ad81491 = c25699x9dbd9fd8.m96897xd1ba5532().m97193x75286adb();
            return c25699x9dbd9fd8.m96897xd1ba5532();
        }
        this.f47556x8ad81491 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "readSample: failed 1 " + this.f47556x8ad81491);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L));
    }

    /* renamed from: isAnySegmentHasSpeedChanging */
    private boolean m96800xea2693eb() {
        java.util.Iterator<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> it = this.f47548x4122fb79.iterator();
        while (it.hasNext()) {
            for (com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258 : it.next().mo96159xbac98516()) {
                if (java.lang.Math.abs((c25635x5b7fe258.m96173x35b5540b().m97241x30959487().m97256x51e8b0a().m97231x793685bc() / c25635x5b7fe258.m96173x35b5540b().m97240x2fa78b11().m97256x51e8b0a().m97231x793685bc()) - 1.0d) > 0.01d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: readSampleToRequest */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96801xfa87f494(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 c25699x9dbd9fd8) {
        for (com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 : this.f47552x7f6278a5) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0 = interfaceC25767xc9028e50.mo96660xe121b2e0(c25736x76b98a57);
            if (mo96660xe121b2e0.m97193x75286adb().m97214x36f88ac9(-3, -2, -100)) {
                this.f47556x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(mo96660xe121b2e0.m97195xfb85bb43());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "readSample: failed 0 " + mo96660xe121b2e0.m97195xfb85bb43());
                return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(mo96660xe121b2e0.m97193x75286adb(), (com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049) null);
            }
            if (!mo96660xe121b2e0.m97193x75286adb().m97214x36f88ac9(-1)) {
                c25699x9dbd9fd8.m96892x6616f5ae(mo96660xe121b2e0, interfaceC25767xc9028e50.mo96657xfe2e0f90());
            } else if (this.f47552x7f6278a5.size() <= 1) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "readSample: finish 1");
                return mo96660xe121b2e0;
            }
        }
        return null;
    }

    /* renamed from: waitForRequestFinish */
    private void m96802x6bdbc14e(int i17) {
        synchronized (this) {
            try {
                wait(i17);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: addTrack */
    public synchronized void m96803xb5bac52a(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f47548x4122fb79.add(c25634xf527485b);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: asyncReadNextSample */
    public void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f47549xd656601b) {
            java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> it = this.f47552x7f6278a5.iterator();
            while (it.hasNext()) {
                it.next().mo96649xb8b7224f(c25736x76b98a57);
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: clipRangeAndClearRange */
    public void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> it = this.f47552x7f6278a5.iterator();
        while (it.hasNext()) {
            it.next().mo96650x5b0b7d5a(c25738xead39d26);
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getCurrentSampleTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a() {
        return this.f47556x8ad81491.m97208xfb85bb43();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac() {
        return this.f47550xb3470cef;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> it = this.f47552x7f6278a5.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a = it.next().mo96653x51e8b0a();
            if (mo96653x51e8b0a.m97222xf922bec1(c25736x76b98a57)) {
                c25736x76b98a57 = mo96653x51e8b0a;
            }
        }
        return c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b() {
        return this.f47553xef5b9e21;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameRate */
    public int mo96655x1fea5d37() {
        return this.f47554x207cebed;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getLaggingTime */
    public long mo96656x213de1e4() {
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> it = this.f47552x7f6278a5.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += it.next().mo96656x213de1e4();
        }
        return j17;
    }

    /* renamed from: getRenderContext */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a m96804xc0f97383() {
        return this.f47558x399b739;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getTrackId */
    public int mo96657xfe2e0f90() {
        return this.f47559xc060d3c6;
    }

    /* renamed from: getVideoCompositing */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 m96805x57d6f97f() {
        return this.f47560xaffe9209;
    }

    /* renamed from: getVideoComposition */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m96806x57d6f9a5() {
        return this.f47561xaffe922f;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0() {
        if (!this.f47556x8ad81491.m97214x36f88ac9(-100) && !this.f47556x8ad81491.m97210x5241396d()) {
            return mo96660xe121b2e0(this.f47556x8ad81491.m97208xfb85bb43().add(this.f47553xef5b9e21));
        }
        return mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: release */
    public void mo96661x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release:start " + this);
        for (com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 : this.f47552x7f6278a5) {
            interfaceC25767xc9028e50.mo96661x41012807();
            this.f47550xb3470cef.add(interfaceC25767xc9028e50.mo96652xc291ccac());
        }
        this.f47552x7f6278a5.clear();
        this.f47548x4122fb79.clear();
        this.f47561xaffe922f = null;
        this.f47560xaffe9209 = null;
        this.f47558x399b739 = null;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release:finish " + this);
    }

    /* renamed from: removeTrack */
    public synchronized void m96807xede4bb27(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f47548x4122fb79.remove(c25634xf527485b);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: seekTo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "seekTo:[timeUs " + c25736x76b98a57 + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        if (!c25736x76b98a57.m97228xb2c87fbf(this.f47556x8ad81491.m97208xfb85bb43())) {
            java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> it = this.f47552x7f6278a5.iterator();
            while (it.hasNext()) {
                it.next().mo96663xc9fc1b13(c25736x76b98a57, false, z18);
            }
        }
        if (c25736x76b98a57.m97222xf922bec1(this.f47553xef5b9e21)) {
            this.f47556x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57.sub(this.f47553xef5b9e21));
        } else {
            this.f47556x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
        }
        if (z17) {
            return mo96659xe121b2e0();
        }
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setDecodeType */
    public void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType) {
    }

    /* renamed from: setFrameDuration */
    public void m96808x3f91c0df(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f47553xef5b9e21 = c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setFrameRate */
    public void mo96667x7c3e1dab(int i17) {
        this.f47554x207cebed = i17;
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> it = this.f47552x7f6278a5.iterator();
        while (it.hasNext()) {
            it.next().mo96667x7c3e1dab(i17);
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setLogger */
    public void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
        this.f47557xbe97f590 = c25799x4a77fd1;
    }

    /* renamed from: setRenderContext */
    public void m96809x53cfd9f7(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a c25702xbab3092a) {
        this.f47558x399b739 = c25702xbab3092a;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setTrackSegments */
    public void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list) {
    }

    /* renamed from: setVideoCompositing */
    public void m96810xfbd38e8b(com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.InterfaceC25701x7dc2d629 interfaceC25701x7dc2d629) {
        this.f47560xaffe9209 = interfaceC25701x7dc2d629;
    }

    /* renamed from: setVideoComposition */
    public void m96811xfbd38eb1(com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f) {
        this.f47561xaffe922f = c25706x7dc2d64f;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setVolume */
    public void mo96671x27f73e1c(float f17) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96672x68ac462() {
        mo96673x68ac462(null);
    }

    public C25688xd2468b56(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f c25657xb56a6b4f, int i17, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf, boolean z17) {
        this.f47552x7f6278a5 = new java.util.ArrayList();
        this.f47548x4122fb79 = new java.util.ArrayList();
        this.f47549xd656601b = true;
        this.f47554x207cebed = 30;
        this.f47553xef5b9e21 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30);
        this.f47556x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();
        this.f47550xb3470cef = new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b();
        this.f47557xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.f47547xf1239f2f = c25657xb56a6b4f;
        this.f47559xc060d3c6 = i17;
        this.f47551x2d4a8826 = interfaceC25650x9122a0cf;
        this.f47555x9a513a3a = z17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        mo96674x68ac462(surfaceCreator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762 c25784x4902762;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "start:[start] " + c25738xead39d26 + " size - " + this.f47548x4122fb79.size());
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a c25702xbab3092a = new com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25702xbab3092a((com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719) surfaceCreator);
        this.f47558x399b739 = c25702xbab3092a;
        c25702xbab3092a.m96921xfbd38eb1(this.f47561xaffe922f);
        boolean m96800xea2693eb = m96800xea2693eb();
        boolean z17 = this.f47555x9a513a3a && !m96800xea2693eb;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "useOFSVideoDecoderTrack: " + z17 + " enableOptimizedFrameSampling:" + this.f47555x9a513a3a + " hasSpeedChanging:" + m96800xea2693eb);
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b : this.f47548x4122fb79) {
            if (c25634xf527485b.m96152x7f025288() == 1) {
                if (z17) {
                    com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55 c25812x7903ec55 = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25812x7903ec55(c25634xf527485b, this.f47551x2d4a8826);
                    c25812x7903ec55.m97932xfbd38eb1(this.f47561xaffe922f);
                    c25812x7903ec55.mo96667x7c3e1dab(this.f47554x207cebed);
                    c25784x4902762 = c25812x7903ec55;
                } else {
                    com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762 c25784x49027622 = new com.p314xaae8f345.tav.p2959x5befac44.C25784x4902762(c25634xf527485b, this.f47551x2d4a8826);
                    c25784x49027622.m97733xfbd38eb1(this.f47561xaffe922f);
                    c25784x4902762 = c25784x49027622;
                }
                c25784x4902762.mo96668x16e44c92(this.f47557xbe97f590);
                this.f47552x7f6278a5.add(c25784x4902762);
                if (c25738xead39d26 != null) {
                    c25784x4902762.mo96674x68ac462(surfaceCreator, c25738xead39d26);
                } else {
                    com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96161xdd1fba = c25634xf527485b.m96161xdd1fba();
                    c25784x4902762.mo96674x68ac462(surfaceCreator, m96161xdd1fba == null ? null : new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m96161xdd1fba.m97260x75286aac(), m96161xdd1fba.m97256x51e8b0a()));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample:[targetTime " + c25736x76b98a57 + "]" + this.f47560xaffe9209);
        if (this.f47560xaffe9209 == null) {
            this.f47556x8ad81491 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: failed 2 " + this.f47556x8ad81491);
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L));
        }
        if (c25736x76b98a57.m97233x754a37bb() < 0) {
            c25736x76b98a57 = this.f47556x8ad81491.m97208xfb85bb43().add(this.f47553xef5b9e21);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2949xcdff0984.C25699x9dbd9fd8 m96798xac53d0c4 = m96798xac53d0c4(c25736x76b98a57);
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96801xfa87f494 = m96801xfa87f494(c25736x76b98a57, m96798xac53d0c4);
        if (m96801xfa87f494 != null) {
            return m96801xfa87f494;
        }
        if (m96798xac53d0c4.m96900xe90befbe().size() == 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: finish 2");
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: startVideoCompositionRequest ");
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.RENDER);
        c25733xc7e62966.m97184xc75a0595();
        this.f47560xaffe9209.mo96826xbab63a9e(m96798xac53d0c4);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: startVideoCompositionRequest finish ");
        android.opengl.GLES20.glFlush();
        c25733xc7e62966.m97183x32057ace();
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96799x6beacac5 = m96799x6beacac5(m96798xac53d0c4);
        java.util.Iterator<java.lang.Integer> it = m96798xac53d0c4.m96900xe90befbe().iterator();
        while (it.hasNext()) {
            c25733xc7e62966.f47836xb1e29dce.add(m96798xac53d0c4.m96906xcc32495d(it.next().intValue()).m97193x75286adb().f47857xa7c31030);
        }
        m96799x6beacac5.m97193x75286adb().f47857xa7c31030 = c25733xc7e62966;
        return m96799x6beacac5;
    }
}
