package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes5.dex */
public final class j1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec f233409a;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec) {
        this.f233409a = c16688x2f31b8ec;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (c22621x7603e017 = (c16688x2f31b8ec = this.f233409a).f233180d) == null) {
            return;
        }
        c22621x7603e017.append(pg5.d.a(c16688x2f31b8ec.getContext(), str));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection mo81352x6a67d012;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f233409a.f233180d;
        if (c22621x7603e017 == null || (mo81352x6a67d012 = c22621x7603e017.mo81352x6a67d012()) == null) {
            return;
        }
        mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(0, 67));
        mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec c16688x2f31b8ec = this.f233409a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c16688x2f31b8ec.f233180d;
        android.text.Editable text = c22621x7603e017 != null ? c22621x7603e017.getText() : null;
        if (text == null || text.length() == 0) {
            return;
        }
        ck5.f b17 = ck5.f.b(c16688x2f31b8ec.f233180d);
        b17.f124094f = 0;
        b17.f124093e = 80;
        b17.f124089a = true;
        b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l1(c16688x2f31b8ec));
    }
}
