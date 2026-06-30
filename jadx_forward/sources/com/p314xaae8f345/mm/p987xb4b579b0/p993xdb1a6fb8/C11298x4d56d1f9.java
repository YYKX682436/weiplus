package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXVideoObject */
/* loaded from: classes9.dex */
public class C11298x4d56d1f9 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33236x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXVideoObject";

    /* renamed from: videoLowBandUrl */
    public java.lang.String f33237x3accbfe1;

    /* renamed from: videoUrl */
    public java.lang.String f33238x44a0a2f4;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = this.f33238x44a0a2f4;
        if ((str3 == null || str3.length() == 0) && ((str = this.f33237x3accbfe1) == null || str.length() == 0)) {
            str2 = "both arguments are null";
        } else {
            java.lang.String str4 = this.f33238x44a0a2f4;
            if (str4 == null || str4.length() <= 10240) {
                java.lang.String str5 = this.f33237x3accbfe1;
                if (str5 == null || str5.length() <= 10240) {
                    return true;
                }
                str2 = "checkArgs fail, videoLowBandUrl is too long";
            } else {
                str2 = "checkArgs fail, videoUrl is too long";
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxvideoobject_videoUrl", this.f33238x44a0a2f4);
        bundle.putString("_wxvideoobject_videoLowBandUrl", this.f33237x3accbfe1);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 4;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33238x44a0a2f4 = bundle.getString("_wxvideoobject_videoUrl");
        this.f33237x3accbfe1 = bundle.getString("_wxvideoobject_videoLowBandUrl");
    }
}
