package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView f174433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f174434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174435f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView, po1.d dVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar) {
        this.f174433d = restoreTaskStatusView;
        this.f174434e = dVar;
        this.f174435f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174490x0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 10L;
        c6839x89375b51.f141600e = 3L;
        c6839x89375b51.k();
        fo1.p pVar = fo1.p.f346423a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView = this.f174433d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd activityC12875x98f0bdfd = restoreTaskStatusView.f174418v;
        if (activityC12875x98f0bdfd == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174435f;
        if (!pVar.a(activityC12875x98f0bdfd, this.f174434e, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.f(gVar))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "Check permission failed, going to request it.");
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "try to get restore conversation list.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd activityC12875x98f0bdfd2 = restoreTaskStatusView.f174418v;
        if (activityC12875x98f0bdfd2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        long j17 = gVar.f297362d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.f174414g;
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20651xde423235());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(activityC12875x98f0bdfd2.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12871x42f7168f.class);
            intent.putExtra("titile", activityC12875x98f0bdfd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvn));
            intent.putExtra("contactListShowSize", true);
            intent.putExtra("contactListSortType", 2);
            intent.putExtra("reportPageId", 11L);
            intent.putExtra("packageId", j17);
            intent.putExtra("contactListPushDownAnim", true);
            pf5.j0.a(intent, ap1.w.class);
            pf5.j0.a(intent, ap1.o0.class);
            pf5.j0.a(intent, ap1.x0.class);
            pf5.j0.a(intent, ap1.x1.class);
            pf5.j0.a(intent, ap1.f1.class);
            pf5.j0.a(intent, ap1.p1.class);
            pf5.j0.a(intent, ap1.u1.class);
            pf5.j0.a(intent, ap1.b2.class);
        } else {
            intent = new android.content.Intent(activityC12875x98f0bdfd2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.class);
            intent.putExtra("contactAdapterClass", com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b.class.getName());
            intent.putExtra("packageId", j17);
            intent.putExtra("reportPageId", 11L);
        }
        activityC12875x98f0bdfd2.startActivityForResult(intent, 126);
        activityC12875x98f0bdfd2.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
