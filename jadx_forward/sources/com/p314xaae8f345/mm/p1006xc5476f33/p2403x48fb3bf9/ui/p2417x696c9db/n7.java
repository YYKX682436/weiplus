package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class n7 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f267393a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f267394b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 f267395c;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var) {
        this.f267393a = new java.lang.ref.WeakReference(c6Var);
        this.f267394b = str;
        this.f267395c = k5Var;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6) this.f267393a.get();
        if (c6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "onOpenMaterialsGot, menuHelper is null");
        } else {
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "onOpenMaterialsGot, fail");
                return;
            }
            c6Var.O = this.f267394b;
            c6Var.P = c12473xe2bfc4b5;
            c6Var.q(this.f267395c);
        }
    }
}
