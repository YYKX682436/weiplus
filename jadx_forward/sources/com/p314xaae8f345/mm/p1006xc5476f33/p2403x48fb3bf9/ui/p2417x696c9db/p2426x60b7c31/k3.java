package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class k3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266763b;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266763b = c1Var;
        this.f266762a = y2Var;
    }

    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "success:%b, data:%s", java.lang.Boolean.valueOf(z17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266763b;
        nw4.y2 y2Var = this.f266762a;
        if (!z17) {
            c1Var.i5(y2Var, y2Var.f422552i + ":fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        c1Var.i5(y2Var, y2Var.f422552i + ":ok", hashMap);
    }
}
