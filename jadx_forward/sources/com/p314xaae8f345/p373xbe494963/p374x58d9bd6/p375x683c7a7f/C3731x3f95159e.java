package com.p314xaae8f345.p373xbe494963.p374x58d9bd6.p375x683c7a7f;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio.musicdecoder.MusicResourceDecoderAndroid */
/* loaded from: classes13.dex */
public class C3731x3f95159e {
    private static final java.lang.String TAG = "MusicResourceDecoderAndroid";

    /* renamed from: mPath */
    private java.lang.String f14571x625da32;

    /* renamed from: mTrackIndex */
    private int f14572x201c5694 = 0;

    /* renamed from: mDecoder */
    private final com.p314xaae8f345.p373xbe494963.p374x58d9bd6.p375x683c7a7f.C3730xfb861cdb f14570xfa085f17 = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.p375x683c7a7f.C3730xfb861cdb();

    /* renamed from: decode */
    public java.nio.ByteBuffer m29147xb06291ee() {
        return this.f14570xfa085f17.m29143x756f483e();
    }

    /* renamed from: getBitrate */
    public int m29148x37b4b737() {
        android.media.MediaFormat m29138x42b80ace = this.f14570xfa085f17.m29138x42b80ace();
        if (m29138x42b80ace == null) {
            return -1;
        }
        try {
            return m29138x42b80ace.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "getBitrate failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: getChannelCount */
    public int m29149x5a902042() {
        android.media.MediaFormat m29138x42b80ace = this.f14570xfa085f17.m29138x42b80ace();
        if (m29138x42b80ace == null) {
            return -1;
        }
        try {
            return m29138x42b80ace.getInteger("channel-count");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "getChannelCount failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: getDuration */
    public long m29150x51e8b0a() {
        return (this.f14570xfa085f17.m29137x883cbb08() + 500) / 1000;
    }

    /* renamed from: getSampleRate */
    public int m29151xf6c809a0() {
        android.media.MediaFormat m29138x42b80ace = this.f14570xfa085f17.m29138x42b80ace();
        if (m29138x42b80ace == null) {
            return -1;
        }
        try {
            return m29138x42b80ace.getInteger("sample-rate");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "getSampleRate failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: getTotalRawDataSize */
    public int m29152x668c14a5() {
        return this.f14570xfa085f17.m29139x668c14a5();
    }

    /* renamed from: getTrackCount */
    public int m29153x31d73e7a() {
        return this.f14570xfa085f17.m29140x31d73e7a();
    }

    /* renamed from: isDecodeEnd */
    public boolean m29154x64f25203() {
        return this.f14570xfa085f17.m29142x64f25203();
    }

    /* renamed from: seekTo */
    public boolean m29155xc9fc1b13(long j17) {
        if (this.f14570xfa085f17.m29142x64f25203()) {
            this.f14570xfa085f17.m29146x360802();
            this.f14570xfa085f17.m29141x4dc9a1fb(this.f14571x625da32);
            this.f14570xfa085f17.m29145xed4b2828(this.f14572x201c5694);
        }
        return this.f14570xfa085f17.m29144xc9fc1b13(j17 * 1000);
    }

    /* renamed from: setMusicTrack */
    public void m29156xed4b2828(int i17) {
        this.f14572x201c5694 = i17;
        this.f14570xfa085f17.m29145xed4b2828(i17);
    }

    /* renamed from: start */
    public boolean m29157x68ac462(java.lang.String str) {
        this.f14571x625da32 = str;
        return this.f14570xfa085f17.m29141x4dc9a1fb(str);
    }

    /* renamed from: stop */
    public void m29158x360802() {
        this.f14570xfa085f17.m29146x360802();
    }
}
