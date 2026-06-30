package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo */
/* loaded from: classes9.dex */
public class C11290x5453c607 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXMusicVipObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33205x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMusicVipInfo";

    /* renamed from: musicId */
    public java.lang.String f33206x54340220;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXMusicVipObject
    /* renamed from: checkArgs */
    public boolean mo48441x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33206x54340220;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, musicId is null";
        } else {
            if (this.f33206x54340220.length() <= 10240) {
                return true;
            }
            str = "checkArgs fail, musicId length is larger than 1024";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXMusicVipObject
    /* renamed from: serialize */
    public void mo48442xddd166e0(android.os.Bundle bundle) {
        bundle.putString("wx_music_vip_id", this.f33206x54340220);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXMusicVipObject
    /* renamed from: unserialize */
    public void mo48443xe1e5b467(android.os.Bundle bundle) {
        this.f33206x54340220 = bundle.getString("wx_music_vip_id", "");
    }
}
