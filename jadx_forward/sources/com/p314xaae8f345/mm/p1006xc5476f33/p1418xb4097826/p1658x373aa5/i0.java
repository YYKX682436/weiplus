package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.y0 f213807d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f213808e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f213809f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f213810g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f213811h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f213812i;

    public i0(so2.y0 commentItem, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, android.content.Context context, boolean z17, boolean z18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213807d = commentItem;
        this.f213808e = feedObject;
        this.f213809f = context;
        this.f213810g = z17;
        this.f213811h = z18;
        this.f213812i = str;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f213808e;
        java.lang.String m59299x6bf53a6c = c14994x9b99c079.m59299x6bf53a6c();
        boolean g17 = hc2.l.g(m59299x6bf53a6c);
        menu.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr);
        so2.y0 y0Var = this.f213807d;
        if (y0Var.h() != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Uc).mo141623x754a37bb()).r()).booleanValue() && !y0Var.f492236d.j1()) {
                if (((y0Var.f492236d.u0().m76072xefec40f7() & 256) == 0) && !c14994x9b99c079.m59338xecb5e178()) {
                    menu.a(17, com.p314xaae8f345.mm.R.C30867xcad56011.f574939k20);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Kc).mo141623x754a37bb()).r()).booleanValue()) {
            if (this.f213810g) {
                menu.a(14, com.p314xaae8f345.mm.R.C30867xcad56011.f573646o31);
            } else if (!this.f213811h || !((java.lang.Boolean) ((jz5.n) y0Var.f492241i).mo141623x754a37bb()).booleanValue()) {
                menu.a(13, com.p314xaae8f345.mm.R.C30867xcad56011.f573645o30);
            }
        }
        if (y0Var.h() == 3) {
            return;
        }
        if (!y0Var.f492236d.j1() && y0Var.f492236d.Y0() == 0 && g17) {
            if (hc2.c0.c(y0Var.f492236d.z0())) {
                menu.a(7, com.p314xaae8f345.mm.R.C30867xcad56011.lsu);
            } else {
                menu.a(6, com.p314xaae8f345.mm.R.C30867xcad56011.f8k);
            }
        }
        java.lang.String Z0 = y0Var.f492236d.Z0();
        android.content.Context context = this.f213809f;
        boolean z17 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Z0, xy2.c.e(context)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y0Var.f492236d.Z0(), c01.z1.r())) ? false : true;
        if (z17 && !y0Var.f492236d.j1() && !c14994x9b99c079.m59338xecb5e178() && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Pd).mo141623x754a37bb()).r()).intValue() == 1) {
            java.lang.String d17 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_Dislike");
            if (d17 == null) {
                d17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lrl);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getString(...)");
            }
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            menu.o(5, d17, string);
        }
        if (z17 || y0Var.f492236d.j1()) {
            menu.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571927tr);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q0.f214395a.a(this.f213809f, this.f213807d, m59299x6bf53a6c, c14994x9b99c079.m59338xecb5e178(), this.f213812i)) {
            menu.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
        }
        if (z17) {
            if (g17 && !y0Var.f492236d.j1() && !c14994x9b99c079.m59315x31740422()) {
                if (y0Var.f492236d.u0().m76055x553c8644() == 0) {
                    if (!y0Var.f492236d.e1()) {
                        menu.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.cki);
                    } else if (t70Var2.i()) {
                        menu.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.cki);
                    }
                } else if (y0Var.f492236d.u0().m76055x553c8644() == 1) {
                    if (!y0Var.f492236d.e1()) {
                        menu.a(4, com.p314xaae8f345.mm.R.C30867xcad56011.f1u);
                    } else if (t70Var2.i()) {
                        menu.a(4, com.p314xaae8f345.mm.R.C30867xcad56011.f1u);
                    }
                }
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }
}
