package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f265949f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, java.lang.String str, java.lang.String str2) {
        this.f265949f = activityC19366xa1004627;
        this.f265947d = str;
        this.f265948e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f265949f;
        if (activityC19366xa1004627.s9() != null) {
            nw4.n s96 = activityC19366xa1004627.s9();
            if (!s96.f422428i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onChatSearchDataReady fail, not ready");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onChatSearchDataReady success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", this.f265947d);
            hashMap.put("requestId", this.f265948e);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.f1(s96, nw4.x2.c("onChatSearchDataReady", hashMap, s96.f422436q, s96.f422437r)));
        }
    }
}
