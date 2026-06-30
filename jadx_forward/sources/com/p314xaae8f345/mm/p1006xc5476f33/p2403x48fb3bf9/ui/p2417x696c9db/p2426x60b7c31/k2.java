package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public class k2 implements k80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 f266759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266761d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var, java.lang.String str) {
        this.f266761d = c1Var;
        this.f266758a = y2Var;
        this.f266759b = e8Var;
        this.f266760c = str;
    }

    @Override // k80.f
    public void a(int i17, int i18, java.lang.String str, k80.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = this.f266759b;
        nw4.y2 y2Var = this.f266758a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266761d;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "authorize:fail", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            return;
        }
        if (gVar instanceof k80.g) {
            r45.h24 h24Var = (r45.h24) ((bl0.a) gVar).f103209d.f152244b.f152233a;
            r45.j14 j14Var = h24Var.f457306d;
            int i19 = j14Var.f459024d;
            java.lang.String str2 = j14Var.f459025e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "NetSceneJSAuthorize jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 == -12000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j2(this, h24Var));
                return;
            }
            if (i19 == 0) {
                c1Var.i5(y2Var, "authorize:ok", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSAuthorize ERROR %s", str2);
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            }
        }
    }
}
