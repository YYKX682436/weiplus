package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXGameLiveObject */
/* loaded from: classes8.dex */
public class C11281x37e9fa1e implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject {
    private static final java.lang.String TAG = "MicroMsg.SDK.WXGameObject";

    /* renamed from: extraInfoMap */
    public java.util.HashMap<java.lang.String, java.lang.String> f33094xbf89b39e = new java.util.HashMap<>();

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: checkArgs */
    public boolean mo48449x17b96605() {
        return true;
    }

    /* renamed from: getExtra */
    public java.lang.String m48461x74653a5a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.f33094xbf89b39e;
        if (hashMap == null) {
            return null;
        }
        java.lang.String str3 = hashMap.get(str);
        return str3 != null ? str3 : str2;
    }

    /* renamed from: putExtra */
    public void m48462x69b38241(java.lang.String str, java.lang.String str2) {
        if (this.f33094xbf89b39e == null) {
            this.f33094xbf89b39e = new java.util.HashMap<>();
        }
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str)) {
            return;
        }
        this.f33094xbf89b39e.put(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: serialize */
    public void mo48450xddd166e0(android.os.Bundle bundle) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.f33094xbf89b39e;
        if (hashMap != null) {
            bundle.putSerializable("_wxgame_extrainfo", hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: type */
    public int mo14189x368f3a() {
        return 70;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject
    /* renamed from: unserialize */
    public void mo48451xe1e5b467(android.os.Bundle bundle) {
        this.f33094xbf89b39e = (java.util.HashMap) bundle.getSerializable("_wxgame_extrainfo");
    }
}
