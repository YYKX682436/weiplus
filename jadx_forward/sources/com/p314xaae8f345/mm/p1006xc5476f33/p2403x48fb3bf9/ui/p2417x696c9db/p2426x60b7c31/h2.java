package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public class h2 implements k80.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 f266691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f266692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266693d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var, int i17) {
        this.f266693d = c1Var;
        this.f266690a = y2Var;
        this.f266691b = e8Var;
        this.f266692c = i17;
    }

    @Override // k80.h
    public void a(int i17, int i18, java.lang.String str, k80.i iVar) {
        nw4.y2 y2Var = this.f266690a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266693d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = this.f266691b;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "authorize:fail", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            return;
        }
        if (iVar instanceof k80.i) {
            if (this.f266692c == 2) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
                return;
            }
            r45.j14 j14Var = ((r45.f24) ((bl0.b) iVar).f103212d.f152244b.f152233a).f455474d;
            int i19 = j14Var.f459024d;
            java.lang.String str2 = j14Var.f459025e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "NetSceneJSAuthorizeConfirm jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 == 0) {
                c1Var.i5(y2Var, "authorize:ok", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSAuthorizeConfirm ERROR %s", str2);
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
            }
        }
    }
}
