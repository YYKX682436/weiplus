package com.tencent.mm.opensdk.modelmsg;

/* loaded from: classes9.dex */
public class WXMiniProgramObject implements com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject {
    public static final int MINIPROGRAM_TYPE_PREVIEW = 2;
    public static final int MINIPROGRAM_TYPE_TEST = 1;
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMiniProgramObject";
    public java.lang.String path;
    public java.lang.String userName;
    public java.lang.String webpageUrl;
    public boolean withShareTicket;
    public int miniprogramType = 0;
    public int disableforward = 0;
    public boolean isUpdatableMessage = false;
    public boolean isSecretMessage = false;
    private java.util.HashMap<java.lang.String, java.lang.String> extraInfoMap = null;

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        java.lang.String str;
        if (com.tencent.mm.opensdk.utils.d.b(this.webpageUrl)) {
            str = "webPageUrl is null";
        } else if (com.tencent.mm.opensdk.utils.d.b(this.userName)) {
            str = "userName is null";
        } else {
            int i17 = this.miniprogramType;
            if (i17 >= 0 && i17 <= 2) {
                return true;
            }
            str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
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
        bundle.putString("_wxminiprogram_webpageurl", this.webpageUrl);
        bundle.putString("_wxminiprogram_username", this.userName);
        bundle.putString("_wxminiprogram_path", this.path);
        bundle.putBoolean("_wxminiprogram_withsharetiket", this.withShareTicket);
        bundle.putInt("_wxminiprogram_type", this.miniprogramType);
        bundle.putInt("_wxminiprogram_disableforward", this.disableforward);
        bundle.putBoolean("_wxminiprogram_isupdatablemsg", this.isUpdatableMessage);
        bundle.putBoolean("_wxminiprogram_issecretmsg", this.isSecretMessage);
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.extraInfoMap;
        if (hashMap != null) {
            bundle.putSerializable("_wxminiprogram_extrainfo", hashMap);
        }
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 36;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(android.os.Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxminiprogram_webpageurl");
        this.userName = bundle.getString("_wxminiprogram_username");
        this.path = bundle.getString("_wxminiprogram_path");
        this.withShareTicket = bundle.getBoolean("_wxminiprogram_withsharetiket");
        this.miniprogramType = bundle.getInt("_wxminiprogram_type");
        this.disableforward = bundle.getInt("_wxminiprogram_disableforward");
        this.isUpdatableMessage = bundle.getBoolean("_wxminiprogram_isupdatablemsg");
        this.isSecretMessage = bundle.getBoolean("_wxminiprogram_issecretmsg");
        this.extraInfoMap = (java.util.HashMap) bundle.getSerializable("_wxminiprogram_extrainfo");
    }
}
