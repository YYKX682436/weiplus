package com.tencent.mm.opensdk.modelmsg;

/* loaded from: classes8.dex */
public class WXGameLiveObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXGameObject";
    public java.util.HashMap<java.lang.String, java.lang.String> extraInfoMap = new java.util.HashMap<>();

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    public java.lang.String getExtra(java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.extraInfoMap;
        if (hashMap == null) {
            return null;
        }
        java.lang.String str3 = hashMap.get(str);
        return str3 != null ? str3 : str2;
    }

    public void putExtra(java.lang.String str, java.lang.String str2) {
        if (this.extraInfoMap == null) {
            this.extraInfoMap = new java.util.HashMap<>();
        }
        if (com.tencent.mm.opensdk.utils.d.b(str)) {
            return;
        }
        this.extraInfoMap.put(str, str2);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(android.os.Bundle bundle) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            bundle.putSerializable("_wxgame_extrainfo", hashMap);
        }
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 70;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle bundle) {
        this.extraInfoMap = (java.util.HashMap) bundle.getSerializable("_wxgame_extrainfo");
    }
}
