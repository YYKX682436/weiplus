package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class l0 implements com.p314xaae8f345.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264084a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        this.f264084a = e0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.e8
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onKeyBoardStateChange, state = " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264084a;
        if (!e0Var.U) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "background ignored");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf = e0Var.f263720u;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = e0Var.M;
        if (i17 == -3) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.n0(e0Var, c19330x7ca5b1cf.m74396xfc829cc4()));
        } else {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p0(e0Var));
        }
        if (i17 != -3) {
            e0Var.r(0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = e0Var.f263721v;
        if (c19493xb618544c != null && c19493xb618544c.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c2 = e0Var.f263721v;
            if (c19493xb618544c2.f268822s) {
                c19493xb618544c2.setVisibility(8);
            }
            c19493xb618544c2.f268813g = 0;
            c19493xb618544c2.b();
        }
        e0Var.r(e0Var.f263720u.m74396xfc829cc4());
    }
}
