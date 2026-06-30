package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.l24 f266626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 f266628f;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 g2Var, r45.l24 l24Var, java.lang.String str) {
        this.f266628f = g2Var;
        this.f266626d = l24Var;
        this.f266627e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.l24 l24Var = this.f266626d;
        java.util.LinkedList linkedList = l24Var.f460621f;
        java.lang.String str = l24Var.f460622g;
        java.lang.String str2 = l24Var.f460623h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g2 g2Var = this.f266628f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6 x6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6(g2Var.f266658d.f266508d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e8 e8Var = g2Var.f266656b;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
            g2Var.f266658d.i5(g2Var.f266655a, "login:fail", null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
        } else {
            if (x6Var.a(linkedList, str, str2, null, e2Var)) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a2) e8Var).a();
        }
    }
}
