package cj5;

/* loaded from: classes.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.a0 f123769d;

    public t(cj5.a0 a0Var, wi5.n0 n0Var) {
        this.f123769d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/MultiSelectHandleUIC$onCreate$1$11$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj5.a0 a0Var = this.f123769d;
        a0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KSelectUserList", "notify@all");
        a0Var.m158354x19263085().setResult(-1, intent);
        a0Var.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/MultiSelectHandleUIC$onCreate$1$11$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
