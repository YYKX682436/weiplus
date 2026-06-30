package zl2;

/* loaded from: classes.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555371d;

    public j1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f555371d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f555371d.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
