package cj5;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n1 f42160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f42161e;

    public k1(cj5.n1 n1Var, wi5.n0 n0Var) {
        this.f42160d = n1Var;
        this.f42161e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactHalfScreenListUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj5.n1 n1Var = this.f42160d;
        j75.f Q6 = n1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.m());
        }
        java.util.LinkedList linkedList = this.f42161e.f446319o;
        n1Var.getClass();
        android.content.Intent Ai = ((qd0.u0) ((rd0.g1) i95.n0.c(rd0.g1.class))).Ai(n1Var.getActivity(), "", linkedList);
        Ai.putExtra("key_confirm_menu_name", n1Var.getActivity().getIntent().getStringExtra("key_confirm_menu_name"));
        Ai.putExtra("key_confirm_menu_color", n1Var.getActivity().getIntent().getIntExtra("key_confirm_menu_color", 0));
        pf5.j0.a(Ai, cj5.h1.class);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = n1Var.getActivity();
        cVar.d(Ai);
        cVar.c(true);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.h(7);
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactHalfScreenListUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
