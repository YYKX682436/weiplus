package com.p314xaae8f345.tav.p2959x5befac44.ofs;

/* renamed from: com.tencent.tav.decoder.ofs.DecodingFrameSequence */
/* loaded from: classes16.dex */
class C25808xe9791ac3 implements java.lang.Comparable<com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3> {

    /* renamed from: firstFrameDecoded */
    private boolean f48404xa9934d9 = false;

    /* renamed from: ptsInMedia */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48405x8f136bd0;

    public C25808xe9791ac3(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48405x8f136bd0 = c25736x76b98a57;
    }

    /* renamed from: isFirstFrameDecoded */
    public boolean m97845x9dc820cf() {
        return this.f48404xa9934d9;
    }

    /* renamed from: markFirstFrameDecoded */
    public void m97846xd5a9418c() {
        this.f48404xa9934d9 = true;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.p314xaae8f345.tav.p2959x5befac44.ofs.C25808xe9791ac3 c25808xe9791ac3) {
        if (c25808xe9791ac3 == null) {
            return -1;
        }
        return this.f48405x8f136bd0.m97225x38a73ce5(c25808xe9791ac3.f48405x8f136bd0);
    }
}
