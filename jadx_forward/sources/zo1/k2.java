package zo1;

/* loaded from: classes5.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 f556198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f556199e;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f556198d = activityC12869xafc66e3;
        this.f556199e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeletePackageOnlySheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PackageDeleteConfirmUI", "[showDeletePackageOnlySheet] hide confirm view");
        this.f556198d.f174369n++;
        this.f556199e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeletePackageOnlySheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
