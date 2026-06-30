package com.tencent.mars.comm;

/* loaded from: classes7.dex */
public class AndroidCertVerifyResult {
    private final java.util.List<java.security.cert.X509Certificate> mCertificateChain;
    private final boolean mIsIssuedByHostMatched;
    private final boolean mIsIssuedByKnownRoot;
    private final int mStatus;

    public AndroidCertVerifyResult(int i17, boolean z17, java.util.List<java.security.cert.X509Certificate> list) {
        this.mStatus = i17;
        this.mIsIssuedByKnownRoot = z17;
        this.mCertificateChain = new java.util.ArrayList(list);
        this.mIsIssuedByHostMatched = false;
    }

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.mCertificateChain.size()];
        for (int i17 = 0; i17 < this.mCertificateChain.size(); i17++) {
            try {
                bArr[i17] = this.mCertificateChain.get(i17).getEncoded();
            } catch (java.security.cert.CertificateEncodingException unused) {
                return new byte[0];
            }
        }
        return bArr;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public boolean isIssuedByHostMatched() {
        return this.mIsIssuedByHostMatched;
    }

    public boolean isIssuedByKnownRoot() {
        return this.mIsIssuedByKnownRoot;
    }

    public AndroidCertVerifyResult(int i17, boolean z17, java.util.List<java.security.cert.X509Certificate> list, boolean z18) {
        this.mStatus = i17;
        this.mIsIssuedByKnownRoot = z17;
        this.mCertificateChain = new java.util.ArrayList(list);
        this.mIsIssuedByHostMatched = z18;
    }

    public AndroidCertVerifyResult(int i17) {
        this.mStatus = i17;
        this.mIsIssuedByKnownRoot = false;
        this.mCertificateChain = java.util.Collections.emptyList();
        this.mIsIssuedByHostMatched = false;
    }
}
