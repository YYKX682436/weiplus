package in5;

/* loaded from: classes.dex */
public final class l0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f374620e;

    public l0(in5.n0 n0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f374619d = n0Var;
        this.f374620e = k3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.n0 n0Var = this.f374619d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = n0Var.b0().m0(view);
        int m8183xf806b362 = m07 != null ? m07.m8183xf806b362() : -1;
        in5.y yVar = n0Var.f374637n;
        boolean c17 = yVar != null ? yVar.c(n0Var, view, m8183xf806b362, this.f374620e) : false;
        yj0.a.i(c17, this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return c17;
    }
}
