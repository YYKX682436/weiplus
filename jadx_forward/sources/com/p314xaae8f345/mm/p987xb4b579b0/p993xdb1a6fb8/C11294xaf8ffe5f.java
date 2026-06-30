package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo */
/* loaded from: classes9.dex */
public class C11294xaf8ffe5f implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33216x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";

    /* renamed from: jumpUrl */
    public java.lang.String f33217xb52fc261;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: checkArgs */
    public boolean mo48476x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33217xb52fc261;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, jumpUrl is null";
        } else {
            if (this.f33217xb52fc261.length() < 10240) {
                return true;
            }
            str = "checkArgs fail, jumpUrl is invalid";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: serialize */
    public void mo48477xddd166e0(android.os.Bundle bundle) {
        bundle.putString("wx_state_jump_url", this.f33217xb52fc261);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: type */
    public int mo48478x368f3a() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: unserialize */
    public void mo48479xe1e5b467(android.os.Bundle bundle) {
        this.f33217xb52fc261 = bundle.getString("wx_state_jump_url", "");
    }
}
