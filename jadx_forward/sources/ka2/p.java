package ka2;

/* loaded from: classes5.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f387575d;

    public p(android.widget.EditText editText) {
        this.f387575d = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.text.Editable newEditable = android.text.Editable.Factory.getInstance().newEditable("");
        android.widget.EditText editText = this.f387575d;
        if (editText != null) {
            editText.setText(newEditable);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
