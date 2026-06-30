package sr2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f493272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493273e;

    public v2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, sr2.y2 y2Var) {
        this.f493272d = y1Var;
        this.f493273e = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f493272d.q();
        sr2.y2 y2Var = this.f493273e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(y2Var.m158354x19263085());
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(y2Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.axh, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qxg);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.pnq);
        if (findViewById != null) {
            findViewById.setOnClickListener(new sr2.w2(y1Var));
        }
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
