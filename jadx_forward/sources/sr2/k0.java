package sr2;

/* loaded from: classes2.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f493142d;

    public k0(sr2.w0 w0Var) {
        this.f493142d = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostEditUIC$initShortTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.w0 w0Var = this.f493142d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(w0Var.m158354x19263085());
        android.view.View inflate = android.view.LayoutInflater.from(w0Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570602b62, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fwh);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.fwg);
        if (findViewById != null) {
            findViewById.setOnClickListener(new sr2.u0(y1Var));
        }
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostEditUIC$initShortTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
