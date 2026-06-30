package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f266035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c f266037f;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c, org.json.JSONArray jSONArray, java.lang.String str) {
        this.f266037f = activityC19380x649e7d5c;
        this.f266035d = jSONArray;
        this.f266036e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f266037f.f265377p0;
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData fail, not ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("items", this.f266035d);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f266036e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.e1(nVar, nw4.x2.c("onGetVertSearchEntriesData", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
