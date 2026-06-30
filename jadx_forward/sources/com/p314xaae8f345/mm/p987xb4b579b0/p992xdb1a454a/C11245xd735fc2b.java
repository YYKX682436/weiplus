package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo */
/* loaded from: classes9.dex */
public class C11245xd735fc2b extends com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef {

    /* renamed from: LENGTH_LIMIT */
    private static final int f32938x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelJumpMiniProgramInfo";

    /* renamed from: path */
    public java.lang.String f32939x346425;

    /* renamed from: username */
    public java.lang.String f32940xf02988d6;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: checkArgs */
    public boolean mo48432x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f32940xf02988d6;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, username is null";
        } else {
            java.lang.String str3 = this.f32939x346425;
            if (str3 == null || str3.length() < 10240) {
                return super.mo48432x17b96605();
            }
            str = "checkArgs fail, path is invalid";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: serialize */
    public void mo48433xddd166e0(android.os.Bundle bundle) {
        super.mo48433xddd166e0(bundle);
        bundle.putString("wx_channel_jump_mini_program_username", this.f32940xf02988d6);
        bundle.putString("wx_channel_jump_mini_program_path", this.f32939x346425);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: type */
    public int mo48434x368f3a() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5
    /* renamed from: unserialize */
    public void mo48435xe1e5b467(android.os.Bundle bundle) {
        super.mo48435xe1e5b467(bundle);
        this.f32940xf02988d6 = bundle.getString("wx_channel_jump_mini_program_username");
        this.f32939x346425 = bundle.getString("wx_channel_jump_mini_program_path");
    }
}
