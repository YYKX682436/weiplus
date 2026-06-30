package ka2;

/* loaded from: classes.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ka2.o f387574d = new ka2.o();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiNormalLbsListUI", "editText click");
        view.setEnabled(true);
        view.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
