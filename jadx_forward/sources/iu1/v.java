package iu1;

/* loaded from: classes9.dex */
public final class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu1.a f376494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f376495f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, iu1.a aVar, int i17) {
        this.f376493d = activityC13064xaf775f76;
        this.f376494e = aVar;
        this.f376495f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376493d;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13064xaf775f76.mo55332x76847179();
            java.lang.String string = activityC13064xaf775f76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.atb);
            iu1.a aVar = this.f376494e;
            int i18 = this.f376495f;
            db5.e1.G(mo55332x76847179, string, "", false, new iu1.u(activityC13064xaf775f76, aVar, i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            r45.wt wtVar = aVar.f376364a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
            g0Var.d(16324, 2, wtVar.f470960d, 0, 0, 8, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
        }
    }
}
