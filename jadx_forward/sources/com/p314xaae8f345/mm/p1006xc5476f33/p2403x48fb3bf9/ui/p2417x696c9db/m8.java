package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f267226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f267227f;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, org.json.JSONArray jSONArray) {
        this.f267225d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267226e = nVar;
        this.f267227f = jSONArray;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267225d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f267226e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        org.json.JSONArray jSONArray = this.f267227f;
        if (jSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, not ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onGetMsgProofItems success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgs", jSONArray);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.b2(nVar, nw4.x2.c("onGetMsgProofItems", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
