package iu1;

/* loaded from: classes9.dex */
public final class d0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376386d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376386d = activityC13064xaf775f76;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(itemId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376386d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "click item: %s, sortType: %s", valueOf, java.lang.Integer.valueOf(activityC13064xaf775f76.E));
        java.lang.Object obj = activityC13064xaf775f76.F.get(itemId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.qu quVar = (r45.qu) obj;
        activityC13064xaf775f76.f176721q = quVar.f465793e;
        int i18 = quVar.f465792d;
        if (i18 == 1 && activityC13064xaf775f76.E != 1) {
            if (!activityC13064xaf775f76.f176747f) {
                db5.e1.C(activityC13064xaf775f76.mo55332x76847179(), activityC13064xaf775f76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.at7), activityC13064xaf775f76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activityC13064xaf775f76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC13064xaf775f76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new iu1.c0(activityC13064xaf775f76), null);
                return;
            }
            activityC13064xaf775f76.K = true;
            activityC13064xaf775f76.f176720p = 0;
            activityC13064xaf775f76.E = 1;
            activityC13064xaf775f76.Y6();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 15);
            return;
        }
        if (i18 == 2 && activityC13064xaf775f76.E != 2) {
            activityC13064xaf775f76.K = true;
            activityC13064xaf775f76.f176720p = 0;
            activityC13064xaf775f76.E = 2;
            activityC13064xaf775f76.Y6();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 16);
            return;
        }
        if (i18 != 3 || activityC13064xaf775f76.E == 3) {
            return;
        }
        activityC13064xaf775f76.K = true;
        activityC13064xaf775f76.f176720p = 0;
        activityC13064xaf775f76.E = 3;
        activityC13064xaf775f76.Y6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 17);
    }
}
