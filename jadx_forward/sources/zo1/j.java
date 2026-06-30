package zo1;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 f556184d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6) {
        this.f556184d = activityC12866x739418c6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Calendar calendar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.f174317t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6 = this.f556184d;
        activityC12866x739418c6.getClass();
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20651xde423235());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(activityC12866x739418c6, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12871x42f7168f.class);
            if (activityC12866x739418c6.f174318d < 0) {
                intent.putExtra("contactListShowSize", true);
                intent.putExtra("contactListSortType", 3);
            } else {
                intent.putExtra("contactListShowSize", false);
                intent.putExtra("contactListSortType", 1);
            }
            intent.putExtra("titile", activityC12866x739418c6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mzg));
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12866x739418c6.f174320f;
            if (c12853x6acde7c9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            intent.putExtra("already_select_contact", (java.lang.String[]) c12853x6acde7c9.f174265f.toArray(new java.lang.String[0]));
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174471f;
            intent.putExtra("reportPageId", 4L);
            intent.putExtra("contactListPushDownAnim", true);
            pf5.j0.a(intent, ap1.g.class);
            pf5.j0.a(intent, ap1.o0.class);
            pf5.j0.a(intent, ap1.x0.class);
            pf5.j0.a(intent, ap1.x1.class);
            pf5.j0.a(intent, ap1.f1.class);
            pf5.j0.a(intent, ap1.p1.class);
            pf5.j0.a(intent, ap1.u1.class);
            pf5.j0.a(intent, ap1.b2.class);
        } else {
            intent = new android.content.Intent(activityC12866x739418c6, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.class);
            intent.putExtra("contactAdapterClass", com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12855xae28020b.class.getName());
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = activityC12866x739418c6.f174320f;
            if (c12853x6acde7c92 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            intent.putExtra("already_select_contact", (java.lang.String[]) c12853x6acde7c92.f174265f.toArray(new java.lang.String[0]));
            intent.putExtra("contactListShowSize", activityC12866x739418c6.f174318d < 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174471f;
            intent.putExtra("reportPageId", 4L);
        }
        activityC12866x739418c6.startActivityForResult(intent, 126);
        activityC12866x739418c6.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
