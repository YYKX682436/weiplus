package com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5;

@j95.b
/* loaded from: classes8.dex */
public final class m extends i95.w implements o25.y1 {

    /* renamed from: e, reason: collision with root package name */
    public int f270255e;

    /* renamed from: f, reason: collision with root package name */
    public db5.t4 f270256f;

    /* renamed from: g, reason: collision with root package name */
    public rl5.r f270257g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f270258h;

    /* renamed from: i, reason: collision with root package name */
    public db5.g4 f270259i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f270260m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f270261n;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f270254d = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f270262o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final int f270263p = 2;

    public android.view.View Ai(android.content.Context context, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        return Bi(context, menu, sheet, null, i17, lVar);
    }

    public android.view.View Bi(android.content.Context context, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, db5.k4 k4Var, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        this.f270260m = context;
        this.f270258h = sheet;
        this.f270259i = menu;
        this.f270262o = i17;
        sheet.f293391f = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.e(context, this);
        Zi();
        if (this.f270254d.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RecentForwardMenuHelper", "addMenus return for conversationList empty!");
            if (lVar == null) {
                return null;
            }
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return null;
        }
        android.view.View a17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.k.f292591a.a(context, sheet, i17);
        if (k4Var != null) {
            sheet.K = k4Var;
        } else {
            sheet.K = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.j.f292590a;
        }
        ij(menu, false);
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return a17;
    }

    public void Di(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, int i17, yz5.l lVar, yz5.l lVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f293409p = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.f(this, context, bottomSheet, i17, lVar);
        bottomSheet.f293418w = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.h(this, lVar2);
        bottomSheet.f293419x = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.i(this, bottomSheet);
    }

    public final void Ni(java.lang.String str) {
        b95.j Ai;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            uk0.a.c(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.j.f270247d, null, 4, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3 c16508x1e702dd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class);
        if (c16508x1e702dd3 == null || (Ai = c16508x1e702dd3.Ai()) == null) {
            return;
        }
        Ai.a(str);
    }

    public void Ri(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (sheet.i()) {
            ij(menu, true);
            sheet.j();
        }
    }

    public java.util.ArrayList Ui() {
        Zi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!this.f270254d.isEmpty()) {
            java.util.Iterator it = this.f270254d.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096 c22576xa5b14096 = (com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) next;
                java.lang.String str = c22576xa5b14096.f292581g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = c22576xa5b14096.f292579e;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = c22576xa5b14096.f292580f;
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                java.lang.String str3 = c22576xa5b14096.f292578d;
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str3);
                ((q80.g0) i95.n0.c(q80.g0.class)).getClass();
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(str2, c10756x2a5d7b2d, ra3.d.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                java.lang.String value = c10756x2a5d7b2d2.f149939d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                arrayList.add(new o25.m2(str3, str, value));
            }
        }
        return arrayList;
    }

    public java.util.List Vi() {
        java.util.ArrayList arrayList = this.f270254d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) it.next()).f292578d);
        }
        return arrayList2;
    }

    public final void Zi() {
        this.f270254d.clear();
        java.util.ArrayList a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? new com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.i().a() : new com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.i().b();
        this.f270254d = a17;
        this.f270255e = a17.size();
        this.f270261n = false;
    }

    public boolean aj(db5.h4 menu, yz5.l callback) {
        r45.pk5 pk5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int i17 = menu.f309899g + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55644xa67f77f6;
        if (menu instanceof db5.v5) {
            if (((db5.v5) menu).M == 1) {
                this.f270261n = !r1.L;
                db5.g4 g4Var = this.f270259i;
                if (g4Var != null) {
                    ij(g4Var, false);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f270258h;
                if (k0Var == null) {
                    return false;
                }
                k0Var.j();
                return false;
            }
        }
        if (this.f270261n) {
            if (this.f270254d.size() <= i17 || i17 < 0) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f270258h;
            android.content.Context context = this.f270260m;
            if (k0Var2 == null || context == null) {
                return false;
            }
            hj(k0Var2, context, menu, this.f270262o);
            return false;
        }
        if (this.f270254d.size() <= i17 || i17 < 0) {
            return false;
        }
        android.content.Context context2 = this.f270260m;
        if (context2 != null && (pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context2, 14, r45.pk5.class)) != null) {
            pk5Var.f464668g = i17 + 1;
        }
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290832f = i17 < b95.b.a() ? 8 : 4;
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) this.f270254d.get(i17)).f292578d;
        if (str == null) {
            str = "";
        }
        callback.mo146xb9724478(str);
        return true;
    }

    public boolean bj(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, db5.h4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        return cj(bottomSheet, menu, 1);
    }

    public boolean cj(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, db5.h4 menu, int i17) {
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (this.f270261n) {
            return false;
        }
        int size = this.f270254d.size();
        boolean z18 = false;
        for (int i18 = 0; i18 < size; i18++) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) this.f270254d.get(i18)).f292578d, menu.A)) {
                rl5.r rVar = this.f270257g;
                if (rVar != null) {
                    rVar.a();
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = bottomSheet.F1;
                android.view.View mo7935xa188593e = (c1163xf1deaba4 == null || (layoutManager = c1163xf1deaba4.getLayoutManager()) == null) ? null : layoutManager.mo7935xa188593e(i18);
                android.view.View findViewById = mo7935xa188593e != null ? mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.f566821h62) : null;
                android.view.View view = findViewById == null ? mo7935xa188593e : findViewById;
                if (view != null) {
                    rl5.r rVar2 = new rl5.r(view.getContext());
                    rVar2.C = true;
                    rVar2.L = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.k(this);
                    this.f270257g = rVar2;
                    int[] iArr = {0, 0};
                    view.getLocationInWindow(iArr);
                    this.f270256f = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.l(this, bottomSheet, view, menu, i17);
                    int f17 = i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                    rl5.r rVar3 = this.f270257g;
                    if (rVar3 != null) {
                        db5.t4 t4Var = this.f270256f;
                        int width = (int) (iArr[0] + (view.getWidth() / 2.0f));
                        z17 = true;
                        int i19 = iArr[1] - f17;
                        rVar3.f478887x = t4Var;
                        rVar3.f478871f = mo7935xa188593e;
                        if (!(mo7935xa188593e instanceof android.widget.TextView) && (width == 0 || i19 == 0)) {
                            rVar3.l();
                        }
                        rVar3.f478889z.clear();
                        db5.g4 g4Var = rVar3.f478889z;
                        if (g4Var != null) {
                            g4Var.b(0, com.p314xaae8f345.mm.R.C30867xcad56011.ify, com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                        }
                        if (width == 0 && i19 == 0) {
                            rVar3.m();
                        } else {
                            rVar3.n(width, i19);
                        }
                    } else {
                        z17 = true;
                    }
                } else {
                    z17 = true;
                }
                z18 = z17;
            }
        }
        return z18;
    }

    public void fj(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.Iterator it = this.f270254d.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) next).f292578d, userName)) {
                it.remove();
                break;
            }
        }
        Ni(userName);
    }

    public final void hj(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context, db5.h4 h4Var, int i17) {
        r45.pk5 pk5Var;
        java.lang.String str;
        java.util.Iterator it = this.f270254d.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) next).f292578d, h4Var.A)) {
                it.remove();
                break;
            }
        }
        db5.g4 g4Var = this.f270259i;
        if (g4Var != null) {
            ij(g4Var, false);
        }
        k0Var.j();
        if (this.f270254d.size() == 0) {
            if (i17 == 3) {
                android.widget.TextView textView = k0Var.E1;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (i17 != 6) {
                android.widget.LinearLayout linearLayout = k0Var.U;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            } else {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.k.f292591a.a(context, k0Var, i17);
            }
        }
        java.lang.String str2 = h4Var.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getWebUrl(...)");
        Ni(str2);
        android.content.Context context2 = this.f270260m;
        if (context2 == null || (pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context2, 14, r45.pk5.class)) == null) {
            return;
        }
        pk5Var.f464666e++;
        java.lang.String str3 = pk5Var.f464667f;
        if (str3 == null || r26.n0.N(str3)) {
            str = h4Var.A;
        } else {
            str = pk5Var.f464667f + (char) 65372 + h4Var.A;
        }
        pk5Var.f464667f = str;
    }

    public final void ij(db5.g4 g4Var, boolean z17) {
        android.content.Context context;
        ((java.util.ArrayList) g4Var.f309877d).clear();
        int size = this.f270254d.size();
        if (size > 0) {
            int i17 = 0;
            while (i17 < size) {
                db5.v5 v5Var = new db5.v5(this.f270260m, i17 + 10000, 0);
                java.lang.String str = ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) this.f270254d.get(i17)).f292581g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) this.f270254d.get(i17)).f292579e;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) this.f270254d.get(i17)).f292580f;
                }
                v5Var.f309904o = str;
                v5Var.A = ((com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) this.f270254d.get(i17)).f292578d;
                v5Var.f309908s = z17;
                v5Var.L = this.f270261n;
                vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
                java.lang.String str2 = v5Var.A;
                ((vh0.f3) n1Var).getClass();
                if ((!com.p314xaae8f345.mm.p2621x8fb0427b.z3.W4(str2) ? false : ih.a.h("clicfg_enable_yuanbao_show_openim_info_android", false)) && (context = this.f270260m) != null) {
                    v5Var.G = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.db6);
                }
                g4Var.v(v5Var);
                i17++;
            }
            db5.v5 v5Var2 = new db5.v5(this.f270260m, i17 + 10000, 0);
            v5Var2.f309908s = z17;
            v5Var2.L = this.f270261n;
            v5Var2.M = 1;
            g4Var.v(v5Var2);
        }
    }

    public android.view.View wi(android.content.Context context, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        return Ai(context, menu, sheet, 1, null);
    }
}
