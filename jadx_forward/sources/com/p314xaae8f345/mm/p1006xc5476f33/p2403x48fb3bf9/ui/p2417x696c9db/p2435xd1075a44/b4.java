package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class b4 implements com.p314xaae8f345.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf f268645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 f268646b;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var) {
        this.f268645a = c19330x7ca5b1cf;
        this.f268646b = o4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.e8
    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebViewWithController", "onKeyBoardStateChange, state = " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = this.f268646b;
        if (i17 != -3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebViewWithController", "keyboard kbListener onKeyBoardStateChange");
            o4Var.w2(0, true);
        } else {
            int m74396xfc829cc4 = this.f268645a.m74396xfc829cc4();
            if (m74396xfc829cc4 > 0) {
                o4Var.w2(m74396xfc829cc4, true);
            }
        }
    }
}
