package gt4;

/* loaded from: classes14.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f356977d;

    public h0(gt4.s0 s0Var) {
        this.f356977d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.s0 s0Var = this.f356977d;
        gt4.s0.a(s0Var, false, 0, 0, 0);
        s0Var.e();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
