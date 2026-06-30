package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo */
/* loaded from: classes9.dex */
public class C11293xb6173a1d implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";

    /* renamed from: miniProgramType */
    public int f33213x2a337707;

    /* renamed from: path */
    public java.lang.String f33214x346425;

    /* renamed from: username */
    public java.lang.String f33215xf02988d6;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: checkArgs */
    public boolean mo48476x17b96605() {
        java.lang.String str = this.f33215xf02988d6;
        if (str != null && str.length() > 0) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, username is null");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: serialize */
    public void mo48477xddd166e0(android.os.Bundle bundle) {
        bundle.putString("wx_state_jump_mini_program_username", this.f33215xf02988d6);
        bundle.putString("wx_state_jump_mini_program_path", this.f33214x346425);
        bundle.putInt("wx_state_jump_mini_program_type", this.f33213x2a337707);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: type */
    public int mo48478x368f3a() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo
    /* renamed from: unserialize */
    public void mo48479xe1e5b467(android.os.Bundle bundle) {
        this.f33215xf02988d6 = bundle.getString("wx_state_jump_mini_program_username", "");
        this.f33214x346425 = bundle.getString("wx_state_jump_mini_program_path", "");
        this.f33213x2a337707 = bundle.getInt("wx_state_jump_mini_program_type", 0);
    }
}
