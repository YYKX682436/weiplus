package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f265908e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74, java.lang.String str) {
        this.f265908e = abstractActivityC19367xd1ae8c74;
        this.f265907d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n s96 = this.f265908e.s9();
        boolean z17 = s96.f422428i;
        java.lang.String str = this.f265907d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onCurrentLocationReady success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.a1(s96, nw4.x2.c("onCurrentLocationReady", hashMap, s96.f422436q, s96.f422437r)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, not ready");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onCurrentLocationReady, json = %s", str);
    }
}
