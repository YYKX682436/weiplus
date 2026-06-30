package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject */
/* loaded from: classes9.dex */
public class C11287xc333feeb implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: MINIPROGRAM_TYPE_PREVIEW */
    public static final int f33168x939b1075 = 2;

    /* renamed from: MINIPROGRAM_TYPE_TEST */
    public static final int f33169xf4a016e5 = 1;

    /* renamed from: MINIPTOGRAM_TYPE_RELEASE */
    public static final int f33170x82e81836 = 0;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXMiniProgramObject";

    /* renamed from: path */
    public java.lang.String f33176x346425;

    /* renamed from: userName */
    public java.lang.String f33177xf01afcf6;

    /* renamed from: webpageUrl */
    public java.lang.String f33178xa1713a8c;

    /* renamed from: withShareTicket */
    public boolean f33179x4d2e325;

    /* renamed from: miniprogramType */
    public int f33175xc6c9cf27 = 0;

    /* renamed from: disableforward */
    public int f33171xd24bdadd = 0;

    /* renamed from: isUpdatableMessage */
    public boolean f33174x3bf6f1fb = false;

    /* renamed from: isSecretMessage */
    public boolean f33173x3982ba2d = false;

    /* renamed from: extraInfoMap */
    private java.util.HashMap<java.lang.String, java.lang.String> f33172xbf89b39e = null;

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str;
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33178xa1713a8c)) {
            str = "webPageUrl is null";
        } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33177xf01afcf6)) {
            str = "userName is null";
        } else {
            int i17 = this.f33175xc6c9cf27;
            if (i17 >= 0 && i17 <= 2) {
                return true;
            }
            str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    /* renamed from: getExtra */
    public java.lang.String m48473x74653a5a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.f33172xbf89b39e;
        if (hashMap == null) {
            return null;
        }
        java.lang.String str3 = hashMap.get(str);
        return str3 != null ? str3 : str2;
    }

    /* renamed from: putExtra */
    public void m48474x69b38241(java.lang.String str, java.lang.String str2) {
        if (this.f33172xbf89b39e == null) {
            this.f33172xbf89b39e = new java.util.HashMap<>();
        }
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str)) {
            return;
        }
        this.f33172xbf89b39e.put(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxminiprogram_webpageurl", this.f33178xa1713a8c);
        bundle.putString("_wxminiprogram_username", this.f33177xf01afcf6);
        bundle.putString("_wxminiprogram_path", this.f33176x346425);
        bundle.putBoolean("_wxminiprogram_withsharetiket", this.f33179x4d2e325);
        bundle.putInt("_wxminiprogram_type", this.f33175xc6c9cf27);
        bundle.putInt("_wxminiprogram_disableforward", this.f33171xd24bdadd);
        bundle.putBoolean("_wxminiprogram_isupdatablemsg", this.f33174x3bf6f1fb);
        bundle.putBoolean("_wxminiprogram_issecretmsg", this.f33173x3982ba2d);
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.f33172xbf89b39e;
        if (hashMap != null) {
            bundle.putSerializable("_wxminiprogram_extrainfo", hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 36;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33178xa1713a8c = bundle.getString("_wxminiprogram_webpageurl");
        this.f33177xf01afcf6 = bundle.getString("_wxminiprogram_username");
        this.f33176x346425 = bundle.getString("_wxminiprogram_path");
        this.f33179x4d2e325 = bundle.getBoolean("_wxminiprogram_withsharetiket");
        this.f33175xc6c9cf27 = bundle.getInt("_wxminiprogram_type");
        this.f33171xd24bdadd = bundle.getInt("_wxminiprogram_disableforward");
        this.f33174x3bf6f1fb = bundle.getBoolean("_wxminiprogram_isupdatablemsg");
        this.f33173x3982ba2d = bundle.getBoolean("_wxminiprogram_issecretmsg");
        this.f33172xbf89b39e = (java.util.HashMap) bundle.getSerializable("_wxminiprogram_extrainfo");
    }
}
