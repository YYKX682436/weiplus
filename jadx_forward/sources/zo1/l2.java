package zo1;

/* loaded from: classes5.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 f556215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f556216e;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f556215d = activityC12869xafc66e3;
        this.f556216e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeletePackageOnlySheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PackageDeleteConfirmUI", "[showDeletePackageOnlySheet] start delete");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3.U6(this.f556215d);
        this.f556216e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeletePackageOnlySheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
