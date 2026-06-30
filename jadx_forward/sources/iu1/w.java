package iu1;

/* loaded from: classes9.dex */
public final class w implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376503a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376503a = activityC13064xaf775f76;
    }

    @Override // vl1.o
    public final boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376503a;
        iu1.c cVar = activityC13064xaf775f76.f176717m;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
            throw null;
        }
        iu1.a x17 = cVar.x(i17);
        if (x17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "long click type: %s", java.lang.Integer.valueOf(x17.f376365b));
            if (x17.f376365b == 2) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13064xaf775f76.mo55332x76847179();
                android.view.LayoutInflater.from(mo55332x76847179);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179, 1, false);
                db5.g4 g4Var = new db5.g4(mo55332x76847179);
                new db5.g4(mo55332x76847179);
                iu1.t tVar = new iu1.t(activityC13064xaf775f76);
                iu1.v vVar = new iu1.v(activityC13064xaf775f76, x17, i17);
                g4Var.clear();
                db5.g4 g4Var2 = new db5.g4(mo55332x76847179);
                tVar.mo887xc459429a(g4Var2);
                if (g4Var2.z()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    k0Var.f293405n = tVar;
                    k0Var.f293414s = vVar;
                    k0Var.f293387d = null;
                    k0Var.G = null;
                    k0Var.v();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                r45.wt wtVar = x17.f376364a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
                g0Var.d(16324, 2, wtVar.f470960d, 0, 0, 7, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
            }
        }
        return false;
    }
}
