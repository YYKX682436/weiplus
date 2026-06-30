package in5;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f374614e;

    public k0(in5.n0 n0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f374613d = n0Var;
        this.f374614e = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.n0 n0Var = this.f374613d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = n0Var.b0().m0(view);
        int m8183xf806b362 = m07 != null ? m07.m8183xf806b362() : -1;
        in5.x xVar = n0Var.f374638o;
        if (xVar != null) {
            xVar.s2(n0Var, view, m8183xf806b362, this.f374614e);
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
