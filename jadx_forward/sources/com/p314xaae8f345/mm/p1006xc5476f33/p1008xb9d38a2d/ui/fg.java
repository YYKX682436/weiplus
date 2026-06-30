package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class fg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc f155398d;

    public fg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc activityC11463xc681e6dc) {
        this.f155398d = activityC11463xc681e6dc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js.w0 w0Var = (js.w0) i95.n0.c(js.w0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.eg egVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.eg(this);
        is.i0 i0Var = (is.i0) w0Var;
        i0Var.getClass();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        boolean t17 = c01.z1.t();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc activityC11463xc681e6dc = this.f155398d;
        if (t17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"))) {
            c71.b.c(activityC11463xc681e6dc, ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"), 0, true);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has not bind mobile");
            android.content.Intent intent = new android.content.Intent(activityC11463xc681e6dc, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
            intent.putExtra("bind_scene", 4);
            intent.putExtra("bind_scene", 4);
            db5.e1.C(activityC11463xc681e6dc, activityC11463xc681e6dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574337hx4), "", activityC11463xc681e6dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ail), activityC11463xc681e6dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new is.v(i0Var, activityC11463xc681e6dc, intent, egVar), new is.w(i0Var, egVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has bind mobile");
            db5.e1.C(activityC11463xc681e6dc, activityC11463xc681e6dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574335hx2, str), "", activityC11463xc681e6dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), activityC11463xc681e6dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new is.y(i0Var, activityC11463xc681e6dc, str, egVar), new is.z(i0Var, egVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
