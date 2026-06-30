package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView f92886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f92887e;

    public a(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView backupTaskStatusView, com.tencent.wechat.aff.affroam.g gVar) {
        this.f92886d = backupTaskStatusView;
        this.f92887e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartBackupIngUI$BackupTaskStatusView$onStopClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI.BackupTaskStatusView backupTaskStatusView = this.f92886d;
        java.lang.String str = backupTaskStatusView.f92879v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop backup task by pkgId=");
        com.tencent.wechat.aff.affroam.g gVar = this.f92887e;
        sb6.append(gVar.f215829d);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        qo1.j1.f365523a.i(gVar.f215829d);
        com.tencent.mm.ui.MMActivity mMActivity = backupTaskStatusView.f92880w;
        if (mMActivity == null) {
            kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        mMActivity.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartBackupIngUI$BackupTaskStatusView$onStopClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
