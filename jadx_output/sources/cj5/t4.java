package cj5;

/* loaded from: classes.dex */
public final class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.x4 f42241d;

    public t4(cj5.x4 x4Var) {
        this.f42241d = x4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectCustomContactUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj5.x4 x4Var = this.f42241d;
        if (x4Var.T6().i().isChecked()) {
            x4Var.T6().i().setChecked(false);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            j75.f Q6 = x4Var.Q6();
            if (Q6 != null) {
                Q6.B3(new wi5.r(linkedList, 0));
            }
        } else {
            x4Var.T6().i().setChecked(true);
            java.util.List list = (java.util.List) ((jz5.n) x4Var.f42275g).getValue();
            j75.f Q62 = x4Var.Q6();
            if (Q62 != null) {
                kotlin.jvm.internal.o.d(list);
                Q62.B3(new wi5.r(list, 0));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectCustomContactUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
