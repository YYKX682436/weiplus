package ns4;

/* loaded from: classes8.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.j4 f421083d;

    public i4(ns4.j4 j4Var) {
        this.f421083d = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click confirm_button, checkbox.isChecked:");
        ns4.j4 j4Var = this.f421083d;
        android.widget.CheckBox checkBox = j4Var.f421100i;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkbox");
            throw null;
        }
        sb6.append(checkBox.isChecked());
        ot5.g.c("WeCoinSubscriptionAgreementView", sb6.toString());
        android.widget.CheckBox checkBox2 = j4Var.f421100i;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkbox");
            throw null;
        }
        if (checkBox2.isChecked()) {
            j4Var.f421093b.f421112b.mo146xb9724478(j4Var);
            j4Var.f421094c.q();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(j4Var.f421092a, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
        android.view.View view2 = j4Var.f421099h;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("agreement_layout");
            throw null;
        }
        view2.startAnimation(loadAnimation);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
