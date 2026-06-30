package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class g4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266663e;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266663e = c1Var;
        this.f266662d = y2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.b bVar = (pr4.b) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "[WeCoin] consumeWeCoin onSuccess, data:%s", java.lang.Long.valueOf(bVar.f439519a));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("balance", java.lang.Long.valueOf(bVar.f439519a));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f266662d;
        sb6.append(y2Var.f422552i);
        sb6.append(":ok");
        this.f266663e.i5(y2Var, sb6.toString(), hashMap);
        return null;
    }
}
