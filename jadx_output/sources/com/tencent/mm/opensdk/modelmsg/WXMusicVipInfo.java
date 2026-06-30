package com.tencent.mm.opensdk.modelmsg;

/* loaded from: classes9.dex */
public class WXMusicVipInfo implements com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMusicVipInfo";
    public java.lang.String musicId;

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject
    public boolean checkArgs() {
        java.lang.String str;
        java.lang.String str2 = this.musicId;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, musicId is null";
        } else {
            if (this.musicId.length() <= 10240) {
                return true;
            }
            str = "checkArgs fail, musicId length is larger than 1024";
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject
    public void serialize(android.os.Bundle bundle) {
        bundle.putString("wx_music_vip_id", this.musicId);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject
    public void unserialize(android.os.Bundle bundle) {
        this.musicId = bundle.getString("wx_music_vip_id", "");
    }
}
