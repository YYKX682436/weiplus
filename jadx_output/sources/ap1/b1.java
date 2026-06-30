package ap1;

/* loaded from: classes5.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f12611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.c1 f12613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.c2 f12614g;

    public b1(com.tencent.mm.ui.widget.dialog.z2 z2Var, boolean z17, ap1.c1 c1Var, ap1.c2 c2Var) {
        this.f12611d = z2Var;
        this.f12612e = z17;
        this.f12613f = c1Var;
        this.f12614g = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12611d.B();
        boolean z17 = this.f12612e;
        ap1.c1 c1Var = this.f12613f;
        if (z17) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "Before deleteBackupDataAsync, delete all conversation");
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.d(c1Var.f12621d, new java.util.ArrayList(), true);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Before deleteBackupDataAsync, selectedList.size=");
            ap1.c2 c2Var = this.f12614g;
            sb6.append(c2Var.f12630n.size());
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.d(c1Var.f12621d, new java.util.ArrayList(c2Var.f12630n), false);
        }
        android.content.Intent intent = new android.content.Intent(c1Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", c1Var.f12621d);
        intent.addFlags(67108864);
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        j75.f U6 = c1Var.U6();
        if (U6 != null) {
            U6.B3(new ap1.c(null, 1, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
