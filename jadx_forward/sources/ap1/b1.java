package ap1;

/* loaded from: classes5.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f94144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f94145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.c1 f94146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.c2 f94147g;

    public b1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, boolean z17, ap1.c1 c1Var, ap1.c2 c2Var) {
        this.f94144d = z2Var;
        this.f94145e = z17;
        this.f94146f = c1Var;
        this.f94147g = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f94144d.B();
        boolean z17 = this.f94145e;
        ap1.c1 c1Var = this.f94146f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "Before deleteBackupDataAsync, delete all conversation");
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.d(c1Var.f94154d, new java.util.ArrayList(), true);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Before deleteBackupDataAsync, selectedList.size=");
            ap1.c2 c2Var = this.f94147g;
            sb6.append(c2Var.f94163n.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.d(c1Var.f94154d, new java.util.ArrayList(c2Var.f94163n), false);
        }
        android.content.Intent intent = new android.content.Intent(c1Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", c1Var.f94154d);
        intent.addFlags(67108864);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c1Var.m158354x19263085();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        j75.f U6 = c1Var.U6();
        if (U6 != null) {
            U6.B3(new ap1.c(null, 1, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
