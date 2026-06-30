package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.AudioInfo */
/* loaded from: classes16.dex */
public class C25756x82a4b984 implements java.lang.Cloneable {

    /* renamed from: channelCount */
    public int f47983xf99d8dcc;

    /* renamed from: pcmEncoding */
    public int f47984x2771c84d;

    /* renamed from: sampleRate */
    public int f47985x88751aa;

    public C25756x82a4b984() {
        this.f47985x88751aa = 44100;
        this.f47983xf99d8dcc = 1;
        this.f47984x2771c84d = 2;
    }

    /* renamed from: toString */
    public java.lang.String m97416x9616526c() {
        return "AudioInfo{sampleRate=" + this.f47985x88751aa + ", channelCount=" + this.f47983xf99d8dcc + ", pcmEncoding=" + this.f47984x2771c84d + '}';
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 m97415x5a5dd5d() {
        return new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984(this.f47985x88751aa, this.f47983xf99d8dcc, this.f47984x2771c84d);
    }

    public C25756x82a4b984(int i17, int i18, int i19) {
        this.f47985x88751aa = i17;
        this.f47983xf99d8dcc = i18;
        this.f47984x2771c84d = i19;
    }
}
