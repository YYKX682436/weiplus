package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject */
/* loaded from: classes9.dex */
public class C11274x8f3c4310 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEmojiSharedObject";

    /* renamed from: designerName */
    public java.lang.String f33069x85f9d816;

    /* renamed from: designerRediretctUrl */
    public java.lang.String f33070x121027c0;

    /* renamed from: designerUIN */
    public int f33071xca84056f;

    /* renamed from: thumburl */
    public java.lang.String f33072x5d65bbd9;
    public java.lang.String url;

    public C11274x8f3c4310() {
    }

    public C11274x8f3c4310(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.url = str2;
        this.f33072x5d65bbd9 = str;
        this.f33071xca84056f = i17;
        this.f33069x85f9d816 = str3;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        if (this.f33071xca84056f != 0 && !android.text.TextUtils.isEmpty(this.f33072x5d65bbd9) && !android.text.TextUtils.isEmpty(this.url)) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, packageid or thumburl is invalid");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxemojisharedobject_thumburl", this.f33072x5d65bbd9);
        bundle.putInt("_wxemojisharedobject_designer_uin", this.f33071xca84056f);
        bundle.putString("_wxemojisharedobject_designer_name", this.f33069x85f9d816);
        bundle.putString("_wxemojisharedobject_designer_rediretcturl", this.f33070x121027c0);
        bundle.putString("_wxemojisharedobject_url", this.url);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 25;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33072x5d65bbd9 = bundle.getString("_wxwebpageobject_thumburl");
        this.f33071xca84056f = bundle.getInt("_wxemojisharedobject_designer_uin");
        this.f33069x85f9d816 = bundle.getString("_wxemojisharedobject_designer_name");
        this.f33070x121027c0 = bundle.getString("_wxemojisharedobject_designer_rediretcturl");
        this.url = bundle.getString("_wxwebpageobject_url");
    }
}
