package ns4;

/* loaded from: classes8.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f421218d;

    public y3(ns4.b4 b4Var) {
        this.f421218d = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click confirm_button, checkbox.isChecked:");
        ns4.b4 b4Var = this.f421218d;
        android.widget.CheckBox checkBox = b4Var.f420986m;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkbox");
            throw null;
        }
        sb6.append(checkBox.isChecked());
        ot5.g.c("WeCoinSubscribePanel", sb6.toString());
        android.widget.CheckBox checkBox2 = b4Var.f420986m;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkbox");
            throw null;
        }
        if (checkBox2.isChecked()) {
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = b4Var.f420990q;
            if (interfaceC29045xdcb5ca57 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((pr4.h) b4Var.f420975b.f439523d.get(b4Var.f420989p)));
            }
            b4Var.f420990q = null;
            b4Var.f420976c.q();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(b4Var.f420974a, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
        android.view.View view2 = b4Var.f420985l;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("agreement_layout");
            throw null;
        }
        view2.startAnimation(loadAnimation);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
