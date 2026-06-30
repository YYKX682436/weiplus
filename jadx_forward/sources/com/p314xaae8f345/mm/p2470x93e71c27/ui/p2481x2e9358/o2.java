package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class o2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272062a;

    public o2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272062a = c19666xfd6e2f33;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272062a;
        c19666xfd6e2f33.V1 = 1;
        c19666xfd6e2f33.y1(true);
        c19666xfd6e2f33.f271572p.setVisibility(8);
        c19666xfd6e2f33.U0(true);
        c19666xfd6e2f33.Q1(com.p314xaae8f345.mm.R.C30861xcebc809e.f562770o3);
        try {
            c19666xfd6e2f33.f271554m.n(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatFooter", e17, "", new java.lang.Object[0]);
        }
        c19666xfd6e2f33.P2.f136579i++;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272062a;
        c19666xfd6e2f33.V1 = 1;
        c19666xfd6e2f33.y1(true);
        c19666xfd6e2f33.f271572p.setVisibility(8);
        c19666xfd6e2f33.U0(true);
        c19666xfd6e2f33.Q1(com.p314xaae8f345.mm.R.C30861xcebc809e.f562770o3);
        android.view.inputmethod.InputConnection mo81352x6a67d012 = c19666xfd6e2f33.f271554m.mo81352x6a67d012();
        if (mo81352x6a67d012 != null) {
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(0, 67));
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
        c19666xfd6e2f33.P2.f136579i--;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "onToSendTextEnable: %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272062a;
        if (c19666xfd6e2f33.f271503d2 == 2) {
            c19666xfd6e2f33.V1 = 1;
            c19666xfd6e2f33.y1(true);
            c19666xfd6e2f33.f271572p.setVisibility(8);
            c19666xfd6e2f33.Q1(com.p314xaae8f345.mm.R.C30861xcebc809e.f562770o3);
            if (c19666xfd6e2f33.f271554m != null) {
                c19666xfd6e2f33.m75516xbe62a411(z17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272062a;
        c19666xfd6e2f33.V1 = 1;
        c19666xfd6e2f33.G.setVisibility(0);
        c19666xfd6e2f33.D.setVisibility(0);
        c19666xfd6e2f33.f271572p.setVisibility(8);
        c19666xfd6e2f33.U0(true);
        c19666xfd6e2f33.Q1(com.p314xaae8f345.mm.R.C30861xcebc809e.f562770o3);
        android.widget.Button button = c19666xfd6e2f33.f271560n;
        if (button != null) {
            button.performClick();
        }
    }
}
