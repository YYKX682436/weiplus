package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXWebpageObject */
/* loaded from: classes9.dex */
public class C11300x89dbd7a1 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33244x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXWebpageObject";

    /* renamed from: canvasPageXml */
    public java.lang.String f33245xc682a690;

    /* renamed from: extInfo */
    public java.lang.String f33246xb2206a6f;

    /* renamed from: webpageUrl */
    public java.lang.String f33249xa1713a8c;

    /* renamed from: isSecretMessage */
    public boolean f33248x3982ba2d = false;

    /* renamed from: extraInfoMap */
    public java.util.HashMap<java.lang.String, java.lang.String> f33247xbf89b39e = null;

    public C11300x89dbd7a1() {
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        java.lang.String str = this.f33249xa1713a8c;
        if (str != null && str.length() != 0 && this.f33249xa1713a8c.length() <= 10240) {
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, webpageUrl is invalid");
        return false;
    }

    /* renamed from: getExtra */
    public java.lang.String m48481x74653a5a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.f33247xbf89b39e;
        if (hashMap == null) {
            return null;
        }
        java.lang.String str3 = hashMap.get(str);
        return str3 != null ? str3 : str2;
    }

    /* renamed from: putExtra */
    public void m48482x69b38241(java.lang.String str, java.lang.String str2) {
        if (this.f33247xbf89b39e == null) {
            this.f33247xbf89b39e = new java.util.HashMap<>();
        }
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str)) {
            return;
        }
        this.f33247xbf89b39e.put(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxwebpageobject_extInfo", this.f33246xb2206a6f);
        bundle.putString("_wxwebpageobject_webpageUrl", this.f33249xa1713a8c);
        bundle.putString("_wxwebpageobject_canvaspagexml", this.f33245xc682a690);
        bundle.putBoolean("_wxwebpageobject_issecretmsg", this.f33248x3982ba2d);
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.f33247xbf89b39e;
        if (hashMap != null) {
            bundle.putSerializable("_wxwebpageobject_extrainfo", hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33246xb2206a6f = bundle.getString("_wxwebpageobject_extInfo");
        this.f33249xa1713a8c = bundle.getString("_wxwebpageobject_webpageUrl");
        this.f33245xc682a690 = bundle.getString("_wxwebpageobject_canvaspagexml");
        this.f33248x3982ba2d = bundle.getBoolean("_wxwebpageobject_issecretmsg");
        java.io.Serializable serializable = bundle.getSerializable("_wxwebpageobject_extrainfo");
        if (serializable != null) {
            this.f33247xbf89b39e = (java.util.HashMap) serializable;
        }
    }

    public C11300x89dbd7a1(java.lang.String str) {
        this.f33249xa1713a8c = str;
    }
}
