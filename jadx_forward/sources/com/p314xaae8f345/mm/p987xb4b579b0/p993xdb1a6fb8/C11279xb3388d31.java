package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject */
/* loaded from: classes9.dex */
public class C11279xb3388d31 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33087x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEnterpriseCardObject";

    /* renamed from: cardInfo */
    public java.lang.String f33088xff7d4bde;

    /* renamed from: msgType */
    public int f33089x5018025b;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str = this.f33088xff7d4bde;
        if (str != null && str.length() != 0) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, cardInfo is invalid");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putInt("_wxenterprisecard_msgtype", this.f33089x5018025b);
        bundle.putString("_wxenterprisecard_cardinfo", this.f33088xff7d4bde);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 45;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33089x5018025b = bundle.getInt("_wxenterprisecard_msgtype");
        this.f33088xff7d4bde = bundle.getString("_wxenterprisecard_cardinfo");
    }
}
