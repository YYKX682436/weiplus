package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes15.dex */
public class w1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x1 f267022a;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x1 x1Var) {
        this.f267022a = x1Var;
    }

    public void a(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x1 x1Var = this.f267022a;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4.c(x1Var.f267050g.f267082f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var = x1Var.f267050g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = y1Var.f267090q;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J3(c1Var, y1Var.f267080d, c1Var.f266517o, 1);
        } else if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var2 = x1Var.f267050g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var2 = y1Var2.f267090q;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J3(c1Var2, y1Var2.f267080d, c1Var2.f266517o, 2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var3 = x1Var.f267050g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var3 = y1Var3.f267090q;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J3(c1Var3, y1Var3.f267080d, c1Var3.f266517o, 3);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x1Var.f267050g.f267083g);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var4 = x1Var.f267050g;
        if (K0) {
            if (z17) {
                y1Var4.f267090q.i5(y1Var4.f267081e, "launchApplication:ok", null);
                return;
            } else {
                y1Var4.f267090q.i5(y1Var4.f267081e, "launchApplication:fail", null);
                return;
            }
        }
        if (z18) {
            y1Var4.f267090q.i5(y1Var4.f267081e, "launchApplication:ok", null);
        } else if (z19) {
            y1Var4.f267090q.i5(y1Var4.f267081e, "launchApplication:cancel", null);
        } else {
            y1Var4.f267090q.i5(y1Var4.f267081e, "launchApplication:fail", null);
        }
    }
}
