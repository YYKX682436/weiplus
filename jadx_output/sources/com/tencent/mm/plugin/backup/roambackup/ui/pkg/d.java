package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView f92895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f92896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f92897f;

    public d(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar) {
        this.f92895d = restoreTaskStatusView;
        this.f92896e = gVar;
        this.f92897f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92947p0);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 10L;
        roamBackupRecoverReport28098Struct.f60067e = 2L;
        roamBackupRecoverReport28098Struct.k();
        po1.d dVar = this.f92897f;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.RestoreTaskStatusView restoreTaskStatusView = this.f92895d;
        com.tencent.wechat.aff.affroam.g gVar = this.f92896e;
        jz5.l a17 = restoreTaskStatusView.a(gVar, dVar, false);
        qo1.d1 d1Var = (qo1.d1) a17.f302833d;
        ((java.lang.Boolean) a17.f302834e).booleanValue();
        if (d1Var == qo1.d1.f365463d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StartRestoringUI", "task launched(pkgId=" + gVar.f215829d + "), finish current activity.");
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI = restoreTaskStatusView.f92885v;
            if (startRestoringUI == null) {
                kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                throw null;
            }
            if (startRestoringUI == null) {
                kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                throw null;
            }
            startRestoringUI.setResult(-1, startRestoringUI.getIntent());
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI startRestoringUI2 = restoreTaskStatusView.f92885v;
            if (startRestoringUI2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                throw null;
            }
            startRestoringUI2.U6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
