package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class f4 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266634b;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266634b = c1Var;
        this.f266633a = y2Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "[WeCoin] showRechargeFoodsDialog onFailed,errorType:%s,errorCode:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266634b;
        nw4.y2 y2Var = this.f266633a;
        if (i18 == -3) {
            c1Var.i5(y2Var, y2Var.f422552i + ":cancel", null);
            return;
        }
        c1Var.i5(y2Var, y2Var.f422552i + ":fail", null);
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "[WeCoin] showRechargeFoodsDialog onSuccess,data:%s", (java.lang.Void) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f266633a;
        sb6.append(y2Var.f422552i);
        sb6.append(":ok");
        this.f266634b.i5(y2Var, sb6.toString(), null);
    }
}
