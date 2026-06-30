package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject */
/* loaded from: classes9.dex */
public class C11282x3580fbc3 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: FILE_SIZE_LIMIT */
    private static final int f33095x5dc2c80 = 104857600;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXGameVideoFileObject";

    /* renamed from: URL_LENGTH_LIMIT */
    private static final int f33096xd2fb99f2 = 10240;

    /* renamed from: filePath */
    public java.lang.String f33097xd426afc1;

    /* renamed from: thumbUrl */
    public java.lang.String f33098x5d6543b9;

    /* renamed from: videoUrl */
    public java.lang.String f33099x44a0a2f4;

    public C11282x3580fbc3() {
        this.f33097xd426afc1 = null;
        this.f33099x44a0a2f4 = null;
        this.f33098x5d6543b9 = null;
    }

    /* renamed from: getFileSize */
    private int m48463x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33097xd426afc1;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, filePath is null";
        } else if (m48463x50026913(this.f33097xd426afc1) > 104857600) {
            str = "checkArgs fail, video file size is too large";
        } else {
            java.lang.String str3 = this.f33099x44a0a2f4;
            if (str3 == null || str3.length() <= 10240) {
                java.lang.String str4 = this.f33098x5d6543b9;
                if (str4 == null || str4.length() <= 10240) {
                    return true;
                }
                str = "checkArgs fail, thumbUrl is too long";
            } else {
                str = "checkArgs fail, videoUrl is too long";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxvideofileobject_filePath", this.f33097xd426afc1);
        bundle.putString("_wxvideofileobject_cdnUrl", this.f33099x44a0a2f4);
        bundle.putString("_wxvideofileobject_thumbUrl", this.f33098x5d6543b9);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 39;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33097xd426afc1 = bundle.getString("_wxvideofileobject_filePath");
        this.f33099x44a0a2f4 = bundle.getString("_wxvideofileobject_cdnUrl");
        this.f33098x5d6543b9 = bundle.getString("_wxvideofileobject_thumbUrl");
    }

    public C11282x3580fbc3(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f33097xd426afc1 = str;
        this.f33099x44a0a2f4 = str2;
        this.f33098x5d6543b9 = str3;
    }
}
