package zo1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 f556108d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6) {
        this.f556108d = activityC12866x739418c6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$11$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRangeManagerUI", "on endTime timeSubMenu clicked");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6 = this.f556108d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.U6(activityC12866x739418c6, false);
        activityC12866x739418c6.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$11$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
