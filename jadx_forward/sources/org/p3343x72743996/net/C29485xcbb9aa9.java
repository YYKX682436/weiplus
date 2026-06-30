package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net::android")
/* renamed from: org.chromium.net.AndroidCertVerifyResult */
/* loaded from: classes7.dex */
public class C29485xcbb9aa9 {

    /* renamed from: mCertificateChain */
    private final java.util.List<java.security.cert.X509Certificate> f73678x85a5d5f7;

    /* renamed from: mIsIssuedByKnownRoot */
    private final boolean f73679x48958acc;

    /* renamed from: mStatus */
    private final int f73680x1a39f6bf;

    public C29485xcbb9aa9(int i17, boolean z17, java.util.List<java.security.cert.X509Certificate> list) {
        this.f73680x1a39f6bf = i17;
        this.f73679x48958acc = z17;
        this.f73678x85a5d5f7 = new java.util.ArrayList(list);
    }

    /* renamed from: getCertificateChainEncoded */
    public byte[][] m153049x2846ae0e() {
        byte[][] bArr = new byte[this.f73678x85a5d5f7.size()];
        for (int i17 = 0; i17 < this.f73678x85a5d5f7.size(); i17++) {
            try {
                bArr[i17] = this.f73678x85a5d5f7.get(i17).getEncoded();
            } catch (java.security.cert.CertificateEncodingException unused) {
                return new byte[0];
            }
        }
        return bArr;
    }

    /* renamed from: getStatus */
    public int m153050x2fe4f2e8() {
        return this.f73680x1a39f6bf;
    }

    /* renamed from: isIssuedByKnownRoot */
    public boolean m153051x5df97c79() {
        return this.f73679x48958acc;
    }

    public C29485xcbb9aa9(int i17) {
        this.f73680x1a39f6bf = i17;
        this.f73679x48958acc = false;
        this.f73678x85a5d5f7 = java.util.Collections.emptyList();
    }
}
