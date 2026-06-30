package com.p314xaae8f345.tav.p2959x5befac44.ofs;

/* renamed from: com.tencent.tav.decoder.ofs.DecodeRequest */
/* loaded from: classes16.dex */
class C25806x6f46c0a1 {

    /* renamed from: alignedTimeInClip */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48395xb87a60c6;

    /* renamed from: callback */
    public final com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25805x86be1473 f48396xf5bc2045;

    /* renamed from: isCompleted */
    public boolean f48397xf29e3841 = false;

    /* renamed from: optimizedFrameSamplingVideoDecoder */
    private final com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296 f48398x5039c676;

    /* renamed from: requestStartTimeMs */
    public final long f48399xb1c71246;

    /* renamed from: samplingTimeRangeInMedia */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48400x8fcb1336;

    public C25806x6f46c0a1(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25811xac414296 c25811xac414296, long j17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573, com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25805x86be1473 interfaceC25805x86be1473) {
        this.f48398x5039c676 = c25811xac414296;
        this.f48399xb1c71246 = j17;
        this.f48395xb87a60c6 = c25736x76b98a57;
        this.f48400x8fcb1336 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a572, c25736x76b98a573);
        this.f48396xf5bc2045 = interfaceC25805x86be1473;
    }

    /* renamed from: completeInternal */
    private void m97840x99b1316(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        if (this.f48397xf29e3841) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w("OFSVideoDecoder", "Try complete request twice.");
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.f48398x5039c676.TAG, "Request completed with state:" + c25734xcdff9c14.m97193x75286adb().m97206x8311a768() + " time:" + c25734xcdff9c14.m97195xfb85bb43().m97231x793685bc());
        this.f48397xf29e3841 = true;
        com.p314xaae8f345.tav.p2959x5befac44.ofs.InterfaceC25805x86be1473 interfaceC25805x86be1473 = this.f48396xf5bc2045;
        if (interfaceC25805x86be1473 != null) {
            interfaceC25805x86be1473.mo97839x624fb4c0(c25734xcdff9c14);
        }
    }

    /* renamed from: completeWithEOS */
    public void m97841xaad2a2ea() {
        m97840x99b1316(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-1L)));
    }

    /* renamed from: completeWithError */
    public void m97842x40c5fba9(long j17, java.lang.String str, java.lang.Throwable th6) {
        m97840x99b1316(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97202x360047e(j17, str, th6)));
    }

    /* renamed from: completeWithFrame */
    public void m97843x40d3d30e(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25807xacfc92f7 c25807xacfc92f7) {
        m97840x99b1316(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(this.f48395xb87a60c6), c25807xacfc92f7.f48403x602aa869));
    }

    /* renamed from: completeWithTimeout */
    public void m97844x310c92c2() {
        m97840x99b1316(new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d.m97200x360047e(-4L)));
    }
}
