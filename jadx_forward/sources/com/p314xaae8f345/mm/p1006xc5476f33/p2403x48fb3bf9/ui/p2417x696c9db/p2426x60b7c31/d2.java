package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public class d2 implements k80.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 f266578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f266579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266580d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var, int i17) {
        this.f266580d = c1Var;
        this.f266577a = y2Var;
        this.f266578b = e8Var;
        this.f266579c = i17;
    }

    @Override // k80.l
    public void a(int i17, int i18, java.lang.String str, k80.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        nw4.y2 y2Var = this.f266577a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266580d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = this.f266578b;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "login:fail", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            return;
        }
        if (mVar instanceof k80.m) {
            if (this.f266579c == 2) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
                return;
            }
            r45.j24 H = ((bl0.d) mVar).H();
            r45.j14 j14Var = H.f459042d;
            int i19 = j14Var.f459024d;
            java.lang.String str2 = j14Var.f459025e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "stev NetSceneJSLoginConfirm jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 != 0) {
                c1Var.i5(y2Var, "login:fail", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSLoginConfirm %s", str2);
            } else {
                java.lang.String str3 = H.f459043e;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("code", str3);
                c1Var.i5(y2Var, "login:ok", hashMap);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            }
        }
    }
}
