package st2;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f493995e;

    public u0(st2.h1 h1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f493994d = h1Var;
        this.f493995e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showAddPreviousFailDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        st2.h1 h1Var = this.f493994d;
        h1Var.L();
        h1Var.M(true);
        this.f493995e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showAddPreviousFailDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
