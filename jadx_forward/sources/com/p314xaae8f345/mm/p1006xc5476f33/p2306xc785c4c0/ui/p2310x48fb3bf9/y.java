package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class y implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256785a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar) {
        this.f256785a = lVar;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doCallBack, callbackId:%s, ret:%s, retValue:%s", str, str2, map);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        this.f256785a.n(str, hashMap);
    }
}
