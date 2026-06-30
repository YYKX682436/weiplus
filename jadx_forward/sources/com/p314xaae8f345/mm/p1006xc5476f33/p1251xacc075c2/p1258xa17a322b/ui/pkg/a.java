package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2.BackupTaskStatusView f174419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174420e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2.BackupTaskStatusView backupTaskStatusView, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar) {
        this.f174419d = backupTaskStatusView;
        this.f174420e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartBackupIngUI$BackupTaskStatusView$onStopClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12874xc6870bb2.BackupTaskStatusView backupTaskStatusView = this.f174419d;
        java.lang.String str = backupTaskStatusView.f174412v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop backup task by pkgId=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174420e;
        sb6.append(gVar.f297362d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        qo1.j1.f447056a.i(gVar.f297362d);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = backupTaskStatusView.f174413w;
        if (abstractActivityC21394xb3d2c0cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        abstractActivityC21394xb3d2c0cf.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartBackupIngUI$BackupTaskStatusView$onStopClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
