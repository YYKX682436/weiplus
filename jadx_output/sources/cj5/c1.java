package cj5;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f42080d;

    public c1(cj5.d1 d1Var) {
        this.f42080d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f stateCenter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactBottomMenuUIC$updateBottomMenuVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f42080d.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new wi5.c());
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactBottomMenuUIC$updateBottomMenuVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
