package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo */
/* loaded from: classes9.dex */
public abstract class AbstractC11243x2a15bef implements com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5 {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelBaseJumpInfo";

    /* renamed from: WORDING_LENGTH_LIMIT */
    private static final int f32931x2d00569 = 1024;

    /* renamed from: extra */
    public java.lang.String f32932x5c79410;

    /* renamed from: wording */
    public java.lang.String f32933x5ae4fc98;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: checkArgs */
    public boolean mo48432x17b96605() {
        java.lang.String str = this.f32933x5ae4fc98;
        if (str == null || str.length() < 1024) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, wording is invalid");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: serialize */
    public void mo48433xddd166e0(android.os.Bundle bundle) {
        bundle.putString("wx_channel_jump_base_wording", this.f32933x5ae4fc98);
        bundle.putString("wx_channel_jump_base_extra", this.f32932x5c79410);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: unserialize */
    public void mo48435xe1e5b467(android.os.Bundle bundle) {
        this.f32933x5ae4fc98 = bundle.getString("wx_channel_jump_base_wording");
        this.f32932x5c79410 = bundle.getString("wx_channel_jump_base_extra");
    }
}
