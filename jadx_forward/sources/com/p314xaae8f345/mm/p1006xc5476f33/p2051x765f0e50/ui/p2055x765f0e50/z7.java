package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class z7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f243349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f f243350e;

    public z7(r45.ov6 ov6Var, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        this.f243349d = ov6Var;
        this.f243350e = activityC17414x34d8ac5f;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            l14.f fVar = l14.f.f396543a;
            r45.ov6 ov6Var = this.f243349d;
            fVar.a(203, ov6Var);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f.f241860x;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = this.f243350e;
            activityC17414x34d8ac5f.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUI", "doDealUserAuth appId: " + ov6Var.f464093d + ", appName: " + ov6Var.f464094e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17414x34d8ac5f.f241874t;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            activityC17414x34d8ac5f.f241874t = db5.e1.Q(activityC17414x34d8ac5f.mo55332x76847179(), "", activityC17414x34d8ac5f.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipg), true, false, null);
            java.lang.String str = ov6Var.f464093d;
            if (str == null || str.length() == 0) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17414x34d8ac5f.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7 d7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7.class);
            java.lang.String str2 = ov6Var.f464093d;
            if (str2 == null) {
                str2 = "";
            }
            d7Var.O6(str2, 1);
        }
    }
}
