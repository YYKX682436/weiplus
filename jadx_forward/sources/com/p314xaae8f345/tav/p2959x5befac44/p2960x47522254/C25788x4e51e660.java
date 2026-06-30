package com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254;

/* renamed from: com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack */
/* loaded from: classes16.dex */
public class C25788x4e51e660 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 {
    private static final java.lang.String TAG = "CachedVideoTrack";

    /* renamed from: currentFrameSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 f48319x407c2d1f;

    /* renamed from: nextFrameSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 f48322x41a99399;

    /* renamed from: renderContext */
    com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48323x399b739;

    /* renamed from: revert */
    boolean f48324xc84ee9e4;

    /* renamed from: segmentDecoder */
    private com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25793x8e95b31b f48325xf5beb591;

    /* renamed from: validTimeRange */
    com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48327xb23179d4;

    /* renamed from: segmentSize */
    private int f48326xc73321d4 = 60;

    /* renamed from: nextFrameDecoderLock */
    final java.lang.Object f48321xe62474f5 = new java.lang.Object();

    /* renamed from: lastSampleState */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f48320x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d();

    public C25788x4e51e660(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50, boolean z17) {
        this.f48324xc84ee9e4 = z17;
        this.f48325xf5beb591 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25793x8e95b31b(this, interfaceC25767xc9028e50);
    }

    /* renamed from: clearCurrentFrameSegment */
    private void m97771x4b7ff992() {
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571 = this.f48319x407c2d1f;
        if (c25787xf70dc571 != null) {
            c25787xf70dc571.m97767x5a5b64d();
            this.f48319x407c2d1f = null;
        }
    }

    /* renamed from: decoderFrame */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97772xbb151789(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.f48325xf5beb591.m97801xe403f64f(c25736x76b98a57, countDownLatch);
        try {
            countDownLatch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
        }
        return this.f48325xf5beb591.f48365x88e6bd22;
    }

    /* renamed from: decoderSegment */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97773xe403f64f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25792x833e7741 c25792x833e7741 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25792x833e7741();
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571 = this.f48322x41a99399;
        boolean z17 = false;
        if (c25787xf70dc571 == null || c25787xf70dc571.f48318x63a1987d == null || !this.f48322x41a99399.f48318x63a1987d.m97253x805f158c(c25736x76b98a57)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("readSample: hint nextFrameSegment --- ");
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5712 = this.f48322x41a99399;
            sb6.append(c25787xf70dc5712 == null ? "" : c25787xf70dc5712.f48318x63a1987d);
            sb6.append("  ");
            sb6.append(c25736x76b98a57);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(TAG, sb6.toString());
        } else {
            synchronized (this.f48321xe62474f5) {
                m97771x4b7ff992();
                this.f48319x407c2d1f = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571(this.f48322x41a99399.f48318x63a1987d);
                java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b> it = this.f48322x41a99399.f48317x27ec1249.iterator();
                while (it.hasNext()) {
                    this.f48319x407c2d1f.m97770xd0ce6a73(it.next());
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b m97769x2585d19c = this.f48319x407c2d1f.m97769x2585d19c(c25736x76b98a57);
                if (m97769x2585d19c != null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append("readSample: hint nextFrameSegment ");
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = m97769x2585d19c.f48315xe9bf8e8a;
                    if (c25734xcdff9c14 != null && c25734xcdff9c14.m97194x3a00ef33() != null) {
                        z17 = true;
                    }
                    sb7.append(z17);
                    sb7.append("  ");
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c142 = m97769x2585d19c.f48315xe9bf8e8a;
                    sb7.append(c25734xcdff9c142 != null ? java.lang.Boolean.valueOf(c25734xcdff9c142.m97196x216ebaf7()) : "null");
                    sb7.append(" time = ");
                    sb7.append(m97769x2585d19c.f48314x5102a9dc);
                    sb7.append("  ");
                    sb7.append(m97769x2585d19c.f48313x207df1da);
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, sb7.toString());
                    com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5713 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f48319x407c2d1f.m97768x72e9c42e(), mo96654xacbb5a6b().m97236x636d539(this.f48326xc73321d4)));
                    this.f48322x41a99399 = c25787xf70dc5713;
                    this.f48325xf5beb591.m97802xe403f64f(c25787xf70dc5713, (com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25792x833e7741) null);
                    this.f48320x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(m97769x2585d19c.f48313x207df1da);
                    return m97769x2585d19c.f48315xe9bf8e8a;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(TAG, "readSample: hint nextFrameSegment frame == null " + this.f48322x41a99399.f48317x27ec1249.size() + "  " + this.f48319x407c2d1f.f48317x27ec1249.size());
                this.f48325xf5beb591.f48359xae7a2e7a = true;
            }
        }
        synchronized (this.f48321xe62474f5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5714 = this.f48322x41a99399;
            if (c25787xf70dc5714 != null) {
                c25787xf70dc5714.m97767x5a5b64d();
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5715 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, mo96654xacbb5a6b().m97236x636d539(this.f48326xc73321d4)));
            this.f48322x41a99399 = c25787xf70dc5715;
            this.f48325xf5beb591.m97802xe403f64f(c25787xf70dc5715, c25792x833e7741);
        }
        synchronized (c25792x833e7741) {
            try {
                if (!c25792x833e7741.m97794x1920af89()) {
                    c25792x833e7741.wait(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (this.f48322x41a99399.f48317x27ec1249.size() == 0) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        m97771x4b7ff992();
        this.f48319x407c2d1f = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571(this.f48322x41a99399.f48318x63a1987d);
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b> it6 = this.f48322x41a99399.f48317x27ec1249.iterator();
        while (it6.hasNext()) {
            this.f48319x407c2d1f.m97770xd0ce6a73(it6.next());
        }
        synchronized (this.f48321xe62474f5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5716 = new com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f48319x407c2d1f.m97768x72e9c42e(), mo96654xacbb5a6b().m97236x636d539(this.f48326xc73321d4)));
            this.f48322x41a99399 = c25787xf70dc5716;
            this.f48325xf5beb591.m97802xe403f64f(c25787xf70dc5716, (com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25792x833e7741) null);
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5717 = this.f48319x407c2d1f;
        if (c25787xf70dc5717 == null || c25787xf70dc5717.f48317x27ec1249.size() <= 0) {
            return null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b c25786x772c472b = this.f48319x407c2d1f.f48317x27ec1249.get(0);
        this.f48320x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25786x772c472b.f48313x207df1da);
        return c25786x772c472b.f48315xe9bf8e8a;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: asyncReadNextSample */
    public void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: clipRangeAndClearRange */
    public void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f48325xf5beb591.f48363xbbda5f67.mo96650x5b0b7d5a(c25738xead39d26);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getCurrentSampleTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a() {
        return this.f48320x8ad81491.m97208xfb85bb43();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDecodePerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a() {
        return this.f48325xf5beb591.f48363xbbda5f67.mo96653x51e8b0a();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b() {
        return this.f48325xf5beb591.f48363xbbda5f67.mo96654xacbb5a6b();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getFrameRate */
    public int mo96655x1fea5d37() {
        return this.f48325xf5beb591.f48363xbbda5f67.mo96655x1fea5d37();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getLaggingTime */
    public long mo96656x213de1e4() {
        return 0L;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: getTrackId */
    public int mo96657xfe2e0f90() {
        return this.f48325xf5beb591.f48363xbbda5f67.mo96657xfe2e0f90();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0() {
        if (this.f48320x8ad81491.m97210x5241396d()) {
            return mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
        }
        if (this.f48320x8ad81491.m97208xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(this.f48320x8ad81491);
        }
        return mo96660xe121b2e0(this.f48320x8ad81491.m97208xfb85bb43().add(mo96654xacbb5a6b()));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: release */
    public void mo96661x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571 = this.f48319x407c2d1f;
        if (c25787xf70dc571 != null) {
            c25787xf70dc571.m97767x5a5b64d();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5712 = this.f48322x41a99399;
        if (c25787xf70dc5712 != null) {
            c25787xf70dc5712.m97767x5a5b64d();
        }
        synchronized (this.f48321xe62474f5) {
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25793x8e95b31b c25793x8e95b31b = this.f48325xf5beb591;
            if (c25793x8e95b31b != null) {
                c25793x8e95b31b.m97803x41012807();
                this.f48325xf5beb591 = null;
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: seekTo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "seekTo: PlayerThreadMain " + c25736x76b98a57);
        if (c25736x76b98a57.m97222xf922bec1(mo96654xacbb5a6b())) {
            this.f48320x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57.sub(mo96654xacbb5a6b()));
        } else {
            this.f48320x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57);
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571 = this.f48319x407c2d1f;
        if (c25787xf70dc571 != null) {
            c25787xf70dc571.m97767x5a5b64d();
            this.f48319x407c2d1f = null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc5712 = this.f48322x41a99399;
        if (c25787xf70dc5712 != null) {
            c25787xf70dc5712.m97767x5a5b64d();
            this.f48322x41a99399 = null;
        }
        if (!z17) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97772xbb151789 = m97772xbb151789(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(((float) (((c25736x76b98a57.m97232x31040141() / mo96654xacbb5a6b().m97232x31040141()) + (c25736x76b98a57.m97232x31040141() % mo96654xacbb5a6b().m97232x31040141() > 0 ? 1 : 0)) * mo96654xacbb5a6b().m97232x31040141())) / 1000000.0f));
        this.f48320x8ad81491 = m97772xbb151789 == null ? com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L) : m97772xbb151789.m97193x75286adb();
        return m97772xbb151789;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setDecodeType */
    public void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType) {
        this.f48325xf5beb591.f48363xbbda5f67.mo96666xd458f44a(decodeType);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setFrameRate */
    public void mo96667x7c3e1dab(int i17) {
        this.f48325xf5beb591.f48363xbbda5f67.mo96667x7c3e1dab(i17);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setLogger */
    public void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1) {
    }

    /* renamed from: setMaxFrameCacheSize */
    public void m97774x1e56f9f8(int i17) {
        if (i17 > 0) {
            this.f48326xc73321d4 = i17;
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25793x8e95b31b c25793x8e95b31b = this.f48325xf5beb591;
            if (c25793x8e95b31b != null) {
                c25793x8e95b31b.f48367x602ddbd7.mo97556x54d05e06(i17);
            }
        }
    }

    /* renamed from: setRevert */
    public void m97775x209b40e6(boolean z17) {
        this.f48324xc84ee9e4 = z17;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setTrackSegments */
    public void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list) {
        this.f48325xf5beb591.f48363xbbda5f67.mo96670xef2344c9(list);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: setVolume */
    public void mo96671x27f73e1c(float f17) {
        this.f48325xf5beb591.f48363xbbda5f67.mo96671x27f73e1c(f17);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96672x68ac462() {
        mo96673x68ac462(null);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator) {
        mo96674x68ac462(surfaceCreator, null);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: start */
    public void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f48327xb23179d4 = c25738xead39d26;
        this.f48323x399b739 = (com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719) surfaceCreator;
        this.f48325xf5beb591.m97804x225a98dc();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50
    /* renamed from: readSample */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b m97769x2585d19c;
        if (c25736x76b98a57.m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
            return mo96659xe121b2e0();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: targetTime = " + c25736x76b98a57);
        com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25787xf70dc571 c25787xf70dc571 = this.f48319x407c2d1f;
        if (c25787xf70dc571 != null && (m97769x2585d19c = c25787xf70dc571.m97769x2585d19c(c25736x76b98a57)) != null) {
            this.f48320x8ad81491 = new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(m97769x2585d19c.f48313x207df1da);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("readSample: hint currentSegment ");
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = m97769x2585d19c.f48315xe9bf8e8a;
            sb6.append((c25734xcdff9c14 == null || c25734xcdff9c14.m97194x3a00ef33() == null) ? false : true);
            sb6.append("  ");
            com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c142 = m97769x2585d19c.f48315xe9bf8e8a;
            sb6.append(c25734xcdff9c142 != null ? java.lang.Boolean.valueOf(c25734xcdff9c142.m97196x216ebaf7()) : "null");
            sb6.append(" time = ");
            sb6.append(m97769x2585d19c.f48314x5102a9dc);
            sb6.append("  ");
            sb6.append(m97769x2585d19c.f48313x207df1da);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, sb6.toString());
            return m97769x2585d19c.f48315xe9bf8e8a;
        }
        if (!c25736x76b98a57.m97238x9f3f7b48(mo96653x51e8b0a())) {
            this.f48320x8ad81491 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m97773xe403f64f = m97773xe403f64f(c25736x76b98a57);
        if (m97773xe403f64f != null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "readSample: hint currentSegment - " + m97773xe403f64f.m97195xfb85bb43());
            return m97773xe403f64f;
        }
        if (c25736x76b98a57.m97222xf922bec1(mo96653x51e8b0a())) {
            this.f48320x8ad81491 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L);
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L));
        }
        this.f48320x8ad81491 = com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-3L));
    }
}
