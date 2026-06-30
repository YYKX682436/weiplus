package gt4;

/* loaded from: classes14.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f356968d;

    public g0(gt4.s0 s0Var) {
        this.f356968d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.s0 s0Var = this.f356968d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = s0Var.f357074n;
        if (c22705x7e16f613 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        int m82058xfb87f0b3 = c22705x7e16f613.m82058xfb87f0b3();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f6132 = s0Var.f357074n;
        if (c22705x7e16f6132 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        int m82056x74d1c8ca = c22705x7e16f6132.m82056x74d1c8ca();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f6133 = s0Var.f357074n;
        if (c22705x7e16f6133 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        gt4.s0.a(s0Var, true, m82058xfb87f0b3, m82056x74d1c8ca, c22705x7e16f6133.m82055xa7d8f7a3());
        s0Var.e();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
