package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.AndroidCertVerifyResult */
/* loaded from: classes7.dex */
public class C4546xcbb9aa9 {

    /* renamed from: mCertificateChain */
    private final java.util.List<java.security.cert.X509Certificate> f19220x85a5d5f7;

    /* renamed from: mIsIssuedByHostMatched */
    private final boolean f19221x109384a3;

    /* renamed from: mIsIssuedByKnownRoot */
    private final boolean f19222x48958acc;

    /* renamed from: mStatus */
    private final int f19223x1a39f6bf;

    public C4546xcbb9aa9(int i17, boolean z17, java.util.List<java.security.cert.X509Certificate> list) {
        this.f19223x1a39f6bf = i17;
        this.f19222x48958acc = z17;
        this.f19220x85a5d5f7 = new java.util.ArrayList(list);
        this.f19221x109384a3 = false;
    }

    /* renamed from: getCertificateChainEncoded */
    public byte[][] m39970x2846ae0e() {
        byte[][] bArr = new byte[this.f19220x85a5d5f7.size()];
        for (int i17 = 0; i17 < this.f19220x85a5d5f7.size(); i17++) {
            try {
                bArr[i17] = this.f19220x85a5d5f7.get(i17).getEncoded();
            } catch (java.security.cert.CertificateEncodingException unused) {
                return new byte[0];
            }
        }
        return bArr;
    }

    /* renamed from: getStatus */
    public int m39971x2fe4f2e8() {
        return this.f19223x1a39f6bf;
    }

    /* renamed from: isIssuedByHostMatched */
    public boolean m39972x5cc1bf10() {
        return this.f19221x109384a3;
    }

    /* renamed from: isIssuedByKnownRoot */
    public boolean m39973x5df97c79() {
        return this.f19222x48958acc;
    }

    public C4546xcbb9aa9(int i17, boolean z17, java.util.List<java.security.cert.X509Certificate> list, boolean z18) {
        this.f19223x1a39f6bf = i17;
        this.f19222x48958acc = z17;
        this.f19220x85a5d5f7 = new java.util.ArrayList(list);
        this.f19221x109384a3 = z18;
    }

    public C4546xcbb9aa9(int i17) {
        this.f19223x1a39f6bf = i17;
        this.f19222x48958acc = false;
        this.f19220x85a5d5f7 = java.util.Collections.emptyList();
        this.f19221x109384a3 = false;
    }
}
