package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXImageObject */
/* loaded from: classes9.dex */
public class C11283x90d63ed9 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: CONTENT_LENGTH_LIMIT */
    private static final int f33100xd47d6328 = 26214400;

    /* renamed from: PATH_LENGTH_LIMIT */
    private static final int f33101x94eb52dc = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXImageObject";

    /* renamed from: entranceMiniProgramPath */
    public java.lang.String f33102x71a7f65c;

    /* renamed from: entranceMiniProgramUsername */
    public java.lang.String f33103x7c8b278d;

    /* renamed from: imageData */
    public byte[] f33104xcba0e7a5;

    /* renamed from: imagePath */
    public java.lang.String f33105xcba65c20;

    /* renamed from: imgDataHash */
    public java.lang.String f33106x2b12c8bb;

    public C11283x90d63ed9() {
    }

    public C11283x90d63ed9(android.graphics.Bitmap bitmap) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.f33104xcba0e7a5 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "WXImageObject <init>, exception:" + e17.getMessage());
        }
    }

    /* renamed from: getFileSize */
    private int m48464x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2;
        byte[] bArr = this.f33104xcba0e7a5;
        if ((bArr == null || bArr.length == 0) && ((str = this.f33105xcba65c20) == null || str.length() == 0)) {
            str2 = "checkArgs fail, all arguments are null";
        } else {
            byte[] bArr2 = this.f33104xcba0e7a5;
            if (bArr2 == null || bArr2.length <= f33100xd47d6328) {
                java.lang.String str3 = this.f33105xcba65c20;
                if (str3 == null || str3.length() <= 10240) {
                    java.lang.String str4 = this.f33105xcba65c20;
                    if (str4 == null || m48464x50026913(str4) <= f33100xd47d6328) {
                        return true;
                    }
                    str2 = "checkArgs fail, image content is too large";
                } else {
                    str2 = "checkArgs fail, path is invalid";
                }
            } else {
                str2 = "checkArgs fail, content is too large";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putByteArray("_wximageobject_imageData", this.f33104xcba0e7a5);
        bundle.putString("_wximageobject_imagePath", this.f33105xcba65c20);
        bundle.putString("_wximageobject_imgDataHash", this.f33106x2b12c8bb);
        bundle.putString("_wximageobject_entranceMiniProgramUsername", this.f33103x7c8b278d);
        bundle.putString("_wximageobject_entranceMiniProgramPath", this.f33102x71a7f65c);
    }

    /* renamed from: setImagePath */
    public void m48465x27678dde(java.lang.String str) {
        this.f33105xcba65c20 = str;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33104xcba0e7a5 = bundle.getByteArray("_wximageobject_imageData");
        this.f33105xcba65c20 = bundle.getString("_wximageobject_imagePath");
        this.f33106x2b12c8bb = bundle.getString("_wximageobject_imgDataHash");
        this.f33103x7c8b278d = bundle.getString("_wximageobject_entranceMiniProgramUsername");
        this.f33102x71a7f65c = bundle.getString("_wximageobject_entranceMiniProgramPath");
    }

    public C11283x90d63ed9(byte[] bArr) {
        this.f33104xcba0e7a5 = bArr;
    }
}
