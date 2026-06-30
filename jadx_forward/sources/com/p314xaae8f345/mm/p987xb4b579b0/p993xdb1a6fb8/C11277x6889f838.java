package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject */
/* loaded from: classes9.dex */
public class C11277x6889f838 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXEmojiSharedObject";

    /* renamed from: desc */
    public java.lang.String f33078x2efe91;

    /* renamed from: iconUrl */
    public java.lang.String f33079x61ad9236;

    /* renamed from: pageType */
    public int f33080x333a8669;

    /* renamed from: secondUrl */
    public java.lang.String f33081xcf44445b;
    public int tid;

    /* renamed from: title */
    public java.lang.String f33082x6942258;

    /* renamed from: type */
    public int f33083x368f3a;
    public java.lang.String url;

    public C11277x6889f838() {
    }

    public C11277x6889f838(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i19, java.lang.String str5) {
        this.tid = i18;
        this.f33082x6942258 = str;
        this.f33078x2efe91 = str2;
        this.f33079x61ad9236 = str3;
        this.f33081xcf44445b = str4;
        this.f33080x333a8669 = i19;
        this.url = str5;
        this.f33083x368f3a = i17;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33082x6942258) && !com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33079x61ad9236)) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, title or iconUrl is invalid");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putInt("_wxemojisharedobject_tid", this.tid);
        bundle.putString("_wxemojisharedobject_title", this.f33082x6942258);
        bundle.putString("_wxemojisharedobject_desc", this.f33078x2efe91);
        bundle.putString("_wxemojisharedobject_iconurl", this.f33079x61ad9236);
        bundle.putString("_wxemojisharedobject_secondurl", this.f33081xcf44445b);
        bundle.putInt("_wxemojisharedobject_pagetype", this.f33080x333a8669);
        bundle.putString("_wxwebpageobject_url", this.url);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return this.f33083x368f3a;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.tid = bundle.getInt("_wxemojisharedobject_tid");
        this.f33082x6942258 = bundle.getString("_wxemojisharedobject_title");
        this.f33078x2efe91 = bundle.getString("_wxemojisharedobject_desc");
        this.f33079x61ad9236 = bundle.getString("_wxemojisharedobject_iconurl");
        this.f33081xcf44445b = bundle.getString("_wxemojisharedobject_secondurl");
        this.f33080x333a8669 = bundle.getInt("_wxemojisharedobject_pagetype");
        this.url = bundle.getString("_wxwebpageobject_url");
    }
}
