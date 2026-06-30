package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public class e2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f2 f266599a;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f2 f2Var) {
        this.f266599a = f2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f2 f2Var = this.f266599a;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "press back button!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 g2Var = f2Var.f266628f;
            g2Var.f266658d.i5(g2Var.f266655a, "login:fail auth cancel", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) f2Var.f266628f.f266656b).a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 g2Var2 = f2Var.f266628f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = g2Var2.f266658d;
        java.lang.String str = g2Var2.f266657c;
        java.lang.String str2 = f2Var.f266627e;
        nw4.y2 y2Var = g2Var2.f266655a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = g2Var2.f266656b;
        c1Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d2(c1Var, y2Var, e8Var, i17);
        ((j80.e) eVar).getClass();
        d17.g(new bl0.d(str, linkedList, 0, str2, 0, i17, -1, d2Var));
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "fail auth deny!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 g2Var3 = f2Var.f266628f;
            g2Var3.f266658d.i5(g2Var3.f266655a, "login:fail auth deny", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) f2Var.f266628f.f266656b).a();
        }
    }
}
