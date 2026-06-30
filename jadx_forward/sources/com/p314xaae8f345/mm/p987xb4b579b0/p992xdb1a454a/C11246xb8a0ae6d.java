package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo */
/* loaded from: classes9.dex */
public class C11246xb8a0ae6d extends com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef {

    /* renamed from: LENGTH_LIMIT */
    private static final int f32941x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelJumpUrlInfo";
    public java.lang.String url;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: checkArgs */
    public boolean mo48432x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.url;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, url is null";
        } else {
            if (this.url.length() < 10240) {
                return true;
            }
            str = "checkArgs fail, url is invalid";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: serialize */
    public void mo48433xddd166e0(android.os.Bundle bundle) {
        super.mo48433xddd166e0(bundle);
        bundle.putString("wx_channel_jump_url", this.url);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: type */
    public int mo48434x368f3a() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: unserialize */
    public void mo48435xe1e5b467(android.os.Bundle bundle) {
        super.mo48435xe1e5b467(bundle);
        this.url = bundle.getString("wx_channel_jump_url");
    }
}
