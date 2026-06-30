package mo1;

/* loaded from: classes5.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 f411868d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 activityC12851x5f788c81) {
        this.f411868d = activityC12851x5f788c81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.f174245o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "try to get restore conversation list.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 activityC12851x5f788c81 = this.f411868d;
        long j17 = activityC12851x5f788c81.f174246d;
        activityC12851x5f788c81.getClass();
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20651xde423235());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(activityC12851x5f788c81.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12871x42f7168f.class);
            intent.putExtra("titile", activityC12851x5f788c81.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvn));
            intent.putExtra("contactListShowSize", true);
            intent.putExtra("contactListSortType", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174471f;
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
            intent = new android.content.Intent(activityC12851x5f788c81, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.class);
            intent.putExtra("contactAdapterClass", com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b.class.getName());
            intent.putExtra("packageId", j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174471f;
            intent.putExtra("reportPageId", 11L);
        }
        activityC12851x5f788c81.startActivityForResult(intent, 126);
        activityC12851x5f788c81.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
