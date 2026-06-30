package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class qb implements com.p314xaae8f345.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268312a;

    public qb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f268312a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // com.p314xaae8f345.mm.ui.e8
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268312a;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.B1 && viewOnCreateContextMenuListenerC19337x37f3384d.mo78538xecd98af8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI", "onKeyBoardStateChange, is isPaused, state = " + i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onKeyBoardStateChange, state = " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = this.f268312a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf = viewOnCreateContextMenuListenerC19337x37f3384d2.f265398w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = viewOnCreateContextMenuListenerC19337x37f3384d2.L1;
        if (e3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "keyboard dispatchKeyboardStateChange controller == null");
        } else if (!e3Var.B0.contains(java.lang.Integer.valueOf(e3Var.f263486s0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "keyboard dispatchKeyboardStateChange hasCurrentPageFinished");
        } else if (i17 == -3) {
            viewOnCreateContextMenuListenerC19337x37f3384d2.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.rb(viewOnCreateContextMenuListenerC19337x37f3384d2, c19330x7ca5b1cf.m74396xfc829cc4(), viewOnCreateContextMenuListenerC19337x37f3384d2.F.m74833xeb7cf454()));
        } else if (!viewOnCreateContextMenuListenerC19337x37f3384d2.mo78538xecd98af8()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = viewOnCreateContextMenuListenerC19337x37f3384d2.F.f268829h;
            if (abstractC19636xc6b37291 == null || abstractC19636xc6b37291.getVisibility() == 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "keyboard hide dispatchKeyboardStateChange");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb = viewOnCreateContextMenuListenerC19337x37f3384d2.F;
                c19494x6eecdedb.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "hideInputFooterOnly");
                android.view.View view = c19494x6eecdedb.f268827f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideInputFooterOnly", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideInputFooterOnly", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                c19494x6eecdedb.setVisibility(8);
                java.lang.String obj = (c19494x6eecdedb.f268840v == null || (c22621x7603e017 = c19494x6eecdedb.f268833o) == null) ? "" : c22621x7603e017.getText().toString();
                c19494x6eecdedb.f268828g = 0;
                c19494x6eecdedb.c(true);
                c19494x6eecdedb.e();
                ey4.u uVar = c19494x6eecdedb.f268825d;
                if (uVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ua) uVar).a(obj);
                }
            } else {
                viewOnCreateContextMenuListenerC19337x37f3384d2.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.sb(viewOnCreateContextMenuListenerC19337x37f3384d2, viewOnCreateContextMenuListenerC19337x37f3384d2.F.m74835x25689b99(), viewOnCreateContextMenuListenerC19337x37f3384d2.F.m74833xeb7cf454()));
            }
        }
        if (i17 == -3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = this.f268312a.L1;
            if (e3Var2 != null) {
                e3Var2.O0(1);
            }
            this.f268312a.f265368m2.h().f264568t = 1;
            int m74396xfc829cc4 = this.f268312a.f265398w.m74396xfc829cc4();
            if (m74396xfc829cc4 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.W6(this.f268312a, m74396xfc829cc4);
                this.f268312a.F.f(m74396xfc829cc4, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d3 = this.f268312a;
            dy4.l lVar = viewOnCreateContextMenuListenerC19337x37f3384d3.E1;
            lVar.getClass();
            cy4.e eVar = lVar.f326217g;
            if (eVar != null) {
                if (eVar.f306400b != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new cy4.c(eVar, viewOnCreateContextMenuListenerC19337x37f3384d3));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 i18 = this.f268312a.f265368m2.i();
            if (i18.f264453e < 0 || java.lang.System.currentTimeMillis() - i18.f264453e >= 500) {
                i18.f264453e = java.lang.System.currentTimeMillis();
                i18.d(hy4.a0.f367612o);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "keyboard kbListener onKeyBoardStateChange");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.W6(this.f268312a, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d4 = this.f268312a;
            cy4.e eVar2 = viewOnCreateContextMenuListenerC19337x37f3384d4.E1.f326217g;
            if (eVar2 != null) {
                if ((eVar2.f306400b != null) && eVar2.f306409k) {
                    ((ku5.t0) ku5.t0.f394148d).B(new cy4.d(eVar2, viewOnCreateContextMenuListenerC19337x37f3384d4));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d5 = this.f268312a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf2 = viewOnCreateContextMenuListenerC19337x37f3384d5.f265398w;
        if (i17 == -3 && viewOnCreateContextMenuListenerC19337x37f3384d5.f265401x0 != null && (wVar = viewOnCreateContextMenuListenerC19337x37f3384d5.f265409z1) != null) {
            wVar.b().getClass();
        }
        this.f268312a.f265386r3 = i17;
    }
}
