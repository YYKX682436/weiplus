package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXVideoFileObject */
/* loaded from: classes9.dex */
public class C11297x655ab995 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: FILE_SIZE_LIMIT */
    public static final int f33230x5dc2c80 = 1073741824;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXVideoFileObject";

    /* renamed from: WXVideoFileShareSceneCommon */
    public static final int f33231x87f43f0e = 0;

    /* renamed from: WXVideoFileShareSceneFromWX */
    public static final int f33232x8d3df52e = 1;

    /* renamed from: filePath */
    public java.lang.String f33233xd426afc1;

    /* renamed from: shareScene */
    public int f33234x94bcebed;

    /* renamed from: shareTicket */
    public java.lang.String f33235x4e903cb;

    public C11297x655ab995() {
        this.f33234x94bcebed = 0;
        this.f33233xd426afc1 = null;
    }

    /* renamed from: getFileSize */
    private int m48480x50026913(java.lang.String str) {
        return com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.m48581x50026913(str);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33233xd426afc1;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, filePath is null";
        } else {
            if (m48480x50026913(this.f33233xd426afc1) <= 1073741824) {
                return true;
            }
            str = "checkArgs fail, video file size is too large";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxvideofileobject_filePath", this.f33233xd426afc1);
        bundle.putInt("_wxvideofileobject_shareScene", this.f33234x94bcebed);
        bundle.putString("_wxvideofileobject_shareTicketh", this.f33235x4e903cb);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 38;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33233xd426afc1 = bundle.getString("_wxvideofileobject_filePath");
        this.f33234x94bcebed = bundle.getInt("_wxvideofileobject_shareScene", 0);
        this.f33235x4e903cb = bundle.getString("_wxvideofileobject_shareTicketh");
    }

    public C11297x655ab995(java.lang.String str) {
        this.f33234x94bcebed = 0;
        this.f33233xd426afc1 = str;
    }
}
