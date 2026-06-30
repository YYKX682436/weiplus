package com.tencent.kinda.gen;

/* loaded from: classes12.dex */
public final class RsaEncryptResult {
    public java.lang.String mBase64Str;
    public int mRet;

    public RsaEncryptResult() {
    }

    public RsaEncryptResult(java.lang.String str, int i17) {
        this.mBase64Str = str;
        this.mRet = i17;
    }

    public java.lang.String getBase64Str() {
        return this.mBase64Str;
    }

    public int getRet() {
        return this.mRet;
    }

    public java.lang.String toString() {
        return "RsaEncryptResult{mBase64Str=" + this.mBase64Str + ",mRet=" + this.mRet + "}";
    }
}
