package zo1;

/* loaded from: classes5.dex */
public final class t3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556309d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556309d = activityC12872x8baa24f8;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556309d;
        zo1.d3 d3Var = activityC12872x8baa24f8.f174393t;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = d3Var != null ? d3Var.getItem(i17) : null;
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "try to toggle selection of " + item.f288383s);
        wo1.v vVar = activityC12872x8baa24f8.f174394u;
        if (vVar != null) {
            vVar.m174249x9ca87e0f(item.f288383s);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.T6(activityC12872x8baa24f8);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
