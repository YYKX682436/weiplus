package ns4;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.c0 f421212d;

    public y(ns4.c0 c0Var) {
        this.f421212d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumePanel", "click confirm button");
        ns4.c0 c0Var = this.f421212d;
        android.view.View view2 = c0Var.f421004j;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recharge_agreement_link_ll");
            throw null;
        }
        if (view2.getVisibility() == 8) {
            c0Var.f420996b.f421032f.mo146xb9724478(c0Var);
        } else {
            android.widget.CheckBox checkBox = c0Var.f421005k;
            if (checkBox == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recharge_agreement_link_checkbox");
                throw null;
            }
            if (checkBox.isChecked()) {
                c0Var.f420996b.f421032f.mo146xb9724478(c0Var);
            } else {
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c0Var.f420995a, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
                android.view.View view3 = c0Var.f421004j;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recharge_agreement_link_ll");
                    throw null;
                }
                view3.startAnimation(loadAnimation);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
