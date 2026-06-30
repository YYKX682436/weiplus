package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f265957e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, java.lang.String str) {
        this.f265957e = activityC19366xa1004627;
        this.f265956d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f265957e;
        if (activityC19366xa1004627.s9() != null) {
            nw4.n s96 = activityC19366xa1004627.s9();
            java.lang.String str = this.f265956d;
            if (!s96.f422428i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, not ready");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onSearchHistoryReady success, ready");
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.y0(s96, nw4.x2.d("onSearchHistoryReady", new org.json.JSONObject(str), s96.f422436q, s96.f422437r)));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
