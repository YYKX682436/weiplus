package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269551e;

    public j0(ug3.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var) {
        this.f269550d = kVar;
        this.f269551e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ug3.k kVar = this.f269550d;
        int i17 = kVar.f474004n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.r rVar = this.f269551e.f269555e;
        if (rVar != null) {
            int i18 = kVar.f473997d;
            int i19 = kVar.f474003m;
            java.lang.String exitConfirm = kVar.f509090u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(exitConfirm, "exitConfirm");
            java.lang.String str = kVar.f474006p;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91 activityC19504xce272b91 = (com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91) rVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceListUI", "logoutDevice targetDeviceType: " + i18 + " exitConfirm: " + exitConfirm);
            if (activityC19504xce272b91.f269516e == ug3.i.f509072m) {
                db5.e1.A(activityC19504xce272b91.mo55332x76847179(), exitConfirm, activityC19504xce272b91.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC19504xce272b91.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7x), activityC19504xce272b91.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.q(i18, i19, str, activityC19504xce272b91), null);
            } else {
                activityC19504xce272b91.finish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
