package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject */
/* loaded from: classes9.dex */
public class C11275x4f8e5c4f extends com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXDynamicVideoMiniProgramObject";

    /* renamed from: appThumbUrl */
    public java.lang.String f33073x89f970fa;

    /* renamed from: videoSource */
    public java.lang.String f33074x3de4e076;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33178xa1713a8c)) {
            str = "webPageUrl is null";
        } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33177xf01afcf6)) {
            str = "userName is null";
        } else {
            int i17 = this.f33175xc6c9cf27;
            if (i17 >= 0 && i17 <= 2) {
                return true;
            }
            str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxminiprogram_webpageurl", this.f33178xa1713a8c);
        bundle.putString("_wxminiprogram_username", this.f33177xf01afcf6);
        bundle.putString("_wxminiprogram_path", this.f33176x346425);
        bundle.putString("_wxminiprogram_videoSource", this.f33074x3de4e076);
        bundle.putString("_wxminiprogram_appThumbUrl", this.f33073x89f970fa);
        bundle.putBoolean("_wxminiprogram_withsharetiket", this.f33179x4d2e325);
        bundle.putInt("_wxminiprogram_type", this.f33175xc6c9cf27);
        bundle.putInt("_wxminiprogram_disableforward", this.f33171xd24bdadd);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 46;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33178xa1713a8c = bundle.getString("_wxminiprogram_webpageurl");
        this.f33177xf01afcf6 = bundle.getString("_wxminiprogram_username");
        this.f33176x346425 = bundle.getString("_wxminiprogram_path");
        this.f33074x3de4e076 = bundle.getString("_wxminiprogram_videoSource");
        this.f33073x89f970fa = bundle.getString("_wxminiprogram_appThumbUrl");
        this.f33179x4d2e325 = bundle.getBoolean("_wxminiprogram_withsharetiket");
        this.f33175xc6c9cf27 = bundle.getInt("_wxminiprogram_type");
        this.f33171xd24bdadd = bundle.getInt("_wxminiprogram_disableforward");
    }
}
