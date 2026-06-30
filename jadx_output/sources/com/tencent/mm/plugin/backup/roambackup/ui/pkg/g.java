package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView f92900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f92901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f92902f;

    public g(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView, po1.d dVar, com.tencent.wechat.aff.affroam.g gVar) {
        this.f92900d = restoreTaskStatusView;
        this.f92901e = dVar;
        this.f92902f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92957x0);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 10L;
        roamBackupRecoverReport28098Struct.f60067e = 3L;
        roamBackupRecoverReport28098Struct.k();
        fo1.p pVar = fo1.p.f264890a;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView = this.f92900d;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI = restoreTaskStatusView.f92885v;
        if (startRestoringUI == null) {
            kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        com.tencent.wechat.aff.affroam.g gVar = this.f92902f;
        if (!pVar.a(startRestoringUI, this.f92901e, new com.tencent.mm.plugin.backup.roambackup.ui.pkg.f(gVar))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "Check permission failed, going to request it.");
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "try to get restore conversation list.");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI2 = restoreTaskStatusView.f92885v;
        if (startRestoringUI2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        long j17 = gVar.f215829d;
        int i17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.f92881g;
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamNewContactSelectUI());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(startRestoringUI2.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.class);
            intent.putExtra("titile", startRestoringUI2.getString(com.tencent.mm.R.string.mvn));
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
            intent = new android.content.Intent(startRestoringUI2, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.class);
            intent.putExtra("contactAdapterClass", com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter.class.getName());
            intent.putExtra("packageId", j17);
            intent.putExtra("reportPageId", 11L);
        }
        startRestoringUI2.startActivityForResult(intent, 126);
        startRestoringUI2.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
