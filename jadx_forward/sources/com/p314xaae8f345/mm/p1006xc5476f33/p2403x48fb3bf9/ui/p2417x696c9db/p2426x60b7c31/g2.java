package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public class g2 implements k80.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 f266656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266658d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var, java.lang.String str) {
        this.f266658d = c1Var;
        this.f266655a = y2Var;
        this.f266656b = e8Var;
        this.f266657c = str;
    }

    @Override // k80.j
    public void a(int i17, int i18, java.lang.String str, k80.k kVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = this.f266656b;
        nw4.y2 y2Var = this.f266655a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266658d;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "login:fail", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            return;
        }
        if (kVar instanceof k80.k) {
            r45.l24 H = ((bl0.c) kVar).H();
            r45.j14 j14Var = H.f460619d;
            int i19 = j14Var.f459024d;
            java.lang.String str2 = j14Var.f459025e;
            java.lang.String str3 = H.f460628p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "NetSceneJSLogin jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 == -12000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f2(this, H, str3));
                return;
            }
            if (i19 != 0) {
                c1Var.i5(y2Var, "login:fail", null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSLogin %s", str2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            } else {
                java.lang.String str4 = H.f460620e;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("code", str4);
                c1Var.i5(y2Var, "login:ok", hashMap);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            }
        }
    }
}
