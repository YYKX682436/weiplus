package sr2;

/* loaded from: classes.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493097d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493097d = c14609xb4d6eef6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493097d;
        c14609xb4d6eef6.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) c14609xb4d6eef6.m80379x76847179(), 1, true);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(c14609xb4d6eef6.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5o, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fvy)).setText(c14609xb4d6eef6.h7());
        k0Var.s(inflate, false);
        k0Var.f293405n = new sr2.d5(c14609xb4d6eef6);
        k0Var.f293414s = new sr2.e5(c14609xb4d6eef6);
        k0Var.f293387d = new sr2.f5(c14609xb4d6eef6);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
