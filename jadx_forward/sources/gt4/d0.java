package gt4;

/* loaded from: classes14.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f356946d;

    public d0(gt4.s0 s0Var) {
        this.f356946d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.s0 s0Var = this.f356946d;
        android.widget.Button button = s0Var.f357082v;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("oneMonthBtn");
            throw null;
        }
        if (button.isSelected()) {
            android.widget.Button button2 = s0Var.f357082v;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("oneMonthBtn");
                throw null;
            }
            button2.setSelected(false);
            s0Var.P = 0;
            s0Var.Q = 0;
            s0Var.f357084x = 0;
        } else {
            android.widget.Button button3 = s0Var.f357081u;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("oneWeekBtn");
                throw null;
            }
            button3.setSelected(false);
            android.widget.Button button4 = s0Var.f357082v;
            if (button4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("oneMonthBtn");
                throw null;
            }
            button4.setSelected(true);
            android.widget.Button button5 = s0Var.f357083w;
            if (button5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("threeMonthsBtn");
                throw null;
            }
            button5.setSelected(false);
            gt4.s0.c(s0Var, gt4.z.f357112e);
        }
        gt4.s0.b(s0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
