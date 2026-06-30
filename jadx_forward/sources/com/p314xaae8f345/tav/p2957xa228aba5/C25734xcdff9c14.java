package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CMSampleBuffer */
/* loaded from: classes16.dex */
public class C25734xcdff9c14 {

    /* renamed from: sampleByteBuffer */
    private java.nio.ByteBuffer f47852x59fdc0b2;

    /* renamed from: state */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d f47853x68ac491;

    /* renamed from: texture */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f47854xab7dd51b;

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d) {
        this.f47853x68ac491 = c25735x289c723d;
        c25735x289c723d.m97213xc749b22f(false);
        this.f47854xab7dd51b = null;
        this.f47852x59fdc0b2 = null;
    }

    /* renamed from: getSampleByteBuffer */
    public java.nio.ByteBuffer m97192x1d62828() {
        return this.f47852x59fdc0b2;
    }

    /* renamed from: getState */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d m97193x75286adb() {
        return this.f47853x68ac491;
    }

    /* renamed from: getTextureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97194x3a00ef33() {
        return this.f47854xab7dd51b;
    }

    /* renamed from: getTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97195xfb85bb43() {
        return this.f47853x68ac491.m97208xfb85bb43();
    }

    /* renamed from: isNewFrame */
    public boolean m97196x216ebaf7() {
        return this.f47853x68ac491.m97211x216ebaf7();
    }

    /* renamed from: setNewFrame */
    public void m97197xc749b22f(boolean z17) {
        this.f47853x68ac491.m97213xc749b22f(z17);
    }

    /* renamed from: setSampleByteBuffer */
    public void m97198xa5d2bd34(java.nio.ByteBuffer byteBuffer) {
        this.f47852x59fdc0b2 = byteBuffer;
    }

    /* renamed from: toString */
    public java.lang.String m97199x9616526c() {
        return "CMSampleBuffer{, state=" + this.f47853x68ac491 + ", texture=" + this.f47854xab7dd51b + ", sampleByteBuffer=" + this.f47852x59fdc0b2 + '}';
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        this.f47853x68ac491 = c25735x289c723d;
        this.f47854xab7dd51b = c25745xc3945049;
        this.f47852x59fdc0b2 = null;
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, boolean z17) {
        this.f47853x68ac491 = c25735x289c723d;
        c25735x289c723d.m97213xc749b22f(z17);
        this.f47854xab7dd51b = c25745xc3945049;
        this.f47852x59fdc0b2 = null;
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, java.nio.ByteBuffer byteBuffer) {
        this.f47853x68ac491 = c25735x289c723d;
        this.f47852x59fdc0b2 = byteBuffer;
        this.f47854xab7dd51b = null;
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d, java.nio.ByteBuffer byteBuffer, boolean z17) {
        this.f47853x68ac491 = c25735x289c723d;
        c25735x289c723d.m97213xc749b22f(z17);
        this.f47852x59fdc0b2 = byteBuffer;
        this.f47854xab7dd51b = null;
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57));
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        this(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57), c25745xc3945049);
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, boolean z17) {
        this(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57), c25745xc3945049, z17);
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, java.nio.ByteBuffer byteBuffer) {
        this(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57), byteBuffer);
    }

    public C25734xcdff9c14(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, java.nio.ByteBuffer byteBuffer, boolean z17) {
        this(new com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d(c25736x76b98a57), byteBuffer, z17);
    }
}
