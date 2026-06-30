package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXAppExtendObject */
/* loaded from: classes9.dex */
public class C11272xd6622699 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: CONTENT_LENGTH_LIMIT */
    private static final int f33058xd47d6328 = 10485760;

    /* renamed from: EXTINFO_LENGTH_LIMIT */
    private static final int f33059xb8cdcd12 = 2048;

    /* renamed from: PATH_LENGTH_LIMIT */
    private static final int f33060x94eb52dc = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXAppExtendObject";

    /* renamed from: extInfo */
    public java.lang.String f33061xb2206a6f;

    /* renamed from: fileData */
    public byte[] f33062xd4213b46;

    /* renamed from: filePath */
    public java.lang.String f33063xd426afc1;

    public C11272xd6622699() {
    }

    public C11272xd6622699(java.lang.String str, java.lang.String str2) {
        this.f33061xb2206a6f = str;
        this.f33063xd426afc1 = str2;
    }

    /* renamed from: getFileSize */
    private int m48448x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        byte[] bArr;
        java.lang.String str2;
        java.lang.String str3 = this.f33061xb2206a6f;
        if ((str3 == null || str3.length() == 0) && (((str = this.f33063xd426afc1) == null || str.length() == 0) && ((bArr = this.f33062xd4213b46) == null || bArr.length == 0))) {
            str2 = "checkArgs fail, all arguments is null";
        } else {
            java.lang.String str4 = this.f33061xb2206a6f;
            if (str4 == null || str4.length() <= 2048) {
                java.lang.String str5 = this.f33063xd426afc1;
                if (str5 == null || str5.length() <= 10240) {
                    java.lang.String str6 = this.f33063xd426afc1;
                    if (str6 == null || m48448x50026913(str6) <= f33058xd47d6328) {
                        byte[] bArr2 = this.f33062xd4213b46;
                        if (bArr2 == null || bArr2.length <= f33058xd47d6328) {
                            return true;
                        }
                        str2 = "checkArgs fail, fileData is too large";
                    } else {
                        str2 = "checkArgs fail, fileSize is too large";
                    }
                } else {
                    str2 = "checkArgs fail, filePath is invalid";
                }
            } else {
                str2 = "checkArgs fail, extInfo is invalid";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxappextendobject_extInfo", this.f33061xb2206a6f);
        bundle.putByteArray("_wxappextendobject_fileData", this.f33062xd4213b46);
        bundle.putString("_wxappextendobject_filePath", this.f33063xd426afc1);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 7;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33061xb2206a6f = bundle.getString("_wxappextendobject_extInfo");
        this.f33062xd4213b46 = bundle.getByteArray("_wxappextendobject_fileData");
        this.f33063xd426afc1 = bundle.getString("_wxappextendobject_filePath");
    }

    public C11272xd6622699(java.lang.String str, byte[] bArr) {
        this.f33061xb2206a6f = str;
        this.f33062xd4213b46 = bArr;
    }
}
