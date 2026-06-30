package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject */
/* loaded from: classes9.dex */
public class C11278x53a16a89 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEmojiSharedObject";

    /* renamed from: packageflag */
    public int f33084x3635a0b2;

    /* renamed from: packageid */
    public java.lang.String f33085x6b6947e1;

    /* renamed from: thumburl */
    public java.lang.String f33086x5d65bbd9;
    public java.lang.String url;

    public C11278x53a16a89() {
    }

    public C11278x53a16a89(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f33086x5d65bbd9 = str;
        this.f33084x3635a0b2 = i17;
        this.f33085x6b6947e1 = str2;
        this.url = str3;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        if (!android.text.TextUtils.isEmpty(this.f33085x6b6947e1) && !android.text.TextUtils.isEmpty(this.f33086x5d65bbd9) && !android.text.TextUtils.isEmpty(this.url) && this.f33084x3635a0b2 != -1) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, packageid or thumburl is invalid");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxemojisharedobject_thumburl", this.f33086x5d65bbd9);
        bundle.putInt("_wxemojisharedobject_packageflag", this.f33084x3635a0b2);
        bundle.putString("_wxemojisharedobject_packageid", this.f33085x6b6947e1);
        bundle.putString("_wxemojisharedobject_url", this.url);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 15;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33086x5d65bbd9 = bundle.getString("_wxwebpageobject_thumburl");
        this.f33084x3635a0b2 = bundle.getInt("_wxwebpageobject_packageflag");
        this.f33085x6b6947e1 = bundle.getString("_wxwebpageobject_packageid");
        this.url = bundle.getString("_wxwebpageobject_url");
    }
}
