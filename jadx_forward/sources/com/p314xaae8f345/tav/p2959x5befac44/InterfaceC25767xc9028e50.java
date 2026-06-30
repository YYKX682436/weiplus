package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.IDecoderTrack */
/* loaded from: classes16.dex */
public interface InterfaceC25767xc9028e50 {

    /* renamed from: com.tencent.tav.decoder.IDecoderTrack$SurfaceCreator */
    /* loaded from: classes16.dex */
    public interface SurfaceCreator {
        /* renamed from: createOutputSurface */
        android.view.Surface mo97549x718480d0(int i17, int i18, int i19);

        /* renamed from: free */
        void mo97550x30166c(android.view.Surface surface);

        /* renamed from: release */
        void mo97551x41012807();

        /* renamed from: videoTextureForSurface */
        com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 mo97552x6eb64fe4(android.view.Surface surface);
    }

    /* renamed from: asyncReadNextSample */
    void mo96649xb8b7224f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: clipRangeAndClearRange */
    void mo96650x5b0b7d5a(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26);

    /* renamed from: getCurrentSampleTime */
    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96651x940ab53a();

    /* renamed from: getDecodePerformance */
    com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b mo96652xc291ccac();

    /* renamed from: getDuration */
    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96653x51e8b0a();

    /* renamed from: getFrameDuration */
    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96654xacbb5a6b();

    /* renamed from: getFrameRate */
    int mo96655x1fea5d37();

    /* renamed from: getLaggingTime */
    long mo96656x213de1e4();

    /* renamed from: getTrackId */
    int mo96657xfe2e0f90();

    /* renamed from: readSample */
    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0();

    /* renamed from: readSample */
    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96660xe121b2e0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: release */
    void mo96661x41012807();

    /* renamed from: seekTo */
    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96663xc9fc1b13(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17, boolean z18);

    /* renamed from: setDecodeType */
    void mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType decodeType);

    /* renamed from: setFrameRate */
    void mo96667x7c3e1dab(int i17);

    /* renamed from: setLogger */
    void mo96668x16e44c92(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1);

    /* renamed from: setTrackSegments */
    void mo96670xef2344c9(java.util.List<com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac> list);

    /* renamed from: setVolume */
    void mo96671x27f73e1c(float f17);

    /* renamed from: start */
    void mo96672x68ac462();

    /* renamed from: start */
    void mo96673x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator);

    /* renamed from: start */
    void mo96674x68ac462(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator surfaceCreator, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26);
}
