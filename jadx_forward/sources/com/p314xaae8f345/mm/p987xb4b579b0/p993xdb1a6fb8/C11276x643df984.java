package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEmojiObject */
/* loaded from: classes9.dex */
public class C11276x643df984 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: CONTENT_LENGTH_LIMIT */
    private static final int f33075xd47d6328 = 10485760;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEmojiObject";

    /* renamed from: emojiData */
    public byte[] f33076x647d5110;

    /* renamed from: emojiPath */
    public java.lang.String f33077x6482c58b;

    public C11276x643df984() {
        this.f33076x647d5110 = null;
        this.f33077x6482c58b = null;
    }

    /* renamed from: getFileSize */
    private int m48454x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2;
        byte[] bArr = this.f33076x647d5110;
        if ((bArr == null || bArr.length == 0) && ((str = this.f33077x6482c58b) == null || str.length() == 0)) {
            str2 = "checkArgs fail, both arguments is null";
        } else {
            byte[] bArr2 = this.f33076x647d5110;
            if (bArr2 == null || bArr2.length <= f33075xd47d6328) {
                java.lang.String str3 = this.f33077x6482c58b;
                if (str3 == null || m48454x50026913(str3) <= f33075xd47d6328) {
                    return true;
                }
                str2 = "checkArgs fail, emojiSize is too large";
            } else {
                str2 = "checkArgs fail, emojiData is too large";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putByteArray("_wxemojiobject_emojiData", this.f33076x647d5110);
        bundle.putString("_wxemojiobject_emojiPath", this.f33077x6482c58b);
    }

    /* renamed from: setEmojiData */
    public void m48455xc03e82ce(byte[] bArr) {
        this.f33076x647d5110 = bArr;
    }

    /* renamed from: setEmojiPath */
    public void m48456xc043f749(java.lang.String str) {
        this.f33077x6482c58b = str;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33076x647d5110 = bundle.getByteArray("_wxemojiobject_emojiData");
        this.f33077x6482c58b = bundle.getString("_wxemojiobject_emojiPath");
    }

    public C11276x643df984(java.lang.String str) {
        this.f33077x6482c58b = str;
    }

    public C11276x643df984(byte[] bArr) {
        this.f33076x647d5110 = bArr;
    }
}
