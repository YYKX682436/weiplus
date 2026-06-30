package ut2;

/* loaded from: classes3.dex */
public final class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f512653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512654e;

    public u4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, ut2.j5 j5Var) {
        this.f512653d = y1Var;
        this.f512654e = j5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$onClickShoppingService$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f512653d.q();
        ut2.j5 j5Var = this.f512654e;
        st2.h1.P(j5Var.f512469d, null, j5Var.f512469d.w() ? 0 : 3, false, false, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$onClickShoppingService$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
