package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo */
/* loaded from: classes9.dex */
public class C11292x2902f812 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";

    /* renamed from: USERNAME_LENGTH_LIMIT */
    private static final int f33211x86e71dcb = 1024;

    /* renamed from: username */
    public java.lang.String f33212xf02988d6;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: checkArgs */
    public boolean mo48476x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33212xf02988d6;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, username is null";
        } else {
            if (this.f33212xf02988d6.length() < 1024) {
                return true;
            }
            str = "checkArgs fail, username length exceed limit";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: serialize */
    public void mo48477xddd166e0(android.os.Bundle bundle) {
        bundle.putString("wx_state_jump_channel_profile_username", this.f33212xf02988d6);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: type */
    public int mo48478x368f3a() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: unserialize */
    public void mo48479xe1e5b467(android.os.Bundle bundle) {
        this.f33212xf02988d6 = bundle.getString("wx_state_jump_channel_profile_username", "");
    }
}
