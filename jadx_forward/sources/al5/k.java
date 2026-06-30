package al5;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f87469d;

    public k(android.widget.CheckBox checkBox) {
        this.f87469d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/CheckBoxTextLayout$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f87469d;
        checkBox.performClick();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckBoxTextViewLayout", "onClicked, checkBox.isChecked = %s", java.lang.Boolean.valueOf(checkBox.isChecked()));
        yj0.a.h(this, "com/tencent/mm/ui/widget/CheckBoxTextLayout$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
