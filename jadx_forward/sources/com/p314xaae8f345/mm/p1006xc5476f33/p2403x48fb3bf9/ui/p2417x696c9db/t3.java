package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class t3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 f268416d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var) {
        this.f268416d = x3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var = this.f268416d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x3Var.f269177d, "onMMMenuItemSelected: " + i17 + ", " + ((java.lang.Object) menuItem.getTitle()));
        x3Var.c("click", menuItem);
        boolean z17 = menuItem instanceof db5.h4;
        java.lang.String str = x3Var.f269177d;
        if (z17) {
            db5.h4 h4Var = (db5.h4) menuItem;
            if (h4Var.f309908s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onMMMenuItemSelected: disabled, title = " + ((java.lang.Object) h4Var.getTitle()));
                return;
            }
        }
        int itemId = menuItem.getItemId();
        rv.a aVar = null;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f17 = x3Var.f();
            if (f17 != null) {
                f17.Z(1);
                f17.c().H8(0);
            }
        } else if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f18 = x3Var.f();
            if (f18 != null) {
                f18.W();
            }
        } else if (itemId == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f19 = x3Var.f();
            if (f19 != null) {
                f19.I();
            }
        } else if (itemId == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f27 = x3Var.f();
            if (f27 != null) {
                f27.L();
            }
        } else if (itemId == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f28 = x3Var.f();
            if (f28 != null) {
                f28.P();
            }
        } else if (itemId == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f29 = x3Var.f();
            if (f29 != null) {
                f29.T();
            }
        } else if (itemId == 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f37 = x3Var.f();
            if (f37 != null) {
                f37.Z(11);
                f37.p(null);
            }
        } else if (itemId == 11) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f38 = x3Var.f();
            if (f38 != null) {
                f38.M();
            }
        } else if (itemId == 20) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f39 = x3Var.f();
            if (f39 != null) {
                f39.U();
            }
        } else if (itemId == 22) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f47 = x3Var.f();
            if (f47 != null) {
                f47.V();
            }
        } else if (itemId == 26) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f48 = x3Var.f();
            if (f48 != null) {
                f48.X();
            }
        } else if (itemId == 28) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f49 = x3Var.f();
            if (f49 != null) {
                f49.Q();
            }
        } else if (itemId == 31) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f57 = x3Var.f();
            if (f57 != null) {
                f57.S();
            }
        } else if (itemId == 46) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f58 = x3Var.f();
            if (f58 != null && (c16092xbbe22aef = f58.c().f265397v2) != null) {
                ((d73.i) i95.n0.c(d73.i.class)).f6(c16092xbbe22aef);
            }
        } else if (itemId == 48) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f59 = x3Var.f();
            if (f59 != null) {
                f59.J();
            }
        } else if (itemId == 61) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f66 = x3Var.f();
            if (f66 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17 = f66.c();
                if (c17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewMenuHelper", "openOtherApp, webViewUI is null");
                } else {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = c17.mo55332x76847179();
                    if (mo55332x76847179 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewMenuHelper", "openOtherApp, context is null");
                    } else {
                        if (f66.B == null) {
                            if (f66.E == null) {
                                f66.E = f66.l(c17);
                            }
                            f66.B = f66.w(c17, f66.E);
                        }
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m2 m2Var = f66.B;
                        if (m2Var != null) {
                            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) m2Var).l(mo55332x76847179);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewMenuHelper", "openOtherApp, enhance is null");
                        }
                    }
                }
            }
        } else if (itemId == 50) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f67 = x3Var.f();
            if (f67 != null) {
                f67.k();
            }
        } else if (itemId == 51) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f68 = x3Var.f();
            if (f68 != null) {
                f68.H();
            }
        } else if (itemId == 57) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f69 = x3Var.f();
            if (f69 != null) {
                f69.R();
            }
        } else if (itemId != 58) {
            switch (itemId) {
                case 35:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f76 = x3Var.f();
                    if (f76 != null) {
                        f76.N();
                        break;
                    }
                    break;
                case 36:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f77 = x3Var.f();
                    if (f77 != null) {
                        f77.K();
                        break;
                    }
                    break;
                case 37:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f78 = x3Var.f();
                    if (f78 != null) {
                        f78.Y();
                        break;
                    }
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "custom menu item title: " + ((java.lang.Object) menuItem.getTitle()) + ", ID: " + menuItem.getItemId());
                    break;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f79 = x3Var.f();
            if (f79 != null) {
                f79.O(menuItem);
            }
        }
        java.lang.String str2 = (java.lang.String) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3.M).get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (str2 == null) {
            str2 = "";
        }
        java.util.Iterator it = ((java.util.ArrayList) x3Var.f269181h).iterator();
        while (true) {
            if (it.hasNext()) {
                for (rv.a aVar2 : ((rv.b) it.next()).f481359b) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.f481344a, str2)) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null && aVar.f481351h) {
            x3Var.f269179f = false;
            rv.n2 n2Var = x3Var.f269180g;
            if (n2Var != null) {
                ((ss1.d) ((jz5.n) ((qs1.m) n2Var).f447766f).mo141623x754a37bb()).f();
            }
        }
    }
}
