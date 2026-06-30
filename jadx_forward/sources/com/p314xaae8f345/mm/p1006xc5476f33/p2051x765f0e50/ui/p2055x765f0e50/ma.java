package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class ma implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 f242855d;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 activityC17419x2156b524) {
        this.f242855d = activityC17419x2156b524;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17419x2156b524 activityC17419x2156b524 = this.f242855d;
            r45.ov6 ov6Var = activityC17419x2156b524.f241915e;
            if (ov6Var != null) {
                l14.f.f396543a.a(206, ov6Var);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17419x2156b524.f241916f;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            activityC17419x2156b524.f241916f = db5.e1.Q(activityC17419x2156b524.mo55332x76847179(), "", activityC17419x2156b524.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipg), true, false, null);
            r45.ov6 ov6Var2 = activityC17419x2156b524.f241915e;
            java.lang.String str = ov6Var2 != null ? ov6Var2.f464093d : null;
            if (str == null || str.length() == 0) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17419x2156b524.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7 d7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7.class);
            r45.ov6 ov6Var3 = activityC17419x2156b524.f241915e;
            java.lang.String str2 = ov6Var3 != null ? ov6Var3.f464093d : null;
            if (str2 == null) {
                str2 = "";
            }
            d7Var.O6(str2, 1);
        }
    }
}
