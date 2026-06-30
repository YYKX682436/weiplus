package ns4;

/* loaded from: classes8.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.j4 f421066d;

    public g4(ns4.j4 j4Var) {
        this.f421066d = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot5.g.c("WeCoinSubscriptionAgreementView", "click agreement");
        android.widget.CheckBox checkBox = this.f421066d.f421100i;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkbox");
            throw null;
        }
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkbox");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
