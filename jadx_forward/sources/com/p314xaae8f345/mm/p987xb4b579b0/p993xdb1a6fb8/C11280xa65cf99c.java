package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXFileObject */
/* loaded from: classes9.dex */
public class C11280xa65cf99c implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: CONTENT_LENGTH_LIMIT */
    private static final int f33090xd47d6328 = 1920991232;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXFileObject";

    /* renamed from: contentLengthLimit */
    private int f33091x7b821e3c;

    /* renamed from: fileData */
    public byte[] f33092xd4213b46;

    /* renamed from: filePath */
    public java.lang.String f33093xd426afc1;

    public C11280xa65cf99c() {
        this.f33091x7b821e3c = f33090xd47d6328;
        this.f33092xd4213b46 = null;
        this.f33093xd426afc1 = null;
    }

    /* renamed from: getFileSize */
    private int m48457x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2;
        byte[] bArr = this.f33092xd4213b46;
        if ((bArr == null || bArr.length == 0) && ((str = this.f33093xd426afc1) == null || str.length() == 0)) {
            str2 = "checkArgs fail, both arguments is null";
        } else {
            byte[] bArr2 = this.f33092xd4213b46;
            if (bArr2 == null || bArr2.length <= this.f33091x7b821e3c) {
                java.lang.String str3 = this.f33093xd426afc1;
                if (str3 == null || m48457x50026913(str3) <= this.f33091x7b821e3c) {
                    return true;
                }
                str2 = "checkArgs fail, fileSize is too large";
            } else {
                str2 = "checkArgs fail, fileData is too large";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.f33092xd4213b46);
        bundle.putString("_wxfileobject_filePath", this.f33093xd426afc1);
    }

    /* renamed from: setContentLengthLimit */
    public void m48458x260a023e(int i17) {
        this.f33091x7b821e3c = i17;
    }

    /* renamed from: setFileData */
    public void m48459x4ab3d9c8(byte[] bArr) {
        this.f33092xd4213b46 = bArr;
    }

    /* renamed from: setFilePath */
    public void m48460x4ab94e43(java.lang.String str) {
        this.f33093xd426afc1 = str;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 6;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33092xd4213b46 = bundle.getByteArray("_wxfileobject_fileData");
        this.f33093xd426afc1 = bundle.getString("_wxfileobject_filePath");
    }

    public C11280xa65cf99c(java.lang.String str) {
        this.f33091x7b821e3c = f33090xd47d6328;
        this.f33093xd426afc1 = str;
    }

    public C11280xa65cf99c(byte[] bArr) {
        this.f33091x7b821e3c = f33090xd47d6328;
        this.f33092xd4213b46 = bArr;
    }
}
