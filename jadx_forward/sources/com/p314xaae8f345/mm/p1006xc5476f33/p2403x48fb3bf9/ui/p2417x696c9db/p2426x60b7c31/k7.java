package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class k7 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266769e;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266769e = c1Var;
        this.f266768d = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        nw4.y2 y2Var = this.f266768d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266769e;
        if (i17 == 0 && i18 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ticket", ((r45.aa3) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c1) m1Var).f264349e.f152244b.f152233a).f451402d);
            c1Var.i5(y2Var, "get_wechat_verify_ticket:ok ticket", hashMap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doGetWechatVerifyTicket, errType = " + i17 + ", errCode = " + i18);
            c1Var.i5(y2Var, "get_wechat_verify_ticket:fail ticket", null);
        }
        gm0.j1.d().q(1097, this);
    }
}
