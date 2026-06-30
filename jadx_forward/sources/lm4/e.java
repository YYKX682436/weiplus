package lm4;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b f401090d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b dialogC18732x79d0ea5b) {
        this.f401090d = dialogC18732x79d0ea5b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f401090d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
