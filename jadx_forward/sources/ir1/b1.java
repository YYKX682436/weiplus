package ir1;

/* loaded from: classes5.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375473d;

    public b1(ir1.i1 i1Var) {
        this.f375473d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir1.i1 i1Var = this.f375473d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(i1Var.getContext(), 1, true);
        k0Var.q(i1Var.getResources().getString(i1Var.f375519f == 5 ? com.p314xaae8f345.mm.R.C30867xcad56011.ngd : com.p314xaae8f345.mm.R.C30867xcad56011.f572265n50), 17);
        k0Var.f293405n = new ir1.w0(i1Var);
        k0Var.f293414s = new ir1.a1(i1Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
