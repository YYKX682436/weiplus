package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266885g;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, java.lang.String str, nw4.y2 y2Var) {
        this.f266885g = c1Var;
        this.f266882d = i17;
        this.f266883e = str;
        this.f266884f = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751 c5571xfff98751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751();
        int i17 = this.f266882d;
        am.le leVar = c5571xfff98751.f135891g;
        leVar.f88776a = i17;
        leVar.f88777b = this.f266883e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266885g;
        leVar.f88778c = c1Var.f266508d;
        c5571xfff98751.e();
        am.me meVar = c5571xfff98751.f135892h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "gameCommInfo:%s", meVar.f88874a);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(meVar.f88874a);
        nw4.y2 y2Var = this.f266884f;
        if (K0) {
            c1Var.i5(y2Var, "getGameCommInfo:fail", null);
            return;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject(meVar.f88874a);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            c1Var.i5(y2Var, "getGameCommInfo:ok", hashMap);
        } catch (org.json.JSONException unused) {
            c1Var.i5(y2Var, "getGameCommInfo:fail", null);
        }
    }
}
