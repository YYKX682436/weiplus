package zo1;

/* loaded from: classes5.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f556269e;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8, wo1.v vVar) {
        this.f556268d = activityC12872x8baa24f8;
        this.f556269e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$setupView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2 a2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556268d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.b(a2Var, activityC12872x8baa24f8.f174396w, 5L, null, 4, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", (java.lang.String[]) this.f556269e.m174233xf85be44f().toArray(new java.lang.String[0]));
        activityC12872x8baa24f8.setResult(-1, intent);
        activityC12872x8baa24f8.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$setupView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
