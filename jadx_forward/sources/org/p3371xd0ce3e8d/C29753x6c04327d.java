package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.CryptoOptions */
/* loaded from: classes6.dex */
public final class C29753x6c04327d {

    /* renamed from: sframe */
    private final org.p3371xd0ce3e8d.C29753x6c04327d.SFrame f75263xca0ff8da;

    /* renamed from: srtp */
    private final org.p3371xd0ce3e8d.C29753x6c04327d.Srtp f75264x36011b;

    /* renamed from: org.webrtc.CryptoOptions$Builder */
    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: enableAes128Sha1_32CryptoCipher */
        private boolean f75265xd0731c3a;

        /* renamed from: enableEncryptedRtpHeaderExtensions */
        private boolean f75266xbd0437ce;

        /* renamed from: enableGcmCryptoSuites */
        private boolean f75267xc2075e4a;

        /* renamed from: requireFrameEncryption */
        private boolean f75268x4f2a90ab;

        private Builder() {
        }

        /* renamed from: createCryptoOptions */
        public org.p3371xd0ce3e8d.C29753x6c04327d m155350x9d150b01() {
            return new org.p3371xd0ce3e8d.C29753x6c04327d(this.f75267xc2075e4a, this.f75265xd0731c3a, this.f75266xbd0437ce, this.f75268x4f2a90ab);
        }

        /* renamed from: setEnableAes128Sha1_32CryptoCipher */
        public org.p3371xd0ce3e8d.C29753x6c04327d.Builder m155351x4994b78(boolean z17) {
            this.f75265xd0731c3a = z17;
            return this;
        }

        /* renamed from: setEnableEncryptedRtpHeaderExtensions */
        public org.p3371xd0ce3e8d.C29753x6c04327d.Builder m155352x6497d7d0(boolean z17) {
            this.f75266xbd0437ce = z17;
            return this;
        }

        /* renamed from: setEnableGcmCryptoSuites */
        public org.p3371xd0ce3e8d.C29753x6c04327d.Builder m155353x9dc5e308(boolean z17) {
            this.f75267xc2075e4a = z17;
            return this;
        }

        /* renamed from: setRequireFrameEncryption */
        public org.p3371xd0ce3e8d.C29753x6c04327d.Builder m155354xeb3ca3ad(boolean z17) {
            this.f75268x4f2a90ab = z17;
            return this;
        }
    }

    /* renamed from: org.webrtc.CryptoOptions$SFrame */
    /* loaded from: classes6.dex */
    public final class SFrame {

        /* renamed from: requireFrameEncryption */
        private final boolean f75269x4f2a90ab;

        /* renamed from: getRequireFrameEncryption */
        public boolean m155355xb8f907a1() {
            return this.f75269x4f2a90ab;
        }

        private SFrame(boolean z17) {
            this.f75269x4f2a90ab = z17;
        }
    }

    /* renamed from: org.webrtc.CryptoOptions$Srtp */
    /* loaded from: classes6.dex */
    public final class Srtp {

        /* renamed from: enableAes128Sha1_32CryptoCipher */
        private final boolean f75271xd0731c3a;

        /* renamed from: enableEncryptedRtpHeaderExtensions */
        private final boolean f75272xbd0437ce;

        /* renamed from: enableGcmCryptoSuites */
        private final boolean f75273xc2075e4a;

        /* renamed from: getEnableAes128Sha1_32CryptoCipher */
        public boolean m155356x271c1a04() {
            return this.f75271xd0731c3a;
        }

        /* renamed from: getEnableEncryptedRtpHeaderExtensions */
        public boolean m155357x78b9edc4() {
            return this.f75272xbd0437ce;
        }

        /* renamed from: getEnableGcmCryptoSuites */
        public boolean m155358xcdb33094() {
            return this.f75273xc2075e4a;
        }

        private Srtp(boolean z17, boolean z18, boolean z19) {
            this.f75273xc2075e4a = z17;
            this.f75271xd0731c3a = z18;
            this.f75272xbd0437ce = z19;
        }
    }

    /* renamed from: builder */
    public static org.p3371xd0ce3e8d.C29753x6c04327d.Builder m155347xdc3ef9b() {
        return new org.p3371xd0ce3e8d.C29753x6c04327d.Builder();
    }

    /* renamed from: getSFrame */
    public org.p3371xd0ce3e8d.C29753x6c04327d.SFrame m155348x2d642bb0() {
        return this.f75263xca0ff8da;
    }

    /* renamed from: getSrtp */
    public org.p3371xd0ce3e8d.C29753x6c04327d.Srtp m155349xfb856991() {
        return this.f75264x36011b;
    }

    private C29753x6c04327d(boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f75264x36011b = new org.p3371xd0ce3e8d.C29753x6c04327d.Srtp(z17, z18, z19);
        this.f75263xca0ff8da = new org.p3371xd0ce3e8d.C29753x6c04327d.SFrame(z27);
    }
}
