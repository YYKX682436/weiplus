package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXLiteAppObject */
/* loaded from: classes9.dex */
public class C11284xc62f1a51 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXLiteAppObject";

    /* renamed from: path */
    public java.lang.String f33107x346425;

    /* renamed from: query */
    public java.lang.String f33108x66f18c8;

    /* renamed from: source */
    public int f33109xca90681b;

    /* renamed from: userName */
    public java.lang.String f33110xf01afcf6;

    /* renamed from: webpageUrl */
    public java.lang.String f33111xa1713a8c;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33110xf01afcf6)) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "userName is null");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxliteapp_webpageurl", this.f33111xa1713a8c);
        bundle.putString("_wxliteapp_username", this.f33110xf01afcf6);
        bundle.putString("_wxliteapp_path", this.f33107x346425);
        bundle.putString("_wxliteapp_query", this.f33108x66f18c8);
        bundle.putInt("_wxliteapp_source", this.f33109xca90681b);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 68;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33111xa1713a8c = bundle.getString("_wxliteapp_webpageurl");
        this.f33110xf01afcf6 = bundle.getString("_wxliteapp_username");
        this.f33107x346425 = bundle.getString("_wxliteapp_path");
        this.f33108x66f18c8 = bundle.getString("_wxliteapp_query");
        this.f33109xca90681b = bundle.getInt("_wxliteapp_source");
    }
}
